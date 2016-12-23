/**
 */
package org.muml.emm;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.emm.Mapping#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link org.muml.emm.Mapping#getMigrator <em>Migrator</em>}</li>
 * </ul>
 *
 * @see org.muml.emm.MigrationPackage#getMapping()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoTargetForAbstractSourceAllowed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoTargetForAbstractSourceAllowed='(not sourceClass.oclIsUndefined()) implies \n(sourceClass.abstract implies targetClass.oclIsUndefined())'"
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
	 * @see org.muml.emm.MigrationPackage#getMapping_SourceClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getSourceClass();

	/**
	 * Sets the value of the '{@link org.muml.emm.Mapping#getSourceClass <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Class</em>' reference.
	 * @see #getSourceClass()
	 * @generated
	 */
	void setSourceClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Migrator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.emm.Migrator#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Migrator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Migrator</em>' container reference.
	 * @see #setMigrator(Migrator)
	 * @see org.muml.emm.MigrationPackage#getMapping_Migrator()
	 * @see org.muml.emm.Migrator#getMappings
	 * @model opposite="mappings" required="true" transient="false"
	 * @generated
	 */
	Migrator getMigrator();

	/**
	 * Sets the value of the '{@link org.muml.emm.Mapping#getMigrator <em>Migrator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Migrator</em>' container reference.
	 * @see #getMigrator()
	 * @generated
	 */
	void setMigrator(Migrator value);

} // Mapping
