/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper;

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
 * @see org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.TsdmhelperFactory
 * @model kind="package"
 * @generated
 */
public interface TsdmhelperPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tsdmhelper";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/reconfigurationverification.reachanalysis.tsdm.transform/helper/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tsdmhelper";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TsdmhelperPackage eINSTANCE = org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.impl.TsdmhelperPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.impl.BoundClockInstancesImpl <em>Bound Clock Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.impl.BoundClockInstancesImpl
	 * @see org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.impl.TsdmhelperPackageImpl#getBoundClockInstances()
	 * @generated
	 */
	int BOUND_CLOCK_INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Clock Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_CLOCK_INSTANCES__CLOCK_INSTANCES = 0;

	/**
	 * The number of structural features of the '<em>Bound Clock Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_CLOCK_INSTANCES_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.BoundClockInstances <em>Bound Clock Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound Clock Instances</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.BoundClockInstances
	 * @generated
	 */
	EClass getBoundClockInstances();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.BoundClockInstances#getClockInstances <em>Clock Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clock Instances</em>'.
	 * @see org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.BoundClockInstances#getClockInstances()
	 * @see #getBoundClockInstances()
	 * @generated
	 */
	EReference getBoundClockInstances_ClockInstances();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TsdmhelperFactory getTsdmhelperFactory();

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
		 * The meta object literal for the '{@link org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.impl.BoundClockInstancesImpl <em>Bound Clock Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.impl.BoundClockInstancesImpl
		 * @see org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.impl.TsdmhelperPackageImpl#getBoundClockInstances()
		 * @generated
		 */
		EClass BOUND_CLOCK_INSTANCES = eINSTANCE.getBoundClockInstances();

		/**
		 * The meta object literal for the '<em><b>Clock Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND_CLOCK_INSTANCES__CLOCK_INSTANCES = eINSTANCE.getBoundClockInstances_ClockInstances();

	}

} //TsdmhelperPackage
