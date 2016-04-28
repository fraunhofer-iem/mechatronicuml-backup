/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.NamedElement;
import org.muml.pim.behavior.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class Signature defines the signature of a ReconfigurationRule. 
 * It defines the name of the ReconfigurationRule and its input and 
 * output parameters. When calling the reconfiguration rule, concrete values 
 * need to be provided for all input parameters. After the rule has been executed,
 * values are bound to the output parameters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.Signature#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.muml.reconfiguration.Signature#getReturnParameters <em>Return Parameters</em>}</li>
 *   <li>{@link org.muml.reconfiguration.Signature#getReconfigurationRule <em>Reconfiguration Rule</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.ReconfigurationPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.behavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of input parameters of the reconfiguration rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getSignature_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.behavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of output parameters of the reconfiguration rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Parameters</em>' containment reference list.
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getSignature_ReturnParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getReturnParameters();

	/**
	 * Returns the value of the '<em><b>Reconfiguration Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.reconfiguration.ReconfigurationRule#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reconfiguration rule that the signature belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconfiguration Rule</em>' container reference.
	 * @see #setReconfigurationRule(ReconfigurationRule)
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getSignature_ReconfigurationRule()
	 * @see org.muml.reconfiguration.ReconfigurationRule#getSignature
	 * @model opposite="signature" required="true" transient="false"
	 * @generated
	 */
	ReconfigurationRule getReconfigurationRule();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.Signature#getReconfigurationRule <em>Reconfiguration Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Rule</em>' container reference.
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	void setReconfigurationRule(ReconfigurationRule value);

} // Signature
