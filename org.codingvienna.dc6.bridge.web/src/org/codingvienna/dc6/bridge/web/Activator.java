package org.codingvienna.dc6.bridge.web;

import org.codingvienna.dc6.Model;
import org.codingvienna.dc6.application.facade.Painter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin implements
		XtextResourceFactory.Listener {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.codingvienna.dc6.bridge.web"; //$NON-NLS-1$

	private final MyContentAdapter adapter = new MyContentAdapter();
	private final Painter painter = Painter.getInstance();

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		XtextResourceFactory.setListener(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	@Override
	public void newResource(Resource resource) {
		if (resource.getURI().fileExtension().equals("paint")) {
			resource.eAdapters().add(adapter);
		}
	}

	private class MyContentAdapter extends
			org.eclipse.emf.ecore.util.EContentAdapter {

		public void notifyChanged(Notification n) {
			super.notifyChanged(n);
			switch (n.getEventType()) {
			case Notification.SET:
			case Notification.ADD:
			case Notification.ADD_MANY:
				if (n.getNewValue() instanceof Model) {
					Model model = (Model) n.getNewValue();
					painter.createCanvas(model.getCanvas());
				}
			}
		}
	}
}
