/**
 */
package org.muml.uppaal.adapter.mtctl.sets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval Set Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Set integers between lowerVal and upperVal
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.sets.IntervalSetExpr#getLowerVal <em>Lower Val</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.sets.IntervalSetExpr#getUpperVal <em>Upper Val</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.mtctl.sets.SetsPackage#getIntervalSetExpr()
 * @model
 * @generated
 */
public interface IntervalSetExpr extends SetExpr {
	/**
	 * Returns the value of the '<em><b>Lower Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Val</em>' attribute.
	 * @see #setLowerVal(int)
	 * @see org.muml.uppaal.adapter.mtctl.sets.SetsPackage#getIntervalSetExpr_LowerVal()
	 * @model
	 * @generated
	 */
	int getLowerVal();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.sets.IntervalSetExpr#getLowerVal <em>Lower Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Val</em>' attribute.
	 * @see #getLowerVal()
	 * @generated
	 */
	void setLowerVal(int value);

	/**
	 * Returns the value of the '<em><b>Upper Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Val</em>' attribute.
	 * @see #setUpperVal(int)
	 * @see org.muml.uppaal.adapter.mtctl.sets.SetsPackage#getIntervalSetExpr_UpperVal()
	 * @model
	 * @generated
	 */
	int getUpperVal();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.sets.IntervalSetExpr#getUpperVal <em>Upper Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Val</em>' attribute.
	 * @see #getUpperVal()
	 * @generated
	 */
	void setUpperVal(int value);

} // IntervalSetExpr
