/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.storydriven.core.impl.CommentableElementImpl;

import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.CoordinationProtocolOccurrence;
import de.uni_paderborn.fujaba.muml.component.PortPart;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Protocol Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.CoordinationProtocolOccurrenceImpl#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.CoordinationProtocolOccurrenceImpl#getPortParts <em>Port Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinationProtocolOccurrenceImpl extends CommentableElementImpl implements CoordinationProtocolOccurrence {
	/**
	 * The cached value of the '{@link #getCoordinationProtocol() <em>Coordination Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationProtocol()
	 * @generated
	 * @ordered
	 */
	protected CoordinationProtocol coordinationProtocol;

	/**
	 * The cached value of the '{@link #getPortParts() <em>Port Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortParts()
	 * @generated
	 * @ordered
	 */
	protected EList<PortPart> portParts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationProtocolOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.COORDINATION_PROTOCOL_OCCURRENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocol getCoordinationProtocol() {
		if (coordinationProtocol != null && coordinationProtocol.eIsProxy()) {
			InternalEObject oldCoordinationProtocol = (InternalEObject)coordinationProtocol;
			coordinationProtocol = (CoordinationProtocol)eResolveProxy(oldCoordinationProtocol);
			if (coordinationProtocol != oldCoordinationProtocol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__COORDINATION_PROTOCOL, oldCoordinationProtocol, coordinationProtocol));
			}
		}
		return coordinationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocol basicGetCoordinationProtocol() {
		return coordinationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationProtocol(CoordinationProtocol newCoordinationProtocol) {
		CoordinationProtocol oldCoordinationProtocol = coordinationProtocol;
		coordinationProtocol = newCoordinationProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__COORDINATION_PROTOCOL, oldCoordinationProtocol, coordinationProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortPart> getPortParts() {
		if (portParts == null) {
			portParts = new EObjectWithInverseResolvingEList<PortPart>(PortPart.class, this, ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORT_PARTS, ComponentPackage.PORT_PART__COORDINATION_PROTOCOL_OCCURENCE);
		}
		return portParts;
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
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORT_PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPortParts()).basicAdd(otherEnd, msgs);
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
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORT_PARTS:
				return ((InternalEList<?>)getPortParts()).basicRemove(otherEnd, msgs);
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
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__COORDINATION_PROTOCOL:
				if (resolve) return getCoordinationProtocol();
				return basicGetCoordinationProtocol();
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORT_PARTS:
				return getPortParts();
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
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__COORDINATION_PROTOCOL:
				setCoordinationProtocol((CoordinationProtocol)newValue);
				return;
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORT_PARTS:
				getPortParts().clear();
				getPortParts().addAll((Collection<? extends PortPart>)newValue);
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
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__COORDINATION_PROTOCOL:
				setCoordinationProtocol((CoordinationProtocol)null);
				return;
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORT_PARTS:
				getPortParts().clear();
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
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__COORDINATION_PROTOCOL:
				return coordinationProtocol != null;
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORT_PARTS:
				return portParts != null && !portParts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoordinationProtocolOccurrenceImpl
