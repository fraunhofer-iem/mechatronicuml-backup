package org.muml.storydiagram.reachanalysis.sdm.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.junit.Before;
import org.junit.Test;
import org.muml.mumlcore.expressions.ExpressionsFactory;
import org.muml.mumlcore.expressions.TextualExpression;
import org.muml.pim.component.ComponentFactory;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.instance.InstanceFactory;
import org.muml.pim.instance.InstancePackage;
import org.muml.storydiagram.activities.ActivitiesFactory;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityFinalNode;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.EdgeGuard;
import org.muml.storydiagram.activities.InitialNode;
import org.muml.storydiagram.activities.ModifyingStoryNode;
import org.muml.storydiagram.patterns.AttributeAssignment;
import org.muml.storydiagram.patterns.BindingOperator;
import org.muml.storydiagram.patterns.BindingSemantics;
import org.muml.storydiagram.patterns.Constraint;
import org.muml.storydiagram.patterns.LinkVariable;
import org.muml.storydiagram.patterns.ObjectVariable;
import org.muml.storydiagram.patterns.PatternsFactory;
import org.muml.storydiagram.patterns.StoryPattern;

/**
 * TODO: test cases for Cases 5, 6, 7
 * 
 * @author Braun Denis
 * 
 */
public class TestIdentifyUnchangeableNodes{

	/*
	 * The Classifiers of the muml component package used throughout the tests.
	 */
	private EClass atomicComponentEClass;
	private EClass staticAtomicComponentEClass;
	private EClass componentEClass;
	private EClass structuredComponentEClass;
	private EClass componentPartEClass;
	private EClass portEClass;
	private EClass discretePortEClass;
	private EClass connectorTypeEClass;
	private EClass assemblyEClass;
	private EClass delegationEClass;
	
	/*
	 * The Classifiers of the muml instance package used throughout the tests.
	 */
	private EClass componentInstanceConfigEClass;
	private EClass componentInstanceEClass;
	private EClass portInstanceEClass;
	private EClass discretePortInstanceEClass;
	private EClass discreteSinglePortInstanceEClass;
	private EClass discreteMultiPortInstanceEClass;
	private EClass connectorInstanceEClass;
	
	/*
	 * Used EReferences in the component package, the instance package and between both packages 
	 */
	private EReference compInstTypeOfComponent; //has no opposite reference
	private EReference portInstTypeOfPort; //has no opposite reference
	private EReference compHasPorts; //has opposite reference
	private EReference compInstPortInstances; //has opposite reference
	private EReference multiPortInstSubportInstances; //has opposite reference
	
	@Before
	public void setUp(){
		//component package
		ComponentPackage compPackage = ComponentPackage.eINSTANCE;
		atomicComponentEClass = compPackage.getAtomicComponent();
		staticAtomicComponentEClass = compPackage.getStaticAtomicComponent();
		structuredComponentEClass = compPackage.getStructuredComponent();
		componentEClass = compPackage.getComponent();
		componentPartEClass = compPackage.getComponentPart();
		portEClass = compPackage.getPort();
		discretePortEClass = compPackage.getDiscretePort();
		connectorTypeEClass = compPackage.getPortConnector();
		assemblyEClass = compPackage.getAssemblyConnector();
		delegationEClass = compPackage.getDelegationConnector();
		
		//component instance package
		InstancePackage instPackage = InstanceFactory.eINSTANCE.getInstancePackage();
		componentInstanceConfigEClass = instPackage.getComponentInstanceConfiguration();
		componentInstanceEClass = instPackage.getComponentInstance();
		portInstanceEClass = instPackage.getPortInstance();
		discretePortInstanceEClass = instPackage.getDiscretePortInstance();
		discreteSinglePortInstanceEClass = instPackage.getDiscreteSinglePortInstance();
		discreteMultiPortInstanceEClass = instPackage.getDiscreteMultiPortInstance();
		connectorInstanceEClass = instPackage.getPortConnectorInstance();
		
		//references
		compInstTypeOfComponent = instPackage.getComponentInstance_ComponentType();
		compInstPortInstances = instPackage.getComponentInstance_PortInstances();
		compHasPorts = compPackage.getComponent_Ports();
		multiPortInstSubportInstances = ConnectorPackage.eINSTANCE.getDiscreteMultiInteractionEndpointInstance_SubInteractionEndpointInstances();
		portInstTypeOfPort = instPackage.getPortInstance_PortType();
	}
	
