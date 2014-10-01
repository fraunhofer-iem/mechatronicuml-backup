package de.uni_paderborn.fujaba.muml.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.BeforeClass;
import org.junit.Test;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.tests.resource.IResourceVisitor;
import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;

/**
 * This test makes sure that EOperations are implemented in the ecore file.
 * 
 * @author bingo
 * 
 */
public class MetamodelEOperationTest extends TraverseTest {

	private static List<EPackage> packages = new ArrayList<EPackage>();

	/**
	 * Initializes this test class by loading the ecore model. All tests in this
	 * class are executed on the loaded ecore model, afterwards.
	 * 
	 * @throws Exception
	 *             In case an exception occurs to make the test fail.
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();

		// Extensions to Factory
		Map<String, Object> extensionToFactoryMap = resourceSet
				.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl());
		extensionToFactoryMap.put("genmodel", new EcoreResourceFactoryImpl());
		extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		// Register Packages
		EcorePackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		
		
		// URIMap for Ecore.ecore
		Map uriMap = resourceSet.getURIConverter().getURIMap(); 
		uriMap.put( 
				URI.createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore"),
				URI.createURI("platform:/resource/de.uni_paderborn.fujaba.muml.tests/model/Ecore.ecore"));
		
		TestUtilities.registerWorkspaceProject("de.uni_paderborn.fujaba.muml.tests");
		TestUtilities.registerWorkspaceProject("org.storydriven.core");

		// Load resource and add model package

		Resource coreModel = TestUtilities.loadResource(resourceSet,
				"org.storydriven.core", "/model/core.ecore");

		
		Resource mumlModel = TestUtilities.loadResource(resourceSet,
				"de.uni_paderborn.fujaba.muml", "/model/muml.ecore");


		
		EcoreUtil.resolveAll(resourceSet);
		EPackage muml = (EPackage) mumlModel.getContents().get(0);
		EPackage core = (EPackage) coreModel.getContents().get(0);
		
		
		packages.add(muml);
		packages.add(core);

		// TODO: set a different label provider
		// setLabelProvider(qualifiedLabelProvider);
	}
	
	protected Collection<EObject> getContents(EObject element) {
		List<EObject> contents = new ArrayList<EObject>();

		if (element instanceof EPackage) {
			EPackage ePackage = (EPackage) element;
			contents.addAll(ePackage.getEClassifiers());
			contents.addAll(ePackage.getESubpackages());
			return contents;
		} else if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			contents.addAll(eClass.getEStructuralFeatures());
		} else {
			//contents.addAll(element.eContents());
		}
		return contents;
	}


	/**
	 * Tests, if there are deactivated OCL constraints.
	 */
	@Test
	public void operationRequiresImplementation() {
		final ProblemCollector problems = new ProblemCollector();

		for (EPackage p : packages) {

			accept(p, new IResourceVisitor() {
				@Override
				public boolean visit(EObject element) {
					if (element instanceof EClass) {
						EClass eClass = (EClass) element;
						for (EOperation eOperation : eClass.getEOperations()) {
							if (!hasImplementation(eOperation)) {
								problems.add("ERROR: " + eClass.getEPackage().getName() + "." + eClass.getName() + "."
										+ eOperation.getName() + "(): " + "No Implementation provided in the Ecore file.");
							}
						}
					}
					return true;
				}

			});
		}
		problems.fail();
	}

	protected boolean hasImplementation(EOperation eOperation) {
		String sources[] = new String[] {
			"http://www.eclipse.org/emf/2002/GenModel",
			"http://www.eclipse.org/emf/2002/Ecore/OCL"
		};
		for (String source : sources) {
			EAnnotation eAnnotation = eOperation.getEAnnotation(source);
			if (eAnnotation != null && eAnnotation.getDetails().get("body") != null) {
				return true;
			}
		}
		
		return false;
	}


}
