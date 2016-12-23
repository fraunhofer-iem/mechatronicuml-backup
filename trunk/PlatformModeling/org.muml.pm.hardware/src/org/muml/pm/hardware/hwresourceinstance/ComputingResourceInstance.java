/**
 */
package org.muml.pm.hardware.hwresourceinstance;

import org.muml.pm.hardware.hwvaluetype.Frequency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an instance of a ComputingResource.
 * ComputingResources are resources that are able to execute code.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.ComputingResourceInstance#getFrequency <em>Frequency</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getComputingResourceInstance()
 * @model abstract="true"
 * @generated
 */
public interface ComputingResourceInstance extends AtomicResourceInstance {
	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency or clock rate of this ComputingResource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency</em>' containment reference.
	 * @see #setFrequency(Frequency)
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getComputingResourceInstance_Frequency()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Frequency getFrequency();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresourceinstance.ComputingResourceInstance#getFrequency <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' containment reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(Frequency value);

} // ComputingResourceInstance