	// ----------------------- Tests for method identifyClassesOfInitialGraphObjects -------------------------
	
	/**
	 * All input values are null
	 */
	@Test
	public void testIdentifyClassesOfInitialGraphObjectsNullInput(){
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		
		unNoId.identifyClassesOfInitialGraphObjects(null);
	}
	
	/**
	 * All Input set are empty, the activity diagram does not contain any activities. 
	 */
	@Test
	public void testIdentifyClassesOfInitialGraphObjectsEmptyInput(){
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		HashSet<EObject> initialGraphObjects = new HashSet<EObject>();
		
		unNoId.identifyClassesOfInitialGraphObjects(initialGraphObjects);
	}
	
	/**
	 * Test detection of classes of inserted objects
	 */
	@Test
	public void testIdentifyClassesOfInitialGraphObjects(){
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		HashSet<EObject> initialGraphObjects = new HashSet<EObject>();
		
		ComponentFactory factory = ComponentFactory.eINSTANCE;
		initialGraphObjects.add(factory.createStaticAtomicComponent());
		initialGraphObjects.add(factory.createAssemblyConnector());
		
		Set<EClass>result = unNoId.identifyClassesOfInitialGraphObjects(initialGraphObjects);
		
		assertTrue(result.contains(staticAtomicComponentEClass));
		assertTrue(result.contains(assemblyEClass));
		
	}
	
	//----------------------- Tests for method analyzeStoryDiagram -------------------------------------------
	
	/**
	 * All input values are null
	 */
	@Test
	public void testAnalyzeStoryDiagramNullInput(){
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		
		unNoId.analyzeStoryDiagram(null, null, null);
	}
	
	/**
	 * All Input set are empty, the activity diagram does not contain any activities. 
	 */
	@Test
	public void testAnalyzeStoryDiagramEmptyInput(){
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		Set<EClass> changeableClasses = new HashSet<EClass>();
		Set<EClass> usedObjectVariableClasses = new HashSet<EClass>();
		
		unNoId.analyzeStoryDiagram(createEmptyActivity("EmptyActivity"), changeableClasses, usedObjectVariableClasses);
		
		assertTrue(changeableClasses.isEmpty());
		assertTrue(usedObjectVariableClasses.isEmpty());
	}
	
	/**
	 * Tests Case 1 for unchangeable Nodes which is detected by the method analyzeStoryDiagram:
	 * 
	 * "There exists a story diagram which contains an object variable of 
	 *  type A which has binding operator CREATE or DESTROY."
	 */
	@Test
	public void testAnalyzeStoryDiagramCreateDeleteNode(){
		
		/*
		 * Set Up Activity
		 */
		
		//create Activity
		Activity activity = createEmptyActivityWithOneNode("Story Diagram with Created and Deleted Node");
		
		//create Story Pattern contents
		StoryPattern pattern = getFirstModifyingStoryNode(activity).getOwnedRule();
		
		PatternsFactory patternFactory= PatternsFactory.eINSTANCE;
		
		//create check_only object variable of type component
		ObjectVariable compVar = patternFactory.createObjectVariable();
		compVar.setName("compVar");
		compVar.setClassifier(atomicComponentEClass);
		pattern.getVariables().add(compVar);
		
		//create create object variable of type port
		ObjectVariable portVar = patternFactory.createObjectVariable();
		portVar.setName("portVar");
		portVar.setClassifier(portEClass);
		portVar.setBindingOperator(BindingOperator.CREATE);
		pattern.getVariables().add(portVar);
		
		//create destroyed object variable of type component instance
		ObjectVariable instVar = patternFactory.createObjectVariable();
		instVar.setName("instVar");
		instVar.setClassifier(componentInstanceEClass);
		instVar.setBindingOperator(BindingOperator.DESTROY);
		pattern.getVariables().add(instVar);
		
		/*
		 * Run Test
		 */
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		Set<EClass> changeableClasses = new HashSet<EClass>();
		Set<EClass> usedObjectVariableClasses = new HashSet<EClass>();
		usedObjectVariableClasses.add(atomicComponentEClass);
		usedObjectVariableClasses.add(portEClass);
		usedObjectVariableClasses.add(componentInstanceEClass);
		usedObjectVariableClasses.add(componentEClass);
		
		unNoId.analyzeStoryDiagram(activity, changeableClasses, usedObjectVariableClasses);
		
		/*
		 * Analyze result 
		 */
		
		assertTrue(changeableClasses.contains(portEClass));
		assertTrue(changeableClasses.contains(componentInstanceEClass));
		assertFalse(changeableClasses.contains(atomicComponentEClass));
		assertFalse(changeableClasses.contains(componentEClass));
	}
	
