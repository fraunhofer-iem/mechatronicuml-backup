/**
 */
package org.muml.reconfiguration.componentstorypattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Port Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.MultiPortVariable#getSubPortVariables <em>Sub Port Variables</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.MultiPortVariable#getGmfSubPortVariables <em>Gmf Sub Port Variables</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.MultiPortVariable#getOrderConstraints <em>Order Constraints</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getMultiPortVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL MultiPortCreatedOnlyIfParentCreated='-- Multi Port Variables may only be created if their parent is created as well\r\nif(self.bindingOperator = storydiagrams::patterns::BindingOperator::CREATE and self.eContainer().oclIsKindOf(ComponentStoryPatternVariable)) then\r\n\tself.eContainer().oclAsType(ComponentStoryPatternVariable).bindingOperator = storydiagrams::patterns::BindingOperator::CREATE\r\nelse\r\n\ttrue\r\nendif'"
 * @generated
 */
public interface MultiPortVariable extends PortVariable {
	/**
	 * Returns the value of the '<em><b>Sub Port Variables</b></em>' reference list.
	 * The list contents are of type {@link org.muml.reconfiguration.componentstorypattern.SinglePortVariable}.
	 * It is bidirectional and its opposite is '{@link org.muml.reconfiguration.componentstorypattern.SinglePortVariable#getMultiPortVariable <em>Multi Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all sub-portVariables of the multi-portVariable. The sub-portVariables are represented by SinglePortVariables. \todosd{Why is this not a containment reference?}"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Port Variables</em>' reference list.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getMultiPortVariable_SubPortVariables()
	 * @see org.muml.reconfiguration.componentstorypattern.SinglePortVariable#getMultiPortVariable
	 * @model opposite="multiPortVariable"
	 * @generated
	 */
	EList<SinglePortVariable> getSubPortVariables();

	/**
	 * Returns the value of the '<em><b>Gmf Sub Port Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfiguration.componentstorypattern.SinglePortVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference just derives the values of "subPortVariables" and specifies a containment. This containment reference is needed by the GMF tooling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gmf Sub Port Variables</em>' containment reference list.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getMultiPortVariable_GmfSubPortVariables()
	 * @model containment="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.subPortVariables'"
	 * @generated
	 */
	EList<SinglePortVariable> getGmfSubPortVariables();

	/**
	 * Returns the value of the '<em><b>Order Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint}.
	 * It is bidirectional and its opposite is '{@link org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint#getMultiPortVariable <em>Multi Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Constraints</em>' containment reference list.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getMultiPortVariable_OrderConstraints()
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint#getMultiPortVariable
	 * @model opposite="multiPortVariable" containment="true"
	 * @generated
	 */
	EList<MultiPortOrderConstraint> getOrderConstraints();

} // MultiPortVariable
