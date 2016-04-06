/**
 */
package org.muml.storydiagram.patterns.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.muml.core.CorePackage;

import org.muml.storydiagram.StorydiagramPackage;

import org.muml.storydiagram.activities.ActivitiesPackage;

import org.muml.storydiagram.activities.impl.ActivitiesPackageImpl;

import org.muml.storydiagram.calls.CallsPackage;

import org.muml.storydiagram.calls.impl.CallsPackageImpl;

import org.muml.storydiagram.impl.StorydiagramPackageImpl;

import org.muml.storydiagram.patterns.PatternsPackage;

import org.muml.storydiagram.patterns.expressions.AttributeValueExpression;
import org.muml.storydiagram.patterns.expressions.CollectionSizeExpression;
import org.muml.storydiagram.patterns.expressions.ExpressionsFactory;
import org.muml.storydiagram.patterns.expressions.ExpressionsPackage;
import org.muml.storydiagram.patterns.expressions.ObjectVariableExpression;
import org.muml.storydiagram.patterns.expressions.PrimitiveVariableExpression;

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
	private EClass attributeValueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectVariableExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionSizeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveVariableExpressionEClass = null;

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
	 * @see org.muml.storydiagram.patterns.expressions.ExpressionsPackage#eNS_URI
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
		org.muml.storydiagram.activities.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_1 = (org.muml.storydiagram.activities.expressions.impl.ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.muml.storydiagram.activities.expressions.ExpressionsPackage.eNS_URI) instanceof org.muml.storydiagram.activities.expressions.impl.ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.muml.storydiagram.activities.expressions.ExpressionsPackage.eNS_URI) : org.muml.storydiagram.activities.expressions.ExpressionsPackage.eINSTANCE);
		CallsPackageImpl theCallsPackage = (CallsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI) instanceof CallsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI) : CallsPackage.eINSTANCE);
		org.muml.storydiagram.calls.expressions.impl.ExpressionsPackageImpl theExpressionsPackage_2 = (org.muml.storydiagram.calls.expressions.impl.ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.muml.storydiagram.calls.expressions.ExpressionsPackage.eNS_URI) instanceof org.muml.storydiagram.calls.expressions.impl.ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.muml.storydiagram.calls.expressions.ExpressionsPackage.eNS_URI) : org.muml.storydiagram.calls.expressions.ExpressionsPackage.eINSTANCE);
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
		TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);

		// Create package meta-data objects
		theExpressionsPackage.createPackageContents();
		theStorydiagramPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theExpressionsPackage_1.createPackageContents();
		theCallsPackage.createPackageContents();
		theExpressionsPackage_2.createPackageContents();
		thePatternsPackage.createPackageContents();
		theTemplatesPackage.createPackageContents();

		// Initialize created meta-data
		theExpressionsPackage.initializePackageContents();
		theStorydiagramPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theExpressionsPackage_1.initializePackageContents();
		theCallsPackage.initializePackageContents();
		theExpressionsPackage_2.initializePackageContents();
		thePatternsPackage.initializePackageContents();
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
	public EClass getAttributeValueExpression() {
		return attributeValueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueExpression_Object() {
		return (EReference)attributeValueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueExpression_Attribute() {
		return (EReference)attributeValueExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectVariableExpression() {
		return objectVariableExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectVariableExpression_Object() {
		return (EReference)objectVariableExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionSizeExpression() {
		return collectionSizeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionSizeExpression_Set() {
		return (EReference)collectionSizeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveVariableExpression() {
		return primitiveVariableExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveVariableExpression_PrimitiveVariable() {
		return (EReference)primitiveVariableExpressionEClass.getEStructuralFeatures().get(0);
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
		attributeValueExpressionEClass = createEClass(ATTRIBUTE_VALUE_EXPRESSION);
		createEReference(attributeValueExpressionEClass, ATTRIBUTE_VALUE_EXPRESSION__OBJECT);
		createEReference(attributeValueExpressionEClass, ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE);

		objectVariableExpressionEClass = createEClass(OBJECT_VARIABLE_EXPRESSION);
		createEReference(objectVariableExpressionEClass, OBJECT_VARIABLE_EXPRESSION__OBJECT);

		collectionSizeExpressionEClass = createEClass(COLLECTION_SIZE_EXPRESSION);
		createEReference(collectionSizeExpressionEClass, COLLECTION_SIZE_EXPRESSION__SET);

		primitiveVariableExpressionEClass = createEClass(PRIMITIVE_VARIABLE_EXPRESSION);
		createEReference(primitiveVariableExpressionEClass, PRIMITIVE_VARIABLE_EXPRESSION__PRIMITIVE_VARIABLE);
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
		PatternsPackage thePatternsPackage = (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attributeValueExpressionEClass.getESuperTypes().add(theExpressionsPackage_3.getExpression());
		objectVariableExpressionEClass.getESuperTypes().add(theExpressionsPackage_3.getExpression());
		collectionSizeExpressionEClass.getESuperTypes().add(theExpressionsPackage_3.getExpression());
		primitiveVariableExpressionEClass.getESuperTypes().add(theExpressionsPackage_3.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(attributeValueExpressionEClass, AttributeValueExpression.class, "AttributeValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueExpression_Object(), thePatternsPackage.getObjectVariable(), null, "object", null, 1, 1, AttributeValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueExpression_Attribute(), theEcorePackage.getEAttribute(), null, "attribute", null, 1, 1, AttributeValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectVariableExpressionEClass, ObjectVariableExpression.class, "ObjectVariableExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectVariableExpression_Object(), thePatternsPackage.getObjectVariable(), null, "object", null, 1, 1, ObjectVariableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(collectionSizeExpressionEClass, CollectionSizeExpression.class, "CollectionSizeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionSizeExpression_Set(), thePatternsPackage.getCollectionVariable(), null, "set", null, 1, 1, CollectionSizeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(primitiveVariableExpressionEClass, PrimitiveVariableExpression.class, "PrimitiveVariableExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveVariableExpression_PrimitiveVariable(), thePatternsPackage.getPrimitiveVariable(), null, "primitiveVariable", null, 1, 1, PrimitiveVariableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //ExpressionsPackageImpl
