/**
 */
package de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper;

import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedGraphTransformationSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSC Transformation Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TSCTransformationOutput#getTgts <em>Tgts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.HelperPackage#getTSCTransformationOutput()
 * @model
 * @generated
 */
public interface TSCTransformationOutput extends EObject {
	/**
	 * Returns the value of the '<em><b>Tgts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tgts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgts</em>' containment reference.
	 * @see #setTgts(TimedGraphTransformationSystem)
	 * @see de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.HelperPackage#getTSCTransformationOutput_Tgts()
	 * @model containment="true"
	 * @generated
	 */
	TimedGraphTransformationSystem getTgts();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TSCTransformationOutput#getTgts <em>Tgts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgts</em>' containment reference.
	 * @see #getTgts()
	 * @generated
	 */
	void setTgts(TimedGraphTransformationSystem value);

} // TSCTransformationOutput
