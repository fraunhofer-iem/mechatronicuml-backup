package org.muml.simulink.adapter.m2t.graphviz;

import org.muml.simulink.stateflow.Action;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.EmbeddedFunction;
import org.muml.simulink.stateflow.Junction;
import org.muml.simulink.stateflow.State;
import org.muml.simulink.stateflow.StateflowFactory;
import org.muml.simulink.stateflow.Transition;

public class GraphVizTestModelFactory 
{
	private StateflowFactory factory = StateflowFactory.eINSTANCE;
		
	protected Chart simpleChartSinlgeStateModel()
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		State state = this.factory.createState();
		state.setName("State");
		chart.getNodes().add(state);
		
		return chart;
	}
	
	protected Chart subStateModel() 
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		State state = this.factory.createState();
		state.setName("State");
		chart.getNodes().add(state);	
		
		State subState = this.factory.createState();
		subState.setName("SubState");
		state.getNodes().add(subState);
		
		return chart;		
	}

	protected Chart nestedSubStatesModel()
	{		
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		State state = this.factory.createState();
		state.setName("State");
		chart.getNodes().add(state);	
		
		State subState = this.factory.createState();
		subState.setName("SubState");
		state.getNodes().add(subState);
		
		State subSubState = this.factory.createState();
		subSubState.setName("SubSubState");
		subState.getNodes().add(subSubState);
		return chart;
	}
	
	protected Chart twoSubStatesModel()
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		State state = this.factory.createState();
		state.setName("State");
		chart.getNodes().add(state);	
		
		State subStateA = this.factory.createState();
		subStateA.setName("SubStateA");	
		state.getNodes().add(subStateA);
		
		State subSubStateA = this.factory.createState();
		subSubStateA.setName("SubSubStateA");
		subStateA.getNodes().add(subSubStateA);
		
		State subStateB = this.factory.createState();
		subStateB.setName("SubStateB");	
		state.getNodes().add(subStateB);
		
		State subSubStateB = this.factory.createState();
		subSubStateB.setName("SubSubStateB");
		subStateB.getNodes().add(subSubStateB);
		
		return chart;
	}
	
	protected Chart transitionModel()
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		State stateA = this.factory.createState();
		stateA.setName("StateA");
		chart.getNodes().add(stateA);	
		
		State stateB = this.factory.createState();
		stateB.setName("StateB");
		chart.getNodes().add(stateB);
		
		Transition transition = this.factory.createTransition();
		transition.setSource(stateA);
		transition.setTarget(stateB);
		Action guard = this.factory.createAction();
		guard.setExpression("true");
		transition.getGuard().add(guard);
		chart.getTransitions().add(transition);
		
		return chart;
	}
	
	protected Chart initStateModel()
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		State state = this.factory.createState();
		state.setName("State");
		state.setInitial(true);
		chart.getNodes().add(state);
		
		return chart;		
	}
	
	protected Chart junctionModel()
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		State state = this.factory.createState();
		state.setName("State");
		chart.getNodes().add(state);
		
		Junction junction = this.factory.createJunction();
		chart.getNodes().add(junction);
		
		Transition transitionA = this.factory.createTransition();
		transitionA.setSource(state);
		transitionA.setTarget(junction);
		chart.getTransitions().add(transitionA);
		
		Transition transitionB = this.factory.createTransition();
		transitionB.setSource(junction);
		transitionB.setTarget(state);
		chart.getTransitions().add(transitionB);
		
		return chart;
	}
	
	protected Chart embeddedFunctionModel() 
	{
		Chart chart = this.factory.createChart();
		chart.setName("Chart");
		
		State state = this.factory.createState();
		state.setName("State");
		chart.getNodes().add(state);
		
		EmbeddedFunction doSomething = this.factory.createEmbeddedFunction();
		doSomething.setName("doSomething");
		chart.getEmbeddedFunctions().add(doSomething);
		
		State subState = this.factory.createState();
		subState.setName("SubState");
		state.getNodes().add(subState);
		
		EmbeddedFunction nestedEMF = this.factory.createEmbeddedFunction();
		nestedEMF.setName("nestedEMF");
		state.getEmbeddedFunctions().add(nestedEMF);
		
		return chart;		
	}	
}
