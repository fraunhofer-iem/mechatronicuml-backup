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
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getStructuredComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueComponentPartsWithinStructuredComponent StructuredComponentNoHybridPort NoCyclicComponentPartHierarchy'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueComponentPartsWithinStructuredComponent='self.embeddedParts->isUnique(p | p.componentType)' StructuredComponentNoHybridPort='self.ports->forAll(port | not port.oclIsTypeOf(component::HybridPort))' ValidComponentType='self.componentType = component::ComponentKind::SOFTWARE_COMPONENT\nor self.componentType = component::ComponentKind::HYBRID_COMPONENT' NoCyclicComponentPartHierarchy='not self->closure(\n\tembeddedParts->collect(\n\t\tif componentType.oclIsTypeOf(component::StructuredComponent) then\n\t\t\tcomponentType.oclAsType(component::StructuredComponent)\n\t\telse\n\t\t\tnull\n\t\tendif\n\t)->select(not oclIsUndefined())\n)->includes(self)'"
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

} // StructuredComponent
