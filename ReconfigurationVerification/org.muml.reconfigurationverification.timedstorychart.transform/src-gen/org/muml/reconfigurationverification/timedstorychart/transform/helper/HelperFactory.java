/**
 */
package org.muml.reconfigurationverification.timedstorychart.transform.helper;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.timedstorychart.transform.helper.HelperPackage
 * @generated
 */
public interface HelperFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HelperFactory eINSTANCE = org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.HelperFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TSC Transformation Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSC Transformation Input</em>'.
	 * @generated
	 */
	TSCTransformationInput createTSCTransformationInput();

	/**
	 * Returns a new object of class '<em>TSC Transformation Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSC Transformation Output</em>'.
	 * @generated
	 */
	TSCTransformationOutput createTSCTransformationOutput();

	/**
	 * Returns a new object of class '<em>Transition Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Tuple</em>'.
	 * @generated
	 */
	TransitionTuple createTransitionTuple();

	/**
	 * Returns a new object of class '<em>Pre Transformation Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Transformation Helper</em>'.
	 * @generated
	 */
	PreTransformationHelper createPreTransformationHelper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HelperPackage getHelperPackage();

} //HelperFactory