	/**
	 * Tests case 2 for unchangeable Nodes which is detected by the method analyzeStoryDiagram:
	 * 
	 * "There exists a story diagram which contains an object variable of 
	 *  type of A which has an AttributeAssignment."
	 */
	@Test
	public void testAnalyzeStoryDiagramAttributes(){
		
		/*
		 * Set Up Activity
		 */
		
		//create Activity
		Activity activity = createEmptyActivityWithOneNode("Story Diagram with Object Constraint and Attribute Assignment");
		
		//create Story Pattern contents
		StoryPattern pattern = getFirstModifyingStoryNode(activity).getOwnedRule();
		
		PatternsFactory patternFactory= PatternsFactory.eINSTANCE;
		
		//create object variable of type component
		ObjectVariable compVar = patternFactory.createObjectVariable();
		compVar.setName("compVar");
		compVar.setClassifier(atomicComponentEClass);
		pattern.getVariables().add(compVar);
		
		//create object variable of type port
		ObjectVariable portVar = patternFactory.createObjectVariable();
		portVar.setName("portVar");
		portVar.setClassifier(portEClass);
		pattern.getVariables().add(portVar);
		
		
		//create object constraint for component
		Constraint con1 = patternFactory.createConstraint();
		TextualExpression compExpr = ExpressionsFactory.eINSTANCE.createTextualExpression();
		compExpr.setLanguage("OCL");
		compExpr.setLanguageVersion("2.3");
		compExpr.setExpressionText("compVar.name = 'Test'");
		con1.setConstraintExpression(compExpr);
		compVar.getConstraints().add(con1);
		
		//create attribute assignment for port
		AttributeAssignment assign1 = patternFactory.createAttributeAssignment();
		assign1.setAttribute(getAttributeFromEClass(portEClass, "name"));
		compExpr = ExpressionsFactory.eINSTANCE.createTextualExpression();
		compExpr.setLanguage("OCL");
		compExpr.setLanguageVersion("2.3");
		compExpr.setExpressionText("'testPort'");
		assign1.setValueExpression(compExpr);
		portVar.getAttributeAssignments().add(assign1);
		
		
		/*
		 * Run Test
		 */
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		Set<EClass> changeableClasses = new HashSet<EClass>();
		Set<EClass> usedObjectVariableClasses = new HashSet<EClass>();
		usedObjectVariableClasses.add(atomicComponentEClass);
		usedObjectVariableClasses.add(portEClass);
		usedObjectVariableClasses.add(componentEClass);
		
		
		unNoId.analyzeStoryDiagram(activity, changeableClasses, usedObjectVariableClasses);
		
		/*
		 * Analyze result 
		 */
		
		assertTrue(changeableClasses.contains(portEClass));
		assertFalse(changeableClasses.contains(atomicComponentEClass));
		assertFalse(changeableClasses.contains(componentEClass));
	}
	
	
	/**
	 * Tests Case 3 for unchangeable Nodes which is detected by the method analyzeStoryDiagram:
	 * 
	 * "There exists a story diagram which contains a link variable originating 
	 *  from an object of class A which has binding operator CREATE or DESTROY."
	 */
	@Test
	public void testAnalyzeStoryDiagramOutgoingLinkCreateDelete(){
		
		/*
		 * Set Up Activity
		 */
		
		//create Activity
		Activity activity = createEmptyActivityWithOneNode("Story Diagram with Created and Deleted Link");
		
		//create Story Pattern contents
		StoryPattern pattern = getFirstModifyingStoryNode(activity).getOwnedRule();
		
		PatternsFactory patternFactory= PatternsFactory.eINSTANCE;
		
		//create check_only object variable of type component
		ObjectVariable compVar = patternFactory.createObjectVariable();
		compVar.setName("compVar");
		compVar.setClassifier(atomicComponentEClass);
		pattern.getVariables().add(compVar);
		
		//create object variable of type port
		ObjectVariable portVar = patternFactory.createObjectVariable();
		portVar.setName("portVar");
		portVar.setClassifier(portEClass);
		pattern.getVariables().add(portVar);
		
		//create object variable of type component instance
		ObjectVariable instVar = patternFactory.createObjectVariable();
		instVar.setName("instVar");
		instVar.setClassifier(componentInstanceEClass);
		pattern.getVariables().add(instVar);
		
		//create object variable of type port instance
		ObjectVariable portInstVar = patternFactory.createObjectVariable();
		portInstVar.setName("portInstVar");
		portInstVar.setClassifier(discretePortInstanceEClass);
		pattern.getVariables().add(portInstVar);
		
		//create created link variable from instVar to compVar (component instance type of component)
		LinkVariable linkCompInst2Type = patternFactory.createLinkVariable();
		linkCompInst2Type.setName("link1");
		linkCompInst2Type.setBindingOperator(BindingOperator.CREATE);
		linkCompInst2Type.setSource(instVar);
		linkCompInst2Type.setTarget(compVar);
		linkCompInst2Type.setTargetEnd(compInstTypeOfComponent);
		pattern.getLinkVariables().add(linkCompInst2Type);
		
		//create destroyed link variable from portInstVar to portVar (port instance type of port)
		LinkVariable linkPortInst2Type = patternFactory.createLinkVariable();
		linkPortInst2Type.setName("link2");
		linkPortInst2Type.setBindingOperator(BindingOperator.DESTROY);
		linkPortInst2Type.setSource(portInstVar);
		linkPortInst2Type.setTarget(portVar);
		linkPortInst2Type.setTargetEnd(portInstTypeOfPort);
		pattern.getLinkVariables().add(linkPortInst2Type);
		
		/*
		 * Run Test
		 */
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		Set<EClass> changeableClasses = new HashSet<EClass>();
		Set<EClass> usedObjectVariableClasses = new HashSet<EClass>();
		usedObjectVariableClasses.add(atomicComponentEClass);
		usedObjectVariableClasses.add(portEClass);
		usedObjectVariableClasses.add(componentInstanceEClass);
		usedObjectVariableClasses.add(componentEClass);
		usedObjectVariableClasses.add(portInstanceEClass);
		
		unNoId.analyzeStoryDiagram(activity, changeableClasses, usedObjectVariableClasses);
		
		/*
		 * Analyze result 
		 */
		
		assertTrue(changeableClasses.contains(discretePortInstanceEClass));
		assertTrue(changeableClasses.contains(componentInstanceEClass));
		assertFalse(changeableClasses.contains(atomicComponentEClass));
		assertFalse(changeableClasses.contains(componentEClass));
		assertFalse(changeableClasses.contains(portEClass));
	}
	
