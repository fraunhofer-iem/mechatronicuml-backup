package org.muml.simulink.adapter.reconfiguration.analysis.pre.reach.state;

import org.muml.core.ExtendableElement;
import org.muml.core.expressions.ExpressionsFactory;
import org.muml.core.expressions.TextualExpression;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.RootNode;
import org.muml.pim.behavior.BehaviorFactory;
import org.muml.pim.behavior.Operation;
import org.muml.pim.behavior.Variable;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.msgtype.MessageTypeRepository;
import org.muml.pim.realtimestatechart.Action;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.pim.realtimestatechart.EntryEvent;
import org.muml.pim.realtimestatechart.EntryPoint;
import org.muml.pim.realtimestatechart.EventKind;
import org.muml.pim.realtimestatechart.ExitPoint;
import org.muml.pim.realtimestatechart.Message;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.StateConnectionPoint;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.types.DataType;
import org.muml.pim.types.PrimitiveTypes;

/**
 * Generator for the behavior of a State. Generates a RTSC.
 */
public class StateBehaviorGenerator 
{	
	static final String CATEGORY_TYPES = "org.muml.types.category";
	static final String CATEGORY_MSGTYPE = "org.muml.pim.messagetype.category";
	
	static final String LANG_MATLAB = "embedded_matlab";
	
	public final static String NAME_STATE_INITIAL = "Initial";
	public final static String NAME_STATE_SETUP = "Setup";
	
	public final static String NAME_OP_SETUP = "setup";
	public final static String NAME_OP_FADING = "fading";
	public final static String NAME_OP_TEARDOWN = "teardown";
	public final static String NAME_OP_INITIAL = "teardown";
	
	static final RealtimestatechartFactory rtscfactory = RealtimestatechartFactory.eINSTANCE;
	static final BehaviorFactory behaviorfactory = BehaviorFactory.eINSTANCE;
	
	private RootNode model;
	
	private MessageType msgFinished = null;
	private MessageType msgSetup = null;
	private MessageType msgTeardown = null;
	private MessageType msgFading = null;
	
	public StateBehaviorGenerator(RootNode model)
	{
		this.model = model;		
	}
	
	/**
	 * Generates a RTSC for a State. The RTSC is named 'State_' + name.
	 */
	public RealtimeStatechart generateBehavior(String name, MessageTypeRepository msgTypes)
	{
		this.collectStateMsgTypes(msgTypes);
		
		RealtimeStatechart rtsc = rtscfactory.createRealtimeStatechart();
		rtsc.setName("State_" + name);
		
		Variable int_state = behaviorfactory.createVariable();
		int_state.setName("state");
		int_state.setDataType(this.getDataType(PrimitiveTypes.INT32));
		rtsc.getVariables().add(int_state);
		
		rtsc.getStates().add(this.generateStateMain());
		
		return rtsc;
	}
	
	/**
	 * Generates the outer main state
	 */
	protected State generateStateMain()
	{
		State main = rtscfactory.createState();
		main.setName("State_Main");
		main.setInitial(true);
		
		main.getEmbeddedRegions().add(this.generateRegionStateSpace());		
		
		return main;
	}
	
	/**
	 * Generates the region which contains the state space
	 */
	protected Region generateRegionStateSpace()
	{
		Region space = rtscfactory.createRegion();
		space.setPriority(1);
		
		RealtimeStatechart rtsc = rtscfactory.createRealtimeStatechart();
		rtsc.setName("state_space");	
		space.setEmbeddedStatechart(rtsc);
		
		State initial = rtscfactory.createState();
		initial.setInitial(true);
		initial.setName(NAME_STATE_INITIAL);
		rtsc.getStates().add(initial);
		
		Operation initOp = behaviorfactory.createOperation();
		initOp.setName(NAME_OP_INITIAL);
		initOp.setReturnType(this.getDataType(PrimitiveTypes.VOID));		
		rtsc.getOperations().add(initOp);
		
		EntryEvent entry = rtscfactory.createEntryEvent();
		entry.setKind(EventKind.RAISE);
		initial.setEntryEvent(entry);
		
		Action entryAction = rtscfactory.createAction();
		entryAction.setName("entry");
		entry.setAction(entryAction);		
				
		TextualExpression functionCall = ExpressionsFactory.eINSTANCE.createTextualExpression();
		functionCall.setExpressionText(NAME_OP_INITIAL + "()");
		functionCall.setLanguage(LANG_MATLAB);
		entryAction.getExpressions().add(functionCall);			
		
		return space;
	}
	
