/**
 */
package de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is a extension of a real-time statechart, which has additional plattformspecific parameters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.ParameterizedRealtimeStatechart#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.ParameterizedRealtimeStatechart#getAllParameters <em>All Parameters</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.Psm_realtimestatechartPackage#getParameterizedRealtimeStatechart()
 * @model
 * @generated
 */
public interface ParameterizedRealtimeStatechart extends RealtimeStatechart {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All parameter for this statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.Psm_realtimestatechartPackage#getParameterizedRealtimeStatechart_Parameters()
	 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter#getStatechart
	 * @model opposite="statechart" containment="true"
	 * @generated
	 */
	EList<RealtimeStatechartParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>All Parameters</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Parameters</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.Psm_realtimestatechartPackage#getParameterizedRealtimeStatechart_AllParameters()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self->closure(states.embeddedRegions.embeddedStatechart.oclAsType(psm_realtimestatechart::ParameterizedRealtimeStatechart)).parameters->asOrderedSet()'"
	 * @generated
	 */
	EList<RealtimeStatechartParameter> getAllParameters();

} // ParameterizedRealtimeStatechart
