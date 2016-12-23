package org.muml.simulink.adapter.parser;

import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;

import org.muml.simulink.DataType;
import org.muml.simulink.stateflow.Action;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.Data;
import org.muml.simulink.stateflow.EmbeddedFunction;
import org.muml.simulink.stateflow.Event;
import org.muml.simulink.stateflow.History;
import org.muml.simulink.stateflow.Junction;
import org.muml.simulink.stateflow.Node;
import org.muml.simulink.stateflow.State;
import org.muml.simulink.stateflow.StateflowElement;
import org.muml.simulink.stateflow.StateflowFactory;
import org.muml.simulink.stateflow.StateflowMachine;
import org.muml.simulink.stateflow.SubStateType;
import org.muml.simulink.stateflow.Transition;

import edu.tum.cs.simulink.model.SimulinkConstants;


public class StateflowBuilder extends BuilderBase
{
	protected StateflowFactory factory = StateflowFactory.eINSTANCE;
	
	@SuppressWarnings("rawtypes")
	protected HashMap<edu.tum.cs.simulink.model.stateflow.StateflowElementBase,StateflowElement> stateTraceModel = null;
	
	

	public StateflowMachine buildStateflowMachine(edu.tum.cs.simulink.model.stateflow.StateflowMachine sourceMachine) throws StateflowBuilderException
	{
		StateflowMachine machine = this.factory.createStateflowMachine();
		
		this.copyParameters(sourceMachine, machine);
		this.remapId(machine);
		
		for(edu.tum.cs.simulink.model.stateflow.StateflowChart chart: sourceMachine.getCharts())
			machine.getCharts().add(this.buildChart(chart));
		
		return machine;
	}
	
	@SuppressWarnings("rawtypes")
	public Chart buildChart(edu.tum.cs.simulink.model.stateflow.StateflowChart sourceChart) throws StateflowBuilderException
	{
		Chart targetChart = this.factory.createChart();
		
		this.copyParameters(sourceChart, targetChart);	
		this.remapId(targetChart);
		
		targetChart.setName(targetChart.getParameter(SimulinkConstants.PARAM_name));
		this.deleteParameter(targetChart, SimulinkConstants.PARAM_name);
		
		targetChart.setInitial(true);
		targetChart.setPriority(1);
		
		//Init state trace model
		this.stateTraceModel = new HashMap<edu.tum.cs.simulink.model.stateflow.StateflowElementBase,StateflowElement>();
		
		//Events
		for(edu.tum.cs.simulink.model.stateflow.StateflowEvent event: sourceChart.getEvents())
			targetChart.getEvents().add(this.buildEvent(event));	
		
		for(edu.tum.cs.simulink.model.stateflow.StateflowData data: sourceChart.getData())
		{
			Data targetData = this.buildData(data);
			String scope = targetData.getParameter("scope");
			
			if(scope == null)
				throw new StateflowBuilderException("No parameter scope for " + data);
			
			if(scope.equals("INPUT_DATA"))
				targetChart.getInput().add(targetData);
			else if(scope.equals("OUTPUT_DATA"))
				targetChart.getOutput().add(targetData);
			else if(scope.equals("LOCAL_DATA"))
				targetChart.getLocal().add(targetData);
			else if(scope.equals("CONSTANT_DATA"))
				targetChart.getConstant().add(targetData);
			else
				throw new StateflowBuilderException("Invalid scope value for " + data + ": " + scope);
		}		
		
		this.processSubStates(sourceChart.getNodes(), (State)targetChart);
		
		return targetChart;
	}
	

	public State buildState(edu.tum.cs.simulink.model.stateflow.StateflowState sourceState, State parent) throws StateflowBuilderException
	{
		State targetState = this.factory.createState();
		this.stateTraceModel.put(sourceState, targetState);
		
		targetState.setParent(parent);
		
		this.copyParameters(sourceState, targetState);
		this.remapId(targetState);
		
		//Events
		for(edu.tum.cs.simulink.model.stateflow.StateflowEvent event: sourceState.getEvents())
			targetState.getEvents().add(this.buildEvent(event));
		
		//name, entryAction, duringAction, exitAction
		if(targetState.getParameter(SimulinkConstants.PARAM_labelString) != null)
		{
			this.stateProcessLabel(targetState, targetState.getParameter(SimulinkConstants.PARAM_labelString));
			this.deleteParameter(targetState, SimulinkConstants.PARAM_labelString);
		}
		
		//initial
		targetState.setInitial(this.stateIsInital(sourceState));
		
		//type
		targetState.setSubStateType(this.stateGetSubStateType(sourceState));
		this.deleteParameter(targetState, SimulinkConstants.PARAM_type);
		
		//priority
		targetState.setPriority(this.stateGetPriority(sourceState));
		this.deleteParameter(targetState, "executionOrder");
		
		for(edu.tum.cs.simulink.model.stateflow.StateflowData data: sourceState.getData())
		{
			Data targetData = this.buildData(data);
			String scope = targetData.getParameter("scope");
			
			if(scope == null)
				throw new StateflowBuilderException("No parameter scope for " + data);			
			else if(scope.equals("LOCAL_DATA"))
				targetState.getLocal().add(targetData);
			else if(scope.equals("CONSTANT_DATA"))
				targetState.getConstant().add(targetData);
			else
				throw new StateflowBuilderException("Invalid scope value for " + data + ": " + scope);
		}		
		
		//SubStates
		this.processSubStates(sourceState.getNodes(), targetState);
				
		return targetState;
	}
	
