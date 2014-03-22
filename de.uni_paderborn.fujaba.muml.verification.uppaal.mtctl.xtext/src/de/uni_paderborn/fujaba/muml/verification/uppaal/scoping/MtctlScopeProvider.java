package de.uni_paderborn.fujaba.muml.verification.uppaal.scoping;

import java.util.ArrayList;
import java.util.List;

import mtctl.PropertyRepository;
import mtctl.Comparables.PrimitiveVariableExpr;
import mtctl.Predicates.ComparisonExpr;
import mtctl.Predicates.StateActiveExpr;
import mtctl.Predicates.StateEnterExpr;
import mtctl.Predicates.StateExitExpr;
import mtctl.Predicates.SubstateOfExpr;
import mtctl.Quantifiers.BoundVariable;
import mtctl.Quantifiers.QuantifierExpr;
import mtctl.Sets.ClockSetExpr;
import mtctl.Sets.MessageSetExpr;
import mtctl.Sets.StateSetExpr;
import mtctl.Sets.TransitionSetExpr;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractScopeProvider;

import com.google.common.base.Function;

import de.uni_paderborn.fujaba.muml.behavior.Variable;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;
import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;

/**
 * Provides scoping rules for Mtctl.
 * 
 */
public class MtctlScopeProvider extends AbstractScopeProvider {
	private static MtctlScopeProvider instance = null;
	protected List<State> states = null; //list of states in realtimestatecharts that are available in the current top-level muml element
	protected List<Variable> variables = null;
	protected List<Clock> clocks = null;
	
	/**
	 * The mapping that determines how to call elements from the muml models
	 */
	Function<EObject, QualifiedName> scopedElementNameMap = new Function<EObject, QualifiedName>() {
		@Override
		public QualifiedName apply(EObject obj) {
			try {
				if (obj == null)
					return QualifiedName.EMPTY;
				
				if (obj instanceof BoundVariable)
					return QualifiedName.create(((BoundVariable) obj).getName()); //BoundVariables are simply called by their name as specified in the mtctl sentence
				
				if (obj instanceof Role)
					return QualifiedName.create(((Role) obj).getName()); //Roles are called by their names
				
				if (obj instanceof RealtimeStatechart)
					if (((RealtimeStatechart) obj).getBehavioralElement() != null)
						return apply(((RealtimeStatechart) obj).getBehavioralElement()).append(((RealtimeStatechart) obj).getName()); //top-level RTSC are called role.rtsc
					else if (((RealtimeStatechart) obj).isEmbedded())
						return apply(((RealtimeStatechart) obj).getParentRegion().getParentState()); //embedded RTSC are called like their parent state
					else
						return QualifiedName.create(((RealtimeStatechart) obj).getName()); //fallback that should not happen
				
				if (obj instanceof State)
					return apply(((State) obj).getParentStatechart()).append(((State) obj).getName()); //states are called rtsc.state
				
				if (obj instanceof Clock)
					return apply(((Clock) obj).getStatechart()).append(((Clock) obj).getName()); //clocks are called rtsc.clock
				
				if (obj instanceof Variable)
					return apply(obj.eContainer()).append(((Variable) obj).getName()); //variables are called rtsc.var
			} catch (RuntimeException e) {
				System.out.println("Exception when computing qualified name for "+obj);
				e.printStackTrace();
			}
			System.out.println("MtctlScopeProvider does not know how to name "+obj.toString());
			return QualifiedName.create("de","uni_paderborn","fujaba","muml","verification","uppaal","mtctl","nameNotKnown");
		}
	};
	
