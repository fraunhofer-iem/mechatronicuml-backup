/**
 * @author Sebastian Goschin
 * 
 * Partially reusing code of ActionLanguageScopeProvider
 */
package de.uni_paderborn.fujaba.muml.scoping

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory
import de.uni_paderborn.fujaba.modelinstance.ModelInstancePlugin
import de.uni_paderborn.fujaba.modelinstance.RootNode
import de.uni_paderborn.fujaba.muml.actionlanguage.Assignment
import de.uni_paderborn.fujaba.muml.actionlanguage.OperationCall
import de.uni_paderborn.fujaba.muml.actionlanguage.TriggerMessageExpression
import de.uni_paderborn.fujaba.muml.behavior.Operation
import de.uni_paderborn.fujaba.muml.behavior.Parameter
import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding
import de.uni_paderborn.fujaba.muml.behavior.TypedNamedElement
import de.uni_paderborn.fujaba.muml.behavior.Variable
import de.uni_paderborn.fujaba.muml.component.AtomicComponent
import de.uni_paderborn.fujaba.muml.component.HybridPort
import de.uni_paderborn.fujaba.muml.component.Port
import de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint
import de.uni_paderborn.fujaba.muml.dependencylanguage.DependencyModel
import de.uni_paderborn.fujaba.muml.dependencylanguage.ForbiddenStateCombination
import de.uni_paderborn.fujaba.muml.dependencylanguage.SynthesizableBehavior
import de.uni_paderborn.fujaba.muml.msgtype.MessageType
import de.uni_paderborn.fujaba.muml.msgtype.MessageTypeRepository
import de.uni_paderborn.fujaba.muml.naming.MumlQualifiedNameProvider
import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region
import de.uni_paderborn.fujaba.muml.realtimestatechart.State
import de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition
import de.uni_paderborn.fujaba.muml.types.DataType
import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType
import java.util.List
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class DependencyModelLanguageScopeProvider extends AbstractDeclarativeScopeProvider {
	
	private AtomicComponent component;
	private DependencyModel dependencyModel;
	private SynthesizableBehavior synBehavior;
	private BasicEList<DiscreteInteractionEndpoint> listOfPorts
	private BasicEList<RealtimeStatechart> listOfRtscs;
	private BasicEList<State> listOfAllStates;
	private BasicEList<Transition> listOfAllTransitions;
	private BasicEList<SynchronizationChannel> listOfAllChannels;
	private BasicEList<Clock> listOfAllClocks;
	private BasicEList<Variable> listOfAllVariables;
	private BasicEList<Variable> listOfAllConstants;
	private BasicEList<Operation> listOfAllOperations;
	private BasicEList<HybridPort> listOfAllHybridPorts;
	private BasicEList<DataType> listOfAllDataTypes;
	private BasicEList<MessageType> listOfAllMessageTypes;
	private IQualifiedNameProvider qnProvider;

	// TODO: make this string public in class TypeCategoryInitializer
	private static final String DATA_TYPES_CATEGORY_KEY = "de.uni_paderborn.fujaba.muml.types.category";
	private static final String MESSAGE_TYPES_CATEGORY_KEY = "de.uni_paderborn.fujaba.muml.messagetype.category";
	
	private static final String INT_ID = "INT";


	
	new() {
		super();
		qnProvider = new MumlQualifiedNameProvider(); 
	}
	
	/*
	 * Helpful class to find out what scopes are adressed.
	 */
	override IScope getScope(EObject context, EReference reference) {
		System.out.println("scope_" + reference.getEContainingClass().getName() +
			"_" + reference.getName() + 
			"(" + context.eClass().getName() + ", ..)");
		return super.getScope(context,reference);
	}

	def void initLists() {
		buildRtscList();
		buildTypeLists();
		buildOtherLists();	
	}
	
	private def void buildRtscList(){
		listOfPorts = new BasicEList<DiscreteInteractionEndpoint>();
		listOfRtscs = new BasicEList<RealtimeStatechart>();
		for(Port p:component.ports){
			if(p instanceof DiscreteInteractionEndpoint)
			{
				if((p as DiscreteInteractionEndpoint).behavior instanceof RealtimeStatechart){
					listOfPorts.add(p as DiscreteInteractionEndpoint);
					listOfRtscs.add((p as DiscreteInteractionEndpoint).behavior as RealtimeStatechart);
				}
			}
		}
		if(synBehavior.behavior != null && synBehavior.behavior instanceof RealtimeStatechart){
			listOfRtscs.add((synBehavior.behavior) as RealtimeStatechart);
		}
	}
	
	private def void buildTypeLists() {
		var RootNode rootNode = component.eResource().getContents().get(0) as RootNode;
		listOfAllDataTypes = new BasicEList<DataType>();
		listOfAllMessageTypes = new BasicEList<MessageType>();
		var ModelElementCategory modelElementCategory = ModelInstancePlugin.getInstance()
				.getModelElementCategoryRegistry()
				.getModelElementCategory(rootNode, DATA_TYPES_CATEGORY_KEY);
		for (EObject type : modelElementCategory.getModelElements()) {
			listOfAllDataTypes.add(type as DataType);
		}
		modelElementCategory = ModelInstancePlugin.getInstance()
				.getModelElementCategoryRegistry()
				.getModelElementCategory(rootNode, MESSAGE_TYPES_CATEGORY_KEY);
		for (EObject type : modelElementCategory.getModelElements()) {
			var MessageTypeRepository repo = type as MessageTypeRepository;
			listOfAllMessageTypes.addAll(repo.messageTypes);
		}
	}
	
	private def void buildOtherLists()
	{
		listOfAllStates = new BasicEList<State>();
		listOfAllTransitions = new BasicEList<Transition>();
		listOfAllChannels = new BasicEList<SynchronizationChannel>();
		listOfAllClocks = new BasicEList<Clock>();
		listOfAllVariables = new BasicEList<Variable>();
		listOfAllConstants = new BasicEList<Variable>();
		listOfAllHybridPorts = new BasicEList<HybridPort>();
		listOfAllOperations = new BasicEList<Operation>();
		for(RealtimeStatechart rtsc:listOfRtscs){
			recursiveOtherBuildLists(rtsc);
		}
		for(Variable v:listOfAllVariables){
			if(v.constant){
				listOfAllConstants.add(v);
			}
		}
		for(Port p:component.ports){
			if(p instanceof HybridPort){
				listOfAllHybridPorts.add(p as HybridPort);
			}
		} 
	}		
	
	private def void recursiveOtherBuildLists(RealtimeStatechart rtsc){
		if(rtsc != null)	{
			for(State s: rtsc.states){
				for(Region r:s.embeddedRegions){
					recursiveOtherBuildLists(r.embeddedStatechart);
				}
				listOfAllChannels.addAll(s.channels);		
			}
			listOfAllStates.addAll(rtsc.states);
			listOfAllClocks.addAll(rtsc.clocks);
			listOfAllTransitions.addAll(rtsc.transitions);
			listOfAllVariables.addAll(rtsc.variables);
			listOfAllOperations.addAll(rtsc.operations);
			
		}	
	}

	package def IScope scope_ForbiddenStateCombination_states(ForbiddenStateCombination context, EReference reference){
		var BasicEList<State> states = new BasicEList();
 		states.addAll(listOfAllStates);
		//TODO Remove states that are used already in context or which are of the same rtsc as the used.
		return createQNScope(states);
	}
	
	package def IScope scope_TransitionEvent_transition(EObject context, EReference reference){
		return createQNScope(listOfAllTransitions);
	}
	
	package def IScope scope_StateEvent_state(EObject context, EReference reference){
		return createQNScope(listOfAllStates);
	}
	
	package def IScope scope_StateCombinationEvent_states(EObject context, EReference reference){
		return createQNScope(listOfAllStates);
	}
	
	package def IScope scope_BoundedActiveState_states(EObject context, EReference reference){
		return createQNScope(listOfAllStates);
	}
	
	package def IScope scope_DataConstraint_variable(EObject context, EReference reference){
		return createQNScope(listOfAllVariables);
	}
	
	package def IScope scope_ClockConstraint_clock(EObject context, EReference reference){
		return createQNScope(listOfAllClocks);
	}
	
	package def IScope scope_DataMerge_variables(EObject context, EReference reference){
		return createQNScope(listOfAllVariables);
	}
	
	package def IScope scope_ClockMerge_clocks(EObject context, EReference reference){
		return createQNScope(listOfAllClocks);
	}
	
	package def IScope scope_ClockResetEffect_clocks(EObject context, EReference reference){
		return createQNScope(listOfAllClocks);
	}
		
	package def IScope scope_DataAssignmentEffect_lhs_variable(EObject context, EReference reference){
		return createQNScope(listOfAllVariables);
	}
	
	package def IScope scope_MessageEvent_type(Object object, EReference ref) {
		return createScope(listOfAllMessageTypes); //TODO may reduce the list to the message types the port's role supports.
	}
	
	package def IScope scope_MessageEvent_port(Object object, EReference ref) {
		return createScope(listOfPorts);
	}
	
//	package def IScope scope_TypedNamedElementExpression_typedNamedElement(EObject context, EReference reference){
//		return createQNScope(listOfAllVariables);
//	}

	package def IScope scope_TypedNamedElement(EObject context, EReference ref) {
		var EObject container = context.eContainer();
		var BasicEList<TypedNamedElement> scopeList = new BasicEList<TypedNamedElement>();	
		scopeList.addAll(listOfAllVariables);
		scopeList.addAll(listOfAllHybridPorts);
		if (container instanceof Assignment
				&& (container as Assignment).getLhs_typedNamedElementExpression() == context) {
			// do not return hybrid in ports
			for(HybridPort p: listOfAllHybridPorts){
				if(!p.outPort){
					scopeList.remove(p);
				}
			}
			scopeList.removeAll(listOfAllConstants);
		}
		return createQNScope(scopeList);
	}
	
	package def IScope scope_DataType(Variable variable, EReference ref) {
		return createScope(listOfAllDataTypes);
	}
	
	package def IScope scope_Synchronization_selectorType(EObject context, EReference reference){
		return createScope(listOfAllDataTypes);
	}
	
	package def IScope scope_TypedNamedElement_dataType(EObject context, EReference ref) {
		return createScope(listOfAllDataTypes);
	}
	
	package def IScope scope_NondeterministicChoiceExpression_dataType(EObject context, EReference ref) {
		var List<PrimitiveDataType> scopeList = new BasicEList<PrimitiveDataType>();
		for (DataType dataType : listOfAllDataTypes) {
			if (dataType.getName().equals(INT_ID) && dataType instanceof PrimitiveDataType) { // Was copied of ActionLanguage maybe this does not make sense here.
				scopeList.add(dataType as PrimitiveDataType);
				return createScope(scopeList);
			}
		}
		return createScope(scopeList);
	}
	
	package def	IScope scope_Operation(Object object, EReference ref) {
		return createQNScope(listOfAllOperations);
	}
	
	package def IScope scope_MessageType(Object object, EReference ref) {
		return createScope(listOfAllMessageTypes);
	}
	
	package def IScope scope_State(Object object, EReference ref) {
		return createQNScope(listOfAllStates);
	}
	
	package def scope_Parameter(EObject context, EReference ref) {
		var List<Parameter> parameterList = new BasicEList<Parameter>();
		if ((context instanceof ParameterBinding) && context.eContainer() instanceof OperationCall) {
			var OperationCall operationCall = context.eContainer() as OperationCall;
			parameterList = getScopeForOperation(operationCall.getOperation());
		}
		else if (context instanceof TriggerMessageExpression) {
			parameterList = getScopeForTriggerMessageExpression(context as TriggerMessageExpression);
		}
		return createScope(parameterList);	
	}
	
	package def scope_ParameterBinding_parameter(OperationCall context, EReference ref) {
		return createScope(getScopeForOperation(context.getOperation()));
	}
	
	private def List<Parameter> getScopeForOperation(Operation operation) {
		if (operation == null) {
			return new BasicEList<Parameter>();
		}
		return operation.getParameters();
	}
	
	private def List<Parameter> getScopeForTriggerMessageExpression(TriggerMessageExpression triggerMessageExpression) {
		if (triggerMessageExpression.getMessageType() == null) {
			// should not happen
			return new BasicEList<Parameter>();
		}
		return triggerMessageExpression.getMessageType().getParameters();
	}

	
	def void setScopeForEObject(EObject object) {
		if (!setScopeSwitch(object)) {
			throw new IllegalArgumentException("scope not found for object: " + object);
		}
	}	
	
	private def boolean setScopeSwitch(EObject object) {
		if (object instanceof SynthesizableBehavior) {
			setScopeForEObject((object as SynthesizableBehavior));
		} else {
			if(object!=null){
				return setScopeSwitch(object.eContainer);
			}
			return false;
		}
		initLists();
		return true;
	}
	
	private def void setScopeForEObject(SynthesizableBehavior ext) {
		synBehavior = ext;
		dependencyModel = synBehavior.dependencyModel;
		if(ext.base instanceof AtomicComponent){
			component = ext.base as AtomicComponent;
		}
		else{
			throw new IllegalArgumentException("SynthesizableBehavior is broken");
		}	
	}
	
	package def IScope createQNScope(List<? extends EObject> list) {
		if (list ==null || list.isEmpty()) {
			return IScope.NULLSCOPE;
		}
		var IScope scope= Scopes.scopeFor(list,qnProvider,IScope.NULLSCOPE);
		return scope;
	}
	
	package def IScope createScope(List<? extends EObject> list) {
		if (list ==null || list.isEmpty()) {
			return IScope.NULLSCOPE;
		}
		var IScope scope= Scopes.scopeFor(list);
		return scope;
	}
}
