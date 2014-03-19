/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable#getPortVariables <em>Port Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable#getPartVariables <em>Part Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable#getConnectorVariables <em>Connector Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getComponentVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtLeastOnePartVariableOrPortVariable='self.portVariables->size() > 0 or self.partVariables->size() > 0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOnePartVariableOrPortVariable'"
 * @generated
 */
public interface ComponentVariable extends ComponentStoryPatternVariable {
	/**
	 * Returns the value of the '<em><b>Port Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Variables</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getComponentVariable_PortVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortVariable> getPortVariables();

	/**
	 * Returns the value of the '<em><b>Part Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Variables</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getComponentVariable_PartVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<PartVariable> getPartVariables();

	/**
	 * Returns the value of the '<em><b>Connector Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.componentstorypattern.ConnectorVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Variables</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getComponentVariable_ConnectorVariables()
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
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getComponentVariable_Type()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.eContainer().eContainer().eContainer().eContainer().oclAsType(reconfiguration::ReconfigurationRule).reconfiguredComponent'"
	 * @generated
	 */
	ReconfigurableComponent getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ReconfigurableComponent value);

} // ComponentVariable
