/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Instances#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getInstances()
 * @model
 * @generated
 */
public interface Instances extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.opendds.modeling.sdk.model.GeneratorSpecification.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage#getInstances_Instance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstance();

} // Instances
