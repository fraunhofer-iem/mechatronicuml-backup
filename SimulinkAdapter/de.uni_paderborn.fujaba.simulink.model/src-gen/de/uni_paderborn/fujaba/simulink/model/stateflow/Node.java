/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model.stateflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.stateflow.Node#getParent <em>Parent</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.stateflow.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.stateflow.Node#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends StateflowElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.stateflow.State#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(State)
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowPackage#getNode_Parent()
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.State#getNodes
	 * @model opposite="nodes" transient="false"
	 * @generated
	 */
	State getParent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.simulink.model.stateflow.Node#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(State value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.simulink.model.stateflow.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.stateflow.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowPackage#getNode_Incoming()
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.simulink.model.stateflow.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.simulink.model.stateflow.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowPackage#getNode_Outgoing()
	 * @see de.uni_paderborn.fujaba.simulink.model.stateflow.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

} // Node
