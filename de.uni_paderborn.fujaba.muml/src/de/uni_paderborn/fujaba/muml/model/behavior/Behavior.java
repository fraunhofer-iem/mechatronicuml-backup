/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.behavior;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for all elements that represent a behavior. 
 * Known sub-classes: AbstractRealtimeStatechart
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.behavior.Behavior#getBehavioralElement <em>Behavioral Element</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.behavior.Behavior#getOperations <em>Operations</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.behavior.Behavior#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.behavior.BehaviorPackage#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior extends EObject {
	/**
	 * Returns the value of the '<em><b>Behavioral Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.behavior.BehavioralElement#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behavioral element this statechart belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavioral Element</em>' reference.
	 * @see #setBehavioralElement(BehavioralElement)
	 * @see de.uni_paderborn.fujaba.muml.model.behavior.BehaviorPackage#getBehavior_BehavioralElement()
	 * @see de.uni_paderborn.fujaba.muml.model.behavior.BehavioralElement#getBehavior
	 * @model opposite="behavior"
	 * @generated
	 */
	BehavioralElement getBehavioralElement();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.behavior.Behavior#getBehavioralElement <em>Behavioral Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioral Element</em>' reference.
	 * @see #getBehavioralElement()
	 * @generated
	 */
	void setBehavioralElement(BehavioralElement value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.behavior.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A behavior may define a set of Operations as signatures of helper functions. These operations
	 * may be called by the behavior specification and may access the attributes of
	 * the behavior specification. The Operations are contained in the behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.behavior.BehaviorPackage#getBehavior_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.behavior.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A behavior may define a set of Attributes in order to store data. The attributes
	 * may be used by the operations of the behavior and the behavior specification itself.
	 * The attributes are contained in the behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.behavior.BehaviorPackage#getBehavior_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // Behavior
