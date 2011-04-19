/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fujaba Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is a concrete statechart implementation of a real-time statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FujabaRealtimeStatechart#getEmbeddingRegion <em>Embedding Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFujabaRealtimeStatechart()
 * @model
 * @generated
 */
public interface FujabaRealtimeStatechart extends AbstractStatechart {

	/**
	 * Returns the value of the '<em><b>Embedding Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region#getStatechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedding Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedding Region</em>' reference.
	 * @see #setEmbeddingRegion(Region)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getFujabaRealtimeStatechart_EmbeddingRegion()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region#getStatechart
	 * @model opposite="statechart"
	 * @generated
	 */
	Region getEmbeddingRegion();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FujabaRealtimeStatechart#getEmbeddingRegion <em>Embedding Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedding Region</em>' reference.
	 * @see #getEmbeddingRegion()
	 * @generated
	 */
	void setEmbeddingRegion(Region value);
} // FujabaRealtimeStatechart
