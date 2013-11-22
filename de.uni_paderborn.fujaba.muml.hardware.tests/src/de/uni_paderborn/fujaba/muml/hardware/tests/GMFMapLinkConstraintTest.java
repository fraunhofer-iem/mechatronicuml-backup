package de.uni_paderborn.fujaba.muml.hardware.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.LinkConstraints;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.NodeMapping;
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

import de.uni_paderborn.fujaba.muml.hardware.HardwarePackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;

/**
 * Test the OCL Invariants in the gmfmap models It is based on the Subclass
 * should override the methods {@link #initGMFMapsToTest()} and
 * {@link #intEcoreModels()}
 * 
 * @author Andreas Dann
 */
public class GMFMapLinkConstraintTest {

	/**
	 * @param args
	 */

	private static OCL OCL_ENV = OCL
			.newInstance(EcoreEnvironmentFactory.INSTANCE);
	ProblemCollector oclErrors = new ProblemCollector();

	private List<String[]> gmfmap_projects = new ArrayList<String[]>();
	private List<String[]> projects = new ArrayList<String[]>();
	private HashMap<LinkMapping, Boolean> visitedLinkMapping;

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
	 * initializes the gmfmap-models which should be test Subclasses should
	 * override this method
	 */
	protected void initGMFMapsToTest() {
		gmfmap_projects.add(new String[] {
				"de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram",
				"/model/resourcetype.gmfmap" });
		gmfmap_projects
				.add(new String[] {
						"de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram",
						"/model/resourceinstance.gmfmap" });
		gmfmap_projects.add(new String[] {
				"de.uni_paderborn.fujaba.muml.hardware.platform.diagram",
				"/model/platform.gmfmap" });
		gmfmap_projects
				.add(new String[] {
						"de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram",
						"/model/platforminstance.gmfmap" });
		gmfmap_projects.add(new String[] {
				"de.uni_paderborn.fujaba.muml.component.diagram",
				"/model/component.gmfmap" });
		gmfmap_projects
				.add(new String[] {
						"de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram",
						"/model/componentinstanceconfiguration.gmfmap" });
		gmfmap_projects.add(new String[] {
				"de.uni_paderborn.fujaba.muml.realtimestatechart.diagram",
				"/model/realtimestatechart.gmfmap" });
		// gmfmap_projects.add(new String[] {
		// "de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram","/model/ComponentStoryDiagram.gmfmap"
		// });
		HardwarePackage.eINSTANCE.eClass();
	}

	/**
	 * initializes the ecore-model which are used by the gmfmap-models
	 * Subclasses should override this method
	 */
	protected void intEcoreModels() {
		projects.add(new String[] { "de.uni_paderborn.fujaba.muml.tests",
				"/model/Ecore.ecore" });
		projects.add(new String[] { "org.storydriven.core", "/model/core.ecore" });
		projects.add(new String[] { "org.storydriven.storydiagrams",
				"/model/storydiagrams.ecore" });
		projects.add(new String[] { "de.uni_paderborn.fujaba.muml",
				"/model/muml.ecore" });
		projects.add(new String[] {
				"de.uni_paderborn.fujaba.muml.actionlanguage",
				"/model/actionlanguage.ecore" });
		projects.add(new String[] {
				"de.uni_paderborn.fujaba.muml.reconfiguration",
				"/model/MumlReconfiguration.ecore" });
		projects.add(new String[] {
				"de.uni_paderborn.fujaba.muml.componentstorydiagram",
				"/model/ComponentStoryDiagram.ecore" });
		projects.add(new String[] { "de.uni_paderborn.fujaba.muml.hardware",
				"/model/hardware.ecore" });
	}

	/**
	 * Validates a linkMapping
	 * @param linkMapping the linkMapping that is tested
	 */
	public void validateLink(LinkMapping linkMapping) {
		if (visitedLinkMapping.containsKey(linkMapping)) {
			return;
		}
		visitedLinkMapping.put(linkMapping, true);
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
		visitedLinkMapping = new HashMap<LinkMapping, Boolean>();
		for (String[] path : gmfmap_projects) {
			try {
				mapping = (Mapping)GMFUtils.loadGmfModel(GMFMapPackage.eINSTANCE.getMapping(), path[0], path[1], projects);
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
	protected void validateLinkConstraint(EClass eClass,
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
