/**
 */
package org.muml.psm.codegen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.codegen.GenSystem#getGenECUs <em>Gen EC Us</em>}</li>
 *   <li>{@link org.muml.psm.codegen.GenSystem#getCic <em>Cic</em>}</li>
 *   <li>{@link org.muml.psm.codegen.GenSystem#getHpic <em>Hpic</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.codegen.CodegenPackage#getGenSystem()
 * @model
 * @generated
 */
public interface GenSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen EC Us</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.codegen.GenECU}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen EC Us</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen EC Us</em>' containment reference list.
	 * @see org.muml.psm.codegen.CodegenPackage#getGenSystem_GenECUs()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenECU> getGenECUs();

	/**
	 * Returns the value of the '<em><b>Cic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The allocated ComponentInstanceConfiguration on PSM-level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cic</em>' reference.
	 * @see #setCic(ComponentInstanceConfiguration)
	 * @see org.muml.psm.codegen.CodegenPackage#getGenSystem_Cic()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstanceConfiguration getCic();

	/**
	 * Sets the value of the '{@link org.muml.psm.codegen.GenSystem#getCic <em>Cic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cic</em>' reference.
	 * @see #getCic()
	 * @generated
	 */
	void setCic(ComponentInstanceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Hpic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The used HardwarePlatformInstanceConfiguration on PSM-level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hpic</em>' reference.
	 * @see #setHpic(HWPlatformInstanceConfiguration)
	 * @see org.muml.psm.codegen.CodegenPackage#getGenSystem_Hpic()
	 * @model required="true"
	 * @generated
	 */
	HWPlatformInstanceConfiguration getHpic();

	/**
	 * Sets the value of the '{@link org.muml.psm.codegen.GenSystem#getHpic <em>Hpic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hpic</em>' reference.
	 * @see #getHpic()
	 * @generated
	 */
	void setHpic(HWPlatformInstanceConfiguration value);

} // GenSystem
