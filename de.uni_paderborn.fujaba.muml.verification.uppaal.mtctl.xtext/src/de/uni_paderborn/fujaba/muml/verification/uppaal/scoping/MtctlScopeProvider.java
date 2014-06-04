package de.uni_paderborn.fujaba.muml.verification.uppaal.scoping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractScopeProvider;

import com.google.common.base.Function;

import de.uni_paderborn.fujaba.muml.behavior.Behavior;
import de.uni_paderborn.fujaba.muml.behavior.Variable;
import de.uni_paderborn.fujaba.muml.common.naming.MumlQualifiedNameProvider;
import de.uni_paderborn.fujaba.muml.common.naming.QualifiedNameProvider;
import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.MessageBuffer;
import de.uni_paderborn.fujaba.muml.constraint.VerificationConstraintRepository;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.PortInstance;
import de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance;
import de.uni_paderborn.fujaba.muml.msgtype.MessageType;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.BufferMsgCountExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TransitionMap;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInBufferExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInTransitExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateActiveExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateInStatechartExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.SubstateOfExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TransitionFiringExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifierExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.BufferSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ClockSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ConnectorEndpointInstanceSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.MessageSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.StateSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.TransitionSetExpr;

/**
 * Provides scoping rules for Mtctl.
 * 
 */
public class MtctlScopeProvider extends AbstractScopeProvider {
	private static MtctlScopeProvider instance = null;
	protected Set<State> states = null; //set of states in realtimestatecharts that are available in the current top-level muml element
	protected Set<Variable> variables = null;
	protected Set<Clock> clocks = null;
	protected Set<MessageType> messageTypes = null;
	protected Set<MessageBuffer> buffers = null;
	protected Set<Transition> transitions = null;
	protected Set<RealtimeStatechart> statecharts = null;
	protected Set<ConnectorEndpoint> connectorEndpoints = null;
	protected Set<ConnectorEndpointInstance> connectorEndpointInstances = null;
	private EObject scope = null;
	
	/**
	 * The mapping that determines how to call elements from the muml models
	 */
	Function<EObject, QualifiedName> scopedElementNameMap = new Function<EObject, QualifiedName>() {
		final char[] forbiddenChars = new char[] {' ','.','-','/','*','+','&','(',')'}; //list of characters forbidden in QualifiedNames
		
		private QualifiedNameProvider nameProvider = new MtctlQualifiedNameProvider(new MumlQualifiedNameProvider());
		
		@Override
		public QualifiedName apply(EObject obj) {
			//Create name by recursively applying names
			QualifiedName tmpResult = QualifiedName.create(nameProvider.getQualifiedName(obj, scope).getSegments());
			
			//Normalize the segments (disallow some characters in names, for example)
			QualifiedName result = QualifiedName.EMPTY;
			for (String segment: tmpResult.getSegments()) {
				for (char c: forbiddenChars)
					segment = segment.replace(c, '_');
				result = result.append(segment);
			}
			
			return result;
		}
	};
	
	private MtctlScopeProvider() {
		super();
		initSets();
	}
	
	/**
	 * Singleton Pattern
	 * @return an instance of the scope provider
	 */
	public static MtctlScopeProvider getInstance() {
		if (instance == null)
			instance = new MtctlScopeProvider();
		return instance;
	}
	
	/**
	 * Returns the scope when looking for a state
	 * @param context reference in the mtctl model (e.g., a StateExpr)
	 * @param ref which reference in the mtctl model needs to be set? (e.g., the state field in StateExpr)
	 * @return the scope
	 */
	public IScope getScopeState(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		Set<String> namesOfBoundVariables = new HashSet<String>(); // contains names of already added BoundVariables
		
		//Add states from the muml model
		scope.addAll(states);
		
		//Add BoundVariables
		QuantifierExpr parentQuantifier = findParentQuantifier(context); // returns the closest quantifier in the hierarchy of quantifiers
		while (parentQuantifier != null) {
			if (parentQuantifier.getVar() != null && parentQuantifier.getVar().getSet() instanceof StateSetExpr){
				if (!namesOfBoundVariables.contains(parentQuantifier.getVar().getName())) { // adds the current BoundVariable only if it is not shadowed
					scope.add(parentQuantifier.getVar());
					namesOfBoundVariables.add(parentQuantifier.getVar().getName());
				}
			}
			parentQuantifier = findParentQuantifier(parentQuantifier);
		}
		
		return createScope(scope);
	}
	
	
	/**
	 * Returns the scope when looking for a transition
	 * @param context reference in the mtctl model (e.g., a StateExpr)
	 * @param ref which reference in the mtctl model needs to be set? (e.g., the state field in StateExpr)
	 * @return the scope
	 */
	public IScope getScopeTransition(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		Set<String> namesOfBoundVariables = new HashSet<String>(); // contains names of already added BoundVariables
				
		scope.addAll(transitions);
		
		//Add BoundVariables
		QuantifierExpr parentQuantifier = findParentQuantifier(context);
		while (parentQuantifier != null) {
			if (parentQuantifier.getVar() != null && parentQuantifier.getVar().getSet() instanceof TransitionSetExpr)
				if (!namesOfBoundVariables.contains(parentQuantifier.getVar().getName())) { // adds the current BoundVariable only if it is not shadowed
					scope.add(parentQuantifier.getVar());
					namesOfBoundVariables.add(parentQuantifier.getVar().getName());
				}
			parentQuantifier = findParentQuantifier(parentQuantifier);
		}
		
		return createScope(scope);
	}
	