	public Event buildEvent(edu.tum.cs.simulink.model.stateflow.StateflowEvent sourceEvent) throws StateflowBuilderException
	{
		Event targetEvent = this.factory.createEvent();
		
		this.copyParameters(sourceEvent, targetEvent);
		this.remapId(targetEvent);
		
		//name
		targetEvent.setName(sourceEvent.getName());
		this.deleteParameter(targetEvent, SimulinkConstants.PARAM_name);
		
		return targetEvent;		
	}
	
	/**
	 * StateflowTransition -> Transition
	 * 
	 * @throws StateflowBuilderException
	 */
	private Transition buildTransition(edu.tum.cs.simulink.model.stateflow.StateflowTransition sourceTransition) throws StateflowBuilderException 
	{
		Transition targetTransition = this.factory.createTransition();
		
		this.copyParameters(sourceTransition, targetTransition);
		this.remapId(targetTransition);
		
		targetTransition.setSource((Node) this.stateTraceModel.get(sourceTransition.getSrc()));
		targetTransition.setTarget((Node) this.stateTraceModel.get(sourceTransition.getDst()));
		
		//event, guard, action
		this.transitionProcessLabel(targetTransition, targetTransition.getParameter(SimulinkConstants.PARAM_labelString));
		this.deleteParameter(targetTransition, SimulinkConstants.PARAM_labelString);
		
		//priority
		targetTransition.setPriority(this.transitionGetPriority(sourceTransition));
		this.deleteParameter(targetTransition, "executionOrder");	

		return targetTransition;
	}	
	
	private EmbeddedFunction buildEmbeddedFunction(edu.tum.cs.simulink.model.stateflow.StateflowState sourceFunction) throws StateflowBuilderException
	{
		assert "1".equals(sourceFunction.getParameter("eml.isEML"));
		
		EmbeddedFunction targetFunction = this.factory.createEmbeddedFunction();
		this.copyParameters(sourceFunction, targetFunction);
		this.remapId(targetFunction);
		
		targetFunction.setName(targetFunction.getParameter("labelString"));		
		this.deleteParameter(targetFunction, "labelString");
		
		targetFunction.setCode(targetFunction.getParameter("eml.script"));
		this.deleteParameter(targetFunction, "eml.script");
		this.deleteParameter(targetFunction, "eml.isEML");
		
		for(edu.tum.cs.simulink.model.stateflow.StateflowData data: sourceFunction.getData())
		{
			Data targetData = this.buildData(data);
			String scope = targetData.getParameter("scope");
			
			if(scope == null)
				throw new StateflowBuilderException("No parameter scope for " + data);
			
			if(scope.equals("FUNCTION_INPUT_DATA"))
				targetFunction.getInput().add(targetData);
			else if(scope.equals("FUNCTION_OUTPUT_DATA"))
				targetFunction.getOutput().add(targetData);
			else if(scope.equals("LOCAL_DATA"))
				targetFunction.getLocal().add(targetData);
			else if(scope.equals("CONSTANT_DATA"))
				targetFunction.getConstant().add(targetData);
			else
				throw new StateflowBuilderException("Invalid scope value for " + data + ": " + scope);
		}
		
		return targetFunction;
	}	
	
