/**
 */
package gmfext.impl;

import de.uni_paderborn.fujaba.properties.PropertyGenerator;

import gmfext.GmfextPackage;
import gmfext.MumlGMFExtension;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Muml GMF Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gmfext.impl.MumlGMFExtensionImpl#getPropertyGenerator <em>Property Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MumlGMFExtensionImpl extends MinimalEObjectImpl.Container implements MumlGMFExtension {
	/**
	 * The cached value of the '{@link #getPropertyGenerator() <em>Property Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyGenerator()
	 * @generated
	 * @ordered
	 */
	protected PropertyGenerator propertyGenerator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MumlGMFExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmfextPackage.Literals.MUML_GMF_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyGenerator getPropertyGenerator() {
		if (propertyGenerator != null && propertyGenerator.eIsProxy()) {
			InternalEObject oldPropertyGenerator = (InternalEObject)propertyGenerator;
			propertyGenerator = (PropertyGenerator)eResolveProxy(oldPropertyGenerator);
			if (propertyGenerator != oldPropertyGenerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GmfextPackage.MUML_GMF_EXTENSION__PROPERTY_GENERATOR, oldPropertyGenerator, propertyGenerator));
			}
		}
		return propertyGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyGenerator basicGetPropertyGenerator() {
		return propertyGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyGenerator(PropertyGenerator newPropertyGenerator) {
		PropertyGenerator oldPropertyGenerator = propertyGenerator;
		propertyGenerator = newPropertyGenerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmfextPackage.MUML_GMF_EXTENSION__PROPERTY_GENERATOR, oldPropertyGenerator, propertyGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GmfextPackage.MUML_GMF_EXTENSION__PROPERTY_GENERATOR:
				if (resolve) return getPropertyGenerator();
				return basicGetPropertyGenerator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GmfextPackage.MUML_GMF_EXTENSION__PROPERTY_GENERATOR:
				setPropertyGenerator((PropertyGenerator)newValue);
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
			case GmfextPackage.MUML_GMF_EXTENSION__PROPERTY_GENERATOR:
				setPropertyGenerator((PropertyGenerator)null);
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
			case GmfextPackage.MUML_GMF_EXTENSION__PROPERTY_GENERATOR:
				return propertyGenerator != null;
		}
		return super.eIsSet(featureID);
	}

} //MumlGMFExtensionImpl
