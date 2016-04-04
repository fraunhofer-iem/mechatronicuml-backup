package org.muml.pim.common;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class MumlCommonPlugin implements BundleActivator {


	private static MumlCommonPlugin instance;

	private static BundleContext context;



	static BundleContext getContext() {
		return context;
	}
	
	public static MumlCommonPlugin getInstance() {
		return MumlCommonPlugin.instance;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		MumlCommonPlugin.context = bundleContext;
		MumlCommonPlugin.instance = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		MumlCommonPlugin.context = null;
		MumlCommonPlugin.instance = null;
	}

}
