/**
 */
package de.uni_paderborn.fujaba.ecore.migration;

import de.uni_paderborn.fujaba.ecore.migration.release.Release;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.ecore.migration.Migrator#getSourcePackages <em>Source Packages</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.ecore.migration.Migrator#getTargetPackages <em>Target Packages</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.ecore.migration.Migrator#getMappings <em>Mappings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.ecore.migration.Migrator#getRelease <em>Release</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.ecore.migration.MigrationPackage#getMigrator()
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
	 * @see de.uni_paderborn.fujaba.ecore.migration.MigrationPackage#getMigrator_SourcePackages()
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
	 * @see de.uni_paderborn.fujaba.ecore.migration.MigrationPackage#getMigrator_TargetPackages()
	 * @model
	 * @generated
	 */
	EList<EPackage> getTargetPackages();

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.ecore.migration.Mapping}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.ecore.migration.Mapping#getMigrator <em>Migrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.ecore.migration.MigrationPackage#getMigrator_Mappings()
	 * @see de.uni_paderborn.fujaba.ecore.migration.Mapping#getMigrator
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
	 * @see de.uni_paderborn.fujaba.ecore.migration.MigrationPackage#getMigrator_Release()
	 * @model required="true"
	 * @generated
	 */
	Release getRelease();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.ecore.migration.Migrator#getRelease <em>Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' reference.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(Release value);

} // Migrator
