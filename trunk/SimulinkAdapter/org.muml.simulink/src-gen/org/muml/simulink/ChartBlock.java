/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink;

import org.muml.simulink.stateflow.Chart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.ChartBlock#getChart <em>Chart</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.SimulinkPackage#getChartBlock()
 * @model
 * @generated
 */
public interface ChartBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Chart</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.simulink.stateflow.Chart#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart</em>' reference.
	 * @see #setChart(Chart)
	 * @see org.muml.simulink.SimulinkPackage#getChartBlock_Chart()
	 * @see org.muml.simulink.stateflow.Chart#getBlock
	 * @model opposite="block" required="true"
	 * @generated
	 */
	Chart getChart();

	/**
	 * Sets the value of the '{@link org.muml.simulink.ChartBlock#getChart <em>Chart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart</em>' reference.
	 * @see #getChart()
	 * @generated
	 */
	void setChart(Chart value);

} // ChartBlock
