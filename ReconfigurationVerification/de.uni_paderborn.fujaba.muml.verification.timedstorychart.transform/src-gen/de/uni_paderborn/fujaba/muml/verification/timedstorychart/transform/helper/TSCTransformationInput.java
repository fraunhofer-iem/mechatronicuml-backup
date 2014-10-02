/**
 */
package de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.connector.Connector;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSC Transformation Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TSCTransformationInput#getConnector <em>Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TSCTransformationInput#getSyncTransitionTuples <em>Sync Transition Tuples</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TSCTransformationInput#getNoSyncTransitions <em>No Sync Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.HelperPackage#getTSCTransformationInput()
 * @model
 * @generated
 */
public interface TSCTransformationInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.HelperPackage#getTSCTransformationInput_Connector()
	 * @model
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TSCTransformationInput#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Sync Transition Tuples</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TransitionTuple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync Transition Tuples</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Transition Tuples</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.HelperPackage#getTSCTransformationInput_SyncTransitionTuples()
	 * @model
	 * @generated
	 */
	EList<TransitionTuple> getSyncTransitionTuples();

	/**
	 * Returns the value of the '<em><b>No Sync Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.realtimestatechart.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Sync Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Sync Transitions</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.HelperPackage#getTSCTransformationInput_NoSyncTransitions()
	 * @model
	 * @generated
	 */
	EList<Transition> getNoSyncTransitions();

} // TSCTransformationInput
