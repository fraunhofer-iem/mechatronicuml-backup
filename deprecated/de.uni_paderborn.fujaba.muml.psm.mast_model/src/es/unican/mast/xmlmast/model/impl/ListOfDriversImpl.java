/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.CharacterPacketDriver;
import es.unican.mast.xmlmast.model.ListOfDrivers;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.PacketDriver;
import es.unican.mast.xmlmast.model.RTEPPacketDriver;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Drivers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.ListOfDriversImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.ListOfDriversImpl#getPacketDriver <em>Packet Driver</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.ListOfDriversImpl#getCharacterPacketDriver <em>Character Packet Driver</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.ListOfDriversImpl#getRTEPPacketDriver <em>RTEP Packet Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListOfDriversImpl extends MinimalEObjectImpl.Container implements ListOfDrivers {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfDriversImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LIST_OF_DRIVERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ModelPackage.LIST_OF_DRIVERS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PacketDriver> getPacketDriver() {
		return getGroup().list(ModelPackage.Literals.LIST_OF_DRIVERS__PACKET_DRIVER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CharacterPacketDriver> getCharacterPacketDriver() {
		return getGroup().list(ModelPackage.Literals.LIST_OF_DRIVERS__CHARACTER_PACKET_DRIVER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RTEPPacketDriver> getRTEPPacketDriver() {
		return getGroup().list(ModelPackage.Literals.LIST_OF_DRIVERS__RTEP_PACKET_DRIVER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.LIST_OF_DRIVERS__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ModelPackage.LIST_OF_DRIVERS__PACKET_DRIVER:
				return ((InternalEList<?>)getPacketDriver()).basicRemove(otherEnd, msgs);
			case ModelPackage.LIST_OF_DRIVERS__CHARACTER_PACKET_DRIVER:
				return ((InternalEList<?>)getCharacterPacketDriver()).basicRemove(otherEnd, msgs);
			case ModelPackage.LIST_OF_DRIVERS__RTEP_PACKET_DRIVER:
				return ((InternalEList<?>)getRTEPPacketDriver()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.LIST_OF_DRIVERS__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ModelPackage.LIST_OF_DRIVERS__PACKET_DRIVER:
				return getPacketDriver();
			case ModelPackage.LIST_OF_DRIVERS__CHARACTER_PACKET_DRIVER:
				return getCharacterPacketDriver();
			case ModelPackage.LIST_OF_DRIVERS__RTEP_PACKET_DRIVER:
				return getRTEPPacketDriver();
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
			case ModelPackage.LIST_OF_DRIVERS__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ModelPackage.LIST_OF_DRIVERS__PACKET_DRIVER:
				getPacketDriver().clear();
				getPacketDriver().addAll((Collection<? extends PacketDriver>)newValue);
				return;
			case ModelPackage.LIST_OF_DRIVERS__CHARACTER_PACKET_DRIVER:
				getCharacterPacketDriver().clear();
				getCharacterPacketDriver().addAll((Collection<? extends CharacterPacketDriver>)newValue);
				return;
			case ModelPackage.LIST_OF_DRIVERS__RTEP_PACKET_DRIVER:
				getRTEPPacketDriver().clear();
				getRTEPPacketDriver().addAll((Collection<? extends RTEPPacketDriver>)newValue);
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
			case ModelPackage.LIST_OF_DRIVERS__GROUP:
				getGroup().clear();
				return;
			case ModelPackage.LIST_OF_DRIVERS__PACKET_DRIVER:
				getPacketDriver().clear();
				return;
			case ModelPackage.LIST_OF_DRIVERS__CHARACTER_PACKET_DRIVER:
				getCharacterPacketDriver().clear();
				return;
			case ModelPackage.LIST_OF_DRIVERS__RTEP_PACKET_DRIVER:
				getRTEPPacketDriver().clear();
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
			case ModelPackage.LIST_OF_DRIVERS__GROUP:
				return group != null && !group.isEmpty();
			case ModelPackage.LIST_OF_DRIVERS__PACKET_DRIVER:
				return !getPacketDriver().isEmpty();
			case ModelPackage.LIST_OF_DRIVERS__CHARACTER_PACKET_DRIVER:
				return !getCharacterPacketDriver().isEmpty();
			case ModelPackage.LIST_OF_DRIVERS__RTEP_PACKET_DRIVER:
				return !getRTEPPacketDriver().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ListOfDriversImpl
