/**
 */
package mtctl.BooleanLogic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mtctl.BooleanLogic.BooleanLogicPackage
 * @generated
 */
public interface BooleanLogicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BooleanLogicFactory eINSTANCE = mtctl.BooleanLogic.impl.BooleanLogicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>And Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Expr</em>'.
	 * @generated
	 */
	AndExpr createAndExpr();

	/**
	 * Returns a new object of class '<em>Imply Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imply Expr</em>'.
	 * @generated
	 */
	ImplyExpr createImplyExpr();

	/**
	 * Returns a new object of class '<em>Not Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Expr</em>'.
	 * @generated
	 */
	NotExpr createNotExpr();

	/**
	 * Returns a new object of class '<em>Or Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Expr</em>'.
	 * @generated
	 */
	OrExpr createOrExpr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BooleanLogicPackage getBooleanLogicPackage();

} //BooleanLogicFactory
