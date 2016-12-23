package org.muml.simulink.adapter.reconfiguration.analysis.pre.reach.state;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.pim.component.DirectedTypedPort;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.component.PortDirectionKind;
import org.muml.pim.connector.Connector;
import org.muml.pim.connector.ConnectorInstance;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.AtomicComponentInstance;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.DelegationConnectorInstance;
import org.muml.pim.instance.PortConnectorInstance;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.instance.StructuredComponentInstance;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.State;
import org.muml.simulink.adapter.reconfiguration.analysis.pre.reach.ControlSignal;
import org.muml.simulink.adapter.reconfiguration.analysis.pre.reach.ReachGraphVisitor;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;

/**
 * Generates the content of the 'state_space' region in the state RTSC.
 * 
 * Warning: When used with a DFSReachGraphWaler, back transitions are left out.
 */
public class IndividualStateGenerator extends ReachGraphVisitor 
{
	private HashMap<StepGraph, State> states;
	private int counter = 0;
	private StateBehaviorGenerator behaviorGenerator;
	private RealtimeStatechart stateSpace;
	
	public IndividualStateGenerator(StateBehaviorGenerator behaviorGenerator, RealtimeStatechart stateSpace)
	{
		this.behaviorGenerator = behaviorGenerator;
		this.stateSpace = stateSpace;
	}
	
	@Override
	public void start(ReachabilityGraph graph)
	{
		this.states = new HashMap<StepGraph, State>();
		this.counter = 1;
	}	
	
	@Override
	public void finish(ReachabilityGraph graph)
	{
		State initial = this.states.get(graph.getStartState());
		
		//Define initial state
		String initExpression = this.generateInitialFunctionFor((StepGraph)graph.getStartState(), initial);
		this.behaviorGenerator.setInitialState(this.stateSpace, initial, initExpression);
	}

	@Override
	public void visit(ReachabilityGraphState state) 
	{
		if(state instanceof StepGraph)
			this.visit((StepGraph)state);
	}
	
	
	
	/**
	 * Generates one state for every StepGraph and one transition for every
	 * outgoing connection.
	 */
	public void visit(StepGraph state) 
	{		
		State newState = this.behaviorGenerator.generateState(counter);
		this.stateSpace.getStates().add(newState);
		
		this.states.put(state, newState);

		this.counter++;
	}
	
	@Override
	public void visit(ReachabilityGraphTransition transition) 
	{
		if(transition instanceof SDMTransition)
			this.visit((SDMTransition)transition);
	}
	
	public void visit(SDMTransition transition)
	{
		this.generateReconfigurationStateFor(transition);
	}
	
	/**
	 * Generates the hierarchical reconfiguration state for every transition.
	 */
	private void generateReconfigurationStateFor(SDMTransition transition)
	{
		State source = this.states.get((StepGraph) transition.getSource());
		State target = this.states.get((StepGraph) transition.getTarget());
		
		MessageType msg = this.getReconfigurationMessageForActivity(transition.getAppliedActivity());
		State reconfState = this.behaviorGenerator.generateReconfigurationState(source, target, msg);
				
		this.generatePhaseFunctionsFor(transition, reconfState);
	}
	
	/**
	 * Returns for the MessageType that is needed to execute this activity
	 */
	private MessageType getReconfigurationMessageForActivity(Activity activity)
	{
		String activityName = activity.getName().replace("_forEach", "");
		DiscretePort executorPort = (DiscretePort) this.stateSpace.getBehavioralElement();
		for(MessageType msgType: executorPort.getReceiverMessageTypes())
			if(activityName.equals(msgType.getName()))
				return msgType;
		throw new IllegalArgumentException("No MessageType found for Activity " + activity + ". Looking for " + activityName);
	}
	
