package org.muml.uppaal.adapter.mtctl.xtext.scoping;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractScopeProvider;
import org.muml.pim.common.naming.MumlQualifiedNameProvider;
import org.muml.pim.common.naming.QualifiedNameProvider;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.constraint.VerificationConstraintRepository;
import org.muml.uppaal.adapter.mtctl.common.MtctlModelElementProvider;
import org.muml.uppaal.adapter.mtctl.comparables.BufferMsgCountExpr;
import org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr;
import org.muml.uppaal.adapter.mtctl.comparables.TransitionMap;
import org.muml.uppaal.adapter.mtctl.predicates.ComparisonExpr;
import org.muml.uppaal.adapter.mtctl.predicates.MessageDiscardedExpr;
import org.muml.uppaal.adapter.mtctl.predicates.MessageInBufferExpr;
import org.muml.uppaal.adapter.mtctl.predicates.MessageInTransitExpr;
import org.muml.uppaal.adapter.mtctl.predicates.StateActiveExpr;
import org.muml.uppaal.adapter.mtctl.predicates.StateInStatechartExpr;
import org.muml.uppaal.adapter.mtctl.predicates.SubstateOfExpr;
import org.muml.uppaal.adapter.mtctl.predicates.TransitionFiringExpr;
import org.muml.uppaal.adapter.mtctl.quantifiers.QuantifierExpr;
import org.muml.uppaal.adapter.mtctl.sets.BufferSetExpr;
import org.muml.uppaal.adapter.mtctl.sets.ClockSetExpr;
import org.muml.uppaal.adapter.mtctl.sets.InstanceSetExpr;
import org.muml.uppaal.adapter.mtctl.sets.MessageSetExpr;
import org.muml.uppaal.adapter.mtctl.sets.SetExpr;
import org.muml.uppaal.adapter.mtctl.sets.StateSetExpr;
import org.muml.uppaal.adapter.mtctl.sets.SubinstanceSetExpr;
import org.muml.uppaal.adapter.mtctl.sets.TransitionSetExpr;

import com.google.common.base.Function;

/**
 * Provides scoping rules for Mtctl.
 * 
 */
public class MtctlScopeProvider extends AbstractScopeProvider {
	private static MtctlScopeProvider instance = null;
	
	private MtctlModelElementProvider elementProvider = null;
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
	public Set<? extends EObject> getScopeState(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		Set<String> namesOfBoundVariables = new HashSet<String>(); // contains names of already added BoundVariables
		
		//Add states from the muml model
		scope.addAll(elementProvider.getStates());
		
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
		
		return scope;
	}
	
	
	/**
	 * Returns the scope when looking for a transition
	 * @param context reference in the mtctl model (e.g., a StateExpr)
	 * @param ref which reference in the mtctl model needs to be set? (e.g., the state field in StateExpr)
	 * @return the scope
	 */
	public Set<? extends EObject> getScopeTransition(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		Set<String> namesOfBoundVariables = new HashSet<String>(); // contains names of already added BoundVariables
				
		scope.addAll(elementProvider.getTransitions());
		
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
		
		return scope;
	}
	
	/**
	 * Returns the scope when looking for a MessageType
	 * @param context reference in the mtctl model (e.g., a StateExpr)
	 * @param ref which reference in the mtctl model needs to be set? (e.g., the state field in StateExpr)
	 * @return the scope
	 */
	public Set<? extends EObject> getScopeMessageType(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		Set<String> namesOfBoundVariables = new HashSet<String>(); // contains names of already added BoundVariables
				
		//Add states from the muml model
		scope.addAll(elementProvider.getMessageTypes());
		
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
		
		return scope;
	}
	
	/**
	 * Returns the scope when looking for a MessageBuffer
	 * @param context reference in the mtctl model (e.g., a StateExpr)
	 * @param ref which reference in the mtctl model needs to be set? (e.g., the state field in StateExpr)
	 * @return the scope
	 */
	public Set<? extends EObject> getScopeBuffer(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		Set<String> namesOfBoundVariables = new HashSet<String>(); // contains names of already added BoundVariables
				
		//Add states from the muml model
		scope.addAll(elementProvider.getBuffers());
		
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
		
		return scope;
	}
	
