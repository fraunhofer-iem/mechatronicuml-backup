/**
 */
package de.uni_paderborn.fujaba.graphviz.dot;

import de.uni_paderborn.fujaba.graphviz.common.Node;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.dot.DotNode#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.graphviz.dot.DotPackage#getDotNode()
 * @model
 * @generated
 */
public interface DotNode extends Node {
	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.graphviz.dot.Setting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotPackage#getDotNode_Settings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Setting> getSettings();

} // DotNode
