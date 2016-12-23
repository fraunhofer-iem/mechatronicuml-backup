package org.muml.reconfigurationverification.timedstorychart.transform.tests;

// Deactivated by bingo, has compilation errors. please fix them.

//
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.EClassifier;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EStructuralFeature;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//import org.eclipse.m2m.qvt.oml.BasicModelExtent;
//import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
//import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
//import org.eclipse.m2m.qvt.oml.ModelExtent;
//import org.eclipse.m2m.qvt.oml.TransformationExecutor;
//import org.junit.Before;
//import org.junit.Test;
//import org.muml.core.expressions.Expression;
//import org.muml.core.expressions.common.ArithmeticExpression;
//import org.muml.core.expressions.common.ArithmeticOperator;
//import org.muml.core.expressions.common.CommonExpressionsFactory;
//import org.muml.core.expressions.common.ComparingOperator;
//import org.muml.core.expressions.common.ComparisonExpression;
//import org.muml.core.expressions.common.LiteralExpression;
//import org.muml.core.expressions.common.LogicOperator;
//import org.muml.core.expressions.common.LogicalExpression;
//import org.muml.core.modelinstance.ModelElementCategory;
//import org.muml.core.modelinstance.ModelinstanceFactory;
//import org.muml.core.modelinstance.RootNode;
//import org.muml.pim.actionlanguage.ActionlanguageFactory;
//import org.muml.pim.actionlanguage.AssignOperator;
//import org.muml.pim.actionlanguage.Assignment;
//import org.muml.pim.actionlanguage.Block;
//import org.muml.pim.actionlanguage.DoWhileLoop;
//import org.muml.pim.actionlanguage.ForLoop;
//import org.muml.pim.actionlanguage.IfStatement;
//import org.muml.pim.actionlanguage.IncrementDecrementOperator;
//import org.muml.pim.actionlanguage.TypedNamedElementExpression;
//import org.muml.pim.actionlanguage.WhileLoop;
//import org.muml.pim.behavior.BehaviorFactory;
//import org.muml.pim.realtimestatechart.Action;
//import org.muml.pim.realtimestatechart.EntryEvent;
//import org.muml.pim.realtimestatechart.RealtimeStatechart;
//import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
//import org.muml.pim.realtimestatechart.State;
//import org.muml.pim.types.PrimitiveDataType;
//import org.muml.pim.types.PrimitiveTypes;
//import org.muml.pim.types.TypesFactory;
//import org.muml.storydiagram.activities.Activity;
//import org.muml.storydiagram.activities.ActivityEdge;
//import org.muml.storydiagram.activities.ActivityNode;
//import org.muml.storydiagram.interpreter.core.StoryDrivenInterpreter;
//import org.muml.storydiagram.interpreter.core.eclipse.EclipseExpressionInterpreterManager;
//import org.muml.storydiagram.interpreter.core.facade.StoryDrivenMetamodelFacadeFactory;
//import org.muml.storydiagram.interpreter.core.mdelab.SDMException;
//import org.muml.storydiagram.interpreter.core.mdelab.notifications.NotificationEmitter;
//import org.muml.storydiagram.interpreter.core.mdelab.variables.Variable;
//import org.muml.storydiagram.interpreter.core.notifications.StoryDrivenNotificationEmitter;
//import org.muml.storydiagram.interpreter.core.notifications.StoryDrivenOutputStreamNotificationReceiver;
//import org.muml.storydiagram.patterns.AbstractLinkVariable;
//import org.muml.storydiagram.patterns.AbstractVariable;
//import org.muml.storydiagram.patterns.StoryPattern;
//import org.muml.verification.core.runtime.RuntimeFactory;
//import org.muml.verification.core.runtime.VariableBinding;

