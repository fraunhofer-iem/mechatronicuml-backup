/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the stop state of a realtime statechart.
 * <!-- end-model-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFinalState()
 * @model
 * @generated
 */
public interface FinalState extends Vertex {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject clone(AbstractStatechart rtsc, FinalState newStopState);

} // FinalState
