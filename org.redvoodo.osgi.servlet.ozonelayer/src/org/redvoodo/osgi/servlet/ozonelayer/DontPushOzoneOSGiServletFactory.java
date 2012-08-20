/*******************************************************************************
 * Copyright (c) 2010, 2011 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Florian Pirchner   - ideas, initial API and implementation
 *    
 * more info: http://redvoodo.org
 *    
 *******************************************************************************/
package org.redvoodo.osgi.servlet.ozonelayer;

import java.util.Dictionary;
import java.util.Map;

import javax.servlet.http.HttpServlet;

import org.osgi.service.component.ComponentFactory;
import org.redvoodo.osgi.pushosgi.common.IServletFactory;

import com.vaadin.Application;

public class DontPushOzoneOSGiServletFactory implements IServletFactory {

	@Override
	public HttpServlet createServlet(ComponentFactory factory,
			String servletpath, Map<String, Object> properties) {
		return new DontPushOzoneOSGiServlet(factory, servletpath, properties);
	}

	@Override
	public String buildPath(String basePath) {
		return basePath;
	}

	@Override
	public void appendServletParams(Dictionary<String, String> dictionary) {
		// Register the application to avoid exception in
		// ApplicationServlet#init()
		dictionary.put("application", Application.class.getName());
		dictionary.put("connectionGuardTimeout", "20");
		dictionary.put("load-on-startup", "2");
	}

	@Override
	public int getRegistrationOrder() {
		return 2;
	}

}
