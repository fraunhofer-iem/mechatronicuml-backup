package de.uni_paderborn.fujaba.properties.reconcile;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class PropertiesReconcilePlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.uni_paderborn.fujaba.properties.reconcile"; //$NON-NLS-1$

	// The shared instance
	private static PropertiesReconcilePlugin plugin;

	private TransformationExecutor defaultTransformationExecutor;

	/**
	 * The constructor
	 */
	public PropertiesReconcilePlugin() {
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

		// Create transformation executor
		getDefaultTransformationExecutor();
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
		defaultTransformationExecutor = null;
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

	public TransformationExecutor getDefaultTransformationExecutor() {
		return getDefaultTransformationExecutor(true);
	}

	public TransformationExecutor getDefaultTransformationExecutor(
			boolean reload) {
		if (reload) {
			defaultTransformationExecutor = null;
		}

		if (defaultTransformationExecutor == null) {
			URI uri = URI
					.createPlatformPluginURI(
							"/de.uni_paderborn.fujaba.properties.reconcile/transforms/reconcile.qvto",
							true);
			defaultTransformationExecutor = createTransformationExecutor(uri);
		}
		return defaultTransformationExecutor;
	}

	public TransformationExecutor createTransformationExecutor(URI uri) {

		// create executor and execution context
		TransformationExecutor transformationExecutor = new TransformationExecutor(
				uri);
		if (transformationExecutor != null) {
			transformationExecutor.loadTransformation();
		}
		return transformationExecutor;
	}

}