	/**
	 * Generates the implementation of the 'initial' function.
	 */
	private String generateInitialFunctionFor(StepGraph startState, State initialState) 
	{
		LinkedList<EObject> deleted = new LinkedList<EObject>();
		LinkedList<EObject> created = new LinkedList<EObject>();
		
		StructuredComponentInstance root = this.getRootInstance(startState);
		for(ComponentInstance compInst: root.getEmbeddedCIC().getComponentInstances())
			created.add(compInst);
		
		for(PortConnectorInstance connInst: root.getEmbeddedCIC().getPortConnectorInstances())
			created.add(connInst);
				
		List<AtomicComponentInstance> fadingComponentInstances = this.getFadingComponentInstances(this.getRootInstance(startState));
		created.removeAll(fadingComponentInstances);
		
		List<PortConnectorInstance> continuous11Connections = new LinkedList<PortConnectorInstance>();
		HashMap<PortInstance,List<Connector>> continuous1NConnections = new HashMap<PortInstance,List<Connector>>();
		HashMap<PortInstance,List<Connector>> continuousN1Connections = new HashMap<PortInstance,List<Connector>>();		
		
		this.collectContinuousConnections(deleted, created, null, continuous11Connections,continuous1NConnections , continuousN1Connections );		
		
		String expression = this.generateTeardownExpression(deleted, created, continuous11Connections, continuous1NConnections, continuousN1Connections, fadingComponentInstances);
		return expression;
	}
	
	
	/**
	 * Collect all FadingComponents
	 */
	private List<AtomicComponentInstance> getFadingComponentInstances(StructuredComponentInstance parent) 
	{
		LinkedList<AtomicComponentInstance> instances = new LinkedList<AtomicComponentInstance>();
		for(ComponentInstance object: parent.getEmbeddedCIC().getComponentInstances())
			if(object instanceof AtomicComponentInstance)
				if(((AtomicComponentInstance)object).getComponentType().getName().equals("FadingComponent")) //Yep, ATM we don't have a specific muml element
					instances.add((AtomicComponentInstance) object);
		return instances;
	}

	/**
	 * Generates the setup/fading/teardown functions for the target
	 * state of the transition.
	 */
	private void generatePhaseFunctionsFor(SDMTransition transition, State reconfState)
	{
		StepGraph source = (StepGraph) transition.getSource();
		StepGraph target = (StepGraph) transition.getTarget();
				
		//Deleted part of source
		LinkedList<EObject> deleted = new LinkedList<EObject>();
		for(EObject object: transition.getIndex().keySet())
			if( transition.getIndex().get(object) == null)
				deleted.add(object);		
		
		deleted.remove(this.getRootInstance(source));
		
		
		//Created part of target
		LinkedList<EObject> created = new LinkedList<EObject>();
		for(EObject object: target.getChangeableNodes())
			if(!transition.getIndex().containsValue(object))
				created.add(object);	
		
		created.remove(this.getRootInstance(target));
			

		LinkedList<EObject> changed = new LinkedList<EObject>();
		changed.addAll(deleted);
		changed.addAll(created);
		
		List<AtomicComponentInstance> fadingComponentInstances = this.getFadingComponentInstances(this.getRootInstance(source));
		
		List<PortConnectorInstance> continuous11Connections = new LinkedList<PortConnectorInstance>();
		HashMap<PortInstance,List<Connector>> continuous1NConnections = new HashMap<PortInstance,List<Connector>>();
		HashMap<PortInstance,List<Connector>> continuousN1Connections = new HashMap<PortInstance,List<Connector>>();		
		
		this.collectContinuousConnections(deleted, changed, transition.getIndex(), continuous11Connections,continuous1NConnections , continuousN1Connections );		
		
		this.behaviorGenerator.addSetupExpressionTo(reconfState, this.generateSetupExpression(deleted, created, continuous11Connections, continuous1NConnections, transition.getIndex()));
		this.behaviorGenerator.addFadingExpressionTo(reconfState, this.generateFadingExpression(fadingComponentInstances));
		this.behaviorGenerator.addTeardownExpressionTo(reconfState, this.generateTeardownExpression(deleted, created, continuous11Connections, continuous1NConnections, continuousN1Connections, fadingComponentInstances));
	}
	
	/**
	 * Collect all changed 1:1, 1:n, and n:1 connectors
	 */
	private void collectContinuousConnections(LinkedList<EObject> deleted, LinkedList<EObject> changed, EMap<EObject, EObject> index, 
			List<PortConnectorInstance> continuous11Connections, HashMap<PortInstance,List<Connector>> continuous1NConnections,
			HashMap<PortInstance,List<Connector>> continuousN1Connections)
	{
				
		for(EObject object: changed)
		{
			if(object instanceof PortConnectorInstance)
			{
				//Problem Back-Edges: We have some elements which are not part of the index
				// and we can not match them. But: We can simply ignore them.
				if(index != null && !index.containsKey(object) && !index.containsValue(object))
					continue;
					
				PortConnectorInstance connector = (PortConnectorInstance) object;
				if(connector.getPortInstances().get(0).getPortType() instanceof DirectedTypedPort)
					continuous11Connections.add(connector);
			}
		}
		
		List<PortConnectorInstance> remove = new LinkedList<PortConnectorInstance>();
		
		for(PortConnectorInstance connector: continuous11Connections )
		{
			for(PortInstance endpoint: connector.getPortInstances())
			{
				//Found 1:N or N:1 Connection
				if(endpoint.getType().getConnectors().size() > 1)
				{
					//Is 1:N Connection						
					if(this.getSource(connector) == endpoint)
					{
						//Get shared source for both models							
						PortInstance source = endpoint;
						if(deleted.contains(connector))
							source = (PortInstance) index.get(source);
						
						if(!continuous1NConnections.containsKey(source))
							continuous1NConnections.put(source, new LinkedList<Connector>());
						
						remove.add(connector);
						if(connector instanceof DelegationConnectorInstance)
							continuous1NConnections.get(source).addAll(source.getType().getConnectors());
						else
							continuous1NConnections.get(source).addAll(source.getPortPart().getConnectors());
					}
					//Is N:1 Connection
					else
					{
						//Get shared target for both models
						PortInstance target = endpoint;
						if(deleted.contains(connector))
							target = (PortInstance) index.get(target);
						
						if(!continuousN1Connections.containsKey(target))
							continuousN1Connections.put(target, new LinkedList<Connector>());
						
						remove.add(connector);
						if(connector instanceof DelegationConnectorInstance)
							continuousN1Connections.get(target).addAll(target.getType().getConnectors());
						else
							continuousN1Connections.get(target).addAll(target.getPortPart().getConnectors());						
					}
				}
			}
		}
		
		//Remove 1:N, N:1 Connections from 1:1 Connections		
		continuous11Connections.removeAll(remove);

	}
		
