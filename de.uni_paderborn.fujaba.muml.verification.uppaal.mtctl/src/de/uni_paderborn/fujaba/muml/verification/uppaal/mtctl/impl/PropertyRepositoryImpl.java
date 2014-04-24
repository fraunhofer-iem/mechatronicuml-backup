/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.impl;

import de.uni_paderborn.fujaba.muml.constraint.impl.VerificationConstraintRepositoryImpl;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Property;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.impl.PropertyRepositoryImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.impl.PropertyRepositoryImpl#isEnableVerification <em>Enable Verification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyRepositoryImpl extends VerificationConstraintRepositoryImpl implements PropertyRepository {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The default value of the '{@link #isEnableVerification() <em>Enable Verification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableVerification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_VERIFICATION_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isEnableVerification() <em>Enable Verification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableVerification()
	 * @generated
	 * @ordered
	 */
	protected boolean enableVerification = ENABLE_VERIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtctlPackage.Literals.PROPERTY_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, MtctlPackage.PROPERTY_REPOSITORY__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableVerification() {
		return enableVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableVerification(boolean newEnableVerification) {
		boolean oldEnableVerification = enableVerification;
		enableVerification = newEnableVerification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MtctlPackage.PROPERTY_REPOSITORY__ENABLE_VERIFICATION, oldEnableVerification, enableVerification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MtctlPackage.PROPERTY_REPOSITORY__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case MtctlPackage.PROPERTY_REPOSITORY__PROPERTIES:
				return getProperties();
			case MtctlPackage.PROPERTY_REPOSITORY__ENABLE_VERIFICATION:
				return isEnableVerification();
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
			case MtctlPackage.PROPERTY_REPOSITORY__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case MtctlPackage.PROPERTY_REPOSITORY__ENABLE_VERIFICATION:
				setEnableVerification((Boolean)newValue);
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
			case MtctlPackage.PROPERTY_REPOSITORY__PROPERTIES:
				getProperties().clear();
				return;
			case MtctlPackage.PROPERTY_REPOSITORY__ENABLE_VERIFICATION:
				setEnableVerification(ENABLE_VERIFICATION_EDEFAULT);
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
			case MtctlPackage.PROPERTY_REPOSITORY__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case MtctlPackage.PROPERTY_REPOSITORY__ENABLE_VERIFICATION:
				return enableVerification != ENABLE_VERIFICATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (enableVerification: ");
		result.append(enableVerification);
		result.append(')');
		return result.toString();
	}

} //PropertyRepositoryImpl
