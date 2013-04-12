/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a structured component which is capable of including arbitraryly many component parts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.StructuredComponent#getEmbeddedComponentParts <em>Embedded Component Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.StructuredComponent#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.StructuredComponent#getAllStructuredComponents <em>All Structured Components</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.StructuredComponent#getAllAtomicComponents <em>All Atomic Components</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.StructuredComponent#getCoordinationProtocolOccurences <em>Coordination Protocol Occurences</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getStructuredComponent()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StructuredComponentAllowsNoHybridPorts ValidComponentType NoCyclicComponentPartHierarchy DiscreteStructuredComponentValidParts HybridStructuredComponentValidParts DiscreteStructuredComponentValidPorts HybridStructuredComponentValidPorts ComponentPartsHaveUniqueName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL StructuredComponentAllowsNoHybridPorts='-- A structured component allows no hybrid ports.\r\nself.ports->forAll(port | not port.oclIsTypeOf(component::HybridPort))' ValidComponentType='self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\nor self.componentType = component::ComponentKind::HYBRID_COMPONENT' NoCyclicComponentPartHierarchy='if self.allStructuredComponents->oclIsUndefined() then\r\nfalse\r\nelse\r\nnot self.allStructuredComponents->includes(self)\r\nendif' DiscreteStructuredComponentValidParts='if (not self.allAtomicComponents->oclIsUndefined()) then\r\nself.componentType = component::ComponentKind::SOFTWARE_COMPONENT\r\nimplies\r\n\t-- collect all atomic components from parent parts and union them\r\n\t-- with own atomic components\r\n\tself.allAtomicComponents->union(\r\n\t\tself.embeddedComponentParts->select(\r\n\t\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\r\n\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\r\n\t)->forAll(componentType = component::ComponentKind::SOFTWARE_COMPONENT)\r\nelse\r\ntrue\r\nendif' HybridStructuredComponentValidParts='if (self.allAtomicComponents->oclIsUndefined()) then \r\ntrue\r\nelse\r\nself.componentType = component::ComponentKind::HYBRID_COMPONENT\r\nimplies\r\n\t-- collect all atomic components from parent parts and union them\r\n\t-- with own atomic components\r\n\tself.allAtomicComponents->union(\r\n\t\tself.embeddedComponentParts->select(\r\n\t\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\r\n\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\r\n\t)->exists(componentType = component::ComponentKind::CONTINUOUS_COMPONENT)\r\nendif' DiscreteStructuredComponentValidPorts='-- A structured software component may only have discrete ports\r\nself.componentType = component::ComponentKind::SOFTWARE_COMPONENT\r\n\timplies (\r\n\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort))\r\n\t)' HybridStructuredComponentValidPorts='self.componentType = component::ComponentKind::HYBRID_COMPONENT\r\n\timplies (\r\n\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort) or p.oclIsTypeOf(component::ContinuousPort))\r\n\t)' ComponentPartsHaveUniqueName='self.embeddedComponentParts -> isUnique(name)'"
 * @generated
 */
public interface StructuredComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Embedded Component Parts</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.component.ComponentPart}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.component.ComponentPart#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component parts this structured component contains.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Component Parts</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getStructuredComponent_EmbeddedComponentParts()
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPart#getParentComponent
	 * @model opposite="parentComponent" containment="true" required="true"
	 * @generated
	 */
	EList<ComponentPart> getEmbeddedComponentParts();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.component.PortConnector}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.component.PortConnector#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connectors this structured component contains. These can either be delegations or assemblies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getStructuredComponent_Connectors()
	 * @see de.uni_paderborn.fujaba.muml.component.PortConnector#getParentComponent
	 * @model opposite="parentComponent" containment="true"
	 * @generated
	 */
	EList<PortConnector> getConnectors();

	/**
	 * Returns the value of the '<em><b>All Structured Components</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.component.StructuredComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transitive closure of all StructuredComponents which are used (specified
	 * as a componentType for a ComponentPart) in the component hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Structured Components</em>' containment reference list.
	 * @see #isSetAllStructuredComponents()
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getStructuredComponent_AllStructuredComponents()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self->closure(\r\n\tembeddedComponentParts->select(\r\n\t\tcomponentType.oclIsTypeOf(StructuredComponent)\r\n\t).componentType.oclAsType(StructuredComponent)\r\n)'"
	 * @generated
	 */
	EList<StructuredComponent> getAllStructuredComponents();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.muml.component.StructuredComponent#getAllStructuredComponents <em>All Structured Components</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>All Structured Components</em>' containment reference list is set.
	 * @see #getAllStructuredComponents()
	 * @generated
	 */
	boolean isSetAllStructuredComponents();

	/**
	 * Returns the value of the '<em><b>All Atomic Components</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.component.AtomicComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transitive closure of all AtomicComponents which are used (specified
	 * as a componentType for a ComponentPart) in the component hierarchy.
	 * Note: AtomicComponents from directly embeddedParts are NOT included
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Atomic Components</em>' containment reference list.
	 * @see #isSetAllAtomicComponents()
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getStructuredComponent_AllAtomicComponents()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.allStructuredComponents->collect(\r\n\tembeddedComponentParts->select(\r\n\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\r\n\t)->collect(componentType.oclAsType(component::AtomicComponent))\r\n)->asOrderedSet()'"
	 * @generated
	 */
	EList<AtomicComponent> getAllAtomicComponents();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.muml.component.StructuredComponent#getAllAtomicComponents <em>All Atomic Components</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>All Atomic Components</em>' containment reference list is set.
	 * @see #getAllAtomicComponents()
	 * @generated
	 */
	boolean isSetAllAtomicComponents();

	/**
	 * Returns the value of the '<em><b>Coordination Protocol Occurences</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.component.CoordinationProtocolOccurrence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference is needed by GMF to visualize the CoordinationProtocols within the StructuredComponent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol Occurences</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getStructuredComponent_CoordinationProtocolOccurences()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoordinationProtocolOccurrence> getCoordinationProtocolOccurences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"Structured_Component_\" + getName();'"
	 * @generated
	 */
	String toString();

} // StructuredComponent
