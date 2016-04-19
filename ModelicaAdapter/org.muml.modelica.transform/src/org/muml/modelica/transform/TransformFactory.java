/**
 */
package org.muml.modelica.transform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.modelica.transform.TransformPackage
 * @generated
 */
public interface TransformFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransformFactory eINSTANCE = org.muml.modelica.transform.impl.TransformFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map</em>'.
	 * @generated
	 */
	Map createMap();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	Entry createEntry();

	/**
	 * Returns a new object of class '<em>Region Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region Instance</em>'.
	 * @generated
	 */
	RegionInstance createRegionInstance();

	/**
	 * Returns a new object of class '<em>Transformation Root Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Root Object</em>'.
	 * @generated
	 */
	<T> TransformationRootObject<T> createTransformationRootObject();

	/**
	 * Returns a new object of class '<em>Realtime Statechart Transformation Root Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realtime Statechart Transformation Root Object</em>'.
	 * @generated
	 */
	RealtimeStatechartTransformationRootObject createRealtimeStatechartTransformationRootObject();

	/**
	 * Returns a new object of class '<em>Position Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Extension</em>'.
	 * @generated
	 */
	PositionExtension createPositionExtension();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TransformPackage getTransformPackage();

} //TransformFactory
