/**
 */
package org.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.component.AtomicComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fading Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.FadingComponent#getFadingFunction <em>Fading Function</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.ReconfigurationPackage#getFadingComponent()
 * @model
 * @generated
 */
public interface FadingComponent extends AtomicComponent {
	/**
	 * Returns the value of the '<em><b>Fading Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfiguration.FadingFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fading Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fading Function</em>' containment reference list.
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getFadingComponent_FadingFunction()
	 * @model containment="true"
	 * @generated
	 */
	EList<FadingFunction> getFadingFunction();

} // FadingComponent
