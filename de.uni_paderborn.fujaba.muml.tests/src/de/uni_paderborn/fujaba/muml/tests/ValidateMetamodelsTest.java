package de.uni_paderborn.fujaba.muml.tests;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;

public class ValidateMetamodelsTest {
	private static ResourceSet resourceSet;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		resourceSet = new ResourceSetImpl();
		// URIMap for Ecore.ecore
		Map uriMap = resourceSet.getURIConverter().getURIMap();
		uriMap.put(
				URI.createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore"),
				URI.createURI("platform:/resource/de.uni_paderborn.fujaba.muml.tests/model/Ecore.ecore"));

		TestUtilities
				.registerWorkspaceProject("de.uni_paderborn.fujaba.muml.tests");
		
		
		// XXX
		org.eclipse.ocl.ecore.OCL.initialize(null);
		org.eclipse.ocl.ecore.OCL.initialize(resourceSet);

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

		// Load resource (CAUTION: Order is important; dependant metamodels must
		// be loaded first, else proxies are not resolved correctly...)
		List<String[]> projects = new ArrayList<String[]>();
		projects.add(new String[] { "de.uni_paderborn.fujaba.muml.tests", "/model/Ecore.ecore" });
		projects.add(new String[] { "org.storydriven.core", "/model/core.ecore" });
		projects.add(new String[] { "org.storydriven.core", "/model/core.ecore" });
		projects.add(new String[] { "org.storydriven.storydiagrams",
				"/model/storydiagrams.ecore" });
		projects.add(new String[] { "de.uni_paderborn.fujaba.muml", "/model/muml.ecore" });
		projects.add(new String[] { "de.uni_paderborn.fujaba.muml.actionlanguage",
				"/model/actionlanguage.ecore" });
		projects.add(new String[] { "de.uni_paderborn.fujaba.muml.reconfiguration",
				"/model/MumlReconfiguration.ecore" });
		projects.add(new String[] { "de.uni_paderborn.fujaba.muml.componentstorydiagram",
				"/model/ComponentStoryDiagram.ecore" });

		for (String[] path : projects) {
			try {
				TestUtilities.loadResource(resourceSet, path[0], path[1]);

			} catch (Exception e) {
				TestUtilities.loadResource(resourceSet, "sdm", "/" + path[0] + path[1]);

			}
		}

		EcoreUtil.resolveAll(resourceSet);

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
				if (!Diagnostician.INSTANCE.validate(contents, diagnostics,
						context)) {
					problems.add(resource.getURI().lastSegment()
							+ " is not valid.");
				}
			}
		}
		problems.fail();
	}
}
