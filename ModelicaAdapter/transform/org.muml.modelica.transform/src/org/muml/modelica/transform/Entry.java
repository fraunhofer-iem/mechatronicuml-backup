/**
 */
package org.muml.modelica.transform;

import org.eclipse.emf.ecore.EObject;
import org.muml.pim.realtimestatechart.RealtimeStatechart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.modelica.transform.Entry#getKey <em>Key</em>}</li>
 *   <li>{@link org.muml.modelica.transform.Entry#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.muml.modelica.transform.TransformPackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(EObject)
	 * @see org.muml.modelica.transform.TransformPackage#getEntry_Key()
	 * @model
	 * @generated
	 */
	EObject getKey();

	/**
	 * Sets the value of the '{@link org.muml.modelica.transform.Entry#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(EObject value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(RealtimeStatechart)
	 * @see org.muml.modelica.transform.TransformPackage#getEntry_Value()
	 * @model containment="true"
	 * @generated
	 */
	RealtimeStatechart getValue();

	/**
	 * Sets the value of the '{@link org.muml.modelica.transform.Entry#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(RealtimeStatechart value);

} // Entry
