/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.storydiagrams.activities.ActivitiesPackage;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowFactory;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeStrategy;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.util.ControlflowValidator;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlflowPackageImpl extends EPackageImpl implements ControlflowPackage {
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
	private EEnum controllerExchangeStrategyEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ControlflowPackageImpl() {
		super(eNS_URI, ControlflowFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ControlflowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ControlflowPackage init() {
		if (isInited) return (ControlflowPackage)EPackage.Registry.INSTANCE.getEPackage(ControlflowPackage.eNS_URI);

		// Obtain or create and register package
		ControlflowPackageImpl theControlflowPackage = (ControlflowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ControlflowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ControlflowPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ReconfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ComponentstorypatternPackageImpl theComponentstorypatternPackage = (ComponentstorypatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentstorypatternPackage.eNS_URI) instanceof ComponentstorypatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentstorypatternPackage.eNS_URI) : ComponentstorypatternPackage.eINSTANCE);

		// Create package meta-data objects
		theControlflowPackage.createPackageContents();
		theComponentstorypatternPackage.createPackageContents();

		// Initialize created meta-data
		theControlflowPackage.initializePackageContents();
		theComponentstorypatternPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theControlflowPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ControlflowValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theControlflowPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControlflowPackage.eNS_URI, theControlflowPackage);
		return theControlflowPackage;
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
	public EAttribute getControllerExchangeNode_ControllerExchangeStrategy() {
		return (EAttribute)controllerExchangeNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerExchangeNode_FadingFunctions() {
		return (EReference)controllerExchangeNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControllerExchangeStrategy() {
		return controllerExchangeStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlflowFactory getControlflowFactory() {
		return (ControlflowFactory)getEFactoryInstance();
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

		componentStoryNodeEClass = createEClass(COMPONENT_STORY_NODE);
		createEReference(componentStoryNodeEClass, COMPONENT_STORY_NODE__COMPONENT_STORY_PATTERN);

		controllerExchangeNodeEClass = createEClass(CONTROLLER_EXCHANGE_NODE);
		createEReference(controllerExchangeNodeEClass, CONTROLLER_EXCHANGE_NODE__DEADLINE);
		createEReference(controllerExchangeNodeEClass, CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN);
		createEAttribute(controllerExchangeNodeEClass, CONTROLLER_EXCHANGE_NODE__CONTROLLER_EXCHANGE_STRATEGY);
		createEReference(controllerExchangeNodeEClass, CONTROLLER_EXCHANGE_NODE__FADING_FUNCTIONS);

		// Create enums
		controllerExchangeStrategyEEnum = createEEnum(CONTROLLER_EXCHANGE_STRATEGY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentStoryRuleEClass.getESuperTypes().add(theReconfigurationPackage.getReconfigurationRule());
		componentStoryNodeEClass.getESuperTypes().add(theActivitiesPackage.getActivityNode());
		controllerExchangeNodeEClass.getESuperTypes().add(theActivitiesPackage.getActivityNode());

		// Initialize classes and features; add operations and parameters
		initEClass(componentStoryRuleEClass, ComponentStoryRule.class, "ComponentStoryRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentStoryRule_Activity(), theActivitiesPackage.getActivity(), null, "activity", null, 1, 1, ComponentStoryRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentStoryNodeEClass, ComponentStoryNode.class, "ComponentStoryNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentStoryNode_ComponentStoryPattern(), theComponentstorypatternPackage.getComponentStoryPattern(), null, "componentStoryPattern", null, 1, 1, ComponentStoryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerExchangeNodeEClass, ControllerExchangeNode.class, "ControllerExchangeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerExchangeNode_Deadline(), theRealtimestatechartPackage.getRelativeDeadline(), null, "deadline", null, 1, 1, ControllerExchangeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerExchangeNode_ComponentStoryPattern(), theComponentstorypatternPackage.getComponentStoryPattern(), null, "componentStoryPattern", null, 1, 1, ControllerExchangeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerExchangeNode_ControllerExchangeStrategy(), this.getControllerExchangeStrategy(), "controllerExchangeStrategy", "ControllerExchangeStrategy.ATOMIC_SWITCHING", 1, 1, ControllerExchangeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerExchangeNode_FadingFunctions(), theComponentstorypatternPackage.getFadingFunction(), null, "fadingFunctions", null, 0, -1, ControllerExchangeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(controllerExchangeStrategyEEnum, ControllerExchangeStrategy.class, "ControllerExchangeStrategy");
		addEEnumLiteral(controllerExchangeStrategyEEnum, ControllerExchangeStrategy.ATOMIC_SWITCHING);
		addEEnumLiteral(controllerExchangeStrategyEEnum, ControllerExchangeStrategy.FADING_FUNCTION);
		addEEnumLiteral(controllerExchangeStrategyEEnum, ControllerExchangeStrategy.FLAT_SWITCHING);

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
			 "constraints", "AllThisVariablesHaveSameType"
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
			 "AllThisVariablesHaveSameType", "if not self.activity.oclIsUndefined() then\r\n\tself.activity.oclAsType(storydiagrams::activities::Activity).ownedActivityNode->collect(oclAsType(ComponentStoryNode).componentStoryPattern.oclAsType(componentstorypattern::ComponentStoryPattern).thisVariable.oclAsType(componentstorypattern::ComponentVariable).type)->asSet()->size() = 1\r\nelse\r\n\tfalse\r\nendif"
		   });					
	}

} //ControlflowPackageImpl
