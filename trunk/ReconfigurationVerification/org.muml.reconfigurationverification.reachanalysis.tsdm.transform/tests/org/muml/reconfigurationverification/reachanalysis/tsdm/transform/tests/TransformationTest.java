package org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.junit.Before;
import org.junit.Test;
import org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.TsdmhelperPackage;
import org.muml.reconfigurationverification.timedstorydiagram.TimedActivityNode;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityFinalNode;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.EdgeGuard;
import org.muml.storydiagram.activities.InitialNode;
import org.muml.storydiagram.activities.StoryNode;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.BindingOperator;
import org.muml.storydiagram.patterns.ObjectVariable;
import org.muml.storydiagram.patterns.StoryPattern;


public abstract class TransformationTest {

	private static final String TRANSFORMATION_PATH = "/org.muml.reconfigurationverification.reachanalysis.tsdm.transform/transforms/forEachTransformation.qvto";
	
	protected TimedGraphTransformationSystem tgts;

	private Collection<? extends EClass> classesOfUnchangeableNodes;

	@Before
	public void setUp() throws Exception
	{
		EcorePackage.eINSTANCE.eClass();
		TimedstorydiagramPackage.eINSTANCE.eClass();
		TsdmhelperPackage.eINSTANCE.eClass();

		load(getRuleName());
		// check if model was loaded
		if(tgts == null)
			throw new Exception("Failed to load testRule1.timedstorydiagram");
		if(!(tgts instanceof TimedGraphTransformationSystem))
			throw new Exception(tgts + " is not a TimedGraphTransformationSystem.");
	}

	protected abstract String getRuleName();

	@Test
	public abstract void test();
	
	protected void load(String modelName) throws IOException {

		ResourceSet rs = new ResourceSetImpl();
		
		String modelFolder = "/org.muml.reconfigurationverification.reachanalysis.tsdm.transform/tests/";
		Resource r = rs.createResource(URI.createPlatformPluginURI(
				modelFolder + modelName, true));

		r.load(Collections.EMPTY_MAP);

		tgts = (TimedGraphTransformationSystem) r.getContents().get(0);
	}	
	
	/**
	 * Transforms the inputs for the reachability computation such that they can be
	 * used by the reachability computation.
	 * @param inputStoryDiagram
	 * @return
	 */
	protected TimedGraphTransformationSystem createForEachRules(TimedGraphTransformationSystem inputTimedGTS) {
	
		// create URI for the transformation file
		URI transformationURI = URI
				.createPlatformPluginURI(
						TRANSFORMATION_PATH,
						true);
		// create executor and execution context
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();
		
		context.setConfigProperty("generateMatchingEntries",Boolean.TRUE); 

		inputTimedGTS.getUnchangeableNodes().addAll(getClassesOfUnchangeableNodes());


		List<TimedGraphTransformationSystem> inObjects = Arrays.asList(inputTimedGTS);
	
		// create input extend containing the TimedGraphTransformationSystem
		// create empty output extend
		ModelExtent input = new BasicModelExtent(inObjects);
		ModelExtent output = new BasicModelExtent();
	
		// execute transformation
		ExecutionDiagnostic result = executor.execute(context, input,output);
		if (result.getSeverity() != ExecutionDiagnostic.OK){
			String message = "QVT-O ERROR on rule transformation. Message was: "+ System.getProperty("line.separator") + result.getMessage();
			System.out.println(message);
			fail(message);
		}
		
		TimedGraphTransformationSystem forEachGTS = null;

		//get the resulting timed GTS
		for(EObject curObject : output.getContents()){
			if (curObject instanceof TimedGraphTransformationSystem){
				forEachGTS = (TimedGraphTransformationSystem) curObject;
			}
		}
		
		return forEachGTS;

	}

	public Collection<? extends EClass> getClassesOfUnchangeableNodes() {
		return classesOfUnchangeableNodes;
	}

	public void setClassesOfUnchangeableNodes(
			Collection<? extends EClass> classesOfUnchangeableNodes) {
		this.classesOfUnchangeableNodes = classesOfUnchangeableNodes;
	}
	
