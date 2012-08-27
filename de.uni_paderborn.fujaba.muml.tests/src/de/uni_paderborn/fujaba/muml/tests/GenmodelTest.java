package de.uni_paderborn.fujaba.muml.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <p>
 * JUnit4 Test case for our muml.genmodel. It tests, if the genmodel conforms to
 * our own modeling conventions.
 * </p>
 * 
 * <p>
 * <em>For example:</em> Containment features that are not derived features
 * should have the <code>GenFeature.children</code> feature set to
 * <code>true</code>.
 * </p>
 * 
 * @author bingo
 * 
 */
public class GenmodelTest {

	/**
	 * The workspace-relative path to the muml.model project.
	 */
	private static final String GENMODEL_PROJECT = "de.uni_paderborn.fujaba.muml.model";

	/**
	 * The project-relative path to the muml.genmodel file.
	 */
	private static final String GENMODEL_PATH = "/model/muml.genmodel";

	/**
	 * The genmodel resource to work on (will be loaded in setUpBeforeClass()).
	 */
	private static Resource genmodel;

	/**
	 * Traverses the containment hierarchy starting the the specified
	 * <code>element</code> and visits all found elements using the
	 * <code>visitor</code>.
	 * 
	 * @param element
	 *            The start element.
	 * @param visitor
	 *            The visitor to use.
	 */
	private void traverse(EObject element, IVisitor visitor) {
		if (element == null) {
			return;
		}
		if (visitor.visit(element)) {
			for (EObject child : element.eContents()) {
				traverse(child, visitor);
			}
		}
	}

	/**
	 * Interface for visitors that can be used to visit genmodel elements.
	 * 
	 * @author ingo
	 * 
	 */
	private interface IVisitor {
		/**
		 * Visits this element.
		 * 
		 * @param element
		 *            The element to visit.
		 * @return <code>true</code>, if children of the <code>element</code>
		 *         should be visited, too.
		 */
		boolean visit(EObject element);
	}

	/**
	 * Gets a qualified label for the given element (e.g.
	 * package.package.element).
	 * 
	 * @param element
	 *            The element to get a label for
	 * @return The label
	 */
	private String getQualifiedLabel(EObject element) {

		StringBuffer buffer = new StringBuffer();

		while (element != null) {
			String label = getLabel(element);
			if (label != null) {
				buffer.insert(0, '.');
				buffer.insert(0, label);
			}

			element = element.eContainer();
		}

		return buffer.toString();
	}

	/**
	 * Gets a label for the given element (e.g. by getting its name).
	 * 
	 * @param element
	 *            The element to get a label for
	 * @return The label
	 */
	private String getLabel(EObject element) {
		if (element instanceof ENamedElement) {
			return ((ENamedElement) element).getName();
		}
		if (element instanceof GenBase) {
			return getLabel(((GenBase) element).getEcoreModelElement());
		}
		if (element != null) {
			return element.eClass().getName();
		}
		return null;
	}

	/**
	 * Initializes this test class by loading the genmodel. All tests in this
	 * class are executed on the loaded genmodel, afterwards.
	 * 
	 * @throws Exception
	 *             In case an exception occurs to make the test fail.
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		URI uri = URI.createPlatformResourceURI(GENMODEL_PROJECT
				+ GENMODEL_PATH, true);
		assertNotNull(uri);

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

		// Find out absolute path of muml.model project
		StringBuffer absoluteProjectPath = new StringBuffer();
		absoluteProjectPath.append(new File("").getAbsoluteFile()
				.getParentFile());
		absoluteProjectPath.append('/');
		absoluteProjectPath.append(GENMODEL_PROJECT);
		// no idea why, but this is necessary two times :)
		absoluteProjectPath.append('/');
		absoluteProjectPath.append(GENMODEL_PROJECT);

		// Register platform mapping for muml.model project
		EcorePlugin.getPlatformResourceMap().put(GENMODEL_PROJECT,
				URI.createFileURI(absoluteProjectPath.toString()));

		// Load genmodel
		genmodel = resourceSet.getResource(uri, true);
		assertNotNull(genmodel);

		// Resolve all referenced models
		EcoreUtil.resolveAll(resourceSet);
	}

	/**
	 * Deinitializes this class by resetting the genmodel to <code>null</code>.
	 * 
	 * @throws Exception
	 *             In case an exception occurs to make the test fail.
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		genmodel = null;
	}

	/**
	 * Auxiliary method to get the root element of the genmodel (should be of
	 * type GenModel, which is tested in separate tests).
	 * 
	 * @return The root element, or
	 *         <code>null</null> if there is something wrong with the genmodel.
	 */
	private GenModel getRootElement() {
		EList<EObject> contents = genmodel.getContents();
		if (contents.size() == 1) {
			EObject root = contents.get(0);
			if (root instanceof GenModel) {
				return (GenModel) root;
			}
		}
		return null;
	}

