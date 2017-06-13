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

import org.eclipse.emf.common.util.EList;
import org.muml.core.NamedElement;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runnable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Runnable represents executable (i.e., schedulable) code in a time-triggered system.
 * 
 * For example, this is used when deriving a scheduling for a multi-core target platform.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.runnable.Runnable#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link org.muml.pim.runnable.Runnable#getPortInstance <em>Port Instance</em>}</li>
 *   <li>{@link org.muml.pim.runnable.Runnable#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.muml.pim.runnable.Runnable#getLabelAccesses <em>Label Accesses</em>}</li>
 *   <li>{@link org.muml.pim.runnable.Runnable#getDeadline <em>Deadline</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.runnable.RunnablePackage#getRunnable()
 * @model
 * @generated
 */
public interface Runnable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.instance.ComponentInstance#getRunnables <em>Runnables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance</em>' reference.
	 * @see #setComponentInstance(ComponentInstance)
	 * @see org.muml.pim.runnable.RunnablePackage#getRunnable_ComponentInstance()
	 * @see org.muml.pim.instance.ComponentInstance#getRunnables
	 * @model opposite="runnables" required="true"
	 * @generated
	 */
	ComponentInstance getComponentInstance();

	/**
	 * Sets the value of the '{@link org.muml.pim.runnable.Runnable#getComponentInstance <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance</em>' reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Port Instance</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.instance.PortInstance}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.instance.PortInstance#getRunnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instance</em>' reference list.
	 * @see org.muml.pim.runnable.RunnablePackage#getRunnable_PortInstance()
	 * @see org.muml.pim.instance.PortInstance#getRunnable
	 * @model opposite="runnable"
	 * @generated
	 */
	EList<PortInstance> getPortInstance();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(TimeValue)
	 * @see org.muml.pim.runnable.RunnablePackage#getRunnable_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getPeriod();

	/**
	 * Sets the value of the '{@link org.muml.pim.runnable.Runnable#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Label Accesses</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.runnable.LabelAccess}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.runnable.LabelAccess#getAccessingRunnable <em>Accessing Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Accesses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Accesses</em>' reference list.
	 * @see org.muml.pim.runnable.RunnablePackage#getRunnable_LabelAccesses()
	 * @see org.muml.pim.runnable.LabelAccess#getAccessingRunnable
	 * @model opposite="accessingRunnable"
	 * @generated
	 */
	EList<LabelAccess> getLabelAccesses();

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' containment reference.
	 * @see #setDeadline(TimeValue)
	 * @see org.muml.pim.runnable.RunnablePackage#getRunnable_Deadline()
	 * @model containment="true"
	 * @generated
	 */
	TimeValue getDeadline();

	/**
	 * Sets the value of the '{@link org.muml.pim.runnable.Runnable#getDeadline <em>Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' containment reference.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(TimeValue value);

} // Runnable
