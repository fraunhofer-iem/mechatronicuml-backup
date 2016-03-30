package org.muml.core.tests;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPropertyKind;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.muml.core.tests.resource.ILabelProvider;
import org.muml.core.tests.resource.IResourceVisitor;
import org.muml.core.tests.resource.ProblemCollector;
import org.muml.core.tests.resource.QualifiedLabelProvider;

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
public abstract class GenmodelTest extends TraverseTest {

	private Resource genmodelResource;
	
	public GenmodelTest(String genmodelPath) throws IOException {
		genmodelResource = TestUtilities.loadResource(new ResourceSetImpl(), genmodelPath);
	}
	
	
	private static ILabelProvider defaultLabelProvider = new ILabelProvider() {

		/**
		 * Gets a label for the given element (e.g. by getting its name).
		 * 
		 * @param element
		 *            The element to get a label for
		 * @return The label
		 */
		@Override
		public String getLabel(EObject element) {
			if (element instanceof ENamedElement) {
				return ((ENamedElement) element).getName();
			}
			if (element instanceof GenBase) {
				return getLabel(((GenBase) element).getEcoreModelElement());
			}
			if (element != null) {
				return element.eClass().getName();
			}
			return "null";
		}
	};

	protected static ILabelProvider qualifiedLabelProvider = new QualifiedLabelProvider(defaultLabelProvider);


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		setLabelProvider(qualifiedLabelProvider);
	}

	/**
	 * Deinitializes this class by resetting the genmodel to <code>null</code>.
	 * 
	 * @throws Exception
	 *             In case an exception occurs to make the test fail.
	 */
	@After
	public void tearDownAfterClass() throws Exception {
		if (RepairingState.REPAIRING) {
			genmodelResource.save(Collections.emptyMap());
		}
	}

	/**
	 * Auxiliary method to get the root element of the genmodel (should be of
	 * type GenModel, which is tested in separate tests).
	 * 
	 * @return The root element, or
	 *         <code>null</null> if there is something wrong with the genmodel.
	 */
	private GenModel getRootElement() {
		EList<EObject> contents = genmodelResource.getContents();
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
		EList<EObject> contents = genmodelResource.getContents();
		if (contents.isEmpty()) {
			fail("Genmodel is empty.");
		}
	}

	/**
	 * Tests, if the genmodel has a valid root element (of type GenModel).
	 */
	@Test
	public void validRootElement() {
		EList<EObject> contents = genmodelResource.getContents();
		if (contents.size() == 1 && !(contents.get(0) instanceof GenModel)) {
			fail("Genmodel Root element is no GenModel.");
		}
	}

	/**
	 * Tests, if the genmodel has only one root element.
	 */
	@Test
	public void singleRootElement() {
		EList<EObject> contents = genmodelResource.getContents();
		if (contents.size() != 1) {
			fail("Genmodel has not exactly one root element.");
		}
	}

	/**
	 * Tests, if the 'Children' setting is set correctly.
	 */
	@Test
	public void validChildrenSetting() {
		final ProblemCollector problems = new ProblemCollector();
		accept(getRootElement(), new IResourceVisitor() {
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
							problems.add(getLabel(genFeature)
									+ ": 'Children' must be set to "
									+ Boolean.valueOf(children).toString()
									+ ".");
						}
					}
				}
				return true;
			}

		});
		problems.fail();
	}

	/**
	 * Tests, if the 'Create Child' setting is set correctly.
	 */
	@Test
	public void validCreateChildSetting() {
		final ProblemCollector problems = new ProblemCollector();
		accept(getRootElement(), new IResourceVisitor() {
			@Override
			public boolean visit(EObject element) {
				if (element instanceof GenFeature) {
					GenFeature genFeature = (GenFeature) element;
					EStructuralFeature ecoreFeature = genFeature
							.getEcoreFeature();
					if (ecoreFeature instanceof EReference) {
						EReference reference = (EReference) ecoreFeature;

						boolean createChild = reference.isContainment()
								&& !reference.isDerived();

						if (genFeature.isCreateChild() != createChild) {
							problems.add(getLabel(genFeature)
									+ ": 'Create Child' must be set to "
									+ Boolean.valueOf(createChild)
											.toString() + ".");
						}
					}
				}
				return true;
			}

		});
		problems.fail();
	}

	/**
	 * Tests, if the 'Notify' setting is set correctly.
	 */
	@Test
	public void validNotifySetting() {
		final ProblemCollector problems = new ProblemCollector();
		accept(getRootElement(), new IResourceVisitor() {
			@Override
			public boolean visit(EObject element) {
				if (element instanceof GenFeature) {
					GenFeature genFeature = (GenFeature) element;
					EStructuralFeature ecoreFeature = genFeature
							.getEcoreFeature();
					if (ecoreFeature instanceof EReference) {
						EReference reference = (EReference) ecoreFeature;

						if (reference.isDerived() && !genFeature.isNotify()) {
							problems.add(getLabel(genFeature)
									+ ": 'Notify' must be set to "
									+ Boolean.valueOf(true).toString() + ".");
						}
					}
				}
				return true;
			}

		});
		problems.fail();
	}
	
	/**
	 * Tests, if the 'PropertyType' setting is set correctly.
	 */
	@Test
	public void validPropertyTypeSetting() throws IOException {
		final ProblemCollector problems = new ProblemCollector();
		accept(getRootElement(), new IResourceVisitor() {
			@Override
			public boolean visit(EObject element) {
				if (element instanceof GenFeature) {
					GenFeature genFeature = (GenFeature) element;
					
					if (genFeature.isDerived() && genFeature.getProperty() == GenPropertyKind.EDITABLE_LITERAL) {
						
						if (RepairingState.REPAIRING) {
							genFeature.setProperty(GenPropertyKind.READONLY_LITERAL);
						} else {
							problems.add(getLabel(genFeature)
									+ ": derive = true AND 'PropertyType' is set to EDITABLE.");
						}
					}
					
					if (!genFeature.isDerived() && genFeature.getProperty() != GenPropertyKind.EDITABLE_LITERAL) {
					
						if (RepairingState.REPAIRING) {
							genFeature.setProperty(GenPropertyKind.EDITABLE_LITERAL);
						} else {
							
							//Feature is a reference to its partent
							// its opposite is a containment, and thus it makes no sense to set it editable
							if(genFeature.isReferenceType() ){
								EReference reference = ((EReference) genFeature.getEcoreFeature());
								if(reference.getEOpposite()!=null && reference.getEOpposite().isContainment())
									return true;
							}
							
							problems.add(getLabel(genFeature)
									+ ": derive = false means that 'PropertyType' must be EDITABLE.");
							
						}
					}
				}
				return true;
			}

		});
		problems.fail();
	}


}
