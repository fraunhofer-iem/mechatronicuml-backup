package org.muml.core.tests.gmf;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResourceFactory;
import org.eclipse.gmf.tooldef.GMFToolPackage;
import org.muml.core.tests.TestUtilities;

/**
 * This class returns a GMFModel and initializes the dependent Ecore-MetaModels
 * 
 * @author adann
 */

public abstract class GMFUtils {

	public static Object loadGmfModel(EClass gmfModelElementToLoad, String path) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
//		GMFUtils.initEcoreMetaModel(resourceSet, ecoreProjects);
		GMFUtils.initGMFModels(resourceSet);
		Resource resource = null;
		try {
			resource = TestUtilities.loadResource(resourceSet, path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return EcoreUtil.getObjectByType(resource.getContents(),
				gmfModelElementToLoad);
	}

//	private static void initEcoreMetaModel(ResourceSet resourceSet,
//			List<String[]> projects) {
//
//		Map<String, Object> extensionToFactoryMap = resourceSet
//				.getResourceFactoryRegistry().getExtensionToFactoryMap();
//		extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl());
//		extensionToFactoryMap.put("genmodel", new EcoreResourceFactoryImpl());
//		extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
//				new XMIResourceFactoryImpl());
//
//		// Register Packages
//		EcorePackage.eINSTANCE.eClass();
//		CorePackage.eINSTANCE.eClass();
//		MumlPackage.eINSTANCE.eClass();
//
//		GenModelPackage.eINSTANCE.eClass();
//
//		GMFToolPackage.eINSTANCE.eClass();
//		GMFMapPackage.eINSTANCE.eClass();
//
//		GMFGenPackage.eINSTANCE.eClass();
//		GMFGraphPackage.eINSTANCE.eClass();
//
//		// Load resource (CAUTION: Order is important; dependant metamodels must
//		// be loaded first, else proxies are not resolved correctly...)
//
//		for (String[] path : projects) {
//			
//			try {
//				TestUtilities.loadResource(resourceSet, path[0], path[1]);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//
//		}
//		EcoreUtil.resolveAll(resourceSet);
//	}

	public static void initGMFModels(ResourceSet resourceSet) {
		Map<String, Object> extensionToFactoryMap = resourceSet
				.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new GMFResourceFactory());
		extensionToFactoryMap.put(GMFGraphPackage.eNS_URI,
				GMFGraphPackage.eINSTANCE);
		extensionToFactoryMap.put(GMFToolPackage.eNS_URI,
				GMFToolPackage.eINSTANCE);
		extensionToFactoryMap.put(GMFMapPackage.eNS_URI,
				GMFMapPackage.eINSTANCE);
		extensionToFactoryMap.put(GMFToolPackage.eNS_URI,
				GMFToolPackage.eINSTANCE);
	}

}
