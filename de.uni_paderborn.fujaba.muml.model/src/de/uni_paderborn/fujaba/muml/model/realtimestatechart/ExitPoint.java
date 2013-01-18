/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExitPoint is an intermediate pseudostate which makes it possible to chain transitions between different hierarchy levels. An  ExitPoint is used to deactivate a dedicated inner state of an embedded statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint#getStateExitPoint <em>State Exit Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getExitPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtMostOneOutgoingTransition OneIncomingTransition ExitPointAndSourceSameStatechart'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtMostOneOutgoingTransition='self.outgoingTransitions->size() <= 1' OneIncomingTransition='self.incomingTransitions->size() = 1' ExitPointAndSourceSameStatechart='self.incomingTransitions->size() = 1 implies\n\t(not self.incomingTransitions->at(1).source.oclIsUndefined()\n\t and self.incomingTransitions->at(1).source.statechart = self.statechart\n\t)'"
 * @generated
 */
public interface ExitPoint extends Vertex {

	/**
	 * Returns the value of the '<em><b>State Exit Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint#getExitPoints <em>Exit Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referenced StateEntryPoint of embedding statechart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Exit Point</em>' reference.
	 * @see #setStateExitPoint(StateExitPoint)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getExitPoint_StateExitPoint()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint#getExitPoints
	 * @model opposite="exitPoints" required="true"
	 * @generated
	 */
	StateExitPoint getStateExitPoint();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint#getStateExitPoint <em>State Exit Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Exit Point</em>' reference.
	 * @see #getStateExitPoint()
	 * @generated
	 */
	void setStateExitPoint(StateExitPoint value);
} // ExitPoint
