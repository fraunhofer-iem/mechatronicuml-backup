/**
 */
package de.uni_paderborn.fujaba.ecore.migration;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.ecore.migration.Mapping#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.ecore.migration.Mapping#getMigrator <em>Migrator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.ecore.migration.MigrationPackage#getMapping()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoTargetForAbstractSourceAllowed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoTargetForAbstractSourceAllowed='sourceClass.abstract implies targetClass.oclIsUndefined()'"
 * @generated
 */
public interface Mapping extends CreateClass {
	/**
	 * Returns the value of the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Class</em>' reference.
	 * @see #setSourceClass(EClass)
	 * @see de.uni_paderborn.fujaba.ecore.migration.MigrationPackage#getMapping_SourceClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getSourceClass();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.ecore.migration.Mapping#getSourceClass <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Class</em>' reference.
	 * @see #getSourceClass()
	 * @generated
	 */
	void setSourceClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Migrator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.ecore.migration.Migrator#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Migrator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Migrator</em>' container reference.
	 * @see #setMigrator(Migrator)
	 * @see de.uni_paderborn.fujaba.ecore.migration.MigrationPackage#getMapping_Migrator()
	 * @see de.uni_paderborn.fujaba.ecore.migration.Migrator#getMappings
	 * @model opposite="mappings" required="true" transient="false"
	 * @generated
	 */
	Migrator getMigrator();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.ecore.migration.Mapping#getMigrator <em>Migrator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Migrator</em>' container reference.
	 * @see #getMigrator()
	 * @generated
	 */
	void setMigrator(Migrator value);

} // Mapping
