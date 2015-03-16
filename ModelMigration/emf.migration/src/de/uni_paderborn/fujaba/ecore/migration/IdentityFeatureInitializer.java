/**
 */
package de.uni_paderborn.fujaba.ecore.migration;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Feature Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.ecore.migration.IdentityFeatureInitializer#getSourceFeature <em>Source Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.ecore.migration.MigrationPackage#getIdentityFeatureInitializer()
 * @model
 * @generated
 */
public interface IdentityFeatureInitializer extends FeatureInitializer {
	/**
	 * Returns the value of the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Feature</em>' reference.
	 * @see #setSourceFeature(EStructuralFeature)
	 * @see de.uni_paderborn.fujaba.ecore.migration.MigrationPackage#getIdentityFeatureInitializer_SourceFeature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getSourceFeature();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.ecore.migration.IdentityFeatureInitializer#getSourceFeature <em>Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Feature</em>' reference.
	 * @see #getSourceFeature()
	 * @generated
	 */
	void setSourceFeature(EStructuralFeature value);

} // IdentityFeatureInitializer
