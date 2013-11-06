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
import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.ExpressionLabelMapping;
import org.eclipse.gmf.mappings.LabelMapping;
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

import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;


/**
 * Test the OCL Invariants in the gmfmap models
 * It is based on the MetamodelOCLTest  {@link de.uni_paderborn.fujaba.muml.tests.MetamodelOCLTest MetamodelOCLTest} of the de.uni_paderborn.fujaba.muml.tests package
 * @author Andreas Dann
 */
public class ExpressionLabelGMFMapTest {

	/**
	 * @param args
	 */

	private static OCL OCL_ENV = OCL
			.newInstance(EcoreEnvironmentFactory.INSTANCE);
	ProblemCollector oclErrors=new ProblemCollector();
	
	private List<String[]>  gmfmap_projects = new ArrayList<String[]>();
	private List<String[]>  projects = new ArrayList<String[]>();

	//nodeMappings that have already been tested
	private HashMap<NodeMapping, Boolean> visitedNodeMapping; 

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
	
	protected void initGMFMapsToTest(){
	//	gmfmap_projects.add(new String[] { "de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram","/model/resourcetype.gmfmap" });
	//	gmfmap_projects.add(new String[] { "de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram","/model/resourceinstance.gmfmap" });
	//	gmfmap_projects.add(new String[] { "de.uni_paderborn.fujaba.muml.hardware.platform.diagram","/model/platform.gmfmap" });
	//	gmfmap_projects.add(new String[] { "de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram","/model/platforminstance.gmfmap" });
	//	gmfmap_projects.add(new String[] { "de.uni_paderborn.fujaba.muml.component.diagram","/model/component.gmfmap" });
	//	gmfmap_projects.add(new String[] { "de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram","/model/componentinstanceconfiguration.gmfmap" });
	//	gmfmap_projects.add(new String[] { "de.uni_paderborn.fujaba.muml.realtimestatechart.diagram","/model/realtimestatechart.gmfmap" });
	//	gmfmap_projects.add(new String[] { "de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram","/model/ComponentStoryDiagram.gmfmap" });

	}
	
	protected void intEcoreModels(){
		projects.add(new String[] { "de.uni_paderborn.fujaba.muml.tests", "/model/Ecore.ecore" });
		projects.add(new String[] { "org.storydriven.core", "/model/core.ecore" });
		projects.add(new String[] { "org.storydriven.storydiagrams",
				"/model/storydiagrams.ecore" });
		projects.add(new String[] { "de.uni_paderborn.fujaba.muml", "/model/muml.ecore" });
		projects.add(new String[] { "de.uni_paderborn.fujaba.muml.actionlanguage",
				"/model/actionlanguage.ecore" });
		projects.add(new String[] { "de.uni_paderborn.fujaba.muml.reconfiguration",
				"/model/MumlReconfiguration.ecore" });
		projects.add(new String[] { "de.uni_paderborn.fujaba.muml.componentstorydiagram",
				"/model/ComponentStoryDiagram.ecore" });
		projects.add(new String[] {"de.uni_paderborn.fujaba.muml.hardware","/model/hardware.ecore"});
	}
	
	public void validateNode(NodeMapping nodeMapping){
		if(visitedNodeMapping.containsKey(nodeMapping)){
			return;
		}
		visitedNodeMapping.put(nodeMapping, true);
		EClass domainClass= nodeMapping.getDomainMetaElement();
		EList<LabelMapping> labelMappings=nodeMapping.getLabelMappings();
		for(LabelMapping labelMapping: labelMappings){
			if(labelMapping instanceof ExpressionLabelMapping){
				String expression = ((ExpressionLabelMapping) labelMapping).getViewExpression().getBody();
				try {
					this.validateLabelExpression(domainClass,expression);
				} catch (ParserException e) {
					ExpressionLabelGMFMapTest.this.oclErrors.add("ERROR: "
							+ domainClass.getEPackage().getName() + "."
							+ domainClass.getName() + "."
							+ expression + ": "
							+ e.getLocalizedMessage());
				}
			}
		}
		EList<ChildReference> childs=nodeMapping.getChildren();
		for(ChildReference child:childs){
			validateNode(child.getChild());
		}
		
	}

	@Test
	public void testExpressionLabels() {
		Mapping mapping=null;
		this.initGMFMapsToTest();
		this.intEcoreModels();
		visitedNodeMapping=new HashMap<NodeMapping, Boolean>();
		for (String[] path : gmfmap_projects) {
		try {
			mapping=GMFEditorUtil.getGmfMapModel(path[0], path[1],projects);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EList<TopNodeReference> nodes=mapping.getNodes();
		for(TopNodeReference node: nodes){
			this.validateNode(node.getOwnedChild());
		}
		}
		oclErrors.fail();
	}


	
	protected void validateLabelExpression(EClass eClass, String expression)
			throws ParserException {
		OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = OCL_ENV.createOCLHelper();
		helper.setValidating(true);
		helper.setContext(eClass);
		helper.createQuery(expression);
	}

}
