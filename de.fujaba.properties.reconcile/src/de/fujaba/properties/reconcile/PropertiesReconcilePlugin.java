package de.fujaba.properties.reconcile;


import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class PropertiesReconcilePlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.fujaba.properties.reconcile"; //$NON-NLS-1$

	// The shared instance
	private static PropertiesReconcilePlugin plugin;
	

	private TransformationExecutor transformationExecutor;

	
	/**
	 * The constructor
	 */
	public PropertiesReconcilePlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		// Create transformation executor
		getTransformationExecutor();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		transformationExecutor = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static PropertiesReconcilePlugin getDefault() {
		return plugin;
	}
	
	public TransformationExecutor getTransformationExecutor() {
		return getTransformationExecutor(false);
	}

	public TransformationExecutor getTransformationExecutor(boolean reload) {
		if (reload) {
			transformationExecutor = null;
		}
		
		if (transformationExecutor == null) {
			URI transformationURI = URI
					.createPlatformPluginURI(
							"/de.fujaba.properties.reconcile/transforms/reconcile.qvto",
							true);
			// create executor and execution context
			transformationExecutor = new TransformationExecutor(
					transformationURI);
			transformationExecutor.loadTransformation();
		}
		return transformationExecutor;
	}

}
