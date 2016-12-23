/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.muml.core.modelinstance.RootNode;
import org.muml.simulink.Bus;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;
import org.muml.simulink.adapter.corrmodel.RootNode2SimulinkContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Node2 Simulink Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.RootNode2SimulinkContainerImpl#getRootNode <em>Root Node</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.RootNode2SimulinkContainerImpl#getSimulinkContainer <em>Simulink Container</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.RootNode2SimulinkContainerImpl#getPacketBus <em>Packet Bus</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.RootNode2SimulinkContainerImpl#getBusOfBusses <em>Bus Of Busses</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.RootNode2SimulinkContainerImpl#getCic2ss <em>Cic2ss</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.RootNode2SimulinkContainerImpl#getAtomCompLib <em>Atom Comp Lib</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootNode2SimulinkContainerImpl extends AbstractContainerCorrespondenceNodeImpl implements RootNode2SimulinkContainer {
	/**
	 * The cached value of the '{@link #getRootNode() <em>Root Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootNode()
	 * @generated
	 * @ordered
	 */
	protected RootNode rootNode;

	/**
	 * The cached value of the '{@link #getSimulinkContainer() <em>Simulink Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulinkContainer()
	 * @generated
	 * @ordered
	 */
	protected SimulinkContainer simulinkContainer;

	/**
	 * The cached value of the '{@link #getPacketBus() <em>Packet Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketBus()
	 * @generated
	 * @ordered
	 */
	protected Bus packetBus;

	/**
	 * The cached value of the '{@link #getBusOfBusses() <em>Bus Of Busses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusOfBusses()
	 * @generated
	 * @ordered
	 */
	protected Bus busOfBusses;

	/**
	 * The cached value of the '{@link #getCic2ss() <em>Cic2ss</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCic2ss()
	 * @generated
	 * @ordered
	 */
	protected EList<CompInstConfig2SubSys> cic2ss;

	/**
	 * The cached value of the '{@link #getAtomCompLib() <em>Atom Comp Lib</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomCompLib()
	 * @generated
	 * @ordered
	 */
	protected SimulinkLibrary atomCompLib;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootNode2SimulinkContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fujaba2simulinkPackage.Literals.ROOT_NODE2_SIMULINK_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootNode getRootNode() {
		if (rootNode != null && rootNode.eIsProxy()) {
			InternalEObject oldRootNode = (InternalEObject)rootNode;
			rootNode = (RootNode)eResolveProxy(oldRootNode);
			if (rootNode != oldRootNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__ROOT_NODE, oldRootNode, rootNode));
			}
		}
		return rootNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootNode basicGetRootNode() {
		return rootNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootNode(RootNode newRootNode) {
		RootNode oldRootNode = rootNode;
		rootNode = newRootNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__ROOT_NODE, oldRootNode, rootNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkContainer getSimulinkContainer() {
		if (simulinkContainer != null && ((EObject)simulinkContainer).eIsProxy()) {
			InternalEObject oldSimulinkContainer = (InternalEObject)simulinkContainer;
			simulinkContainer = (SimulinkContainer)eResolveProxy(oldSimulinkContainer);
			if (simulinkContainer != oldSimulinkContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__SIMULINK_CONTAINER, oldSimulinkContainer, simulinkContainer));
			}
		}
		return simulinkContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkContainer basicGetSimulinkContainer() {
		return simulinkContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulinkContainer(SimulinkContainer newSimulinkContainer) {
		SimulinkContainer oldSimulinkContainer = simulinkContainer;
		simulinkContainer = newSimulinkContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__SIMULINK_CONTAINER, oldSimulinkContainer, simulinkContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus getPacketBus() {
		if (packetBus != null && ((EObject)packetBus).eIsProxy()) {
			InternalEObject oldPacketBus = (InternalEObject)packetBus;
			packetBus = (Bus)eResolveProxy(oldPacketBus);
			if (packetBus != oldPacketBus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__PACKET_BUS, oldPacketBus, packetBus));
			}
		}
		return packetBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus basicGetPacketBus() {
		return packetBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketBus(Bus newPacketBus) {
		Bus oldPacketBus = packetBus;
		packetBus = newPacketBus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__PACKET_BUS, oldPacketBus, packetBus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus getBusOfBusses() {
		if (busOfBusses != null && ((EObject)busOfBusses).eIsProxy()) {
			InternalEObject oldBusOfBusses = (InternalEObject)busOfBusses;
			busOfBusses = (Bus)eResolveProxy(oldBusOfBusses);
			if (busOfBusses != oldBusOfBusses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__BUS_OF_BUSSES, oldBusOfBusses, busOfBusses));
			}
		}
		return busOfBusses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus basicGetBusOfBusses() {
		return busOfBusses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusOfBusses(Bus newBusOfBusses) {
		Bus oldBusOfBusses = busOfBusses;
		busOfBusses = newBusOfBusses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__BUS_OF_BUSSES, oldBusOfBusses, busOfBusses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompInstConfig2SubSys> getCic2ss() {
		if (cic2ss == null) {
			cic2ss = new EObjectResolvingEList<CompInstConfig2SubSys>(CompInstConfig2SubSys.class, this, Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__CIC2SS);
		}
		return cic2ss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkLibrary getAtomCompLib() {
		if (atomCompLib != null && ((EObject)atomCompLib).eIsProxy()) {
			InternalEObject oldAtomCompLib = (InternalEObject)atomCompLib;
			atomCompLib = (SimulinkLibrary)eResolveProxy(oldAtomCompLib);
			if (atomCompLib != oldAtomCompLib) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__ATOM_COMP_LIB, oldAtomCompLib, atomCompLib));
			}
		}
		return atomCompLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkLibrary basicGetAtomCompLib() {
		return atomCompLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtomCompLib(SimulinkLibrary newAtomCompLib) {
		SimulinkLibrary oldAtomCompLib = atomCompLib;
		atomCompLib = newAtomCompLib;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__ATOM_COMP_LIB, oldAtomCompLib, atomCompLib));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__ROOT_NODE:
				if (resolve) return getRootNode();
				return basicGetRootNode();
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__SIMULINK_CONTAINER:
				if (resolve) return getSimulinkContainer();
				return basicGetSimulinkContainer();
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__PACKET_BUS:
				if (resolve) return getPacketBus();
				return basicGetPacketBus();
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__BUS_OF_BUSSES:
				if (resolve) return getBusOfBusses();
				return basicGetBusOfBusses();
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__CIC2SS:
				return getCic2ss();
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__ATOM_COMP_LIB:
				if (resolve) return getAtomCompLib();
				return basicGetAtomCompLib();
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
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__ROOT_NODE:
				setRootNode((RootNode)newValue);
				return;
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__SIMULINK_CONTAINER:
				setSimulinkContainer((SimulinkContainer)newValue);
				return;
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__PACKET_BUS:
				setPacketBus((Bus)newValue);
				return;
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__BUS_OF_BUSSES:
				setBusOfBusses((Bus)newValue);
				return;
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__CIC2SS:
				getCic2ss().clear();
				getCic2ss().addAll((Collection<? extends CompInstConfig2SubSys>)newValue);
				return;
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__ATOM_COMP_LIB:
				setAtomCompLib((SimulinkLibrary)newValue);
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
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__ROOT_NODE:
				setRootNode((RootNode)null);
				return;
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__SIMULINK_CONTAINER:
				setSimulinkContainer((SimulinkContainer)null);
				return;
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__PACKET_BUS:
				setPacketBus((Bus)null);
				return;
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__BUS_OF_BUSSES:
				setBusOfBusses((Bus)null);
				return;
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__CIC2SS:
				getCic2ss().clear();
				return;
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__ATOM_COMP_LIB:
				setAtomCompLib((SimulinkLibrary)null);
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
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__ROOT_NODE:
				return rootNode != null;
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__SIMULINK_CONTAINER:
				return simulinkContainer != null;
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__PACKET_BUS:
				return packetBus != null;
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__BUS_OF_BUSSES:
				return busOfBusses != null;
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__CIC2SS:
				return cic2ss != null && !cic2ss.isEmpty();
			case Fujaba2simulinkPackage.ROOT_NODE2_SIMULINK_CONTAINER__ATOM_COMP_LIB:
				return atomCompLib != null;
		}
		return super.eIsSet(featureID);
	}

} //RootNode2SimulinkContainerImpl
