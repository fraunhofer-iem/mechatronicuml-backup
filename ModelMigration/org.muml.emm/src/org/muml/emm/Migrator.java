/**
 */
package org.muml.emm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.muml.emm.release.Release;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.emm.Migrator#getSourcePackages <em>Source Packages</em>}</li>
 *   <li>{@link org.muml.emm.Migrator#getTargetPackages <em>Target Packages</em>}</li>
 *   <li>{@link org.muml.emm.Migrator#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.muml.emm.Migrator#getRelease <em>Release</em>}</li>
 * </ul>
 *
 * @see org.muml.emm.MigrationPackage#getMigrator()
 * @model
 * @generated
 */
public interface Migrator extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Packages</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Packages</em>' reference list.
	 * @see org.muml.emm.MigrationPackage#getMigrator_SourcePackages()
	 * @model
	 * @generated
	 */
	EList<EPackage> getSourcePackages();

	/**
	 * Returns the value of the '<em><b>Target Packages</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Packages</em>' reference list.
	 * @see org.muml.emm.MigrationPackage#getMigrator_TargetPackages()
	 * @model
	 * @generated
	 */
	EList<EPackage> getTargetPackages();

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.emm.Mapping}.
	 * It is bidirectional and its opposite is '{@link org.muml.emm.Mapping#getMigrator <em>Migrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see org.muml.emm.MigrationPackage#getMigrator_Mappings()
	 * @see org.muml.emm.Mapping#getMigrator
	 * @model opposite="migrator" containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Release</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' reference.
	 * @see #setRelease(Release)
	 * @see org.muml.emm.MigrationPackage#getMigrator_Release()
	 * @model required="true"
	 * @generated
	 */
	Release getRelease();

	/**
	 * Sets the value of the '{@link org.muml.emm.Migrator#getRelease <em>Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' reference.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(Release value);

} // Migrator