	/**
	 * Tests Case 4 for unchangeable Nodes which is detected by the method analyzeStoryDiagram:
	 * 
	 * "There exists a story diagram which contains a link variable pointing to 
	 *  an object of class A which has binding operator CREATE or DESTROY and which is bidirectional."
	 */
	@Test
	public void testAnalyzeStoryDiagramIncomingLinkCreateDelete(){
		
		/*
		 * Set Up Activity
		 */
		
		//create Activity
		Activity activity = createEmptyActivityWithOneNode("Story Diagram with bidirectional Created and Deleted Link");
		
		//create Story Pattern contents
		StoryPattern pattern = getFirstModifyingStoryNode(activity).getOwnedRule();
		
		PatternsFactory patternFactory= PatternsFactory.eINSTANCE;
		
		//create check_only object variable of type component
		ObjectVariable compVar = patternFactory.createObjectVariable();
		compVar.setName("compVar");
		compVar.setClassifier(atomicComponentEClass);
		pattern.getVariables().add(compVar);
		
		//create object variable of type port
		ObjectVariable portVar = patternFactory.createObjectVariable();
		portVar.setName("portVar");
		portVar.setClassifier(portEClass);
		pattern.getVariables().add(portVar);
		
		//create object variable of type component instance
		ObjectVariable instVar = patternFactory.createObjectVariable();
		instVar.setName("instVar");
		instVar.setClassifier(componentInstanceEClass);
		pattern.getVariables().add(instVar);
		
		//create object variable of type port instance
		ObjectVariable portInstVar = patternFactory.createObjectVariable();
		portInstVar.setName("portInstVar");
		portInstVar.setClassifier(discretePortInstanceEClass);
		pattern.getVariables().add(portInstVar);
		
		//create created link variable from compVar to portVar (component has ports)
		LinkVariable comp2Port = patternFactory.createLinkVariable();
		comp2Port.setName("link1");
		comp2Port.setBindingOperator(BindingOperator.CREATE);
		comp2Port.setSource(compVar);
		comp2Port.setTarget(portVar);
		comp2Port.setTargetEnd(compHasPorts);
		pattern.getLinkVariables().add(comp2Port);
		
		//create destroyed link variable from compInst to portInstVar (component instance has port instances)
		LinkVariable linkPortInst2Type = patternFactory.createLinkVariable();
		linkPortInst2Type.setName("link2");
		linkPortInst2Type.setBindingOperator(BindingOperator.DESTROY);
		linkPortInst2Type.setSource(instVar);
		linkPortInst2Type.setTarget(portInstVar);
		linkPortInst2Type.setTargetEnd(compInstPortInstances);
		pattern.getLinkVariables().add(linkPortInst2Type);
		
		/*
		 * Run Test
		 */
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		Set<EClass> changeableClasses = new HashSet<EClass>();
		Set<EClass> usedObjectVariableClasses = new HashSet<EClass>();
		usedObjectVariableClasses.add(atomicComponentEClass);
		usedObjectVariableClasses.add(portEClass);
		usedObjectVariableClasses.add(componentInstanceEClass);
		usedObjectVariableClasses.add(componentEClass);
		usedObjectVariableClasses.add(portInstanceEClass);
		
		unNoId.analyzeStoryDiagram(activity, changeableClasses, usedObjectVariableClasses);
		
		/*
		 * Analyze result 
		 */
		
		assertTrue(changeableClasses.contains(discretePortInstanceEClass));
		assertTrue(changeableClasses.contains(componentInstanceEClass));
		assertTrue(changeableClasses.contains(atomicComponentEClass));
		assertFalse(changeableClasses.contains(componentEClass));
		assertTrue(changeableClasses.contains(portEClass));
	}
	
