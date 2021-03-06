/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.ecoreInference;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class UnexpectedClassInfoException extends Exception {

	private static final long serialVersionUID = 5234853702435638238L;

	private final TransformationErrorCode errorCode;
	private final EClassifierInfo info;
	private final EClassifierInfo superInfo;

	public UnexpectedClassInfoException(TransformationErrorCode errorCode, EClassifierInfo info, EClassifierInfo superInfo, String message) {
		super(message);
		this.errorCode = errorCode;
		this.info = info;
		this.superInfo = superInfo;
	}

	public TransformationErrorCode getErrorCode() {
		return errorCode;
	}

	public EClassifierInfo getInfo() {
		return info;
	}

	public EClassifierInfo getSuperInfo() {
		return superInfo;
	}
	
}
