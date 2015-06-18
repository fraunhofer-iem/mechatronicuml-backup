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

	public static TransactionalEditingDomain getEditingDomain(URI uri) {
		synchronized (EDITING_DOMAIN_REGISTRY) {
			uri = uri.trimFragment();
			if (!EDITING_DOMAIN_REGISTRY.containsKey(uri)) {
				EDITING_DOMAIN_REGISTRY.put(uri, WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain());
			}
			return EDITING_DOMAIN_REGISTRY.get(uri);
		}
	}
	
	public static TransactionalEditingDomain getEditingDomain(Resource resource) {
		return getEditingDomain(resource.getURI());
	}
	
	public static TransactionalEditingDomain getEditingDomain(EObject element) {
		return getEditingDomain(element.eResource());
	}
	
	public static TransactionalEditingDomain getEditingDomain(Object object) {
		if (object instanceof Resource) {
			return getEditingDomain((Resource) object);
		}
		if (object instanceof EObject) {
			return getEditingDomain((EObject) object);
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
