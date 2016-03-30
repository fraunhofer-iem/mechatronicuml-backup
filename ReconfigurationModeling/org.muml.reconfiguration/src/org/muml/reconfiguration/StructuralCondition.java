/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;
import org.muml.pim.behavior.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StructuralCondition is a condition on the embedded component instances 
 * of a reconfigurable structured component instance that is used by a 
 * ManagerSpecificationEntry for deciding whether a reconfiguration may be 
 * executed. For an atomic component, the structural condition only considers
 * the ports of the component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.StructuralCondition#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.muml.reconfiguration.StructuralCondition#getReconfigurableComponent <em>Reconfigurable Component</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.ReconfigurationPackage#getStructuralCondition()
 * @model abstract="true"
 * @generated
 */
public interface StructuralCondition extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.behavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input parameters provided to the structural condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getStructuralCondition_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Reconfigurable Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfigurable Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfigurable Component</em>' reference.
	 * @see #setReconfigurableComponent(ReconfigurableComponent)
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getStructuralCondition_ReconfigurableComponent()
	 * @model required="true"
	 * @generated
	 */
	ReconfigurableComponent getReconfigurableComponent();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.StructuralCondition#getReconfigurableComponent <em>Reconfigurable Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfigurable Component</em>' reference.
	 * @see #getReconfigurableComponent()
	 * @generated
	 */
	void setReconfigurableComponent(ReconfigurableComponent value);

} // StructuralCondition
