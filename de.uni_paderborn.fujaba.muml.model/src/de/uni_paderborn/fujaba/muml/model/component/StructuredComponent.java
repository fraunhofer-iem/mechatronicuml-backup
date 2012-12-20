/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getEmbeddedParts <em>Embedded Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllStructuredComponents <em>All Structured Components</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllAtomicComponents <em>All Atomic Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getStructuredComponent()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StructuredComponentNoHybridPort ValidComponentType NoCyclicComponentPartHierarchy DiscreteStructuredComponentValidParts HybridStructuredComponentValidParts DiscreteStructuredComponentValidPorts HybridStructuredComponentValidPorts ComponentPartsHaveUniqueName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL StructuredComponentNoHybridPort='self.ports->forAll(port | not port.oclIsTypeOf(component::HybridPort))' ValidComponentType='self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\nor self.componentType = component::ComponentKind::HYBRID_COMPONENT' NoCyclicComponentPartHierarchy='not self.allStructuredComponents->includes(self)' DiscreteStructuredComponentValidParts='self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\nimplies\n\t-- collect all atomic components from parent parts and union them\n\t-- with own atomic components\n\tself.allAtomicComponents->union(\n\t\tself.embeddedParts->select(\n\t\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\n\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\n\t)->forAll(componentType = component::ComponentKind::SOFTWARE_COMPONENT)' HybridStructuredComponentValidParts='self.componentType = component::ComponentKind::HYBRID_COMPONENT\nimplies\n\t-- collect all atomic components from parent parts and union them\n\t-- with own atomic components\n\tself.allAtomicComponents->union(\n\t\tself.embeddedParts->select(\n\t\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\n\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\n\t)->exists(componentType = component::ComponentKind::CONTINUOUS_COMPONENT)' DiscreteStructuredComponentValidPorts='self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort))\n\t)' HybridStructuredComponentValidPorts='self.componentType = component::ComponentKind::HYBRID_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort) or p.oclIsTypeOf(component::ContinuousPort))\n\t)' ComponentPartsHaveUniqueName='self.embeddedParts -> isUnique(name)'"
 * @generated
 */
public interface StructuredComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Embedded Parts</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component parts this structured component contains.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Parts</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getStructuredComponent_EmbeddedParts()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getParentComponent
	 * @model opposite="parentComponent" containment="true" required="true"
	 * @generated
	 */
	EList<ComponentPart> getEmbeddedParts();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.PortConnector}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.PortConnector#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connectors this structured component contains. These can either be delegations or assemblies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getStructuredComponent_Connectors()
	 * @see de.uni_paderborn.fujaba.muml.model.component.PortConnector#getParentComponent
	 * @model opposite="parentComponent" containment="true"
	 * @generated
	 */
	EList<PortConnector> getConnectors();

	/**
	 * Returns the value of the '<em><b>All Structured Components</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transitive closure of all StructuredComponents which are used (specified
	 * as a componentType for a ComponentPart) in the component hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Structured Components</em>' containment reference list.
	 * @see #isSetAllStructuredComponents()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getStructuredComponent_AllStructuredComponents()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self->closure(\n\tembeddedParts->select(\n\t\tcomponentType.oclIsTypeOf(component::StructuredComponent)\n\t)->collect(componentType.oclAsType(component::StructuredComponent))\n)'"
	 * @generated
	 */
	EList<StructuredComponent> getAllStructuredComponents();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllStructuredComponents <em>All Structured Components</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>All Structured Components</em>' containment reference list is set.
	 * @see #getAllStructuredComponents()
	 * @generated
	 */
	boolean isSetAllStructuredComponents();

	/**
	 * Returns the value of the '<em><b>All Atomic Components</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.AtomicComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transitive closure of all AtomicComponents which are used (specified
	 * as a componentType for a ComponentPart) in the component hierarchy.
	 * Note: AtomicComponents from directly embeddedParts are NOT included
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Atomic Components</em>' containment reference list.
	 * @see #isSetAllAtomicComponents()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getStructuredComponent_AllAtomicComponents()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.allStructuredComponents->collect(\n\tembeddedParts->select(\n\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\n\t)->collect(componentType.oclAsType(component::AtomicComponent))\n)->asOrderedSet()'"
	 * @generated
	 */
	EList<AtomicComponent> getAllAtomicComponents();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllAtomicComponents <em>All Atomic Components</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>All Atomic Components</em>' containment reference list is set.
	 * @see #getAllAtomicComponents()
	 * @generated
	 */
	boolean isSetAllAtomicComponents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"Structured_Component_\" + getName();'"
	 * @generated
	 */
	String toString();

} // StructuredComponent
