/**
 */
package org.muml.emm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.emm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MigrationFactoryImpl extends EFactoryImpl implements MigrationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MigrationFactory init() {
		try {
			MigrationFactory theMigrationFactory = (MigrationFactory)EPackage.Registry.INSTANCE.getEFactory(MigrationPackage.eNS_URI);
			if (theMigrationFactory != null) {
				return theMigrationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MigrationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MigrationPackage.MIGRATOR: return createMigrator();
			case MigrationPackage.MAPPING: return createMapping();
			case MigrationPackage.IDENTITY_FEATURE_INITIALIZER: return createIdentityFeatureInitializer();
			case MigrationPackage.SET_FEATURE_INITIALIZER: return createSetFeatureInitializer();
			case MigrationPackage.CREATE_INITIALIZER: return createCreateInitializer();
			case MigrationPackage.CONSTRAINT: return createConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Migrator createMigrator() {
		MigratorImpl migrator = new MigratorImpl();
		return migrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityFeatureInitializer createIdentityFeatureInitializer() {
		IdentityFeatureInitializerImpl identityFeatureInitializer = new IdentityFeatureInitializerImpl();
		return identityFeatureInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetFeatureInitializer createSetFeatureInitializer() {
		SetFeatureInitializerImpl setFeatureInitializer = new SetFeatureInitializerImpl();
		return setFeatureInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateInitializer createCreateInitializer() {
		CreateInitializerImpl createInitializer = new CreateInitializerImpl();
		return createInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrationPackage getMigrationPackage() {
		return (MigrationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MigrationPackage getPackage() {
		return MigrationPackage.eINSTANCE;
	}

} //MigrationFactoryImpl
