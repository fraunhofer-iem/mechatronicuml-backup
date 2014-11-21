/**
 */
package de.uni_paderborn.fujaba.muml.psm.realtimestatechart;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is a extension of a real-time statechart, which has aditional plattformspecific parameters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.ParameterizedRealtimeStatechart#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.ParameterizedRealtimeStatechart#getAllParameters <em>All Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.realtimestatechart.RealtimestatechartPackage#getParameterizedRealtimeStatechart()
 * @model
 * @generated
 */
public interface ParameterizedRealtimeStatechart extends RealtimeStatechart {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All parameter for this statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.realtimestatechart.RealtimestatechartPackage#getParameterizedRealtimeStatechart_Parameters()
	 * @see de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter#getStatechart
	 * @model opposite="statechart" containment="true"
	 * @generated
	 */
	EList<RealtimeStatechartParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>All Parameters</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Parameters</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.realtimestatechart.RealtimestatechartPackage#getParameterizedRealtimeStatechart_AllParameters()
	 * @model volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self->closure(states.embeddedRegions.embeddedStatechart.oclAsType(realtimestatechart::ParameterizedRealtimeStatechart)).parameters->asOrderedSet()'"
	 * @generated
	 */
	EList<RealtimeStatechartParameter> getAllParameters();

} // ParameterizedRealtimeStatechart
