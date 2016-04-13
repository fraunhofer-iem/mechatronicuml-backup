package org.muml.common.editingdomain;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.muml.common.editingdomain.initialize.IEditingDomainInitializer;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class EditingDomainPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.muml.core.common.editingdomain"; //$NON-NLS-1$
	
	public static final String EXTENSION_POINT_EDITING_DOMAIN_INITIALIZER = PLUGIN_ID  + ".editingDomainInitializer";

	// The shared instance
	private static EditingDomainPlugin plugin;
	
	private static List<IEditingDomainInitializer> editingDomainInitializers = null;
	
	/**
	 * The constructor
	 */
	public EditingDomainPlugin() {
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
	public static EditingDomainPlugin getDefault() {
		return plugin;
	}
	
	public static List<IEditingDomainInitializer> getEditingDomainInitializers() {
		if (editingDomainInitializers == null) {
			editingDomainInitializers = new ArrayList<IEditingDomainInitializer>();
			
			for (IConfigurationElement element : Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_EDITING_DOMAIN_INITIALIZER)) {
				try {
					Object object = element.createExecutableExtension("ref");
					if (object instanceof IEditingDomainInitializer) {
						editingDomainInitializers.add((IEditingDomainInitializer) object);
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		return editingDomainInitializers;
	}

}
