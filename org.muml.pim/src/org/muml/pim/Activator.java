package org.muml.pim;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator implements org.osgi.framework.BundleActivator {
    // The plug-in ID
    public static final String PLUGIN_ID = "org.muml.pim";

    // The shared instance
    private static Activator plugin;

    private static Set<Viewpoint> viewpoints; 

    /**
     * The constructor
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
		plugin = this;
		viewpoints = new HashSet<Viewpoint>();
		viewpoints.addAll(ViewpointRegistry.getInstance().registerFromPlugin(PLUGIN_ID + "/model/pimproperties.odesign")); 
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
		plugin = null;
		if (viewpoints != null) {
		    for (final Viewpoint viewpoint: viewpoints) {
		    	ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
		    }
		    viewpoints.clear();
		    viewpoints = null; 
		}
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
    	return plugin;
    }
}
