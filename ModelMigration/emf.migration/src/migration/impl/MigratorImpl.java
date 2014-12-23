/**
 */
package migration.impl;

import java.util.Collection;

import migration.Mapping;
import migration.MigrationPackage;
import migration.Migrator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Migrator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link migration.impl.MigratorImpl#getSourcePackages <em>Source Packages</em>}</li>
 *   <li>{@link migration.impl.MigratorImpl#getTargetPackages <em>Target Packages</em>}</li>
 *   <li>{@link migration.impl.MigratorImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MigratorImpl extends MinimalEObjectImpl.Container implements Migrator {
	/**
	 * The cached value of the '{@link #getSourcePackages() <em>Source Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePackages()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> sourcePackages;

	/**
	 * The cached value of the '{@link #getTargetPackages() <em>Target Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> targetPackages;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MigratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigrationPackage.Literals.MIGRATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getSourcePackages() {
		if (sourcePackages == null) {
			sourcePackages = new EObjectResolvingEList<EPackage>(EPackage.class, this, MigrationPackage.MIGRATOR__SOURCE_PACKAGES);
		}
		return sourcePackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getTargetPackages() {
		if (targetPackages == null) {
			targetPackages = new EObjectResolvingEList<EPackage>(EPackage.class, this, MigrationPackage.MIGRATOR__TARGET_PACKAGES);
		}
		return targetPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentWithInverseEList<Mapping>(Mapping.class, this, MigrationPackage.MIGRATOR__MAPPINGS, MigrationPackage.MAPPING__MIGRATOR);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MigrationPackage.MIGRATOR__MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappings()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MigrationPackage.MIGRATOR__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MigrationPackage.MIGRATOR__SOURCE_PACKAGES:
				return getSourcePackages();
			case MigrationPackage.MIGRATOR__TARGET_PACKAGES:
				return getTargetPackages();
			case MigrationPackage.MIGRATOR__MAPPINGS:
				return getMappings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MigrationPackage.MIGRATOR__SOURCE_PACKAGES:
				getSourcePackages().clear();
				getSourcePackages().addAll((Collection<? extends EPackage>)newValue);
				return;
			case MigrationPackage.MIGRATOR__TARGET_PACKAGES:
				getTargetPackages().clear();
				getTargetPackages().addAll((Collection<? extends EPackage>)newValue);
				return;
			case MigrationPackage.MIGRATOR__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends Mapping>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MigrationPackage.MIGRATOR__SOURCE_PACKAGES:
				getSourcePackages().clear();
				return;
			case MigrationPackage.MIGRATOR__TARGET_PACKAGES:
				getTargetPackages().clear();
				return;
			case MigrationPackage.MIGRATOR__MAPPINGS:
				getMappings().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MigrationPackage.MIGRATOR__SOURCE_PACKAGES:
				return sourcePackages != null && !sourcePackages.isEmpty();
			case MigrationPackage.MIGRATOR__TARGET_PACKAGES:
				return targetPackages != null && !targetPackages.isEmpty();
			case MigrationPackage.MIGRATOR__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MigratorImpl
