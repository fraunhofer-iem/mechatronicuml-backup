package org.muml.core.tests.gmf;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.ExpressionLabelMapping;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkConstraints;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.TopNodeReference;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.lpg.BasicEnvironment;
import org.eclipse.ocl.util.OCLUtil;
import org.junit.BeforeClass;
import org.junit.Test;
import org.muml.core.tests.resource.ProblemCollector;

/**
 * Test the OCL Invariants in the gmfmap models and the OCL Expression of the
 * ExpressionLabels in gmfmap models
 * 
 * Subclasses needs to override the methods {@link #initGMFMapsToTest()}.
 * 
 * @author Andreas Dann
 */
public abstract class GMFMapTest {

	protected static OCL OCL_ENV = OCL
			.newInstance(EcoreEnvironmentFactory.INSTANCE);
	protected ProblemCollector oclErrors = new ProblemCollector();
	
	public String gmfmap_project;
	
	public GMFMapTest(String gmfmap) {
		this.gmfmap_project = gmfmap;
	}
	
	protected HashMap<EObject, Boolean> visitedMapping;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Initialize OCL environment
		BasicEnvironment benv = OCLUtil.getAdapter(OCL_ENV.getEnvironment(),
				BasicEnvironment.class);

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
	}
	
	/**
	 * Validates a linkMapping
	 * 
	 * @param linkMapping
	 *            the linkMapping that is tested
	 */
	private void validateLink(LinkMapping linkMapping) {
		if (visitedMapping.containsKey(linkMapping)) {
			return;
		}
		visitedMapping.put(linkMapping, true);
		EClass domainClass = linkMapping.getDomainMetaElement();
		LinkConstraints linkConstraints = linkMapping.getCreationConstraints();
		String expression = "";
		if (linkConstraints != null) {
			if (linkConstraints.getSourceEnd() != null) {
				expression = linkConstraints.getSourceEnd().getBody();

				this.validateLinkConstraint(domainClass,
						linkMapping.getSourceMetaFeature(), true, linkMapping,
						expression);

			}
			if (linkConstraints.getTargetEnd() != null) {
				expression = linkConstraints.getTargetEnd().getBody();
				this.validateLinkConstraint(domainClass,
						linkMapping.getLinkMetaFeature(), false, linkMapping,
						expression);

			}

		}

	}

	/**
	 * Test all link constraints of all gmfmap-models which were intialized in
	 * {@link #initGMFMapsToTest()}
	 */
	@Test
	public void testLinkConstraints() {
		Mapping mapping = null;
//		this.intEcoreModels();
		visitedMapping = new HashMap<EObject, Boolean>();
		String path = gmfmap_project;
		try {
			mapping = (Mapping) GMFUtils.loadGmfModel(GMFMapPackage.eINSTANCE.getMapping(), path);
			// mapping = GMFUtils.getGmfMap(path[0], path[1],
			// projects);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EList<LinkMapping> links = mapping.getLinks();
		for (LinkMapping link : links) {
			this.validateLink(link);
		}
		oclErrors.fail();

	}

	/**
	 * validates a LinkConstraint
	 * 
	 * @param eClass
	 * @param feature
	 * @param isSource
	 * @param linkMapping
	 * @param expression
	 */
	private void validateLinkConstraint(EClass eClass,
			EStructuralFeature feature, boolean isSource,
			LinkMapping linkMapping, String expression) {
		OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = OCL_ENV
				.createOCLHelper();
		helper.setValidating(true);
		helper.setContext(linkMapping.getCreationConstraints().eClass());
		expression = expression.replaceAll("oppositeEnd",
				"linkMapping.linkMetaFeature.eType");

		/*
		 * if(!isSource){ expression=expression.replaceAll("self",
		 * "self.linkMapping.linkMetaFeature.eGenericType"); } else{
		 * expression=expression.replaceAll("self",
		 * "linkMapping.sourceMetaFeature.eGenericType"); }
		 */

		try {
			helper.createInvariant(expression);
		} catch (ParserException e) {
			oclErrors.add("ERROR: "
					+ "in gmfmap: " + linkMapping.eResource().getURI() + ": "
					+ linkMapping.getDiagramLink().toString() + ":"
					+ expression + ": " + e.getLocalizedMessage());
		}

	}
	
	

	/**
	 * Validates a the ExpressionLabel for a NodeMapping
	 * 
	 * @param nodeMapping
	 *            the NodeMapping that contains the ExpressionLabels, that
	 *            should be tested
	 */
	private void validateNode(NodeMapping nodeMapping) {
		if (visitedMapping.containsKey(nodeMapping)) {
			return;
		}
		visitedMapping.put(nodeMapping, true);
		EClass domainClass = nodeMapping.getDomainMetaElement();
		EList<LabelMapping> labelMappings = nodeMapping.getLabelMappings();
		for (LabelMapping labelMapping : labelMappings) {
			if (labelMapping instanceof ExpressionLabelMapping) {
				String expression = ((ExpressionLabelMapping) labelMapping)
						.getViewExpression().getBody();

				this.validateLabelExpression(labelMapping, domainClass,
						expression);

			}
		}
		EList<ChildReference> childs = nodeMapping.getChildren();
		for (ChildReference child : childs) {
			validateNode(child.getChild());
		}

	}

	/**
	 * Test all ExpressionLabels of all gmfmap-models which were intialized in
	 * {@link #initGMFMapsToTest()}
	 */
	@Test
	public void testExpressionLabels() {
		Mapping mapping = null;
		visitedMapping = new HashMap<EObject, Boolean>();
		String path = gmfmap_project;
		try {
			mapping = (Mapping) GMFUtils.loadGmfModel(
					GMFMapPackage.eINSTANCE.getMapping(), path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		EList<TopNodeReference> nodes = mapping.getNodes();
		for (TopNodeReference node : nodes) {
			this.validateNode(node.getOwnedChild());
		}
		oclErrors.fail();
	}

	private void validateLabelExpression(LabelMapping labelMapping,
			EClass eClass, String expression) {
		OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = OCL_ENV
				.createOCLHelper();
		helper.setValidating(true);
		helper.setContext(eClass);
		try {
			helper.createQuery(expression);
		} catch (ParserException e) {
			oclErrors.add("ERROR: "
					+ "in gmfmap: " + labelMapping.eResource().getURI() + ": "
					+ eClass.getEPackage().getName() + "." + eClass.getName()
					+ "." + expression + ": " + e.getLocalizedMessage());
		}
	}
	

}