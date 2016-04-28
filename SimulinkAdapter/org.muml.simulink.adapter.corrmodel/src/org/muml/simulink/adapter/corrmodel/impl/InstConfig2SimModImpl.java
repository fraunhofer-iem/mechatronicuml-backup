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
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.simulink.BusCreator;
import org.muml.simulink.BusSelector;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.Line;
import org.muml.simulink.OutPortBlock;
import org.muml.simulink.SubSystem;
import org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;
import org.muml.simulink.adapter.corrmodel.InstConfig2SimMod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inst Config2 Sim Mod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl#getInstConfig <em>Inst Config</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl#getSubSys <em>Sub Sys</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl#getCommunicationSwitch <em>Communication Switch</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl#getBusCreator <em>Bus Creator</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl#getBusSelector <em>Bus Selector</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl#getBusCreatorOutPort <em>Bus Creator Out Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl#getBusSelectorInPort <em>Bus Selector In Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl#getBusOfBusses <em>Bus Of Busses</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl#getCS_inPort <em>CS in Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl#getCS_outPort <em>CS out Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl#getCompInstName <em>Comp Inst Name</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.InstConfig2SimModImpl#getModelElementCategory <em>Model Element Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstConfig2SimModImpl extends AbstractContainerCorrespondenceNodeImpl implements InstConfig2SimMod {
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
	protected SubSystem subSys;

	/**
	 * The cached value of the '{@link #getCommunicationSwitch() <em>Communication Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationSwitch()
	 * @generated
	 * @ordered
	 */
	protected SubSystem communicationSwitch;

	/**
	 * The cached value of the '{@link #getBusCreator() <em>Bus Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusCreator()
	 * @generated
	 * @ordered
	 */
	protected BusCreator busCreator;

	/**
	 * The cached value of the '{@link #getBusSelector() <em>Bus Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSelector()
	 * @generated
	 * @ordered
	 */
	protected BusSelector busSelector;

	/**
	 * The cached value of the '{@link #getBusCreatorOutPort() <em>Bus Creator Out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusCreatorOutPort()
	 * @generated
	 * @ordered
	 */
	protected OutPortBlock busCreatorOutPort;

	/**
	 * The cached value of the '{@link #getBusSelectorInPort() <em>Bus Selector In Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSelectorInPort()
	 * @generated
	 * @ordered
	 */
	protected InPortBlock busSelectorInPort;

	/**
	 * The cached value of the '{@link #getBusOfBusses() <em>Bus Of Busses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusOfBusses()
	 * @generated
	 * @ordered
	 */
	protected Line busOfBusses;

	/**
	 * The cached value of the '{@link #getCS_inPort() <em>CS in Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCS_inPort()
	 * @generated
	 * @ordered
	 */
	protected InPortBlock cS_inPort;

	/**
	 * The cached value of the '{@link #getCS_outPort() <em>CS out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCS_outPort()
	 * @generated
	 * @ordered
	 */
	protected OutPortBlock cS_outPort;

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
	 * The cached value of the '{@link #getModelElementCategory() <em>Model Element Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElementCategory()
	 * @generated
	 * @ordered
	 */
	protected ModelElementCategory modelElementCategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstConfig2SimModImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fujaba2simulinkPackage.Literals.INST_CONFIG2_SIM_MOD;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__INST_CONFIG, oldInstConfig, instConfig));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__INST_CONFIG, oldInstConfig, instConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem getSubSys() {
		if (subSys != null && ((EObject)subSys).eIsProxy()) {
			InternalEObject oldSubSys = (InternalEObject)subSys;
			subSys = (SubSystem)eResolveProxy(oldSubSys);
			if (subSys != oldSubSys) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__SUB_SYS, oldSubSys, subSys));
			}
		}
		return subSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem basicGetSubSys() {
		return subSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubSys(SubSystem newSubSys) {
		SubSystem oldSubSys = subSys;
		subSys = newSubSys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__SUB_SYS, oldSubSys, subSys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem getCommunicationSwitch() {
		if (communicationSwitch != null && ((EObject)communicationSwitch).eIsProxy()) {
			InternalEObject oldCommunicationSwitch = (InternalEObject)communicationSwitch;
			communicationSwitch = (SubSystem)eResolveProxy(oldCommunicationSwitch);
			if (communicationSwitch != oldCommunicationSwitch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMMUNICATION_SWITCH, oldCommunicationSwitch, communicationSwitch));
			}
		}
		return communicationSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem basicGetCommunicationSwitch() {
		return communicationSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationSwitch(SubSystem newCommunicationSwitch) {
		SubSystem oldCommunicationSwitch = communicationSwitch;
		communicationSwitch = newCommunicationSwitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMMUNICATION_SWITCH, oldCommunicationSwitch, communicationSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusCreator getBusCreator() {
		if (busCreator != null && ((EObject)busCreator).eIsProxy()) {
			InternalEObject oldBusCreator = (InternalEObject)busCreator;
			busCreator = (BusCreator)eResolveProxy(oldBusCreator);
			if (busCreator != oldBusCreator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR, oldBusCreator, busCreator));
			}
		}
		return busCreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusCreator basicGetBusCreator() {
		return busCreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusCreator(BusCreator newBusCreator) {
		BusCreator oldBusCreator = busCreator;
		busCreator = newBusCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR, oldBusCreator, busCreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSelector getBusSelector() {
		if (busSelector != null && ((EObject)busSelector).eIsProxy()) {
			InternalEObject oldBusSelector = (InternalEObject)busSelector;
			busSelector = (BusSelector)eResolveProxy(oldBusSelector);
			if (busSelector != oldBusSelector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR, oldBusSelector, busSelector));
			}
		}
		return busSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSelector basicGetBusSelector() {
		return busSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusSelector(BusSelector newBusSelector) {
		BusSelector oldBusSelector = busSelector;
		busSelector = newBusSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR, oldBusSelector, busSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock getBusCreatorOutPort() {
		if (busCreatorOutPort != null && ((EObject)busCreatorOutPort).eIsProxy()) {
			InternalEObject oldBusCreatorOutPort = (InternalEObject)busCreatorOutPort;
			busCreatorOutPort = (OutPortBlock)eResolveProxy(oldBusCreatorOutPort);
			if (busCreatorOutPort != oldBusCreatorOutPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR_OUT_PORT, oldBusCreatorOutPort, busCreatorOutPort));
			}
		}
		return busCreatorOutPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock basicGetBusCreatorOutPort() {
		return busCreatorOutPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusCreatorOutPort(OutPortBlock newBusCreatorOutPort) {
		OutPortBlock oldBusCreatorOutPort = busCreatorOutPort;
		busCreatorOutPort = newBusCreatorOutPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR_OUT_PORT, oldBusCreatorOutPort, busCreatorOutPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock getBusSelectorInPort() {
		if (busSelectorInPort != null && ((EObject)busSelectorInPort).eIsProxy()) {
			InternalEObject oldBusSelectorInPort = (InternalEObject)busSelectorInPort;
			busSelectorInPort = (InPortBlock)eResolveProxy(oldBusSelectorInPort);
			if (busSelectorInPort != oldBusSelectorInPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR_IN_PORT, oldBusSelectorInPort, busSelectorInPort));
			}
		}
		return busSelectorInPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock basicGetBusSelectorInPort() {
		return busSelectorInPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusSelectorInPort(InPortBlock newBusSelectorInPort) {
		InPortBlock oldBusSelectorInPort = busSelectorInPort;
		busSelectorInPort = newBusSelectorInPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR_IN_PORT, oldBusSelectorInPort, busSelectorInPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getBusOfBusses() {
		if (busOfBusses != null && ((EObject)busOfBusses).eIsProxy()) {
			InternalEObject oldBusOfBusses = (InternalEObject)busOfBusses;
			busOfBusses = (Line)eResolveProxy(oldBusOfBusses);
			if (busOfBusses != oldBusOfBusses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_OF_BUSSES, oldBusOfBusses, busOfBusses));
			}
		}
		return busOfBusses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line basicGetBusOfBusses() {
		return busOfBusses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusOfBusses(Line newBusOfBusses) {
		Line oldBusOfBusses = busOfBusses;
		busOfBusses = newBusOfBusses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_OF_BUSSES, oldBusOfBusses, busOfBusses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock getCS_inPort() {
		if (cS_inPort != null && ((EObject)cS_inPort).eIsProxy()) {
			InternalEObject oldCS_inPort = (InternalEObject)cS_inPort;
			cS_inPort = (InPortBlock)eResolveProxy(oldCS_inPort);
			if (cS_inPort != oldCS_inPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_IN_PORT, oldCS_inPort, cS_inPort));
			}
		}
		return cS_inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock basicGetCS_inPort() {
		return cS_inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCS_inPort(InPortBlock newCS_inPort) {
		InPortBlock oldCS_inPort = cS_inPort;
		cS_inPort = newCS_inPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_IN_PORT, oldCS_inPort, cS_inPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock getCS_outPort() {
		if (cS_outPort != null && ((EObject)cS_outPort).eIsProxy()) {
			InternalEObject oldCS_outPort = (InternalEObject)cS_outPort;
			cS_outPort = (OutPortBlock)eResolveProxy(oldCS_outPort);
			if (cS_outPort != oldCS_outPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_OUT_PORT, oldCS_outPort, cS_outPort));
			}
		}
		return cS_outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock basicGetCS_outPort() {
		return cS_outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCS_outPort(OutPortBlock newCS_outPort) {
		OutPortBlock oldCS_outPort = cS_outPort;
		cS_outPort = newCS_outPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_OUT_PORT, oldCS_outPort, cS_outPort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMP_INST_NAME, oldCompInstName, compInstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementCategory getModelElementCategory() {
		if (modelElementCategory != null && modelElementCategory.eIsProxy()) {
			InternalEObject oldModelElementCategory = (InternalEObject)modelElementCategory;
			modelElementCategory = (ModelElementCategory)eResolveProxy(oldModelElementCategory);
			if (modelElementCategory != oldModelElementCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__MODEL_ELEMENT_CATEGORY, oldModelElementCategory, modelElementCategory));
			}
		}
		return modelElementCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementCategory basicGetModelElementCategory() {
		return modelElementCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElementCategory(ModelElementCategory newModelElementCategory) {
		ModelElementCategory oldModelElementCategory = modelElementCategory;
		modelElementCategory = newModelElementCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__MODEL_ELEMENT_CATEGORY, oldModelElementCategory, modelElementCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__INST_CONFIG:
				if (resolve) return getInstConfig();
				return basicGetInstConfig();
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__SUB_SYS:
				if (resolve) return getSubSys();
				return basicGetSubSys();
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMMUNICATION_SWITCH:
				if (resolve) return getCommunicationSwitch();
				return basicGetCommunicationSwitch();
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR:
				if (resolve) return getBusCreator();
				return basicGetBusCreator();
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR:
				if (resolve) return getBusSelector();
				return basicGetBusSelector();
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR_OUT_PORT:
				if (resolve) return getBusCreatorOutPort();
				return basicGetBusCreatorOutPort();
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR_IN_PORT:
				if (resolve) return getBusSelectorInPort();
				return basicGetBusSelectorInPort();
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_OF_BUSSES:
				if (resolve) return getBusOfBusses();
				return basicGetBusOfBusses();
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_IN_PORT:
				if (resolve) return getCS_inPort();
				return basicGetCS_inPort();
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_OUT_PORT:
				if (resolve) return getCS_outPort();
				return basicGetCS_outPort();
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMP_INST_NAME:
				return getCompInstName();
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__MODEL_ELEMENT_CATEGORY:
				if (resolve) return getModelElementCategory();
				return basicGetModelElementCategory();
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
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__INST_CONFIG:
				setInstConfig((ComponentInstanceConfiguration)newValue);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__SUB_SYS:
				setSubSys((SubSystem)newValue);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMMUNICATION_SWITCH:
				setCommunicationSwitch((SubSystem)newValue);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR:
				setBusCreator((BusCreator)newValue);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR:
				setBusSelector((BusSelector)newValue);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR_OUT_PORT:
				setBusCreatorOutPort((OutPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR_IN_PORT:
				setBusSelectorInPort((InPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_OF_BUSSES:
				setBusOfBusses((Line)newValue);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_IN_PORT:
				setCS_inPort((InPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_OUT_PORT:
				setCS_outPort((OutPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMP_INST_NAME:
				setCompInstName((String)newValue);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__MODEL_ELEMENT_CATEGORY:
				setModelElementCategory((ModelElementCategory)newValue);
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
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__INST_CONFIG:
				setInstConfig((ComponentInstanceConfiguration)null);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__SUB_SYS:
				setSubSys((SubSystem)null);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMMUNICATION_SWITCH:
				setCommunicationSwitch((SubSystem)null);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR:
				setBusCreator((BusCreator)null);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR:
				setBusSelector((BusSelector)null);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR_OUT_PORT:
				setBusCreatorOutPort((OutPortBlock)null);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR_IN_PORT:
				setBusSelectorInPort((InPortBlock)null);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_OF_BUSSES:
				setBusOfBusses((Line)null);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_IN_PORT:
				setCS_inPort((InPortBlock)null);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_OUT_PORT:
				setCS_outPort((OutPortBlock)null);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMP_INST_NAME:
				setCompInstName(COMP_INST_NAME_EDEFAULT);
				return;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__MODEL_ELEMENT_CATEGORY:
				setModelElementCategory((ModelElementCategory)null);
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
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__INST_CONFIG:
				return instConfig != null;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__SUB_SYS:
				return subSys != null;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMMUNICATION_SWITCH:
				return communicationSwitch != null;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR:
				return busCreator != null;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR:
				return busSelector != null;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR_OUT_PORT:
				return busCreatorOutPort != null;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR_IN_PORT:
				return busSelectorInPort != null;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_OF_BUSSES:
				return busOfBusses != null;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_IN_PORT:
				return cS_inPort != null;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_OUT_PORT:
				return cS_outPort != null;
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMP_INST_NAME:
				return COMP_INST_NAME_EDEFAULT == null ? compInstName != null : !COMP_INST_NAME_EDEFAULT.equals(compInstName);
			case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__MODEL_ELEMENT_CATEGORY:
				return modelElementCategory != null;
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
				case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__INST_CONFIG: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__INST_CONFIG;
				case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__SUB_SYS: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__SUB_SYS;
				case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMMUNICATION_SWITCH: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__COMMUNICATION_SWITCH;
				case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_CREATOR;
				case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_SELECTOR;
				case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR_OUT_PORT: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_CREATOR_OUT_PORT;
				case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR_IN_PORT: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_SELECTOR_IN_PORT;
				case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_OF_BUSSES: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_OF_BUSSES;
				case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_IN_PORT: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__CS_IN_PORT;
				case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_OUT_PORT: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__CS_OUT_PORT;
				case Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMP_INST_NAME: return Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__COMP_INST_NAME;
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
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__INST_CONFIG: return Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__INST_CONFIG;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__SUB_SYS: return Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__SUB_SYS;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__COMMUNICATION_SWITCH: return Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMMUNICATION_SWITCH;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_CREATOR: return Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_SELECTOR: return Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_CREATOR_OUT_PORT: return Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_CREATOR_OUT_PORT;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_SELECTOR_IN_PORT: return Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_SELECTOR_IN_PORT;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__BUS_OF_BUSSES: return Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__BUS_OF_BUSSES;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__CS_IN_PORT: return Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_IN_PORT;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__CS_OUT_PORT: return Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__CS_OUT_PORT;
				case Fujaba2simulinkPackage.COMP_INST_CONFIG2_SUB_SYS__COMP_INST_NAME: return Fujaba2simulinkPackage.INST_CONFIG2_SIM_MOD__COMP_INST_NAME;
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

} //InstConfig2SimModImpl