	/**
	 * Returns the scope when looking for a MessageType
	 * @param context reference in the mtctl model (e.g., a StateExpr)
	 * @param ref which reference in the mtctl model needs to be set? (e.g., the state field in StateExpr)
	 * @return the scope
	 */
	public IScope getScopeMessageType(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		Set<String> namesOfBoundVariables = new HashSet<String>(); // contains names of already added BoundVariables
				
		//Add states from the muml model
		scope.addAll(messageTypes);
		
		//Add BoundVariables
		QuantifierExpr parentQuantifier = findParentQuantifier(context);
		while (parentQuantifier != null) {
			if (parentQuantifier.getVar() != null && parentQuantifier.getVar().getSet() instanceof MessageSetExpr)
				if (!namesOfBoundVariables.contains(parentQuantifier.getVar().getName())) { // adds the current BoundVariable only if it is not shadowed
					scope.add(parentQuantifier.getVar());
					namesOfBoundVariables.add(parentQuantifier.getVar().getName());
				}
			parentQuantifier = findParentQuantifier(parentQuantifier);
		}
		
		return createScope(scope);
	}
	
	/**
	 * Returns the scope when looking for a MessageBuffer
	 * @param context reference in the mtctl model (e.g., a StateExpr)
	 * @param ref which reference in the mtctl model needs to be set? (e.g., the state field in StateExpr)
	 * @return the scope
	 */
	public IScope getScopeBuffer(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		Set<String> namesOfBoundVariables = new HashSet<String>(); // contains names of already added BoundVariables
				
		//Add states from the muml model
		scope.addAll(buffers);
		
		//Add BoundVariables
		QuantifierExpr parentQuantifier = findParentQuantifier(context);
		while (parentQuantifier != null) {
			if (parentQuantifier.getVar() != null && parentQuantifier.getVar().getSet() instanceof BufferSetExpr)
				if (!namesOfBoundVariables.contains(parentQuantifier.getVar().getName())) { // adds the current BoundVariable only if it is not shadowed
					scope.add(parentQuantifier.getVar());
					namesOfBoundVariables.add(parentQuantifier.getVar().getName());
				}
			parentQuantifier = findParentQuantifier(parentQuantifier);
		}
		
		return createScope(scope);
	}
	
	/**
	 * Returns the scope when looking for a (runtime) variable (Clock, Variable, etc.)
	 * @param context reference in the mtctl model (e.g., a StateExpr)
	 * @param ref which reference in the mtctl model needs to be set? (e.g., the state field in StateExpr)
	 * @return the scope
	 */
	public IScope getScopeVariable(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		Set<String> namesOfBoundVariables = new HashSet<String>(); // contains names of already added BoundVariables
				
		//Add clocks and variables from the model
		scope.addAll(clocks);
		scope.addAll(variables);
		
		//Add BoundVariables for clocks
		QuantifierExpr parentQuantifier = findParentQuantifier(context);
		while (parentQuantifier != null) {
			if (parentQuantifier.getVar() != null && parentQuantifier.getVar().getSet() instanceof ClockSetExpr)
				if (!namesOfBoundVariables.contains(parentQuantifier.getVar().getName())) { // adds the current BoundVariable only if it is not shadowed
					scope.add(parentQuantifier.getVar());
					namesOfBoundVariables.add(parentQuantifier.getVar().getName());
				}
			parentQuantifier = findParentQuantifier(parentQuantifier);
		}
		
		return createScope(scope);
	}
	
	/**
	 * Returns the scope when looking for an RTSC
	 * @param context reference in the mtctl model (e.g., a StateExpr)
	 * @param ref which reference in the mtctl model needs to be set? (e.g., the state field in StateExpr)
	 * @return the scope
	 */
	public IScope getScopeStatechart(EObject context, EReference reference) {
		return createScope(statecharts);
	}
	
