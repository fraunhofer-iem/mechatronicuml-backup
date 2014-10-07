package de.uni_paderborn.fujaba.muml.common;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.storydriven.core.expressions.provider.ExpressionsItemProviderAdapterFactory;
import org.storydriven.core.provider.CoreItemProviderAdapterFactory;

import de.uni_paderborn.fujaba.modelinstance.provider.ModelinstanceItemProviderAdapterFactory;
import de.uni_paderborn.fujaba.muml.protocol.provider.ProtocolItemProviderAdapterFactory;

public class MumlCommonPlugin implements BundleActivator {


	private static MumlCommonPlugin instance;

	private static BundleContext context;

	public static String ID = "de.uni_paderborn.fujaba.muml.common";

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
