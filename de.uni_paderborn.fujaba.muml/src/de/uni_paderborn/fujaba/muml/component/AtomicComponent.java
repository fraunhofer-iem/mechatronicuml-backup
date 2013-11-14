/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;

import de.uni_paderborn.fujaba.muml.behavior.BehavioralElement;

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
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getAtomicComponent()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SoftwareComponentRequiresBehavior='self.componentKind = component::ComponentKind::SOFTWARE_COMPONENT implies (not self.behavior.oclIsUndefined())' ValidComponentType='self.componentKind = component::ComponentKind::SOFTWARE_COMPONENT\nor self.componentKind = component::ComponentKind::CONTINUOUS_COMPONENT' SoftwareComponentValidPorts='self.componentKind = component::ComponentKind::SOFTWARE_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort) or p.oclIsTypeOf(component::HybridPort))\n\t)' ContinuousComponentValidPorts='self.componentKind = component::ComponentKind::CONTINUOUS_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsTypeOf(component::ContinuousPort))\n\t)' AtomicComponentsNamesMustBeUnique='AtomicComponent.allInstances().name->count(self.name) = 1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SoftwareComponentRequiresBehavior ValidComponentType SoftwareComponentValidPorts ContinuousComponentValidPorts AtomicComponentsNamesMustBeUnique'"
 * @generated
 */
public interface AtomicComponent extends Component, BehavioralElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"Atomic_Component_\" + getName();'"
	 * @generated
	 */
	String toString();
} // AtomicComponent