	/**
	 * Tests Case 8 for unchangeable nodes:
	 * 
	 * "There exists a class B which is changeable and objects of class A have
	 *  a bidirectional reference to objects of class B."
	 *  
	 *  Checks where a changeable class has a bidirectional reference to another, 
	 *  used class.
	 * 
	 */
	@Test
	public void testExtendByClassesWithBidirectionalReference1(){
		
		Set<EClass> changeableClasses = new HashSet<EClass>();
		changeableClasses.add(discreteMultiPortInstanceEClass);
		
		Set<EClass> usedObjectVariableClasses = new HashSet<EClass>();
		usedObjectVariableClasses.add(discreteMultiPortInstanceEClass);
		usedObjectVariableClasses.add(discreteSinglePortInstanceEClass);
		
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		boolean result = unNoId.extendByClassesWithBidirectionalReference(changeableClasses, usedObjectVariableClasses);
		
		assertTrue(result);
		assertTrue(changeableClasses.contains(discreteMultiPortInstanceEClass));
		assertTrue(changeableClasses.contains(discreteSinglePortInstanceEClass));
		assertTrue(changeableClasses.size() == 2);
	}
	
	/**
	 * Tests Case 8 for unchangeable nodes:
	 * 
	 * "There exists a class B which is changeable and objects of class A have
	 *  a bidirectional reference to objects of class B."
	 *  
	 *  Checks where a changeable class has a bidirectional reference to another 
	 *  class which is not used by the analysis.
	 * 
	 */
	@Test
	public void testExtendByClassesWithBidirectionalReference2(){
		
		Set<EClass> changeableClasses = new HashSet<EClass>();
		changeableClasses.add(discreteMultiPortInstanceEClass);
		
		Set<EClass> usedObjectVariableClasses = new HashSet<EClass>();
		usedObjectVariableClasses.add(discreteMultiPortInstanceEClass);
		
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		boolean result = unNoId.extendByClassesWithBidirectionalReference(changeableClasses, usedObjectVariableClasses);
		
		assertFalse(result);
		assertFalse(changeableClasses.contains(discreteSinglePortInstanceEClass));
		assertTrue(changeableClasses.size() == 1);
	}
	
