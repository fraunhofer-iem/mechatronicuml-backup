package org.muml.reconfigurationverification.reachanalysis.gtautomaton.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.junit.Before;
import org.junit.Test;
import org.muml.core.reachanalysis.core.ReachabilityComputation;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.mumlcore.NamedElement;
import org.muml.mumlcore.expressions.common.ComparingOperator;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonTransition;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonFactory;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.LabelingPackage;
import org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.TsdmhelperPackage;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstance;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.InvariantStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramFactory;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;
import org.muml.storydiagram.StorydiagramPackage;

public class TestRuleApplications {
	
	private static final String TRANSFORMATION_PATH = "/org.muml.reconfigurationverification.reachanalysis.tsdm.transform/transforms/forEachTransformation.qvto";
	
	// for debugging purposes
	private static final boolean SAVE_FOREACH_GTS = true;


	private TimedGraphTransformationSystem tgts = null;
	
	private TestGtAutomatonComputation reachComp = null;

	private Collection<? extends EClass> classesOfUnchangeableNodes;

	private TimedGraphTransformationSystem forEachTgts;

	private GtStepGraph graph;
	
	@Before
	public void setUp() throws IOException{
		EcorePackage.eINSTANCE.eClass();
		TimedstorydiagramPackage.eINSTANCE.eClass();
		TsdmhelperPackage.eINSTANCE.eClass();
		StorydiagramPackage.eINSTANCE.eClass();
		LabelingPackage.eINSTANCE.eClass();
		
		//load test model
		tgts = loadTimedGTS("RuleApplicationsTest.timedstorydiagram");
		
		// no unchangeable nodes
		this.setClassesOfUnchangeableNodes(new HashSet<EClass>());

		// automatic transformation of rules to forEach rules
		forEachTgts = createForEachRules(tgts);
	
		if(SAVE_FOREACH_GTS)
			saveTimedGTS(forEachTgts, "testModels/RuleApplicationsTest_ForEach.timedstorydiagram");
	}



	private void setUpReachComp(String name) {
		TimedGraphTransformationSystem timedGraphTransformationSystem = TimedstorydiagramFactory.eINSTANCE.createTimedGraphTransformationSystem();
		timedGraphTransformationSystem.getInitialGraphObjects().addAll(graph.getChangeableNodes());
		for(TimedStoryDiagram tsd : forEachTgts.getRules())
		{
			if(tsd.getName().equals(name+ "_forEach"))
			{
				timedGraphTransformationSystem.getRules().add(tsd);
				break;
			}
		}
		assertFalse(timedGraphTransformationSystem.getRules().isEmpty());
		reachComp = new TestGtAutomatonComputation(timedGraphTransformationSystem);
		reachComp.addToActivities(timedGraphTransformationSystem.getRules().get(0));
		reachComp.setStoreIndexMap(true);
		reachComp.setStoreMatching(true);
		ReachabilityComputation.setDEBUG(true);
	}
	
	private void setUpReachCompForInvariant(String name) {
		TimedGraphTransformationSystem timedGraphTransformationSystem = TimedstorydiagramFactory.eINSTANCE.createTimedGraphTransformationSystem();
		timedGraphTransformationSystem.getInitialGraphObjects().addAll(graph.getChangeableNodes());
		for(InvariantStoryDiagram tsd : forEachTgts.getInvariants())
		{
			if(tsd.getName().equals(name+ "_forEach"))
			{
				timedGraphTransformationSystem.getInvariants().add(tsd);
				break;
			}
		}
		assertFalse(timedGraphTransformationSystem.getInvariants().isEmpty());
		reachComp = new TestGtAutomatonComputation(timedGraphTransformationSystem);
		reachComp.addToInvariants(timedGraphTransformationSystem.getInvariants().get(0));
		reachComp.setStoreIndexMap(true);
		reachComp.setStoreMatching(true);
		ReachabilityComputation.setDEBUG(true);

	}
	
