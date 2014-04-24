/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl;

import de.uni_paderborn.fujaba.muml.constraint.VerificationConstraintRepository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of properties
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository#isEnableVerification <em>Enable Verification</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage#getPropertyRepository()
 * @model
 * @generated
 */
public interface PropertyRepository extends VerificationConstraintRepository {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage#getPropertyRepository_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Enable Verification</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the properties in this repository should be verified when starting the next verification
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Verification</em>' attribute.
	 * @see #setEnableVerification(boolean)
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage#getPropertyRepository_EnableVerification()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isEnableVerification();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository#isEnableVerification <em>Enable Verification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Verification</em>' attribute.
	 * @see #isEnableVerification()
	 * @generated
	 */
	void setEnableVerification(boolean value);

} // PropertyRepository
