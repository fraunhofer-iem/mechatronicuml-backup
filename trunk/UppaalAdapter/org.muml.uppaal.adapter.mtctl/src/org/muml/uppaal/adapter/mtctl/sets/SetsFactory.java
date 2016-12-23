/**
 */
package org.muml.uppaal.adapter.mtctl.sets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.adapter.mtctl.sets.SetsPackage
 * @generated
 */
public interface SetsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SetsFactory eINSTANCE = org.muml.uppaal.adapter.mtctl.sets.impl.SetsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Clock Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Set Expr</em>'.
	 * @generated
	 */
	ClockSetExpr createClockSetExpr();

	/**
	 * Returns a new object of class '<em>Interval Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interval Set Expr</em>'.
	 * @generated
	 */
	IntervalSetExpr createIntervalSetExpr();

	/**
	 * Returns a new object of class '<em>Message Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Set Expr</em>'.
	 * @generated
	 */
	MessageSetExpr createMessageSetExpr();

	/**
	 * Returns a new object of class '<em>State Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Set Expr</em>'.
	 * @generated
	 */
	StateSetExpr createStateSetExpr();

	/**
	 * Returns a new object of class '<em>Transition Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Set Expr</em>'.
	 * @generated
	 */
	TransitionSetExpr createTransitionSetExpr();

	/**
	 * Returns a new object of class '<em>Buffer Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer Set Expr</em>'.
	 * @generated
	 */
	BufferSetExpr createBufferSetExpr();

	/**
	 * Returns a new object of class '<em>Instance Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Set Expr</em>'.
	 * @generated
	 */
	InstanceSetExpr createInstanceSetExpr();

	/**
	 * Returns a new object of class '<em>Subinstance Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subinstance Set Expr</em>'.
	 * @generated
	 */
	SubinstanceSetExpr createSubinstanceSetExpr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SetsPackage getSetsPackage();

} //SetsFactory
