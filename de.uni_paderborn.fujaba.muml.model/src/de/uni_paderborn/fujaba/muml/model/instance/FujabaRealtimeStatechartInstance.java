/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fujaba Realtime Statechart Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance#getEmbeddedSubStatecharts <em>Embedded Sub Statecharts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance#getReferencedSubStatecharts <em>Referenced Sub Statecharts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance#getAllSubStatecharts <em>All Sub Statecharts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance#getParentStatechart <em>Parent Statechart</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getFujabaRealtimeStatechartInstance()
 * @model
 * @generated
 */
public interface FujabaRealtimeStatechartInstance extends BehaviorInstance {
	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statechart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statechart</em>' reference.
	 * @see #setStatechart(FujabaRealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getFujabaRealtimeStatechartInstance_Statechart()
	 * @model required="true"
	 * @generated
	 */
	FujabaRealtimeStatechart getStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance#getStatechart <em>Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(FujabaRealtimeStatechart value);

	/**
	 * Returns the value of the '<em><b>Embedded Sub Statecharts</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance#getParentStatechart <em>Parent Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded Sub Statecharts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded Sub Statecharts</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getFujabaRealtimeStatechartInstance_EmbeddedSubStatecharts()
	 * @see de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance#getParentStatechart
	 * @model opposite="parentStatechart"
	 * @generated
	 */
	EList<FujabaRealtimeStatechartInstance> getEmbeddedSubStatecharts();

	/**
	 * Returns the value of the '<em><b>Referenced Sub Statecharts</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Sub Statecharts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Sub Statecharts</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getFujabaRealtimeStatechartInstance_ReferencedSubStatecharts()
	 * @model
	 * @generated
	 */
	EList<FujabaRealtimeStatechartInstance> getReferencedSubStatecharts();

	/**
	 * Returns the value of the '<em><b>All Sub Statecharts</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \todosd{odl: implement derived, union of embedded and referenced}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Sub Statecharts</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getFujabaRealtimeStatechartInstance_AllSubStatecharts()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='embeddedSubStatecharts -> union(referencedSubStatecharts)'"
	 * @generated
	 */
	EList<FujabaRealtimeStatechartInstance> getAllSubStatecharts();

	/**
	 * Returns the value of the '<em><b>Parent Statechart</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance#getEmbeddedSubStatecharts <em>Embedded Sub Statecharts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Statechart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Statechart</em>' reference.
	 * @see #setParentStatechart(FujabaRealtimeStatechartInstance)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getFujabaRealtimeStatechartInstance_ParentStatechart()
	 * @see de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance#getEmbeddedSubStatecharts
	 * @model opposite="embeddedSubStatecharts" required="true"
	 * @generated
	 */
	FujabaRealtimeStatechartInstance getParentStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance#getParentStatechart <em>Parent Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Statechart</em>' reference.
	 * @see #getParentStatechart()
	 * @generated
	 */
	void setParentStatechart(FujabaRealtimeStatechartInstance value);

} // FujabaRealtimeStatechartInstance
