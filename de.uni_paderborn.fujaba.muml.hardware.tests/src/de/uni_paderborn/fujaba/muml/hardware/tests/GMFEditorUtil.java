package de.uni_paderborn.fujaba.muml.hardware.tests;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResourceFactory;
import org.eclipse.gmf.tooldef.GMFToolPackage;
import org.eclipse.gmf.tooldef.ToolRegistry;

import de.uni_paderborn.fujaba.muml.tests.TestUtilities;

/**
 * This class walks through an ecore file and sets up the resourceSet
 * it is based on the MUML Test classes of the package {@link de.uni_paderborn.fujaba.muml.tests}
 * @author Andreas Dann
 *
 */

/**
 * Code modified from
 * http://code.google.com/p/easymodelers/source/browse/trunk/modules
 * /org.easymodelers
 * .gmf/src/main/java/org/easymodelers/gmf/utils/GmfModelsUtils.
 * java?spec=svn35&r=35
 * 
 * @author adann
 * 
 */

public abstract class GMFEditorUtil {

	// General methods

	private static String getURIMapping(String uri) {
		// uri = uri.replace("platform:/", "");
		// uri = uri.substring(uri.indexOf("/")+1);
		return uri;
	}

	public static EObject loadResource(Resource resource) throws IOException {
		resource.load(null);
		EcoreUtil.resolveAll(resource);
		return (EObject) EcoreUtil.getObjectByType(resource.getContents(),
				EcorePackage.eINSTANCE.getEObject());
	}

	public static EObject loadGmfModel(String plugin, String path,
			List<String[]> ecoreProjects) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		GMFEditorUtil.init(resourceSet, ecoreProjects);
		GMFResourceFactory resourceFactory = new GMFResourceFactory();
		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						resourceFactory);
		resourceSet.getPackageRegistry().put(GMFGraphPackage.eNS_URI,
				GMFGraphPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(GMFToolPackage.eNS_URI,
				GMFToolPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(GMFMapPackage.eNS_URI,
				GMFMapPackage.eINSTANCE);

		Resource resource = null;
		try {
			resource = TestUtilities.loadResource(resourceSet, plugin, path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resourceSet
				.getURIConverter()
				.getURIMap()
				.put(URI.createPlatformResourceURI(plugin + path, true),
						URI.createURI(getURIMapping(plugin + path)));
		resource.load(null);
		EcoreUtil.resolveAll(resource);

		return (EObject) EcoreUtil.getObjectByType(resource.getContents(),
				EcorePackage.eINSTANCE.getEObject());
	}

	// Graph model

	public static Canvas getGmfGraphModel(String plugin, String path,
			List<String[]> ecoreProjects) throws IOException {
		return (Canvas) loadGmfModel(plugin, path, ecoreProjects);
	}

	// Tool model

	public static ToolRegistry getGmfToolModel(String plugin, String path,
			List<String[]> ecoreProjects) throws IOException {
		return (ToolRegistry) loadGmfModel(plugin, path, ecoreProjects);
	}

	// Map model
	public static Mapping getGmfMapModel(String plugin, String path,
			List<String[]> ecoreProjects) throws IOException {
		return (Mapping) loadGmfModel(plugin, path, ecoreProjects);
	}

	private static void init(ResourceSet resourceSet, List<String[]> projects) {
		// resourceSet = new ResourceSetImpl();

		Map<String, Object> extensionToFactoryMap = resourceSet
				.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl());
		extensionToFactoryMap.put("genmodel", new EcoreResourceFactoryImpl());
		extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		// Register Packages
		EcorePackage.eINSTANCE.eClass();
		GenModelPackage.eINSTANCE.eClass();

		// Load resource (CAUTION: Order is important; dependant metamodels must
		// be loaded first, else proxies are not resolved correctly...)

		for (String[] path : projects) {
			try {
				TestUtilities.loadResource(resourceSet, path[0], path[1]);

			} catch (Exception e) {
				try {
					TestUtilities.loadResource(resourceSet, "sdm", "/"
							+ path[0] + path[1]);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		}
		EcoreUtil.resolveAll(resourceSet);
	}

}