	/**
	 * checks if the structure, reachable from the given ActivityNode,
	 * corresponds to one transformed (empty) ActivityNode
	 * @param node an ActivityNode with exactly one outgoing edge
	 */
	protected ActivityNode checkOneNodeTransformed(ActivityNode node) {
		assertTrue(node.getOutgoings().size() == 1);
		ActivityEdge edge = node.getOutgoings().get(0);
		
		// get first node; has to be a ForEach node
		ActivityNode forEachNode = edge.getTarget();
		assertTrue( ((StoryNode) forEachNode).isForEach() );

		// ForEach node has exactly one edge labeled
		// with an EACH_TIME guard, 
		// and one labeled with an END guard
		ActivityEdge eachTimeEdge = null;
		ActivityEdge endEdge = null;
		for(ActivityEdge forEachEdge : forEachNode.getOutgoings())
		{
			if(eachTimeEdge == null && forEachEdge.getGuard() == EdgeGuard.EACH_TIME)
			{
				eachTimeEdge = forEachEdge;
			}
			else if (endEdge == null && forEachEdge.getGuard() == EdgeGuard.END)
			{
				endEdge = forEachEdge;
			}
			else
				fail("ForEach node has outgoing edge with guard " + forEachEdge.getGuard());
		}
		
		assertTrue(eachTimeEdge != null);
		if(node instanceof InitialNode)
		{
			assertTrue(endEdge != null);
			
			// check final node
			ActivityNode finalNode = endEdge.getTarget();
			assertTrue(finalNode instanceof ActivityFinalNode);
			
		}

		// check copyNode
		ActivityNode copyNode = eachTimeEdge.getTarget();
		assertTrue(copyNode.getName().contains("copyNode"));
		
		edge = copyNode.getOutgoings().get(0);
		
		// check afterCopyNode
		ActivityNode afterCopyNode = edge.getTarget();
		assertTrue(afterCopyNode.getName().contains("boundResultNode"));
		
		edge = afterCopyNode.getOutgoings().get(0);
		
		// check restoreMatching
		ActivityNode restoreMatchingNode = edge.getTarget();
		assertTrue(restoreMatchingNode.getName().contains("restoreMatching"));
				
		return restoreMatchingNode;
	}
	
	protected void checkTransformationOfObjectVariables(ActivityNode forEachNode) {
		StoryPattern storyPattern = ((TimedActivityNode) forEachNode).getOwnedRule();
		
		boolean stepGraphFound = false;
		boolean sdmTransitionFound = false;
		for(AbstractVariable variable  : storyPattern.getVariables())
		{
			if (variable instanceof ObjectVariable)
			{
				BindingOperator operator = ((ObjectVariable) variable).getBindingOperator();
				EClassifier classifier = variable.getClassifier();
				if(classifier.getName().equals("StepGraph"))
				{
					stepGraphFound = true;
					ObjectVariable stepGraphVariable = (ObjectVariable) variable;
					// stepGraph has binding operatore CHECK_ONlY
					assertTrue(operator == BindingOperator.CHECK_ONLY);
					
					for(AbstractLinkVariable linkVariable :stepGraphVariable.getOutgoingLinks())
					{
						assertTrue(linkVariable.getTarget().getName().equals("comp"));
					}
				}
				else if (classifier.getName().equals("GtAutomatonTransition"))
				{
					sdmTransitionFound = true;
					assertTrue(operator == BindingOperator.CREATE);
				}
				else if (classifier.getName().equals("MatchingEntry"))
				{
					assertTrue(operator == BindingOperator.CREATE);
				}
				else if (classifier.getName().equals("Port"))
				{
					checkPortObject(variable);
				}
				else
				{
					assertTrue(operator == BindingOperator.CHECK_ONLY);
				}
			}
			else
			{
				fail(variable + " is not an ObjectVariable.");
			}
			
			
			
			
		}
		
		assertTrue(stepGraphFound);
		assertTrue(sdmTransitionFound);
		
		ActivityNode copyNode = forEachNode.getOutgoings().get(0).getTarget();
		
		// check content of boundResultNode
		TimedActivityNode boundResultNode = (TimedActivityNode) copyNode.getOutgoings().get(0).getTarget();
		
		for(AbstractVariable var : boundResultNode.getOwnedRule().getVariables())
		{
			ObjectVariable objVar = ((ObjectVariable)var);
			
			if(objVar.getName().equals("reachGraph"))
			{
				assertTrue(objVar.getOutgoingLinks().isEmpty());
			}
			else 
			{
				assertFalse(objVar.getOutgoingLinks().isEmpty());
				for(AbstractLinkVariable link : objVar.getOutgoingLinks())
				{
					
					if(objVar.getName().equals("result"))
					{
						// result --- <<CREATE>> ---> succ
						assertTrue(link.getBindingOperator() == BindingOperator.CREATE);
						assertTrue(link.getTarget().getName().equals("succ"));
					}
					else if(objVar.getName().equals("succ"))
					{
						// succ --- <<CREATE>> ---> reachGraph
						assertTrue(link.getBindingOperator() == BindingOperator.CREATE);
						assertTrue(link.getTarget().getName().equals("reachGraph"));
					}
					else if (objVar.getName().equals("trans") )
					{
						// trans --- <<CHECK_ONLY>> ---> succ
						assertTrue(link.getBindingOperator() == BindingOperator.CHECK_ONLY);
						assertTrue(link.getTarget().getName().equals("succ"));
					}
					else if (objVar.getName().equals("step"))
					{
						// step --- <<CHECK_ONLY>> ---> reachGraph
						assertTrue(link.getBindingOperator() == BindingOperator.CHECK_ONLY);
						assertTrue(link.getTarget().getName().equals("reachGraph"));
					}
					else 
						fail("Unexpected ObjectVariable with name: " + objVar.getName());
				}
			}
		}

		// check contents of restoreMatchingNode
		TimedActivityNode restoreMatchingNode = (TimedActivityNode) boundResultNode.getOutgoings().get(0).getTarget();
		checkRestoreMatchingNodeContents(restoreMatchingNode);
	}

	protected abstract void checkRestoreMatchingNodeContents(
			TimedActivityNode restoreMatchingNode);

	protected abstract void checkPortObject(AbstractVariable port);

}
