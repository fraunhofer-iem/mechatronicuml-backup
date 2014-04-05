/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Common abstract superclass of maps with transition pre-image
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TransitionMap#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage#getTransitionMap()
 * @model abstract="true"
 * @generated
 */
public interface TransitionMap extends MapExpr {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference.
	 * @see #setTransition(EObject)
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage#getTransitionMap_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EObject getTransition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TransitionMap#getTransition <em>Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' containment reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(EObject value);

} // TransitionMap
