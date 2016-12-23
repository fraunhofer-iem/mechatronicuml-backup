/**
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.WrapperPackage
 * @generated
 */
public interface WrapperFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WrapperFactory eINSTANCE = org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.impl.WrapperFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bool Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool Wrapper</em>'.
	 * @generated
	 */
	BoolWrapper createBoolWrapper();

	/**
	 * Returns a new object of class '<em>Int Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Wrapper</em>'.
	 * @generated
	 */
	IntWrapper createIntWrapper();

	/**
	 * Returns a new object of class '<em>Long Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Wrapper</em>'.
	 * @generated
	 */
	LongWrapper createLongWrapper();

	/**
	 * Returns a new object of class '<em>String Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Wrapper</em>'.
	 * @generated
	 */
	StringWrapper createStringWrapper();

	/**
	 * Returns a new object of class '<em>Double Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Wrapper</em>'.
	 * @generated
	 */
	DoubleWrapper createDoubleWrapper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WrapperPackage getWrapperPackage();

} //WrapperFactory
