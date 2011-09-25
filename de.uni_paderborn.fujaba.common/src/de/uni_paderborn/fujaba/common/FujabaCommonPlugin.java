package de.uni_paderborn.fujaba.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class FujabaCommonPlugin implements BundleActivator {

	// This is the ID from your extension point
	private static final String CUSTOM_ITEM_PROVIDER_ADAPTER_FACTORIES_EXTENSION_POINT = "de.uni_paderborn.fujaba.common.customItemProviderAdapterFactories";

	private static FujabaCommonPlugin instance;

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public static FujabaCommonPlugin getInstance() {
		return FujabaCommonPlugin.instance;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		FujabaCommonPlugin.context = bundleContext;
		FujabaCommonPlugin.instance = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		FujabaCommonPlugin.context = null;
		FujabaCommonPlugin.instance = null;
	}

	private class PriorityConfigurationElementComparator implements
			Comparator<IConfigurationElement> {

		private boolean ascending;

		public PriorityConfigurationElementComparator(boolean ascending) {
			this.ascending = ascending;
		}

		@Override
		public int compare(IConfigurationElement o1, IConfigurationElement o2) {
			int priority1 = 0;
			int priority2 = 0;

			try {
				priority1 = Integer.parseInt(o1.getAttribute("priority"));
			} catch (NumberFormatException e) {
				return -1;
			}

			try {
				priority2 = Integer.parseInt(o2.getAttribute("priority"));
			} catch (NumberFormatException e) {
				return 1;
			}

			if (ascending) {
				return priority1 - priority2;
			} else {
				return priority2 - priority1;
			}
		}
	}

	public List<AdapterFactory> getCustomItemProviderAdapterFactories(
			String pluginid, boolean positivePriority) {
		List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		
		if (pluginid == null) {
			throw new IllegalArgumentException("The argument pluginid must not be null");
		}

		List<IConfigurationElement> elements = Arrays
				.asList(Platform
						.getExtensionRegistry()
						.getConfigurationElementsFor(
								CUSTOM_ITEM_PROVIDER_ADAPTER_FACTORIES_EXTENSION_POINT));

		List<IConfigurationElement> validElements = new ArrayList<IConfigurationElement>();
		
		// Use only those extensions that have a wrong value for the pluginid attribute.
		for (IConfigurationElement element : elements) {
			if (pluginid.equals(element.getAttribute("pluginid"))) {
				validElements.add(element);
			}
		}

		
		// Sort the elements by their priority
		boolean sortAscending = !positivePriority;
		Collections.sort(validElements, new PriorityConfigurationElementComparator(
				sortAscending));

		try {
			for (IConfigurationElement element : validElements) {
				try {
					String strPriority = element.getAttribute("priority");
					if (strPriority != null) {
						int priority = Integer.parseInt(strPriority);
						if ((priority >= 0) != positivePriority) {
							break;
						}
					}
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}

				final Object o = element.createExecutableExtension("class");
				if (o instanceof AdapterFactory) {
					if (sortAscending) {
						factories.add(0, (AdapterFactory) o);
					} else {
						factories.add((AdapterFactory) o);
					}
				}
			}
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}
		return factories;
	}
}
