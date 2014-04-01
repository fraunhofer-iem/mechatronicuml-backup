/**
 */
package mtctl.Comparables;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Muml Elem Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to an element or expression that evaluates (at least indirectly) to some element of the underlying model (e.g., State, MapExpr, Clock,...)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mtctl.Comparables.MumlElemExpr#getElem <em>Elem</em>}</li>
 * </ul>
 * </p>
 *
 * @see mtctl.Comparables.ComparablesPackage#getMumlElemExpr()
 * @model
 * @generated
 */
public interface MumlElemExpr extends MapExpr {
	/**
	 * Returns the value of the '<em><b>Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referenced element/expression. Typing and scoping is done in the MtctlScopeProvider
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elem</em>' reference.
	 * @see #setElem(EObject)
	 * @see mtctl.Comparables.ComparablesPackage#getMumlElemExpr_Elem()
	 * @model
	 * @generated
	 */
	EObject getElem();

	/**
	 * Sets the value of the '{@link mtctl.Comparables.MumlElemExpr#getElem <em>Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elem</em>' reference.
	 * @see #getElem()
	 * @generated
	 */
	void setElem(EObject value);

} // MumlElemExpr
