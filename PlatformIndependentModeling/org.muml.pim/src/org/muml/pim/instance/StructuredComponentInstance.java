/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured component instance is a component instance that has been derived from a structured component type. A structured component instance specifies an embedded component instance configuration defining its inner structure. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.instance.StructuredComponentInstance#getEmbeddedCIC <em>Embedded CIC</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.instance.InstancePackage#getStructuredComponentInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NumberOfembeddedComponentInstancesCorrespondsToLowerBound=' -- Not all ComponentParts with a lowerBound > 0 are initialized\nlet componentParts : Set(component::ComponentPart) = if (not self.componentType.oclIsUndefined() and self.componentType.oclIsKindOf(component::StructuredComponent)) then self.componentType.oclAsType(component::StructuredComponent).embeddedComponentParts else OrderedSet{} endif in\n let componentInstances : Set(ComponentInstance) = if (not self.embeddedCIC.oclIsUndefined())  then self.embeddedCIC.componentInstances else OrderedSet{} endif in\ncomponentParts->forAll(part| if (not part.cardinality.lowerBound.infinity) then componentInstances->select(ci | ci.componentPart = part)->size()>=part.cardinality.lowerBound.value else true endif)\n-- adann' NumberOfembeddedComponentInstancesCorrespondsToUpperBound=' -- The number of initialized ComponentInstances does not corresponds to the specified upperBound\nlet componentParts : Set(component::ComponentPart) = if (not self.componentType.oclIsUndefined() and self.componentType.oclIsKindOf(component::StructuredComponent)) then self.componentType.oclAsType(component::StructuredComponent).embeddedComponentParts else OrderedSet{} endif in\nlet componentInstances : Set(ComponentInstance) = if (not self.embeddedCIC.oclIsUndefined())  then self.embeddedCIC.componentInstances else OrderedSet{} endif in\ncomponentParts->forAll(part| if (not part.cardinality.upperBound.infinity) then componentInstances->select(ci | ci.componentPart = part)->size()<=part.cardinality.upperBound.value else true endif)\n-- adann ticket:937'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NumberOfembeddedComponentInstancesCorrespondsToLowerBound NumberOfembeddedComponentInstancesCorrespondsToUpperBound'"
 * @generated
 */
public interface StructuredComponentInstance extends ComponentInstance {
	/**
	 * Returns the value of the '<em><b>Embedded CIC</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.instance.ComponentInstanceConfiguration#getParentStructuredComponentInstance <em>Parent Structured Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component instances and connector instances that are embedded in this component instance
	 * are contained by the component instance configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded CIC</em>' containment reference.
	 * @see #setEmbeddedCIC(ComponentInstanceConfiguration)
	 * @see org.muml.pim.instance.InstancePackage#getStructuredComponentInstance_EmbeddedCIC()
	 * @see org.muml.pim.instance.ComponentInstanceConfiguration#getParentStructuredComponentInstance
	 * @model opposite="parentStructuredComponentInstance" containment="true" required="true"
	 * @generated
	 */
	ComponentInstanceConfiguration getEmbeddedCIC();

	/**
	 * Sets the value of the '{@link org.muml.pim.instance.StructuredComponentInstance#getEmbeddedCIC <em>Embedded CIC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded CIC</em>' containment reference.
	 * @see #getEmbeddedCIC()
	 * @generated
	 */
	void setEmbeddedCIC(ComponentInstanceConfiguration value);

} // StructuredComponentInstance
