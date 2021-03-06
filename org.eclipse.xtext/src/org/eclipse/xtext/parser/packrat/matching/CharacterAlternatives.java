/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.parser.packrat.matching;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class CharacterAlternatives implements ICharacterClass {

	private final ICharacterClass[] classes;

	public CharacterAlternatives(ICharacterClass... classes) {
		this.classes = classes;
	}
	
	public boolean matches(char candidate) {
		for (ICharacterClass characterClass: classes) {
			if (characterClass.matches(candidate))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < classes.length; i++) {
			if (i != 0) {
				result.append(" | ");
			}
			result.append(classes[i]);
		}
		return result.toString();
	}
	
}
