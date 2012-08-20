/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.ecoreInference;

import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CompoundElement;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.TypeRef;
import org.eclipse.xtext.util.XtextSwitch;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
abstract class DatatypeRuleUtil extends XtextSwitch<Boolean>{
	
	static boolean isDatatypeRule(ParserRule rule) {
		DatatypeRuleFinder finder = new DatatypeRuleFinder();
		return finder.doSwitch(rule) && finder.indicatorFound;
	}

	static boolean isValidDatatypeRule(ParserRule rule) {
		return new DatatypeRuleChecker().doSwitch(rule);
	}

	static class DatatypeRuleFinder extends DatatypeRuleUtil {

		private boolean indicatorFound;

		@Override
		public Boolean caseTerminalRule(TerminalRule object) {
			indicatorFound = true;
			return super.caseTerminalRule(object);
		}
		
		@Override
		public Boolean caseKeyword(Keyword object) {
			indicatorFound = true;
			return super.caseKeyword(object);
		}

		@Override
		public Boolean caseParserRule(ParserRule object) {
			final TypeRef typeRef = object.getType();
			if (typeRef != null) {
				if (typeRef.getClassifier() != null) {
					boolean result = GrammarUtil.isDatatypeRule(object);
					if (result)
						indicatorFound = true;
					return result;
				}
				if (visitedRules.add(object)) {
					Boolean result = object.getAlternatives() != null && doSwitch(object.getAlternatives());
					if (result) {
						EDataType dataType = GrammarUtil.findEString(GrammarUtil.getGrammar(object));
						if (dataType != null)
							typeRef.setClassifier(dataType);
						else {
							// nowhere imported - use the instance from the registry
							typeRef.setClassifier(EcorePackage.Literals.ESTRING);
						}
					}
					visitedRules.remove(object);
					return result;
				} else {
					return getApproximatedResult(object);
				}
			}
			if (!visitedRules.add(object))
				return getApproximatedResult(object);
			Boolean result = (object.getAlternatives() != null && doSwitch(object.getAlternatives()));
			visitedRules.remove(object);
			return result; 
		}

		protected Boolean getApproximatedResult(ParserRule object) {
			if (object.getAlternatives() == null)
				return true;
			Iterator<?> contents = EcoreUtil.getAllContents(object.getAlternatives(), true);
			return !Iterators.filter(contents, new Predicate<Object>() {
				public boolean apply(Object input) {
					return input instanceof Assignment || input instanceof Action;
				}
			}).hasNext();
		}

	}

	static class DatatypeRuleChecker extends DatatypeRuleFinder {

		@Override
		public Boolean caseParserRule(ParserRule object) {
			if (visitedRules.isEmpty()) {
				visitedRules.add(object);
				return object.getAlternatives() != null && doSwitch(object.getAlternatives());
			}
			final TypeRef typeRef = object.getType();
			if (typeRef == null || typeRef.getClassifier() == null) {
				throw new IllegalStateException("checks are only allowed for linked grammars. Rule: " + object.getName());
			}
			if (!visitedRules.add(object))
				return true;
			Boolean result = GrammarUtil.isDatatypeRule(object);
			visitedRules.remove(object);
			return result; 
		}

	}

	protected final Set<AbstractRule> visitedRules;

	protected DatatypeRuleUtil() {
		this.visitedRules = Sets.newHashSet();
	}

	@Override
	public Boolean caseAbstractElement(AbstractElement object) {
		return Boolean.FALSE;
	}

	@Override
	public Boolean caseCompoundElement(CompoundElement object) {
		for(AbstractElement element: object.getElements())
			if (!doSwitch(element))
				return false;
		return true;
	}
	
	@Override
	public Boolean caseKeyword(Keyword object) {
		return Boolean.TRUE;
	}

	@Override
	public Boolean caseTerminalRule(TerminalRule object) {
		return Boolean.TRUE;
	}
	
	@Override
	public Boolean caseAbstractRule(AbstractRule object) {
		return Boolean.FALSE;
	}

	@Override
	public Boolean caseRuleCall(RuleCall object) {
		return object.getRule() != null && doSwitch(object.getRule());
	}


}
