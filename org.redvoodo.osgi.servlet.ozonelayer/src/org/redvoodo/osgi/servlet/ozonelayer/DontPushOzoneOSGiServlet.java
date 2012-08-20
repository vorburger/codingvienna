/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Florian Pirchner
 * This class is based on:
 * - org.vaadin.osgi.VaadinOSGiServlet from http://vaadin.com/addon/vaadin-osgi
 */
package org.redvoodo.osgi.servlet.ozonelayer;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.osgi.service.component.ComponentFactory;
import org.osgi.service.component.ComponentInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vaadin.dontpush.server.DontPushOzoneServlet;

import com.vaadin.Application;
import com.vaadin.terminal.gwt.server.WebApplicationContext;

/**
 * OSGi based ozone layer servlet
 */
public class DontPushOzoneOSGiServlet extends DontPushOzoneServlet {

	private static final Logger logger = LoggerFactory
			.getLogger(DontPushOzoneOSGiServlet.class);

	private static final long serialVersionUID = 1L;

	private final ComponentFactory factory;
	@SuppressWarnings("unused")
	private final String servletpath;
	@SuppressWarnings("unused")
	private final Map<String, Object> properties;

	private Set<VaadinSession> sessions = new HashSet<VaadinSession>();

	public DontPushOzoneOSGiServlet(ComponentFactory factory,
			String servletpath, Map<String, Object> properties) {
		super();
		this.factory = factory;
		this.servletpath = servletpath;
		this.properties = properties;
	}

	// from org.vaadin.osgi.VaadinOSGiServlet
	@Override
	protected Class<? extends Application> getApplicationClass()
			throws ClassNotFoundException {
		// not used as the component factory creates instances for us
		// but has to return something or getSystemMessages causes a NPE
		return Application.class;
	}

	// from org.vaadin.osgi.VaadinOSGiServlet
	@Override
	protected Application getNewApplication(HttpServletRequest request)
			throws ServletException {
		final VaadinSession info = new VaadinSession(factory.newInstance(null),
				request.getSession());

		info.session.setAttribute(DontPushOzoneOSGiServlet.class.getName(),
				new HttpSessionListener() {

					@Override
					public void sessionDestroyed(HttpSessionEvent arg0) {
						info.dispose();
					}

					@Override
					public void sessionCreated(HttpSessionEvent arg0) {

					}

				});
		logger.info("Application created ", info); //$NON-NLS-1$
		return (Application) info.instance.getInstance();
	}

	@Override
	// from org.vaadin.artur.icepush.ICEPushServlet
	public void init(ServletConfig servletConfig) throws ServletException {
		try {
			super.init(servletConfig);
		} catch (ServletException e) {
			if (e.getMessage().equals(
					"Application not specified in servlet parameters")) { //$NON-NLS-1$
				// Ignore if application is not specified to allow the same
				// servlet to be used for only push in portals
			} else {
				throw e;
			}
		}
	}

	/**
	 * Track the component instance and session. If this is disposed the entire
	 * associated http session is also disposed.<br>
	 * 
	 * from org.vaadin.osgi.VaadinOSGiServlet
	 */
	class VaadinSession {

		final ComponentInstance instance;

		final HttpSession session;

		public VaadinSession(ComponentInstance instance, HttpSession session) {
			this.instance = instance;
			this.session = session;
			sessions.add(this);
		}

		public void dispose() {
			System.out.println("Disposing: " + this); //$NON-NLS-1$
			Application app = (Application) instance.getInstance();
			if (app != null) {
				app.close();
			}

			instance.dispose();

			session.removeAttribute(DontPushOzoneOSGiServlet.class.getName());
			session.removeAttribute(WebApplicationContext.class.getName());

			sessions.remove(this);
		}

	}
}