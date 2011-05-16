/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component;

import de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance;


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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType#getFromPort <em>From Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType#getToPort <em>To Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType#getParentComponent <em>Parent Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getConnectorType()
 * @model abstract="true"
 * @generated
 */
public interface ConnectorType extends BehavioralConnector {
	/**
	 * Returns the value of the '<em><b>From Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getOutgoingConnectors <em>Outgoing Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port this connector originates from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Port</em>' reference.
	 * @see #setFromPort(Port)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getConnectorType_FromPort()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.Port#getOutgoingConnectors
	 * @model opposite="outgoingConnectors" required="true"
	 * @generated
	 */
	Port getFromPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType#getFromPort <em>From Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Port</em>' reference.
	 * @see #getFromPort()
	 * @generated
	 */
	void setFromPort(Port value);

	/**
	 * Returns the value of the '<em><b>To Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.Port#getIncomingConnectors <em>Incoming Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port this connector leads to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Port</em>' reference.
	 * @see #setToPort(Port)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getConnectorType_ToPort()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.Port#getIncomingConnectors
	 * @model opposite="incomingConnectors" required="true"
	 * @generated
	 */
	Port getToPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType#getToPort <em>To Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Port</em>' reference.
	 * @see #getToPort()
	 * @generated
	 */
	void setToPort(Port value);

	/**
	 * Returns the value of the '<em><b>Parent Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structured component this connector belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Component</em>' container reference.
	 * @see #setParentComponent(StructuredComponent)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getConnectorType_ParentComponent()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent#getConnectors
	 * @model opposite="connectors" transient="false"
	 * @generated
	 */
	StructuredComponent getParentComponent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.ConnectorType#getParentComponent <em>Parent Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Component</em>' container reference.
	 * @see #getParentComponent()
	 * @generated
	 */
	void setParentComponent(StructuredComponent value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	ConnectorInstance createInstance();

} // ConnectorType