	/**
	 * Returns the scope when looking for a connector endpoint
	 */
	public IScope getScopeConnectorEndpoint(EObject context, EReference reference) {
		return createScope(connectorEndpoints);
	}
	
	/**
	 * Returns the scope when looking for a connector endpoint instance
	 */
	public IScope getScopeConnectorEndpointInstance(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		Set<String> namesOfBoundVariables = new HashSet<String>(); // contains names of already added BoundVariables
				
		//Add connector endpoint instances from the model
		scope.addAll(connectorEndpointInstances);
		
		//Add BoundVariables for clocks
		QuantifierExpr parentQuantifier = findParentQuantifier(context);
		while (parentQuantifier != null) {
			if (parentQuantifier.getVar() != null && parentQuantifier.getVar().getSet() instanceof ConnectorEndpointInstanceSetExpr)
				if (!namesOfBoundVariables.contains(parentQuantifier.getVar().getName())) { // adds the current BoundVariable only if it is not shadowed
					scope.add(parentQuantifier.getVar());
					namesOfBoundVariables.add(parentQuantifier.getVar().getName());
				}
			parentQuantifier = findParentQuantifier(parentQuantifier);
		}
		
		return createScope(scope);
	}
	
	/**
	 * Returns the scope when looking for anything (mainly for comparisons)
	 * @param context reference in the mtctl model (e.g., a StateExpr)
	 * @param ref which reference in the mtctl model needs to be set? (e.g., the state field in StateExpr)
	 * @return the scope
	 */
	public IScope getScopeAny(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		Set<String> namesOfBoundVariables = new HashSet<String>(); // contains names of already added BoundVariables
				
		//Add elements from the model
		scope.addAll(clocks);
		scope.addAll(variables);
		scope.addAll(states);
		scope.addAll(transitions);
		scope.addAll(messageTypes);
		scope.addAll(buffers);
		
		//Add BoundVariables
		QuantifierExpr parentQuantifier = findParentQuantifier(context);
		while (parentQuantifier != null) { //TODO fix NPE in line below
			if (parentQuantifier.getVar() != null && parentQuantifier.getVar().getSet() instanceof SetExpr) //we might want to change this if some set elements are not comparable
				if (!namesOfBoundVariables.contains(parentQuantifier.getVar().getName())) { // adds the current BoundVariable only if it is not shadowed
					scope.add(parentQuantifier.getVar());
					namesOfBoundVariables.add(parentQuantifier.getVar().getName());
				}
			parentQuantifier = findParentQuantifier(parentQuantifier);
		}
		
		return createScope(scope);
	}
	
	/**
	 * Returns the quantifier in the mtctl model that (indirectly) contains the passed object. Null of none found
	 * @param obj
	 * @return a QuantifierExpr (indirectly) containing the obj or null
	 */
	private QuantifierExpr findParentQuantifier(EObject obj) {
		if (obj.eContainer() == null)
			return null;
		
		if (obj.eContainer() instanceof QuantifierExpr)
			return (QuantifierExpr) obj.eContainer();
		
		return findParentQuantifier(obj.eContainer());
	}
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (!(context instanceof MumlElemExpr) && ("MumlElemExpr".equals(reference.getEContainingClass().getName()))) //happens for proposals, but makes it impossible to judge the actual scope (too little information). So this scope provider will simply not react. The problem is solved in MtctlProposalProvider which makes sure that the correct call is also issued.
			return IScope.NULLSCOPE;
		
		if (context instanceof MumlElemExpr && reference != null && "connectorEndpointInstance".equals(reference.getName()))
			return getScopeConnectorEndpointInstance(context, reference);
		
		//The requested scope might be for a MumlElemExpr. 
		if (context instanceof MumlElemExpr) {
			//Because this is not very informative, we exchange the supplied values with the context and reference for the MumlElemExpr, not the reference itself
			//So basically, we pretend that we resolve the MumlElemExpr and not the reference
			reference = context.eContainmentFeature(); //now contains the reference to the MumlElemExpr
			context = context.eContainer(); //now contains the class that wants to set its field with a MumlElemExp	
		}
		
		//Take care of calling the correct method wrt. the type that is looked for		
		if (context instanceof SubstateOfExpr || context instanceof StateActiveExpr || context instanceof StateInStatechartExpr && reference != null && "state".equals(reference.getName()))
			return getScopeState(context, reference);
		if (context instanceof TransitionFiringExpr || context instanceof TransitionMap)
			return getScopeTransition(context, reference);
		if (context instanceof MessageInTransitExpr || context instanceof MessageInBufferExpr && reference != null && "message".equals(reference.getName()))
			return getScopeMessageType(context, reference);
		if (context instanceof BufferMsgCountExpr || context instanceof MessageInBufferExpr && reference != null && "buffer".equals(reference.getName()))
			return getScopeBuffer(context, reference);
		if (context instanceof StateInStatechartExpr && reference != null && "statechart".equals(reference.getName()))
			return getScopeStatechart(context, reference);
		if (context instanceof ConnectorEndpointInstanceSetExpr)
			return getScopeConnectorEndpoint(context, reference);
		if (context instanceof ComparisonExpr)
			return getScopeAny(context, reference);
		
