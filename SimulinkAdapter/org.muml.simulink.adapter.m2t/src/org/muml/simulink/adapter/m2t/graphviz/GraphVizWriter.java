package org.muml.simulink.adapter.m2t.graphviz;

import java.io.PrintWriter;

import org.muml.simulink.stateflow.Action;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.EmbeddedFunction;
import org.muml.simulink.stateflow.Node;
import org.muml.simulink.stateflow.State;
import org.muml.simulink.stateflow.Transition;

/**
 * Generates dot files (GraphViz) from a given StateflowMachine
 */
public class GraphVizWriter 
{
	public final static String INIT_STATE_NAME = "__init";
	public final static String EMF_PREFIX = "emf";
	public final static String STATE_PREFIX = "cluster";
	
	private PrintWriter writer = null;
		
	/**
	 * Generate a dot file from the given StateflowMachine
	 */
	public void write(PrintWriter writer, Chart chart)
	{
		this.writer = writer;		
		this.visitChart(chart);
		this.writer.flush();
	}
	

	
	/**
	 * Syntax:
	 * 	digraph Chart {
	 * 	__init [shape=box,label=""];
	 * 	...
	 * 	...
	 * 	}
	 */
	protected void visitChart(Chart chart)
	{
		this.writer.println("digraph \""+ chart.getName() +"\" {");
		
		this.writer.println("\"" + INIT_STATE_NAME + "\" [shape=box,label=\"\"];");	
		
		for(Node node:chart.getNodes())
			this.visitNode(node);
		
		for(Transition transition:chart.getTransitions())
			this.visitTransition(transition);
		
		for(EmbeddedFunction function: chart.getEmbeddedFunctions())
			this.visitEmbeddedFunction(function);
		
		this.writer.println("}");
	}
	

	protected void visitEmbeddedFunction(EmbeddedFunction function) 
	{
		//EmbeddedFunction always contained in a state(chart)
		State parent = (State)function.eContainer();
		int index = parent.getEmbeddedFunctions().indexOf(function);
		String name = EMF_PREFIX + index;
		if(!(parent instanceof Chart))
			name = this.getFullyQualifiedName(parent) + "/" + name;
		this.writer.println("\"" +  name  + "\" [shape=box,label=\""+function.getName()+"\"];");			
	}


	protected void visitNode(Node node)
	{
		if(node instanceof State)
			this.visitState((State)node);
		else
			this.visitJunctionOrHistory(node);
	}
	
	/**
	 * Syntax: 
	 * 	"Source" -> "Target" [id=indexOfTransition, label="[true]"]
	 */
	protected void visitTransition(Transition transition) 
	{	
		Node source = transition.getSource();
		String sourceName = this.getInitStateName(source);
			
		if(source != null)
		{
			sourceName = this.getFullyQualifiedName(source);
			if(source instanceof State && this.stateIsSubgraph((State) source))
				sourceName = STATE_PREFIX + sourceName;
		}
		
		Node target = transition.getTarget();
		String targetName = this.getFullyQualifiedName(target);
		if(target instanceof State && this.stateIsSubgraph((State) target))
			targetName = STATE_PREFIX + targetName;
		
		
		this.writer.print("\"");
		this.writer.print(sourceName);
		this.writer.print("\"");
		this.writer.print(" -> ");
		this.writer.print("\"");
		this.writer.print(targetName);
		this.writer.print("\"");
		this.writer.print(" [");
		if(source == null)
			this.writer.print("id=" + target.getIncoming().indexOf(transition));			
		else
			this.writer.print("id=" + source.getOutgoing().indexOf(transition));		
		this.writer.print(",label=\"");
		this.writer.print(this.createLabel(transition));
		this.writer.print("\"");
		this.writer.print("];\n");		
	}	
	
	/**
	 * Syntax State without SubStates:
	 *	"State" [shape=box,label="State"];
	 *
	 * Syntax State with SubStates:
	 * 	subgraph "clusterState" {
	 *	label = "State";
	 *	...
	 *	} 
	 */
	protected void visitState(State state)
	{
		if(!this.stateIsSubgraph(state))
		{
			this.writer.println("\"" + this.getFullyQualifiedName(state)+ "\" [shape=box,label=\""+state.getName()+"\"];");	
		}
		else
		{
			this.writer.println("subgraph \"" + STATE_PREFIX + this.getFullyQualifiedName(state) + "\" {");
			this.writer.println("label = \"" + state.getName() + "\";");
			for(Node node: state.getNodes())
				this.visitNode(node);
			for(Transition transition:state.getTransitions())
				this.visitTransition(transition);
			for(EmbeddedFunction function: state.getEmbeddedFunctions())
				this.visitEmbeddedFunction(function);
			this.writer.println("}");			
		}
		if (state.isInitial())
		{
			this.writer.print("\"");
			this.writer.print(this.getInitStateName(state));
			this.writer.print("\"");
			this.writer.print(" -> ");
			this.writer.print("\"");
			this.writer.print((this.stateIsSubgraph(state)?STATE_PREFIX:"")+this.getFullyQualifiedName(state));
			this.writer.print("\"");
			this.writer.print(";\n");
		}
	}
	
	/**
	 */
	protected void visitJunctionOrHistory(Node node)
	{
		this.writer.println("\"" + this.getFullyQualifiedName(node) + "\" [shape=point,height=0.1944,label=\"\"];");	
	}

	/**
	 * State/SubState/SubSubState
	 */
	protected String getFullyQualifiedName(Node node)
	{
		String name = Integer.toString(node.getParent().getNodes().indexOf(node));
		if(node.getParent() instanceof Chart)
			return name;
		else
			return this.getFullyQualifiedName(node.getParent()) + "/" + name;	
	}
		
	/**
	 * Syntax:
	 * 	event [condition]/transition_action
	 */
	protected String createLabel(Transition transition)
	{
		StringBuilder label = new StringBuilder();
		if(transition.getEvent() != null)
			label.append(transition.getEvent().getName());
		if(transition.getGuard() != null && transition.getGuard().size() > 0)
		{
			label.append("[");
			for(int i=0; i < transition.getGuard().size(); i++)
			{
				label.append(transition.getGuard().get(i).getExpression());
				if(i < transition.getGuard().size() -1)
					label.append(" && ");
			}
			label.append("]");
		}
		if(transition.getAction() != null && transition.getAction().size() > 0)
		{
			label.append("/");
			for(Action action: transition.getAction())
				label.append(action.getExpression()).append(";");
		}
		
		return label.toString().replace("\n", "\\n").replace("\r", "");
		
	}
	
	/**
	 * Checks whether the state needs to be modeled as a subGraph or not
	 * @return
	 */
	protected boolean stateIsSubgraph(State state)
	{
		return state.getNodes().size() != 0 || state.getEmbeddedFunctions().size() != 0;
	}
	
	/**
	 * Returns the name of the current init state 
	 */
	protected String getInitStateName(Node node)
	{
		if(node.getParent() instanceof Chart)
			return INIT_STATE_NAME;
		return this.getFullyQualifiedName(node.getParent()) + INIT_STATE_NAME;
	}
}
