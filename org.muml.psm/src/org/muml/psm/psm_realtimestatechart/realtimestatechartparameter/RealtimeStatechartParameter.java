/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameter;

import org.muml.mumlcore.CommentableElement;
import org.muml.mumlcore.NamedElement;
import org.muml.psm.psm_realtimestatechart.ParameterizedRealtimeStatechart;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter#getStatechart <em>Statechart</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage#getRealtimeStatechartParameter()
 * @model abstract="true"
 * @generated
 */
public interface RealtimeStatechartParameter extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.psm.psm_realtimestatechart.ParameterizedRealtimeStatechart#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The statechart, to which this parameter belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statechart</em>' container reference.
	 * @see #setStatechart(ParameterizedRealtimeStatechart)
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage#getRealtimeStatechartParameter_Statechart()
	 * @see org.muml.psm.psm_realtimestatechart.ParameterizedRealtimeStatechart#getParameters
	 * @model opposite="parameters" required="true" transient="false"
	 * @generated
	 */
	ParameterizedRealtimeStatechart getStatechart();

	/**
	 * Sets the value of the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter#getStatechart <em>Statechart</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' container reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(ParameterizedRealtimeStatechart value);

} // RealtimeStatechartParameter
