/**
 */
package org.muml.modelica.transform;

import org.muml.pim.realtimestatechart.Region;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.modelica.transform.RegionInstance#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link org.muml.modelica.transform.RegionInstance#isEmbedsSinglePortStatechart <em>Embeds Single Port Statechart</em>}</li>
 *   <li>{@link org.muml.modelica.transform.RegionInstance#isEmbedsMultiPortStatechart <em>Embeds Multi Port Statechart</em>}</li>
 * </ul>
 *
 * @see org.muml.modelica.transform.TransformPackage#getRegionInstance()
 * @model
 * @generated
 */
public interface RegionInstance extends Region {
	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of</em>' reference.
	 * @see #setInstanceOf(Region)
	 * @see org.muml.modelica.transform.TransformPackage#getRegionInstance_InstanceOf()
	 * @model required="true"
	 * @generated
	 */
	Region getInstanceOf();

	/**
	 * Sets the value of the '{@link org.muml.modelica.transform.RegionInstance#getInstanceOf <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' reference.
	 * @see #getInstanceOf()
	 * @generated
	 */
	void setInstanceOf(Region value);

	/**
	 * Returns the value of the '<em><b>Embeds Single Port Statechart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embeds Single Port Statechart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embeds Single Port Statechart</em>' attribute.
	 * @see #setEmbedsSinglePortStatechart(boolean)
	 * @see org.muml.modelica.transform.TransformPackage#getRegionInstance_EmbedsSinglePortStatechart()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let behavioralElement : behavior::BehavioralElement\n=\n\tinstanceOf.embeddedStatechart.behavioralElement\nin\nnot behavioralElement.oclIsUndefined() and behavioralElement.oclIsKindOf(component::DiscretePort)'"
	 * @generated
	 */
	boolean isEmbedsSinglePortStatechart();

	/**
	 * Sets the value of the '{@link org.muml.modelica.transform.RegionInstance#isEmbedsSinglePortStatechart <em>Embeds Single Port Statechart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embeds Single Port Statechart</em>' attribute.
	 * @see #isEmbedsSinglePortStatechart()
	 * @generated
	 */
	void setEmbedsSinglePortStatechart(boolean value);

	/**
	 * Returns the value of the '<em><b>Embeds Multi Port Statechart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embeds Multi Port Statechart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embeds Multi Port Statechart</em>' attribute.
	 * @see #setEmbedsMultiPortStatechart(boolean)
	 * @see org.muml.modelica.transform.TransformPackage#getRegionInstance_EmbedsMultiPortStatechart()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='instanceOf.embeddedStatechart.behavioralElement.oclIsUndefined()\nand\nlet r : pim::realtimestatechart::Region =\n\tinstanceOf.embeddedStatechart.states->any(true).embeddedRegions->any(embeddedStatechart.behavioralElement.oclIsTypeOf(component::DiscretePort))\nin\nnot r.oclIsUndefined()\nand not r.embeddedStatechart.behavioralElement.oclIsUndefined()\nand r.embeddedStatechart.behavioralElement.oclIsTypeOf(component::DiscretePort)\nand r.embeddedStatechart.behavioralElement.oclAsType(component::DiscretePort).multiPort'"
	 * @generated
	 */
	boolean isEmbedsMultiPortStatechart();

	/**
	 * Sets the value of the '{@link org.muml.modelica.transform.RegionInstance#isEmbedsMultiPortStatechart <em>Embeds Multi Port Statechart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embeds Multi Port Statechart</em>' attribute.
	 * @see #isEmbedsMultiPortStatechart()
	 * @generated
	 */
	void setEmbedsMultiPortStatechart(boolean value);

} // RegionInstance
