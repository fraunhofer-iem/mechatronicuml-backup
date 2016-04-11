package org.muml.core.browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ModelBrowserPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.muml.core.browser"; //$NON-NLS-1$

	// The shared instance
	private static ModelBrowserPlugin plugin;
	


	
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
