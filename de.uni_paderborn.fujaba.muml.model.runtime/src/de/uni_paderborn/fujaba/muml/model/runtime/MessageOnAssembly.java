/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message On Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly#getMessage <em>Message</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly#getRuntimeAssembly <em>Runtime Assembly</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getMessageOnAssembly()
 * @model
 * @generated
 */
public interface MessageOnAssembly extends EObject {
	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(RuntimeBehavioralElement)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getMessageOnAssembly_Receiver()
	 * @model required="true"
	 * @generated
	 */
	RuntimeBehavioralElement getReceiver();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(RuntimeBehavioralElement value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(RuntimeMessage)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getMessageOnAssembly_Message()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RuntimeMessage getMessage();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(RuntimeMessage value);

	/**
	 * Returns the value of the '<em><b>Runtime Assembly</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance#getTransientMessages <em>Transient Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Assembly</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Assembly</em>' container reference.
	 * @see #setRuntimeAssembly(RuntimeAssemblyInstance)
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getMessageOnAssembly_RuntimeAssembly()
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance#getTransientMessages
	 * @model opposite="transientMessages" required="true" transient="false"
	 * @generated
	 */
	RuntimeAssemblyInstance getRuntimeAssembly();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly#getRuntimeAssembly <em>Runtime Assembly</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Assembly</em>' container reference.
	 * @see #getRuntimeAssembly()
	 * @generated
	 */
	void setRuntimeAssembly(RuntimeAssemblyInstance value);

} // MessageOnAssembly
