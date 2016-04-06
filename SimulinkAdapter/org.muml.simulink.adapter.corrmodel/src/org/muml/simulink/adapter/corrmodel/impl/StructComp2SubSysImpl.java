/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.component.Component;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;
import org.muml.simulink.adapter.corrmodel.StructComp2SubSys;
import org.muml.simulink.adapter.model.BusCreator;
import org.muml.simulink.adapter.model.BusSelector;
import org.muml.simulink.adapter.model.InPortBlock;
import org.muml.simulink.adapter.model.LibraryReference;
import org.muml.simulink.adapter.model.Line;
import org.muml.simulink.adapter.model.OutPortBlock;
import org.muml.simulink.adapter.model.SubSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Comp2 Sub Sys</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl#getInstConfig <em>Inst Config</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl#getSubSys <em>Sub Sys</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl#getCommunicationSwitch <em>Communication Switch</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl#getBusCreator <em>Bus Creator</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl#getBusSelector <em>Bus Selector</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl#getBusCreatorOutPort <em>Bus Creator Out Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl#getBusSelectorInPort <em>Bus Selector In Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl#getBusOfBusses <em>Bus Of Busses</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl#getCS_inPort <em>CS in Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl#getCS_outPort <em>CS out Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl#getCompInstName <em>Comp Inst Name</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl#getLibraryReference <em>Library Reference</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.StructComp2SubSysImpl#getComp <em>Comp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructComp2SubSysImpl extends AbstractContainerCorrespondenceNodeImpl implements StructComp2SubSys {
	/**
	 * The cached value of the '{@link #getInstConfig() <em>Inst Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstConfig()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstanceConfiguration instConfig;

	/**
	 * The cached value of the '{@link #getSubSys() <em>Sub Sys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSys()
	 * @generated
	 * @ordered
	 */
	protected de.uni_paderborn.fujaba.simulink.model.SubSystem subSys;

	/**
	 * The cached value of the '{@link #getCommunicationSwitch() <em>Communication Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationSwitch()
	 * @generated
	 * @ordered
	 */
	protected de.uni_paderborn.fujaba.simulink.model.SubSystem communicationSwitch;

	/**
	 * The cached value of the '{@link #getBusCreator() <em>Bus Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusCreator()
	 * @generated
	 * @ordered
	 */
	protected de.uni_paderborn.fujaba.simulink.model.BusCreator busCreator;

	/**
	 * The cached value of the '{@link #getBusSelector() <em>Bus Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSelector()
	 * @generated
	 * @ordered
	 */
	protected de.uni_paderborn.fujaba.simulink.model.BusSelector busSelector;

	/**
	 * The cached value of the '{@link #getBusCreatorOutPort() <em>Bus Creator Out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusCreatorOutPort()
	 * @generated
	 * @ordered
	 */
	protected de.uni_paderborn.fujaba.simulink.model.OutPortBlock busCreatorOutPort;

	/**
	 * The cached value of the '{@link #getBusSelectorInPort() <em>Bus Selector In Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSelectorInPort()
	 * @generated
	 * @ordered
	 */
	protected de.uni_paderborn.fujaba.simulink.model.InPortBlock busSelectorInPort;

	/**
	 * The cached value of the '{@link #getBusOfBusses() <em>Bus Of Busses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusOfBusses()
	 * @generated
	 * @ordered
	 */
	protected de.uni_paderborn.fujaba.simulink.model.Line busOfBusses;

	/**
	 * The cached value of the '{@link #getCS_inPort() <em>CS in Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCS_inPort()
	 * @generated
	 * @ordered
	 */
	protected de.uni_paderborn.fujaba.simulink.model.InPortBlock cS_inPort;

	/**
	 * The cached value of the '{@link #getCS_outPort() <em>CS out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCS_outPort()
	 * @generated
	 * @ordered
	 */
	protected de.uni_paderborn.fujaba.simulink.model.OutPortBlock cS_outPort;

	/**
	 * The default value of the '{@link #getCompInstName() <em>Comp Inst Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompInstName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMP_INST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompInstName() <em>Comp Inst Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompInstName()
	 * @generated
	 * @ordered
	 */
	protected String compInstName = COMP_INST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponentInstance() <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance componentInstance;

	/**
	 * The cached value of the '{@link #getLibraryReference() <em>Library Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryReference()
	 * @generated
	 * @ordered
	 */
	protected de.uni_paderborn.fujaba.simulink.model.LibraryReference libraryReference;

	/**
	 * The cached value of the '{@link #getComp() <em>Comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp()
	 * @generated
	 * @ordered
	 */
	protected Component comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructComp2SubSysImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fujaba2simulinkPackage.Literals.STRUCT_COMP2_SUB_SYS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration getInstConfig() {
		if (instConfig != null && instConfig.eIsProxy()) {
			InternalEObject oldInstConfig = (InternalEObject)instConfig;
			instConfig = (ComponentInstanceConfiguration)eResolveProxy(oldInstConfig);
			if (instConfig != oldInstConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__INST_CONFIG, oldInstConfig, instConfig));
			}
		}
		return instConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration basicGetInstConfig() {
		return instConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstConfig(ComponentInstanceConfiguration newInstConfig) {
		ComponentInstanceConfiguration oldInstConfig = instConfig;
		instConfig = newInstConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__INST_CONFIG, oldInstConfig, instConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.SubSystem getSubSys() {
		if (subSys != null && ((EObject)subSys).eIsProxy()) {
			InternalEObject oldSubSys = (InternalEObject)subSys;
			subSys = (de.uni_paderborn.fujaba.simulink.model.SubSystem)eResolveProxy(oldSubSys);
			if (subSys != oldSubSys) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__SUB_SYS, oldSubSys, subSys));
			}
		}
		return subSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.SubSystem basicGetSubSys() {
		return subSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubSys(de.uni_paderborn.fujaba.simulink.model.SubSystem newSubSys) {
		de.uni_paderborn.fujaba.simulink.model.SubSystem oldSubSys = subSys;
		subSys = newSubSys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__SUB_SYS, oldSubSys, subSys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.SubSystem getCommunicationSwitch() {
		if (communicationSwitch != null && ((EObject)communicationSwitch).eIsProxy()) {
			InternalEObject oldCommunicationSwitch = (InternalEObject)communicationSwitch;
			communicationSwitch = (de.uni_paderborn.fujaba.simulink.model.SubSystem)eResolveProxy(oldCommunicationSwitch);
			if (communicationSwitch != oldCommunicationSwitch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMMUNICATION_SWITCH, oldCommunicationSwitch, communicationSwitch));
			}
		}
		return communicationSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.SubSystem basicGetCommunicationSwitch() {
		return communicationSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationSwitch(de.uni_paderborn.fujaba.simulink.model.SubSystem newCommunicationSwitch) {
		de.uni_paderborn.fujaba.simulink.model.SubSystem oldCommunicationSwitch = communicationSwitch;
		communicationSwitch = newCommunicationSwitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMMUNICATION_SWITCH, oldCommunicationSwitch, communicationSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.BusCreator getBusCreator() {
		if (busCreator != null && ((EObject)busCreator).eIsProxy()) {
			InternalEObject oldBusCreator = (InternalEObject)busCreator;
			busCreator = (de.uni_paderborn.fujaba.simulink.model.BusCreator)eResolveProxy(oldBusCreator);
			if (busCreator != oldBusCreator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR, oldBusCreator, busCreator));
			}
		}
		return busCreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.BusCreator basicGetBusCreator() {
		return busCreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusCreator(de.uni_paderborn.fujaba.simulink.model.BusCreator newBusCreator) {
		de.uni_paderborn.fujaba.simulink.model.BusCreator oldBusCreator = busCreator;
		busCreator = newBusCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR, oldBusCreator, busCreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.BusSelector getBusSelector() {
		if (busSelector != null && ((EObject)busSelector).eIsProxy()) {
			InternalEObject oldBusSelector = (InternalEObject)busSelector;
			busSelector = (de.uni_paderborn.fujaba.simulink.model.BusSelector)eResolveProxy(oldBusSelector);
			if (busSelector != oldBusSelector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR, oldBusSelector, busSelector));
			}
		}
		return busSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.BusSelector basicGetBusSelector() {
		return busSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusSelector(de.uni_paderborn.fujaba.simulink.model.BusSelector newBusSelector) {
		de.uni_paderborn.fujaba.simulink.model.BusSelector oldBusSelector = busSelector;
		busSelector = newBusSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR, oldBusSelector, busSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.OutPortBlock getBusCreatorOutPort() {
		if (busCreatorOutPort != null && ((EObject)busCreatorOutPort).eIsProxy()) {
			InternalEObject oldBusCreatorOutPort = (InternalEObject)busCreatorOutPort;
			busCreatorOutPort = (de.uni_paderborn.fujaba.simulink.model.OutPortBlock)eResolveProxy(oldBusCreatorOutPort);
			if (busCreatorOutPort != oldBusCreatorOutPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR_OUT_PORT, oldBusCreatorOutPort, busCreatorOutPort));
			}
		}
		return busCreatorOutPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.OutPortBlock basicGetBusCreatorOutPort() {
		return busCreatorOutPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusCreatorOutPort(de.uni_paderborn.fujaba.simulink.model.OutPortBlock newBusCreatorOutPort) {
		de.uni_paderborn.fujaba.simulink.model.OutPortBlock oldBusCreatorOutPort = busCreatorOutPort;
		busCreatorOutPort = newBusCreatorOutPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR_OUT_PORT, oldBusCreatorOutPort, busCreatorOutPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.InPortBlock getBusSelectorInPort() {
		if (busSelectorInPort != null && ((EObject)busSelectorInPort).eIsProxy()) {
			InternalEObject oldBusSelectorInPort = (InternalEObject)busSelectorInPort;
			busSelectorInPort = (de.uni_paderborn.fujaba.simulink.model.InPortBlock)eResolveProxy(oldBusSelectorInPort);
			if (busSelectorInPort != oldBusSelectorInPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR_IN_PORT, oldBusSelectorInPort, busSelectorInPort));
			}
		}
		return busSelectorInPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.InPortBlock basicGetBusSelectorInPort() {
		return busSelectorInPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusSelectorInPort(de.uni_paderborn.fujaba.simulink.model.InPortBlock newBusSelectorInPort) {
		de.uni_paderborn.fujaba.simulink.model.InPortBlock oldBusSelectorInPort = busSelectorInPort;
		busSelectorInPort = newBusSelectorInPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR_IN_PORT, oldBusSelectorInPort, busSelectorInPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.Line getBusOfBusses() {
		if (busOfBusses != null && ((EObject)busOfBusses).eIsProxy()) {
			InternalEObject oldBusOfBusses = (InternalEObject)busOfBusses;
			busOfBusses = (de.uni_paderborn.fujaba.simulink.model.Line)eResolveProxy(oldBusOfBusses);
			if (busOfBusses != oldBusOfBusses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_OF_BUSSES, oldBusOfBusses, busOfBusses));
			}
		}
		return busOfBusses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.Line basicGetBusOfBusses() {
		return busOfBusses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusOfBusses(de.uni_paderborn.fujaba.simulink.model.Line newBusOfBusses) {
		de.uni_paderborn.fujaba.simulink.model.Line oldBusOfBusses = busOfBusses;
		busOfBusses = newBusOfBusses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_OF_BUSSES, oldBusOfBusses, busOfBusses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.InPortBlock getCS_inPort() {
		if (cS_inPort != null && ((EObject)cS_inPort).eIsProxy()) {
			InternalEObject oldCS_inPort = (InternalEObject)cS_inPort;
			cS_inPort = (de.uni_paderborn.fujaba.simulink.model.InPortBlock)eResolveProxy(oldCS_inPort);
			if (cS_inPort != oldCS_inPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_IN_PORT, oldCS_inPort, cS_inPort));
			}
		}
		return cS_inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.InPortBlock basicGetCS_inPort() {
		return cS_inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCS_inPort(de.uni_paderborn.fujaba.simulink.model.InPortBlock newCS_inPort) {
		de.uni_paderborn.fujaba.simulink.model.InPortBlock oldCS_inPort = cS_inPort;
		cS_inPort = newCS_inPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_IN_PORT, oldCS_inPort, cS_inPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.OutPortBlock getCS_outPort() {
		if (cS_outPort != null && ((EObject)cS_outPort).eIsProxy()) {
			InternalEObject oldCS_outPort = (InternalEObject)cS_outPort;
			cS_outPort = (de.uni_paderborn.fujaba.simulink.model.OutPortBlock)eResolveProxy(oldCS_outPort);
			if (cS_outPort != oldCS_outPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_OUT_PORT, oldCS_outPort, cS_outPort));
			}
		}
		return cS_outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.OutPortBlock basicGetCS_outPort() {
		return cS_outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCS_outPort(de.uni_paderborn.fujaba.simulink.model.OutPortBlock newCS_outPort) {
		de.uni_paderborn.fujaba.simulink.model.OutPortBlock oldCS_outPort = cS_outPort;
		cS_outPort = newCS_outPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_OUT_PORT, oldCS_outPort, cS_outPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompInstName() {
		return compInstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompInstName(String newCompInstName) {
		String oldCompInstName = compInstName;
		compInstName = newCompInstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMP_INST_NAME, oldCompInstName, compInstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getComponentInstance() {
		if (componentInstance != null && componentInstance.eIsProxy()) {
			InternalEObject oldComponentInstance = (InternalEObject)componentInstance;
			componentInstance = (ComponentInstance)eResolveProxy(oldComponentInstance);
			if (componentInstance != oldComponentInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
			}
		}
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetComponentInstance() {
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstance(ComponentInstance newComponentInstance) {
		ComponentInstance oldComponentInstance = componentInstance;
		componentInstance = newComponentInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.LibraryReference getLibraryReference() {
		if (libraryReference != null && ((EObject)libraryReference).eIsProxy()) {
			InternalEObject oldLibraryReference = (InternalEObject)libraryReference;
			libraryReference = (de.uni_paderborn.fujaba.simulink.model.LibraryReference)eResolveProxy(oldLibraryReference);
			if (libraryReference != oldLibraryReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__LIBRARY_REFERENCE, oldLibraryReference, libraryReference));
			}
		}
		return libraryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.simulink.model.LibraryReference basicGetLibraryReference() {
		return libraryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryReference(de.uni_paderborn.fujaba.simulink.model.LibraryReference newLibraryReference) {
		de.uni_paderborn.fujaba.simulink.model.LibraryReference oldLibraryReference = libraryReference;
		libraryReference = newLibraryReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__LIBRARY_REFERENCE, oldLibraryReference, libraryReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComp() {
		if (comp != null && comp.eIsProxy()) {
			InternalEObject oldComp = (InternalEObject)comp;
			comp = (Component)eResolveProxy(oldComp);
			if (comp != oldComp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMP, oldComp, comp));
			}
		}
		return comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComp() {
		return comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComp(Component newComp) {
		Component oldComp = comp;
		comp = newComp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMP, oldComp, comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__INST_CONFIG:
				if (resolve) return getInstConfig();
				return basicGetInstConfig();
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__SUB_SYS:
				if (resolve) return getSubSys();
				return basicGetSubSys();
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMMUNICATION_SWITCH:
				if (resolve) return getCommunicationSwitch();
				return basicGetCommunicationSwitch();
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR:
				if (resolve) return getBusCreator();
				return basicGetBusCreator();
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR:
				if (resolve) return getBusSelector();
				return basicGetBusSelector();
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR_OUT_PORT:
				if (resolve) return getBusCreatorOutPort();
				return basicGetBusCreatorOutPort();
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR_IN_PORT:
				if (resolve) return getBusSelectorInPort();
				return basicGetBusSelectorInPort();
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_OF_BUSSES:
				if (resolve) return getBusOfBusses();
				return basicGetBusOfBusses();
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_IN_PORT:
				if (resolve) return getCS_inPort();
				return basicGetCS_inPort();
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_OUT_PORT:
				if (resolve) return getCS_outPort();
				return basicGetCS_outPort();
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMP_INST_NAME:
				return getCompInstName();
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMPONENT_INSTANCE:
				if (resolve) return getComponentInstance();
				return basicGetComponentInstance();
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__LIBRARY_REFERENCE:
				if (resolve) return getLibraryReference();
				return basicGetLibraryReference();
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMP:
				if (resolve) return getComp();
				return basicGetComp();
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
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__INST_CONFIG:
				setInstConfig((ComponentInstanceConfiguration)newValue);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__SUB_SYS:
				setSubSys((de.uni_paderborn.fujaba.simulink.model.SubSystem)newValue);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMMUNICATION_SWITCH:
				setCommunicationSwitch((de.uni_paderborn.fujaba.simulink.model.SubSystem)newValue);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR:
				setBusCreator((de.uni_paderborn.fujaba.simulink.model.BusCreator)newValue);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR:
				setBusSelector((de.uni_paderborn.fujaba.simulink.model.BusSelector)newValue);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR_OUT_PORT:
				setBusCreatorOutPort((de.uni_paderborn.fujaba.simulink.model.OutPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR_IN_PORT:
				setBusSelectorInPort((de.uni_paderborn.fujaba.simulink.model.InPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_OF_BUSSES:
				setBusOfBusses((de.uni_paderborn.fujaba.simulink.model.Line)newValue);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_IN_PORT:
				setCS_inPort((de.uni_paderborn.fujaba.simulink.model.InPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_OUT_PORT:
				setCS_outPort((de.uni_paderborn.fujaba.simulink.model.OutPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMP_INST_NAME:
				setCompInstName((String)newValue);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)newValue);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__LIBRARY_REFERENCE:
				setLibraryReference((de.uni_paderborn.fujaba.simulink.model.LibraryReference)newValue);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMP:
				setComp((Component)newValue);
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
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__INST_CONFIG:
				setInstConfig((ComponentInstanceConfiguration)null);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__SUB_SYS:
				setSubSys((de.uni_paderborn.fujaba.simulink.model.SubSystem)null);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMMUNICATION_SWITCH:
				setCommunicationSwitch((de.uni_paderborn.fujaba.simulink.model.SubSystem)null);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR:
				setBusCreator((de.uni_paderborn.fujaba.simulink.model.BusCreator)null);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR:
				setBusSelector((de.uni_paderborn.fujaba.simulink.model.BusSelector)null);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR_OUT_PORT:
				setBusCreatorOutPort((de.uni_paderborn.fujaba.simulink.model.OutPortBlock)null);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR_IN_PORT:
				setBusSelectorInPort((de.uni_paderborn.fujaba.simulink.model.InPortBlock)null);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_OF_BUSSES:
				setBusOfBusses((de.uni_paderborn.fujaba.simulink.model.Line)null);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_IN_PORT:
				setCS_inPort((de.uni_paderborn.fujaba.simulink.model.InPortBlock)null);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_OUT_PORT:
				setCS_outPort((de.uni_paderborn.fujaba.simulink.model.OutPortBlock)null);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMP_INST_NAME:
				setCompInstName(COMP_INST_NAME_EDEFAULT);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)null);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__LIBRARY_REFERENCE:
				setLibraryReference((de.uni_paderborn.fujaba.simulink.model.LibraryReference)null);
				return;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMP:
				setComp((Component)null);
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
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__INST_CONFIG:
				return instConfig != null;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__SUB_SYS:
				return subSys != null;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMMUNICATION_SWITCH:
				return communicationSwitch != null;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR:
				return busCreator != null;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR:
				return busSelector != null;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR_OUT_PORT:
				return busCreatorOutPort != null;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR_IN_PORT:
				return busSelectorInPort != null;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_OF_BUSSES:
				return busOfBusses != null;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_IN_PORT:
				return cS_inPort != null;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_OUT_PORT:
				return cS_outPort != null;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMP_INST_NAME:
				return COMP_INST_NAME_EDEFAULT == null ? compInstName != null : !COMP_INST_NAME_EDEFAULT.equals(compInstName);
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMPONENT_INSTANCE:
				return componentInstance != null;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__LIBRARY_REFERENCE:
				return libraryReference != null;
			case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMP:
				return comp != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CompInstConfig2SubSys.class) {
			switch (derivedFeatureID) {
				case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__INST_CONFIG: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__INST_CONFIG;
				case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__SUB_SYS: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__SUB_SYS;
				case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMMUNICATION_SWITCH: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__COMMUNICATION_SWITCH;
				case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_CREATOR;
				case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_SELECTOR;
				case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR_OUT_PORT: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_CREATOR_OUT_PORT;
				case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR_IN_PORT: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_SELECTOR_IN_PORT;
				case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_OF_BUSSES: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_OF_BUSSES;
				case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_IN_PORT: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__CS_IN_PORT;
				case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_OUT_PORT: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__CS_OUT_PORT;
				case Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMP_INST_NAME: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__COMP_INST_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CompInstConfig2SubSys.class) {
			switch (baseFeatureID) {
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__INST_CONFIG: return Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__INST_CONFIG;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__SUB_SYS: return Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__SUB_SYS;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__COMMUNICATION_SWITCH: return Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMMUNICATION_SWITCH;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_CREATOR: return Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_SELECTOR: return Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_CREATOR_OUT_PORT: return Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_CREATOR_OUT_PORT;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_SELECTOR_IN_PORT: return Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_SELECTOR_IN_PORT;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_OF_BUSSES: return Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__BUS_OF_BUSSES;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__CS_IN_PORT: return Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_IN_PORT;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__CS_OUT_PORT: return Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__CS_OUT_PORT;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__COMP_INST_NAME: return Fujaba2simulinkPackage.STRUCT_COMP2_SUB_SYS__COMP_INST_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (compInstName: ");
		result.append(compInstName);
		result.append(')');
		return result.toString();
	}

} //StructComp2SubSysImpl
