/**
 * @author Sebastian Goschin
 * 
 * Partially reusing code of ActionLanguageScopeProvider
 */
package de.uni_paderborn.fujaba.muml.scoping;

import com.google.common.base.Objects;
import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.ModelInstancePlugin;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.modelinstance.categories.ModelElementCategoryRegistry;
import de.uni_paderborn.fujaba.muml.actionlanguage.Assignment;
import de.uni_paderborn.fujaba.muml.actionlanguage.OperationCall;
import de.uni_paderborn.fujaba.muml.actionlanguage.TriggerMessageExpression;
import de.uni_paderborn.fujaba.muml.actionlanguage.TypedNamedElementExpression;
import de.uni_paderborn.fujaba.muml.behavior.Behavior;
import de.uni_paderborn.fujaba.muml.behavior.Operation;
import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.behavior.TypedNamedElement;
import de.uni_paderborn.fujaba.muml.behavior.Variable;
import de.uni_paderborn.fujaba.muml.component.AtomicComponent;
import de.uni_paderborn.fujaba.muml.component.HybridPort;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint;
import de.uni_paderborn.fujaba.muml.dependencylanguage.DependencyModel;
import de.uni_paderborn.fujaba.muml.dependencylanguage.ForbiddenStateCombination;
import de.uni_paderborn.fujaba.muml.dependencylanguage.SynthesizableBehavior;
import de.uni_paderborn.fujaba.muml.msgtype.MessageType;
import de.uni_paderborn.fujaba.muml.msgtype.MessageTypeRepository;
import de.uni_paderborn.fujaba.muml.naming.MumlQualifiedNameProvider;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.types.DataType;
import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;
import java.util.List;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.storydriven.core.ExtendableElement;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it
 */
@SuppressWarnings("all")
public class DependencyModelLanguageScopeProvider extends AbstractDeclarativeScopeProvider {
  private AtomicComponent component;
  
  private DependencyModel dependencyModel;
  
  private SynthesizableBehavior synBehavior;
  
  private BasicEList<DiscreteInteractionEndpoint> listOfPorts;
  
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
  
  private final static String DATA_TYPES_CATEGORY_KEY = "de.uni_paderborn.fujaba.muml.types.category";
  
  private final static String MESSAGE_TYPES_CATEGORY_KEY = "de.uni_paderborn.fujaba.muml.messagetype.category";
  
  private final static String INT_ID = "INT";
  
  public DependencyModelLanguageScopeProvider() {
    super();
    MumlQualifiedNameProvider _mumlQualifiedNameProvider = new MumlQualifiedNameProvider();
    this.qnProvider = _mumlQualifiedNameProvider;
  }
  
  /**
   * Helpful class to find out what scopes are adressed.
   */
  public IScope getScope(final EObject context, final EReference reference) {
    EClass _eContainingClass = reference.getEContainingClass();
    String _name = _eContainingClass.getName();
    String _plus = ("scope_" + _name);
    String _plus_1 = (_plus + 
      "_");
    String _name_1 = reference.getName();
    String _plus_2 = (_plus_1 + _name_1);
    String _plus_3 = (_plus_2 + 
      "(");
    EClass _eClass = context.eClass();
    String _name_2 = _eClass.getName();
    String _plus_4 = (_plus_3 + _name_2);
    String _plus_5 = (_plus_4 + ", ..)");
    System.out.println(_plus_5);
    return super.getScope(context, reference);
  }
  
  public void initLists() {
    this.buildRtscList();
    this.buildTypeLists();
    this.buildOtherLists();
  }
  
