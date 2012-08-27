/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;


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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance#getEmbeddedCIC <em>Embedded CIC</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getStructuredComponentInstance()
 * @model
 * @generated
 */
public interface StructuredComponentInstance extends ComponentInstance {
	/**
	 * Returns the value of the '<em><b>Embedded CIC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component instances and connector instances that are embedded in this component instance
	 * are contained by the component instance configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded CIC</em>' containment reference.
	 * @see #setEmbeddedCIC(ComponentInstanceConfiguration)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getStructuredComponentInstance_EmbeddedCIC()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentInstanceConfiguration getEmbeddedCIC();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance#getEmbeddedCIC <em>Embedded CIC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded CIC</em>' containment reference.
	 * @see #getEmbeddedCIC()
	 * @generated
	 */
	void setEmbeddedCIC(ComponentInstanceConfiguration value);

} // StructuredComponentInstance
