package de.uni_paderborn.fujaba.muml.tests;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.BasicDiagnostic;
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
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;

public class ValidateMetamodelsTest {
	private static ResourceSet resourceSet = new ResourceSetImpl();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// URIMap for Ecore.ecore
		Map uriMap = resourceSet.getURIConverter().getURIMap(); 
		uriMap.put( 
				URI.createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore"),
				URI.createURI("platform:/resource/de.uni_paderborn.fujaba.muml.tests/model/Ecore.ecore"));
		
		TestUtilities.registerWorkspaceProject("de.uni_paderborn.fujaba.muml.tests");

		// Extensions to Factory
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
				"org.storydriven.core", "/model/core.ecore");
		TestUtilities.loadResource(resourceSet,
				"org.storydriven.storydiagrams", "/model/storydiagrams.ecore");
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
		final ProblemCollector problems = new ProblemCollector();
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		for (Resource resource : resourceSet.getResources()) {
			for (EObject contents : resource.getContents()) {
			    Map<Object, Object> context = new HashMap<Object, Object>();
				if (!Diagnostician.INSTANCE.validate(contents, diagnostics, context)) {
					problems.add(resource.getURI().lastSegment() + " is not valid.");
				}
			}
		}
		problems.fail();
	}
}
