/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.instance;

import de.uni_paderborn.fujaba.umlrt.model.component.Port;

import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance#getPortType <em>Port Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getPortInstance()
 * @model
 * @generated
 */
public interface PortInstance extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' reference.
	 * @see #setPortType(Port)
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getPortInstance_PortType()
	 * @model required="true"
	 * @generated
	 */
	Port getPortType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance#getPortType <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' reference.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(Port value);

} // PortInstance
