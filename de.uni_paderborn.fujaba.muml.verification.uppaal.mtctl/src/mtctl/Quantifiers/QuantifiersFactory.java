/**
 */
package mtctl.Quantifiers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mtctl.Quantifiers.QuantifiersPackage
 * @generated
 */
public interface QuantifiersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuantifiersFactory eINSTANCE = mtctl.Quantifiers.impl.QuantifiersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AF Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AF Expr</em>'.
	 * @generated
	 */
	AFExpr createAFExpr();

	/**
	 * Returns a new object of class '<em>AG Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AG Expr</em>'.
	 * @generated
	 */
	AGExpr createAGExpr();

	/**
	 * Returns a new object of class '<em>EF Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EF Expr</em>'.
	 * @generated
	 */
	EFExpr createEFExpr();

	/**
	 * Returns a new object of class '<em>EG Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EG Expr</em>'.
	 * @generated
	 */
	EGExpr createEGExpr();

	/**
	 * Returns a new object of class '<em>Existence Quant Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existence Quant Expr</em>'.
	 * @generated
	 */
	ExistenceQuantExpr createExistenceQuantExpr();

	/**
	 * Returns a new object of class '<em>Bound Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bound Variable</em>'.
	 * @generated
	 */
	BoundVariable createBoundVariable();

	/**
	 * Returns a new object of class '<em>Universal Quant Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Universal Quant Expr</em>'.
	 * @generated
	 */
	UniversalQuantExpr createUniversalQuantExpr();

	/**
	 * Returns a new object of class '<em>Leads To Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leads To Expr</em>'.
	 * @generated
	 */
	LeadsToExpr createLeadsToExpr();

	/**
	 * Returns a new object of class '<em>Time Interval Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Interval Expr</em>'.
	 * @generated
	 */
	TimeIntervalExpr createTimeIntervalExpr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QuantifiersPackage getQuantifiersPackage();

} //QuantifiersFactory
