/**
 */
package org.muml.reconfiguration.componentstorypattern;

import org.eclipse.emf.common.util.EList;
import org.muml.reconfiguration.ReconfigurableComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.ComponentVariable#getPortVariables <em>Port Variables</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.ComponentVariable#getPartVariables <em>Part Variables</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.ComponentVariable#getConnectorVariables <em>Connector Variables</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.ComponentVariable#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getComponentVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtLeastOnePartVariableOrPortVariable='self.portVariables->size() > 0 or self.partVariables->size() > 0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOnePartVariableOrPortVariable'"
 * @generated
 */
public interface ComponentVariable extends ComponentStoryPatternVariable {
	/**
	 * Returns the value of the '<em><b>Port Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfiguration.componentstorypattern.PortVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Variables</em>' containment reference list.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getComponentVariable_PortVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortVariable> getPortVariables();

	/**
	 * Returns the value of the '<em><b>Part Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfiguration.componentstorypattern.PartVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Variables</em>' containment reference list.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getComponentVariable_PartVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<PartVariable> getPartVariables();

	/**
	 * Returns the value of the '<em><b>Connector Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfiguration.componentstorypattern.ConnectorVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Variables</em>' containment reference list.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getComponentVariable_ConnectorVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectorVariable> getConnectorVariables();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ReconfigurableComponent)
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getComponentVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	ReconfigurableComponent getType();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorypattern.ComponentVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ReconfigurableComponent value);

} // ComponentVariable
