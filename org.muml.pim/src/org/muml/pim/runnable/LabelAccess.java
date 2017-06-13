/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.runnable;

import org.muml.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Models a LabelAccess, i.e., reading or writing a certain variable or RTSC state.
 * 
 * A label (e.g., variable, RTSC state) can be either read or written during execution. This information is important when deriving a multi-core scheduling in order to respect dependencies between Runnables and to avoid access conflicts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.runnable.LabelAccess#getAccessKind <em>Access Kind</em>}</li>
 *   <li>{@link org.muml.pim.runnable.LabelAccess#getAccessLabel <em>Access Label</em>}</li>
 *   <li>{@link org.muml.pim.runnable.LabelAccess#getAccessingRunnable <em>Accessing Runnable</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.runnable.RunnablePackage#getLabelAccess()
 * @model
 * @generated
 */
public interface LabelAccess extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Access Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pim.runnable.LabelAccessKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Kind</em>' attribute.
	 * @see org.muml.pim.runnable.LabelAccessKind
	 * @see #setAccessKind(LabelAccessKind)
	 * @see org.muml.pim.runnable.RunnablePackage#getLabelAccess_AccessKind()
	 * @model required="true"
	 * @generated
	 */
	LabelAccessKind getAccessKind();

	/**
	 * Sets the value of the '{@link org.muml.pim.runnable.LabelAccess#getAccessKind <em>Access Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Kind</em>' attribute.
	 * @see org.muml.pim.runnable.LabelAccessKind
	 * @see #getAccessKind()
	 * @generated
	 */
	void setAccessKind(LabelAccessKind value);

	/**
	 * Returns the value of the '<em><b>Access Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Label</em>' reference.
	 * @see #setAccessLabel(Label)
	 * @see org.muml.pim.runnable.RunnablePackage#getLabelAccess_AccessLabel()
	 * @model required="true"
	 * @generated
	 */
	Label getAccessLabel();

	/**
	 * Sets the value of the '{@link org.muml.pim.runnable.LabelAccess#getAccessLabel <em>Access Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Label</em>' reference.
	 * @see #getAccessLabel()
	 * @generated
	 */
	void setAccessLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Accessing Runnable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.runnable.Runnable#getLabelAccesses <em>Label Accesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessing Runnable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessing Runnable</em>' reference.
	 * @see #setAccessingRunnable(org.muml.pim.runnable.Runnable)
	 * @see org.muml.pim.runnable.RunnablePackage#getLabelAccess_AccessingRunnable()
	 * @see org.muml.pim.runnable.Runnable#getLabelAccesses
	 * @model opposite="labelAccesses" required="true"
	 * @generated
	 */
	org.muml.pim.runnable.Runnable getAccessingRunnable();

	/**
	 * Sets the value of the '{@link org.muml.pim.runnable.LabelAccess#getAccessingRunnable <em>Accessing Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessing Runnable</em>' reference.
	 * @see #getAccessingRunnable()
	 * @generated
	 */
	void setAccessingRunnable(org.muml.pim.runnable.Runnable value);

} // LabelAccess
