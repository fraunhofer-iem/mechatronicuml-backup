/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.model.types.DataType;
import de.uni_paderborn.fujaba.muml.model.valuetype.Range;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a component part. Component parts are used to specify
 * the inner structure of a structured component. A component part represents
 * another component that is embedded in a  structured 
 * component. It is specified on the model level and is 
 * always typed over a component (either structured or atomic).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getAssemblyConnectors <em>Assembly Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getDelegationConnectors <em>Delegation Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#isMultiPart <em>Multi Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponentPart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CardinalityLowerBoundSet TypeNotEqualToParent CardinalityUpperBoundSet'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CardinalityLowerBoundSet='self.cardinality.lowerBound->notEmpty()' TypeNotEqualToParent='self.componentType <> self.parentComponent' CardinalityUpperBoundSet='self.cardinality.upperBound->notEmpty()'"
 * @generated
 */
public interface ComponentPart extends NamedElement, CommentableElement, DataType {
	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.Component#getReferencingComponentParts <em>Referencing Component Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component type typing this component part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Type</em>' reference.
	 * @see #setComponentType(Component)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponentPart_ComponentType()
	 * @see de.uni_paderborn.fujaba.muml.model.component.Component#getReferencingComponentParts
	 * @model opposite="referencingComponentParts" required="true"
	 * @generated
	 */
	Component getComponentType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(Component value);

	/**
	 * Returns the value of the '<em><b>Parent Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getEmbeddedParts <em>Embedded Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structured component type containing this component part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Component</em>' container reference.
	 * @see #setParentComponent(StructuredComponent)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponentPart_ParentComponent()
	 * @see de.uni_paderborn.fujaba.muml.model.component.StructuredComponent#getEmbeddedParts
	 * @model opposite="embeddedParts" required="true" transient="false"
	 * @generated
	 */
	StructuredComponent getParentComponent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getParentComponent <em>Parent Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Component</em>' container reference.
	 * @see #getParentComponent()
	 * @generated
	 */
	void setParentComponent(StructuredComponent value);

	/**
	 * Returns the value of the '<em><b>Assembly Connectors</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The assemblies originating in port parts of this component part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assembly Connectors</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponentPart_AssemblyConnectors()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.ports.portConnectors->select(c | c.oclIsKindOf(AssemblyConnector)).oclAsType(AssemblyConnector)->asOrderedSet()'"
	 * @generated
	 */
	EList<AssemblyConnector> getAssemblyConnectors();

	/**
	 * Returns the value of the '<em><b>Delegation Connectors</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.DelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The delegations connecting a port part of this component part with a port of the parent component type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegation Connectors</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponentPart_DelegationConnectors()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.ports.portConnectors->select(c | c.oclIsKindOf(DelegationConnector)).oclAsType(DelegationConnector)->asOrderedSet()'"
	 * @generated
	 */
	EList<DelegationConnector> getDelegationConnectors();

	/**
	 * Returns the value of the '<em><b>Multi Part</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the part is a multi part.
	 * It is only used to simplify OCL constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Part</em>' attribute.
	 * @see #isSetMultiPart()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponentPart_MultiPart()
	 * @model default="" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.cardinality.upperBound.value > 1 or self.cardinality.upperBound.infinity'"
	 * @generated
	 */
	boolean isMultiPart();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#isMultiPart <em>Multi Part</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multi Part</em>' attribute is set.
	 * @see #isMultiPart()
	 * @generated
	 */
	boolean isSetMultiPart();

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cardinality of a ComponentPart specifies how many instances of a ComponentPart are allowed to exist at runtime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Range)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponentPart_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Range getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Range value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ports of this part. They are derived from the ports of the
	 * componentType of this component part. It is a containment
	 * reference, so that GMF is able to let them flow around the
	 * component.
	 * Because this feature is derived, transient, volatile the model file
	 * will not store the ports in this feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see #isSetPorts()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponentPart_Ports()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if componentType.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tcomponentType.ports\r\nendif'"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getPorts <em>Ports</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ports</em>' containment reference list is set.
	 * @see #getPorts()
	 * @generated
	 */
	boolean isSetPorts();

} // ComponentPart