	/**
	 * Compute the source port of a (continuous) PortConnectorInstance
	 */
	private PortInstance getSource(PortConnectorInstance connector)
	{
		if(connector instanceof DelegationConnectorInstance)
		{
			if(connector.getPortInstances().size() < 2)
			{				
				PortInstance p0 = connector.getPortInstances().get(0);
				if(((DirectedTypedPort)p0.getType()).getKind() == PortDirectionKind.IN)
					return connector.getPortInstances().get(0);
				return null;
			}
			
			PortInstance p0 = connector.getPortInstances().get(0);
			PortInstance p1 = connector.getPortInstances().get(1);
			
			if(this.portInstanceContainedIn(p0,p1.eContainer()))
			{
				//p0 is inner port, p1 is outer port
				DirectedTypedPort portType = (DirectedTypedPort) p0.getType();
				if(portType.getKind() == PortDirectionKind.IN)
					return p1;
				else
					return p0;
			}
			else
			{
				//p1 is inner port, p0 is outer port
				DirectedTypedPort portType = (DirectedTypedPort) p0.getType();
				if(portType.getKind() == PortDirectionKind.IN)
					return p0;
				else
					return p1;				
			}
		}
		else if(connector instanceof AssemblyConnectorInstance)
		{
			for(PortInstance portInst: connector.getPortInstances())
			{
				DirectedTypedPort port = (DirectedTypedPort) portInst.getType();
				if(port.getKind() == PortDirectionKind.OUT)
					return portInst;
			}
		}
		throw new IllegalArgumentException("No Source found for " + connector);		
	}
	
	/**
	 * Checks whether the portInstance is contained somewhere inside the componentInstance
	 */
	private boolean portInstanceContainedIn(PortInstance portInst, EObject componentInst)
	{
		EObject parent = portInst.eContainer();
		while(parent != null)
		{
			if(parent == componentInst)
				return true;
			parent = parent.eContainer();
		}
		return false;
	}

	/**
	 * Generates the expression for the implementation of the 'setup' function
	 */
	private String generateSetupExpression(LinkedList<EObject> deleted, LinkedList<EObject> created, List<PortConnectorInstance> continuous11Connections, HashMap<PortInstance, List<Connector>> continuous1NConnections,  EMap<EObject, EObject> index)
	{
		StringBuffer buffer = new StringBuffer();
		
		//Set all old instances active
		for(EObject element: deleted)
		{
			if(element instanceof ComponentInstance)
			{
				buffer.append("ctrl_inst_");
				buffer.append(((ComponentInstance)element).getName());
				buffer.append('=');
				buffer.append(ControlSignal.Component.ACTIVE);
				buffer.append(';');
				buffer.append("\\n\n");
			}
		}
		
		//Set all new instances active
		for(EObject element: created)
		{
			if(element instanceof ComponentInstance)
			{
				buffer.append("ctrl_inst_");
				buffer.append(((ComponentInstance)element).getName());
				buffer.append('=');
				buffer.append(ControlSignal.Component.ACTIVE);
				buffer.append(';');
				buffer.append("\\n\n");
			}
		}
				
		//Set all 1:n connections active
		for(Entry<PortInstance, List<Connector>> entry: continuous1NConnections.entrySet())
		{
			buffer.append("ctrl_conn_");
			buffer.append(entry.getKey().getName());
			buffer.append("=[");
			for(Connector connection: entry.getValue())
			{
				if(entry.getValue().indexOf(connection)  > 0)
					buffer.append(" ");	
				buffer.append(ControlSignal.Connection.ACTIVE);
			}
			buffer.append("];");
			buffer.append("\\n\n");
		}		
		buffer.append("setupOut = false;");//useless but needs to be there (action language transformation)
		return buffer.toString();
	}
	
