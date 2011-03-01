/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Reconf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getPortReconf <em>Port Reconf</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getPortInstanceReconf <em>Port Instance Reconf</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getReconfDiagram <em>Reconf Diagram</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getDelegationReconf()
 * @model
 * @generated
 */
public interface DelegationReconf extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Reconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Reconf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Reconf</em>' reference.
	 * @see #setPortReconf(PortReconf)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getDelegationReconf_PortReconf()
	 * @model
	 * @generated
	 */
	PortReconf getPortReconf();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getPortReconf <em>Port Reconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Reconf</em>' reference.
	 * @see #getPortReconf()
	 * @generated
	 */
	void setPortReconf(PortReconf value);

	/**
	 * Returns the value of the '<em><b>Port Instance Reconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instance Reconf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instance Reconf</em>' reference.
	 * @see #setPortInstanceReconf(PortInstanceReconf)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getDelegationReconf_PortInstanceReconf()
	 * @model
	 * @generated
	 */
	PortInstanceReconf getPortInstanceReconf();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getPortInstanceReconf <em>Port Instance Reconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Instance Reconf</em>' reference.
	 * @see #getPortInstanceReconf()
	 * @generated
	 */
	void setPortInstanceReconf(PortInstanceReconf value);

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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getDelegationReconf_ReconfDiagram()
	 * @model
	 * @generated
	 */
	ReconfDiagram getReconfDiagram();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getReconfDiagram <em>Reconf Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconf Diagram</em>' reference.
	 * @see #getReconfDiagram()
	 * @generated
	 */
	void setReconfDiagram(ReconfDiagram value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getDelegationReconf_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DelegationReconf
