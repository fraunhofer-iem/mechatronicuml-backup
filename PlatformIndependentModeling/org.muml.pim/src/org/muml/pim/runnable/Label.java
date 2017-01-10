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
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.realtimestatechart.RealtimeStatechart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Models a Label, i.e., variable that is beeing read or written during execution.
 * 
 * A label (e.g., variable, RTSC state) can be either read or written during execution. This information is important when deriving a multi-core scheduling in order to respect dependencies between Runnables and to avoid access conflicts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.runnable.Label#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link org.muml.pim.runnable.Label#getComponentStatechart <em>Component Statechart</em>}</li>
 *   <li>{@link org.muml.pim.runnable.Label#isIsConstant <em>Is Constant</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.runnable.RunnablePackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.instance.ComponentInstance#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance</em>' reference.
	 * @see #setComponentInstance(ComponentInstance)
	 * @see org.muml.pim.runnable.RunnablePackage#getLabel_ComponentInstance()
	 * @see org.muml.pim.instance.ComponentInstance#getLabels
	 * @model opposite="labels" required="true"
	 * @generated
	 */
	ComponentInstance getComponentInstance();

	/**
	 * Sets the value of the '{@link org.muml.pim.runnable.Label#getComponentInstance <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance</em>' reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Component Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Statechart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Statechart</em>' reference.
	 * @see #setComponentStatechart(RealtimeStatechart)
	 * @see org.muml.pim.runnable.RunnablePackage#getLabel_ComponentStatechart()
	 * @model
	 * @generated
	 */
	RealtimeStatechart getComponentStatechart();

	/**
	 * Sets the value of the '{@link org.muml.pim.runnable.Label#getComponentStatechart <em>Component Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Statechart</em>' reference.
	 * @see #getComponentStatechart()
	 * @generated
	 */
	void setComponentStatechart(RealtimeStatechart value);

	/**
	 * Returns the value of the '<em><b>Is Constant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Constant</em>' attribute.
	 * @see #setIsConstant(boolean)
	 * @see org.muml.pim.runnable.RunnablePackage#getLabel_IsConstant()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsConstant();

	/**
	 * Sets the value of the '{@link org.muml.pim.runnable.Label#isIsConstant <em>Is Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Constant</em>' attribute.
	 * @see #isIsConstant()
	 * @generated
	 */
	void setIsConstant(boolean value);

} // Label
