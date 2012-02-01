/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import org.storydriven.modeling.ExtendableElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class is the common super class of delegations and assemblies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromPort <em>From Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToPort <em>To Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToDiscretePort <em>To Discrete Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromDiscretePort <em>From Discrete Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToContinuousPort <em>To Continuous Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromContinuousPort <em>From Continuous Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getConnectorType()
 * @model abstract="true"
 * @generated
 */
public interface ConnectorType extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>From Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.Port#getOutgoingConnectors <em>Outgoing Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port this connector originates from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Port</em>' reference.
	 * @see #setFromPort(Port)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getConnectorType_FromPort()
	 * @see de.uni_paderborn.fujaba.muml.model.component.Port#getOutgoingConnectors
	 * @model opposite="outgoingConnectors" required="true"
	 * @generated
	 */
	Port getFromPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromPort <em>From Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Port</em>' reference.
	 * @see #getFromPort()
	 * @generated
	 */
	void setFromPort(Port value);

	/**
	 * Returns the value of the '<em><b>To Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.Port#getIncomingConnectors <em>Incoming Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port this connector leads to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Port</em>' reference.
	 * @see #setToPort(Port)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getConnectorType_ToPort()
	 * @see de.uni_paderborn.fujaba.muml.model.component.Port#getIncomingConnectors
	 * @model opposite="incomingConnectors" required="true"
	 * @generated
	 */
	Port getToPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToPort <em>To Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Port</em>' reference.
	 * @see #getToPort()
	 * @generated
	 */
	void setToPort(Port value);

	/**
	 * Returns the value of the '<em><b>Parent Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structured component this connector belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Component</em>' container reference.
	 * @see #setParentComponent(StructuredComponent)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getConnectorType_ParentComponent()
	 * @see de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getConnectors
	 * @model opposite="connectors" transient="false"
	 * @generated
	 */
	StructuredComponent getParentComponent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getParentComponent <em>Parent Component</em>}' container reference.
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
	 * @see #setToDiscretePort(DiscretePort)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getConnectorType_ToDiscretePort()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.toPort.oclIsUndefined() and self.toPort.oclIsKindOf(component::DiscretePort) then\n\tself.toPort.oclAsType(component::DiscretePort)\nelse\n\tnull\nendif'"
	 * @generated
	 */
	DiscretePort getToDiscretePort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToDiscretePort <em>To Discrete Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Discrete Port</em>' reference.
	 * @see #getToDiscretePort()
	 * @generated
	 */
	void setToDiscretePort(DiscretePort value);

	/**
	 * Returns the value of the '<em><b>From Discrete Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the fromPort as a DiscretePort if possible
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Discrete Port</em>' reference.
	 * @see #setFromDiscretePort(DiscretePort)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getConnectorType_FromDiscretePort()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.fromPort.oclIsUndefined() and self.fromPort.oclIsKindOf(component::DiscretePort) then\n\tself.fromPort.oclAsType(component::DiscretePort)\nelse\n\tnull\nendif'"
	 * @generated
	 */
	DiscretePort getFromDiscretePort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromDiscretePort <em>From Discrete Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Discrete Port</em>' reference.
	 * @see #getFromDiscretePort()
	 * @generated
	 */
	void setFromDiscretePort(DiscretePort value);

	/**
	 * Returns the value of the '<em><b>To Continuous Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the toPort as a ContinuesPort if possible
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Continuous Port</em>' reference.
	 * @see #setToContinuousPort(ContinuousPort)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getConnectorType_ToContinuousPort()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.toPort.oclIsUndefined() and self.toPort.oclIsKindOf(component::ContinuousPort) then\n\tself.toPort.oclAsType(component::ContinuousPort)\nelse\n\tnull\nendif'"
	 * @generated
	 */
	ContinuousPort getToContinuousPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getToContinuousPort <em>To Continuous Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Continuous Port</em>' reference.
	 * @see #getToContinuousPort()
	 * @generated
	 */
	void setToContinuousPort(ContinuousPort value);

	/**
	 * Returns the value of the '<em><b>From Continuous Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the fromPort as a ContinuousPort if possible
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Continuous Port</em>' reference.
	 * @see #setFromContinuousPort(ContinuousPort)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getConnectorType_FromContinuousPort()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.fromPort.oclIsUndefined() and self.fromPort.oclIsKindOf(component::ContinuousPort) then\n\tself.fromPort.oclAsType(component::ContinuousPort)\nelse\n\tnull\nendif'"
	 * @generated
	 */
	ContinuousPort getFromContinuousPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getFromContinuousPort <em>From Continuous Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Continuous Port</em>' reference.
	 * @see #getFromContinuousPort()
	 * @generated
	 */
	void setFromContinuousPort(ContinuousPort value);

} // ConnectorType