	/**
	 * Returns the scope when looking for a (runtime) variable (Clock, Variable, etc.)
	 * @param context reference in the mtctl model (e.g., a StateExpr)
	 * @param ref which reference in the mtctl model needs to be set? (e.g., the state field in StateExpr)
	 * @return the scope
	 */
	public Set<? extends EObject> getScopeVariable(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		Set<String> namesOfBoundVariables = new HashSet<String>(); // contains names of already added BoundVariables
				
		//Add clocks and variables from the model
		scope.addAll(elementProvider.getClocks());
		scope.addAll(elementProvider.getVariables());
		
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
		
		return scope;
	}
	
	/**
	 * Returns the scope when looking for an RTSC
	 * @param context reference in the mtctl model (e.g., a StateExpr)
	 * @param ref which reference in the mtctl model needs to be set? (e.g., the state field in StateExpr)
	 * @return the scope
	 */
	public Set<? extends EObject> getScopeStatechart(EObject context, EReference reference) {
		return elementProvider.getStatecharts();
	}
	
	/**
	 * Returns the scope when looking for an instance type
	 */
	public Set<? extends EObject> getScopeInstanceTypes(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		scope.addAll(elementProvider.getConnectorEndpoints());
		scope.addAll(elementProvider.getComponents());
		
		return scope;
	}
	
	/**
	 * Returns the scope when looking for a subinstance type
	 */
	public Set<? extends EObject> getScopeSubinstanceTypes(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		for (EObject instance : elementProvider.getConnectorEndpoints())
			if (((DiscreteInteractionEndpoint) instance).isMulti())
				scope.add(instance);
		
		return scope;
	}
	
	/**
	 * Returns the scope when looking for an instance (ConnectorEndpointInstance or AtomicComponentInstance)
	 * 
	 */
	public Set<? extends EObject> getScopeInstances(MumlElemExpr context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		Set<String> namesOfBoundVariables = new HashSet<String>(); // contains names of already added BoundVariables
				
		//Add instances from the model
		scope.addAll(elementProvider.getAllInstancesFor(context.getElem()));
		
		
		//Add BoundVariables
		QuantifierExpr parentQuantifier = findParentQuantifier(context);
		while (parentQuantifier != null) {
			if (parentQuantifier.getVar() != null && parentQuantifier.getVar().getSet() instanceof InstanceSetExpr)
				if (!namesOfBoundVariables.contains(parentQuantifier.getVar().getName())) { // adds the current BoundVariable only if it is not shadowed
					EObject type = ((InstanceSetExpr) parentQuantifier.getVar().getSet()).getType().getElem();
					if (type == elementProvider.getInstanceType(context.getElem()) //add only if referenced type fits
							&& (!(type instanceof DiscreteInteractionEndpoint && ((DiscreteInteractionEndpoint) type).isMulti())
									|| !elementProvider.belongsToDiscreteSingleInteractionEndpointInstance(context.getElem()))) {  
						scope.add(parentQuantifier.getVar());
						namesOfBoundVariables.add(parentQuantifier.getVar().getName());
					}
				}
			if (parentQuantifier.getVar() != null && parentQuantifier.getVar().getSet() instanceof SubinstanceSetExpr)
				if (!namesOfBoundVariables.contains(parentQuantifier.getVar().getName())) { // adds the current BoundVariable only if it is not shadowed
					EObject type = ((SubinstanceSetExpr) parentQuantifier.getVar().getSet()).getType().getElem();
					if (type == elementProvider.getInstanceType(context.getElem())
							&& (type instanceof DiscreteInteractionEndpoint && ((DiscreteInteractionEndpoint) type).isMulti()
									&& elementProvider.belongsToDiscreteSingleInteractionEndpointInstance(context.getElem()))) { //add only if referenced type fits 
						scope.add(parentQuantifier.getVar());
						namesOfBoundVariables.add(parentQuantifier.getVar().getName());
					}
				}
			parentQuantifier = findParentQuantifier(parentQuantifier);
		}
		
		return scope;
	}
	