	/**
	 * Common steps to process subStates
	 * @throws StateflowBuilderException
	 */
	private void processSubStates(edu.tum.cs.commons.collections.UnmodifiableSet<edu.tum.cs.simulink.model.stateflow.StateflowNodeBase> sourceSubStates, State targetState) throws StateflowBuilderException
	{
		//Collection of all transitions. Needed because, we have to first create all states and 
		// only after that we can create the transformations
		HashSet<edu.tum.cs.simulink.model.stateflow.StateflowTransition> sourceTransitions	= new HashSet<edu.tum.cs.simulink.model.stateflow.StateflowTransition> ();
		
		for(edu.tum.cs.simulink.model.stateflow.StateflowNodeBase node: sourceSubStates)
		{
			if(node instanceof edu.tum.cs.simulink.model.stateflow.StateflowState)
			{
				//Embedded functions are modeled as State
				if("1".equals(node.getParameter("eml.isEML")))
				{
					EmbeddedFunction targetFunction = this.buildEmbeddedFunction((edu.tum.cs.simulink.model.stateflow.StateflowState)node);
					targetState.getEmbeddedFunctions().add(targetFunction);
					
					this.stateTraceModel.put(node, targetState);
				}
				//Regular states
				else
				{				
					edu.tum.cs.simulink.model.stateflow.StateflowState sourceSubState = (edu.tum.cs.simulink.model.stateflow.StateflowState) node;
					State targetSubState = this.buildState(sourceSubState, targetState);
					targetState.getNodes().add(targetSubState);
					this.stateTraceModel.put(sourceSubState, targetSubState);
					
					sourceTransitions.addAll(sourceSubState.getInTransitions());
					sourceTransitions.addAll(sourceSubState.getOutTransitions());
				}
			}
			else if(node instanceof edu.tum.cs.simulink.model.stateflow.StateflowJunction)
			{
				Node targetNode = null;
				edu.tum.cs.simulink.model.stateflow.StateflowJunction sourceJunction = (edu.tum.cs.simulink.model.stateflow.StateflowJunction)node;
				//History state
				if("HISTORY_JUNCTION".equals(node.getParameter("type")))
				{
					targetNode = this.buildHistory(sourceJunction);
				}		
				else
				{
					targetNode = this.buildJunction(sourceJunction);					
				}

				targetState.getNodes().add(targetNode);
				
				sourceTransitions.addAll(sourceJunction.getInTransitions());
				sourceTransitions.addAll(sourceJunction.getOutTransitions());
			}
		}
		
		for(edu.tum.cs.simulink.model.stateflow.StateflowTransition sourceTransition: sourceTransitions)
		{
			//We don't want to have initial transitions in our model. Initial transitions
			// are represented by the initial attribute of a state.
			if(!this.transitionIsInitial(sourceTransition))
				targetState.getTransitions().add(this.buildTransition(sourceTransition));
		}
	}
	

	/**
	 * StateflowJunction[type=HISTORY_JUNCTION] -> History
	 */
	private History buildHistory(edu.tum.cs.simulink.model.stateflow.StateflowJunction node) {
		History targetHistory = this.factory.createHistory();
		this.stateTraceModel.put(node, targetHistory);
		
		this.copyParameters(node, targetHistory);
		
		return targetHistory;
	}

	/**
	 * StateflowJunction -> Junction
	 */
	private Junction buildJunction(edu.tum.cs.simulink.model.stateflow.StateflowJunction sourceJunction) 
	{
		Junction targetJunction = this.factory.createJunction();
		this.stateTraceModel.put(sourceJunction, targetJunction);
		
		this.copyParameters(sourceJunction, targetJunction);
		
		return targetJunction;
	}
	
	/**
	 * StateflowData -> Data
	 * @throws StateflowBuilderException 
	 */
	private Data buildData(edu.tum.cs.simulink.model.stateflow.StateflowData sourceData) throws StateflowBuilderException
	{
		Data targetData = this.factory.createData();
		this.stateTraceModel.put(sourceData, targetData);
		
		this.copyParameters(sourceData, targetData);
		
		targetData.setName(targetData.getParameter("name"));
		this.deleteParameter(targetData, "name");
		
		String type = targetData.getParameter("dataType");
		if(type == null)
			throw new StateflowBuilderException("No type given for " + sourceData);
		
		targetData.setType(DataType.get(type));
		this.deleteParameter(targetData, "dataType");
		
		String initialValue = targetData.getParameter("props.initialValue");
		if(initialValue != null)
		{
			targetData.setValue(initialValue);
			this.deleteParameter(targetData, "props.initialValue");
		}
		
		String size = targetData.getParameter("props.array.size");
		if(size != null)
		{
			targetData.setSize(size);
			this.deleteParameter(targetData, "props.array.size");
		}
		
		return targetData;
	}
	
	/**
	 * Extracts the attributes name, entryAction, duringAction and exitAction
	 * from a Stateflow labelString and sets them on the given state.
	 * @param state
	 * @param label
	 */
	private void stateProcessLabel(State state, String label)
	{
		StateLabelParser lsParser = new StateLabelParser();
		StateLabelParser.LabelString lsParts = lsParser.parseLabelString(label);
		
		if(lsParts.name != null)
			state.setName(lsParts.name);
		
		if(lsParts.entryAction != null)
		{
			Action entryAction = this.factory.createAction();
			entryAction.setExpression(lsParts.entryAction);
			state.getEntryAction().add(entryAction);
		}
		
		if(lsParts.duringAction != null)
		{
			Action duringAction = this.factory.createAction();
			duringAction.setExpression(lsParts.duringAction);
			state.getDuringAction().add(duringAction);
		}
		
		if(lsParts.exitAction != null)
		{
			Action exitAction = this.factory.createAction();
			exitAction.setExpression(lsParts.exitAction);
			state.getExitAction().add(exitAction);
		}
		
	}
	
