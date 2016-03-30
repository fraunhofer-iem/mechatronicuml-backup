/**
 */
package org.muml.reconfiguration.componentstorydiagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.reconfiguration.ReconfigurationPackage;
import org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode;
import org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule;
import org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramFactory;
import org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage;
import org.muml.reconfiguration.componentstorydiagram.ControllerExchangeNode;
import org.muml.reconfiguration.componentstorydiagram.SendReconfigurationMessageExpression;
import org.muml.reconfiguration.componentstorydiagram.util.ComponentstorydiagramValidator;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentstorydiagramPackageImpl extends EPackageImpl implements ComponentstorydiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentStoryRuleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentStoryNodeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerExchangeNodeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendReconfigurationMessageExpressionEClass = null;
	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentstorydiagramPackageImpl() {
		super(eNS_URI, ComponentstorydiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ComponentstorydiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentstorydiagramPackage init() {
		if (isInited) return (ComponentstorydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentstorydiagramPackage.eNS_URI);

		// Obtain or create and register package
		ComponentstorydiagramPackageImpl theComponentstorydiagramPackage = (ComponentstorydiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentstorydiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentstorydiagramPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentstorypatternPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentstorydiagramPackage.createPackageContents();

		// Initialize created meta-data
		theComponentstorydiagramPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theComponentstorydiagramPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ComponentstorydiagramValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theComponentstorydiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentstorydiagramPackage.eNS_URI, theComponentstorydiagramPackage);
		return theComponentstorydiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentStoryRule() {
		return componentStoryRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentStoryRule_Activity() {
		return (EReference)componentStoryRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentStoryRule_Constructor() {
		return (EAttribute)componentStoryRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentStoryNode() {
		return componentStoryNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentStoryNode_ComponentStoryPattern() {
		return (EReference)componentStoryNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentStoryNode_ForEach() {
		return (EAttribute)componentStoryNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerExchangeNode() {
		return controllerExchangeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerExchangeNode_Deadline() {
		return (EReference)controllerExchangeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerExchangeNode_ComponentStoryPattern() {
		return (EReference)controllerExchangeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendReconfigurationMessageExpression() {
		return sendReconfigurationMessageExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendReconfigurationMessageExpression_ReconfigurationMessageType() {
		return (EReference)sendReconfigurationMessageExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendReconfigurationMessageExpression_ParameterBindings() {
		return (EReference)sendReconfigurationMessageExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentstorydiagramFactory getComponentstorydiagramFactory() {
		return (ComponentstorydiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentStoryRuleEClass = createEClass(COMPONENT_STORY_RULE);
		createEReference(componentStoryRuleEClass, COMPONENT_STORY_RULE__ACTIVITY);
		createEAttribute(componentStoryRuleEClass, COMPONENT_STORY_RULE__CONSTRUCTOR);

		componentStoryNodeEClass = createEClass(COMPONENT_STORY_NODE);
		createEReference(componentStoryNodeEClass, COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN);
		createEAttribute(componentStoryNodeEClass, COMPONENT_STORY_NODE__FOR_EACH);

		controllerExchangeNodeEClass = createEClass(CONTROLLER_EXCHANGE_NODE);
		createEReference(controllerExchangeNodeEClass, CONTROLLER_EXCHANGE_NODE__DEADLINE);
		createEReference(controllerExchangeNodeEClass, CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN);

		sendReconfigurationMessageExpressionEClass = createEClass(SEND_RECONFIGURATION_MESSAGE_EXPRESSION);
		createEReference(sendReconfigurationMessageExpressionEClass, SEND_RECONFIGURATION_MESSAGE_EXPRESSION__RECONFIGURATION_MESSAGE_TYPE);
		createEReference(sendReconfigurationMessageExpressionEClass, SEND_RECONFIGURATION_MESSAGE_EXPRESSION__PARAMETER_BINDINGS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ReconfigurationPackage theReconfigurationPackage = (ReconfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI);
		ActivitiesPackage theActivitiesPackage = (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
		ComponentstorypatternPackage theComponentstorypatternPackage = (ComponentstorypatternPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentstorypatternPackage.eNS_URI);
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);
		MsgtypePackage theMsgtypePackage = (MsgtypePackage)EPackage.Registry.INSTANCE.getEPackage(MsgtypePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentStoryRuleEClass.getESuperTypes().add(theReconfigurationPackage.getReconfigurationRule());
		componentStoryNodeEClass.getESuperTypes().add(theActivitiesPackage.getActivityNode());
		controllerExchangeNodeEClass.getESuperTypes().add(theActivitiesPackage.getActivityNode());
		sendReconfigurationMessageExpressionEClass.getESuperTypes().add(theComponentstorypatternPackage.getTriggerEmbeddedComponentExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentStoryRuleEClass, ComponentStoryRule.class, "ComponentStoryRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentStoryRule_Activity(), theActivitiesPackage.getActivity(), null, "activity", null, 1, 1, ComponentStoryRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentStoryRule_Constructor(), ecorePackage.getEBoolean(), "constructor", "false", 0, 1, ComponentStoryRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentStoryNodeEClass, ComponentStoryNode.class, "ComponentStoryNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentStoryNode_ComponentStoryPattern(), theComponentstorypatternPackage.getComponentStoryPattern(), null, "componentStoryPattern", null, 1, 1, ComponentStoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentStoryNode_ForEach(), ecorePackage.getEBoolean(), "forEach", "false", 0, 1, ComponentStoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerExchangeNodeEClass, ControllerExchangeNode.class, "ControllerExchangeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerExchangeNode_Deadline(), theRealtimestatechartPackage.getRelativeDeadline(), null, "deadline", null, 0, 1, ControllerExchangeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerExchangeNode_ComponentStoryPattern(), theComponentstorypatternPackage.getComponentStoryPattern(), null, "componentStoryPattern", null, 1, 1, ControllerExchangeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendReconfigurationMessageExpressionEClass, SendReconfigurationMessageExpression.class, "SendReconfigurationMessageExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendReconfigurationMessageExpression_ReconfigurationMessageType(), theMsgtypePackage.getMessageType(), null, "reconfigurationMessageType", null, 0, 1, SendReconfigurationMessageExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendReconfigurationMessageExpression_ParameterBindings(), theBehaviorPackage.getParameterBinding(), null, "parameterBindings", null, 0, -1, SendReconfigurationMessageExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (componentStoryRuleEClass, 
		   source, 
		   new String[] {
			 "constraints", "ComponentVariableHasToHaveSameTypeAsReconfiguredComponent"
		   });	
		addAnnotation
		  (controllerExchangeNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "HasOnlyOneCreateAndOneDestroyPartVariable ContainsExactlyOneFadingComponentPartVariable"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (componentStoryRuleEClass, 
		   source, 
		   new String[] {
			 "ComponentVariableHasToHaveSameTypeAsReconfiguredComponent", "-- A ComponentVariable has to have the reconfigured component as type\r\nself.activity.ownedActivityNode->select(oclIsTypeOf(ComponentStoryNode))->forAll(oAN | oAN.oclAsType(ComponentStoryNode).componentStoryPattern.thisVariable.type = self.reconfiguredComponent)\r\nand\r\nself.activity.ownedActivityNode->select(oclIsTypeOf(ControllerExchangeNode))->forAll(oAN | oAN.oclAsType(ControllerExchangeNode).componentStoryPattern.thisVariable.type = self.reconfiguredComponent)"
		   });	
		addAnnotation
		  (controllerExchangeNodeEClass, 
		   source, 
		   new String[] {
			 "HasOnlyOneCreateAndOneDestroyPartVariable", "let partVariables : OrderedSet(componentstorypattern::PartVariable) = self.componentStoryPattern.oclAsType(componentstorypattern::ComponentStoryPattern).thisVariable.oclAsType(componentstorypattern::ComponentVariable).partVariables\r\n->select(pV : componentstorypattern::PartVariable | pV.oclIsKindOf(componentstorypattern::ComponentPartVariable))->asOrderedSet() in\r\npartVariables->size() = 2 and\r\nif partVariables->first().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::CREATE then partVariables->last().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::DESTROY else\r\nif partVariables->first().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::DESTROY then partVariables->last().oclAsType(componentstorypattern::PartVariable).bindingOperator = storydiagrams::patterns::BindingOperator::CREATE else\r\nfalse endif endif\r\n",
			 "ContainsExactlyOneFadingComponentPartVariable", "let fadingComponentPartVariables : OrderedSet(componentstorypattern::PartVariable) = self.componentStoryPattern.oclAsType(componentstorypattern::ComponentStoryPattern).thisVariable.oclAsType(componentstorypattern::ComponentVariable).partVariables->select(pv : componentstorypattern::PartVariable | pv.oclIsKindOf(componentstorypattern::FadingComponentPartVariable))->asOrderedSet()\r\n  in fadingComponentPartVariables->size() = 1"
		   });
	}

} //ComponentstorydiagramPackageImpl
