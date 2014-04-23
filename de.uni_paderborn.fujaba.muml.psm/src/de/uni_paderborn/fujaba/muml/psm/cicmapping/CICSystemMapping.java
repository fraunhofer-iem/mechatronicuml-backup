/**
 */
package de.uni_paderborn.fujaba.muml.psm.cicmapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIC System Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the Mapping of cntinous components to sensors and actuators.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.CICSystemMapping#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.CicmappingPackage#getCICSystemMapping()
 * @model
 * @generated
 */
public interface CICSystemMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.psm.cicmapping.CICMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.CicmappingPackage#getCICSystemMapping_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<CICMapping> getMappings();

} // CICSystemMapping
