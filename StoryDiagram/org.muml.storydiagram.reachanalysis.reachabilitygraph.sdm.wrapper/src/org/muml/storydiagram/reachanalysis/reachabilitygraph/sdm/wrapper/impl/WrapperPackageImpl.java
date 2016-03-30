/**
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.BoolWrapper;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.DoubleWrapper;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.IntWrapper;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.LongWrapper;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.StringWrapper;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.WrapperFactory;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.WrapperPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WrapperPackageImpl extends EPackageImpl implements WrapperPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleWrapperEClass = null;

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
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.WrapperPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WrapperPackageImpl() {
		super(eNS_URI, WrapperFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WrapperPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WrapperPackage init() {
		if (isInited) return (WrapperPackage)EPackage.Registry.INSTANCE.getEPackage(WrapperPackage.eNS_URI);

		// Obtain or create and register package
		WrapperPackageImpl theWrapperPackage = (WrapperPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WrapperPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WrapperPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWrapperPackage.createPackageContents();

		// Initialize created meta-data
		theWrapperPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWrapperPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WrapperPackage.eNS_URI, theWrapperPackage);
		return theWrapperPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolWrapper() {
		return boolWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolWrapper_BoolValue() {
		return (EAttribute)boolWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntWrapper() {
		return intWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntWrapper_IntValue() {
		return (EAttribute)intWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongWrapper() {
		return longWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongWrapper_LongValue() {
		return (EAttribute)longWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringWrapper() {
		return stringWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringWrapper_StringValue() {
		return (EAttribute)stringWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleWrapper() {
		return doubleWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleWrapper_DoubleValue() {
		return (EAttribute)doubleWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapperFactory getWrapperFactory() {
		return (WrapperFactory)getEFactoryInstance();
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
		boolWrapperEClass = createEClass(BOOL_WRAPPER);
		createEAttribute(boolWrapperEClass, BOOL_WRAPPER__BOOL_VALUE);

		intWrapperEClass = createEClass(INT_WRAPPER);
		createEAttribute(intWrapperEClass, INT_WRAPPER__INT_VALUE);

		longWrapperEClass = createEClass(LONG_WRAPPER);
		createEAttribute(longWrapperEClass, LONG_WRAPPER__LONG_VALUE);

		stringWrapperEClass = createEClass(STRING_WRAPPER);
		createEAttribute(stringWrapperEClass, STRING_WRAPPER__STRING_VALUE);

		doubleWrapperEClass = createEClass(DOUBLE_WRAPPER);
		createEAttribute(doubleWrapperEClass, DOUBLE_WRAPPER__DOUBLE_VALUE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(boolWrapperEClass, BoolWrapper.class, "BoolWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolWrapper_BoolValue(), ecorePackage.getEBoolean(), "boolValue", null, 0, 1, BoolWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intWrapperEClass, IntWrapper.class, "IntWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntWrapper_IntValue(), ecorePackage.getEInt(), "intValue", null, 0, 1, IntWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longWrapperEClass, LongWrapper.class, "LongWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongWrapper_LongValue(), ecorePackage.getELong(), "longValue", null, 0, 1, LongWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringWrapperEClass, StringWrapper.class, "StringWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringWrapper_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, StringWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleWrapperEClass, DoubleWrapper.class, "DoubleWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleWrapper_DoubleValue(), ecorePackage.getEDouble(), "doubleValue", null, 0, 1, DoubleWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WrapperPackageImpl
