/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package structuredcomponenteditor;

import de.uni_paderborn.fujaba.umlrt.model.component.StructuredComponent;

import de.uni_paderborn.fujaba.umlrt.model.modelstructure.Diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Component Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structuredcomponenteditor.StructuredComponentDiagram#getStructuredComponent <em>Structured Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see structuredcomponenteditor.ComponenteditorPackage#getStructuredComponentDiagram()
 * @model
 * @generated
 */
public interface StructuredComponentDiagram extends Diagram {
	/**
	 * Returns the value of the '<em><b>Structured Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Component</em>' containment reference.
	 * @see #setStructuredComponent(StructuredComponent)
	 * @see structuredcomponenteditor.ComponenteditorPackage#getStructuredComponentDiagram_StructuredComponent()
	 * @model containment="true"
	 * @generated
	 */
	StructuredComponent getStructuredComponent();

	/**
	 * Sets the value of the '{@link structuredcomponenteditor.StructuredComponentDiagram#getStructuredComponent <em>Structured Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Component</em>' containment reference.
	 * @see #getStructuredComponent()
	 * @generated
	 */
	void setStructuredComponent(StructuredComponent value);

} // StructuredComponentDiagram