	private MtctlScopeProvider() {
		super();
		initLists();
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
		List<EObject> scope = new ArrayList<EObject>();
		
		//Add states from the muml model
		scope.addAll(states);
		
		//Add BoundVariables
		QuantifierExpr parentQuantifier = findParentQuantifier(context);
		while (parentQuantifier != null) {
			if (parentQuantifier.getVar().getSet() instanceof StateSetExpr)
				scope.add(parentQuantifier.getVar());
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
		List<EObject> scope = new ArrayList<EObject>();
		
		//Add BoundVariables
		QuantifierExpr parentQuantifier = findParentQuantifier(context);
		while (parentQuantifier != null) {
			if (parentQuantifier.getVar().getSet() instanceof TransitionSetExpr)
				scope.add(parentQuantifier.getVar());
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
	public IScope getScopeMessageType(EObject context, EReference reference) { //TODO what type do we actually reference here?
		List<EObject> scope = new ArrayList<EObject>();
		
		//Add BoundVariables
		QuantifierExpr parentQuantifier = findParentQuantifier(context);
		while (parentQuantifier != null) {
			if (parentQuantifier.getVar().getSet() instanceof MessageSetExpr)
				scope.add(parentQuantifier.getVar());
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
		List<EObject> scope = new ArrayList<EObject>();
		
		//Add clocks and variables from the model
		scope.addAll(clocks);
		scope.addAll(variables);
		
		//Add BoundVariables for clocks
		QuantifierExpr parentQuantifier = findParentQuantifier(context);
		while (parentQuantifier != null) {
			if (parentQuantifier.getVar().getSet() instanceof ClockSetExpr)
				scope.add(parentQuantifier.getVar());
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
		//Take care of calling the correct method wrt. the type that is looked for
		if (context instanceof SubstateOfExpr || context instanceof StateEnterExpr || context instanceof StateExitExpr || context instanceof StateActiveExpr)
			return getScopeState(context, reference);
		if (context instanceof PrimitiveVariableExpr)
			return getScopeVariable(context, reference);
		
		if (context instanceof PropertyRepository || context instanceof ComparisonExpr) //Fallback for context where we might want a variable
			return getScopeVariable(context, reference);
		
		return IScope.NULLSCOPE;
	}
	
	/**
	 * Adjusts the scope provider to the supplied object such that subsequent xtext calls asking for the (global) scope will be answered relative to the supplied object.
	 * This is typically called once per editor creation to initialize the global scope (e.g., for a CoordinationProtocol)
	 * Internally: populates the scope lists
	 * @param object
	 */
	public void setScopeForEObject(EObject object) {
		initLists(); //clear previous data
		
		//Delegate to the specific methods for the type of object
		if (object instanceof CoordinationProtocol) //stateActive(...)
			setScopeForCoordinationProtocol((CoordinationProtocol) object);
		else
			System.out.println("MtctlScopeProvider::setScopeForEObject: Don't know how to handle "+object.toString()+" :'(");
		
	}

	/**
	 * Called by setScopeForEObject() if the top-level-element is a CoordinationProtocol
	 * @param object
	 */
	private void setScopeForCoordinationProtocol(CoordinationProtocol object) {
		//Collect everything that can be referenced from mtctl in a CoordinationProtocol
		
		//States
		for (Role role : object.getRoles())
			states.addAll(recursivelyCollectStates(((RealtimeStatechart) role.getBehavior()).getStates()));
	
		//Clocks
		for (Role role : object.getRoles())
			clocks.addAll(((RealtimeStatechart) role.getBehavior()).getAvailableClocks());
		
		//Variables
		for (Role role : object.getRoles())
			variables.addAll(((RealtimeStatechart) role.getBehavior()).getAllAvailableVariables());
	}
	
	/**
	 * Collects all states and substates of states in the list 'states'
	 * @param states Any list of states
	 * @return the substate-of transitive closure of states
	 */
	private List<State> recursivelyCollectStates(List<State> states) {
		List<State> result = new ArrayList<State>();
		for (State state : states) {
			result.add(state);
			for (Region region : state.getEmbeddedRegions())
				result.addAll(recursivelyCollectStates(region.getEmbeddedStatechart().getStates()));
		}
		
		return result;
	}
	

	/**
	 * Resets the lists containing the visible elements from the top-level muml element
	 */
	private void initLists() {
		states = new ArrayList<State>();
		variables = new ArrayList<Variable>();
		clocks = new ArrayList<Clock>();
	}
	
	/**
	 * Creates a corresponding scope from the list of referenceable objects
	 * @param list
	 * @return
	 */
	private IScope createScope(List<? extends EObject> list) {
		if (list == null || list.isEmpty()) {
			return IScope.NULLSCOPE;
		}
		IScope scope = Scopes.scopeFor(list, scopedElementNameMap, IScope.NULLSCOPE);
		
		/*for (IEObjectDescription descr : scope.getAllElements()) //debugging log
			System.out.println(descr.getQualifiedName().toString());
		System.out.println();*/
		
		return scope;
	}
}
