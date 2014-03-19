/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.LinkProtocolKind;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.LinkProtocolImpl#getLinkProtocol <em>Link Protocol</em>}</li>
 * </ul>
 * </p>
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
		return ResourcetypePackage.Literals.LINK_PROTOCOL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcetypePackage.LINK_PROTOCOL__LINK_PROTOCOL, oldLinkProtocol, linkProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcetypePackage.LINK_PROTOCOL__LINK_PROTOCOL:
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
			case ResourcetypePackage.LINK_PROTOCOL__LINK_PROTOCOL:
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
			case ResourcetypePackage.LINK_PROTOCOL__LINK_PROTOCOL:
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
			case ResourcetypePackage.LINK_PROTOCOL__LINK_PROTOCOL:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (linkProtocol: ");
		result.append(linkProtocol);
		result.append(')');
		return result.toString();
	}

} //LinkProtocolImpl
