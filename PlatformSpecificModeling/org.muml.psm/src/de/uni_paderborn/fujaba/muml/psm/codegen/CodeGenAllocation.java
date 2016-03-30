/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen;

import org.eclipse.emf.ecore.EObject;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Gen Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an allocation of a ComponentInstanceConfigratuion to a specific HardwarePlatformInstanceConfiguration on PSM-level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.CodeGenAllocation#getHpic <em>Hpic</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.CodeGenAllocation#getCic <em>Cic</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getCodeGenAllocation()
 * @model
 * @generated
 */
public interface CodeGenAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Hpic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The used HardwarePlatformInstanceConfiguration on PSM-level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hpic</em>' containment reference.
	 * @see #setHpic(HWPlatformInstanceConfiguration)
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getCodeGenAllocation_Hpic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HWPlatformInstanceConfiguration getHpic();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.CodeGenAllocation#getHpic <em>Hpic</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The allocated ComponentInstanceConfiguration on PSM-level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cic</em>' containment reference.
	 * @see #setCic(ComponentInstanceConfiguration)
	 * @see de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage#getCodeGenAllocation_Cic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentInstanceConfiguration getCic();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.codegen.CodeGenAllocation#getCic <em>Cic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cic</em>' containment reference.
	 * @see #getCic()
	 * @generated
	 */
	void setCic(ComponentInstanceConfiguration value);

} // CodeGenAllocation
