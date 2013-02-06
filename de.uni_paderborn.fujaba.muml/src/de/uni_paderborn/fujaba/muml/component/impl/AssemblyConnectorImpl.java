/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.uni_paderborn.fujaba.muml.component.AssemblyConnector;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.AssemblyConnectorImpl#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.impl.AssemblyConnectorImpl#getComponentParts <em>Component Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyConnectorImpl extends PortConnectorImpl implements AssemblyConnector {
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
	 * The cached value of the '{@link #getComponentParts() <em>Component Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentParts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPart> componentParts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.ASSEMBLY_CONNECTOR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL, oldCoordinationProtocol, coordinationProtocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL, oldCoordinationProtocol, coordinationProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentPart> getComponentParts() {
		if (componentParts == null) {
			componentParts = new EObjectResolvingEList<ComponentPart>(ComponentPart.class, this, ComponentPackage.ASSEMBLY_CONNECTOR__COMPONENT_PARTS);
		}
		return componentParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL:
				if (resolve) return getCoordinationProtocol();
				return basicGetCoordinationProtocol();
			case ComponentPackage.ASSEMBLY_CONNECTOR__COMPONENT_PARTS:
				return getComponentParts();
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
			case ComponentPackage.ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL:
				setCoordinationProtocol((CoordinationProtocol)newValue);
				return;
			case ComponentPackage.ASSEMBLY_CONNECTOR__COMPONENT_PARTS:
				getComponentParts().clear();
				getComponentParts().addAll((Collection<? extends ComponentPart>)newValue);
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
			case ComponentPackage.ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL:
				setCoordinationProtocol((CoordinationProtocol)null);
				return;
			case ComponentPackage.ASSEMBLY_CONNECTOR__COMPONENT_PARTS:
				getComponentParts().clear();
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
			case ComponentPackage.ASSEMBLY_CONNECTOR__COORDINATION_PROTOCOL:
				return coordinationProtocol != null;
			case ComponentPackage.ASSEMBLY_CONNECTOR__COMPONENT_PARTS:
				return componentParts != null && !componentParts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssemblyConnectorImpl
