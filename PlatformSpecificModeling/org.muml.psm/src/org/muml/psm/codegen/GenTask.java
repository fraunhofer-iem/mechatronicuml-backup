/**
 */
package org.muml.psm.codegen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.codegen.GenTask#getGenComponentInstances <em>Gen Component Instances</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.codegen.CodegenPackage#getGenTask()
 * @model
 * @generated
 */
public interface GenTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen Component Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.codegen.GenComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Component Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Component Instances</em>' containment reference list.
	 * @see org.muml.psm.codegen.CodegenPackage#getGenTask_GenComponentInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenComponentInstance> getGenComponentInstances();

} // GenTask
