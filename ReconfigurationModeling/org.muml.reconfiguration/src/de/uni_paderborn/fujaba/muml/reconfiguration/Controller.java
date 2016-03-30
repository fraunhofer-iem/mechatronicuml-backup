/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;
import org.muml.pim.behavior.BehavioralElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Controllers add additional behavior to a reconfigurable component. 
 * Since the behavior of the structured component is, in principle, defined by 
 * the execution of its embedded components, it has no own behavior 
 * specification. We use Controllers to add behavior that may access the 
 * embedded components of a structured components and use them, e.g., 
 * for specifying reconfiguration behavior.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Controller#getStructuredComponent <em>Structured Component</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getController()
 * @model abstract="true"
 * @generated
 */
public interface Controller extends NamedElement, BehavioralElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Structured Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structured component containing this controller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structured Component</em>' container reference.
	 * @see #setStructuredComponent(ReconfigurableStructuredComponent)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getController_StructuredComponent()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent#getController
	 * @model opposite="controller" required="true" transient="false"
	 * @generated
	 */
	ReconfigurableStructuredComponent getStructuredComponent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Controller#getStructuredComponent <em>Structured Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Component</em>' container reference.
	 * @see #getStructuredComponent()
	 * @generated
	 */
	void setStructuredComponent(ReconfigurableStructuredComponent value);

} // Controller
