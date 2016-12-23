/**
 */
package org.muml.uppaal.adapter.mtctl.comparables;

import java.util.concurrent.TimeUnit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Const Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An integer constant
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.comparables.ConstExpr#getVal <em>Val</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.comparables.ConstExpr#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.mtctl.comparables.ComparablesPackage#getConstExpr()
 * @model
 * @generated
 */
public interface ConstExpr extends MapExpr {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constant value of the expression
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(int)
	 * @see org.muml.uppaal.adapter.mtctl.comparables.ComparablesPackage#getConstExpr_Val()
	 * @model
	 * @generated
	 */
	int getVal();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.comparables.ConstExpr#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(int value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see #setTimeUnit(TimeUnit)
	 * @see org.muml.uppaal.adapter.mtctl.comparables.ComparablesPackage#getConstExpr_TimeUnit()
	 * @model dataType="org.muml.pim.valuetype.TimeUnit"
	 * @generated
	 */
	TimeUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.comparables.ConstExpr#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(TimeUnit value);

} // ConstExpr
