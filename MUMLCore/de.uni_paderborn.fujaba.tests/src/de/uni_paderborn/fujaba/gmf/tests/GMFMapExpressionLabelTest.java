package de.uni_paderborn.fujaba.gmf.tests;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.ExpressionLabelMapping;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.TopNodeReference;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.helper.OCLHelper;
import org.junit.Test;

/**
 * Test the OCL Expression of the ExpressionLabels in gmfmap models. Subclass
 * needs to override the methods {@link #initGMFMapsToTest()} and
 * {@link #intEcoreModels()}
 * 
 * @author Andreas Dann
 */
public class GMFMapExpressionLabelTest extends GMFMapTest {

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
		this.initGMFMapsToTest();
		this.intEcoreModels();
		visitedMapping = new HashMap<EObject, Boolean>();
		for (String[] path : gmfmap_projects) {
			try {
				mapping = (Mapping) GMFUtils.loadGmfModel(
						GMFMapPackage.eINSTANCE.getMapping(), path[0], path[1],
						ecore_projects);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			EList<TopNodeReference> nodes = mapping.getNodes();
			for (TopNodeReference node : nodes) {
				this.validateNode(node.getOwnedChild());
			}
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
			GMFMapExpressionLabelTest.this.oclErrors.add("ERROR: "
					+ "in gmfmap: " + labelMapping.eResource().getURI() + ": "
					+ eClass.getEPackage().getName() + "." + eClass.getName()
					+ "." + expression + ": " + e.getLocalizedMessage());
		}
	}

}
