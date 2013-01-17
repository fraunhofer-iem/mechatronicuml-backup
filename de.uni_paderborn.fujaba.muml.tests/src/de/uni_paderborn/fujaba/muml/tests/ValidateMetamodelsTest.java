package de.uni_paderborn.fujaba.muml.tests;

import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ValidateMetamodelsTest {
	private static ResourceSet resourceSet = new ResourceSetImpl();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Map uriMap = resourceSet.getURIConverter().getURIMap(); 
		uriMap.put( 
				URI.createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore"),
				URI.createURI("platform:/resource/de.uni_paderborn.fujaba.muml.tests/model/Ecore.ecore"));
		
		TestUtilities.registerWorkspaceProject("de.uni_paderborn.fujaba.muml.tests");

		Map<String, Object> extensionToFactoryMap = resourceSet
				.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl());
		extensionToFactoryMap.put("genmodel", new EcoreResourceFactoryImpl());
		extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		// Register Packages
		EcorePackage.eINSTANCE.eClass();
		GenModelPackage.eINSTANCE.eClass();

		// Load resource
		TestUtilities.loadResource(resourceSet,
				"de.uni_paderborn.fujaba.muml.model", "/model/muml.ecore");
		TestUtilities.loadResource(resourceSet,
				"de.uni_paderborn.fujaba.muml.model.actionLanguage", "/model/actionLanguage.ecore");
		TestUtilities.loadResource(resourceSet,
				"de.uni_paderborn.fujaba.muml.model.componentstorydiagram", "/model/ComponentStoryDiagram.ecore");
		TestUtilities.loadResource(resourceSet,
				"de.uni_paderborn.fujaba.muml.model.reconfiguration", "/model/MumlReconfiguration.ecore");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		resourceSet = null;
	}

	@Test
	public void validateMetamodels() {
		for (Resource resource : resourceSet.getResources()) {
			for (EObject contents : resource.getContents()) {
				Diagnostician.INSTANCE.validate(contents);
			}
		}
	}
}
