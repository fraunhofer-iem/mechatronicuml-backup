package org.muml.pm.hardware.platforminstance.diagram.custom.part;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


public class Activator extends AbstractUIPlugin {

	// The plug-in ID


		// The shared instance
		private static Activator plugin;

		private TransformationExecutor transformationExecutor;
	
	public Activator() {
		// TODO Auto-generated constructor stub
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
		transformationExecutor=null;
		if (transformationExecutor == null) {
			URI transformationURI = URI
					.createPlatformPluginURI(
							"/org.muml.pm.hardware.platforminstance.diagram.custom/transforms/instances.qvto",
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
