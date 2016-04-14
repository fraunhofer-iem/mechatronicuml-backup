/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.core.CorePackage;

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
 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterFactory
 * @model kind="package"
 * @generated
 */
public interface RealtimestatechartparameterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "realtimestatechartparameter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/psm/realtimestatechart/realtimestatechartparameter/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "realtimestatechartparameter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RealtimestatechartparameterPackage eINSTANCE = org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimestatechartparameterPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimeStatechartParameterImpl <em>Realtime Statechart Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimeStatechartParameterImpl
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimestatechartparameterPackageImpl#getRealtimeStatechartParameter()
	 * @generated
	 */
	int REALTIME_STATECHART_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_PARAMETER__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_PARAMETER__EXTENSIONS = CorePackage.NAMED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_PARAMETER__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_PARAMETER__COMMENT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_PARAMETER__STATECHART = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Realtime Statechart Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_PARAMETER_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_PARAMETER___GET_EXTENSION__ECLASS = CorePackage.NAMED_ELEMENT___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Realtime Statechart Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALTIME_STATECHART_PARAMETER_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.APICallParameterImpl <em>API Call Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.APICallParameterImpl
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimestatechartparameterPackageImpl#getAPICallParameter()
	 * @generated
	 */
	int API_CALL_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER__ANNOTATIONS = REALTIME_STATECHART_PARAMETER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER__EXTENSIONS = REALTIME_STATECHART_PARAMETER__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER__NAME = REALTIME_STATECHART_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER__COMMENT = REALTIME_STATECHART_PARAMETER__COMMENT;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER__STATECHART = REALTIME_STATECHART_PARAMETER__STATECHART;

	/**
	 * The feature id for the '<em><b>Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER__IMPLEMENTATIONS = REALTIME_STATECHART_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER__PARAMETERS = REALTIME_STATECHART_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER__RETURN_TYPE = REALTIME_STATECHART_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>API Call Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_FEATURE_COUNT = REALTIME_STATECHART_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER___GET_EXTENSION__ECLASS = REALTIME_STATECHART_PARAMETER___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>API Call Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_PARAMETER_OPERATION_COUNT = REALTIME_STATECHART_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.TimeParameterImpl <em>Time Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.TimeParameterImpl
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimestatechartparameterPackageImpl#getTimeParameter()
	 * @generated
	 */
	int TIME_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER__ANNOTATIONS = REALTIME_STATECHART_PARAMETER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER__EXTENSIONS = REALTIME_STATECHART_PARAMETER__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER__NAME = REALTIME_STATECHART_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER__COMMENT = REALTIME_STATECHART_PARAMETER__COMMENT;

	/**
	 * The feature id for the '<em><b>Statechart</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER__STATECHART = REALTIME_STATECHART_PARAMETER__STATECHART;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER__DATA_TYPE = REALTIME_STATECHART_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER__CONSTANT = REALTIME_STATECHART_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initialize Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER__INITIALIZE_EXPRESSION = REALTIME_STATECHART_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER_FEATURE_COUNT = REALTIME_STATECHART_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER___GET_EXTENSION__ECLASS = REALTIME_STATECHART_PARAMETER___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Time Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PARAMETER_OPERATION_COUNT = REALTIME_STATECHART_PARAMETER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.APICallParameter <em>API Call Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Call Parameter</em>'.
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.APICallParameter
	 * @generated
	 */
	EClass getAPICallParameter();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.TimeParameter <em>Time Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Parameter</em>'.
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.TimeParameter
	 * @generated
	 */
	EClass getTimeParameter();

	/**
	 * Returns the meta object for class '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter <em>Realtime Statechart Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realtime Statechart Parameter</em>'.
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter
	 * @generated
	 */
	EClass getRealtimeStatechartParameter();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statechart</em>'.
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter#getStatechart()
	 * @see #getRealtimeStatechartParameter()
	 * @generated
	 */
	EReference getRealtimeStatechartParameter_Statechart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RealtimestatechartparameterFactory getRealtimestatechartparameterFactory();

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
		 * The meta object literal for the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.APICallParameterImpl <em>API Call Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.APICallParameterImpl
		 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimestatechartparameterPackageImpl#getAPICallParameter()
		 * @generated
		 */
		EClass API_CALL_PARAMETER = eINSTANCE.getAPICallParameter();

		/**
		 * The meta object literal for the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.TimeParameterImpl <em>Time Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.TimeParameterImpl
		 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimestatechartparameterPackageImpl#getTimeParameter()
		 * @generated
		 */
		EClass TIME_PARAMETER = eINSTANCE.getTimeParameter();

		/**
		 * The meta object literal for the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimeStatechartParameterImpl <em>Realtime Statechart Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimeStatechartParameterImpl
		 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimestatechartparameterPackageImpl#getRealtimeStatechartParameter()
		 * @generated
		 */
		EClass REALTIME_STATECHART_PARAMETER = eINSTANCE.getRealtimeStatechartParameter();

		/**
		 * The meta object literal for the '<em><b>Statechart</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALTIME_STATECHART_PARAMETER__STATECHART = eINSTANCE.getRealtimeStatechartParameter_Statechart();

	}

} //RealtimestatechartparameterPackage
