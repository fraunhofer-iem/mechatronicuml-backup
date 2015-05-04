package de.uni_paderborn.fujaba.muml.browser;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;

/**
 * The activator class controls the plug-in life cycle
 */
public class ModelBrowserPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.uni_paderborn.fujaba.muml.browser"; //$NON-NLS-1$

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
	


	public static Resource getResource(ResourceSet resourceSet, IFile iFile) {
		try {
			URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
			Resource resource = resourceSet.getResource(uri, false);
			if (resource == null) {
				resource = resourceSet.createResource(uri);
			}
			if (resource != null) {
				if (!resource.isLoaded()) {
					resource.load(Collections.emptyMap());
				}
			}
			return resource;

		} catch (IOException e) {
			return null;
		}
	}
	
	
	public static Resource getResource(ResourceSet resourceSet, Object element) {
		if (element instanceof IFile) {
			return getResource(resourceSet, (IFile) element);
		}
		return null;
	}

	public static EObject getResourceRoot(ResourceSet resourceSet, Object element) {
		Resource resource = getResource(resourceSet, element);
		if (resource != null && resource.getContents().size() == 1) {
			return resource.getContents().get(0);
		}
		return null;
	}
//
//	public static IFile getIFile(Object notifier) {
//		Resource resource = null;
//		if (notifier instanceof Resource) {
//			resource = (Resource) notifier;
//		} else if (notifier instanceof EObject) {
//			resource = ((EObject) notifier).eResource();
//		}
//		if (resource != null) {
//			URI uri = resource.getURI();
//			IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
//			return workspaceRoot.getFile(new Path(uri.toPlatformString(true)));
//		}
//		return null;
//	}

	public static void log(IOException e) {
		log(e, e.getLocalizedMessage());
	}
	public static void log(IOException e, String errorMessage) {
		IStatus status = new Status(IStatus.ERROR, PLUGIN_ID, 0, errorMessage, e);
		getDefault().getLog().log(status);
	}
}
