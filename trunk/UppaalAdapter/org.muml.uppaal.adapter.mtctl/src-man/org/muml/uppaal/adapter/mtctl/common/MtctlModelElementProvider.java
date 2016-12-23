package org.muml.uppaal.adapter.mtctl.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.muml.pim.behavior.Behavior;
import org.muml.pim.behavior.Variable;
import org.muml.pim.component.AtomicComponent;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.component.Port;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.connector.DiscreteInteractionEndpointInstance;
import org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance;
import org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.instance.AtomicComponentInstance;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.instance.StructuredComponentInstance;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.protocol.AbstractCoordinationSpecification;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.Role;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.uppaal.adapter.mtctl.Expression;
import org.muml.uppaal.adapter.mtctl.quantifiers.BoundVariable;
import org.muml.uppaal.adapter.mtctl.sets.InstanceSetExpr;

public class MtctlModelElementProvider {
	protected VerifiableElement root;
	
	//Elements
	protected Set<State> states = new HashSet<State>(); //set of states in realtimestatecharts that are available in the current top-level muml element
	protected Set<Variable> variables = new HashSet<Variable>();
	protected Set<Clock> clocks = new HashSet<Clock>();
	protected Set<MessageType> messageTypes = new HashSet<MessageType>();
	protected Set<MessageBuffer> buffers = new HashSet<MessageBuffer>();
	protected Set<Transition> transitions = new HashSet<Transition>();
	protected Set<RealtimeStatechart> statecharts = new HashSet<RealtimeStatechart>();
	protected Set<ConnectorEndpoint> connectorEndpoints = new HashSet<ConnectorEndpoint>();
	protected Set<ConnectorEndpointInstance> connectorEndpointInstances = new HashSet<ConnectorEndpointInstance>();
	protected Set<AtomicComponentInstance> componentInstances = new HashSet<AtomicComponentInstance>();
	protected Set<AtomicComponent> components = new HashSet<AtomicComponent>();
	
	public MtctlModelElementProvider(VerifiableElement root) {
		this.root = root;
		init();
	}
	
	/**
	 * Creates a MtctlModelElementProvider for an expression, setting root to its verifiable element
	 */
	public MtctlModelElementProvider(Expression expr) {
		this.root = getVerifiableElement(expr);
		init();
	}
	
	/**
	 * Returns the VerifiableElement that the supplied mtctl expression belongs to
	 */
	public static VerifiableElement getVerifiableElement(Expression expr) {
		EObject obj = expr;
		while (!(obj instanceof VerifiableElement)) {
			obj = obj.eContainer();
		}
		return (VerifiableElement) obj;
	}
	
	private void init() {
		//Delegate to the specific methods for the type of root for initialization
		if (root instanceof AbstractCoordinationSpecification)
			initForCoordinationProtocol((AbstractCoordinationSpecification) root);
		else if (root instanceof AtomicComponent)
			initForAtomicComponent((AtomicComponent) root);
		else if (root instanceof ComponentInstanceConfiguration)
			initForCIC((ComponentInstanceConfiguration) root);
		else
			System.out.println("MtctlModelElementProvider doesn't know how to handle "+root.toString()+" :'(");
	}

	/**
	 * Called by setScopeForEObject() if the top-level-element is an AbstractCoordinationSpecification.
	 * Collects everything that can be referenced from mtctl in an AbstractCoordinationSpecification.
	 * @param object
	 */
	private void initForCoordinationProtocol(AbstractCoordinationSpecification object) {
		HashSet<MessageType> messageTypes = new HashSet<MessageType>();
		HashSet<MessageBuffer> buffers = new HashSet<MessageBuffer>();
		
		//States, Clocks, Variables, MessageTypes
		for (Role role : object.getRoles()) {
			connectorEndpoints.add(role);
			addRtscElementsToArrays(role.getBehavior());
			messageTypes.addAll(role.getReceiverMessageTypes());
			messageTypes.addAll(role.getSenderMessageTypes());
			buffers.addAll(role.getReceiverMessageBuffer());
		}
		
		this.messageTypes.addAll(messageTypes);
		this.buffers.addAll(buffers);
	}
	