	/**
	 * Tests Case 8 for unchangeable nodes:
	 * 
	 * "There exists a class B which is changeable and objects of class A have
	 *  a bidirectional reference to objects of class B."
	 *  
	 *  Checks where a changeable class has a bidirectional reference to another 
	 *  class which has a subclass used by the analysis.
	 * 
	 */
	@Test
	public void testExtendByClassesWithBidirectionalReferenceSubclass(){
		
		Set<EClass> changeableClasses = new HashSet<EClass>();
		changeableClasses.add(connectorInstanceEClass);
		
		Set<EClass> usedObjectVariableClasses = new HashSet<EClass>();
		usedObjectVariableClasses.add(discreteMultiPortInstanceEClass);
		usedObjectVariableClasses.add(connectorInstanceEClass);
		
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		boolean result = unNoId.extendByClassesWithBidirectionalReference(changeableClasses, usedObjectVariableClasses);
		
		assertTrue(result);
		assertTrue(changeableClasses.contains(portInstanceEClass));
		assertTrue(changeableClasses.contains(connectorInstanceEClass));
		assertTrue(changeableClasses.size() == 2);
	}
	
	/**
	 * Tests Case 8 for unchangeable nodes:
	 * 
	 * "There exists a class B which is changeable and objects of class A have
	 *  a bidirectional reference to objects of class B."
	 *  
	 *  Checks where a changeable class has a unidirectional reference to another 
	 *  class which is used by the analysis.
	 * 
	 */
	@Test
	public void testExtendByClassesWithBidirectionalReferenceUnidirectionalReference(){
		
		Set<EClass> changeableClasses = new HashSet<EClass>();
		changeableClasses.add(componentInstanceEClass);
		
		Set<EClass> usedObjectVariableClasses = new HashSet<EClass>();
		usedObjectVariableClasses.add(componentEClass);
		usedObjectVariableClasses.add(componentInstanceEClass);
		
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		boolean result = unNoId.extendByClassesWithBidirectionalReference(changeableClasses, usedObjectVariableClasses);
		
		assertFalse(result);
		assertTrue(changeableClasses.contains(componentInstanceEClass));
		assertFalse(changeableClasses.contains(componentEClass));
		assertTrue(changeableClasses.size() == 1);
	}
	