	private void setUpReachCompForClockInstanceRule(String name) {
		TimedGraphTransformationSystem timedGraphTransformationSystem = TimedstorydiagramFactory.eINSTANCE.createTimedGraphTransformationSystem();
		timedGraphTransformationSystem.getInitialGraphObjects().addAll(graph.getChangeableNodes());
		for(ClockInstanceStoryDiagram tsd : forEachTgts.getClockInstanceRules())
		{
			if(tsd.getName().equals(name+ "_forEach"))
			{
				timedGraphTransformationSystem.getClockInstanceRules().add(tsd);
				break;
			}
		}
		assertFalse(timedGraphTransformationSystem.getClockInstanceRules().isEmpty());
		reachComp = new TestGtAutomatonComputation(timedGraphTransformationSystem);
		reachComp.addToClockInstanceRules(timedGraphTransformationSystem.getClockInstanceRules().get(0));
		reachComp.setStoreIndexMap(true);
		reachComp.setStoreMatching(true);
		ReachabilityComputation.setDEBUG(true);
	}
	
	
	
	private void setUpGraph(boolean addClockInstances) {
		graph = GtautomatonFactory.eINSTANCE.createGtStepGraph();
		
		EClass class1 = EcoreFactory.eINSTANCE.createEClass();
		class1.setName("c1");		
	
		EOperation op1 = EcoreFactory.eINSTANCE.createEOperation();
		op1.setName("op1");
		class1.getEOperations().add(op1);
		
		EParameter param1 = EcoreFactory.eINSTANCE.createEParameter();
		param1.setName("param1");
		op1.getEParameters().add(param1);
	
		EClass class2 = EcoreFactory.eINSTANCE.createEClass();
		class2.setName("c2");
		
		EOperation op2 = EcoreFactory.eINSTANCE.createEOperation();
		op2.setName("op2");
		class2.getEOperations().add(op2);
		
		EParameter param2 = EcoreFactory.eINSTANCE.createEParameter();
		param2.setName("param2");
		op2.getEParameters().add(param2);
		
		ClockInstance ci1 = null;
		ClockInstance ci2 = null;
		
		if(addClockInstances)
		{

			ci1 = TimedstorydiagramFactory.eINSTANCE.createClockInstance();
			ci1.setName("ci1");
			ci1.setId("ci1");
			ci1.getHasNode().add(class1);

			ci2 = TimedstorydiagramFactory.eINSTANCE.createClockInstance();
			ci2.setName("ci2");
			ci2.setId("ci2");
			ci2.getHasNode().add(class2);

			graph.getChangeableNodes().add(ci1);
			graph.getClockInstances().add(ci1);

			graph.getChangeableNodes().add(ci2);
			graph.getClockInstances().add(ci2);

		}

		graph.getChangeableNodes().add(class1);
		graph.getChangeableNodes().add(op1);
		graph.getChangeableNodes().add(param1);

		graph.getChangeableNodes().add(class2);
		graph.getChangeableNodes().add(op2);
		graph.getChangeableNodes().add(param2);

		GtAutomaton gtAutomaton = GtautomatonFactory.eINSTANCE.createGtAutomaton();
		ObjectIdentifier objectIdentifier = GtautomatonFactory.eINSTANCE.createObjectIdentifier();		
		
		objectIdentifier.getIdentifierToEObject();
		objectIdentifier.getEObjectToIdentifier();
		
		objectIdentifier.putEObjectToIdentifier(class1, "c1");
		objectIdentifier.putIdentifierToEObject("c1", class1);
		objectIdentifier.putEObjectToIdentifier(op1, "op1");
		objectIdentifier.putIdentifierToEObject("op1", op1);
		objectIdentifier.putEObjectToIdentifier(param1, "param1");
		objectIdentifier.putIdentifierToEObject("param1", param1);

		
		objectIdentifier.putEObjectToIdentifier(class2, "c2");
		objectIdentifier.putIdentifierToEObject("c2", class2);
		objectIdentifier.putEObjectToIdentifier(op2, "op2");
		objectIdentifier.putIdentifierToEObject("op2", op2);
		objectIdentifier.putEObjectToIdentifier(param2, "param2");
		objectIdentifier.putIdentifierToEObject("param2", param2);

		
		if(addClockInstances)
		{
			objectIdentifier.putEObjectToIdentifier(ci1, "ci1");
			objectIdentifier.putIdentifierToEObject("ci1", ci1);
			
			objectIdentifier.putEObjectToIdentifier(ci2, "ci2");
			objectIdentifier.putIdentifierToEObject("ci2", ci2);
		}
		
		graph.setObjectIdentifier(objectIdentifier);

		graph.setReachabilityGraph(gtAutomaton);
		
	}



