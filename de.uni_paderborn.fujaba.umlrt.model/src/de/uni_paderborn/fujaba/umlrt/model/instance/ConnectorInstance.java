/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.instance;

import de.uni_paderborn.fujaba.umlrt.model.component.BehavioralConnector;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This one connects two ports of two component instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getToComponentI <em>To Component I</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getFromComponentI <em>From Component I</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getToPort <em>To Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getFromPort <em>From Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getConnectorInstance()
 * @model
 * @generated
 */
public interface ConnectorInstance extends BehavioralConnector {
	/**
	 * Returns the value of the '<em><b>To Component I</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getToRef <em>To Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Component I</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Component I</em>' reference.
	 * @see #setToComponentI(ComponentInstance)
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getConnectorInstance_ToComponentI()
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getToRef
	 * @model opposite="toRef"
	 * @generated
	 */
	ComponentInstance getToComponentI();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getToComponentI <em>To Component I</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Component I</em>' reference.
	 * @see #getToComponentI()
	 * @generated
	 */
	void setToComponentI(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>From Component I</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getFromRef <em>From Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Component I</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Component I</em>' reference.
	 * @see #setFromComponentI(ComponentInstance)
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getConnectorInstance_FromComponentI()
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getFromRef
	 * @model opposite="fromRef"
	 * @generated
	 */
	ComponentInstance getFromComponentI();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getFromComponentI <em>From Component I</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Component I</em>' reference.
	 * @see #getFromComponentI()
	 * @generated
	 */
	void setFromComponentI(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Port</em>' reference.
	 * @see #setToPort(Port)
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getConnectorInstance_ToPort()
	 * @model required="true"
	 * @generated
	 */
	Port getToPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getToPort <em>To Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Port</em>' reference.
	 * @see #getToPort()
	 * @generated
	 */
	void setToPort(Port value);

	/**
	 * Returns the value of the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Port</em>' reference.
	 * @see #setFromPort(Port)
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getConnectorInstance_FromPort()
	 * @model required="true"
	 * @generated
	 */
	Port getFromPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getFromPort <em>From Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Port</em>' reference.
	 * @see #getFromPort()
	 * @generated
	 */
	void setFromPort(Port value);

} // ConnectorInstance
