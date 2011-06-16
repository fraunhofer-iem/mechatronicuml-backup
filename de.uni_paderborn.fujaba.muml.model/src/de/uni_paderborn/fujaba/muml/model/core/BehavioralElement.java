/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for all elements that have a behavior.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.BehavioralElement#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getBehavioralElement()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.core.Behavior}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.core.Behavior#getBehavioralElement <em>Behavioral Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The real-time statechart that defines the behavior of this behavioral element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.core.CorePackage#getBehavioralElement_Behavior()
	 * @see de.uni_paderborn.fujaba.muml.model.core.Behavior#getBehavioralElement
	 * @model opposite="behavioralElement"
	 * @generated
	 */
	EList<Behavior> getBehavior();

} // BehavioralElement
