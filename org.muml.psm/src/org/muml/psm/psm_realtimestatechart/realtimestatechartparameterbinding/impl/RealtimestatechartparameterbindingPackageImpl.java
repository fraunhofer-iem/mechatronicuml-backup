/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.expressions.ExpressionsPackage;
import org.muml.pim.actionlanguage.ActionlanguagePackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage;
import org.muml.pm.software.SoftwarePackage;
import org.muml.psm.PsmPackage;
import org.muml.psm.allocation.AllocationPackage;
import org.muml.psm.allocation.impl.AllocationPackageImpl;
import org.muml.psm.apiexpressions.ApiexpressionsPackage;
import org.muml.psm.apiexpressions.impl.ApiexpressionsPackageImpl;
import org.muml.psm.codegen.CodegenPackage;
import org.muml.psm.codegen.impl.CodegenPackageImpl;
import org.muml.psm.impl.PsmPackageImpl;
import org.muml.psm.portapimapping.PortapimappingPackage;
import org.muml.psm.portapimapping.impl.PortapimappingPackageImpl;
import org.muml.psm.properties.PropertiesPackage;
import org.muml.psm.properties.impl.PropertiesPackageImpl;
import org.muml.psm.psm_instance.Psm_instancePackage;
import org.muml.psm.psm_instance.impl.Psm_instancePackageImpl;
import org.muml.psm.psm_realtimestatechart.Psm_realtimestatechartPackage;
import org.muml.psm.psm_realtimestatechart.impl.Psm_realtimestatechartPackageImpl;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimestatechartparameterPackageImpl;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.APICallParameterBinding;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingFactory;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.TimeParameterBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimestatechartparameterbindingPackageImpl extends EPackageImpl implements RealtimestatechartparameterbindingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiCallParameterBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeParameterBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realtimeStatechartParameterBindingEClass = null;

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
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RealtimestatechartparameterbindingPackageImpl() {
		super(eNS_URI, RealtimestatechartparameterbindingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RealtimestatechartparameterbindingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RealtimestatechartparameterbindingPackage init() {
		if (isInited) return (RealtimestatechartparameterbindingPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterbindingPackage.eNS_URI);

		// Obtain or create and register package
		RealtimestatechartparameterbindingPackageImpl theRealtimestatechartparameterbindingPackage = (RealtimestatechartparameterbindingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RealtimestatechartparameterbindingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RealtimestatechartparameterbindingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActionlanguagePackage.eINSTANCE.eClass();
		HwplatformPackage.eINSTANCE.eClass();
		HwvaluetypePackage.eINSTANCE.eClass();
		HwplatforminstancePackage.eINSTANCE.eClass();
		HwresourcePackage.eINSTANCE.eClass();
		HwresourceinstancePackage.eINSTANCE.eClass();
		SoftwarePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PsmPackageImpl thePsmPackage = (PsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI) instanceof PsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI) : PsmPackage.eINSTANCE);
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) instanceof AllocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) : AllocationPackage.eINSTANCE);
		PropertiesPackageImpl thePropertiesPackage = (PropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI) instanceof PropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI) : PropertiesPackage.eINSTANCE);
		Psm_realtimestatechartPackageImpl thePsm_realtimestatechartPackage = (Psm_realtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Psm_realtimestatechartPackage.eNS_URI) instanceof Psm_realtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Psm_realtimestatechartPackage.eNS_URI) : Psm_realtimestatechartPackage.eINSTANCE);
		RealtimestatechartparameterPackageImpl theRealtimestatechartparameterPackage = (RealtimestatechartparameterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterPackage.eNS_URI) instanceof RealtimestatechartparameterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterPackage.eNS_URI) : RealtimestatechartparameterPackage.eINSTANCE);
		Psm_instancePackageImpl thePsm_instancePackage = (Psm_instancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Psm_instancePackage.eNS_URI) instanceof Psm_instancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Psm_instancePackage.eNS_URI) : Psm_instancePackage.eINSTANCE);
		PortapimappingPackageImpl thePortapimappingPackage = (PortapimappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI) instanceof PortapimappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI) : PortapimappingPackage.eINSTANCE);
		ApiexpressionsPackageImpl theApiexpressionsPackage = (ApiexpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApiexpressionsPackage.eNS_URI) instanceof ApiexpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApiexpressionsPackage.eNS_URI) : ApiexpressionsPackage.eINSTANCE);
		CodegenPackageImpl theCodegenPackage = (CodegenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodegenPackage.eNS_URI) instanceof CodegenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodegenPackage.eNS_URI) : CodegenPackage.eINSTANCE);

		// Create package meta-data objects
		theRealtimestatechartparameterbindingPackage.createPackageContents();
		thePsmPackage.createPackageContents();
		theAllocationPackage.createPackageContents();
		thePropertiesPackage.createPackageContents();
		thePsm_realtimestatechartPackage.createPackageContents();
		theRealtimestatechartparameterPackage.createPackageContents();
		thePsm_instancePackage.createPackageContents();
		thePortapimappingPackage.createPackageContents();
		theApiexpressionsPackage.createPackageContents();
		theCodegenPackage.createPackageContents();

		// Initialize created meta-data
		theRealtimestatechartparameterbindingPackage.initializePackageContents();
		thePsmPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();
		thePropertiesPackage.initializePackageContents();
		thePsm_realtimestatechartPackage.initializePackageContents();
		theRealtimestatechartparameterPackage.initializePackageContents();
		thePsm_instancePackage.initializePackageContents();
		thePortapimappingPackage.initializePackageContents();
		theApiexpressionsPackage.initializePackageContents();
		theCodegenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRealtimestatechartparameterbindingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RealtimestatechartparameterbindingPackage.eNS_URI, theRealtimestatechartparameterbindingPackage);
		return theRealtimestatechartparameterbindingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPICallParameterBinding() {
		return apiCallParameterBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPICallParameterBinding_Expression() {
		return (EReference)apiCallParameterBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeParameterBinding() {
		return timeParameterBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeParameterBinding_TimeValue() {
		return (EReference)timeParameterBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealtimeStatechartParameterBinding() {
		return realtimeStatechartParameterBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartParameterBinding_PortInstance() {
		return (EReference)realtimeStatechartParameterBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartParameterBinding_Parameter() {
		return (EReference)realtimeStatechartParameterBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartparameterbindingFactory getRealtimestatechartparameterbindingFactory() {
		return (RealtimestatechartparameterbindingFactory)getEFactoryInstance();
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
		apiCallParameterBindingEClass = createEClass(API_CALL_PARAMETER_BINDING);
		createEReference(apiCallParameterBindingEClass, API_CALL_PARAMETER_BINDING__EXPRESSION);

		timeParameterBindingEClass = createEClass(TIME_PARAMETER_BINDING);
		createEReference(timeParameterBindingEClass, TIME_PARAMETER_BINDING__TIME_VALUE);

		realtimeStatechartParameterBindingEClass = createEClass(REALTIME_STATECHART_PARAMETER_BINDING);
		createEReference(realtimeStatechartParameterBindingEClass, REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE);
		createEReference(realtimeStatechartParameterBindingEClass, REALTIME_STATECHART_PARAMETER_BINDING__PARAMETER);
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
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		Psm_instancePackage thePsm_instancePackage = (Psm_instancePackage)EPackage.Registry.INSTANCE.getEPackage(Psm_instancePackage.eNS_URI);
		RealtimestatechartparameterPackage theRealtimestatechartparameterPackage = (RealtimestatechartparameterPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apiCallParameterBindingEClass.getESuperTypes().add(this.getRealtimeStatechartParameterBinding());
		apiCallParameterBindingEClass.getESuperTypes().add(theBehaviorPackage.getOperation());
		timeParameterBindingEClass.getESuperTypes().add(this.getRealtimeStatechartParameterBinding());

		// Initialize classes, features, and operations; add parameters
		initEClass(apiCallParameterBindingEClass, APICallParameterBinding.class, "APICallParameterBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPICallParameterBinding_Expression(), theExpressionsPackage.getExpression(), null, "expression", null, 1, 1, APICallParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeParameterBindingEClass, TimeParameterBinding.class, "TimeParameterBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeParameterBinding_TimeValue(), theValuetypePackage.getTimeValue(), null, "timeValue", null, 1, 1, TimeParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realtimeStatechartParameterBindingEClass, RealtimeStatechartParameterBinding.class, "RealtimeStatechartParameterBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealtimeStatechartParameterBinding_PortInstance(), thePsm_instancePackage.getParameterisableDiscreteSinglePortInstance(), thePsm_instancePackage.getParameterisableDiscreteSinglePortInstance_Bindings(), "portInstance", null, 1, 1, RealtimeStatechartParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealtimeStatechartParameterBinding_Parameter(), theRealtimestatechartparameterPackage.getRealtimeStatechartParameter(), null, "parameter", null, 1, 1, RealtimeStatechartParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //RealtimestatechartparameterbindingPackageImpl
