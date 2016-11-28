/**
 */
package org.muml.psm.apiexpressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.expressions.ExpressionsPackage;
import org.muml.pim.actionlanguage.ActionlanguagePackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.instance.InstancePackage;
import org.muml.pm.hardware.HardwarePackage;
import org.muml.pm.software.SoftwarePackage;
import org.muml.psm.PsmPackage;
import org.muml.psm.allocation.AllocationPackage;
import org.muml.psm.allocation.impl.AllocationPackageImpl;
import org.muml.psm.apiexpressions.APICallExpression;
import org.muml.psm.apiexpressions.ApiexpressionsFactory;
import org.muml.psm.apiexpressions.ApiexpressionsPackage;
import org.muml.psm.apiexpressions.ContinuousPortExpression;
import org.muml.psm.apiexpressions.EnumerationValueExpression;
import org.muml.psm.apiexpressions.util.ApiexpressionsValidator;
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
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimestatechartparameterbindingPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApiexpressionsPackageImpl extends EPackageImpl implements ApiexpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiCallExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationValueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousPortExpressionEClass = null;

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
	 * @see org.muml.psm.apiexpressions.ApiexpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApiexpressionsPackageImpl() {
		super(eNS_URI, ApiexpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApiexpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApiexpressionsPackage init() {
		if (isInited) return (ApiexpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ApiexpressionsPackage.eNS_URI);

		// Obtain or create and register package
		ApiexpressionsPackageImpl theApiexpressionsPackage = (ApiexpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApiexpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApiexpressionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActionlanguagePackage.eINSTANCE.eClass();
		HardwarePackage.eINSTANCE.eClass();
		SoftwarePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PsmPackageImpl thePsmPackage = (PsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI) instanceof PsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI) : PsmPackage.eINSTANCE);
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) instanceof AllocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) : AllocationPackage.eINSTANCE);
		PropertiesPackageImpl thePropertiesPackage = (PropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI) instanceof PropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI) : PropertiesPackage.eINSTANCE);
		Psm_realtimestatechartPackageImpl thePsm_realtimestatechartPackage = (Psm_realtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Psm_realtimestatechartPackage.eNS_URI) instanceof Psm_realtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Psm_realtimestatechartPackage.eNS_URI) : Psm_realtimestatechartPackage.eINSTANCE);
		RealtimestatechartparameterPackageImpl theRealtimestatechartparameterPackage = (RealtimestatechartparameterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterPackage.eNS_URI) instanceof RealtimestatechartparameterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterPackage.eNS_URI) : RealtimestatechartparameterPackage.eINSTANCE);
		RealtimestatechartparameterbindingPackageImpl theRealtimestatechartparameterbindingPackage = (RealtimestatechartparameterbindingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterbindingPackage.eNS_URI) instanceof RealtimestatechartparameterbindingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterbindingPackage.eNS_URI) : RealtimestatechartparameterbindingPackage.eINSTANCE);
		Psm_instancePackageImpl thePsm_instancePackage = (Psm_instancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Psm_instancePackage.eNS_URI) instanceof Psm_instancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Psm_instancePackage.eNS_URI) : Psm_instancePackage.eINSTANCE);
		PortapimappingPackageImpl thePortapimappingPackage = (PortapimappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI) instanceof PortapimappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI) : PortapimappingPackage.eINSTANCE);

		// Create package meta-data objects
		theApiexpressionsPackage.createPackageContents();
		thePsmPackage.createPackageContents();
		theAllocationPackage.createPackageContents();
		thePropertiesPackage.createPackageContents();
		thePsm_realtimestatechartPackage.createPackageContents();
		theRealtimestatechartparameterPackage.createPackageContents();
		theRealtimestatechartparameterbindingPackage.createPackageContents();
		thePsm_instancePackage.createPackageContents();
		thePortapimappingPackage.createPackageContents();

		// Initialize created meta-data
		theApiexpressionsPackage.initializePackageContents();
		thePsmPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();
		thePropertiesPackage.initializePackageContents();
		thePsm_realtimestatechartPackage.initializePackageContents();
		theRealtimestatechartparameterPackage.initializePackageContents();
		theRealtimestatechartparameterbindingPackage.initializePackageContents();
		thePsm_instancePackage.initializePackageContents();
		thePortapimappingPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theApiexpressionsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ApiexpressionsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theApiexpressionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApiexpressionsPackage.eNS_URI, theApiexpressionsPackage);
		return theApiexpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPICallExpression() {
		return apiCallExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPICallExpression_ApiCommand() {
		return (EReference)apiCallExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPICallExpression_ParameterBindings() {
		return (EReference)apiCallExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationValueExpression() {
		return enumerationValueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationValueExpression_EnumValue() {
		return (EReference)enumerationValueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuousPortExpression() {
		return continuousPortExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContinuousPortExpression_ContinuousPort() {
		return (EReference)continuousPortExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiexpressionsFactory getApiexpressionsFactory() {
		return (ApiexpressionsFactory)getEFactoryInstance();
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
		apiCallExpressionEClass = createEClass(API_CALL_EXPRESSION);
		createEReference(apiCallExpressionEClass, API_CALL_EXPRESSION__API_COMMAND);
		createEReference(apiCallExpressionEClass, API_CALL_EXPRESSION__PARAMETER_BINDINGS);

		enumerationValueExpressionEClass = createEClass(ENUMERATION_VALUE_EXPRESSION);
		createEReference(enumerationValueExpressionEClass, ENUMERATION_VALUE_EXPRESSION__ENUM_VALUE);

		continuousPortExpressionEClass = createEClass(CONTINUOUS_PORT_EXPRESSION);
		createEReference(continuousPortExpressionEClass, CONTINUOUS_PORT_EXPRESSION__CONTINUOUS_PORT);
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
		SoftwarePackage theSoftwarePackage = (SoftwarePackage)EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apiCallExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		enumerationValueExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		continuousPortExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(apiCallExpressionEClass, APICallExpression.class, "APICallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPICallExpression_ApiCommand(), theSoftwarePackage.getAPICommand(), null, "apiCommand", null, 1, 1, APICallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPICallExpression_ParameterBindings(), theBehaviorPackage.getParameterBinding(), null, "parameterBindings", null, 0, -1, APICallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationValueExpressionEClass, EnumerationValueExpression.class, "EnumerationValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationValueExpression_EnumValue(), theSoftwarePackage.getEnumerationValue(), null, "enumValue", null, 1, 1, EnumerationValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continuousPortExpressionEClass, ContinuousPortExpression.class, "ContinuousPortExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContinuousPortExpression_ContinuousPort(), theInstancePackage.getContinuousPortInstance(), null, "continuousPort", null, 1, 1, ContinuousPortExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (continuousPortExpressionEClass, 
		   source, 
		   new String[] {
			 "constraints", "OnlyInPortsAllowed"
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
		  (continuousPortExpressionEClass, 
		   source, 
		   new String[] {
			 "OnlyInPortsAllowed", "-- Only Inport are allowed\nlet result :  Boolean = (self.continuousPort.portType.oclAsType(component::DirectedTypedPort).kind = component::PortDirectionKind::IN) in\nif ( result.oclIsUndefined()) \nthen \ntrue\nelse\nfalse\n endif"
		   });
	}

} //ApiexpressionsPackageImpl
