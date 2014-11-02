/**
 */
package es.unican.mast.xmlmast.result;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interrupt FP Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.InterruptFPPolicy#getPreassigned <em>Preassigned</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.InterruptFPPolicy#getThePriority <em>The Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.result.ResultPackage#getInterruptFPPolicy()
 * @model extendedMetaData="name='Interrupt_FP_Policy' kind='empty'"
 * @generated
 */
public interface InterruptFPPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Preassigned</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.mast.xmlmast.result.AffirmativeAssertion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preassigned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preassigned</em>' attribute.
	 * @see es.unican.mast.xmlmast.result.AffirmativeAssertion
	 * @see #isSetPreassigned()
	 * @see #unsetPreassigned()
	 * @see #setPreassigned(AffirmativeAssertion)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getInterruptFPPolicy_Preassigned()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Preassigned'"
	 * @generated
	 */
	AffirmativeAssertion getPreassigned();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.InterruptFPPolicy#getPreassigned <em>Preassigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preassigned</em>' attribute.
	 * @see es.unican.mast.xmlmast.result.AffirmativeAssertion
	 * @see #isSetPreassigned()
	 * @see #unsetPreassigned()
	 * @see #getPreassigned()
	 * @generated
	 */
	void setPreassigned(AffirmativeAssertion value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.InterruptFPPolicy#getPreassigned <em>Preassigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreassigned()
	 * @see #getPreassigned()
	 * @see #setPreassigned(AffirmativeAssertion)
	 * @generated
	 */
	void unsetPreassigned();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.InterruptFPPolicy#getPreassigned <em>Preassigned</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preassigned</em>' attribute is set.
	 * @see #unsetPreassigned()
	 * @see #getPreassigned()
	 * @see #setPreassigned(AffirmativeAssertion)
	 * @generated
	 */
	boolean isSetPreassigned();

	/**
	 * Returns the value of the '<em><b>The Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Priority</em>' attribute.
	 * @see #isSetThePriority()
	 * @see #unsetThePriority()
	 * @see #setThePriority(int)
	 * @see es.unican.mast.xmlmast.result.ResultPackage#getInterruptFPPolicy_ThePriority()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.result.Priority"
	 *        extendedMetaData="kind='attribute' name='The_Priority'"
	 * @generated
	 */
	int getThePriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.result.InterruptFPPolicy#getThePriority <em>The Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Priority</em>' attribute.
	 * @see #isSetThePriority()
	 * @see #unsetThePriority()
	 * @see #getThePriority()
	 * @generated
	 */
	void setThePriority(int value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.result.InterruptFPPolicy#getThePriority <em>The Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThePriority()
	 * @see #getThePriority()
	 * @see #setThePriority(int)
	 * @generated
	 */
	void unsetThePriority();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.result.InterruptFPPolicy#getThePriority <em>The Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>The Priority</em>' attribute is set.
	 * @see #unsetThePriority()
	 * @see #getThePriority()
	 * @see #setThePriority(int)
	 * @generated
	 */
	boolean isSetThePriority();

} // InterruptFPPolicy
