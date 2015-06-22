package de.uni_paderborn.fujaba.muml.browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ModelBrowserPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.uni_paderborn.fujaba.muml.browser"; //$NON-NLS-1$

	// The shared instance
	private static ModelBrowserPlugin plugin;
	
	public static Map<URI, TransactionalEditingDomain> EDITING_DOMAIN_REGISTRY = new HashMap<URI, TransactionalEditingDomain>();

	public static TransactionalEditingDomain getEditingDomain(URI uri, boolean create) {
		TransactionalEditingDomain editingDomain = internalGetEditingDomain(uri, create);
		if (editingDomain != null) {
			Resource resource;
			try {
				resource = editingDomain.getResourceSet().getResource(uri, true);
			} catch (Exception e) {
				return null;
			}
			if (resource.getContents().size() == 1) {
				EObject root = resource.getContents().get(0);
				if (root instanceof Diagram) {
					Diagram diagram = (Diagram) root;
					if (diagram.getElement().eResource() != resource) {
						URI semanticURI = diagram.getElement().eResource().getURI();
						return internalGetEditingDomain(semanticURI, create);
					}
				}
			}
		}
		return editingDomain;
	}
	
	private static TransactionalEditingDomain internalGetEditingDomain(URI uri, boolean create) {
		if (uri != null) {
			synchronized (EDITING_DOMAIN_REGISTRY) {
				uri = uri.trimFragment();
				if (!EDITING_DOMAIN_REGISTRY.containsKey(uri)) {
					EDITING_DOMAIN_REGISTRY.put(uri, WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain());
				}
				return EDITING_DOMAIN_REGISTRY.get(uri);
			}
		}
		return null;
	}
	
	public static TransactionalEditingDomain getEditingDomain(Resource resource, boolean create) {
		if (resource != null) {
			return getEditingDomain(resource.getURI(), create);
		}
		return null;
	}
	
	public static TransactionalEditingDomain getEditingDomain(EObject element, boolean create) {
		if (element != null) {
			return getEditingDomain(element.eResource(), create);
		}
		return null;
	}
	
	public static TransactionalEditingDomain getEditingDomainDispatch(Object object, boolean create) {
		if (object instanceof Resource) {
			return getEditingDomain((Resource) object, create);
		}
		if (object instanceof EObject) {
			return getEditingDomain((EObject) object, create);
		}
		return null;
	}
	/**
	 * The constructor
	 */
	public ModelBrowserPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
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
	public static ModelBrowserPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	public URL getBundleUrl(String path) {
        if (path == null) {
            throw new IllegalArgumentException();
        }

		Bundle bundle = getBundle();
		
        // look for the image (this will check both the plugin and fragment folders
        URL fullPathString =  bundle.getResource(path);
        if (fullPathString == null) {
            try {
                fullPathString = new URL(path);
            } catch (MalformedURLException e) {
                return null;
            }
			URL platformURL = FileLocator.find(fullPathString);
			if (platformURL != null) {
				fullPathString = platformURL;
			}
        }
        return fullPathString;
	}

	public static void log(Exception e) {
		log(e, e.getLocalizedMessage());
	}
	public static void log(Exception e, String errorMessage) {
		IStatus status = new Status(IStatus.ERROR, PLUGIN_ID, 0, errorMessage, e);
		getDefault().getLog().log(status);
	}
}
