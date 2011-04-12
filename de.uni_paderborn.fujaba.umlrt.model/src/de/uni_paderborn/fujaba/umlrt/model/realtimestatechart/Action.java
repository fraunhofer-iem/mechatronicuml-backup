/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an action. An action might be the side effect of a transition as well as the do, entry, or exit events of a complex state.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getId <em>Id</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getWcet <em>Wcet</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getBlocking <em>Blocking</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getUMLRealtimeTransition <em>UML Realtime Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getResets <em>Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#isWCETSpecifiedByUser <em>WCET Specified By User</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Expression {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO: Does an action require an id?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getAction_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The worst case execution time of this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wcet</em>' attribute.
	 * @see #setWcet(Long)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getAction_Wcet()
	 * @model
	 * @generated
	 */
	Long getWcet();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getWcet <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcet</em>' attribute.
	 * @see #getWcet()
	 * @generated
	 */
	void setWcet(Long value);

	/**
	 * Returns the value of the '<em><b>Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used by class "WCETCompRTSC".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blocking</em>' attribute.
	 * @see #setBlocking(long)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getAction_Blocking()
	 * @model
	 * @generated
	 */
	long getBlocking();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getBlocking <em>Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking</em>' attribute.
	 * @see #getBlocking()
	 * @generated
	 */
	void setBlocking(long value);

	/**
	 * Returns the value of the '<em><b>UML Realtime Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSideEffect <em>Side Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transition this action is a side effect of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UML Realtime Transition</em>' container reference.
	 * @see #setUMLRealtimeTransition(Transition)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getAction_UMLRealtimeTransition()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition#getSideEffect
	 * @model opposite="sideEffect" transient="false"
	 * @generated
	 */
	Transition getUMLRealtimeTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#getUMLRealtimeTransition <em>UML Realtime Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Transition</em>' container reference.
	 * @see #getUMLRealtimeTransition()
	 * @generated
	 */
	void setUMLRealtimeTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Resets</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO: Is this required? The crossing events already have an assocs to resets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resets</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getAction_Resets()
	 * @model
	 * @generated
	 */
	EList<Clock> getResets();

	/**
	 * Returns the value of the '<em><b>WCET Specified By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WCET Specified By User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WCET Specified By User</em>' attribute.
	 * @see #setWCETSpecifiedByUser(boolean)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getAction_WCETSpecifiedByUser()
	 * @model
	 * @generated
	 */
	boolean isWCETSpecifiedByUser();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action#isWCETSpecifiedByUser <em>WCET Specified By User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WCET Specified By User</em>' attribute.
	 * @see #isWCETSpecifiedByUser()
	 * @generated
	 */
	void setWCETSpecifiedByUser(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject clone(AbstractStatechart rtsc, Action newAction);

} // Action
