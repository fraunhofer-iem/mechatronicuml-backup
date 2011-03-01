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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getUMLRealtimeTransition <em>UML Realtime Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getUMLClock <em>UML Clock</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getAbsoluteDeadline()
 * @model
 * @generated
 */
public interface AbsoluteDeadline extends Deadline {
	/**
	 * Returns the value of the '<em><b>UML Realtime Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getAbsoluteDeadlines <em>Absolute Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML Realtime Transition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML Realtime Transition</em>' container reference.
	 * @see #setUMLRealtimeTransition(UMLRealtimeTransition)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getAbsoluteDeadline_UMLRealtimeTransition()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getAbsoluteDeadlines
	 * @model opposite="absoluteDeadlines" required="true" transient="false"
	 * @generated
	 */
	UMLRealtimeTransition getUMLRealtimeTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getUMLRealtimeTransition <em>UML Realtime Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Transition</em>' container reference.
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	void setUMLRealtimeTransition(UMLRealtimeTransition value);

	/**
	 * Returns the value of the '<em><b>UML Clock</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#getAbsoluteDeadlines <em>Absolute Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML Clock</em>' reference.
	 * @see #setUMLClock(UMLClock)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getAbsoluteDeadline_UMLClock()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock#getAbsoluteDeadlines
	 * @model opposite="absoluteDeadlines" required="true"
	 * @generated
	 */
	UMLClock getUMLClock();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline#getUMLClock <em>UML Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Clock</em>' reference.
	 * @see #getUMLClock()
	 * @generated
	 */
	void setUMLClock(UMLClock value);

} // AbsoluteDeadline
