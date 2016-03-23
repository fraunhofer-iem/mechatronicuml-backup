/**
 */
package de.uni_paderborn.fujaba.modelica.m2t.transform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.modelica.m2t.transform.Root#getMaps <em>Maps</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.TransformPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Maps</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.modelica.m2t.transform.Map}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.modelica.m2t.transform.TransformPackage#getRoot_Maps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Map> getMaps();

} // Root
