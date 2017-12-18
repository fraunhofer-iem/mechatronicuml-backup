/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Structured Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A static structured component is a structured component whose internal structure consisting of component part, ports, delegation, and assemblies cannot be changed during run-time.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pim.component.ComponentPackage#getStaticStructuredComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StaticStructuredComponentMustNotHaveWrongDiscreteInteractionEndpoints'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL StaticStructuredComponentMustNotHaveWrongDiscreteInteractionEndpoints='-- Static Structured Component must not have Discrete Interaction Endpoints other than Discrete Ports\nports-&gt;forAll(p | p.oclIsKindOf(connector::DiscreteInteractionEndpoint) implies p.oclIsKindOf(DiscretePort))'"
 * @generated
 */
public interface StaticStructuredComponent extends StructuredComponent, StaticComponent {
} // StaticStructuredComponent
