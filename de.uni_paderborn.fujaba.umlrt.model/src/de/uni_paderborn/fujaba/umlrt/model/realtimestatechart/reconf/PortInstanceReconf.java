/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf;

import de.uni_paderborn.fujaba.umlrt.model.component.Port;

import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Instance Reconf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getComponentInstanceReconf <em>Component Instance Reconf</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getPortByComponentInstance <em>Port By Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getReconfDiagram <em>Reconf Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getPortInstanceReconf()
 * @model
 * @generated
 */
public interface PortInstanceReconf extends EObject {
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getPortInstanceReconf_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Component Instance Reconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance Reconf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance Reconf</em>' reference.
	 * @see #setComponentInstanceReconf(ComponentInstanceReconf)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getPortInstanceReconf_ComponentInstanceReconf()
	 * @model
	 * @generated
	 */
	ComponentInstanceReconf getComponentInstanceReconf();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getComponentInstanceReconf <em>Component Instance Reconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance Reconf</em>' reference.
	 * @see #getComponentInstanceReconf()
	 * @generated
	 */
	void setComponentInstanceReconf(ComponentInstanceReconf value);

	/**
	 * Returns the value of the '<em><b>Port By Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port By Component Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port By Component Instance</em>' reference.
	 * @see #setPortByComponentInstance(Map.Entry)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getPortInstanceReconf_PortByComponentInstance()
	 * @model mapType="de.uni_paderborn.fujaba.umlrt.model.instance.CI2PMapEntry<de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance, de.uni_paderborn.fujaba.umlrt.model.component.Port>"
	 * @generated
	 */
	Map.Entry<ComponentInstance, Port> getPortByComponentInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getPortByComponentInstance <em>Port By Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port By Component Instance</em>' reference.
	 * @see #getPortByComponentInstance()
	 * @generated
	 */
	void setPortByComponentInstance(Map.Entry<ComponentInstance, Port> value);

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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getPortInstanceReconf_ReconfDiagram()
	 * @model
	 * @generated
	 */
	ReconfDiagram getReconfDiagram();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf#getReconfDiagram <em>Reconf Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconf Diagram</em>' reference.
	 * @see #getReconfDiagram()
	 * @generated
	 */
	void setReconfDiagram(ReconfDiagram value);

} // PortInstanceReconf
