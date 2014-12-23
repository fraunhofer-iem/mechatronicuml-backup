/**
 */
package migration;

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
 *   <li>{@link migration.Migrator#getSourcePackages <em>Source Packages</em>}</li>
 *   <li>{@link migration.Migrator#getTargetPackages <em>Target Packages</em>}</li>
 *   <li>{@link migration.Migrator#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see migration.MigrationPackage#getMigrator()
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
	 * @see migration.MigrationPackage#getMigrator_SourcePackages()
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
	 * @see migration.MigrationPackage#getMigrator_TargetPackages()
	 * @model
	 * @generated
	 */
	EList<EPackage> getTargetPackages();

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link migration.Mapping}.
	 * It is bidirectional and its opposite is '{@link migration.Mapping#getMigrator <em>Migrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see migration.MigrationPackage#getMigrator_Mappings()
	 * @see migration.Mapping#getMigrator
	 * @model opposite="migrator" containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

} // Migrator
