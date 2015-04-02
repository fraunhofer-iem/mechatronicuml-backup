/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInit#getInitElements <em>Init Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getArrayInit()
 * @model
 * @generated
 */
public interface ArrayInit extends ArrayInitElement, StructureElementValue {
	/**
	 * Returns the value of the '<em><b>Init Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInitElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Elements</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getArrayInit_InitElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ArrayInitElement> getInitElements();

} // ArrayInit
