/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen ECU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.GenECU#getEcu <em>Ecu</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.GenECU#getAllocatedGenTasks <em>Allocated Gen Tasks</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getGenECU()
 * @model
 * @generated
 */
public interface GenECU extends EObject {
	/**
	 * Returns the value of the '<em><b>Ecu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecu</em>' reference.
	 * @see #setEcu(StructuredResourceInstance)
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getGenECU_Ecu()
	 * @model required="true"
	 * @generated
	 */
	StructuredResourceInstance getEcu();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.GenECU#getEcu <em>Ecu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecu</em>' reference.
	 * @see #getEcu()
	 * @generated
	 */
	void setEcu(StructuredResourceInstance value);

	/**
	 * Returns the value of the '<em><b>Allocated Gen Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.codegen.GenTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Gen Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Gen Tasks</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getGenECU_AllocatedGenTasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenTask> getAllocatedGenTasks();

} // GenECU
