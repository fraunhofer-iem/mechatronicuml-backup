/**
 */
package org.muml.emm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.emm.MigrationPackage
 * @generated
 */
public interface MigrationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MigrationFactory eINSTANCE = org.muml.emm.impl.MigrationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Migrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Migrator</em>'.
	 * @generated
	 */
	Migrator createMigrator();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Identity Feature Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity Feature Initializer</em>'.
	 * @generated
	 */
	IdentityFeatureInitializer createIdentityFeatureInitializer();

	/**
	 * Returns a new object of class '<em>Set Feature Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Feature Initializer</em>'.
	 * @generated
	 */
	SetFeatureInitializer createSetFeatureInitializer();

	/**
	 * Returns a new object of class '<em>Create Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Initializer</em>'.
	 * @generated
	 */
	CreateInitializer createCreateInitializer();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MigrationPackage getMigrationPackage();

} //MigrationFactory