	public TimedGraphTransformationSystem loadTimedGTS(String modelName) throws IOException
	{
		ResourceSet rs = new ResourceSetImpl();

		Resource r = rs.createResource(URI.createPlatformPluginURI(getModelFolder() + modelName, true));

		r.load(Collections.EMPTY_MAP);

		TimedGraphTransformationSystem activity = (TimedGraphTransformationSystem) r.getContents().get(0);

		return activity;
	}
	
	public void saveTimedGTS(TimedGraphTransformationSystem tgts,String modelName) throws IOException
	{
	    ResourceSet rs = new ResourceSetImpl();    

	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;	    
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("timedstorydiagram", new XMIResourceFactoryImpl());

	    Resource r = rs.createResource(URI.createFileURI(modelName));
	   
	    r.getContents().add(tgts);

	    r.save(Collections.EMPTY_MAP);
	}

	protected String getModelFolder()
	{
		return "/org.muml.reconfigurationverification.reachanalysis.gtautomaton.test/testModels/";
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
	
	
	@Test
	public void rule1() {
		
		setUpGraph(true);
		
		setUpReachComp("rule1");
		
		HashSet<? extends ReachabilityGraphState> successors = reachComp.computeSuccessors(graph);
		
		assertTrue(successors.size() == 2);
		
		for(ReachabilityGraphState successor : successors)
		{
			GtStepGraph gtStepGraph = (GtStepGraph) successor;
			
			// check transition ...
			assertFalse(gtStepGraph.getIncomingTransitions().isEmpty());
			GtAutomatonTransition transition = (GtAutomatonTransition) gtStepGraph.getIncomingTransitions().get(0);
			// ... has matchings
			assertTrue(transition.getMatching().get("c") != null);
			assertTrue(transition.getMatching().get("o") != null);
			assertTrue(transition.getMatching().get("ci") != null);
			
			// ... has index entries
			for(Entry<EObject,EObject> entry : transition.getIndex())
			{
				assertTrue(entry.getKey().getClass() == entry.getValue().getClass());

				String sourceName = "";
				if(entry.getValue() instanceof NamedElement)
				{
					sourceName = ((NamedElement) entry.getKey()).getName();
					
					assertTrue(sourceName.equals(((NamedElement) entry.getValue()).getName()));
				}
				else if(entry.getValue() instanceof ENamedElement)
				{
					sourceName = ((ENamedElement) entry.getKey()).getName();
					
					assertTrue(sourceName.equals(((ENamedElement) entry.getValue()).getName()));
				}

				
				assertTrue(sourceName.equals("c1") 
						|| sourceName.equals("op1") 
						|| sourceName.equals("param1") 
						|| sourceName.equals("ci1")
						|| sourceName.equals("c2") 
						|| sourceName.equals("op2") 
						|| sourceName.equals("param2") 
						|| sourceName.equals("ci2") 
						);
			}
			// ... has a clock reset ci
			assertFalse(transition.getClockResets().isEmpty());
			String reset = transition.getClockResets().get(0);
			assertTrue(reset.equals("ci1") || reset.equals("ci2"));
			// ... has a clock constraint ci <= 100
			assertFalse(transition.getTimeGuards().isEmpty());
			GtAutomatonClockConstraint clockConstraint = transition.getTimeGuards().get(0);
			String clockInstanceIdentifier = clockConstraint.getClockInstanceIdentifier();
			assertTrue(clockInstanceIdentifier.equals("ci1") || clockInstanceIdentifier.equals("ci2"));
			assertTrue(clockConstraint.getOperator() == ComparingOperator.LESS_OR_EQUAL);
			assertTrue(clockConstraint.getValue() == 100);
			
		}
	}
	
	@Test
	public void rule2() {
		
		setUpGraph(true);
		
		setUpReachComp("rule2");
		
		HashSet<? extends ReachabilityGraphState> successors = reachComp.computeSuccessors(graph);
		
		assertTrue(successors.size() == 1);
		
		for(ReachabilityGraphState successor : successors)
		{
			GtStepGraph gtStepGraph = (GtStepGraph) successor;
			
			// check transition ...
			assertFalse(gtStepGraph.getIncomingTransitions().isEmpty());
			GtAutomatonTransition transition = (GtAutomatonTransition) gtStepGraph.getIncomingTransitions().get(0);
			// ... has matchings
			assertTrue(transition.getMatching().get("c") != null);
			assertTrue(transition.getMatching().get("o") != null);
			assertTrue(transition.getMatching().get("ci") != null);
			
			// ... has index entries
			for(Entry<EObject,EObject> entry : transition.getIndex())
			{
				assertTrue(entry.getKey().getClass() == entry.getValue().getClass());

				String sourceName = "";
				if(entry.getValue() instanceof NamedElement)
				{
					sourceName = ((NamedElement) entry.getKey()).getName();
					
					assertTrue(sourceName.equals(((NamedElement) entry.getValue()).getName()));
				}
				else if(entry.getValue() instanceof ENamedElement)
				{
					sourceName = ((ENamedElement) entry.getKey()).getName();
					
					assertTrue(sourceName.equals(((ENamedElement) entry.getValue()).getName()));
				}

				
				assertTrue(sourceName.equals("c1") 
						|| sourceName.equals("op1") 
						|| sourceName.equals("param1") 
						|| sourceName.equals("ci1")
						|| sourceName.equals("c2") 
						|| sourceName.equals("op2") 
						|| sourceName.equals("param2") 
						|| sourceName.equals("ci2") 
						);
			}
			
			// ... has a clock reset ci
			assertFalse(transition.getClockResets().isEmpty());
			String reset = transition.getClockResets().get(0);
			assertTrue(reset.equals("ci1") || reset.equals("ci2"));
			// ... has a clock constraint ci <= 100
			assertFalse(transition.getTimeGuards().isEmpty());
			GtAutomatonClockConstraint clockConstraint = transition.getTimeGuards().get(0);
			String clockInstanceIdentifier = clockConstraint.getClockInstanceIdentifier();
			assertTrue(clockInstanceIdentifier.equals("ci1") || clockInstanceIdentifier.equals("ci2"));
			assertTrue(clockConstraint.getOperator() == ComparingOperator.LESS_OR_EQUAL);
			assertTrue(clockConstraint.getValue() == 100);
	
		}
	}

	
	@Test
	public void rule3() {
		
		setUpGraph(true);
		
		setUpReachComp("rule3");
		
		HashSet<? extends ReachabilityGraphState> successors = reachComp.computeSuccessors(graph);
		
		assertTrue(successors.isEmpty());
	}
	
	@Test
	public void invariantRule()
	{
		setUpGraph(true);
		
		setUpReachCompForInvariant("invariant");
		
		reachComp.addInvariantsToState(graph);
		
		// Check Invariants
		assertTrue(graph.getInvariant().size() == 2);
		
		for(GtAutomatonClockConstraint inv : graph.getInvariant())
		{
			// one for each Clock Instance Identifier
			assertTrue(inv.getClockInstanceIdentifier().equals("ci1") 
					|| inv.getClockInstanceIdentifier().equals("ci2") );
			// and check the operator and the value
			assertTrue(inv.getOperator() == ComparingOperator.LESS_OR_EQUAL && inv.getValue() == 200);
		}
		
		
	}
	
	@Test
	public void clockInstanceRuleWithClockInstances()
	{
		setUpGraph(true);
		
		setUpReachCompForClockInstanceRule("clockInstanceRule");
		
		reachComp.addClockInstancesToState(graph);
		
		assertTrue(graph.getClockInstances().size() == 2);
		
		for(ClockInstance ci : graph.getClockInstances())
		{
			assertTrue(graph.getChangeableNodes().contains(ci));
			assertTrue(ci.getId() != null);
			assertTrue(ci.getName().equals("ci1") || ci.getName().equals("ci2"));
			
			assertTrue(graph.getObjectIdentifier().getIdentifierToEObject().get(ci.getId()) == ci);
		}
	}
	
	@Test
	public void clockInstanceRuleWithoutClockInstances()
	{
		setUpGraph(false);
		
		setUpReachCompForClockInstanceRule("clockInstanceRule");
		
		reachComp.addClockInstancesToState(graph);
		
		assertTrue(graph.getClockInstances().size() == 1);
		
		for(ClockInstance ci : graph.getClockInstances())
		{
			assertTrue(graph.getChangeableNodes().contains(ci));
			assertTrue(ci.getId() != null);
			assertFalse(ci.getId().equals(""));
			
			assertTrue(graph.getObjectIdentifier().getIdentifierToEObject().get(ci.getId()) == ci);
		}
	
	}
		
}
