/**
 */
package de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.ParameterizedRealtimeStatechart;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realtime Statechart Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a parameter of a realtimestatechart, which can be bound by a instance of a discrete port. A parameter is used to add parts of a realtimestatechart that are only known in a instance of a discrete port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter#getStatechart <em>Statechart</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage#getRealtimeStatechartParameter()
 * @model abstract="true"
 * @generated
 */
public interface RealtimeStatechartParameter extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.ParameterizedRealtimeStatechart#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The statechart, to which this parameter belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statechart</em>' container reference.
	 * @see #setStatechart(ParameterizedRealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage#getRealtimeStatechartParameter_Statechart()
	 * @see de.uni_paderborn.fujaba.muml.psm.realtimestatechart.ParameterizedRealtimeStatechart#getParameters
	 * @model opposite="parameters" required="true" transient="false"
	 * @generated
	 */
	ParameterizedRealtimeStatechart getStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter#getStatechart <em>Statechart</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' container reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(ParameterizedRealtimeStatechart value);

} // RealtimeStatechartParameter
