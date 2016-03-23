/**
 */
package org.muml.ape;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.ape.OrderedElement#getClazz <em>Clazz</em>}</li>
 * </ul>
 *
 * @see org.muml.ape.PropertiesPackage#getOrderedElement()
 * @model abstract="true"
 * @generated
 */
public interface OrderedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.ape.Class#getOrderedElements <em>Ordered Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' container reference.
	 * @see #setClazz(org.muml.ape.Class)
	 * @see org.muml.ape.PropertiesPackage#getOrderedElement_Clazz()
	 * @see org.muml.ape.Class#getOrderedElements
	 * @model opposite="orderedElements" required="true" transient="false"
	 * @generated
	 */
	org.muml.ape.Class getClazz();

	/**
	 * Sets the value of the '{@link org.muml.ape.OrderedElement#getClazz <em>Clazz</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' container reference.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(org.muml.ape.Class value);

} // OrderedElement
