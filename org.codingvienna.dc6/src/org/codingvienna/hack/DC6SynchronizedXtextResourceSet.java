package org.codingvienna.hack;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;

public class DC6SynchronizedXtextResourceSet extends
		SynchronizedXtextResourceSet {

	private static DC6SynchronizedXtextResourceSet instance;
	private static IListener listener;

	public static DC6SynchronizedXtextResourceSet getInstance() {
		return instance;
	}

	public static IListener getListener() {
		return listener;
	}

	public static void setListener(IListener listener) {
		DC6SynchronizedXtextResourceSet.listener = listener;
	}

	public DC6SynchronizedXtextResourceSet() {
		super();

		// instance = this;
		//
		// if (listener != null) {
		// listener.changed(this);
		// }
	}

	@Override
	public Resource createResource(URI uri) {
		return super.createResource(uri);
	}
}
