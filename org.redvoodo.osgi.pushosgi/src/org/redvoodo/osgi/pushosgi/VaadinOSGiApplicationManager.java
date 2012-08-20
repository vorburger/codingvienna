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
 * Information:
 * Originial source from org.vaadin.osgi.VaadinOSGiApplicationManager written by Chris Brind
 * 
 * Contribution:
 * Florian Pirchner - used the source from org.vaadin.osgi.VaadinOSGiApplicationManager 
 * 					  and added IServletFactory function to this class
 */
package org.redvoodo.osgi.pushosgi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;

import org.osgi.service.component.ComponentFactory;
import org.osgi.service.http.HttpService;
import org.redvoodo.osgi.pushosgi.common.IServletFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.Application;

/**
 * Information: This class is based on the source from
 * "org.vaadin.osgi.VaadinOSGiApplicationManager" written by chris brind. It was
 * copied and ServletFactory-support was added.
 * 
 * This class runs as an OSGi component and looks for OSGi component factories
 * with their <code>component.factory</code> property set to
 * <code>vaadin.app</code>.
 * <p/>
 * 
 * The component factory name (specified as <code>component.name</code>) is used
 * as the alias to register an instance of {@link HttpServlet} which then uses
 * the component factory to create an instance of {@link Application}. For
 * example, if <code>component.name</code> was set to myapp, the servlet would
 * be registered at <code>http://<em>localhost:8080</em>/myapp</code>.
 * <p/>
 * The instance of the {@link HttpServlet} will be provided by an OSGI-Service.
 * This service offers an {@link IServletFactory} which creates the servlet.
 * 
 * <p/>
 * Properties registered against the component factory are passed in to the
 * servlet as init params. Thus to make your application production safe specify
 * productionMode=true as a property of your application component.
 * 
 * Information:<br>
 * This source was written by Chris Brind. See
 * org.vaadin.osgi.VaadinOSGiApplicationManager.<br>
 * Contribution florian pirchner See copyright header
 */
// @Component(properties = { "productionMode=false" })
public class VaadinOSGiApplicationManager {

	private static final Logger logger = LoggerFactory
			.getLogger(VaadinOSGiApplicationManager.class);

	private final Object syncer = new Object();

	private HttpService httpService;
	private Hashtable<String, String> initParams = new Hashtable<String, String>();

	private boolean started;

	private List<IServletFactory> servletFactories = new ArrayList<IServletFactory>();
	private List<IServletFactory> pendingFactories = new ArrayList<IServletFactory>();
	private Map<IServletFactory, Servlet> servlets = new HashMap<IServletFactory, Servlet>();
	private Map<Servlet, String> servletPathes = new HashMap<Servlet, String>();

	private ComponentFactory applicationFactory;

	private Map<String, Object> properties;

	public VaadinOSGiApplicationManager() {

	}

	// @Activate
	public void start(Map<?, ?> properties) {
		System.out.println("VaadinOSGiApplicationManager.start: " + properties); //$NON-NLS-1$

		// by default we not in production mode, so check to see if we need to
		// change that
		String productionMode = (String) properties.get("productionMode"); //$NON-NLS-1$
		if (null != productionMode) {
			initParams.put("productionMode", productionMode); //$NON-NLS-1$
		}

		started = true;
		// tries to register the servlets
		doRegisterPendingServlets();
	}

	// @Deactivate
	public void stop() {
		started = false;
		initParams = null;
	}

	// @Reference
	public void bindHttpService(HttpService service) {
		this.httpService = service;
	}

	// @Reference(type = '*', target = "(component.factory=vaadin.app)", unbind
	// = "applicationRemoved", dynamic = true)
	public void applicationRegistered(
			final ComponentFactory applicationFactory,
			final Map<String, Object> properties) throws Exception {
		this.applicationFactory = applicationFactory;
		this.properties = properties;

		final String path = createPath(properties);
		logger.info("{}", properties);
		logger.info("New Vaadin context: {}" + path); //$NON-NLS-1$
		logger.info(
				"VaadinOSGiApplicationManager.bindComponentFactory: initParams={}", //$NON-NLS-1$
				initParams);

		// tries to register the servlets
		doRegisterPendingServlets();

	}

	protected String createPath(final Map<String, Object> properties) {
		String configPath = System.getProperties().getProperty(
				"org.vaadin.pushosgi.servletpath"); //$NON-NLS-1$
		String defaultPath = (String) properties.get("component.name"); //$NON-NLS-1$
		final String path = configPath != null && !configPath.equals("") ? "/" + configPath : "/" + defaultPath; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return path;
	}

	public void applicationRemoved(ComponentFactory factory,
			Map<String, Object> properties) {
		String path = "/" + (String) properties.get("component.name"); //$NON-NLS-1$ //$NON-NLS-2$
		System.out.println("Removing Vaadin context : " + path); //$NON-NLS-1$

		// TODO does not work -> Key of servlets is servlet factory
		// And do not forget to register all the servlets as pending servlets!
		Servlet servlet = servlets.remove(path);
		if (servlet != null) {
			servlet.destroy();
			httpService.unregister(path);
		}
	}

	public void addServlet(final IServletFactory servletFactory) {
		synchronized (syncer) {
			servletFactories.add(servletFactory);

			pendingFactories.add(servletFactory);
			doRegisterPendingServlets();
		}
	}

	public void removeServlet(final IServletFactory servletFactory) {
		synchronized (syncer) {
			pendingFactories.remove(servletFactory);

			servletFactories.remove(servletFactory);
			doUnregisterServlet(servletFactory);
		}
	}

	/**
	 * Unregisters the servlet
	 * 
	 * @param servletFactory
	 */
	protected void doUnregisterServlet(final IServletFactory servletFactory) {
		Servlet servlet = servlets.remove(servletFactory);
		servlet.destroy();
		httpService.unregister(servletPathes.remove(servlet));
	}

	/**
	 * Tries to register the pending servlets
	 */
	protected void doRegisterPendingServlets() {
		if (!started || applicationFactory == null) {
			return;
		}

		synchronized (syncer) {
			final String path = createPath(properties);

			List<IServletFactory> factories = new ArrayList<IServletFactory>(
					pendingFactories);
			Collections.sort(factories, new Comparator<IServletFactory>() {
				@Override
				public int compare(IServletFactory o0, IServletFactory o1) {
					return o0.getRegistrationOrder()
							- o1.getRegistrationOrder();
				}

			});
			for (final IServletFactory servletFactory : factories) {
				// We're going to register the new servlet when a http service
				// is
				// available which we can only be sure is current if we're in
				// the
				// started state.
				try {
					String servletPath = servletFactory.buildPath(path);
					if (servletPath == null || servletPath.equals("")) {
						servletPath = path;
					}

					// create the servlet params
					Hashtable<String, String> params = new Hashtable<String, String>(
							initParams);
					servletFactory.appendServletParams(params);

					// register the servlet
					Servlet servlet = (Servlet) servletFactory.createServlet(
							applicationFactory, servletPath, properties);
					httpService.registerServlet(servletPath, servlet, params,
							null);

					servlets.put(servletFactory, servlet);
					servletPathes.put(servlet, servletPath);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			pendingFactories.clear();
		}
	}

}
