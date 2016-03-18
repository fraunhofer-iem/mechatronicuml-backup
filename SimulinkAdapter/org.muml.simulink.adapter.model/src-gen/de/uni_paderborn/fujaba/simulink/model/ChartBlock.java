/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model;

import de.uni_paderborn.fujaba.simulink.model.stateflow.Chart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.ChartBlock#getChart <em>Chart</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getChartBlock()
 * @model
 * @generated
 */
public interface ChartBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Chart</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.stateflow.Chart#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart</em>' reference.
	 * @see #setChart(Chart)
	 * @see de.uni_paderborn.fujaba.simulink.model.SimulinkPackage#getChartBlock_Chart()
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.Chart#getBlock
	 * @model opposite="block" required="true"
	 * @generated
	 */
	Chart getChart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.ChartBlock#getChart <em>Chart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart</em>' reference.
	 * @see #getChart()
	 * @generated
	 */
	void setChart(Chart value);

} // ChartBlock
