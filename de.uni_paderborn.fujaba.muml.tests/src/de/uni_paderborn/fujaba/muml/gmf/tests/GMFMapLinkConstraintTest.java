package de.uni_paderborn.fujaba.muml.gmf.tests;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LinkConstraints;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.helper.OCLHelper;
import org.junit.Test;

/**
 * Test the OCL Invariants in the gmfmap models.
 *  Subclass needs to override the methods {@link #initGMFMapsToTest()} and
 * {@link #intEcoreModels()}
 * 
 * @author Andreas Dann
 */
public class GMFMapLinkConstraintTest extends GMFMapTest{

	
	
	

	/**
	 * Validates a linkMapping
	 * @param linkMapping the linkMapping that is tested
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
		this.initGMFMapsToTest();
		this.intEcoreModels();
		visitedMapping = new HashMap<EObject, Boolean>();
		for (String[] path : gmfmap_projects) {
			try {
				mapping = (Mapping)GMFUtils.loadGmfModel(GMFMapPackage.eINSTANCE.getMapping(), path[0], path[1], ecore_projects);
				//mapping = GMFUtils.getGmfMap(path[0], path[1],
					//	projects);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			EList<LinkMapping> links = mapping.getLinks();
			for (LinkMapping link : links) {
				this.validateLink(link);
			}
		}
		oclErrors.fail();

	}

	/**
	 * validates a LinkConstraint
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
		
		 /* if(!isSource){ expression=expression.replaceAll("self",
		  "self.linkMapping.linkMetaFeature.eGenericType"); }
		  else{
		  expression=expression.replaceAll("self",
		  "linkMapping.sourceMetaFeature.eGenericType"); } */
		 

		try {
			helper.createInvariant(expression);
		} catch (ParserException e) {
			GMFMapLinkConstraintTest.this.oclErrors.add("ERROR: "
					+ linkMapping.getDiagramLink().toString()+ ":"+
				//	+ linkMapping.getDomainMetaElement().toString()+
					 expression + ": " + e.getLocalizedMessage());
		}

	}

}
