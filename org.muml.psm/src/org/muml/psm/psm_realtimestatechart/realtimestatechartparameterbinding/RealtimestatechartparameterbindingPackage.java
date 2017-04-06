/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingFactory
 * @model kind="package"
 * @generated
 */
public interface RealtimestatechartparameterbindingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "realtimestatechartparameterbinding";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/psm/realtimestatechart/realtimestatechartparameterbinding/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "realtimestatechartparameterbinding";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RealtimestatechartparameterbindingPackage eINSTANCE = org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimestatechartparameterbindingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimeStatechartParameterBindingImpl <em>Realtime Statechart Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimeStatechartParameterBindingImpl
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimestatechartparameterbindingPackageImpl#getRealtimeStatechartParameterBinding()
	 * @generated
	 */
	int REALTIME_STATECHART_PARAMETER_BINDING = 2;

	/**
	 * The feature id for the '<em><b>Port Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_PARAMETER_BINDING__PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Realtime Statechart Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_PARAMETER_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Realtime Statechart Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.APICallParameterBindingImpl <em>API Call Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.APICallParameterBindingImpl
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimestatechartparameterbindingPackageImpl#getAPICallParameterBinding()
	 * @generated
	 */
	int API_CALL_PARAMETER_BINDING = 0;

	/**
	 * The feature id for the '<em><b>Port Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING__PORT_INSTANCE = REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING__PARAMETER = REALTIME_STATECHART_PARAMETER_BINDING__PARAMETER;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING__EXTENSIONS = REALTIME_STATECHART_PARAMETER_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING__NAME = REALTIME_STATECHART_PARAMETER_BINDING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING__COMMENT = REALTIME_STATECHART_PARAMETER_BINDING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING__IMPLEMENTATIONS = REALTIME_STATECHART_PARAMETER_BINDING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING__PARAMETERS = REALTIME_STATECHART_PARAMETER_BINDING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING__RETURN_TYPE = REALTIME_STATECHART_PARAMETER_BINDING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING__EXPRESSION = REALTIME_STATECHART_PARAMETER_BINDING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>API Call Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING_FEATURE_COUNT = REALTIME_STATECHART_PARAMETER_BINDING_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___ECLASS = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___EIS_PROXY = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___ERESOURCE = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___ECONTAINER = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___ECONTAINING_FEATURE = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___ECONTAINMENT_FEATURE = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___ECONTENTS = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___EALL_CONTENTS = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___ECROSS_REFERENCES = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___EGET__ESTRUCTURALFEATURE = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___EGET__ESTRUCTURALFEATURE_BOOLEAN = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___ESET__ESTRUCTURALFEATURE_OBJECT = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___EIS_SET__ESTRUCTURALFEATURE = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___EUNSET__ESTRUCTURALFEATURE = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___EINVOKE__EOPERATION_ELIST = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING___GET_EXTENSION__ECLASS = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 15;

	/**
	 * The number of operations of the '<em>API Call Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_BINDING_OPERATION_COUNT = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.TimeParameterBindingImpl <em>Time Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.TimeParameterBindingImpl
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimestatechartparameterbindingPackageImpl#getTimeParameterBinding()
	 * @generated
	 */
	int TIME_PARAMETER_BINDING = 1;

	/**
	 * The feature id for the '<em><b>Port Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER_BINDING__PORT_INSTANCE = REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER_BINDING__PARAMETER = REALTIME_STATECHART_PARAMETER_BINDING__PARAMETER;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER_BINDING__TIME_VALUE = REALTIME_STATECHART_PARAMETER_BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER_BINDING_FEATURE_COUNT = REALTIME_STATECHART_PARAMETER_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER_BINDING_OPERATION_COUNT = REALTIME_STATECHART_PARAMETER_BINDING_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.APICallParameterBinding <em>API Call Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Call Parameter Binding</em>'.
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.APICallParameterBinding
	 * @generated
	 */
	EClass getAPICallParameterBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.APICallParameterBinding#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.APICallParameterBinding#getExpression()
	 * @see #getAPICallParameterBinding()
	 * @generated
	 */
	EReference getAPICallParameterBinding_Expression();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.TimeParameterBinding <em>Time Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Parameter Binding</em>'.
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.TimeParameterBinding
	 * @generated
	 */
	EClass getTimeParameterBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.TimeParameterBinding#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Value</em>'.
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.TimeParameterBinding#getTimeValue()
	 * @see #getTimeParameterBinding()
	 * @generated
	 */
	EReference getTimeParameterBinding_TimeValue();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding <em>Realtime Statechart Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realtime Statechart Parameter Binding</em>'.
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding
	 * @generated
	 */
	EClass getRealtimeStatechartParameterBinding();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding#getPortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Port Instance</em>'.
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding#getPortInstance()
	 * @see #getRealtimeStatechartParameterBinding()
	 * @generated
	 */
	EReference getRealtimeStatechartParameterBinding_PortInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding#getParameter()
	 * @see #getRealtimeStatechartParameterBinding()
	 * @generated
	 */
	EReference getRealtimeStatechartParameterBinding_Parameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RealtimestatechartparameterbindingFactory getRealtimestatechartparameterbindingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.APICallParameterBindingImpl <em>API Call Parameter Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.APICallParameterBindingImpl
		 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimestatechartparameterbindingPackageImpl#getAPICallParameterBinding()
		 * @generated
		 */
		EClass API_CALL_PARAMETER_BINDING = eINSTANCE.getAPICallParameterBinding();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_CALL_PARAMETER_BINDING__EXPRESSION = eINSTANCE.getAPICallParameterBinding_Expression();

		/**
		 * The meta object literal for the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.TimeParameterBindingImpl <em>Time Parameter Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.TimeParameterBindingImpl
		 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimestatechartparameterbindingPackageImpl#getTimeParameterBinding()
		 * @generated
		 */
		EClass TIME_PARAMETER_BINDING = eINSTANCE.getTimeParameterBinding();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PARAMETER_BINDING__TIME_VALUE = eINSTANCE.getTimeParameterBinding_TimeValue();

		/**
		 * The meta object literal for the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimeStatechartParameterBindingImpl <em>Realtime Statechart Parameter Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimeStatechartParameterBindingImpl
		 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimestatechartparameterbindingPackageImpl#getRealtimeStatechartParameterBinding()
		 * @generated
		 */
		EClass REALTIME_STATECHART_PARAMETER_BINDING = eINSTANCE.getRealtimeStatechartParameterBinding();

		/**
		 * The meta object literal for the '<em><b>Port Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE = eINSTANCE.getRealtimeStatechartParameterBinding_PortInstance();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_PARAMETER_BINDING__PARAMETER = eINSTANCE.getRealtimeStatechartParameterBinding_Parameter();

	}

} //RealtimestatechartparameterbindingPackage
