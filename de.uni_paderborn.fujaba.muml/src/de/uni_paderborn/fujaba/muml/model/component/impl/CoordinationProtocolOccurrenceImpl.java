/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.storydriven.core.impl.CommentableElementImpl;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.CoordinationProtocolOccurrence;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Protocol Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.CoordinationProtocolOccurrenceImpl#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.CoordinationProtocolOccurrenceImpl#getPorts <em>Ports</em>}</li>
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
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

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
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectResolvingEList<Port>(Port.class, this, ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORTS);
		}
		return ports;
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
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORTS:
				return getPorts();
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
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
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
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORTS:
				getPorts().clear();
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
			case ComponentPackage.COORDINATION_PROTOCOL_OCCURRENCE__PORTS:
				return ports != null && !ports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoordinationProtocolOccurrenceImpl
