/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage
 * @generated
 */
public interface RealtimestatechartparameterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RealtimestatechartparameterFactory eINSTANCE = org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.RealtimestatechartparameterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>API Call Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Call Parameter</em>'.
	 * @generated
	 */
	APICallParameter createAPICallParameter();

	/**
	 * Returns a new object of class '<em>Time Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Parameter</em>'.
	 * @generated
	 */
	TimeParameter createTimeParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RealtimestatechartparameterPackage getRealtimestatechartparameterPackage();

} //RealtimestatechartparameterFactory
