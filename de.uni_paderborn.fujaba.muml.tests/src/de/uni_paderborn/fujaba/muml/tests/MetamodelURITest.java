package de.uni_paderborn.fujaba.muml.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.SemanticException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.lpg.BasicEnvironment;
import org.eclipse.ocl.lpg.ProblemHandler;
import org.eclipse.ocl.options.ProblemOption;
import org.eclipse.ocl.util.OCLUtil;
import org.junit.BeforeClass;
import org.junit.Test;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.tests.resource.IResourceVisitor;
import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;

/**
 * This test checks the meta model for invalid OCL.
 * 
 * @author bingo
 * 
 */
public class MetamodelURITest extends TraverseTest {

	private static List<EPackage> packages = new ArrayList<EPackage>();

	private static OCL OCL_ENV = OCL
			.newInstance(EcoreEnvironmentFactory.INSTANCE);

	/**
	 * Initializes this test class by loading the ecore model. All tests in this
	 * class are executed on the loaded ecore model, afterwards.
	 * 
	 * @throws Exception
	 *             In case an exception occurs to make the test fail.
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Initialize OCL environment
		BasicEnvironment benv = OCLUtil.getAdapter(OCL_ENV.getEnvironment(),
				BasicEnvironment.class);
		// Do not show warning for closure iterator (we currently display
		// warnings as errors)
		benv.setOption(ProblemOption.CLOSURE_ITERATOR,
				ProblemHandler.Severity.OK);
		
		// initialize OCL in ecore
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE
				.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
						new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				new OCLValidationDelegateFactory.Global());

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

		//Resource coreModel = TestUtilities.loadResource(resourceSet,
		//		"org.storydriven.core", "/model/core.ecore");

		
		Resource mumlModel = TestUtilities.loadResource(resourceSet,
				"de.uni_paderborn.fujaba.muml", "/model/muml.ecore");


		
		EcoreUtil.resolveAll(resourceSet);
		EPackage muml = (EPackage) mumlModel.getContents().get(0);
		packages.add(muml);

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
	
	@Test
	public void validOclConstraints() {
		
		final ProblemCollector problems = new ProblemCollector();

		for (EPackage p : packages) {
			accept(p, new IResourceVisitor() {
				@Override
				public boolean visit(EObject element) {
					if (element instanceof EReference) {
						EReference reference = (EReference) element;
						// TODO: How to find invalid references?
						
					} else if (element instanceof EAttribute) {
						EAttribute attribute = (EAttribute) element;
						EDataType dataType = attribute.getEAttributeType();
						
						EPackage ePackage = dataType.getEPackage();
						if (EcorePackage.eINSTANCE.getNsURI().equals(ePackage.getNsURI()) && ePackage != EcorePackage.eINSTANCE) {
							problems.add("nsURI: Attribute " + attribute.getEContainingClass().getEPackage().getName() + "." + attribute.getEContainingClass().getName() + "."
									+ attribute.getName() + " uses wrong datatype!");
						}
					}
					return true;
				}
			});
		}
		problems.fail();
	}


}
