/**
 */
package de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TransitionTuple#getSending <em>Sending</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TransitionTuple#getReceiving <em>Receiving</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.HelperPackage#getTransitionTuple()
 * @model
 * @generated
 */
public interface TransitionTuple extends EObject {
	/**
	 * Returns the value of the '<em><b>Sending</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sending</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sending</em>' reference.
	 * @see #setSending(Transition)
	 * @see de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.HelperPackage#getTransitionTuple_Sending()
	 * @model
	 * @generated
	 */
	Transition getSending();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TransitionTuple#getSending <em>Sending</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sending</em>' reference.
	 * @see #getSending()
	 * @generated
	 */
	void setSending(Transition value);

	/**
	 * Returns the value of the '<em><b>Receiving</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiving</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving</em>' reference.
	 * @see #setReceiving(Transition)
	 * @see de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.HelperPackage#getTransitionTuple_Receiving()
	 * @model
	 * @generated
	 */
	Transition getReceiving();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TransitionTuple#getReceiving <em>Receiving</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving</em>' reference.
	 * @see #getReceiving()
	 * @generated
	 */
	void setReceiving(Transition value);

} // TransitionTuple