	/**
	 * Tests Case 8 for unchangeable nodes:
	 * 
	 * "There exists a class B which is changeable and objects of class A have
	 *  a bidirectional reference to objects of class B."
	 *  
	 *  Checks an empty input.
	 * 
	 */
	@Test
	public void testExtendByClassesWithBidirectionalReferenceEmptyInput(){
		
		Set<EClass> changeableClasses = new HashSet<EClass>();
		
		Set<EClass> usedObjectVariableClasses = new HashSet<EClass>();
		
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		boolean result = unNoId.extendByClassesWithBidirectionalReference(changeableClasses, usedObjectVariableClasses);
		
		assertFalse(result);
		assertTrue(changeableClasses.isEmpty());
	}
	
	/**
	 * Tests Case 8 for unchangeable nodes:
	 * 
	 * "There exists a class B which is changeable and objects of class A have
	 *  a bidirectional reference to objects of class B."
	 *  
	 *  Checks a null input.
	 * 
	 */
	@Test
	public void testExtendByClassesWithBidirectionalReferenceNullInput(){
		
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		boolean result = unNoId.extendByClassesWithBidirectionalReference(null, null);
		
		assertFalse(result);
	}
	
	/**
	 * Tests the helper function isSubclassChangeable. The method
	 * returns true if the class given as the first parameter has
	 * a subclass in the set which is provided as the second parameter.
	 * 
	 * This test case tests the case that the set contains a subclass.
	 */
	@Test
	public void testIsSubclassChangeableIsChangeable(){
		
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		Set<EClass> changeableClasses = new HashSet<EClass>();
		changeableClasses.add(atomicComponentEClass);
		changeableClasses.add(discretePortEClass);
		changeableClasses.add(componentInstanceEClass);
		changeableClasses.add(componentEClass);
		changeableClasses.add(discretePortInstanceEClass);
		
		boolean result = unNoId.isSubClassChangeable(portInstanceEClass, changeableClasses);
		
		assertTrue(result);
	}
	
	/**
	 * Tests the helper function isSubclassChangeable. The method
	 * returns true if the class given as the first parameter has
	 * a subclass in the set which is provided as the second parameter.
	 * 
	 * This test case tests the case that the set contains no subclass.
	 */
	@Test
	public void testIsSubclassChangeableNotChangeable(){
		
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		Set<EClass> changeableClasses = new HashSet<EClass>();
		changeableClasses.add(atomicComponentEClass);
		changeableClasses.add(discretePortEClass);
		changeableClasses.add(componentInstanceEClass);
		changeableClasses.add(componentEClass);
		changeableClasses.add(discretePortInstanceEClass);
		
		boolean result = unNoId.isSubClassChangeable(discreteSinglePortInstanceEClass, changeableClasses);
		
		assertFalse(result);
	}
	
	/**
	 * Tests the helper function isSubclassChangeable. The method
	 * returns true if the class given as the first parameter has
	 * a subclass in the set which is provided as the second parameter.
	 * 
	 * This test case tests an empty set input.
	 */
	@Test
	public void testIsSubclassChangeableEmptyInput(){
		
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		Set<EClass> changeableClasses = new HashSet<EClass>();
		
		boolean result = unNoId.isSubClassChangeable(discreteSinglePortInstanceEClass, changeableClasses);
		
		assertFalse(result);
	}
	
	/**
	 * Tests the helper function isSubclassChangeable. The method
	 * returns true if the class given as the first parameter has
	 * a subclass in the set which is provided as the second parameter.
	 * 
	 * This test case tests a null input.
	 */
	@Test
	public void testIsSubclassChangeableNullInput(){
		
		TestableUnchangeableNodesIdentification unNoId = new TestableUnchangeableNodesIdentification();
		Set<EClass> changeableClasses = new HashSet<EClass>();
		
		boolean result = unNoId.isSubClassChangeable(null, changeableClasses);
		
		assertFalse(result);
	}
	
	
	/* ---------------------------------------------------------------------------------
	 * 
	 * Helper functions to deal with EMF EClasses
	 * 
	 * ---------------------------------------------------------------------------------
	 */
	
