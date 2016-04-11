/**
 */
package org.muml.psm.muml_container.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.muml.psm.muml_container.Muml_containerPackage;
import org.muml.psm.muml_container.PortInstanceConfiguration_Local;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Instance Configuration Local</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_LocalImpl#getOwnID <em>Own ID</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_LocalImpl#getWritersID <em>Writers ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortInstanceConfiguration_LocalImpl extends PortInstanceConfigurationImpl implements PortInstanceConfiguration_Local {
	/**
	 * The default value of the '{@link #getOwnID() <em>Own ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnID()
	 * @generated
	 * @ordered
	 */
	protected static final short OWN_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOwnID() <em>Own ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnID()
	 * @generated
	 * @ordered
	 */
	protected short ownID = OWN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWritersID() <em>Writers ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritersID()
	 * @generated
	 * @ordered
	 */
	protected static final short WRITERS_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWritersID() <em>Writers ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritersID()
	 * @generated
	 * @ordered
	 */
	protected short writersID = WRITERS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortInstanceConfiguration_LocalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_LOCAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getOwnID() {
		return ownID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnID(short newOwnID) {
		short oldOwnID = ownID;
		ownID = newOwnID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_LOCAL__OWN_ID, oldOwnID, ownID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getWritersID() {
		return writersID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWritersID(short newWritersID) {
		short oldWritersID = writersID;
		writersID = newWritersID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_LOCAL__WRITERS_ID, oldWritersID, writersID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_LOCAL__OWN_ID:
				return getOwnID();
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_LOCAL__WRITERS_ID:
				return getWritersID();
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
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_LOCAL__OWN_ID:
				setOwnID((Short)newValue);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_LOCAL__WRITERS_ID:
				setWritersID((Short)newValue);
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
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_LOCAL__OWN_ID:
				setOwnID(OWN_ID_EDEFAULT);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_LOCAL__WRITERS_ID:
				setWritersID(WRITERS_ID_EDEFAULT);
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
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_LOCAL__OWN_ID:
				return ownID != OWN_ID_EDEFAULT;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_LOCAL__WRITERS_ID:
				return writersID != WRITERS_ID_EDEFAULT;
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
		result.append(" (ownID: ");
		result.append(ownID);
		result.append(", writersID: ");
		result.append(writersID);
		result.append(')');
		return result.toString();
	}

} //PortInstanceConfiguration_LocalImpl
