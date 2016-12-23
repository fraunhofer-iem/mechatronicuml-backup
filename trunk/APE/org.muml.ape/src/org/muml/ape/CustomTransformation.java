/**
 */
package org.muml.ape;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.ape.CustomTransformation#getUri <em>Uri</em>}</li>
 *   <li>{@link org.muml.ape.CustomTransformation#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.muml.ape.CustomTransformation#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see org.muml.ape.PropertiesPackage#getCustomTransformation()
 * @model
 * @generated
 */
public interface CustomTransformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.muml.ape.PropertiesPackage#getCustomTransformation_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.muml.ape.CustomTransformation#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.muml.ape.PropertiesPackage#getCustomTransformation_Enabled()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.muml.ape.CustomTransformation#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"POST_RECONCILE"</code>.
	 * The literals are from the enumeration {@link org.muml.ape.TransformationPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see org.muml.ape.TransformationPosition
	 * @see #setPosition(TransformationPosition)
	 * @see org.muml.ape.PropertiesPackage#getCustomTransformation_Position()
	 * @model default="POST_RECONCILE" required="true"
	 * @generated
	 */
	TransformationPosition getPosition();

	/**
	 * Sets the value of the '{@link org.muml.ape.CustomTransformation#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see org.muml.ape.TransformationPosition
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(TransformationPosition value);

} // CustomTransformation
