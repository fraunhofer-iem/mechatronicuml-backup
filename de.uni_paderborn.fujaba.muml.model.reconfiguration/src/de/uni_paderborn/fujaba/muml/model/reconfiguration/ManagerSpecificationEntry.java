/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration;

import org.storydriven.core.CommentableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager Specification Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#isTreat <em>Treat</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#isPropagate <em>Propagate</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getManager <em>Manager</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry()
 * @model
 * @generated
 */
public interface ManagerSpecificationEntry extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Treat</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treat</em>' attribute.
	 * @see #setTreat(boolean)
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry_Treat()
	 * @model default="true"
	 * @generated
	 */
	boolean isTreat();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#isTreat <em>Treat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treat</em>' attribute.
	 * @see #isTreat()
	 * @generated
	 */
	void setTreat(boolean value);

	/**
	 * Returns the value of the '<em><b>Propagate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagate</em>' attribute.
	 * @see #setPropagate(boolean)
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry_Propagate()
	 * @model default="false"
	 * @generated
	 */
	boolean isPropagate();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#isPropagate <em>Propagate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagate</em>' attribute.
	 * @see #isPropagate()
	 * @generated
	 */
	void setPropagate(boolean value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager#getSpecificationEntries <em>Specification Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' container reference.
	 * @see #setManager(Manager)
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry_Manager()
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager#getSpecificationEntries
	 * @model opposite="specificationEntries" required="true" transient="false"
	 * @generated
	 */
	Manager getManager();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getManager <em>Manager</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' container reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Manager value);

	/**
	 * Returns the value of the '<em><b>Reconfiguration Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Message Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Message Type</em>' reference.
	 * @see #setReconfigurationMessageType(ReconfigurationMessageType)
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry_ReconfigurationMessageType()
	 * @model required="true"
	 * @generated
	 */
	ReconfigurationMessageType getReconfigurationMessageType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Message Type</em>' reference.
	 * @see #getReconfigurationMessageType()
	 * @generated
	 */
	void setReconfigurationMessageType(ReconfigurationMessageType value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(ReconfigurationCondition)
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getManagerSpecificationEntry_Guard()
	 * @model
	 * @generated
	 */
	ReconfigurationCondition getGuard();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(ReconfigurationCondition value);

} // ManagerSpecificationEntry
