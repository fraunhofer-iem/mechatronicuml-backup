/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportRef#getTransport <em>Transport</em>}</li>
 * </ul>
 *
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportRef()
 * @model
 * @generated
 */
public interface TransportRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Transport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport</em>' reference.
	 * @see #setTransport(TransportInst)
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getTransportRef_Transport()
	 * @model
	 * @generated
	 */
	TransportInst getTransport();

	/**
	 * Sets the value of the '{@link org.opendds.modeling.sdk.model.GeneratorSpecification.TransportRef#getTransport <em>Transport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport</em>' reference.
	 * @see #getTransport()
	 * @generated
	 */
	void setTransport(TransportInst value);

} // TransportRef
