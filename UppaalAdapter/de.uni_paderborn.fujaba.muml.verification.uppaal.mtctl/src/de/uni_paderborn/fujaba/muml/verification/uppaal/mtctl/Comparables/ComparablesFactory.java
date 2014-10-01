/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage
 * @generated
 */
public interface ComparablesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComparablesFactory eINSTANCE = de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Buffer Msg Count Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer Msg Count Expr</em>'.
	 * @generated
	 */
	BufferMsgCountExpr createBufferMsgCountExpr();

	/**
	 * Returns a new object of class '<em>Const Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Const Expr</em>'.
	 * @generated
	 */
	ConstExpr createConstExpr();

	/**
	 * Returns a new object of class '<em>Muml Elem Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Muml Elem Expr</em>'.
	 * @generated
	 */
	MumlElemExpr createMumlElemExpr();

	/**
	 * Returns a new object of class '<em>Source State Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source State Expr</em>'.
	 * @generated
	 */
	SourceStateExpr createSourceStateExpr();

	/**
	 * Returns a new object of class '<em>Target State Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target State Expr</em>'.
	 * @generated
	 */
	TargetStateExpr createTargetStateExpr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComparablesPackage getComparablesPackage();

} //ComparablesFactory