	/**
	 * Generates a state with the given id
	 */
	public State generateState(int id)
	{
		State state = rtscfactory.createState();		
		state.setName("State" + id);
		
		EntryEvent entry = rtscfactory.createEntryEvent();
		entry.setKind(EventKind.RAISE);
		state.setEntryEvent(entry);
		
		Action entryAction = rtscfactory.createAction();
		entryAction.setName("entry");
		entry.setAction(entryAction);
		
		TextualExpression functionCall = ExpressionsFactory.eINSTANCE.createTextualExpression();
		functionCall.setExpressionText("state =" + id);
		functionCall.setLanguage(LANG_MATLAB);
		entryAction.getExpressions().add(functionCall);			
		
		return state;
	}
	
	/**
	 * Generates a state for a reconfiguration with the given message
	 */
	public State generateReconfigurationState(State source, State target, MessageType msg)
	{
		State state = rtscfactory.createState();		
		state.setName("Reconfiguration" + source.getName() + "To" + target.getName());
		state.setParentStatechart(target.getParentStatechart());
				
		Region region = rtscfactory.createRegion();
		region.setPriority(1);
		region.setParentState(state);
		
		RealtimeStatechart rtsc = rtscfactory.createRealtimeStatechart();
		rtsc.setName(state.getName());
		rtsc.setParentRegion(region);
		
		State setup = this.generateSetup();
		State fading = this.generateFading();
		State teardown = this.generateTeardown();
		rtsc.getStates().add(setup);
		rtsc.getStates().add(fading);
		rtsc.getStates().add(teardown);
		
		//We need this state because we can not transform transitions form exitpoint to exitpoint
		State sfinal = rtscfactory.createState();
		sfinal.setName("Final");
		sfinal.setParentStatechart(rtsc);
		
		
		ExitPoint exit = rtscfactory.createExitPoint();
		exit.setName("to" + target.getName());
		exit.setState(state);
		
		EntryPoint entry = rtscfactory.createEntryPoint();
		entry.setName("from" + source.getName());
		entry.setState(state);
		
		Transition sourceToEntry = rtscfactory.createTransition();
		sourceToEntry.setSource(source);
		sourceToEntry.setTarget(entry);
		sourceToEntry.setPriority(1);
		target.getParentStatechart().getTransitions().add(sourceToEntry);
		sourceToEntry.getEvents().add(this.generateMessageTriggerEvent(msg));
		
		Transition entryToSetup = rtscfactory.createTransition();
		entryToSetup.setSource(entry);
		entryToSetup.setTarget(setup);
		entryToSetup.setPriority(1);
		rtsc.getTransitions().add(entryToSetup);	
		
		Transition setupToFading = rtscfactory.createTransition();
		for(StateConnectionPoint point: setup.getConnectionPoints())
			if(point instanceof ExitPoint)
				setupToFading.setSource(point);
		setupToFading.setTarget(fading);
		setupToFading.setPriority(1);
		rtsc.getTransitions().add(setupToFading);
		
		Transition fadingToTeardown = rtscfactory.createTransition();
		for(StateConnectionPoint point: fading.getConnectionPoints())
			if(point instanceof ExitPoint)
				fadingToTeardown.setSource(point);
		fadingToTeardown.setTarget(teardown);
		fadingToTeardown.setPriority(1);
		rtsc.getTransitions().add(fadingToTeardown);
		
		Transition teardownToFinal = rtscfactory.createTransition();
		for(StateConnectionPoint point: teardown.getConnectionPoints())
			if(point instanceof ExitPoint)
				teardownToFinal.setSource(point);
		teardownToFinal.setTarget(sfinal);
		teardownToFinal.setPriority(1);
		rtsc.getTransitions().add(teardownToFinal);
		
		Transition finalToExit = rtscfactory.createTransition();
		finalToExit.setSource(sfinal);
		finalToExit.setTarget(exit);
		finalToExit.setPriority(1);
		rtsc.getTransitions().add(finalToExit);
		
		Transition exitToTarget = rtscfactory.createTransition();
		exitToTarget.setSource(exit);
		exitToTarget.setTarget(target);
		exitToTarget.setPriority(1);
		target.getParentStatechart().getTransitions().add(exitToTarget);
		

		Operation setupOp = behaviorfactory.createOperation();
		setupOp.setName(NAME_OP_SETUP);
		setupOp.setReturnType(this.getDataType(PrimitiveTypes.VOID));		
		rtsc.getOperations().add(setupOp);
		
		Operation fadingOp = behaviorfactory.createOperation();
		fadingOp.setName(NAME_OP_FADING);
		fadingOp.setReturnType(this.getDataType(PrimitiveTypes.VOID));		
		rtsc.getOperations().add(fadingOp);			
		
		Operation teardownOp = behaviorfactory.createOperation();
		teardownOp.setName(NAME_OP_TEARDOWN);
		teardownOp.setReturnType(this.getDataType(PrimitiveTypes.VOID));		
		rtsc.getOperations().add(teardownOp);	
		
		return state;
	}
	