	/**
	 * Called by setScopeForEObject() if the top-level-element is an AtomicComponent.
	 * Collects everything that can be referenced from mtctl in an AtomicComponent.
	 * @param object
	 */
	private void initForAtomicComponent(AtomicComponent object) {
		HashSet<MessageType> messageTypes = new HashSet<MessageType>();
		HashSet<MessageBuffer> buffers = new HashSet<MessageBuffer>();
		
		components.add(object);
		//Component behavior
		addRtscElementsToArrays(object.getBehavior());
		
		//Port behavior
		for (Port port : object.getPorts()) {
			if (port instanceof DiscretePort) {
				connectorEndpoints.add(port);
				addRtscElementsToArrays(((DiscretePort) port).getBehavior());
				messageTypes.addAll(((DiscretePort) port).getReceiverMessageTypes());
				messageTypes.addAll(((DiscretePort) port).getSenderMessageTypes());
				buffers.addAll(((DiscretePort) port).getReceiverMessageBuffer());
			}
		}
		
		this.messageTypes.addAll(messageTypes);
		this.buffers.addAll(buffers);
	}
	
	
	/**
	 * Called by setScopeForEObject() if the top-level-element is an ComponentInstanceConfiguration.
	 * Collects everything that can be referenced from mtctl in an ComponentInstanceConfiguration.
	 * @param object
	 */
	private void initForCIC(ComponentInstanceConfiguration object) {
		HashSet<MessageType> messageTypes = new HashSet<MessageType>();
		HashSet<MessageBuffer> buffers = new HashSet<MessageBuffer>();
		
		// add all RTSC elements, message types, and buffers from the Ports of the PortInstances of the contained ComponentInstances
		for (ComponentInstance componentInstance : object.getComponentInstances()) {
			if (componentInstance instanceof StructuredComponentInstance)
				initForCIC(((StructuredComponentInstance) componentInstance).getEmbeddedCIC());
			for (PortInstance portInstance : componentInstance.getPortInstances()) {
				if (portInstance.getPortType() instanceof DiscretePort) {
					connectorEndpointInstances.add(portInstance);
					DiscretePort port = (DiscretePort) portInstance.getPortType();
					connectorEndpoints.add(port);
					messageTypes.addAll(((DiscretePort) port).getReceiverMessageTypes());
					messageTypes.addAll(((DiscretePort) port).getSenderMessageTypes());
					buffers.addAll(((DiscretePort) port).getReceiverMessageBuffer());					
				}
			}
			if (componentInstance instanceof AtomicComponentInstance) {
				addRtscElementsToArrays(((AtomicComponent) componentInstance.getComponentType()).getBehavior());
				components.add((AtomicComponent) componentInstance.getComponentType());
				componentInstances.add((AtomicComponentInstance) componentInstance);
			}
		}		
		this.messageTypes.addAll(messageTypes);
		this.buffers.addAll(buffers);
	}
	
	/**
	 * Adds the contained (interesting) elements of rtsc to the arrays "states", "clocks", ...
	 * (Helper function)
	 */
	private void addRtscElementsToArrays(Behavior rtsc) {
		if (rtsc == null || !(rtsc instanceof RealtimeStatechart))
			return;
		
		for (RealtimeStatechart innerRtsc : findEmbeddedStatecharts((RealtimeStatechart) rtsc)) {
			states.addAll(innerRtsc.getStates());
			transitions.addAll(innerRtsc.getTransitions());
			clocks.addAll(innerRtsc.getClocks());
			variables.addAll(innerRtsc.getVariables());
			statecharts.add(innerRtsc);
		}
	}
	
	/**
	 * Computes the transitive closure of the sub-statechart relation rooted in rtsc
	 * @param rtsc statechart to start from
	 * @return list of all statecharts that are sub-statecharts of rtsc
	 */
	private List<RealtimeStatechart> findEmbeddedStatecharts(RealtimeStatechart rtsc) {
		ArrayList<RealtimeStatechart> result = new ArrayList<RealtimeStatechart>();
		if (rtsc == null)
			return result; 
		result.add(rtsc);
		
		for (State state : rtsc.getStates())
			for (Region region : state.getEmbeddedRegions()) //find all regions in direct substates
				result.addAll(findEmbeddedStatecharts(region.getEmbeddedStatechart())); //find all statecharts in there, add them
		
		return result;
	}
	
	/**
	 * Returns the InstanceType (e.g., ConnectorEndpoint) that obj (e.g., a State(chart)) logically belongs to
	 */
	public EObject getInstanceType(EObject obj) {
		if (obj == null)
			return null;

		//BoundVariables: return the type of the InstanceSetExpr
		if (obj instanceof BoundVariable)
			return (((BoundVariable) obj).getSet() instanceof InstanceSetExpr) ? ((InstanceSetExpr) ((BoundVariable) obj).getSet()).getType() : null;
		
		//Message Buffers
		if (obj instanceof MessageBuffer)
			return ((MessageBuffer) obj).getDiscreteInteractionEndpoint();
		
		if (obj instanceof Region)
			return getInstanceType(((Region) obj).getParentState());
		
		if (obj instanceof RealtimeStatechart) {
			if (((RealtimeStatechart) obj).getBehavioralElement() != null)
				return ((RealtimeStatechart) obj).getBehavioralElement();
			
			return getInstanceType(((RealtimeStatechart) obj).eContainer());
		}
		
		//States, Transitions, Clocks, Variables
		if (obj.eContainer() instanceof RealtimeStatechart)
			return getInstanceType(obj.eContainer());
		
		if (obj instanceof ConnectorEndpointInstance)
			return ((ConnectorEndpointInstance) obj).getType();
		if (obj instanceof ComponentInstance)
			return ((ComponentInstance) obj).getComponentType();
		
		return null;
	}
	
