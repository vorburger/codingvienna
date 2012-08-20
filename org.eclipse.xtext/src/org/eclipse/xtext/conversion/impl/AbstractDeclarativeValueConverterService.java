/*******************************************************************************
 * Copyright (c) itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.conversion.impl;

import static org.eclipse.xtext.GrammarUtil.*;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public abstract class AbstractDeclarativeValueConverterService extends AbstractValueConverterService {

	private static final Logger log = Logger.getLogger(AbstractDeclarativeValueConverterService.class);

	private Grammar grammar;

	private Map<String, IValueConverter<Object>> converters;

	@Inject 
	protected DefaultTerminalConverter.Factory defaultTerminalConverterFactory;
	
	@Inject
	public void setGrammar(IGrammarAccess grammarAccess) {
		this.grammar = grammarAccess.getGrammar();
	}

	protected Grammar getGrammar() {
		return grammar;
	}

	public String toString(Object value, String lexerRule) {
		return getConverter(lexerRule).toString(value);
	}

	public Object toValue(String string, String lexerRule, INode node) throws ValueConverterException {
		return getConverter(lexerRule).toValue(string, node);
	}

	@SuppressWarnings("unchecked")
	protected IValueConverter<Object> getConverter(String lexerRule) {
		Map<String, IValueConverter<Object>> map = getConverters();
		if (map.containsKey(lexerRule)) {
			return map.get(lexerRule);
		}
		return (IValueConverter<Object>) IValueConverter.NO_OP_CONVERTER;
	}

	protected Map<String, IValueConverter<Object>> getConverters() {
		if (converters == null) {
			converters = new HashMap<String, IValueConverter<Object>>();
			internalRegisterForClass(getClass());
		}
		return converters;
	}

	@SuppressWarnings("unchecked")
	protected void internalRegisterForClass(Class<?> clazz) {
		Method[] methods = clazz.getDeclaredMethods();
		Set<String> thisConverters = Sets.newHashSet();
		for (Method method : methods) {
			if (isConfigurationMethod(method)) {
				try {
					String ruleName = method.getAnnotation(ValueConverter.class).rule();
					AbstractRule rule = GrammarUtil.findRuleForName(getGrammar(), ruleName);
					if (rule != null) {
						if (rule instanceof TerminalRule) {
							if (((TerminalRule) rule).isFragment())
								throw new IllegalStateException("Tried to register a value converter for a fragment terminal rule: '" + ruleName + "'");
						}
						if (!thisConverters.add(ruleName)) {
							throw new IllegalStateException("Tried to register two value converters for rule '" + ruleName + "'");
						}
						if (!converters.containsKey(ruleName)) {
							IValueConverter<Object> valueConverter = (IValueConverter<Object>) method.invoke(this);
							if (valueConverter instanceof IValueConverter.RuleSpecific)
								((IValueConverter.RuleSpecific) valueConverter).setRule(rule);
							converters.put(ruleName, valueConverter);
						}
					} else
						log.trace("Tried to register value converter for rule '" + ruleName
								+ "' which is not available in the grammar.");

				} catch(IllegalStateException e) {
					throw e;
				} catch (Exception e) {
					log.error(e.getMessage(), e);
				}
			}
		}
		if (clazz.getSuperclass() != null) {
			internalRegisterForClass(clazz.getSuperclass());
		}
		registerEFactoryConverters();
	}

	protected boolean isConfigurationMethod(Method method) {
		return method.isAnnotationPresent(ValueConverter.class) && method.getParameterTypes().length == 0
				&& IValueConverter.class.isAssignableFrom(method.getReturnType());
	}

	protected void registerEFactoryConverters() {
		for (ParserRule parserRule : allParserRules(getGrammar())) {
			if (isDatatypeRule(parserRule) && !converters.containsKey(parserRule.getName())) {
				EDataType datatype = (EDataType) parserRule.getType().getClassifier();
				converters.put(parserRule.getName(), new EFactoryValueConverter(datatype));
			}
		}
		for (TerminalRule terminalRule : allTerminalRules(getGrammar())) {
			if (!terminalRule.isFragment()) {
				String terminalRuleName = terminalRule.getName();
				if (!converters.containsKey(terminalRuleName)) {
					converters.put(terminalRuleName, defaultTerminalConverterFactory.create(terminalRule));
				}
			}
		}
	}
	
	public void setDefaultTerminalConverterFactory(DefaultTerminalConverter.Factory defaultTerminalConverterFactory) {
		this.defaultTerminalConverterFactory = defaultTerminalConverterFactory;
	}
	
	public DefaultTerminalConverter.Factory getDefaultTerminalConverterFactory() {
		return defaultTerminalConverterFactory;
	}

}