	/**
	 * Generates the embedded setup state
	 * [Setup]: o->[Working]--->[Finished]-->(Exit)
	 */
	protected State generateSetup()
	{
		State state = rtscfactory.createState();
		state.setName(NAME_STATE_SETUP);
		state.setInitial(true);
		
		Region region = rtscfactory.createRegion();
		region.setPriority(1);
		region.setParentState(state);
		
		RealtimeStatechart rtsc = rtscfactory.createRealtimeStatechart();
		rtsc.setName("Setup");
		rtsc.setParentRegion(region);
		
		State working = rtscfactory.createState();
		working.setName("Working");
		working.setInitial(true);
		working.setParentStatechart(rtsc);
		
		EntryEvent entry = rtscfactory.createEntryEvent();
		entry.setKind(EventKind.RAISE);
		working.setEntryEvent(entry);
		
		Action entryAction = rtscfactory.createAction();
		entryAction.setName("setup");
		entry.setAction(entryAction);
		
		TextualExpression functionCall = ExpressionsFactory.eINSTANCE.createTextualExpression();
		functionCall.setExpressionText("setup()");
		functionCall.setLanguage(LANG_MATLAB);
		entryAction.getExpressions().add(functionCall);
		
		State finished = rtscfactory.createState();
		finished.setName("Finished");
		finished.setParentStatechart(rtsc);
		
		Transition transition = rtscfactory.createTransition();
		transition.setSource(working);
		transition.setTarget(finished);
		transition.setPriority(1);
		rtsc.getTransitions().add(transition);
		
		AsynchronousMessageEvent sendFinished = rtscfactory.createAsynchronousMessageEvent();
		sendFinished.setKind(EventKind.RAISE);
		transition.getEvents().add(sendFinished);
		
		Message finishedMessage = rtscfactory.createMessage();
		finishedMessage.setInstanceOf(this.msgFinished);
		sendFinished.setMessage(finishedMessage);
		
		ExitPoint exit = rtscfactory.createExitPoint();
		exit.setName("Setup_exit");
		exit.setState(state);
		
		Transition toExit = rtscfactory.createTransition();
		toExit.setTarget(exit);
		toExit.setSource(finished);
		toExit.setPriority(1);
		rtsc.getTransitions().add(toExit);
		toExit.getEvents().add(this.generateMessageTriggerEvent(this.msgFading));
		return state;
	}
	