public class ActionLanguageTransformationTest {
//	
//	private static final boolean SAVE_OUTPUT = true;
//
//	private Action action;
//
//	private RealtimeStatechart rtsc;
//
//	private ModelElementCategory typesCategory;
//
//	private org.muml.pim.behavior.Variable counter;
//
//	private org.muml.pim.behavior.Variable a;
//
//	private org.muml.pim.behavior.Variable b;
//
//	private org.muml.pim.behavior.Variable c;
//
//	private org.muml.pim.behavior.Variable d;
//
//	@Before
//	public void setUp() throws Exception {
//		typesCategory = ModelinstanceFactory.eINSTANCE.createModelElementCategory();
//		typesCategory.setKey("org.muml.types.category");
//		rtsc = RealtimestatechartFactory.eINSTANCE.createRealtimeStatechart();
//		State state = RealtimestatechartFactory.eINSTANCE.createState();
//		action = RealtimestatechartFactory.eINSTANCE.createAction();
//		action.setName("Action1");
//		EntryEvent event = RealtimestatechartFactory.eINSTANCE.createEntryEvent();
//		event.setAction(action);
//		state.setEntryEvent(event);
//		state.setParentStatechart(rtsc);
//		ModelElementCategory modelElementCategory = ModelinstanceFactory.eINSTANCE.createModelElementCategory();
//		modelElementCategory.getModelElements().add(rtsc);
//		modelElementCategory.setKey("org.muml.pim.realtimestatechart.category");
//		RootNode rootNode = ModelinstanceFactory.eINSTANCE.createRootNode();
//		rootNode.getCategories().add(modelElementCategory);
//		rootNode.getCategories().add(typesCategory);
//		
//		addAttributes();
//		
//		Block mainBlock = ActionlanguageFactory.eINSTANCE.createBlock();
//		
//		ForLoop forLoop = ActionlanguageFactory.eINSTANCE.createForLoop();
//		Assignment forLoopAssignment = ActionlanguageFactory.eINSTANCE.createAssignment();
//		forLoopAssignment = addExpressionToAssignment(forLoopAssignment);
//		Block forLoopBlock = ActionlanguageFactory.eINSTANCE.createBlock();
//		forLoopBlock.getExpressions().add(forLoopAssignment);
//		forLoop.setBlock(forLoopBlock);
//		forLoop = createForLoopExpressions(forLoop);
//		
//		WhileLoop whileLoop = ActionlanguageFactory.eINSTANCE.createWhileLoop();
//		Assignment whileLoopAssignment = ActionlanguageFactory.eINSTANCE.createAssignment();
//		Block whileLoopBlock = ActionlanguageFactory.eINSTANCE.createBlock();
//		whileLoopBlock.getExpressions().add(whileLoopAssignment);
//		whileLoop.setBlock(whileLoopBlock);
//		whileLoop.setLoopTest(createCheckExpression());
//		
//		DoWhileLoop doWhileLoop = ActionlanguageFactory.eINSTANCE.createDoWhileLoop();
//		Assignment doWhileLoopAssignment = ActionlanguageFactory.eINSTANCE.createAssignment();
//		Block doWhileLoopBlock = ActionlanguageFactory.eINSTANCE.createBlock();
//		doWhileLoopBlock.getExpressions().add(doWhileLoopAssignment);
//		doWhileLoop.setBlock(doWhileLoopBlock);
//		doWhileLoop.setLoopTest(createCheckExpression());
//		
//		Assignment mainAssignment = ActionlanguageFactory.eINSTANCE.createAssignment();
//		addExpressionToAssignment(mainAssignment);
//		
//		IfStatement ifStatement = ActionlanguageFactory.eINSTANCE.createIfStatement();
//		ifStatement.setIfBlock(forLoop);
//		Expression expression = createCheckExpression();
//		ifStatement.setIfCondition(expression);
//		expression = createCheckExpression();
//		ifStatement.getElseIfConditions().add(expression);
//		ifStatement.getElseIfBlocks().add(whileLoop);
//		ifStatement.setElseBlock(doWhileLoop);		
//		
//		mainBlock.getExpressions().add(mainAssignment);
//		mainBlock.getExpressions().add(ifStatement);
//
//		action.getExpressions().add(mainBlock);
//		
//		saveInput(rootNode,"testModels/input.xmi");
//	}
//
//	private void addAttributes() {
//		PrimitiveDataType integer = TypesFactory.eINSTANCE.createPrimitiveDataType();
//		integer.setPrimitiveType(PrimitiveTypes.INT32);
//		typesCategory.getModelElements().add(integer);
//		
//		counter = BehaviorFactory.eINSTANCE.createVariable();
//		counter.setName("counter");
//		counter.setDataType(integer);
//		rtsc.getVariables().add(counter);
//		
//		a = BehaviorFactory.eINSTANCE.createVariable();
//		a.setName("a");
//		a.setDataType(integer);
//
//		b = BehaviorFactory.eINSTANCE.createVariable();
//		b.setName("b");
//		b.setDataType(integer);
//		
//		rtsc.getVariables().add(a);
//		rtsc.getVariables().add(b);
//		
//		c = BehaviorFactory.eINSTANCE.createVariable();
//		c.setName("c");
//		c.setDataType(integer);
//		rtsc.getVariables().add(c);
//		
//		d = BehaviorFactory.eINSTANCE.createVariable();
//		d.setName("d");
//		d.setDataType(integer);
//		rtsc.getVariables().add(d);
//		
//	}
//
//	private ForLoop createForLoopExpressions(ForLoop forLoop) {
//		
//		Assignment initExpression = ActionlanguageFactory.eINSTANCE.createAssignment();
//		initExpression.setAssignOperator(AssignOperator.ASSIGN);
//		TypedNamedElementExpression initlhs = ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression();
//		initlhs.setTypedNamedElement(counter);
//		initExpression.setLhs_typedNamedElementExpression(initlhs);
//		LiteralExpression initrhs = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
//		initrhs.setValue("0");
//		initExpression.setRhs_assignExpression(initrhs);
//		
//		forLoop.setInitializeExpression(initExpression);
//
//		ComparisonExpression loopTest = CommonExpressionsFactory.eINSTANCE.createComparisonExpression();
//		loopTest.setOperator(ComparingOperator.LESS);
//		TypedNamedElementExpression complhs = ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression();
//		complhs.setTypedNamedElement(counter);
//		loopTest.setLeftExpression(complhs);
//		LiteralExpression comprhs = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
//		comprhs.setValue("4");
//		loopTest.setRightExpression(comprhs);
//		
//		forLoop.setLoopTest(loopTest);
//
//		Assignment increaseExpression = ActionlanguageFactory.eINSTANCE.createAssignment();
//		TypedNamedElementExpression increaselhs = ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression();
//		increaselhs.setTypedNamedElement(counter);
//		increaseExpression.setLhs_typedNamedElementExpression(increaselhs);
//		increaseExpression.setIncrementDecrementOperator(IncrementDecrementOperator.INCREMENT);
//		
//		forLoop.setCountingExpression(increaseExpression);
//		
//		return forLoop;
//	}
//
//	private Expression createCheckExpression() {
//
//
//		LogicalExpression returnExpression = CommonExpressionsFactory.eINSTANCE.createLogicalExpression();
//		returnExpression.setOperator(LogicOperator.AND);
//		
//		ComparisonExpression returnlhs = CommonExpressionsFactory.eINSTANCE.createComparisonExpression();
//		returnlhs.setOperator(ComparingOperator.LESS);
//		TypedNamedElementExpression comp1lhs = ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression();
//		comp1lhs.setTypedNamedElement(c);
//		returnlhs.setLeftExpression(comp1lhs);
//		TypedNamedElementExpression comp1rhs = ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression();
//		comp1rhs.setTypedNamedElement(d);
//		returnlhs.setRightExpression(comp1rhs);
//		
//		ComparisonExpression returnrhs = CommonExpressionsFactory.eINSTANCE.createComparisonExpression();
//		returnrhs.setOperator(ComparingOperator.LESS);
//		TypedNamedElementExpression comp2lhs = ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression();
//		comp2lhs.setTypedNamedElement(d);
//		returnrhs.setLeftExpression(comp2lhs);
//		LiteralExpression comp2rhs = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
//		comp2rhs.setValue("4");
//		returnrhs.setRightExpression(comp2rhs);
//		
//		returnExpression.setLeftExpression(returnlhs);
//		returnExpression.setRightExpression(returnrhs);
//		
//		return returnExpression;
//	}
//
//	private Assignment addExpressionToAssignment(Assignment assignment) {
//		TypedNamedElementExpression lhsExpression = ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression();
//		lhsExpression.setTypedNamedElement(a);
//				
//		ArithmeticExpression rhsExpression = CommonExpressionsFactory.eINSTANCE.createArithmeticExpression();
//		
//		TypedNamedElementExpression rhsExpression1 = ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression();
//
//		rhsExpression1.setTypedNamedElement(b);
//		
//		LiteralExpression rhsExpression2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
//		rhsExpression2.setValue("5");
//		
//		rhsExpression.setLeftExpression(rhsExpression1);
//		rhsExpression.setOperator(ArithmeticOperator.PLUS);
//		rhsExpression.setRightExpression(rhsExpression2);
//		
//		assignment.setLhs_typedNamedElementExpression(lhsExpression);
//		assignment.setAssignOperator(AssignOperator.ASSIGN);
//		assignment.setRhs_assignExpression(rhsExpression);
//	
//		return assignment;
//	}
//
//	@Test
//	public void test() {
//		Activity result = (Activity) performTransformation(action);
//		if(SAVE_OUTPUT)
//			saveActivity(result, "testModels/Activity.sdm");
//		
//		callInterpreter(result);
//	}
//	
//	protected Map<String, Variable<EClassifier>> callInterpreter(Activity activity) {
//		VariableBinding aBinding = RuntimeFactory.eINSTANCE.createVariableBinding();
//		aBinding.setVariable(a);
//		aBinding.setValue(new Integer(0));
//		VariableBinding bBinding = RuntimeFactory.eINSTANCE.createVariableBinding();
//		bBinding.setVariable(b);
//		bBinding.setValue(new Integer(0));
//		VariableBinding cBinding = RuntimeFactory.eINSTANCE.createVariableBinding();
//		cBinding.setVariable(c);
//		cBinding.setValue(new Integer(0));
//		VariableBinding dBinding = RuntimeFactory.eINSTANCE.createVariableBinding();
//		dBinding.setVariable(d);
//		dBinding.setValue(new Integer(2));
//		VariableBinding counterBinding = RuntimeFactory.eINSTANCE.createVariableBinding();
//		counterBinding.setVariable(counter);
//		counterBinding.setValue(new Integer(1000));
//		
//		// create parameter for the given state which will be passed to the
//		// interpreter
//		List<Variable<EClassifier>> parameters = new ArrayList<Variable<EClassifier>>();
//		Variable<EClassifier> v1 = new Variable<EClassifier>("a_binding", aBinding.eClass(), aBinding);
//		parameters.add(v1);
//		Variable<EClassifier> v2 = new Variable<EClassifier>("b_binding", bBinding.eClass(), bBinding);
//		parameters.add(v2);
//		Variable<EClassifier> v3 = new Variable<EClassifier>("c_binding", cBinding.eClass(), cBinding);
//		parameters.add(v3);
//		Variable<EClassifier> v4 = new Variable<EClassifier>("d_binding", dBinding.eClass(), dBinding);
//		parameters.add(v4);
//		Variable<EClassifier> v5 = new Variable<EClassifier>("counter_binding", counterBinding.eClass(), counterBinding);
//		parameters.add(v5);
//	
//		// call interpreter
//		StoryDrivenInterpreter interpreter;
//
//		try {
//			StoryDrivenNotificationEmitter emitter = new StoryDrivenNotificationEmitter();
//			emitter.addNotificationReceiver(new StoryDrivenOutputStreamNotificationReceiver());
//			interpreter = new StoryDrivenInterpreter(createExpressionInterpreterManager(),
//					emitter);
//
//			return interpreter.executeActivity(activity, parameters);
//
//		} catch (SDMException e) {
//			// TODO: Error handling if interpretation fails
//			e.printStackTrace();
//		}
//		return new HashMap<String, Variable<EClassifier>>();
//	}
//	
//	private EclipseExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> createExpressionInterpreterManager() throws SDMException{
//		return new EclipseExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>(createStoryDrivenMetamodelFacadeFactory(), 
//												getClass().getClassLoader(),
//												createNotificationEmitter());
//	}
//	
//	private StoryDrivenMetamodelFacadeFactory createStoryDrivenMetamodelFacadeFactory(){
//		return StoryDrivenMetamodelFacadeFactory.INSTANCE;
//	}
//	
//	private NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> createNotificationEmitter(){
//		return new NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>();
//	}
//	
//
//	public void saveActivity(Activity activity,String modelName) {
//	    ResourceSet rs = new ResourceSetImpl();    
//
//	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;	    
//	    Map<String, Object> m = reg.getExtensionToFactoryMap();
//	    m.put("sdm", new XMIResourceFactoryImpl());
//
//	    Resource r = rs.createResource(URI.createFileURI(modelName));
//	   
//	    r.getContents().add(activity);
//
//	    try {
//			r.save(Collections.EMPTY_MAP);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public void saveInput(RootNode rootNode,String modelName) {
//	    ResourceSet rs = new ResourceSetImpl();    
//
//	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;	    
//	    Map<String, Object> m = reg.getExtensionToFactoryMap();
//	    m.put("xmi", new XMIResourceFactoryImpl());
//
//	    Resource r = rs.createResource(URI.createFileURI(modelName));
//	   
//	    r.getContents().add(rootNode);
//
//	    try {
//			r.save(Collections.EMPTY_MAP);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public EObject performTransformation(Action	action) {
//		// create URI for the transformation file
//		URI transformationURI = URI
//				.createPlatformPluginURI(
//						"/org.muml.reconfigurationverification.reachanalysis.timedstorychart.transform/transforms/ActionLanguageTransformation.qvto",
//						true);
//		// create executor and execution context
//		TransformationExecutor executor = new TransformationExecutor(
//				transformationURI);
//		ExecutionContextImpl context = new ExecutionContextImpl();
//		
//		// create input and output extend
//		List<Action> inObjects = Arrays.asList(action);
//		ModelExtent input = new BasicModelExtent(inObjects);
//		ModelExtent output = new BasicModelExtent();
//
//		// execute transformation
//		ExecutionDiagnostic result = executor.execute(context, input, output);
//		if (result.getSeverity() != ExecutionDiagnostic.OK){
//			String message = "QVT-O ERROR on rule transformation. Message was: "+ System.getProperty("line.separator") + result.getMessage();
//			System.out.println(message);
//		}
//		
//		//get the resulting Activity
//		for(EObject curObject : output.getContents()){
//			if (curObject instanceof Activity){
//				return ((Activity) curObject);
//			}
//		}
//		return null;
//	}

	
}
