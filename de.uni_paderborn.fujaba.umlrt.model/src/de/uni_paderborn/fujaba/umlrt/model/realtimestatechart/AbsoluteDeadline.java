/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute Deadline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an absolute deadline. It is always associated with a transition of the statechart. The deadline depends on the value of a certain clock.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getTransition <em>Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getClock <em>Clock</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getAbsoluteDeadline()
 * @model
 * @generated
 */
public interface AbsoluteDeadline extends Deadline {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getAbsoluteDeadlines <em>Absolute Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' container reference.
	 * @see #setTransition(Transition)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getAbsoluteDeadline_Transition()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getAbsoluteDeadlines
	 * @model opposite="absoluteDeadlines" required="true" transient="false"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getTransition <em>Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' container reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getAbsoluteDeadlines <em>Absolute Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' reference.
	 * @see #setClock(Clock)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getAbsoluteDeadline_Clock()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock#getAbsoluteDeadlines
	 * @model opposite="absoluteDeadlines" required="true"
	 * @generated
	 */
	Clock getClock();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(Clock value);

} // AbsoluteDeadline
