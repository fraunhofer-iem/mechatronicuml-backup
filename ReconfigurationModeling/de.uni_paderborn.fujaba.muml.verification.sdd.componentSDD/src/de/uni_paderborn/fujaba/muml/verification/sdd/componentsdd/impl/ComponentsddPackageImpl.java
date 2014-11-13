/**
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryPatternNode;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddFactory;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.EvaluateComponentSDDExpression;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.InitialNode;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.util.ComponentsddValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentsddPackageImpl extends EPackageImpl implements ComponentsddPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentStoryDecisionDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentStoryPatternNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluateComponentSDDExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentsddPackageImpl() {
		super(eNS_URI, ComponentsddFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentsddPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentsddPackage init() {
		if (isInited) return (ComponentsddPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsddPackage.eNS_URI);

		// Obtain or create and register package
		ComponentsddPackageImpl theComponentsddPackage = (ComponentsddPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentsddPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentsddPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentstorypatternPackage.eINSTANCE.eClass();
		SDDPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentsddPackage.createPackageContents();

		// Initialize created meta-data
		theComponentsddPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theComponentsddPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ComponentsddValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theComponentsddPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentsddPackage.eNS_URI, theComponentsddPackage);
		return theComponentsddPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentStoryDecisionDiagram() {
		return componentStoryDecisionDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentStoryDecisionDiagram_InvariantSDD() {
		return (EAttribute)componentStoryDecisionDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentStoryPatternNode() {
		return componentStoryPatternNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentStoryPatternNode_Pattern() {
		return (EReference)componentStoryPatternNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluateComponentSDDExpression() {
		return evaluateComponentSDDExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluateComponentSDDExpression_ComponentSDD() {
		return (EReference)evaluateComponentSDDExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluateComponentSDDExpression_ParameterBindings() {
		return (EReference)evaluateComponentSDDExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsddFactory getComponentsddFactory() {
		return (ComponentsddFactory)getEFactoryInstance();
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
		componentStoryDecisionDiagramEClass = createEClass(COMPONENT_STORY_DECISION_DIAGRAM);
		createEAttribute(componentStoryDecisionDiagramEClass, COMPONENT_STORY_DECISION_DIAGRAM__INVARIANT_SDD);

		componentStoryPatternNodeEClass = createEClass(COMPONENT_STORY_PATTERN_NODE);
		createEReference(componentStoryPatternNodeEClass, COMPONENT_STORY_PATTERN_NODE__PATTERN);

		evaluateComponentSDDExpressionEClass = createEClass(EVALUATE_COMPONENT_SDD_EXPRESSION);
		createEReference(evaluateComponentSDDExpressionEClass, EVALUATE_COMPONENT_SDD_EXPRESSION__COMPONENT_SDD);
		createEReference(evaluateComponentSDDExpressionEClass, EVALUATE_COMPONENT_SDD_EXPRESSION__PARAMETER_BINDINGS);

		initialNodeEClass = createEClass(INITIAL_NODE);
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
		SDDPackage theSDDPackage = (SDDPackage)EPackage.Registry.INSTANCE.getEPackage(SDDPackage.eNS_URI);
		ReconfigurationPackage theReconfigurationPackage = (ReconfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ComponentstorypatternPackage theComponentstorypatternPackage = (ComponentstorypatternPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentstorypatternPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentStoryDecisionDiagramEClass.getESuperTypes().add(theSDDPackage.getAbstractStoryDecisionDiagram());
		componentStoryDecisionDiagramEClass.getESuperTypes().add(theReconfigurationPackage.getStructuralCondition());
		componentStoryPatternNodeEClass.getESuperTypes().add(theSDDPackage.getPatternNode());
		evaluateComponentSDDExpressionEClass.getESuperTypes().add(theComponentstorypatternPackage.getTriggerEmbeddedComponentExpression());
		initialNodeEClass.getESuperTypes().add(theSDDPackage.getNode());
		initialNodeEClass.getESuperTypes().add(theEcorePackage.getEObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentStoryDecisionDiagramEClass, ComponentStoryDecisionDiagram.class, "ComponentStoryDecisionDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentStoryDecisionDiagram_InvariantSDD(), theEcorePackage.getEBoolean(), "invariantSDD", null, 0, 1, ComponentStoryDecisionDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentStoryPatternNodeEClass, ComponentStoryPatternNode.class, "ComponentStoryPatternNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentStoryPatternNode_Pattern(), theComponentstorypatternPackage.getComponentStoryPattern(), null, "pattern", null, 1, 1, ComponentStoryPatternNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluateComponentSDDExpressionEClass, EvaluateComponentSDDExpression.class, "EvaluateComponentSDDExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluateComponentSDDExpression_ComponentSDD(), this.getComponentStoryDecisionDiagram(), null, "componentSDD", null, 1, 1, EvaluateComponentSDDExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluateComponentSDDExpression_ParameterBindings(), theBehaviorPackage.getParameterBinding(), null, "parameterBindings", null, 0, -1, EvaluateComponentSDDExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (componentStoryPatternNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "noNegativeVariables noVariableModifications"
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
		  (componentStoryPatternNodeEClass, 
		   source, 
		   new String[] {
			 "noNegativeVariables", "let\r\n\tpartVariables : OrderedSet(componentstorypattern::PartVariable) = pattern.thisVariable.partVariables,\r\n\tconnectorVariables : OrderedSet(componentstorypattern::ConnectorVariable) = pattern.thisVariable.connectorVariables,\r\n\tportVariable : OrderedSet(componentstorypattern::ComponentStoryPatternVariable) = partVariables->collect(portVariables)->asOrderedSet()\r\nin\r\n\tportVariable->union(partVariables)->union(connectorVariables)->forAll(cV | cV.bindingSemantics = storydiagrams::patterns::BindingSemantics::MANDATORY)",
			 "noVariableModifications", "let\r\n\tpartVariables : OrderedSet(componentstorypattern::PartVariable) = pattern.thisVariable.partVariables,\r\n\tconnectorVariables : OrderedSet(componentstorypattern::ConnectorVariable) = pattern.thisVariable.connectorVariables,\r\n\tportVariable : OrderedSet(componentstorypattern::ComponentStoryPatternVariable) = partVariables->collect(portVariables)->asOrderedSet()\r\nin\r\n\tportVariable->union(partVariables)->union(connectorVariables)->forAll(cV | cV.bindingOperator = storydiagrams::patterns::BindingOperator::CHECK_ONLY)"
		   });
	}

} //ComponentsddPackageImpl
