/**
 */
package de.uni_paderbor.fujaba.muml.psm.codegen;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cod Gen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderbor.fujaba.muml.psm.codegen.CodGen#getAllResourceInstances <em>All Resource Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderbor.fujaba.muml.psm.codegen.CodegenPackage#getCodGen()
 * @model
 * @generated
 */
public interface CodGen extends ComponentInstanceConfiguration {
	/**
	 * Returns the value of the '<em><b>All Resource Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderbor.fujaba.muml.psm.codegen.RefindedStructuredResourceInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Resource Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Resource Instances</em>' containment reference list.
	 * @see de.uni_paderbor.fujaba.muml.psm.codegen.CodegenPackage#getCodGen_AllResourceInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefindedStructuredResourceInstance> getAllResourceInstances();

} // CodGen
