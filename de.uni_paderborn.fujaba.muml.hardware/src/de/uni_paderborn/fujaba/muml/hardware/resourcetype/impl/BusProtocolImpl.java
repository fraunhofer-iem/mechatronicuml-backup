/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.BusProtocolKind;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.BusProtocolImpl#getBusProtocol <em>Bus Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusProtocolImpl extends CommunicationProtocolImpl implements BusProtocol {
	/**
	 * The default value of the '{@link #getBusProtocol() <em>Bus Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final BusProtocolKind BUS_PROTOCOL_EDEFAULT = BusProtocolKind.CAN;

	/**
	 * The cached value of the '{@link #getBusProtocol() <em>Bus Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusProtocol()
	 * @generated
	 * @ordered
	 */
	protected BusProtocolKind busProtocol = BUS_PROTOCOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcetypePackage.Literals.BUS_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusProtocolKind getBusProtocol() {
		return busProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusProtocol(BusProtocolKind newBusProtocol) {
		BusProtocolKind oldBusProtocol = busProtocol;
		busProtocol = newBusProtocol == null ? BUS_PROTOCOL_EDEFAULT : newBusProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcetypePackage.BUS_PROTOCOL__BUS_PROTOCOL, oldBusProtocol, busProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcetypePackage.BUS_PROTOCOL__BUS_PROTOCOL:
				return getBusProtocol();
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
			case ResourcetypePackage.BUS_PROTOCOL__BUS_PROTOCOL:
				setBusProtocol((BusProtocolKind)newValue);
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
			case ResourcetypePackage.BUS_PROTOCOL__BUS_PROTOCOL:
				setBusProtocol(BUS_PROTOCOL_EDEFAULT);
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
			case ResourcetypePackage.BUS_PROTOCOL__BUS_PROTOCOL:
				return busProtocol != BUS_PROTOCOL_EDEFAULT;
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
		result.append(" (busProtocol: ");
		result.append(busProtocol);
		result.append(')');
		return result.toString();
	}

} //BusProtocolImpl
