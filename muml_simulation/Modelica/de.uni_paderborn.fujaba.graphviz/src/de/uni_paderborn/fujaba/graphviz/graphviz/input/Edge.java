/**
 */
package de.uni_paderborn.fujaba.graphviz.graphviz.input;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Edge#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage#getEdge_Source()
	 * @model required="true"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage#getEdge_Target()
	 * @model required="true"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Setting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage#getEdge_Settings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Setting> getSettings();

} // Edge
