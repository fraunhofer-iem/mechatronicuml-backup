/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance#getStoredMessages <em>Stored Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRuntimeAssemblyInstance()
 * @model abstract="true"
 * @generated
 */
public interface RuntimeAssemblyInstance extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Stored Messages</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly#getRuntimeAssembly <em>Runtime Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stored Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stored Messages</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage#getRuntimeAssemblyInstance_StoredMessages()
	 * @see de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly#getRuntimeAssembly
	 * @model opposite="runtimeAssembly" containment="true"
	 * @generated
	 */
	EList<MessageOnAssembly> getStoredMessages();

} // RuntimeAssemblyInstance
