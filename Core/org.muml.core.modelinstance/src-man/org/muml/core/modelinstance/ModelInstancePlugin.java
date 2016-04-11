package org.muml.core.modelinstance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.modelinstance.categories.ModelElementCategoryRegistry;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ModelInstancePlugin implements BundleActivator {

	private static ModelInstancePlugin instance;
	private static BundleContext context;
	private ModelElementCategoryRegistry modelElementCategoryRegistry;
	
	private String versionInformation;
	
	static BundleContext getContext() {
		return context;
	}

	public static ModelInstancePlugin getInstance() {
		return instance;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		ModelInstancePlugin.instance = this;
		ModelInstancePlugin.context = bundleContext;
		
		modelElementCategoryRegistry = new ModelElementCategoryRegistry(true);
		versionInformation = buildVersionInformation();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		ModelInstancePlugin.instance = null;
		ModelInstancePlugin.context = null;
		modelElementCategoryRegistry = null;
		versionInformation = null;
	}
	

	public ModelElementCategoryRegistry getModelElementCategoryRegistry() {
		return modelElementCategoryRegistry;
	}
	

	public static String getVersionInformation() {
		return instance.versionInformation;
	}

	
	
	private String buildVersionInformation() {
		StringBuilder builder = new StringBuilder();
		IConfigurationElement[] topElements = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(
						"org.muml.core.modelinstance.version");

		for (IConfigurationElement artefact : topElements) {
			String name = artefact.getAttribute("name");
			String version = artefact.getAttribute("version");
			builder.append(name);
			builder.append(" version ");
			builder.append(version);
			for (IConfigurationElement change : artefact.getChildren()) {
//				String committer = trim(change.getAttribute("committer"), "LastChangedBy:");
//				String date = trim(change.getAttribute("date"), "LastChangedDate:");
				String revision = trim(change.getAttribute("revision"), "LastChangedRevision:");
				builder.append(" (");
				builder.append('r');
				builder.append(revision);
				builder.append(')');
			}
		}

		return builder.toString();
	}

	private String trim(String str, String keyword) {
		if (str.charAt(0) == '$') {
			str = str.substring(1);
		}
		if (str.charAt(str.length()-1) =='$') {
			str = str.substring(0, str.length() - 2);
		}
		str = str.trim();
		if (str.startsWith(keyword)) {
			str = str.substring(keyword.length());
		}
		return str.trim();
	}
	
	// Copied from APE runtime plugin:
	private static Map<EReference, List<EClass>> foundEClasses = new HashMap<EReference, List<EClass>>();
	public static List<EClass> getEClasses(EReference feature) {
		List<EClass> eClasses = foundEClasses.get(feature);
		if (eClasses == null) {
			eClasses = new ArrayList<EClass>();

			// New implementation considering the whole package registry.
			org.eclipse.emf.ecore.EPackage.Registry registry = EPackage.Registry.INSTANCE;
			for (String key : new HashSet<String>(registry.keySet())) {
			    EPackage ePackage = registry.getEPackage(key);
			   for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				   if (eClassifier instanceof EClass) {
					   EClass eClass = (EClass) eClassifier;
					   if (eClass != null && !eClass.isAbstract() && feature.getEReferenceType().isSuperTypeOf(eClass)) {
							eClasses.add(eClass);
					   }
				   }
			   }
			}
			
			Collections.sort(eClasses, new Comparator<EClass>() {

				@Override
				public int compare(EClass o1, EClass o2) {
					if (o1 == null || o2 == null) {
						return 0;
					}
					if (o1.getName() == null || o2.getName() == null) {
						return 0;
					}
					return o1.getName().compareTo(o2.getName());
				}

			} );
			foundEClasses.put(feature, eClasses);
		}
		return new ArrayList<EClass>(eClasses); 
	}

	

}