	/**
	 * Generates the embedded fading state
	 * [Fading]: o->[Working]--->[Finished]-->(Exit)
	 */	
	protected State generateFading()
	{
		State state = rtscfactory.createState();
		state.setName("Fading");
		
		Region region = rtscfactory.createRegion();
		region.setPriority(1);
		region.setParentState(state);
		
		RealtimeStatechart rtsc = rtscfactory.createRealtimeStatechart();
		rtsc.setName("Fading");
		rtsc.setParentRegion(region);
		
		State working = rtscfactory.createState();
		working.setName("Working");
		working.setInitial(true);
		working.setParentStatechart(rtsc);
		
		EntryEvent entry = rtscfactory.createEntryEvent();
		entry.setKind(EventKind.RAISE);
		working.setEntryEvent(entry);
		
		Action entryAction = rtscfactory.createAction();
		entryAction.setName("fading");
		entry.setAction(entryAction);
		
		TextualExpression functionCall = ExpressionsFactory.eINSTANCE.createTextualExpression();
		functionCall.setExpressionText("fading()");
		functionCall.setLanguage(LANG_MATLAB);
		entryAction.getExpressions().add(functionCall);
		
		State finished = rtscfactory.createState();
		finished.setName("Finished");
		finished.setParentStatechart(rtsc);
		
		Transition transition = rtscfactory.createTransition();
		transition.setSource(working);
		transition.setTarget(finished);
		transition.setPriority(1);
		rtsc.getTransitions().add(transition);
		
		AsynchronousMessageEvent sendFinished = rtscfactory.createAsynchronousMessageEvent();
		sendFinished.setKind(EventKind.RAISE);
		transition.getEvents().add(sendFinished);
		
		Message finishedMessage = rtscfactory.createMessage();
		finishedMessage.setInstanceOf(this.msgFinished);
		sendFinished.setMessage(finishedMessage);
						
		ExitPoint exit = rtscfactory.createExitPoint();
		exit.setName("Fading_exit");
		exit.setState(state);
		
		Transition toExit = rtscfactory.createTransition();
		toExit.setTarget(exit);
		toExit.setSource(finished);
		rtsc.getTransitions().add(toExit);
		toExit.setPriority(1);
		toExit.getEvents().add(this.generateMessageTriggerEvent(msgTeardown));
		return state;
	}	
	
	/**
	 * Generates the embedded teardown state
	 * [Teardown]: o->[Working]--->[Finished]-->(Exit)
	 */	
	protected State generateTeardown()
	{
		State state = rtscfactory.createState();
		state.setName("Teardown");
		
		Region region = rtscfactory.createRegion();
		region.setPriority(1);
		region.setParentState(state);
		
		RealtimeStatechart rtsc = rtscfactory.createRealtimeStatechart();
		rtsc.setName("Teardown");
		rtsc.setParentRegion(region);
		
		State working = rtscfactory.createState();
		working.setName("Working");
		working.setInitial(true);
		working.setParentStatechart(rtsc);
		
		EntryEvent entry = rtscfactory.createEntryEvent();
		entry.setKind(EventKind.RAISE);
		working.setEntryEvent(entry);
		
		Action entryAction = rtscfactory.createAction();
		entryAction.setName("teardown");
		entry.setAction(entryAction);
		
		TextualExpression functionCall = ExpressionsFactory.eINSTANCE.createTextualExpression();
		functionCall.setExpressionText("teardown()");
		functionCall.setLanguage(LANG_MATLAB);
		entryAction.getExpressions().add(functionCall);
		
		State finished = rtscfactory.createState();
		finished.setName("Finished");
		finished.setParentStatechart(rtsc);
		
		Transition transition = rtscfactory.createTransition();
		transition.setSource(working);
		transition.setTarget(finished);
		transition.setPriority(1);
		rtsc.getTransitions().add(transition);
		
		AsynchronousMessageEvent sendFinished = rtscfactory.createAsynchronousMessageEvent();
		sendFinished.setKind(EventKind.RAISE);
		transition.getEvents().add(sendFinished);
		
		Message finishedMessage = rtscfactory.createMessage();
		finishedMessage.setInstanceOf(this.msgFinished);
		sendFinished.setMessage(finishedMessage);
				
		ExitPoint exit = rtscfactory.createExitPoint();
		exit.setName("Teardown_exit");
		exit.setState(state);
		
		Transition toExit = rtscfactory.createTransition();
		toExit.setTarget(exit);
		toExit.setSource(finished);
		rtsc.getTransitions().add(toExit);
		toExit.setPriority(1);
		return state;
	}	
	
	
	/**
	 * Returns the DataType for a given PrimitiveType
	 */
	protected DataType getDataType(PrimitiveTypes type)
	{
		for(ModelElementCategory category: this.model.getCategories())
			if(CATEGORY_TYPES.equals(category.getKey()))
				for(ExtendableElement element: category.getModelElements())
					if(type.getLiteral().equals(((DataType)element).getName()))
							return (DataType) element;
		return null;
	}
	
