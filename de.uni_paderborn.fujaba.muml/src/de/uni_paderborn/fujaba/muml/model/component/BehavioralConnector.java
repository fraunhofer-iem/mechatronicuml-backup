/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import de.uni_paderborn.fujaba.muml.model.behavior.BehavioralElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for all connectors that have an associated behavior. The 
 * behavior is specified as a real-time statechart.
 * 
 * \todosd{Do we really need this class? Do we really want to specify the behavior with a RTSC?}
 * <!-- end-model-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getBehavioralConnector()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralConnector extends ConnectorType, BehavioralElement {

} // BehavioralConnector
