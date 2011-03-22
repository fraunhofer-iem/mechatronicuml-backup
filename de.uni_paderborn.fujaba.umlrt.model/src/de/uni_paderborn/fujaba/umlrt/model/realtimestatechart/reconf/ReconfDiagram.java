/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeCompositeState;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getPortInstanceReconfs <em>Port Instance Reconfs</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getDelegationReconfs <em>Delegation Reconfs</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getPortReconfs <em>Port Reconfs</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getAssemblyReconfs <em>Assembly Reconfs</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getUMLComplexRealtimeState <em>UML Complex Realtime State</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getReconfDiagram()
 * @model
 * @generated
 */
public interface ReconfDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Instance Reconfs</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortInstanceReconf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instance Reconfs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instance Reconfs</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getReconfDiagram_PortInstanceReconfs()
	 * @model
	 * @generated
	 */
	EList<PortInstanceReconf> getPortInstanceReconfs();

	/**
	 * Returns the value of the '<em><b>Delegation Reconfs</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.DelegationReconf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation Reconfs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Reconfs</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getReconfDiagram_DelegationReconfs()
	 * @model
	 * @generated
	 */
	EList<DelegationReconf> getDelegationReconfs();

	/**
	 * Returns the value of the '<em><b>Port Reconfs</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.PortReconf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Reconfs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Reconfs</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getReconfDiagram_PortReconfs()
	 * @model
	 * @generated
	 */
	EList<PortReconf> getPortReconfs();

	/**
	 * Returns the value of the '<em><b>Assembly Reconfs</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.AssemblyReconf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Reconfs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Reconfs</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getReconfDiagram_AssemblyReconfs()
	 * @model
	 * @generated
	 */
	EList<AssemblyReconf> getAssemblyReconfs();

	/**
	 * Returns the value of the '<em><b>UML Complex Realtime State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML Complex Realtime State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML Complex Realtime State</em>' reference.
	 * @see #setUMLComplexRealtimeState(UMLRealtimeCompositeState)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage#getReconfDiagram_UMLComplexRealtimeState()
	 * @model
	 * @generated
	 */
	UMLRealtimeCompositeState getUMLComplexRealtimeState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram#getUMLComplexRealtimeState <em>UML Complex Realtime State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Complex Realtime State</em>' reference.
	 * @see #getUMLComplexRealtimeState()
	 * @generated
	 */
	void setUMLComplexRealtimeState(UMLRealtimeCompositeState value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<ComponentInstanceReconf> iteratorOfComponentInstanceReconf();

} // ReconfDiagram
