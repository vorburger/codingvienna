package org.eclipse.xtext.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class XtextResourceFactory implements IResourceFactory {

	private static Listener listener;

	private Provider<XtextResource> provider;

	public static void setListener(Listener listener) {
		XtextResourceFactory.listener = listener;
	}

	@Inject
	public XtextResourceFactory(Provider<XtextResource> resourceProvider) {
		this.provider = resourceProvider;
	}

	public Resource createResource(URI uri) {
		XtextResource xtextResource = provider.get();
		xtextResource.setURI(uri);

		if (listener != null) {
			listener.newResource(xtextResource);
		}
		return xtextResource;
	}

	public static interface Listener {
		void newResource(Resource resource);
	}
}
