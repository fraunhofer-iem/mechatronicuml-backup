/**
 */
package org.muml.reconfigurationverification.timedstorychart.transform.helper;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.HelperFactory
 * @model kind="package"
 * @generated
 */
public interface HelperPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "helper";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/reconfigurationverification/timedstorychart/transform/helper/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "helper";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HelperPackage eINSTANCE = org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.HelperPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TSCTransformationInputImpl <em>TSC Transformation Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TSCTransformationInputImpl
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.HelperPackageImpl#getTSCTransformationInput()
	 * @generated
	 */
	int TSC_TRANSFORMATION_INPUT = 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSC_TRANSFORMATION_INPUT__CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Sync Transition Tuples</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSC_TRANSFORMATION_INPUT__SYNC_TRANSITION_TUPLES = 1;

	/**
	 * The feature id for the '<em><b>No Sync Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSC_TRANSFORMATION_INPUT__NO_SYNC_TRANSITIONS = 2;

	/**
	 * The number of structural features of the '<em>TSC Transformation Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSC_TRANSFORMATION_INPUT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TSCTransformationOutputImpl <em>TSC Transformation Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TSCTransformationOutputImpl
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.HelperPackageImpl#getTSCTransformationOutput()
	 * @generated
	 */
	int TSC_TRANSFORMATION_OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Tgts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSC_TRANSFORMATION_OUTPUT__TGTS = 0;

	/**
	 * The number of structural features of the '<em>TSC Transformation Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSC_TRANSFORMATION_OUTPUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TransitionTupleImpl <em>Transition Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TransitionTupleImpl
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.HelperPackageImpl#getTransitionTuple()
	 * @generated
	 */
	int TRANSITION_TUPLE = 2;

	/**
	 * The feature id for the '<em><b>Sending</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TUPLE__SENDING = 0;

	/**
	 * The feature id for the '<em><b>Receiving</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TUPLE__RECEIVING = 1;

	/**
	 * The number of structural features of the '<em>Transition Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TUPLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.PreTransformationHelperImpl <em>Pre Transformation Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.PreTransformationHelperImpl
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.HelperPackageImpl#getPreTransformationHelper()
	 * @generated
	 */
	int PRE_TRANSFORMATION_HELPER = 3;

	/**
	 * The feature id for the '<em><b>Rtscs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TRANSFORMATION_HELPER__RTSCS = 0;

	/**
	 * The number of structural features of the '<em>Pre Transformation Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TRANSFORMATION_HELPER_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationInput <em>TSC Transformation Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSC Transformation Input</em>'.
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationInput
	 * @generated
	 */
	EClass getTSCTransformationInput();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationInput#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationInput#getConnector()
	 * @see #getTSCTransformationInput()
	 * @generated
	 */
	EReference getTSCTransformationInput_Connector();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationInput#getSyncTransitionTuples <em>Sync Transition Tuples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sync Transition Tuples</em>'.
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationInput#getSyncTransitionTuples()
	 * @see #getTSCTransformationInput()
	 * @generated
	 */
	EReference getTSCTransformationInput_SyncTransitionTuples();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationInput#getNoSyncTransitions <em>No Sync Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>No Sync Transitions</em>'.
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationInput#getNoSyncTransitions()
	 * @see #getTSCTransformationInput()
	 * @generated
	 */
	EReference getTSCTransformationInput_NoSyncTransitions();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationOutput <em>TSC Transformation Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSC Transformation Output</em>'.
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationOutput
	 * @generated
	 */
	EClass getTSCTransformationOutput();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationOutput#getTgts <em>Tgts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tgts</em>'.
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationOutput#getTgts()
	 * @see #getTSCTransformationOutput()
	 * @generated
	 */
	EReference getTSCTransformationOutput_Tgts();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.TransitionTuple <em>Transition Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Tuple</em>'.
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.TransitionTuple
	 * @generated
	 */
	EClass getTransitionTuple();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.TransitionTuple#getSending <em>Sending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sending</em>'.
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.TransitionTuple#getSending()
	 * @see #getTransitionTuple()
	 * @generated
	 */
	EReference getTransitionTuple_Sending();

	/**
	 * Returns the meta object for the reference '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.TransitionTuple#getReceiving <em>Receiving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiving</em>'.
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.TransitionTuple#getReceiving()
	 * @see #getTransitionTuple()
	 * @generated
	 */
	EReference getTransitionTuple_Receiving();

	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.PreTransformationHelper <em>Pre Transformation Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Transformation Helper</em>'.
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.PreTransformationHelper
	 * @generated
	 */
	EClass getPreTransformationHelper();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.PreTransformationHelper#getRtscs <em>Rtscs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rtscs</em>'.
	 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.PreTransformationHelper#getRtscs()
	 * @see #getPreTransformationHelper()
	 * @generated
	 */
	EReference getPreTransformationHelper_Rtscs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HelperFactory getHelperFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TSCTransformationInputImpl <em>TSC Transformation Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TSCTransformationInputImpl
		 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.HelperPackageImpl#getTSCTransformationInput()
		 * @generated
		 */
		EClass TSC_TRANSFORMATION_INPUT = eINSTANCE.getTSCTransformationInput();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSC_TRANSFORMATION_INPUT__CONNECTOR = eINSTANCE.getTSCTransformationInput_Connector();

		/**
		 * The meta object literal for the '<em><b>Sync Transition Tuples</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSC_TRANSFORMATION_INPUT__SYNC_TRANSITION_TUPLES = eINSTANCE.getTSCTransformationInput_SyncTransitionTuples();

		/**
		 * The meta object literal for the '<em><b>No Sync Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSC_TRANSFORMATION_INPUT__NO_SYNC_TRANSITIONS = eINSTANCE.getTSCTransformationInput_NoSyncTransitions();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TSCTransformationOutputImpl <em>TSC Transformation Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TSCTransformationOutputImpl
		 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.HelperPackageImpl#getTSCTransformationOutput()
		 * @generated
		 */
		EClass TSC_TRANSFORMATION_OUTPUT = eINSTANCE.getTSCTransformationOutput();

		/**
		 * The meta object literal for the '<em><b>Tgts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSC_TRANSFORMATION_OUTPUT__TGTS = eINSTANCE.getTSCTransformationOutput_Tgts();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TransitionTupleImpl <em>Transition Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TransitionTupleImpl
		 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.HelperPackageImpl#getTransitionTuple()
		 * @generated
		 */
		EClass TRANSITION_TUPLE = eINSTANCE.getTransitionTuple();

		/**
		 * The meta object literal for the '<em><b>Sending</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TUPLE__SENDING = eINSTANCE.getTransitionTuple_Sending();

		/**
		 * The meta object literal for the '<em><b>Receiving</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TUPLE__RECEIVING = eINSTANCE.getTransitionTuple_Receiving();

		/**
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.PreTransformationHelperImpl <em>Pre Transformation Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.PreTransformationHelperImpl
		 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.HelperPackageImpl#getPreTransformationHelper()
		 * @generated
		 */
		EClass PRE_TRANSFORMATION_HELPER = eINSTANCE.getPreTransformationHelper();

		/**
		 * The meta object literal for the '<em><b>Rtscs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_TRANSFORMATION_HELPER__RTSCS = eINSTANCE.getPreTransformationHelper_Rtscs();

	}

} //HelperPackage
