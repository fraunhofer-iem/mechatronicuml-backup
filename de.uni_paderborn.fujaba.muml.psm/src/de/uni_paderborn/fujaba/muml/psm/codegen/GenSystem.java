/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.GenSystem#getGenECUs <em>Gen EC Us</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getGenSystem()
 * @model
 * @generated
 */
public interface GenSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen EC Us</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.codegen.GenECU}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen EC Us</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen EC Us</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getGenSystem_GenECUs()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenECU> getGenECUs();

} // GenSystem
