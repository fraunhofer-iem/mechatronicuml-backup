/**
 */
package org.muml.graphviz.dot;

import org.eclipse.emf.common.util.EList;
import org.muml.graphviz.common.Edge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.graphviz.dot.DotEdge#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @see org.muml.graphviz.dot.DotPackage#getDotEdge()
 * @model abstract="true"
 * @generated
 */
public interface DotEdge extends Edge<DotNode> {
	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.graphviz.dot.Setting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference list.
	 * @see org.muml.graphviz.dot.DotPackage#getDotEdge_Settings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Setting> getSettings();

} // DotEdge
