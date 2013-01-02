package de.uni_paderborn.fujaba.muml.tests.packages;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import de.uni_paderborn.fujaba.muml.MumlPackage;
import de.uni_paderborn.fujaba.muml.tests.TestUtilities;
import de.uni_paderborn.fujaba.muml.tests.TraverseTest;
import de.uni_paderborn.fujaba.muml.tests.resource.IResourceVisitor;
import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;

public abstract class PackageTest extends TraverseTest {
	
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

		// Load resource
		ecoreModel = TestUtilities.loadResource(resourceSet, ECORE_MODEL_PROJECT, ECORE_MODEL_PATH);
	}

	/**
	 * Deinitializes this class by resetting the ecore model to <code>null</code>.
	 * 
	 * @throws Exception
	 *             In case an exception occurs to make the test fail.
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		ecoreModel = null;
	}


	@SuppressWarnings("unchecked")
	protected Collection<EObject> getContents(EObject element) {
		return (Collection<EObject>) ((Collection<?>)((EPackage) element).getESubpackages());
	}
	
	
	
	@Test
	public void testPluginXml() throws Exception {
		final Collection<String> uris = getUris();

		final ProblemCollector problems = new ProblemCollector();
		accept(ecoreModel.getContents().get(0), new IResourceVisitor() {

			@Override
			public boolean visit(EObject element) {
				EPackage _package = (EPackage) element;
				String nsUri = _package.getNsURI();
				if (uris.contains(nsUri)) {
					uris.remove(nsUri);
				} else if (isRequiredPackage(_package)) {
					problems.add("MISSING: " + getName() + " does not have an extension for package with nsUri: " + nsUri);
				}

				return true;
			}

		});
		for (String nsUri : uris) {
			problems.add("INVALID: " + getName() + " contains invalid package nsURI: " + nsUri);
		}
		problems.fail();
	}

	protected boolean isRequiredPackage(EPackage _package) {
		return !_package.getEClassifiers().isEmpty();
	}
	
	protected abstract String getName();
	protected abstract Collection<String> getUris() throws Exception;
}