  private void buildRtscList() {
    BasicEList<DiscreteInteractionEndpoint> _basicEList = new BasicEList<DiscreteInteractionEndpoint>();
    this.listOfPorts = _basicEList;
    BasicEList<RealtimeStatechart> _basicEList_1 = new BasicEList<RealtimeStatechart>();
    this.listOfRtscs = _basicEList_1;
    EList<Port> _ports = this.component.getPorts();
    for (final Port p : _ports) {
      if ((p instanceof DiscreteInteractionEndpoint)) {
        Behavior _behavior = ((DiscreteInteractionEndpoint) p).getBehavior();
        if ((_behavior instanceof RealtimeStatechart)) {
          this.listOfPorts.add(((DiscreteInteractionEndpoint) p));
          Behavior _behavior_1 = ((DiscreteInteractionEndpoint) p).getBehavior();
          this.listOfRtscs.add(((RealtimeStatechart) _behavior_1));
        }
      }
    }
    boolean _and = false;
    Behavior _behavior_2 = this.synBehavior.getBehavior();
    boolean _notEquals = (!Objects.equal(_behavior_2, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Behavior _behavior_3 = this.synBehavior.getBehavior();
      _and = (_behavior_3 instanceof RealtimeStatechart);
    }
    if (_and) {
      Behavior _behavior_4 = this.synBehavior.getBehavior();
      this.listOfRtscs.add(((RealtimeStatechart) _behavior_4));
    }
  }
  
  private void buildTypeLists() {
    Resource _eResource = this.component.eResource();
    EList<EObject> _contents = _eResource.getContents();
    EObject _get = _contents.get(0);
    RootNode rootNode = ((RootNode) _get);
    BasicEList<DataType> _basicEList = new BasicEList<DataType>();
    this.listOfAllDataTypes = _basicEList;
    BasicEList<MessageType> _basicEList_1 = new BasicEList<MessageType>();
    this.listOfAllMessageTypes = _basicEList_1;
    ModelInstancePlugin _instance = ModelInstancePlugin.getInstance();
    ModelElementCategoryRegistry _modelElementCategoryRegistry = _instance.getModelElementCategoryRegistry();
    ModelElementCategory modelElementCategory = _modelElementCategoryRegistry.getModelElementCategory(rootNode, DependencyModelLanguageScopeProvider.DATA_TYPES_CATEGORY_KEY);
    EList<ExtendableElement> _modelElements = modelElementCategory.getModelElements();
    for (final EObject type : _modelElements) {
      this.listOfAllDataTypes.add(((DataType) type));
    }
    ModelInstancePlugin _instance_1 = ModelInstancePlugin.getInstance();
    ModelElementCategoryRegistry _modelElementCategoryRegistry_1 = _instance_1.getModelElementCategoryRegistry();
    ModelElementCategory _modelElementCategory = _modelElementCategoryRegistry_1.getModelElementCategory(rootNode, DependencyModelLanguageScopeProvider.MESSAGE_TYPES_CATEGORY_KEY);
    modelElementCategory = _modelElementCategory;
    EList<ExtendableElement> _modelElements_1 = modelElementCategory.getModelElements();
    for (final EObject type_1 : _modelElements_1) {
      {
        MessageTypeRepository repo = ((MessageTypeRepository) type_1);
        EList<MessageType> _messageTypes = repo.getMessageTypes();
        this.listOfAllMessageTypes.addAll(_messageTypes);
      }
    }
  }
  
  private void buildOtherLists() {
    BasicEList<State> _basicEList = new BasicEList<State>();
    this.listOfAllStates = _basicEList;
    BasicEList<Transition> _basicEList_1 = new BasicEList<Transition>();
    this.listOfAllTransitions = _basicEList_1;
    BasicEList<SynchronizationChannel> _basicEList_2 = new BasicEList<SynchronizationChannel>();
    this.listOfAllChannels = _basicEList_2;
    BasicEList<Clock> _basicEList_3 = new BasicEList<Clock>();
    this.listOfAllClocks = _basicEList_3;
    BasicEList<Variable> _basicEList_4 = new BasicEList<Variable>();
    this.listOfAllVariables = _basicEList_4;
    BasicEList<Variable> _basicEList_5 = new BasicEList<Variable>();
    this.listOfAllConstants = _basicEList_5;
    BasicEList<HybridPort> _basicEList_6 = new BasicEList<HybridPort>();
    this.listOfAllHybridPorts = _basicEList_6;
    BasicEList<Operation> _basicEList_7 = new BasicEList<Operation>();
    this.listOfAllOperations = _basicEList_7;
    for (final RealtimeStatechart rtsc : this.listOfRtscs) {
      this.recursiveOtherBuildLists(rtsc);
    }
    for (final Variable v : this.listOfAllVariables) {
      boolean _isConstant = v.isConstant();
      if (_isConstant) {
        this.listOfAllConstants.add(v);
      }
    }
    EList<Port> _ports = this.component.getPorts();
    for (final Port p : _ports) {
      if ((p instanceof HybridPort)) {
        this.listOfAllHybridPorts.add(((HybridPort) p));
      }
    }
  }
  
  private void recursiveOtherBuildLists(final RealtimeStatechart rtsc) {
    boolean _notEquals = (!Objects.equal(rtsc, null));
    if (_notEquals) {
      EList<State> _states = rtsc.getStates();
      for (final State s : _states) {
        {
          EList<Region> _embeddedRegions = s.getEmbeddedRegions();
          for (final Region r : _embeddedRegions) {
            RealtimeStatechart _embeddedStatechart = r.getEmbeddedStatechart();
            this.recursiveOtherBuildLists(_embeddedStatechart);
          }
          EList<SynchronizationChannel> _channels = s.getChannels();
          this.listOfAllChannels.addAll(_channels);
        }
      }
      EList<State> _states_1 = rtsc.getStates();
      this.listOfAllStates.addAll(_states_1);
      EList<Clock> _clocks = rtsc.getClocks();
      this.listOfAllClocks.addAll(_clocks);
      EList<Transition> _transitions = rtsc.getTransitions();
      this.listOfAllTransitions.addAll(_transitions);
      EList<Variable> _variables = rtsc.getVariables();
      this.listOfAllVariables.addAll(_variables);
      EList<Operation> _operations = rtsc.getOperations();
      this.listOfAllOperations.addAll(_operations);
    }
  }
  
  IScope scope_ForbiddenStateCombination_states(final ForbiddenStateCombination context, final EReference reference) {
    BasicEList<State> states = new BasicEList<State>();
    states.addAll(this.listOfAllStates);
    return this.createQNScope(states);
  }
  
  IScope scope_TransitionEvent_transition(final EObject context, final EReference reference) {
    return this.createQNScope(this.listOfAllTransitions);
  }
  
  IScope scope_StateEvent_state(final EObject context, final EReference reference) {
    return this.createQNScope(this.listOfAllStates);
  }
  
  IScope scope_StateCombinationEvent_states(final EObject context, final EReference reference) {
    return this.createQNScope(this.listOfAllStates);
  }
  
  IScope scope_BoundedActiveState_states(final EObject context, final EReference reference) {
    return this.createQNScope(this.listOfAllStates);
  }
  
  IScope scope_DataConstraint_variable(final EObject context, final EReference reference) {
    return this.createQNScope(this.listOfAllVariables);
  }
  
  IScope scope_ClockConstraint_clock(final EObject context, final EReference reference) {
    return this.createQNScope(this.listOfAllClocks);
  }
  
  IScope scope_DataMerge_variables(final EObject context, final EReference reference) {
    return this.createQNScope(this.listOfAllVariables);
  }
  
  IScope scope_ClockMerge_clocks(final EObject context, final EReference reference) {
    return this.createQNScope(this.listOfAllClocks);
  }
  
  IScope scope_ClockResetEffect_clocks(final EObject context, final EReference reference) {
    return this.createQNScope(this.listOfAllClocks);
  }
  
  IScope scope_DataAssignmentEffect_lhs_variable(final EObject context, final EReference reference) {
    return this.createQNScope(this.listOfAllVariables);
  }
  
  IScope scope_MessageEvent_type(final Object object, final EReference ref) {
    return this.createScope(this.listOfAllMessageTypes);
  }
  
  IScope scope_MessageEvent_port(final Object object, final EReference ref) {
    return this.createScope(this.listOfPorts);
  }
  
  IScope scope_TypedNamedElement(final EObject context, final EReference ref) {
    EObject container = context.eContainer();
    BasicEList<TypedNamedElement> scopeList = new BasicEList<TypedNamedElement>();
    scopeList.addAll(this.listOfAllVariables);
    scopeList.addAll(this.listOfAllHybridPorts);
    boolean _and = false;
    if (!(container instanceof Assignment)) {
      _and = false;
    } else {
      TypedNamedElementExpression _lhs_typedNamedElementExpression = ((Assignment) container).getLhs_typedNamedElementExpression();
      boolean _equals = Objects.equal(_lhs_typedNamedElementExpression, context);
      _and = _equals;
    }
    if (_and) {
      for (final HybridPort p : this.listOfAllHybridPorts) {
        boolean _isOutPort = p.isOutPort();
        boolean _not = (!_isOutPort);
        if (_not) {
          scopeList.remove(p);
        }
      }
      scopeList.removeAll(this.listOfAllConstants);
    }
    return this.createQNScope(scopeList);
  }
  
  IScope scope_DataType(final Variable variable, final EReference ref) {
    return this.createScope(this.listOfAllDataTypes);
  }
  
  IScope scope_Synchronization_selectorType(final EObject context, final EReference reference) {
    return this.createScope(this.listOfAllDataTypes);
  }
  
  IScope scope_TypedNamedElement_dataType(final EObject context, final EReference ref) {
    return this.createScope(this.listOfAllDataTypes);
  }
  
  IScope scope_NondeterministicChoiceExpression_dataType(final EObject context, final EReference ref) {
    List<PrimitiveDataType> scopeList = new BasicEList<PrimitiveDataType>();
    for (final DataType dataType : this.listOfAllDataTypes) {
      boolean _and = false;
      String _name = dataType.getName();
      boolean _equals = _name.equals(DependencyModelLanguageScopeProvider.INT_ID);
      if (!_equals) {
        _and = false;
      } else {
        _and = (dataType instanceof PrimitiveDataType);
      }
      if (_and) {
        scopeList.add(((PrimitiveDataType) dataType));
        return this.createScope(scopeList);
      }
    }
    return this.createScope(scopeList);
  }
  
  IScope scope_Operation(final Object object, final EReference ref) {
    return this.createQNScope(this.listOfAllOperations);
  }
  
  IScope scope_MessageType(final Object object, final EReference ref) {
    return this.createScope(this.listOfAllMessageTypes);
  }
  
  IScope scope_State(final Object object, final EReference ref) {
    return this.createQNScope(this.listOfAllStates);
  }
  
  IScope scope_Parameter(final EObject context, final EReference ref) {
    List<Parameter> parameterList = new BasicEList<Parameter>();
    boolean _and = false;
    if (!(context instanceof ParameterBinding)) {
      _and = false;
    } else {
      EObject _eContainer = context.eContainer();
      _and = (_eContainer instanceof OperationCall);
    }
    if (_and) {
      EObject _eContainer_1 = context.eContainer();
      OperationCall operationCall = ((OperationCall) _eContainer_1);
      Operation _operation = operationCall.getOperation();
      List<Parameter> _scopeForOperation = this.getScopeForOperation(_operation);
      parameterList = _scopeForOperation;
    } else {
      if ((context instanceof TriggerMessageExpression)) {
        List<Parameter> _scopeForTriggerMessageExpression = this.getScopeForTriggerMessageExpression(((TriggerMessageExpression) context));
        parameterList = _scopeForTriggerMessageExpression;
      }
    }
    return this.createScope(parameterList);
  }
  
  IScope scope_ParameterBinding_parameter(final OperationCall context, final EReference ref) {
    Operation _operation = context.getOperation();
    List<Parameter> _scopeForOperation = this.getScopeForOperation(_operation);
    return this.createScope(_scopeForOperation);
  }
  
  private List<Parameter> getScopeForOperation(final Operation operation) {
    boolean _equals = Objects.equal(operation, null);
    if (_equals) {
      return new BasicEList<Parameter>();
    }
    return operation.getParameters();
  }
  
  private List<Parameter> getScopeForTriggerMessageExpression(final TriggerMessageExpression triggerMessageExpression) {
    MessageType _messageType = triggerMessageExpression.getMessageType();
    boolean _equals = Objects.equal(_messageType, null);
    if (_equals) {
      return new BasicEList<Parameter>();
    }
    MessageType _messageType_1 = triggerMessageExpression.getMessageType();
    return _messageType_1.getParameters();
  }
  
  public void setScopeForEObject(final EObject object) {
    boolean _setScopeSwitch = this.setScopeSwitch(object);
    boolean _not = (!_setScopeSwitch);
    if (_not) {
      throw new IllegalArgumentException(("scope not found for object: " + object));
    }
  }
  
  private boolean setScopeSwitch(final EObject object) {
    if ((object instanceof SynthesizableBehavior)) {
      this.setScopeForEObject(((SynthesizableBehavior) object));
    } else {
      boolean _notEquals = (!Objects.equal(object, null));
      if (_notEquals) {
        EObject _eContainer = object.eContainer();
        return this.setScopeSwitch(_eContainer);
      }
      return false;
    }
    this.initLists();
    return true;
  }
  
  private void setScopeForEObject(final SynthesizableBehavior ext) {
    this.synBehavior = ext;
    DependencyModel _dependencyModel = this.synBehavior.getDependencyModel();
    this.dependencyModel = _dependencyModel;
    EObject _base = ext.getBase();
    if ((_base instanceof AtomicComponent)) {
      EObject _base_1 = ext.getBase();
      this.component = ((AtomicComponent) _base_1);
    } else {
      throw new IllegalArgumentException("SynthesizableBehavior is broken");
    }
  }
  
  IScope createQNScope(final List<? extends EObject> list) {
    boolean _or = false;
    boolean _equals = Objects.equal(list, null);
    if (_equals) {
      _or = true;
    } else {
      boolean _isEmpty = list.isEmpty();
      _or = _isEmpty;
    }
    if (_or) {
      return IScope.NULLSCOPE;
    }
    IScope scope = Scopes.<EObject>scopeFor(list, this.qnProvider, IScope.NULLSCOPE);
    return scope;
  }
  
  IScope createScope(final List<? extends EObject> list) {
    boolean _or = false;
    boolean _equals = Objects.equal(list, null);
    if (_equals) {
      _or = true;
    } else {
      boolean _isEmpty = list.isEmpty();
      _or = _isEmpty;
    }
    if (_or) {
      return IScope.NULLSCOPE;
    }
    IScope scope = Scopes.scopeFor(list);
    return scope;
  }
}
