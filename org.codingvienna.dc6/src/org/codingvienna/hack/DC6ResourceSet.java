package org.codingvienna.hack;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

public class DC6ResourceSet extends XtextResourceSet {

	private static final Set<DC6ResourceSet> instances = new HashSet<DC6ResourceSet>();
	private static IListener listener;

	public static Set<DC6ResourceSet> getInstances() {
		return instances;
	}

	public static IListener getListener() {
		return listener;
	}

	public static void setListener(IListener listener) {
		DC6ResourceSet.listener = listener;
	}

	public DC6ResourceSet() {
		super();

//		instances.add(this);
//
//		if (listener != null) {
//			listener.changed(this);
//		}
	}
	
	@Override
	public Resource createResource(URI uri) {
		return super.createResource(uri);
	}

}
