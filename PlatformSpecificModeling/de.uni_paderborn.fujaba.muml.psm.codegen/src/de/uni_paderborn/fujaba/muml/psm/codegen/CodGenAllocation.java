/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cod Gen Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.CodGenAllocation#getHpic <em>Hpic</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.CodGenAllocation#getCic <em>Cic</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getCodGenAllocation()
 * @model
 * @generated
 */
public interface CodGenAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Hpic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hpic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hpic</em>' containment reference.
	 * @see #setHpic(HWPlatformInstanceConfiguration)
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getCodGenAllocation_Hpic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HWPlatformInstanceConfiguration getHpic();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.CodGenAllocation#getHpic <em>Hpic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hpic</em>' containment reference.
	 * @see #getHpic()
	 * @generated
	 */
	void setHpic(HWPlatformInstanceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Cic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cic</em>' containment reference.
	 * @see #setCic(ComponentInstanceConfiguration)
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getCodGenAllocation_Cic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentInstanceConfiguration getCic();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.CodGenAllocation#getCic <em>Cic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cic</em>' containment reference.
	 * @see #getCic()
	 * @generated
	 */
	void setCic(ComponentInstanceConfiguration value);

} // CodGenAllocation
