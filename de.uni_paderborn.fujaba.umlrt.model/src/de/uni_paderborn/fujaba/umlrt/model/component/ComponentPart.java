/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.NamedElement;

import de.uni_paderborn.fujaba.umlrt.model.core.Cardinality;

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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getFromRev <em>From Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getToRev <em>To Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getDelegation <em>Delegation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getPortsDerived <em>Ports Derived</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getComponentNameDerived <em>Component Name Derived</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getComponentPart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CardinalityLowerBoundSet TypeNotEqualToParent CardinalityUpperBoundSet'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CardinalityLowerBoundSet='self.cardinality.lowerBound->notEmpty()' TypeNotEqualToParent='self.componentType <> self.parentComponent' CardinalityUpperBoundSet='self.cardinality.upperBound->notEmpty()'"
 * @generated
 */
public interface ComponentPart extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.Component#getReferencingComponentParts <em>Referencing Component Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component type typing this component part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Type</em>' reference.
	 * @see #setComponentType(Component)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getComponentPart_ComponentType()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.Component#getReferencingComponentParts
	 * @model opposite="referencingComponentParts" required="true"
	 * @generated
	 */
	Component getComponentType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(Component value);

	/**
	 * Returns the value of the '<em><b>Parent Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent#getEmbeddedParts <em>Embedded Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structured component type containing this component part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Component</em>' container reference.
	 * @see #setParentComponent(StructuredComponent)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getComponentPart_ParentComponent()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent#getEmbeddedParts
	 * @model opposite="embeddedParts" transient="false"
	 * @generated
	 */
	StructuredComponent getParentComponent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getParentComponent <em>Parent Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Component</em>' container reference.
	 * @see #getParentComponent()
	 * @generated
	 */
	void setParentComponent(StructuredComponent value);

	/**
	 * Returns the value of the '<em><b>From Rev</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.component.Assembly}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.Assembly#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The assemblies originating in port parts of this component part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Rev</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getComponentPart_FromRev()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.Assembly#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Assembly> getFromRev();

	/**
	 * Returns the value of the '<em><b>To Rev</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.component.Assembly}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.Assembly#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The assemblies leading to port parts of this component part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Rev</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getComponentPart_ToRev()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.Assembly#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Assembly> getToRev();

	/**
	 * Returns the value of the '<em><b>Delegation</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.component.Delegation}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.Delegation#getComponentPart <em>Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The delegations connecting a port part of this component part with a port of the parent component type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegation</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getComponentPart_Delegation()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.Delegation#getComponentPart
	 * @model opposite="componentPart"
	 * @generated
	 */
	EList<Delegation> getDelegation();

	/**
	 * Returns the value of the '<em><b>Ports Derived</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.component.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports Derived</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ports of this part. They are derived from the ports of the componentType of this component part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports Derived</em>' containment reference list.
	 * @see #isSetPortsDerived()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getComponentPart_PortsDerived()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if componentType.oclIsUndefined() then\r\n\tOrderedSet { }\r\nelse\r\n\tcomponentType.ports\r\nendif'"
	 * @generated
	 */
	EList<Port> getPortsDerived();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getPortsDerived <em>Ports Derived</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ports Derived</em>' containment reference list is set.
	 * @see #getPortsDerived()
	 * @generated
	 */
	boolean isSetPortsDerived();

	/**
	 * Returns the value of the '<em><b>Component Name Derived</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Name Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of this component part. It is the same as the name of the componentType and derived from there.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Name Derived</em>' attribute.
	 * @see #isSetComponentNameDerived()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getComponentPart_ComponentNameDerived()
	 * @model default="" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if componentType.oclIsUndefined() then\n\tnull\nelse\n\tcomponentType.name\nendif'"
	 * @generated
	 */
	String getComponentNameDerived();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getComponentNameDerived <em>Component Name Derived</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Component Name Derived</em>' attribute is set.
	 * @see #getComponentNameDerived()
	 * @generated
	 */
	boolean isSetComponentNameDerived();

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cardinality of a ComponentPart specifies how many instances of a ComponentPart are allowed to exist at runtime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getComponentPart_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

} // ComponentPart
