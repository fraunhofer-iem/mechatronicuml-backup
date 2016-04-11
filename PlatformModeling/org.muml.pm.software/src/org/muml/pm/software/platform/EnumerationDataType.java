/**
 */
package org.muml.pm.software.platform;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.software.platform.EnumerationDataType#getEnumerationValues <em>Enumeration Values</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.software.platform.SwplatformPackage#getEnumerationDataType()
 * @model
 * @generated
 */
public interface EnumerationDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Enumeration Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.software.platform.EnumerationValue}.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.software.platform.EnumerationValue#getEnumerationDataType <em>Enumeration Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The possible values from the enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration Values</em>' containment reference list.
	 * @see org.muml.pm.software.platform.SwplatformPackage#getEnumerationDataType_EnumerationValues()
	 * @see org.muml.pm.software.platform.EnumerationValue#getEnumerationDataType
	 * @model opposite="enumerationDataType" containment="true" required="true"
	 * @generated
	 */
	EList<EnumerationValue> getEnumerationValues();

} // EnumerationDataType
