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

public class GenmodelTest {

	public static final String GENMODEL_PROJECT = "de.uni_paderborn.fujaba.muml.model";
	public static final String GENMODEL_PATH = "/model/muml.genmodel";

	private static Resource genmodel;

	private void traverse(EObject element, IVisitor visitor) {
		if (visitor.visit(element)) {
			for (EObject child : element.eContents()) {
				traverse(child, visitor);
			}
		}
	}

	private interface IVisitor {
		boolean visit(EObject element);
	}

	private String getHierarchicalLabelFor(EObject element) {

		StringBuffer buffer = new StringBuffer();

		while (element != null) {
			String label = getLabelFor(element);
			if (label != null) {
				buffer.insert(0, '.');
				buffer.insert(0, label);
			}

			element = element.eContainer();
		}

		return buffer.toString();
	}

	private String getLabelFor(EObject element) {
		if (element instanceof ENamedElement) {
			return ((ENamedElement) element).getName();
		}
		if (element instanceof GenBase) {
			return getLabelFor(((GenBase) element).getEcoreModelElement());
		}
		if (element != null) {
			return element.eClass().getName();
		}
		return null;
	}

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

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		genmodel = null;
	}

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

	@Test
	public void notEmptyGenmodel() {
		EList<EObject> contents = genmodel.getContents();
		if (contents.isEmpty()) {
			fail("Genmodel is empty.");
		}
	}

	@Test
	public void validRootElement() {
		EList<EObject> contents = genmodel.getContents();
		if (contents.size() == 1 && !(contents.get(0) instanceof GenModel)) {
			fail("Genmodel Root element is no GenModel.");
		}
	}

	@Test
	public void singleGenmodelRoots() {
		EList<EObject> contents = genmodel.getContents();
		if (!contents.isEmpty() && contents.size() > 1) {
			fail("Genmodel has more than one root element.");
		}
	}

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
							fail(getHierarchicalLabelFor(genFeature)
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
							fail(getHierarchicalLabelFor(genFeature)
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
							fail(getHierarchicalLabelFor(genFeature)
									+ ": 'Notify' must be set to "
									+ Boolean.valueOf(true).toString() + ".");
						}
					}
				}
				return true;
			}

		});
	}

	@Test
	public void validNotifySettings() {
		traverse(getRootElement(), new IVisitor() {
			@Override
			public boolean visit(EObject element) {
				return true;
			}
		});
	}

}
