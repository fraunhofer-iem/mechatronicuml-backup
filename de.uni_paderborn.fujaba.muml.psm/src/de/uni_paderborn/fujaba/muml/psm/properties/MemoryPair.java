/**
 */
package de.uni_paderborn.fujaba.muml.psm.properties;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair#getAmount <em>Amount</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getMemoryPair()
 * @model
 * @generated
 */
public interface MemoryPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' reference.
	 * @see #setAmount(DataSize)
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getMemoryPair_Amount()
	 * @model required="true"
	 * @generated
	 */
	DataSize getAmount();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair#getAmount <em>Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(DataSize value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(StructuredResourceInstance)
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getMemoryPair_Resource()
	 * @model required="true"
	 * @generated
	 */
	StructuredResourceInstance getResource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(StructuredResourceInstance value);

} // MemoryPair
