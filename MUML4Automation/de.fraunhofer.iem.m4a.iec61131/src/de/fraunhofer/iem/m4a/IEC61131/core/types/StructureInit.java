/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureInit#getElementInit <em>Element Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStructureInit()
 * @model
 * @generated
 */
public interface StructureInit extends StructureElementValue, ArrayInitElement {
	/**
	 * Returns the value of the '<em><b>Element Init</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Init</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Init</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStructureInit_ElementInit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StructureElementInit> getElementInit();

} // StructureInit
