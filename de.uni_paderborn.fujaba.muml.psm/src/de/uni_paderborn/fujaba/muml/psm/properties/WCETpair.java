/**
 */
package de.uni_paderborn.fujaba.muml.psm.properties;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WCE Tpair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.WCETpair#getAmount <em>Amount</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.WCETpair#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getWCETpair()
 * @model
 * @generated
 */
public interface WCETpair extends EObject {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' reference.
	 * @see #setAmount(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getWCETpair_Amount()
	 * @model required="true"
	 * @generated
	 */
	TimeValue getAmount();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.properties.WCETpair#getAmount <em>Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(TimeValue value);

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
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getWCETpair_Resource()
	 * @model required="true"
	 * @generated
	 */
	StructuredResourceInstance getResource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.properties.WCETpair#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(StructuredResourceInstance value);

} // WCETpair