	/**
	 * Generates the expression for the implementation of the 'fading' function
	 */
	private String generateFadingExpression(List<AtomicComponentInstance> fadingComponentInstances)
	{
		StringBuffer buffer = new StringBuffer();
		for(AtomicComponentInstance inst: fadingComponentInstances)
		{
			buffer.append("ctrl_fad_");
			buffer.append(inst.getName());
			buffer.append('=');
			buffer.append(ControlSignal.FadingComponent.FADING);
			buffer.append(';');
			buffer.append("\\n\n");
		}
		buffer.append("fadingOut = false;");//useless but needs to be there (action language transformation)
		return buffer.toString();
	}	
	
	/**
	 * Generates the expression for the implementation of the 'teardown' function
	 */
	private String generateTeardownExpression(LinkedList<EObject> deleted, LinkedList<EObject> created, List<PortConnectorInstance> continuous11Connections, HashMap<PortInstance, List<Connector>> continuous1NConnections, HashMap<PortInstance, List<Connector>> continuousN1Connections, List<AtomicComponentInstance> fadingComponentInstances)
	{
		StringBuffer buffer = new StringBuffer();
		
		for(EObject element: deleted)
		{
			if(element instanceof ComponentInstance)
			{
				buffer.append("ctrl_inst_");
				buffer.append(((ComponentInstance)element).getName());
				buffer.append('=');
				buffer.append(ControlSignal.Component.INACTIVE);
				buffer.append(';');
				buffer.append("\\n\n");
			}
		}
		
		for(EObject element: created)
		{
			if(element instanceof ComponentInstance)
			{
				buffer.append("ctrl_inst_");
				buffer.append(((ComponentInstance)element).getName());
				buffer.append('=');
				buffer.append(ControlSignal.Component.ACTIVE);
				buffer.append(';');
				buffer.append("\\n\n");
			}
		}		
		
		
		for(Entry<PortInstance, List<Connector>> entry: continuous1NConnections.entrySet())
		{			
			buffer.append("ctrl_conn_");
			buffer.append(entry.getKey().getName());
			buffer.append("=[");
					
			List<Connector> connections = entry.getValue();
			
			for(Connector connection: connections)
			{
				if(connections.indexOf(connection)  > 0)
					buffer.append(" ");
				
				int value = ControlSignal.Connection.INACTIVE;
				//Check if there exists an instance for every connector
				for(ConnectorInstance instance: entry.getKey().getConnectorInstances())
				{
					Connector type = instance.getType();
					
					if(!deleted.contains(instance) &&type == connection)
					{
						value = ControlSignal.Connection.ACTIVE;
						break;
					}
				}
				buffer.append(value);			
			}
			buffer.append("];");
			buffer.append("\\n\n");			
		}		
		
		for(Entry<PortInstance, List<Connector>> entry: continuousN1Connections.entrySet())
		{
			buffer.append("ctrl_conn_");
			buffer.append(entry.getKey().getName());
			buffer.append("=");
			int value = 0;
			for(Connector connection: entry.getValue())
			{				
				//Check if there exists an instance for every connector
				for(ConnectorInstance instance: entry.getKey().getConnectorInstances())
				{
					Connector type = instance.getType();				
					if(!deleted.contains(instance) && type == connection)
					{
						value = entry.getValue().indexOf(connection) +1;
						break;
					}
				}
				if(value != 0)
					break;
			}
			buffer.append(value);
			buffer.append(";");
			buffer.append("\\n\n");
		}		
		
		for(AtomicComponentInstance inst: fadingComponentInstances)
		{
			buffer.append("ctrl_fad_");
			buffer.append(inst.getName());
			buffer.append('=');
			buffer.append(ControlSignal.FadingComponent.INACTIVE);
			buffer.append(';');
			buffer.append("\\n\n");
		}
		
		buffer.append("teardownOut = false;");//useless but needs to be there (action language transformation)
		return buffer.toString();
	}	
	
	
	/**
	 * Returns the root structured componente instance for the given StepGraph
	 * 
	 */
	private StructuredComponentInstance getRootInstance(StepGraph graph)
	{
		for(EObject object: graph.getContains())
			if(object instanceof StructuredComponentInstance)
				if(((StructuredComponentInstance)object).eContainer() instanceof StepGraph)
					return (StructuredComponentInstance) object;
		throw new IllegalArgumentException("No root instance found for " + graph);
	}
}
