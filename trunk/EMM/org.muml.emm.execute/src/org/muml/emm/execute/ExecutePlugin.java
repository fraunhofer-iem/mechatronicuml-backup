package org.muml.emm.execute;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.muml.emm.Migrator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ExecutePlugin extends AbstractUIPlugin {
	public static final String MIGRATOR_EXTENSION_POINT_ID = "org.muml.emm.migrator";
	
	private static List<URI> migrators = null;

	public static List<URI> getMigrators() {
		if (migrators == null) {
			migrators = new ArrayList<URI>();
			IConfigurationElement[] config = Platform.getExtensionRegistry()
					.getConfigurationElementsFor(MIGRATOR_EXTENSION_POINT_ID);
	
			for (IConfigurationElement e : config) {
				URI uri = URI.createPlatformPluginURI(e.getContributor().getName() + "/" + e.getAttribute("file"), false);
				migrators.add(uri);
			}
		}
		return migrators;
	}
	

	// The plug-in ID


	// The shared instance
	private static ExecutePlugin plugin;

	/**
	 * The constructor
	 */
	public ExecutePlugin() {
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
	public static ExecutePlugin getDefault() {
		return plugin;
	}
}
