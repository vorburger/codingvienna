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

import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.atmosphere.cpr.AtmosphereFilter;
import org.atmosphere.cpr.AtmosphereServlet;

@SuppressWarnings("serial")
public class CustomAtmosphereServlet extends AtmosphereServlet {

	/**
	 * Create an Atmosphere Servlet.
	 */
	public CustomAtmosphereServlet() {
		this(false);
	}

	/**
	 * Create an Atmosphere Servlet.
	 * 
	 * @param isFilter
	 *            true if this instance is used as an {@link AtmosphereFilter}
	 */
	public CustomAtmosphereServlet(boolean isFilter) {
		super(isFilter);
	}

	protected void loadConfiguration(ServletConfig sc) throws ServletException {
		try {

			// Find atmosphere.xml
			InputStream stream = null;
			Enumeration<URL> e = Activator.getContext().getBundle()
					.findEntries("META-INF", "atmosphere.xml", false);
			if (e != null && e.hasMoreElements()) {
				stream = e.nextElement().openStream();
			}
			if (stream == null) {
				throw new ServletException(
						"No atmosphere.xml registered in fragment bundle. Ensure that META-INF/atmosphere.xml is present.");
			}
			URL url = sc.getServletContext().getResource("/");
			URLClassLoader urlC = new URLClassLoader(new URL[] { url },
					CustomAtmosphereServlet.class.getClassLoader());
			loadAtmosphereDotXml(stream, urlC);

			if (atmosphereHandlers.size() == 0) {
				autoDetectAtmosphereHandlers(sc.getServletContext(), urlC);

				if (atmosphereHandlers.size() == 0) {
					detectSupportedFramework(sc);
				}
			}
		} catch (Throwable t) {
			throw new ServletException(t);
		}
	}
}