	/**
	 * Collects all mandatory message types and stores them in member variables
	 */
	protected void collectStateMsgTypes(MessageTypeRepository msgTypes)
	{
		for(MessageType msgType: msgTypes.getMessageTypes())
		{
			if(StateGenerator.MSGTYPE_FINISHED.equals(msgType.getName()))
				this.msgFinished = msgType;
			else if(StateGenerator.MSGTYPE_SETUP.equals(msgType.getName()))
				this.msgSetup = msgType;
			else if(StateGenerator.MSGTYPE_FADING.equals(msgType.getName()))
				this.msgFading = msgType;
			else if(StateGenerator.MSGTYPE_TEARDOWN.equals(msgType.getName()))
				this.msgTeardown = msgType;
		}
		
	}
	
	/**
	 * Creates a trigger message event
	 */
	protected AsynchronousMessageEvent generateMessageTriggerEvent(MessageType msgType)
	{
		AsynchronousMessageEvent event = rtscfactory.createAsynchronousMessageEvent();
		event.setKind(EventKind.TRIGGER);
		
		Message message = rtscfactory.createMessage();
		message.setInstanceOf(msgType);
		event.setMessage(message);
		
		return event;
	}

	/**
	 * Adds the given expression to the setup() function of the state
	 */
	public void addSetupExpressionTo(State scState,	String setupExpression) 
	{
		this.addExpressionToOp(scState.getEmbeddedRegions().get(0).getEmbeddedStatechart(), NAME_OP_SETUP, setupExpression);
		
	}
	
	/**
	 * Adds the given expression to the fading() function of the state
	 */
	public void addFadingExpressionTo(State scState, String fadingExpression) 
	{
		this.addExpressionToOp(scState.getEmbeddedRegions().get(0).getEmbeddedStatechart(), NAME_OP_FADING, fadingExpression);
	}

	/**
	 * Adds the given expression to the teardown() function of the state
	 */
	public void addTeardownExpressionTo(State scState,	String teardownExpression) 
	{
		this.addExpressionToOp(scState.getEmbeddedRegions().get(0).getEmbeddedStatechart(), NAME_OP_TEARDOWN, teardownExpression);
	}	
	
	/**
	 * Adds an expression as an implementation to the function in the rtsc
	 */
	protected void addExpressionToOp(RealtimeStatechart rtsc, String opName, String expression)
	{
		Operation operation = null;
		for(Operation op: rtsc.getOperations())
			if(opName.equals(op.getName()))
				operation = op;
		if(operation == null)
			throw new IllegalArgumentException(rtsc.getName() + "does not contain operation " + opName);
		
		TextualExpression operationImpl = ExpressionsFactory.eINSTANCE.createTextualExpression();
		operationImpl.setLanguage(LANG_MATLAB);
		operationImpl.setExpressionText(expression);
		operation.getImplementations().add(operationImpl);		
	}
	
	/**
	 * Sets the initial state
	 */
	public void setInitialState(RealtimeStatechart rtsc, State state, String initFunctionExpression)
	{
		this.addExpressionToOp(rtsc, NAME_OP_INITIAL, initFunctionExpression);
			
		State initial = null;
		for(State next: rtsc.getStates())
			if(NAME_STATE_INITIAL.equals(next.getName()))
				initial = next;
		if(initial == null)
			throw new IllegalArgumentException("No initial state found in " + rtsc);
		
		Transition transition = rtscfactory.createTransition();
		transition.setSource(initial);
		transition.setTarget(state);
		rtsc.getTransitions().add(transition);
	}


}
