/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component;

import org.muml.pim.behavior.BehavioralElement;
import org.muml.pim.constraint.VerifiableElement;

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
 * @see org.muml.pim.component.ComponentPackage#getAtomicComponent()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SoftwareComponentRequiresBehavior='-- Software component must have a behavior\nself.componentKind = component::ComponentKind::SOFTWARE_COMPONENT implies (not self.behavior.oclIsUndefined())' ValidComponentType='-- Atomic component must be of type SOFTWARE or CONTINUOUS.\nself.componentKind = component::ComponentKind::SOFTWARE_COMPONENT\nor self.componentKind = component::ComponentKind::CONTINUOUS_COMPONENT' SoftwareComponentValidPorts='-- Software component must only have hybrid ports or discrete ports\nself.componentKind = component::ComponentKind::SOFTWARE_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsKindOf(connector::DiscreteInteractionEndpoint) or p.oclIsKindOf(component::HybridPort))\n\t)' ContinuousComponentValidPorts='-- Continuous Component must only have continuous ports.\nself.componentKind = component::ComponentKind::CONTINUOUS_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsKindOf(component::ContinuousPort))\n\t)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SoftwareComponentRequiresBehavior ValidComponentType SoftwareComponentValidPorts ContinuousComponentValidPorts'"
 * @generated
 */
public interface AtomicComponent extends Component, BehavioralElement, VerifiableElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Redefinition of the Java toString method.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"Atomic_Component_\" + getName();'"
	 * @generated
	 */
	String toString();
} // AtomicComponent
