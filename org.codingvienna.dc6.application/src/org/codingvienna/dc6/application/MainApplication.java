/*******************************************************************************
 * Copyright (c) 2011 Florian Pirchner
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.codingvienna.dc6.application;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codingvienna.dc6.application.facade.Painter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vaadin.dontpush.server.DontPushOzoneWebApplicationContext;
import org.vaadin.dontpush.server.IWindowLifecycleListener;

import com.vaadin.Application;
import com.vaadin.service.ApplicationContext.TransactionListener;
import com.vaadin.terminal.gwt.server.HttpServletRequestListener;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Window;

public class MainApplication extends Application implements
		Application.WindowDetachListener, HttpServletRequestListener,
		IWindowLifecycleListener, TransactionListener {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory
			.getLogger(MainApplication.class);

	private String sessionId;

	// private IPushServiceManager pushServiceManager;

	public MainApplication() {

	}

	@Override
	public Window getWindow(String name) {
		// If the window is identified by name, we are good to go
		Window window = super.getWindow(name);

		// only for application windows -> print windows are no instance of
		// AppAreaWindow
		if (window == null || window instanceof AppAreaWindow) {
			AppAreaWindow w = (AppAreaWindow) window;
			logger.debug("Window {} requested", name); //$NON-NLS-1$
			// If not, we must create a new window for this new browser
			// window/tab
			if (w == null) {
				w = new AppAreaWindow();
				window = w;

				// Use the random name given by the framework to identify this
				// window in future
				w.setName(name);

				addWindow(w);
			}
		}

		return window;
	}

	@Override
	public void windowDetached(WindowDetachEvent event) {
		// buildHelper.disposeSubcontext(event.getWindow());
		// nothing to do yet, since websockets addon uses lazy window destroy
	}

	@Override
	public void init() {
		DontPushOzoneWebApplicationContext contect = (DontPushOzoneWebApplicationContext) getContext();
		contect.addTransactionListener(this);
		contect.addWindowLifecycleListener(this);
		addListener(this);

		AppAreaWindow window = new AppAreaWindow();
		setMainWindow(window);

		setTheme("dc6");
	}

	public void onRequestStart(HttpServletRequest request,
			HttpServletResponse response) {
		if (request != null && request.getSession() != null
				&& this.sessionId == null) {
			this.sessionId = request.getSession().getId();
		}
	}

	public void onRequestEnd(HttpServletRequest request,
			HttpServletResponse response) {
		// ContextAccess.setCurrentSubContext(null);
	}

	@SuppressWarnings("serial")
	public class AppAreaWindow extends Window {

		public AppAreaWindow() {
			AbsoluteLayout content = new AbsoluteLayout();
			content.setSizeFull();
			content.setMargin(true);
			setContent(content);

			// register the window at the manager
			Painter.getInstance().setWindow(this);
		}
	}

	@Override
	public void windowDestroyed(Application application, Window window) {

	}

	@Override
	public void transactionStart(Application application, Object transactionData) {

	}

	@Override
	public void transactionEnd(Application application, Object transactionData) {

	}
}
