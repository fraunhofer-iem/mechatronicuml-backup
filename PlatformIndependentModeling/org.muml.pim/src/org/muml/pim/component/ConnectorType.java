/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component;

import org.muml.core.ExtendableElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class is the common super class of delegations and assemblies between two ports.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.pim.component.ConnectorType#getFromPort <em>From Port</em>}</li>
 *   <li>{@link org.muml.pim.component.ConnectorType#getToPort <em>To Port</em>}</li>
 *   <li>{@link org.muml.pim.component.ConnectorType#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link org.muml.pim.component.ConnectorType#getToDiscretePort <em>To Discrete Port</em>}</li>
 *   <li>{@link org.muml.pim.component.ConnectorType#getFromDiscretePort <em>From Discrete Port</em>}</li>
 *   <li>{@link org.muml.pim.component.ConnectorType#getToContinuousPort <em>To Continuous Port</em>}</li>
 *   <li>{@link org.muml.pim.component.ConnectorType#getFromContinuousPort <em>From Continuous Port</em>}</li>
 *   <li>{@link org.muml.pim.component.ConnectorType#getToHybridPort <em>To Hybrid Port</em>}</li>
 *   <li>{@link org.muml.pim.component.ConnectorType#getFromHybridPort <em>From Hybrid Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.pim.component.ComponentPackage#getConnectorType()
 * @model abstract="true"
 * @generated
 */
public interface ConnectorType extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>From Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.component.Port#getOutgoingConnectors <em>Outgoing Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port this connector originates from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Port</em>' reference.
	 * @see #setFromPort(Port)
	 * @see org.muml.pim.component.ComponentPackage#getConnectorType_FromPort()
	 * @see org.muml.pim.component.Port#getOutgoingConnectors
	 * @model opposite="outgoingConnectors" required="true"
	 * @generated
	 */
	Port getFromPort();

	/**
	 * Sets the value of the '{@link org.muml.pim.component.ConnectorType#getFromPort <em>From Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Port</em>' reference.
	 * @see #getFromPort()
	 * @generated
	 */
	void setFromPort(Port value);

	/**
	 * Returns the value of the '<em><b>To Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.component.Port#getIncomingConnectors <em>Incoming Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port this connector leads to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Port</em>' reference.
	 * @see #setToPort(Port)
	 * @see org.muml.pim.component.ComponentPackage#getConnectorType_ToPort()
	 * @see org.muml.pim.component.Port#getIncomingConnectors
	 * @model opposite="incomingConnectors" required="true"
	 * @generated
	 */
	Port getToPort();

	/**
	 * Sets the value of the '{@link org.muml.pim.component.ConnectorType#getToPort <em>To Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Port</em>' reference.
	 * @see #getToPort()
	 * @generated
	 */
	void setToPort(Port value);

	/**
	 * Returns the value of the '<em><b>Parent Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.component.StructuredComponent#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structured component this connector belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Component</em>' container reference.
	 * @see #setParentComponent(StructuredComponent)
	 * @see org.muml.pim.component.ComponentPackage#getConnectorType_ParentComponent()
	 * @see org.muml.pim.component.StructuredComponent#getConnectors
	 * @model opposite="connectors" transient="false"
	 * @generated
	 */
	StructuredComponent getParentComponent();

	/**
	 * Sets the value of the '{@link org.muml.pim.component.ConnectorType#getParentComponent <em>Parent Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Component</em>' container reference.
	 * @see #getParentComponent()
	 * @generated
	 */
	void setParentComponent(StructuredComponent value);

	/**
	 * Returns the value of the '<em><b>To Discrete Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the toPort as a DiscretePort if possible
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Discrete Port</em>' reference.
	 * @see org.muml.pim.component.ComponentPackage#getConnectorType_ToDiscretePort()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.toPort.oclIsUndefined() and self.toPort.oclIsTypeOf(component::DiscretePort) then\n\tself.toPort.oclAsType(component::DiscretePort)\nelse\n\tnull\nendif'"
	 * @generated
	 */
	DiscretePort getToDiscretePort();

	/**
	 * Returns the value of the '<em><b>From Discrete Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the fromPort as a DiscretePort if possible
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Discrete Port</em>' reference.
	 * @see org.muml.pim.component.ComponentPackage#getConnectorType_FromDiscretePort()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.fromPort.oclIsUndefined() and self.fromPort.oclIsTypeOf(component::DiscretePort) then\n\tself.fromPort.oclAsType(component::DiscretePort)\nelse\n\tnull\nendif'"
	 * @generated
	 */
	DiscretePort getFromDiscretePort();

	/**
	 * Returns the value of the '<em><b>To Continuous Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the toPort as a ContinuesPort if possible
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Continuous Port</em>' reference.
	 * @see org.muml.pim.component.ComponentPackage#getConnectorType_ToContinuousPort()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.toPort.oclIsUndefined() and self.toPort.oclIsTypeOf(component::ContinuousPort) then\n\tself.toPort.oclAsType(component::ContinuousPort)\nelse\n\tnull\nendif'"
	 * @generated
	 */
	ContinuousPort getToContinuousPort();

	/**
	 * Returns the value of the '<em><b>From Continuous Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the fromPort as a ContinuousPort if possible
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Continuous Port</em>' reference.
	 * @see org.muml.pim.component.ComponentPackage#getConnectorType_FromContinuousPort()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.fromPort.oclIsUndefined() and self.fromPort.oclIsTypeOf(component::ContinuousPort) then\n\tself.fromPort.oclAsType(component::ContinuousPort)\nelse\n\tnull\nendif'"
	 * @generated
	 */
	ContinuousPort getFromContinuousPort();

	/**
	 * Returns the value of the '<em><b>To Hybrid Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the toPort as a HybridPort if possible
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Hybrid Port</em>' reference.
	 * @see org.muml.pim.component.ComponentPackage#getConnectorType_ToHybridPort()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.toPort.oclIsUndefined() and self.toPort.oclIsTypeOf(component::HybridPort) then\n\tself.toPort.oclAsType(component::HybridPort)\nelse\n\tnull\nendif'"
	 * @generated
	 */
	HybridPort getToHybridPort();

	/**
	 * Returns the value of the '<em><b>From Hybrid Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the fromPort as a HybridPort if possible
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Hybrid Port</em>' reference.
	 * @see org.muml.pim.component.ComponentPackage#getConnectorType_FromHybridPort()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.fromPort.oclIsUndefined() and self.fromPort.oclIsTypeOf(component::HybridPort) then\n\tself.fromPort.oclAsType(component::HybridPort)\nelse\n\tnull\nendif'"
	 * @generated
	 */
	HybridPort getFromHybridPort();

} // ConnectorType