	/**
	 * Checks whether the given state is an initial state.
	 * @param sourceState
	 * @return
	 */
	private boolean stateIsInital(edu.tum.cs.simulink.model.stateflow.StateflowState sourceState)
	{
		for(edu.tum.cs.simulink.model.stateflow.StateflowTransition transition: sourceState.getInTransitions())
			if(this.transitionIsInitial(transition))
				return true;		
		return false;
	}
	
	/**
	 * Checks whether the subStates of this state are parallel or exclusive.
	 * @param sourceState
	 * @return
	 */
	private SubStateType stateGetSubStateType(edu.tum.cs.simulink.model.stateflow.StateflowState sourceState)
	{
		for(edu.tum.cs.simulink.model.stateflow.StateflowNodeBase node: sourceState.getNodes())
			if("AND_STATE".equals(node.getParameter(SimulinkConstants.PARAM_type)))
					return SubStateType.PARALLEL;		
		return SubStateType.EXCLUSIVE;
	}
	
	/**
	 * Computes the priority of the state
	 * @param sourceState
	 * @return
	 */
	private int stateGetPriority(edu.tum.cs.simulink.model.stateflow.StateflowState sourceState)
	{
		if(sourceState.getParameter("executionOrder") != null)
		{
			return Integer.parseInt(sourceState.getParameter("executionOrder"));
		}
		return 1;
	}
	
	/**
	 * Extracts event, guard and action from the given labelString
	 * @param transition
	 * @param labelString
	 * @throws StateflowBuilderException 
	 */
	private void transitionProcessLabel(Transition transition, String labelString) throws StateflowBuilderException
	{
		if(labelString == null)
			return;
		
		TransitionLabelParser labelParser = new TransitionLabelParser();
		TransitionLabelParser.Label label = labelParser.parseLabel(labelString);
		
		if(label.event != null)
			transition.setEvent(this.findEvent(label.event, transition.getSource()));
		
		if(label.condition != null)
		{
			for(String currCond: label.condition)
			{
				Action condition = this.factory.createAction();
				condition.setExpression(currCond);
				transition.getGuard().add(condition);
			}
		}
				
		if(label.conditionAction  != null)
		{
			Action transitionAction = this.factory.createAction();
			transitionAction.setExpression(label.conditionAction );
			transition.getAction().add(transitionAction);
		}
		
		//the label.transitionAction is not used
		
	}
	
	/**
	 * Computes the priority for the transition
	 * @param sourceTransition
	 * @return
	 */
	private int transitionGetPriority(edu.tum.cs.simulink.model.stateflow.StateflowTransition sourceTransition)
	{
		if(sourceTransition.getParameter("executionOrder") != null)
		{
			return Integer.parseInt(sourceTransition.getParameter("executionOrder"));
		}
		return 1;
	}
	
	/**
	 * Computes whether the given transition is a default transition or not
	 * @return
	 */
	private boolean transitionIsInitial(edu.tum.cs.simulink.model.stateflow.StateflowTransition transition)
	{
		if(transition.getSrc() == null)
			return true;
		return false;
	}
	
	/**
	 * Recursively finds the Event for the given name
	 * @param name
	 * @param root
	 * @return
	 * @throws StateflowBuilderException
	 */
	private Event findEvent(String name, Node rootNode) throws StateflowBuilderException
	{
		//Ignore Temporal Logic
		if(name.startsWith("after(") || name.startsWith("before(") || name.startsWith("at(") || name.startsWith("every(") ||
				name.startsWith("temporalCount("))
			return null;
			
		if(!(rootNode instanceof State))
			return this.findEvent(name, rootNode.getParent());
		
		State rootState = (State) rootNode;
		
		for(Event event: rootState.getEvents())
			if(name.equals(event.getName()))
				return event;
		if(rootState.getParent() != null)
			return this.findEvent(name, rootState.getParent());
		
		//create implicit events
		if(name.equals("wakeup") || name.equals("impl"))
		{
			Event implEvent = StateflowFactory.eINSTANCE.createEvent();
			implEvent.setName(name);
			rootState.getEvents().add(implEvent);
			return implEvent;
		}
				
		throw new StateflowBuilderException("Could not find Event '" +name+ "'");
	}
	
	private void remapId(StateflowElement element) throws StateflowBuilderException
	{
		String sourceId = element.getParameter("tag");
		if(sourceId != null)
		{
			//Check if id is given
			Matcher idMatcher = SimulinkBuilder.ID_PATTERN.matcher(sourceId);
			if(idMatcher.find())
			{
				element.setId(idMatcher.group(1));
			}
		}
		
	}
}
