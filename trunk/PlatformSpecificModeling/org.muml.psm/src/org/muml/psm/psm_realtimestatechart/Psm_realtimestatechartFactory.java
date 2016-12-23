/**
 */
package org.muml.psm.psm_realtimestatechart;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.psm_realtimestatechart.Psm_realtimestatechartPackage
 * @generated
 */
public interface Psm_realtimestatechartFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Psm_realtimestatechartFactory eINSTANCE = org.muml.psm.psm_realtimestatechart.impl.Psm_realtimestatechartFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Parameterized Realtime Statechart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameterized Realtime Statechart</em>'.
	 * @generated
	 */
	ParameterizedRealtimeStatechart createParameterizedRealtimeStatechart();

	/**
	 * Returns a new object of class '<em>API Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Call</em>'.
	 * @generated
	 */
	APICall createAPICall();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Psm_realtimestatechartPackage getPsm_realtimestatechartPackage();

} //Psm_realtimestatechartFactory
