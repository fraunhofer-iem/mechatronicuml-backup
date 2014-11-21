/**
 */
package de.uni_paderborn.fujaba.muml.psm.realtimestatechart;

import de.uni_paderborn.fujaba.muml.actionlanguage.OperationCall;
import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.APICallParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a expression for a CallParameter. This Expression can be used within the realtimestatechart. It refers to the parameter, which is given to the realtimestatechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.APICall#getApiCallSignature <em>Api Call Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.realtimestatechart.RealtimestatechartPackage#getAPICall()
 * @model
 * @generated
 */
public interface APICall extends OperationCall {
	/**
	 * Returns the value of the '<em><b>Api Call Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Call Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Call Signature</em>' reference.
	 * @see #setApiCallSignature(APICallParameter)
	 * @see de.uni_paderborn.fujaba.muml.psm.realtimestatechart.RealtimestatechartPackage#getAPICall_ApiCallSignature()
	 * @model required="true"
	 * @generated
	 */
	APICallParameter getApiCallSignature();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.APICall#getApiCallSignature <em>Api Call Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Call Signature</em>' reference.
	 * @see #getApiCallSignature()
	 * @generated
	 */
	void setApiCallSignature(APICallParameter value);

} // APICall
