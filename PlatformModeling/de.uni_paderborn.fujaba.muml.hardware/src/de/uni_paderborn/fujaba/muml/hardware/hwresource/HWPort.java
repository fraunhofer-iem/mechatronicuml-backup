/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource;

import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getHWPort()
 * @model abstract="true"
 * @generated
 */
public interface HWPort<T> extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Resource, this HWPort belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Object)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getHWPort_Parent()
	 * @model kind="reference"
	 * @generated
	 */
	T getParent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(T value);

} // HWPort
