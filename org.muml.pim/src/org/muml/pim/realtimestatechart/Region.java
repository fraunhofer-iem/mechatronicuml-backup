/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;

import org.muml.core.CommentableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Regions enables hierarchy and parallelism. Each state can have zero, one or more regions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.Region#getEmbeddedStatechart <em>Embedded Statechart</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Region#getParentState <em>Parent State</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Region#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Embedded Statechart</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.realtimestatechart.RealtimeStatechart#getParentRegion <em>Parent Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realtime statechart this region embeds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Statechart</em>' containment reference.
	 * @see #setEmbeddedStatechart(RealtimeStatechart)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getRegion_EmbeddedStatechart()
	 * @see org.muml.pim.realtimestatechart.RealtimeStatechart#getParentRegion
	 * @model opposite="parentRegion" containment="true" required="true"
	 * @generated
	 */
	RealtimeStatechart getEmbeddedStatechart();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Region#getEmbeddedStatechart <em>Embedded Statechart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded Statechart</em>' containment reference.
	 * @see #getEmbeddedStatechart()
	 * @generated
	 */
	void setEmbeddedStatechart(RealtimeStatechart value);

	/**
	 * Returns the value of the '<em><b>Parent State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.realtimestatechart.State#getEmbeddedRegions <em>Embedded Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state this region is embedded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent State</em>' container reference.
	 * @see #setParentState(State)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getRegion_ParentState()
	 * @see org.muml.pim.realtimestatechart.State#getEmbeddedRegions
	 * @model opposite="embeddedRegions" required="true" transient="false"
	 * @generated
	 */
	State getParentState();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Region#getParentState <em>Parent State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent State</em>' container reference.
	 * @see #getParentState()
	 * @generated
	 */
	void setParentState(State value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of a region is derived by its conaining Real-Time Statechart
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getRegion_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.embeddedStatechart.oclIsUndefined() then\r\n\tself.embeddedStatechart.oclAsType(realtimestatechart::RealtimeStatechart).name\r\nelse\r\n\tnull\r\nendif'"
	 * @generated
	 */
	String getName();

} // Region
