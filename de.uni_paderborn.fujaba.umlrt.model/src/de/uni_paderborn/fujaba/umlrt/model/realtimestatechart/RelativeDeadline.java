/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Deadline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a relative deadline. It is always associated with a transition of the statechart. The deadlin is relative to the point in time when the execution of the transition starts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline#getUMLRealtimeTransition <em>UML Realtime Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getRelativeDeadline()
 * @model
 * @generated
 */
public interface RelativeDeadline extends Deadline {
	/**
	 * Returns the value of the '<em><b>UML Realtime Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRelativeDeadline <em>Relative Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML Realtime Transition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML Realtime Transition</em>' container reference.
	 * @see #setUMLRealtimeTransition(Transition)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getRelativeDeadline_UMLRealtimeTransition()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRelativeDeadline
	 * @model opposite="relativeDeadline" transient="false"
	 * @generated
	 */
	Transition getUMLRealtimeTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline#getUMLRealtimeTransition <em>UML Realtime Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Transition</em>' container reference.
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	void setUMLRealtimeTransition(Transition value);

} // RelativeDeadline
