/**
 */
package de.uni_paderborn.fujaba.muml.swplatform;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.types.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Enumeration is a possible parameter for an API-command. The Enumeration defines its possible values that can be used as concrete values at runtime.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.swplatform.EnumerationDataType#getEnumerationValues <em>Enumeration Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage#getEnumerationDataType()
 * @model
 * @generated
 */
public interface EnumerationDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Enumeration Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.swplatform.EnumerationValue}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.swplatform.EnumerationValue#getEnumerationDataType <em>Enumeration Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The possible values from the enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration Values</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage#getEnumerationDataType_EnumerationValues()
	 * @see de.uni_paderborn.fujaba.muml.swplatform.EnumerationValue#getEnumerationDataType
	 * @model opposite="enumerationDataType" containment="true" required="true"
	 * @generated
	 */
	EList<EnumerationValue> getEnumerationValues();

} // EnumerationDataType
