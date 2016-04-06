/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.muml.core.reachanalysis.reachabilitygraph.ActionTransition;
import org.muml.storydiagram.activities.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDM Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action transition that results from applying a story diagrams. The SDMTransition
 * stores the story diagram that caused it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition#getIndex <em>Index</em>}</li>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition#getAppliedActivity <em>Applied Activity</em>}</li>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition#getMatching <em>Matching</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#getSDMTransition()
 * @model
 * @generated
 */
public interface SDMTransition extends ActionTransition {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.ecore.EObject},
	 * and the value is of type {@link org.eclipse.emf.ecore.EObject},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The index function is a map that associates an object n1 of the source graph of this
	 * transition with an object n2 of the target graph of this transition. n1 is the key, n2 is
	 * the value. (n1, n2) is element of index if n2 was created as a copy of n1 when 
	 * cloning the source graph of this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index</em>' map.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#getSDMTransition_Index()
	 * @model mapType="org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.IndexEntry<org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject>" transient="true"
	 * @generated
	 */
	EMap<EObject, EObject> getIndex();

	/**
	 * Returns the value of the '<em><b>Applied Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stores the activity that has been applied in order to obtain this transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applied Activity</em>' reference.
	 * @see #setAppliedActivity(Activity)
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#getSDMTransition_AppliedActivity()
	 * @model
	 * @generated
	 */
	Activity getAppliedActivity();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition#getAppliedActivity <em>Applied Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Activity</em>' reference.
	 * @see #getAppliedActivity()
	 * @generated
	 */
	void setAppliedActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Matching</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.emf.ecore.EObject},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stores the objects that has been matched in the forEach-Node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Matching</em>' map.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#getSDMTransition_Matching()
	 * @model mapType="org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.MatchingEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EObject>"
	 * @generated
	 */
	EMap<String, EObject> getMatching();

} // SDMTransition
