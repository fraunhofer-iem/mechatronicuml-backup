/**
 */
package org.muml.uppaal.adapter.results;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.muml.uppaal.adapter.results.ResultsFactory
 * @model kind="package"
 * @generated
 */
public interface ResultsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "results";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/uppaal/adapter/results/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "results";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultsPackage eINSTANCE = org.muml.uppaal.adapter.results.impl.ResultsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.uppaal.adapter.results.impl.PropertyResultRepositoryImpl <em>Property Result Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.adapter.results.impl.PropertyResultRepositoryImpl
	 * @see org.muml.uppaal.adapter.results.impl.ResultsPackageImpl#getPropertyResultRepository()
	 * @generated
	 */
	int PROPERTY_RESULT_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_RESULT_REPOSITORY__RESULTS = 0;

	/**
	 * The number of structural features of the '<em>Property Result Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_RESULT_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property Result Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_RESULT_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.adapter.results.impl.PropertyResultImpl <em>Property Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.adapter.results.impl.PropertyResultImpl
	 * @see org.muml.uppaal.adapter.results.impl.ResultsPackageImpl#getPropertyResult()
	 * @generated
	 */
	int PROPERTY_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_RESULT__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Fulfilled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_RESULT__FULFILLED = 1;

	/**
	 * The feature id for the '<em><b>Sub Property Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_RESULT__SUB_PROPERTY_RESULTS = 2;

	/**
	 * The number of structural features of the '<em>Property Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_RESULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Property Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_RESULT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.adapter.results.PropertyResultRepository <em>Property Result Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Result Repository</em>'.
	 * @see org.muml.uppaal.adapter.results.PropertyResultRepository
	 * @generated
	 */
	EClass getPropertyResultRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.uppaal.adapter.results.PropertyResultRepository#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.muml.uppaal.adapter.results.PropertyResultRepository#getResults()
	 * @see #getPropertyResultRepository()
	 * @generated
	 */
	EReference getPropertyResultRepository_Results();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.adapter.results.PropertyResult <em>Property Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Result</em>'.
	 * @see org.muml.uppaal.adapter.results.PropertyResult
	 * @generated
	 */
	EClass getPropertyResult();

	/**
	 * Returns the meta object for the reference '{@link org.muml.uppaal.adapter.results.PropertyResult#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.muml.uppaal.adapter.results.PropertyResult#getProperty()
	 * @see #getPropertyResult()
	 * @generated
	 */
	EReference getPropertyResult_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.uppaal.adapter.results.PropertyResult#isFulfilled <em>Fulfilled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fulfilled</em>'.
	 * @see org.muml.uppaal.adapter.results.PropertyResult#isFulfilled()
	 * @see #getPropertyResult()
	 * @generated
	 */
	EAttribute getPropertyResult_Fulfilled();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.uppaal.adapter.results.PropertyResult#getSubPropertyResults <em>Sub Property Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Property Results</em>'.
	 * @see org.muml.uppaal.adapter.results.PropertyResult#getSubPropertyResults()
	 * @see #getPropertyResult()
	 * @generated
	 */
	EReference getPropertyResult_SubPropertyResults();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResultsFactory getResultsFactory();

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
		 * The meta object literal for the '{@link org.muml.uppaal.adapter.results.impl.PropertyResultRepositoryImpl <em>Property Result Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.adapter.results.impl.PropertyResultRepositoryImpl
		 * @see org.muml.uppaal.adapter.results.impl.ResultsPackageImpl#getPropertyResultRepository()
		 * @generated
		 */
		EClass PROPERTY_RESULT_REPOSITORY = eINSTANCE.getPropertyResultRepository();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_RESULT_REPOSITORY__RESULTS = eINSTANCE.getPropertyResultRepository_Results();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.adapter.results.impl.PropertyResultImpl <em>Property Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.adapter.results.impl.PropertyResultImpl
		 * @see org.muml.uppaal.adapter.results.impl.ResultsPackageImpl#getPropertyResult()
		 * @generated
		 */
		EClass PROPERTY_RESULT = eINSTANCE.getPropertyResult();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_RESULT__PROPERTY = eINSTANCE.getPropertyResult_Property();

		/**
		 * The meta object literal for the '<em><b>Fulfilled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_RESULT__FULFILLED = eINSTANCE.getPropertyResult_Fulfilled();

		/**
		 * The meta object literal for the '<em><b>Sub Property Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_RESULT__SUB_PROPERTY_RESULTS = eINSTANCE.getPropertyResult_SubPropertyResults();

	}

} //ResultsPackage
