/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.patterns.PatternsPackage;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.AssemblyVariable;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.Call;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPattern;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentStoryPatternVariable;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentVariable;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentstorypatternFactory;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ConnectorVariable;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.DelegationVariable;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.FadingFunction;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.MultiPortVariable;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PartVariable;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PortVariable;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.SinglePortVariable;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.util.ComponentstorypatternValidator;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ControlflowPackage;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.impl.ControlflowPackageImpl;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentstorypatternPackageImpl extends EPackageImpl implements ComponentstorypatternPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentStoryPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentStoryPatternVariableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentVariableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portVariableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partVariableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorVariableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyVariableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationVariableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadingFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singlePortVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPortVariableEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentstorypatternPackageImpl() {
		super(eNS_URI, ComponentstorypatternFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentstorypatternPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentstorypatternPackage init() {
		if (isInited) return (ComponentstorypatternPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentstorypatternPackage.eNS_URI);

		// Obtain or create and register package
		ComponentstorypatternPackageImpl theComponentstorypatternPackage = (ComponentstorypatternPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentstorypatternPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentstorypatternPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ReconfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ControlflowPackageImpl theControlflowPackage = (ControlflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ControlflowPackage.eNS_URI) instanceof ControlflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ControlflowPackage.eNS_URI) : ControlflowPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentstorypatternPackage.createPackageContents();
		theControlflowPackage.createPackageContents();

		// Initialize created meta-data
		theComponentstorypatternPackage.initializePackageContents();
		theControlflowPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theComponentstorypatternPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ComponentstorypatternValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theComponentstorypatternPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentstorypatternPackage.eNS_URI, theComponentstorypatternPackage);
		return theComponentstorypatternPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentStoryPattern() {
		return componentStoryPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentStoryPattern_ThisVariable() {
		return (EReference)componentStoryPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentStoryPatternVariable() {
		return componentStoryPatternVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentStoryPatternVariable_BindingSemantics() {
		return (EAttribute)componentStoryPatternVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentStoryPatternVariable_BindingOperator() {
		return (EAttribute)componentStoryPatternVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentStoryPatternVariable_BindingState() {
		return (EAttribute)componentStoryPatternVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentVariable() {
		return componentVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentVariable_PortVariables() {
		return (EReference)componentVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentVariable_PartVariables() {
		return (EReference)componentVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentVariable_ConnectorVariables() {
		return (EReference)componentVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentVariable_Type() {
		return (EReference)componentVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortVariable() {
		return portVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortVariable_Type() {
		return (EReference)portVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortVariable_ConnectorVariables() {
		return (EReference)portVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartVariable() {
		return partVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartVariable_PortVariables() {
		return (EReference)partVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartVariable_Type() {
		return (EReference)partVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartVariable_Call() {
		return (EReference)partVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorVariable() {
		return connectorVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorVariable_PortVariables() {
		return (EReference)connectorVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyVariable() {
		return assemblyVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyVariable_Type() {
		return (EReference)assemblyVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationVariable() {
		return delegationVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationVariable_Type() {
		return (EReference)delegationVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_Callee() {
		return (EReference)callEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_ParameterBinding() {
		return (EReference)callEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadingFunction() {
		return fadingFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFadingFunction_FromPort() {
		return (EReference)fadingFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFadingFunction_ToPort() {
		return (EReference)fadingFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinglePortVariable() {
		return singlePortVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSinglePortVariable_MultiPortVariable() {
		return (EReference)singlePortVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiPortVariable() {
		return multiPortVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPortVariable_SubPortVariables() {
		return (EReference)multiPortVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPortVariable_GmfSubPortVariables() {
		return (EReference)multiPortVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentstorypatternFactory getComponentstorypatternFactory() {
		return (ComponentstorypatternFactory)getEFactoryInstance();
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
		componentStoryPatternEClass = createEClass(COMPONENT_STORY_PATTERN);
		createEReference(componentStoryPatternEClass, COMPONENT_STORY_PATTERN__THIS_VARIABLE);

		componentStoryPatternVariableEClass = createEClass(COMPONENT_STORY_PATTERN_VARIABLE);
		createEAttribute(componentStoryPatternVariableEClass, COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS);
		createEAttribute(componentStoryPatternVariableEClass, COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR);
		createEAttribute(componentStoryPatternVariableEClass, COMPONENT_STORY_PATTERN_VARIABLE__BINDING_STATE);

		componentVariableEClass = createEClass(COMPONENT_VARIABLE);
		createEReference(componentVariableEClass, COMPONENT_VARIABLE__PORT_VARIABLES);
		createEReference(componentVariableEClass, COMPONENT_VARIABLE__PART_VARIABLES);
		createEReference(componentVariableEClass, COMPONENT_VARIABLE__CONNECTOR_VARIABLES);
		createEReference(componentVariableEClass, COMPONENT_VARIABLE__TYPE);

		portVariableEClass = createEClass(PORT_VARIABLE);
		createEReference(portVariableEClass, PORT_VARIABLE__TYPE);
		createEReference(portVariableEClass, PORT_VARIABLE__CONNECTOR_VARIABLES);

		partVariableEClass = createEClass(PART_VARIABLE);
		createEReference(partVariableEClass, PART_VARIABLE__PORT_VARIABLES);
		createEReference(partVariableEClass, PART_VARIABLE__TYPE);
		createEReference(partVariableEClass, PART_VARIABLE__CALL);

		connectorVariableEClass = createEClass(CONNECTOR_VARIABLE);
		createEReference(connectorVariableEClass, CONNECTOR_VARIABLE__PORT_VARIABLES);

		assemblyVariableEClass = createEClass(ASSEMBLY_VARIABLE);
		createEReference(assemblyVariableEClass, ASSEMBLY_VARIABLE__TYPE);

		delegationVariableEClass = createEClass(DELEGATION_VARIABLE);
		createEReference(delegationVariableEClass, DELEGATION_VARIABLE__TYPE);

		callEClass = createEClass(CALL);
		createEReference(callEClass, CALL__CALLEE);
		createEReference(callEClass, CALL__PARAMETER_BINDING);

		fadingFunctionEClass = createEClass(FADING_FUNCTION);
		createEReference(fadingFunctionEClass, FADING_FUNCTION__FROM_PORT);
		createEReference(fadingFunctionEClass, FADING_FUNCTION__TO_PORT);

		singlePortVariableEClass = createEClass(SINGLE_PORT_VARIABLE);
		createEReference(singlePortVariableEClass, SINGLE_PORT_VARIABLE__MULTI_PORT_VARIABLE);

		multiPortVariableEClass = createEClass(MULTI_PORT_VARIABLE);
		createEReference(multiPortVariableEClass, MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES);
		createEReference(multiPortVariableEClass, MULTI_PORT_VARIABLE__GMF_SUB_PORT_VARIABLES);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		PatternsPackage thePatternsPackage = (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);
		ReconfigurationPackage theReconfigurationPackage = (ReconfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI);
		ConnectorPackage theConnectorPackage = (ConnectorPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectorPackage.eNS_URI);
		ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);
		ControlflowPackage theControlflowPackage = (ControlflowPackage)EPackage.Registry.INSTANCE.getEPackage(ControlflowPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentStoryPatternEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		componentStoryPatternEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		componentStoryPatternVariableEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		componentStoryPatternVariableEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		componentVariableEClass.getESuperTypes().add(this.getComponentStoryPatternVariable());
		portVariableEClass.getESuperTypes().add(this.getComponentStoryPatternVariable());
		portVariableEClass.getESuperTypes().add(theConnectorPackage.getConnectorEndpoint());
		partVariableEClass.getESuperTypes().add(this.getComponentStoryPatternVariable());
		connectorVariableEClass.getESuperTypes().add(this.getComponentStoryPatternVariable());
		connectorVariableEClass.getESuperTypes().add(theConnectorPackage.getConnector());
		assemblyVariableEClass.getESuperTypes().add(this.getConnectorVariable());
		delegationVariableEClass.getESuperTypes().add(this.getConnectorVariable());
		callEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		fadingFunctionEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		fadingFunctionEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		singlePortVariableEClass.getESuperTypes().add(this.getPortVariable());
		multiPortVariableEClass.getESuperTypes().add(this.getPortVariable());

		// Initialize classes and features; add operations and parameters
		initEClass(componentStoryPatternEClass, ComponentStoryPattern.class, "ComponentStoryPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentStoryPattern_ThisVariable(), this.getComponentVariable(), null, "thisVariable", null, 1, 1, ComponentStoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentStoryPatternVariableEClass, ComponentStoryPatternVariable.class, "ComponentStoryPatternVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentStoryPatternVariable_BindingSemantics(), thePatternsPackage.getBindingSemantics(), "bindingSemantics", "BindingSemantics.MANDATORY", 0, 1, ComponentStoryPatternVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentStoryPatternVariable_BindingOperator(), thePatternsPackage.getBindingOperator(), "bindingOperator", "BindingOperator.CHECK_ONLY", 0, 1, ComponentStoryPatternVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentStoryPatternVariable_BindingState(), thePatternsPackage.getBindingState(), "bindingState", "BindingState.UNBOUND", 0, 1, ComponentStoryPatternVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentVariableEClass, ComponentVariable.class, "ComponentVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentVariable_PortVariables(), this.getPortVariable(), null, "portVariables", null, 0, -1, ComponentVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentVariable_PartVariables(), this.getPartVariable(), null, "partVariables", null, 0, -1, ComponentVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentVariable_ConnectorVariables(), this.getConnectorVariable(), null, "connectorVariables", null, 0, -1, ComponentVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentVariable_Type(), theReconfigurationPackage.getReconfigurableComponent(), null, "type", null, 1, 1, ComponentVariable.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(portVariableEClass, PortVariable.class, "PortVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortVariable_Type(), theComponentPackage.getPort(), null, "type", null, 1, 1, PortVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortVariable_ConnectorVariables(), this.getConnectorVariable(), null, "connectorVariables", null, 0, -1, PortVariable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(partVariableEClass, PartVariable.class, "PartVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartVariable_PortVariables(), this.getPortVariable(), null, "portVariables", null, 0, -1, PartVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartVariable_Type(), theComponentPackage.getComponentPart(), null, "type", null, 1, 1, PartVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartVariable_Call(), this.getCall(), null, "call", null, 0, 1, PartVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorVariableEClass, ConnectorVariable.class, "ConnectorVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorVariable_PortVariables(), this.getPortVariable(), null, "portVariables", null, 0, -1, ConnectorVariable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(assemblyVariableEClass, AssemblyVariable.class, "AssemblyVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyVariable_Type(), theComponentPackage.getAssemblyConnector(), null, "type", null, 1, 1, AssemblyVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationVariableEClass, DelegationVariable.class, "DelegationVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationVariable_Type(), theComponentPackage.getDelegationConnector(), null, "type", null, 1, 1, DelegationVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCall_Callee(), theControlflowPackage.getComponentStoryRule(), null, "callee", null, 1, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCall_ParameterBinding(), theBehaviorPackage.getParameterBinding(), null, "parameterBinding", null, 0, -1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fadingFunctionEClass, FadingFunction.class, "FadingFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFadingFunction_FromPort(), this.getPortVariable(), null, "fromPort", null, 1, 1, FadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFadingFunction_ToPort(), this.getPortVariable(), null, "toPort", null, 1, 1, FadingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singlePortVariableEClass, SinglePortVariable.class, "SinglePortVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSinglePortVariable_MultiPortVariable(), this.getMultiPortVariable(), this.getMultiPortVariable_SubPortVariables(), "multiPortVariable", null, 0, 1, SinglePortVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiPortVariableEClass, MultiPortVariable.class, "MultiPortVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiPortVariable_SubPortVariables(), this.getSinglePortVariable(), this.getSinglePortVariable_MultiPortVariable(), "subPortVariables", null, 0, -1, MultiPortVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiPortVariable_GmfSubPortVariables(), this.getSinglePortVariable(), null, "gmfSubPortVariables", null, 0, -1, MultiPortVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		  (componentVariableEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtLeastOnePartVariableOrPortVariable"
		   });				
		addAnnotation
		  (portVariableEClass, 
		   source, 
		   new String[] {
			 "constraints", "SameBindingOperatorAsParent SameBindingSemanticsAsParent ValidTypeOfPortVariable"
		   });				
		addAnnotation
		  (partVariableEClass, 
		   source, 
		   new String[] {
			 "constraints", "SameBindingOperatorAsComponentVariable ValidTypeOfPartVariable"
		   });			
		addAnnotation
		  (connectorVariableEClass, 
		   source, 
		   new String[] {
			 "constraints", "MustNotConnectCreateAndDestroyPorts SameBindingOperatorAsPortVariable ExistingConnectorBetweenPortVariableTypes"
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
		  (componentVariableEClass, 
		   source, 
		   new String[] {
			 "AtLeastOnePartVariableOrPortVariable", "self.portVariables->size() > 0 or self.partVariables->size() > 0"
		   });			
		addAnnotation
		  (getComponentVariable_Type(), 
		   source, 
		   new String[] {
			 "derivation", "self.eContainer().eContainer().eContainer().eContainer().oclAsType(reconfiguration::ReconfigurationRule).reconfiguredComponent"
		   });		
		addAnnotation
		  (portVariableEClass, 
		   source, 
		   new String[] {
			 "SameBindingOperatorAsParent", "if self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n\tself.bindingOperator = self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator\r\nelse\r\n\ttrue\r\nendif",
			 "SameBindingSemanticsAsParent", "if self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingSemantics=storydiagrams::patterns::BindingSemantics::OPTIONAL then\r\n\tself.bindingSemantics = self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingSemantics\r\nelse\r\n\ttrue\r\nendif",
			 "ValidTypeOfPortVariable", "if self.eContainer().oclIsKindOf(ComponentVariable) then\r\n\tif not self.eContainer().oclAsType(ComponentVariable).type.oclIsUndefined() then\r\n\t\tself.eContainer().oclAsType(ComponentVariable).type.oclAsType(muml::model::component::Component).ports->includes(self.type.oclAsType(muml::model::component::Port))\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nelse\r\n\tif self.eContainer().oclIsKindOf(PartVariable) then\r\n\t\tif not self.eContainer().oclAsType(PartVariable).type.oclIsUndefined() then\r\n\t\t\tself.eContainer().oclAsType(PartVariable).type.oclAsType(muml::model::component::ComponentPart).componentType.oclAsType(muml::model::component::Component).ports->includes(self.type.oclAsType(muml::model::component::Port))\r\n\t\telse\r\n\t\t\tfalse\r\n\t\tendif\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif"
		   });			
		addAnnotation
		  (getPortVariable_ConnectorVariables(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectors->select(c | c.oclIsKindOf(ConnectorVariable)).oclAsType(ConnectorVariable)->asOrderedSet()"
		   });		
		addAnnotation
		  (partVariableEClass, 
		   source, 
		   new String[] {
			 "SameBindingOperatorAsComponentVariable", "if self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n\tself.bindingOperator = self.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator\r\nelse\r\n\ttrue\r\nendif",
			 "ValidTypeOfPartVariable", "if not self.eContainer().oclAsType(ComponentVariable).type.oclIsUndefined() then\r\n\tif self.eContainer().oclAsType(ComponentVariable).type.oclIsKindOf(muml::model::component::StructuredComponent) then\r\n\t\tself.eContainer().oclAsType(ComponentVariable).type.oclAsType(muml::model::component::StructuredComponent).embeddedParts->includes(self.type.oclAsType(muml::model::component::ComponentPart))\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nelse\r\n\tfalse\r\nendif"
		   });			
		addAnnotation
		  (connectorVariableEClass, 
		   source, 
		   new String[] {
			 "MustNotConnectCreateAndDestroyPorts", "if self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator=storydiagrams::patterns::BindingOperator::CREATE then\r\n\tself.target.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::DESTROY\r\nelse\r\n\tif self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator=storydiagrams::patterns::BindingOperator::DESTROY then\r\n\t\tself.target.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CREATE\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif",
			 "SameBindingOperatorAsPortVariable", "if self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n\tself.oclAsType(ComponentStoryPatternVariable).bindingOperator = self.source.oclAsType(ComponentStoryPatternVariable).bindingOperator\r\nelse\r\n\tif self.target.oclAsType(ComponentStoryPatternVariable).bindingOperator<>storydiagrams::patterns::BindingOperator::CHECK_ONLY then\r\n\t\tself.oclAsType(ComponentStoryPatternVariable).bindingOperator = self.target.oclAsType(ComponentStoryPatternVariable).bindingOperator\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif",
			 "ExistingConnectorBetweenPortVariableTypes", "if self.oclIsKindOf(AssemblyVariable) then\r\n\tif not self.oclAsType(AssemblyVariable).type.oclIsUndefined() then\r\n\t\t(self.oclAsType(AssemblyVariable).type.oclAsType(muml::model::component::ConnectorType).fromPort = self.source.oclAsType(PortVariable).type and\r\n\t\tself.oclAsType(AssemblyVariable).type.oclAsType(muml::model::component::ConnectorType).toPort = self.target.oclAsType(PortVariable).type) or\r\n\t\t(self.oclAsType(AssemblyVariable).type.oclAsType(muml::model::component::ConnectorType).toPort = self.source.oclAsType(PortVariable).type and\r\n\t\tself.oclAsType(AssemblyVariable).type.oclAsType(muml::model::component::ConnectorType).fromPort = self.target.oclAsType(PortVariable).type)\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nelse\r\n\tif self.oclIsKindOf(DelegationVariable) then\r\n\t\tif not self.oclAsType(DelegationVariable).type.oclIsUndefined() then\r\n\t\t\t(self.oclAsType(DelegationVariable).type.oclAsType(muml::model::component::ConnectorType).fromPort = self.source.oclAsType(PortVariable).type and\r\n\t\t\tself.oclAsType(DelegationVariable).type.oclAsType(muml::model::component::ConnectorType).toPort = self.target.oclAsType(PortVariable).type) or\r\n\t\t\t(self.oclAsType(DelegationVariable).type.oclAsType(muml::model::component::ConnectorType).toPort = self.source.oclAsType(PortVariable).type and\r\n\t\t\tself.oclAsType(DelegationVariable).type.oclAsType(muml::model::component::ConnectorType).fromPort = self.target.oclAsType(PortVariable).type)\r\n\t\telse\r\n\t\t\tfalse\r\n\t\tendif\t\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nendif"
		   });			
		addAnnotation
		  (getConnectorVariable_PortVariables(), 
		   source, 
		   new String[] {
			 "derivation", "self.connectorEndpoints->select(i | i.oclIsKindOf(PortVariable)).oclAsType(PortVariable)->asOrderedSet()"
		   });				
		addAnnotation
		  (getMultiPortVariable_GmfSubPortVariables(), 
		   source, 
		   new String[] {
			 "derivation", "self.subPortVariables"
		   });
	}

} //ComponentstorypatternPackageImpl
