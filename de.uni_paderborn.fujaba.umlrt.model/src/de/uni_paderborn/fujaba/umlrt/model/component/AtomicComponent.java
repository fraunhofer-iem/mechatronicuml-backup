/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component;

import de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an atomic component. Atomic components must not be further sub-divided into component parts. In contrast to structured components atomic components own a behavior in form of a realtime statechart.
 * 
 * The different component types are implemented as a variation of the composite design pattern. Concerning the composite pattern this class represents the role "leaf".
 * <!-- end-model-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getAtomicComponent()
 * @model
 * @generated
 */
public interface AtomicComponent extends Component, BehavioralElement {
} // AtomicComponent