	/**
	 * Returns an attribute with the given name that is contained in the given EClass
	 * @param clazz
	 * @param attributeName
	 * @return
	 */
	private EAttribute getAttributeFromEClass(EClass clazz, String attributeName){
		for(EAttribute attr : clazz.getEAllAttributes()){
			if (attr.getName().equals(attributeName)){
				return attr;
			}
		}
		return null;
	}
	
	
	/* ---------------------------------------------------------------------------------
	 * 
	 * Helper functions to create activities.
	 * 
	 * ---------------------------------------------------------------------------------
	 */
	
	/**
	 * Helper function that creates an Activity with no activity nodes.
	 * @param name
	 * @return
	 */
	private Activity createEmptyActivity(String name){
		ActivitiesFactory factory = ActivitiesFactory.eINSTANCE;
		
		Activity result = factory.createActivity();
		result.setName(name);
		
		return result;
	}
	
	
	/**
	 * Helper function that creates an Activity with one modifying story node containing an empty story pattern.
	 * @param name
	 * @return
	 */
	private Activity createEmptyActivityWithOneNode(String name){
		
		ActivitiesFactory factory = ActivitiesFactory.eINSTANCE;
		
		Activity result = factory.createActivity();
		result.setName(name);
		
		//create start node
		InitialNode initNode = createInitialNode(factory);
		result.getOwnedActivityNodes().add(initNode);
		
		//create stop node
		ActivityFinalNode finalNode = createActivityFinalNode(factory);
		result.getOwnedActivityNodes().add(finalNode);
		
		//create story node
		ModifyingStoryNode storyNode = createModifyingStoryNode(factory);
		result.getOwnedActivityNodes().add(storyNode);
		
		//connect nodes
		result.getOwnedActivityEdges().add(createActivityEdge(factory, initNode, storyNode, EdgeGuard.NONE));
		result.getOwnedActivityEdges().add(createActivityEdge(factory, storyNode, finalNode, EdgeGuard.NONE));
		
		return result;
	}
	
	private InitialNode createInitialNode(ActivitiesFactory factory){
		InitialNode result = factory.createInitialNode();
		result.setName("Start");
		return result;
	}
	
	private ActivityFinalNode createActivityFinalNode(ActivitiesFactory factory){
		ActivityFinalNode result = factory.createActivityFinalNode();
		result.setName("Stop");
		result.setSuccess(true);
		return result;
	}
	
	/**
	 * Creates a ModifyingStoryNode with an empty story pattern
	 * @param factory
	 * @return
	 */
	private ModifyingStoryNode createModifyingStoryNode(ActivitiesFactory factory){
		ModifyingStoryNode result = factory.createModifyingStoryNode();
		result.setName("Story Node");
		result.setForEach(false);
		
		//create contained story pattern
		StoryPattern pattern = PatternsFactory.eINSTANCE.createStoryPattern();
		pattern.setBindingSemantics(BindingSemantics.MANDATORY);
		
		result.setOwnedRule(pattern);
		
		return result;
	}
	
	/**
	 * Creates an ActivityEdge from source to target with the specified EdgeGuard.
	 * @param factory
	 * @param source
	 * @param target
	 * @param guard
	 * @return
	 */
	private ActivityEdge createActivityEdge(ActivitiesFactory factory, ActivityNode source, ActivityNode target, EdgeGuard guard){
		ActivityEdge result = factory.createActivityEdge();
		
		result.setGuard(guard);
		result.setSource(source);
		result.setTarget(target);
		
		return result;
	}
	
	/**
	 * Returns the first modifying story node after the initial node.
	 * @param activity
	 * @return
	 */
	private ModifyingStoryNode getFirstModifyingStoryNode(Activity activity){
		
		InitialNode initNode = null;
		
		//search initial node
		for(ActivityNode node : activity.getOwnedActivityNodes()){
			if (node instanceof InitialNode){
				initNode = (InitialNode)node;
			}
		}
		
		//search successing story node
		if (initNode == null) return null;
		
		ModifyingStoryNode result = null;
		for(ActivityEdge edge : initNode.getOutgoings()){
			if (edge.getTarget() instanceof ModifyingStoryNode){
				result = (ModifyingStoryNode) edge.getTarget();
			}
		}
		
		return result;
	}
	
}
