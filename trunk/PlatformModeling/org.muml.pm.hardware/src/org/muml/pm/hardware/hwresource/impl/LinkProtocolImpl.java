/**
 */
package org.muml.pm.hardware.hwresource.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.LinkProtocol;
import org.muml.pm.hardware.hwresource.LinkProtocolKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.LinkProtocolImpl#getLinkProtocol <em>Link Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkProtocolImpl extends CommunicationProtocolImpl implements LinkProtocol {
	/**
	 * The default value of the '{@link #getLinkProtocol() <em>Link Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final LinkProtocolKind LINK_PROTOCOL_EDEFAULT = LinkProtocolKind.ETHERNET;

	/**
	 * The cached value of the '{@link #getLinkProtocol() <em>Link Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkProtocol()
	 * @generated
	 * @ordered
	 */
	protected LinkProtocolKind linkProtocol = LINK_PROTOCOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourcePackage.Literals.LINK_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkProtocolKind getLinkProtocol() {
		return linkProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkProtocol(LinkProtocolKind newLinkProtocol) {
		LinkProtocolKind oldLinkProtocol = linkProtocol;
		linkProtocol = newLinkProtocol == null ? LINK_PROTOCOL_EDEFAULT : newLinkProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.LINK_PROTOCOL__LINK_PROTOCOL, oldLinkProtocol, linkProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (linkProtocol == null) {
					return linkProtocol.toString();
				}
				return super.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwresourcePackage.LINK_PROTOCOL__LINK_PROTOCOL:
				return getLinkProtocol();
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
			case HwresourcePackage.LINK_PROTOCOL__LINK_PROTOCOL:
				setLinkProtocol((LinkProtocolKind)newValue);
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
			case HwresourcePackage.LINK_PROTOCOL__LINK_PROTOCOL:
				setLinkProtocol(LINK_PROTOCOL_EDEFAULT);
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
			case HwresourcePackage.LINK_PROTOCOL__LINK_PROTOCOL:
				return linkProtocol != LINK_PROTOCOL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HwresourcePackage.LINK_PROTOCOL___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //LinkProtocolImpl
