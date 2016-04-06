/**
 */
package org.muml.storydiagram.activities.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.muml.core.CorePackage;

import org.muml.storydiagram.StorydiagramPackage;

import org.muml.storydiagram.activities.ActivitiesPackage;

import org.muml.storydiagram.activities.expressions.ExceptionVariableExpression;
import org.muml.storydiagram.activities.expressions.ExpressionsFactory;
import org.muml.storydiagram.activities.expressions.ExpressionsPackage;

import org.muml.storydiagram.activities.impl.ActivitiesPackageImpl;

import org.muml.storydiagram.calls.CallsPackage;

import org.muml.storydiagram.calls.impl.CallsPackageImpl;

import org.muml.storydiagram.impl.StorydiagramPackageImpl;

import org.muml.storydiagram.patterns.PatternsPackage;

import org.muml.storydiagram.patterns.impl.PatternsPackageImpl;

import org.muml.storydiagram.templates.TemplatesPackage;

import org.muml.storydiagram.templates.impl.TemplatesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionVariableExpressionEClass = null;

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
	 * @see org.muml.storydiagram.activities.expressions.ExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionsPackageImpl() {
		super(eNS_URI, ExpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionsPackage init() {
		if (isInited) return (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StorydiagramPackageImpl theStorydiagramPackage = (StorydiagramPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StorydiagramPackage.eNS_URI) instanceof StorydiagramPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StorydiagramPackage.eNS_URI) : StorydiagramPackage.eINSTANCE);
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		CallsPackageImpl theCallsPackage = (CallsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI) instanceof CallsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI) : CallsPackage.eINSTANCE);
		org.muml.storydiagram.calls.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_1 = (org.muml.storydiagram.calls.expressions.impl.ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.muml.storydiagram.calls.expressions.ExpressionsPackage.eNS_URI) instanceof org.muml.storydiagram.calls.expressions.impl.ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.muml.storydiagram.calls.expressions.ExpressionsPackage.eNS_URI) : org.muml.storydiagram.calls.expressions.ExpressionsPackage.eINSTANCE);
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
		org.muml.storydiagram.patterns.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_2 = (org.muml.storydiagram.patterns.expressions.impl.ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.muml.storydiagram.patterns.expressions.ExpressionsPackage.eNS_URI) instanceof org.muml.storydiagram.patterns.expressions.impl.ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.muml.storydiagram.patterns.expressions.ExpressionsPackage.eNS_URI) : org.muml.storydiagram.patterns.expressions.ExpressionsPackage.eINSTANCE);
		TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);

		// Create package meta-data objects
		theExpressionsPackage.createPackageContents();
		theStorydiagramPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theCallsPackage.createPackageContents();
		theExpressionsPackage_1.createPackageContents();
		thePatternsPackage.createPackageContents();
		theExpressionsPackage_2.createPackageContents();
		theTemplatesPackage.createPackageContents();

		// Initialize created meta-data
		theExpressionsPackage.initializePackageContents();
		theStorydiagramPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theCallsPackage.initializePackageContents();
		theExpressionsPackage_1.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		theExpressionsPackage_2.initializePackageContents();
		theTemplatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
		return theExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionVariableExpression() {
		return exceptionVariableExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionVariableExpression_ExceptionVariable() {
		return (EReference)exceptionVariableExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsFactory getExpressionsFactory() {
		return (ExpressionsFactory)getEFactoryInstance();
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
		exceptionVariableExpressionEClass = createEClass(EXCEPTION_VARIABLE_EXPRESSION);
		createEReference(exceptionVariableExpressionEClass, EXCEPTION_VARIABLE_EXPRESSION__EXCEPTION_VARIABLE);
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
		org.muml.core.expressions.ExpressionsPackage theExpressionsPackage_3 = (org.muml.core.expressions.ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(org.muml.core.expressions.ExpressionsPackage.eNS_URI);
		ActivitiesPackage theActivitiesPackage = (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		exceptionVariableExpressionEClass.getESuperTypes().add(theExpressionsPackage_3.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(exceptionVariableExpressionEClass, ExceptionVariableExpression.class, "ExceptionVariableExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionVariableExpression_ExceptionVariable(), theActivitiesPackage.getExceptionVariable(), null, "exceptionVariable", null, 1, 1, ExceptionVariableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //ExpressionsPackageImpl
