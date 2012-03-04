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
 * 
 * Component types are implemented as a variation of the composite design pattern. 
 * Concerning the composite pattern this class represents the role "composite". 
 * However structured components do not contain component types directly like 
 * in the original composite pattern. Instead they contain component parts which 
 * are typed by component types. The reason for this is to get a clear distinction
 *  between the component type level and the component instance level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getEmbeddedParts <em>Embedded Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllStructuredComponentsInHierarchy <em>All Structured Components In Hierarchy</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllAtomicComponentsInHierarchy <em>All Atomic Components In Hierarchy</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getStructuredComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueComponentPartsWithinStructuredComponent StructuredComponentNoHybridPort ValidComponentType NoCyclicComponentPartHierarchy DiscreteStructuredComponentValidParts HybridStructuredComponentValidParts DiscreteStructuredComponentValidPorts HybridStructuredComponentValidPorts'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueComponentPartsWithinStructuredComponent='self.embeddedParts->isUnique(p | p.componentType)' StructuredComponentNoHybridPort='self.ports->forAll(port | not port.oclIsTypeOf(component::HybridPort))' ValidComponentType='self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\nor self.componentType = component::ComponentKind::HYBRID_COMPONENT' NoCyclicComponentPartHierarchy='not self.allStructuredComponentsInHierarchy->includes(self)' DiscreteStructuredComponentValidParts='self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\nimplies\n\t-- collect all atomic components from parent parts and union them\n\t-- with own atomic components\n\tself.allAtomicComponentsInHierarchy->union(\n\t\tself.embeddedParts->select(\n\t\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\n\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\n\t)->forAll(componentType = component::ComponentKind::SOFTWARE_COMPONENT)' HybridStructuredComponentValidParts='self.componentType = component::ComponentKind::HYBRID_COMPONENT\nimplies\n\t-- collect all atomic components from parent parts and union them\n\t-- with own atomic components\n\tself.allAtomicComponentsInHierarchy->union(\n\t\tself.embeddedParts->select(\n\t\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\n\t\t)->collect(componentType.oclAsType(component::AtomicComponent))->asOrderedSet()\n\t)->exists(componentType = component::ComponentKind::CONTINUOUS_COMPONENT)' DiscreteStructuredComponentValidPorts='self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort))\n\t)' HybridStructuredComponentValidPorts='self.componentType = component::ComponentKind::HYBRID_COMPONENT\n\timplies (\n\t\tself.ports->forAll(p | p.oclIsTypeOf(component::DiscretePort) or p.oclIsTypeOf(component::ContinuousPort))\n\t)'"
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
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connectors this structured component contains. These can either be delegations or assemblies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getStructuredComponent_Connectors()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ConnectorType#getParentComponent
	 * @model opposite="parentComponent" containment="true"
	 * @generated
	 */
	EList<ConnectorType> getConnectors();

	/**
	 * Returns the value of the '<em><b>All Structured Components In Hierarchy</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transitive closure of all StructuredComponents which are used (specified
	 * as a componentType for a ComponentPart) in the component hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Structured Components In Hierarchy</em>' containment reference list.
	 * @see #isSetAllStructuredComponentsInHierarchy()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getStructuredComponent_AllStructuredComponentsInHierarchy()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self->closure(\n\tembeddedParts->select(\n\t\tcomponentType.oclIsTypeOf(component::StructuredComponent)\n\t)->collect(componentType.oclAsType(component::StructuredComponent))\n)'"
	 * @generated
	 */
	EList<StructuredComponent> getAllStructuredComponentsInHierarchy();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllStructuredComponentsInHierarchy <em>All Structured Components In Hierarchy</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>All Structured Components In Hierarchy</em>' containment reference list is set.
	 * @see #getAllStructuredComponentsInHierarchy()
	 * @generated
	 */
	boolean isSetAllStructuredComponentsInHierarchy();

	/**
	 * Returns the value of the '<em><b>All Atomic Components In Hierarchy</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.AtomicComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transitive closure of all AtomicComponents which are used (specified
	 * as a componentType for a ComponentPart) in the component hierarchy.
	 * Note: AtomicComponents from directly embeddedParts are NOT included
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Atomic Components In Hierarchy</em>' containment reference list.
	 * @see #isSetAllAtomicComponentsInHierarchy()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getStructuredComponent_AllAtomicComponentsInHierarchy()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.allStructuredComponentsInHierarchy->collect(\n\tembeddedParts->select(\n\t\tcomponentType.oclIsTypeOf(component::AtomicComponent)\n\t)->collect(componentType.oclAsType(component::AtomicComponent))\n)->asOrderedSet()'"
	 * @generated
	 */
	EList<AtomicComponent> getAllAtomicComponentsInHierarchy();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getAllAtomicComponentsInHierarchy <em>All Atomic Components In Hierarchy</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>All Atomic Components In Hierarchy</em>' containment reference list is set.
	 * @see #getAllAtomicComponentsInHierarchy()
	 * @generated
	 */
	boolean isSetAllAtomicComponentsInHierarchy();

} // StructuredComponent