	/**
	 * Tests, if the genmodel has contents.
	 */
	@Test
	public void notEmptyGenmodel() {
		EList<EObject> contents = genmodel.getContents();
		if (contents.isEmpty()) {
			fail("Genmodel is empty.");
		}
	}

	/**
	 * Tests, if the genmodel has a valid root element (of type GenModel).
	 */
	@Test
	public void validRootElement() {
		EList<EObject> contents = genmodel.getContents();
		if (contents.size() == 1 && !(contents.get(0) instanceof GenModel)) {
			fail("Genmodel Root element is no GenModel.");
		}
	}

	/**
	 * Tests, if the genmodel has only one root element.
	 */
	@Test
	public void singleGenmodelRoots() {
		EList<EObject> contents = genmodel.getContents();
		if (!contents.isEmpty() && contents.size() > 1) {
			fail("Genmodel has more than one root element.");
		}
	}

	/**
	 * Tests, if the 'Children' setting is set correctly.
	 */
	@Test
	public void validChildrenSetting() {
		traverse(getRootElement(), new IVisitor() {
			@Override
			public boolean visit(EObject element) {
				if (element instanceof GenFeature) {
					GenFeature genFeature = (GenFeature) element;
					EStructuralFeature ecoreFeature = genFeature
							.getEcoreFeature();
					if (ecoreFeature instanceof EReference) {
						EReference reference = (EReference) ecoreFeature;

						boolean children = reference.isContainment()
								&& !reference.isDerived();

						if (genFeature.isChildren() != children) {
							fail(getQualifiedLabel(genFeature)
									+ ": 'Children' must be set to "
									+ Boolean.valueOf(children).toString()
									+ ".");
						}
					}
				}
				return true;
			}

		});
	}

	/**
	 * Tests, if the 'Create Children' setting is set correctly.
	 */
	@Test
	public void validCreateChildrenSetting() {
		traverse(getRootElement(), new IVisitor() {
			@Override
			public boolean visit(EObject element) {
				if (element instanceof GenFeature) {
					GenFeature genFeature = (GenFeature) element;
					EStructuralFeature ecoreFeature = genFeature
							.getEcoreFeature();
					if (ecoreFeature instanceof EReference) {
						EReference reference = (EReference) ecoreFeature;

						boolean createChildren = reference.isContainment()
								&& !reference.isDerived();

						if (genFeature.isChildren() != createChildren) {
							fail(getQualifiedLabel(genFeature)
									+ ": 'Create Children' must be set to "
									+ Boolean.valueOf(createChildren)
											.toString() + ".");
						}
					}
				}
				return true;
			}

		});
	}

	/**
	 * Tests, if the 'Notify' setting is set correctly.
	 */
	@Test
	public void validNotifySetting() {
		traverse(getRootElement(), new IVisitor() {
			@Override
			public boolean visit(EObject element) {
				if (element instanceof GenFeature) {
					GenFeature genFeature = (GenFeature) element;
					EStructuralFeature ecoreFeature = genFeature
							.getEcoreFeature();
					if (ecoreFeature instanceof EReference) {
						EReference reference = (EReference) ecoreFeature;

						if (reference.isDerived() && !genFeature.isNotify()) {
							fail(getQualifiedLabel(genFeature)
									+ ": 'Notify' must be set to "
									+ Boolean.valueOf(true).toString() + ".");
						}
					}
				}
				return true;
			}

		});
	}

}
