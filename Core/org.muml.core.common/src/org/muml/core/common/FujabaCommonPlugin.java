package org.muml.core.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.ui.PlatformUI;
import org.muml.core.common.emf.edit.ui.elementinitializer.IElementInitializer;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class FujabaCommonPlugin implements BundleActivator {

	// The IDs of your extension points
	private static final String CUSTOM_ITEM_PROVIDER_ADAPTER_FACTORIES_EXTENSION_POINT = "org.muml.core.common.customItemProviderAdapterFactories";
	
	private static final String ELEMENT_INITIALIZER_EXTENSION_POINT = "org.muml.core.common.elementInitializer";

	public static final String ID = "org.muml.core.common";


	private static FujabaCommonPlugin instance;

	private static BundleContext context;
	
	private static Map<String, List<IElementInitializer>> elementInitializers;
	
	private Map<String, List<AdapterFactory>> negativePriorityAdapterFactories = new HashMap<String, List<AdapterFactory>>();
	
	private Map<String, List<AdapterFactory>> positivePriorityAdapterFactories = new HashMap<String, List<AdapterFactory>>();

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
		getElementInitializersMap(); // initialize map when plugin starts to reduce later durations
	}
	
	public static List<IElementInitializer> getElementInitializers(EClass eClass) {
		// TODO can this be done in a nicer way to get the qualified class name?
		String qualifiedClassName = eClass.getInstanceClassName();
	
		return getElementInitializers(qualifiedClassName);
	}

	public static List<IElementInitializer> getElementInitializers(String qualifiedClassName) {
		Map<String, List<IElementInitializer>> map = getElementInitializersMap();
		if (map.containsKey(qualifiedClassName) && map.get(qualifiedClassName) != null) {
			return map.get(qualifiedClassName);
		}
		return Collections.emptyList();
	}

	private static Map<String, List<IElementInitializer>> getElementInitializersMap() {
		if (elementInitializers == null) {
			elementInitializers = new HashMap<String, List<IElementInitializer>>();
			List<IConfigurationElement> elements = Arrays
					.asList(Platform
							.getExtensionRegistry()
							.getConfigurationElementsFor(
									ELEMENT_INITIALIZER_EXTENSION_POINT));
			
			for (IConfigurationElement element : elements) {
				// Read className
				String className = element.getAttribute("qualifiedClassName");
				if (className == null) {
					continue;
				}
				
				// Get or create list
				List<IElementInitializer> list = elementInitializers.get(className);
				if (list == null) {
					list = new ArrayList<IElementInitializer>();
					elementInitializers.put(className, list);
				}
				
				// Read initializer
				IElementInitializer initializer = null;
				try {
					Object object = element.createExecutableExtension("initializer");
					if (object instanceof IElementInitializer) {
						initializer = (IElementInitializer) object;
					}
				} catch (CoreException e) {
					e.printStackTrace();
				} 
				
				// Add to list
				if (initializer != null) {
					list.add(initializer);
				}
			}

		}
		return elementInitializers;
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
		// Read from cache
		if (positivePriority && positivePriorityAdapterFactories.containsKey(pluginid)) {
			return positivePriorityAdapterFactories.get(pluginid);
		}
		if (!positivePriority && negativePriorityAdapterFactories.containsKey(pluginid)) {
			return negativePriorityAdapterFactories.get(pluginid);
		}
		
		
		// Not in cache
		List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		
		Assert.isNotNull(pluginid, "The argument pluginid must not be null");

		List<IConfigurationElement> elements = Arrays
				.asList(Platform
						.getExtensionRegistry()
						.getConfigurationElementsFor(
								CUSTOM_ITEM_PROVIDER_ADAPTER_FACTORIES_EXTENSION_POINT));

		List<IConfigurationElement> validElements = new ArrayList<IConfigurationElement>();
		
		// Use only those extensions that have a correct value for the pluginid attribute.
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
		
		if (positivePriority) {
			positivePriorityAdapterFactories.put(pluginid, factories);
		}
		if (!positivePriority && negativePriorityAdapterFactories != null) {
			negativePriorityAdapterFactories.put(pluginid, factories);
		}
		
		return factories;
	}
	
	
	public static boolean showValidationResults(Collection collection, String message) {

		Diagnostician diagnostician = new Diagnostician() {
			public String getObjectLabel(EObject eObject) {
				// BEGIN Fix for muml bug #341:
				try {
					return EMFCoreUtil.getName(eObject);
				} catch (NullPointerException e) {
					return "null";
				}
				// END Fix
			}
		};
		BasicDiagnostic diagnostic = new BasicDiagnostic
	          (EObjectValidator.DIAGNOSTIC_SOURCE,
	           0,
	           "Diagnosis of several elements",
	           collection.toArray()
	          );

	    Map<Object, Object> context = diagnostician.createDefaultContext();

		boolean valid = true;
		for (Object element : collection) {
			if (element instanceof EObject && !diagnostician.validate((EObject) element, diagnostic, context)) {
				valid = false;
			}
		}
		
		if (!valid) {
			if (diagnostic.getSeverity() != Diagnostic.OK) {
			    DiagnosticDialog.open
	            (PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "ERROR", message, diagnostic);					}
		}
		
		return valid;
	}
}
