package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom.part;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom";

	// The shared instance
	private static Activator plugin;

	private TransformationExecutor transformationExecutor;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		this.getTransformationExecutor();
	}

	public TransformationExecutor getTransformationExecutor() {
		if (transformationExecutor == null) {
			URI transformationURI = URI
					.createPlatformPluginURI(
							"/de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.custom/transforms/SynchInstances.qvto",
							true);
			// create executor and execution context
			transformationExecutor = new TransformationExecutor(
					transformationURI);
			transformationExecutor.loadTransformation();
		}
		return transformationExecutor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
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
	public static Activator getDefault() {
		return plugin;
	}

}
