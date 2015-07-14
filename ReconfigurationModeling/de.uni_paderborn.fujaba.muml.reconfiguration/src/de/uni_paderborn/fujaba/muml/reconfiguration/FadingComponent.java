/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.component.AtomicComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fading Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.FadingComponent#getFadingFunction <em>Fading Function</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getFadingComponent()
 * @model
 * @generated
 */
public interface FadingComponent extends AtomicComponent {
	/**
	 * Returns the value of the '<em><b>Fading Function</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.FadingFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fading Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fading Function</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getFadingComponent_FadingFunction()
	 * @model containment="true"
	 * @generated
	 */
	EList<FadingFunction> getFadingFunction();

} // FadingComponent
