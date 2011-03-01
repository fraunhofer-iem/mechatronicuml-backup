/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf;

import de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Reconf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getConnectorInstance <em>Connector Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getReqPortInstanceReconf <em>Req Port Instance Reconf</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getProvPortInstanceReconf <em>Prov Port Instance Reconf</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getReconfDiagram <em>Reconf Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getAssemblyReconf()
 * @model
 * @generated
 */
public interface AssemblyReconf extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Instance</em>' reference.
	 * @see #setConnectorInstance(ConnectorInstance)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getAssemblyReconf_ConnectorInstance()
	 * @model
	 * @generated
	 */
	ConnectorInstance getConnectorInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getConnectorInstance <em>Connector Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Instance</em>' reference.
	 * @see #getConnectorInstance()
	 * @generated
	 */
	void setConnectorInstance(ConnectorInstance value);

	/**
	 * Returns the value of the '<em><b>Req Port Instance Reconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Port Instance Reconf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Port Instance Reconf</em>' reference.
	 * @see #setReqPortInstanceReconf(PortInstanceReconf)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getAssemblyReconf_ReqPortInstanceReconf()
	 * @model
	 * @generated
	 */
	PortInstanceReconf getReqPortInstanceReconf();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getReqPortInstanceReconf <em>Req Port Instance Reconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Port Instance Reconf</em>' reference.
	 * @see #getReqPortInstanceReconf()
	 * @generated
	 */
	void setReqPortInstanceReconf(PortInstanceReconf value);

	/**
	 * Returns the value of the '<em><b>Prov Port Instance Reconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prov Port Instance Reconf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prov Port Instance Reconf</em>' reference.
	 * @see #setProvPortInstanceReconf(PortInstanceReconf)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getAssemblyReconf_ProvPortInstanceReconf()
	 * @model
	 * @generated
	 */
	PortInstanceReconf getProvPortInstanceReconf();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getProvPortInstanceReconf <em>Prov Port Instance Reconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prov Port Instance Reconf</em>' reference.
	 * @see #getProvPortInstanceReconf()
	 * @generated
	 */
	void setProvPortInstanceReconf(PortInstanceReconf value);

	/**
	 * Returns the value of the '<em><b>Reconf Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconf Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconf Diagram</em>' reference.
	 * @see #setReconfDiagram(ReconfDiagram)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getAssemblyReconf_ReconfDiagram()
	 * @model
	 * @generated
	 */
	ReconfDiagram getReconfDiagram();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf#getReconfDiagram <em>Reconf Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconf Diagram</em>' reference.
	 * @see #getReconfDiagram()
	 * @generated
	 */
	void setReconfDiagram(ReconfDiagram value);

} // AssemblyReconf
