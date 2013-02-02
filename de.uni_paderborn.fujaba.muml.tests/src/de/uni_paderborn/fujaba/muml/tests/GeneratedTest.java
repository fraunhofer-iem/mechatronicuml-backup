package de.uni_paderborn.fujaba.muml.tests;

import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.MumlPackage;
import de.uni_paderborn.fujaba.muml.tests.emfcompare.Comparer;

public class GeneratedTest {

	/**
	 * The workspace-relative path to the muml.model project.
	 */
	private static final String ECORE_MODEL_PROJECT = "de.uni_paderborn.fujaba.muml.model";

	/**
	 * The project-relative path to the muml.ecore file.
	 */
	private static final String ECORE_MODEL_PATH = "/model/muml.ecore";

	/**
	 * The loaded resource of the muml.ecore file.
	 */
	private static Resource ecoreModel;

	/**
	 * Initializes this test class by loading the ecore model. All tests in this
	 * class are executed on the loaded ecore model, afterwards.
	 * 
	 * @throws Exception
	 *             In case an exception occurs to make the test fail.
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Initialize new ResourceSet
		ResourceSet resourceSet = new ResourceSetImpl();

		Map<String, Object> extensionToFactoryMap = resourceSet
				.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl());
		extensionToFactoryMap.put("genmodel", new EcoreResourceFactoryImpl());
		extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		// Register Packages
		EcorePackage.eINSTANCE.eClass();
		GenModelPackage.eINSTANCE.eClass();

		// Register projects of dependant metamodels
		TestUtilities.registerWorkspaceProject("org.storydriven.core");
		TestUtilities.registerWorkspaceProject("org.storydriven.storydiagrams");
		TestUtilities.registerWorkspaceProject("de.uni_paderborn.fujaba.modelinstance");
		TestUtilities
				.registerWorkspaceProject("de.uni_paderborn.fujaba.muml.model.actionLanguage");

		// Add URIMap for Ecore.ecore to local file
		TestUtilities
				.registerWorkspaceProject("de.uni_paderborn.fujaba.muml.tests");
		Map<URI, URI> uriMap = resourceSet.getURIConverter().getURIMap();
		uriMap.put(
				URI.createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore"),
				URI.createURI("platform:/resource/de.uni_paderborn.fujaba.muml.tests/model/Ecore.ecore"));

		// Load resource
		ecoreModel = TestUtilities.loadResource(resourceSet,
				ECORE_MODEL_PROJECT, ECORE_MODEL_PATH);

	}

	/**
	 * Deinitializes this class by resetting the ecore model to
	 * <code>null</code>.
	 * 
	 * @throws Exception
	 *             In case an exception occurs to make the test fail.
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		ecoreModel = null;
	}

	@Test
	public void generatedTest() {
		CorePackage.eINSTANCE.eClass();
		EPackage mumlPackage = (EPackage) ecoreModel.getContents().get(0);
		Comparer comparer = new Comparer(true) {

			@Override
			protected boolean isRequiredFeature(EObject elementA,
					EObject elementB, EStructuralFeature feature) {
				if (elementA.eResource() != ecoreModel) {
					return false;
				}
				return super.isRequiredFeature(elementA, elementB, feature);
			}
			
		};
		comparer.addUnrequiredFeature(EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS);
		comparer.addUnrequiredFeature(EcorePackage.Literals.ECLASSIFIER__INSTANCE_CLASS);
		comparer.addUnrequiredFeature(EcorePackage.Literals.ECLASSIFIER__INSTANCE_CLASS_NAME);
		comparer.addUnrequiredFeature(EcorePackage.Literals.ECLASSIFIER__INSTANCE_TYPE_NAME);
		comparer.addUnrequiredFeature(EcorePackage.Literals.EPACKAGE__EFACTORY_INSTANCE);
		comparer.addUnrequiredFeature(EcorePackage.Literals.EREFERENCE__RESOLVE_PROXIES);
		comparer.addUnrequiredFeature(EcorePackage.Literals.ESTRUCTURAL_FEATURE__DEFAULT_VALUE);
		boolean equals = comparer.compare(mumlPackage, MumlPackage.eINSTANCE);
		if (!equals) {
			if (comparer.getDifferenceFeature() != null) {
				Assert.fail("Regenerate model code! "
						+ "Feature "
						+ comparer.getDifferenceFeature().getEContainingClass()
								.getName() + "."
						+ comparer.getDifferenceFeature().getName()
						+ " differs for " + getLabel(comparer.getDifferenceA()) + " and "
						+ getLabel(comparer.getDifferenceB()) + ".");
			} else {
				Assert.fail("Regenerate model code! "
						+ getLabel(comparer.getDifferenceA()) + " differs from "
						+ getLabel(comparer.getDifferenceB()) + ".");
			}
		}
	}
	
	protected String getLabel(Object element) {
		if (element instanceof ENamedElement) {
			return ((ENamedElement) element).getName();
		}
//		if (element instanceof EObject) {
//			return ((EObject) element).eClass().getName();
//		}
		if (element != null) {
			return element.toString();
		}
		return "null";
	}
}
