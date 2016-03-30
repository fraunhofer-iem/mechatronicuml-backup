/**
 */
package de.uni_paderborn.fujaba.muml.psm.properties;

import org.muml.core.Extension;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;
import org.muml.pm.hardware.hwvaluetype.DataSize;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The amount of required memory of a Component Instance, if its allocated to a specific Resource Instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.RequiredMemory#getRequiredMemory <em>Required Memory</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.RequiredMemory#getResourceInstance <em>Resource Instance</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getRequiredMemory()
 * @model
 * @generated
 */
public interface RequiredMemory extends Extension {
	/**
	 * Returns the value of the '<em><b>Required Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The required amount of memory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Memory</em>' containment reference.
	 * @see #setRequiredMemory(DataSize)
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getRequiredMemory_RequiredMemory()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataSize getRequiredMemory();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.properties.RequiredMemory#getRequiredMemory <em>Required Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Memory</em>' containment reference.
	 * @see #getRequiredMemory()
	 * @generated
	 */
	void setRequiredMemory(DataSize value);

	/**
	 * Returns the value of the '<em><b>Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The used Resource Instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Instance</em>' reference.
	 * @see #setResourceInstance(StructuredResourceInstance)
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getRequiredMemory_ResourceInstance()
	 * @model required="true"
	 * @generated
	 */
	StructuredResourceInstance getResourceInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.properties.RequiredMemory#getResourceInstance <em>Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Instance</em>' reference.
	 * @see #getResourceInstance()
	 * @generated
	 */
	void setResourceInstance(StructuredResourceInstance value);

} // RequiredMemory
