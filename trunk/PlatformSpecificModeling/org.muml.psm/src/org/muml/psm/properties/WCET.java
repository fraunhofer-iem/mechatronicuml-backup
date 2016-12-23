/**
 */
package org.muml.psm.properties;

import org.muml.core.Extension;
import org.muml.pim.valuetype.TimeValue;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WCET</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Worst-Case-Execution Time of a Component Instance, if its allocated to a specific Resource Instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.properties.WCET#getWcet <em>Wcet</em>}</li>
 *   <li>{@link org.muml.psm.properties.WCET#getResourceInstance <em>Resource Instance</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.properties.PropertiesPackage#getWCET()
 * @model
 * @generated
 */
public interface WCET extends Extension {
	/**
	 * Returns the value of the '<em><b>Wcet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of the WCET.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wcet</em>' containment reference.
	 * @see #setWcet(TimeValue)
	 * @see org.muml.psm.properties.PropertiesPackage#getWCET_Wcet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getWcet();

	/**
	 * Sets the value of the '{@link org.muml.psm.properties.WCET#getWcet <em>Wcet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcet</em>' containment reference.
	 * @see #getWcet()
	 * @generated
	 */
	void setWcet(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The used Resource Instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Instance</em>' reference.
	 * @see #setResourceInstance(StructuredResourceInstance)
	 * @see org.muml.psm.properties.PropertiesPackage#getWCET_ResourceInstance()
	 * @model
	 * @generated
	 */
	StructuredResourceInstance getResourceInstance();

	/**
	 * Sets the value of the '{@link org.muml.psm.properties.WCET#getResourceInstance <em>Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Instance</em>' reference.
	 * @see #getResourceInstance()
	 * @generated
	 */
	void setResourceInstance(StructuredResourceInstance value);

} // WCET
