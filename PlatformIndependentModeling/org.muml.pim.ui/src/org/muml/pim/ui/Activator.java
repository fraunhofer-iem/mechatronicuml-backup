package org.muml.pim.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private static Activator instance;

	private Map<String, TransformationExecutor> transformationExecutors = new HashMap<String, TransformationExecutor>();

	public static final String ID = "org.muml.pim.ui";

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		instance = this;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		instance = null;
		Activator.context = null;
	}

	public TransformationExecutor getTransformationExecutor(
			String transformationPath) {
		return getTransformationExecutor(transformationPath, false);
	}

	public TransformationExecutor getTransformationExecutor(
			String transformationPath, boolean reload) {
		TransformationExecutor transformationExecutor = transformationExecutors
				.get(transformationPath);

		if (reload) {
			transformationExecutor = null;
		}
		if (transformationExecutor == null) {
			URI transformationURI = URI.createPlatformPluginURI(
					transformationPath, true);

			// create executor and execution context
			transformationExecutor = new TransformationExecutor(
					transformationURI);
			transformationExecutor.loadTransformation();

			transformationExecutors.put(transformationPath,
					transformationExecutor);
		}
		return transformationExecutor;
	}

	public static Activator getInstance() {
		return instance;
	}
}
