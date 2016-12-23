/*******************************************************************************
 * Copyright (c) 2016 Fraunhofer IEM.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    David Schmelter - initial implementation
 *******************************************************************************/
package org.muml.pim.app4mc.export.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.muml.pim.app4mc.export.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private TransformationExecutor muml2RunnableTransformationExecutor;
	private TransformationExecutor muml2APP4MCTransformationExecutor;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
	 * BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		muml2RunnableTransformationExecutor = null;
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

	public TransformationExecutor getMUML2RunnableTransformationExecutor() {
		return getMUML2RunnableTransformationExecutor(true);
	}

	public TransformationExecutor getMUML2RunnableTransformationExecutor(boolean reload) {
		if (reload) {
			muml2RunnableTransformationExecutor = null;
		}

		if (muml2RunnableTransformationExecutor == null) {
			URI uri = URI.createPlatformPluginURI(
					"/org.muml.pim.runnable.transformation/transforms/regions2runnables.qvto", true);
			muml2RunnableTransformationExecutor = createTransformationExecutor(uri);
		}
		return muml2RunnableTransformationExecutor;
	}

	public TransformationExecutor getMUML2APP4MCRunnableTransformationExecutor() {
		return getMUML2APP4MCRunnableTransformationExecutor(true);
	}

	public TransformationExecutor getMUML2APP4MCRunnableTransformationExecutor(boolean reload) {
		if (reload) {
			muml2APP4MCTransformationExecutor = null;
		}

		if (muml2APP4MCTransformationExecutor == null) {
			URI uri = URI.createPlatformPluginURI("/org.muml.pim.app4mc.transformation/transforms/muml2app4mc.qvto",
					true);
			muml2APP4MCTransformationExecutor = createTransformationExecutor(uri);
		}
		return muml2APP4MCTransformationExecutor;
	}

	public TransformationExecutor createTransformationExecutor(URI uri) {

		// create executor
		TransformationExecutor transformationExecutor = new TransformationExecutor(uri);
		if (transformationExecutor != null) {
			transformationExecutor.loadTransformation();
		}
		return transformationExecutor;
	}
}
