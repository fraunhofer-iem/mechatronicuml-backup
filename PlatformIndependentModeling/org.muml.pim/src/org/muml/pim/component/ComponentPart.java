/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;
import org.muml.pim.types.DataType;
import org.muml.pim.valuetype.Cardinality;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.component.ComponentPart#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.muml.pim.component.ComponentPart#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link org.muml.pim.component.ComponentPart#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.muml.pim.component.ComponentPart#getPortParts <em>Port Parts</em>}</li>
 *   <li>{@link org.muml.pim.component.ComponentPart#isMultiPart <em>Multi Part</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.component.ComponentPackage#getComponentPart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CardinalityLowerBoundSet TypeNotEqualToParent CardinalityUpperBoundSet'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CardinalityLowerBoundSet='-- Lower bound of cardinality must be set\r\nif self.cardinality.lowerBound.oclIsUndefined() then\r\nfalse\r\nelse\r\nself.cardinality.lowerBound->notEmpty()\r\nendif' TypeNotEqualToParent='-- Component Part must have the same type as its parent structured component\nself.componentType <> self.parentComponent' CardinalityUpperBoundSet='-- Upper bound of cardinality must be set\r\nif self.cardinality.upperBound.oclIsUndefined() then\r\nfalse\r\nelse\r\nself.cardinality.upperBound->notEmpty()\r\nendif'"
 * @generated
 */
public interface ComponentPart extends NamedElement, CommentableElement, DataType {
	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component type typing this component part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Type</em>' reference.
	 * @see #setComponentType(Component)
	 * @see org.muml.pim.component.ComponentPackage#getComponentPart_ComponentType()
	 * @model required="true"
	 * @generated
	 */
	Component getComponentType();

	/**
	 * Sets the value of the '{@link org.muml.pim.component.ComponentPart#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(Component value);

	/**
	 * Returns the value of the '<em><b>Parent Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.component.StructuredComponent#getEmbeddedComponentParts <em>Embedded Component Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structured component type containing this component part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Component</em>' container reference.
	 * @see #setParentComponent(StructuredComponent)
	 * @see org.muml.pim.component.ComponentPackage#getComponentPart_ParentComponent()
	 * @see org.muml.pim.component.StructuredComponent#getEmbeddedComponentParts
	 * @model opposite="embeddedComponentParts" required="true" transient="false"
	 * @generated
	 */
	StructuredComponent getParentComponent();

	/**
	 * Sets the value of the '{@link org.muml.pim.component.ComponentPart#getParentComponent <em>Parent Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Component</em>' container reference.
	 * @see #getParentComponent()
	 * @generated
	 */
	void setParentComponent(StructuredComponent value);

	/**
	 * Returns the value of the '<em><b>Multi Part</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the part is a multi part.
	 * It is only used to simplify OCL constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Part</em>' attribute.
	 * @see #isSetMultiPart()
	 * @see org.muml.pim.component.ComponentPackage#getComponentPart_MultiPart()
	 * @model default="false" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (not self.cardinality.oclIsUndefined() and not self.cardinality.upperBound.oclIsUndefined()) then\nself.cardinality.upperBound.value > 1 or self.cardinality.upperBound.infinity\nelse false\nendif'"
	 * @generated
	 */
	boolean isMultiPart();

	/**
	 * Returns whether the value of the '{@link org.muml.pim.component.ComponentPart#isMultiPart <em>Multi Part</em>}' attribute is set.
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
	 * @see #setCardinality(Cardinality)
	 * @see org.muml.pim.component.ComponentPackage#getComponentPart_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.muml.pim.component.ComponentPart#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Port Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.component.PortPart}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.component.PortPart#getComponentPart <em>Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ports of this part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Parts</em>' containment reference list.
	 * @see #isSetPortParts()
	 * @see #unsetPortParts()
	 * @see org.muml.pim.component.ComponentPackage#getComponentPart_PortParts()
	 * @see org.muml.pim.component.PortPart#getComponentPart
	 * @model opposite="componentPart" containment="true" unsettable="true"
	 * @generated
	 */
	EList<PortPart> getPortParts();

	/**
	 * Unsets the value of the '{@link org.muml.pim.component.ComponentPart#getPortParts <em>Port Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPortParts()
	 * @see #getPortParts()
	 * @generated
	 */
	void unsetPortParts();

	/**
	 * Returns whether the value of the '{@link org.muml.pim.component.ComponentPart#getPortParts <em>Port Parts</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Port Parts</em>' containment reference list is set.
	 * @see #unsetPortParts()
	 * @see #getPortParts()
	 * @generated
	 */
	boolean isSetPortParts();

} // ComponentPart
