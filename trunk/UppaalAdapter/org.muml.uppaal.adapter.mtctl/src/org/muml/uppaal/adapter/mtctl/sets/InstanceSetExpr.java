/**
 */
package org.muml.uppaal.adapter.mtctl.sets;

import org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Set Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.sets.InstanceSetExpr#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.mtctl.sets.SetsPackage#getInstanceSetExpr()
 * @model
 * @generated
 */
public interface InstanceSetExpr extends SetExpr {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of all elements in the set (e.g., a ConnectorEndpoint or a Component)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(MumlElemExpr)
	 * @see org.muml.uppaal.adapter.mtctl.sets.SetsPackage#getInstanceSetExpr_Type()
	 * @model containment="true"
	 * @generated
	 */
	MumlElemExpr getType();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.sets.InstanceSetExpr#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MumlElemExpr value);

} // InstanceSetExpr
