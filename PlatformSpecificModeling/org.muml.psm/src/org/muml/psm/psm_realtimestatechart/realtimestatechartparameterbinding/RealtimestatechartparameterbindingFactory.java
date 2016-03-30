/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage
 * @generated
 */
public interface RealtimestatechartparameterbindingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RealtimestatechartparameterbindingFactory eINSTANCE = org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimestatechartparameterbindingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>API Call Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Call Parameter Binding</em>'.
	 * @generated
	 */
	APICallParameterBinding createAPICallParameterBinding();

	/**
	 * Returns a new object of class '<em>Time Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Parameter Binding</em>'.
	 * @generated
	 */
	TimeParameterBinding createTimeParameterBinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RealtimestatechartparameterbindingPackage getRealtimestatechartparameterbindingPackage();

} //RealtimestatechartparameterbindingFactory
