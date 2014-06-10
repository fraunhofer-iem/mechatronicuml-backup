/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MapExpr;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Set Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.InstanceSetExpr#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsPackage#getInstanceSetExpr()
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
	 * @see #setType(MapExpr)
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsPackage#getInstanceSetExpr_Type()
	 * @model containment="true"
	 * @generated
	 */
	MapExpr getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.InstanceSetExpr#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MapExpr value);

} // InstanceSetExpr