		return IScope.NULLSCOPE;
	}
	
	/**
	 * Adjusts the scope provider to the supplied object such that subsequent xtext calls asking for the (global) scope will be answered relative to the supplied object.
	 * This is typically called once per editor creation to initialize the global scope (e.g., for a CoordinationProtocol)
	 * Internally: populates the scope lists
	 * @param object
	 */
	public void setScopeForEObject(EObject object) {
		initSets(); //clear previous data
		if (object instanceof VerificationConstraintRepository && object != null) //this will happen when the editor is used to specify a list of constraints to save them in a foreign-created VerificationConstraintRepository
			object = object.eContainer();
		
		this.scope = object; // set scope to be used when getting the QualifiedNames
		//Delegate to the specific methods for the type of object
		if (object instanceof CoordinationProtocol)
			setScopeForCoordinationProtocol((CoordinationProtocol) object);
		else if (object instanceof AtomicComponent)
			setScopeForAtomicComponent((AtomicComponent) object);
		else if (object instanceof ComponentInstanceConfiguration)
			setScopeForCIC((ComponentInstanceConfiguration) object);
		else
			System.out.println("MtctlScopeProvider::setScopeForEObject: Don't know how to handle "+object.toString()+" :'(");
		
	}

	/**
	 * Called by setScopeForEObject() if the top-level-element is a CoordinationProtocol.
	 * Collects everything that can be referenced from mtctl in a CoordinationProtocol.
	 * @param object
	 */
	private void setScopeForCoordinationProtocol(CoordinationProtocol object) {
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
	private void setScopeForAtomicComponent(AtomicComponent object) {
		HashSet<MessageType> messageTypes = new HashSet<MessageType>();
		HashSet<MessageBuffer> buffers = new HashSet<MessageBuffer>();
		
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
	private void setScopeForCIC(ComponentInstanceConfiguration object) {
		HashSet<MessageType> messageTypes = new HashSet<MessageType>();
		HashSet<MessageBuffer> buffers = new HashSet<MessageBuffer>();
		
		// add all RTSC elements, message types, and buffers from the Ports of the PortInstances of the contained ComponentInstances
		for (ComponentInstance componentInstance : object.getComponentInstances()) {
			if (componentInstance instanceof StructuredComponentInstance)
				setScopeForCIC(((StructuredComponentInstance) componentInstance).getEmbeddedCIC());
			for (PortInstance portInstance : componentInstance.getPortInstances()) {
				connectorEndpointInstances.add(portInstance);
				if (portInstance.getPortType() instanceof DiscretePort) {
					DiscretePort port = (DiscretePort) portInstance.getPortType();
					connectorEndpoints.add(port);
					addRtscElementsToArrays(((DiscretePort) port).getBehavior());
					messageTypes.addAll(((DiscretePort) port).getReceiverMessageTypes());
					messageTypes.addAll(((DiscretePort) port).getSenderMessageTypes());
					buffers.addAll(((DiscretePort) port).getReceiverMessageBuffer());					
				}
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
	 * Resets the lists containing the visible elements from the top-level muml element
	 */
	private void initSets() {
		states = new HashSet<State>();
		variables = new HashSet<Variable>();
		clocks = new HashSet<Clock>();
		messageTypes = new HashSet<MessageType>();
		transitions = new HashSet<Transition>();
		buffers = new HashSet<MessageBuffer>();
		statecharts = new HashSet<RealtimeStatechart>();
		connectorEndpoints = new HashSet<ConnectorEndpoint>();
		connectorEndpointInstances = new HashSet<ConnectorEndpointInstance>();
	}
	
	/**
	 * Creates a corresponding scope from the list of referenceable objects
	 * @param list
	 * @return
	 */
	private IScope createScope(Set<? extends EObject> set) {
		if (set == null || set.isEmpty()) {
			return IScope.NULLSCOPE;
		}
		IScope scope = Scopes.scopeFor(set, scopedElementNameMap, IScope.NULLSCOPE);
		
		/*for (IEObjectDescription descr : scope.getAllElements()) //debugging log
			System.out.println(descr.getQualifiedName().toString());
		System.out.println();*/
		
		return scope;
	}
}
