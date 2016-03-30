/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration.expression.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.expressions.ExpressionsPackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.reconfiguration.ReconfigurationPackage;
import org.muml.reconfiguration.expression.ActivityCallExpression;
import org.muml.reconfiguration.expression.EvaluateStructuralConditionExpression;
import org.muml.reconfiguration.expression.ExpressionFactory;
import org.muml.reconfiguration.expression.ExpressionPackage;
import org.muml.reconfiguration.expression.ReconfigurationRuleCallExpression;
import org.muml.reconfiguration.impl.ReconfigurationPackageImpl;
import org.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage;
import org.muml.reconfiguration.protocolinstantiation.impl.ProtocolinstantiationPackageImpl;
import org.muml.reconfiguration.reconfInstance.ReconfInstancePackage;
import org.muml.reconfiguration.reconfInstance.impl.ReconfInstancePackageImpl;
import org.muml.reconfiguration.structdatatype.StructdatatypePackage;
import org.muml.reconfiguration.structdatatype.impl.StructdatatypePackageImpl;
import org.muml.storydiagram.StorydiagramsPackage;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.calls.CallsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionPackageImpl extends EPackageImpl implements ExpressionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityCallExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationRuleCallExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluateStructuralConditionExpressionEClass = null;

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
	 * @see org.muml.reconfiguration.expression.ExpressionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionPackageImpl() {
		super(eNS_URI, ExpressionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExpressionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionPackage init() {
		if (isInited) return (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Obtain or create and register package
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentPackage.eINSTANCE.eClass();
		ConstraintPackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		ProtocolPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgtypePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		ConnectorPackage.eINSTANCE.eClass();
		ValuetypePackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();
		PatternPackage.eINSTANCE.eClass();
		StorydiagramsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ReconfigurationPackageImpl theReconfigurationPackage = (ReconfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI) instanceof ReconfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI) : ReconfigurationPackage.eINSTANCE);
		StructdatatypePackageImpl theStructdatatypePackage = (StructdatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructdatatypePackage.eNS_URI) instanceof StructdatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructdatatypePackage.eNS_URI) : StructdatatypePackage.eINSTANCE);
		ProtocolinstantiationPackageImpl theProtocolinstantiationPackage = (ProtocolinstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProtocolinstantiationPackage.eNS_URI) instanceof ProtocolinstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProtocolinstantiationPackage.eNS_URI) : ProtocolinstantiationPackage.eINSTANCE);
		ReconfInstancePackageImpl theReconfInstancePackage = (ReconfInstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReconfInstancePackage.eNS_URI) instanceof ReconfInstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReconfInstancePackage.eNS_URI) : ReconfInstancePackage.eINSTANCE);

		// Create package meta-data objects
		theExpressionPackage.createPackageContents();
		theReconfigurationPackage.createPackageContents();
		theStructdatatypePackage.createPackageContents();
		theProtocolinstantiationPackage.createPackageContents();
		theReconfInstancePackage.createPackageContents();

		// Initialize created meta-data
		theExpressionPackage.initializePackageContents();
		theReconfigurationPackage.initializePackageContents();
		theStructdatatypePackage.initializePackageContents();
		theProtocolinstantiationPackage.initializePackageContents();
		theReconfInstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionPackage.eNS_URI, theExpressionPackage);
		return theExpressionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityCallExpression() {
		return activityCallExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityCallExpression_Activity() {
		return (EReference)activityCallExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconfigurationRuleCallExpression() {
		return reconfigurationRuleCallExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationRuleCallExpression_ReconfigurationRule() {
		return (EReference)reconfigurationRuleCallExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconfigurationRuleCallExpression_ParameterBindings() {
		return (EReference)reconfigurationRuleCallExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluateStructuralConditionExpression() {
		return evaluateStructuralConditionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluateStructuralConditionExpression_ParameterBindings() {
		return (EReference)evaluateStructuralConditionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluateStructuralConditionExpression_StructuralCondition() {
		return (EReference)evaluateStructuralConditionExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFactory getExpressionFactory() {
		return (ExpressionFactory)getEFactoryInstance();
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
		activityCallExpressionEClass = createEClass(ACTIVITY_CALL_EXPRESSION);
		createEReference(activityCallExpressionEClass, ACTIVITY_CALL_EXPRESSION__ACTIVITY);

		reconfigurationRuleCallExpressionEClass = createEClass(RECONFIGURATION_RULE_CALL_EXPRESSION);
		createEReference(reconfigurationRuleCallExpressionEClass, RECONFIGURATION_RULE_CALL_EXPRESSION__RECONFIGURATION_RULE);
		createEReference(reconfigurationRuleCallExpressionEClass, RECONFIGURATION_RULE_CALL_EXPRESSION__PARAMETER_BINDINGS);

		evaluateStructuralConditionExpressionEClass = createEClass(EVALUATE_STRUCTURAL_CONDITION_EXPRESSION);
		createEReference(evaluateStructuralConditionExpressionEClass, EVALUATE_STRUCTURAL_CONDITION_EXPRESSION__PARAMETER_BINDINGS);
		createEReference(evaluateStructuralConditionExpressionEClass, EVALUATE_STRUCTURAL_CONDITION_EXPRESSION__STRUCTURAL_CONDITION);
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
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		CallsPackage theCallsPackage = (CallsPackage)EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI);
		ActivitiesPackage theActivitiesPackage = (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
		ReconfigurationPackage theReconfigurationPackage = (ReconfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ReconfigurationPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityCallExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		activityCallExpressionEClass.getESuperTypes().add(theCallsPackage.getInvocation());
		reconfigurationRuleCallExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		evaluateStructuralConditionExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(activityCallExpressionEClass, ActivityCallExpression.class, "ActivityCallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityCallExpression_Activity(), theActivitiesPackage.getActivity(), null, "activity", null, 1, 1, ActivityCallExpression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(reconfigurationRuleCallExpressionEClass, ReconfigurationRuleCallExpression.class, "ReconfigurationRuleCallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReconfigurationRuleCallExpression_ReconfigurationRule(), theReconfigurationPackage.getReconfigurationRule(), null, "reconfigurationRule", null, 1, 1, ReconfigurationRuleCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconfigurationRuleCallExpression_ParameterBindings(), theBehaviorPackage.getParameterBinding(), null, "parameterBindings", null, 0, -1, ReconfigurationRuleCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluateStructuralConditionExpressionEClass, EvaluateStructuralConditionExpression.class, "EvaluateStructuralConditionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluateStructuralConditionExpression_ParameterBindings(), theBehaviorPackage.getParameterBinding(), null, "parameterBindings", null, 0, -1, EvaluateStructuralConditionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluateStructuralConditionExpression_StructuralCondition(), theReconfigurationPackage.getStructuralCondition(), null, "structuralCondition", null, 1, 1, EvaluateStructuralConditionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getActivityCallExpression_Activity(), 
		   source, 
		   new String[] {
			 "derivation", "self.callee.oclAsType(storydiagrams::activities::Activity)"
		   });
	}

} //ExpressionPackageImpl
