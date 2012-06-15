/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reconfiguration controllers encapsulate the reconfiguration behavior of a reconfigurable structured component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController#getStructuredComponent <em>Structured Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getReconfigurationController()
 * @model abstract="true"
 * @generated
 */
public interface ReconfigurationController extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Structured Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Component</em>' container reference.
	 * @see #setStructuredComponent(ReconfigurableStructuredComponent)
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getReconfigurationController_StructuredComponent()
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent#getControllers
	 * @model opposite="controllers" required="true" transient="false"
	 * @generated
	 */
	ReconfigurableStructuredComponent getStructuredComponent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController#getStructuredComponent <em>Structured Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Component</em>' container reference.
	 * @see #getStructuredComponent()
	 * @generated
	 */
	void setStructuredComponent(ReconfigurableStructuredComponent value);

} // ReconfigurationController
