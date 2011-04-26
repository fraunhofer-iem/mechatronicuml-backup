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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getRelativeDeadline()
 * @model
 * @generated
 */
public interface RelativeDeadline extends Deadline {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRelativeDeadline <em>Relative Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' container reference.
	 * @see #setTransition(Transition)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getRelativeDeadline_Transition()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getRelativeDeadline
	 * @model opposite="relativeDeadline" transient="false"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline#getTransition <em>Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' container reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(upperBound!=null && lowerBound!=null) {\r\nreturn \"[\" + upperBound+\",\"+ lowerBound +\"]\";\r\n}else{\r\nreturn \"\";\r\n}'"
	 * @generated
	 */
	String toMyString();

} // RelativeDeadline