	/**
	 * Returns the scope when looking for anything (mainly for comparisons)
	 * @param context reference in the mtctl model (e.g., a StateExpr)
	 * @param ref which reference in the mtctl model needs to be set? (e.g., the state field in StateExpr)
	 * @return the scope
	 */
	public Set<? extends EObject> getScopeAny(EObject context, EReference reference) {
		Set<EObject> scope = new HashSet<EObject>();
		Set<String> namesOfBoundVariables = new HashSet<String>(); // contains names of already added BoundVariables
				
		//Add elements from the model
		scope.addAll(elementProvider.getClocks());
		scope.addAll(elementProvider.getVariables());
		scope.addAll(elementProvider.getStates());
		scope.addAll(elementProvider.getTransitions());
		scope.addAll(elementProvider.getMessageTypes());
		scope.addAll(elementProvider.getBuffers());
		scope.addAll(elementProvider.getComponentInstances());
		scope.addAll(elementProvider.getComponents());
		scope.addAll(elementProvider.getConnectorEndpointInstances());
		scope.addAll(elementProvider.getConnectorEndpoints());
		
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
		
		return scope;
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
		
		if (context instanceof MumlElemExpr && reference != null && "instance".equals(reference.getName()))
			return createScope(getScopeInstances((MumlElemExpr) context, reference));
		
		//The requested scope might be for a MumlElemExpr. 
		if (context instanceof MumlElemExpr) {
			//Because this is not very informative, we exchange the supplied values with the context and reference for the MumlElemExpr, not the reference itself
			//So basically, we pretend that we resolve the MumlElemExpr and not the reference
			reference = context.eContainmentFeature(); //now contains the reference to the MumlElemExpr
			context = context.eContainer(); //now contains the class that wants to set its field with a MumlElemExp	
		}
		
		//Take care of calling the correct method wrt. the type that is looked for		
		if (context instanceof SubstateOfExpr || context instanceof StateActiveExpr || context instanceof StateInStatechartExpr && reference != null && "state".equals(reference.getName()))
			return createScope(getScopeState(context, reference));
		if (context instanceof TransitionFiringExpr || context instanceof TransitionMap)
			return createScope(getScopeTransition(context, reference));
		if (context instanceof MessageInTransitExpr || context instanceof MessageInBufferExpr && reference != null && "message".equals(reference.getName()))
			return createScope(getScopeMessageType(context, reference));
		if (context instanceof BufferMsgCountExpr || context instanceof MessageInBufferExpr && reference != null && "buffer".equals(reference.getName()))
			return createScope(getScopeBuffer(context, reference));
		if (context instanceof MessageDiscardedExpr && reference != null && "buffer".equals(reference.getName()))
			return createScope(getScopeBuffer(context, reference));
		if (context instanceof StateInStatechartExpr && reference != null && "statechart".equals(reference.getName()))
			return createScope(getScopeStatechart(context, reference));
		if (context instanceof InstanceSetExpr)
			return createScope(getScopeInstanceTypes(context, reference));
		if (context instanceof SubinstanceSetExpr)
			return createScope(getScopeSubinstanceTypes(context, reference));
		if (context instanceof ComparisonExpr)
			return createScope(getScopeAny(context, reference));
		
		return IScope.NULLSCOPE;
	}
	
	/**
	 * Adjusts the scope provider to the supplied object such that subsequent xtext calls asking for the (global) scope will be answered relative to the supplied object.
	 * This is typically called once per editor creation to initialize the global scope (e.g., for a CoordinationProtocol)
	 * Internally: populates the scope lists
	 * @param object
	 */
	public void setScopeForEObject(EObject object) {
		if (object instanceof VerificationConstraintRepository && object != null) //this will happen when the editor is used to specify a list of constraints to save them in a foreign-created VerificationConstraintRepository
			object = object.eContainer();
		
		elementProvider = new MtctlModelElementProvider((VerifiableElement) object);		
		this.scope = object; // set scope to be used when getting the QualifiedNames		
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
		
		return scope;
	}
	
	public MtctlModelElementProvider getElementProvider() {
		return elementProvider;
	}
}