	/**
	 * Returns true iff obj belongs to a subroleInstance of a MultiDiscreteInteractionEndpoint at runtime
	 */
	public boolean belongsToDiscreteSingleInteractionEndpointInstance(EObject obj) {
		if (obj == null)
			return false;
		if (obj instanceof MessageBuffer)
			return true; //message buffers (of (multi-)DIEs) belong to the subroleInstances at runtime 
		
		EObject instanceType = getInstanceType(obj);
		if (instanceType instanceof DiscreteInteractionEndpoint) {
			if (!((DiscreteInteractionEndpoint) instanceType).isMulti())
				return true;
			// RTSCs and their subelements belong to the subroleInstances at runtime iff they are embedded in the subrole behavior
			while (obj != null) { //check whether obj is a subobject of the multi-DiscreteInteractionEndpoint subrole behavior
				if (obj == ((DiscreteInteractionEndpoint) instanceType).getSubroleBehavior())
					return true;
				obj = obj.eContainer();
			}
			return false;
		}
		
		return false;
	}
	

	/**
	 * Returns the set of all instances
	 */
	public Set<EObject> getAllInstances() {
		Set<EObject> instances = new HashSet<EObject>();
		instances.addAll(getConnectorEndpointInstances());
		instances.addAll(getComponentInstances());
		return instances;
	}
	
	/**
	 * Returns the set of all subinstances for a multi discrete interaction endpoint
	 */
	public Set<EObject> getAllSubinstancesOf(EObject obj) {
		if (obj == null || !(obj instanceof DiscreteInteractionEndpoint && ((DiscreteInteractionEndpoint) obj).isMulti()))
			throw new UnsupportedOperationException("no subinstances for "+obj);
		HashSet<EObject> result = new HashSet<EObject>();
		for (EObject instance : getAllInstances()) {
			if (instance instanceof DiscreteSingleInteractionEndpointInstance && ((DiscreteSingleInteractionEndpointInstance) instance).getType() == obj)
				result.add(instance);
		}
		return result;
	}
	
	/**
	 * Returns the set of all direct instances of obj (i.e. excluding subinstances)
	 */
	public Set<EObject> getAllInstancesOf(EObject obj) {
		if (obj == null || !(obj instanceof DiscreteInteractionEndpoint))
			throw new UnsupportedOperationException("unfortunately no instances for "+obj);
		HashSet<EObject> result = new HashSet<EObject>();
		for (EObject instance : getAllInstances()) {
			if (instance instanceof DiscreteInteractionEndpointInstance && ((DiscreteInteractionEndpointInstance) instance).getType() == obj) {
				if (((DiscreteInteractionEndpoint) obj).isMulti() && instance instanceof DiscreteSingleInteractionEndpointInstance) //filter all single instances out. Use getAllSubinstancesOf for this
					continue;
				
				result.add(instance);
			}
		}			
		
		return result;
	}
	
	/**
	 * Returns the set of instances that logically belong to obj (i.e. the language accepts it as an instance for obj)
	 */
	public Set<EObject> getAllInstancesFor(EObject obj) {
		Set<EObject> instances = getAllInstances();
		Set<EObject> result = new HashSet<EObject>();
		EObject objInstanceType = getInstanceType(obj);
		boolean belongsToDiscreteSingleInteractionEndpointInstance = belongsToDiscreteSingleInteractionEndpointInstance(obj);
		for (EObject instance : instances) {
			if (getInstanceType(instance) == objInstanceType) {
				if (!(instance instanceof DiscreteInteractionEndpointInstance))
					result.add(instance);
				else if ((instance instanceof DiscreteSingleInteractionEndpointInstance) && belongsToDiscreteSingleInteractionEndpointInstance) 
					result.add(instance);
				else if ((instance instanceof DiscreteMultiInteractionEndpointInstance) && !belongsToDiscreteSingleInteractionEndpointInstance) 
					result.add(instance);
			}
		}
		
		return result;
	}

	public VerifiableElement getRoot() {
		return root;
	}

	public Set<State> getStates() {
		return Collections.unmodifiableSet(states);
	}

	public Set<Variable> getVariables() {
		return Collections.unmodifiableSet(Collections.unmodifiableSet(variables));
	}

	public Set<Clock> getClocks() {
		return Collections.unmodifiableSet(clocks);
	}

	public Set<MessageType> getMessageTypes() {
		return Collections.unmodifiableSet(messageTypes);
	}

	public Set<MessageBuffer> getBuffers() {
		return Collections.unmodifiableSet(buffers);
	}

	public Set<Transition> getTransitions() {
		return Collections.unmodifiableSet(transitions);
	}

	public Set<RealtimeStatechart> getStatecharts() {
		return Collections.unmodifiableSet(statecharts);
	}

	public Set<ConnectorEndpoint> getConnectorEndpoints() {
		return Collections.unmodifiableSet(connectorEndpoints);
	}

	public Set<ConnectorEndpointInstance> getConnectorEndpointInstances() {
		return Collections.unmodifiableSet(connectorEndpointInstances);
	}

	public Set<AtomicComponentInstance> getComponentInstances() {
		return Collections.unmodifiableSet(componentInstances);
	}

	public Set<AtomicComponent> getComponents() {
		return Collections.unmodifiableSet(components);
	}
}
