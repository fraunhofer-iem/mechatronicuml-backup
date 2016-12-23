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
import org.muml.pim.component.Port;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.DiscreteMultiPortInstance;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.msgtype.MessageTypeRepository;
import org.muml.pim.types.DataType;
import org.muml.simulink.Constant;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.Line;
import org.muml.simulink.OutPortBlock;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;
import org.muml.simulink.adapter.corrmodel.Port2Ports;
import org.muml.simulink.msglib.LinkLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port2 Ports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getInPort <em>In Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getHelp_inPort <em>Help in Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getHelp_outPort <em>Help out Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getPortInst <em>Port Inst</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getMultiPortInst <em>Multi Port Inst</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getCompInst <em>Comp Inst</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getSc_ReadIn <em>Sc Read In</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getSc_ReadOut <em>Sc Read Out</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getSc_WriteIn <em>Sc Write In</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getSc_WriteOut <em>Sc Write Out</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getSc_help_ReadIn <em>Sc help Read In</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getSc_help_ReadOut <em>Sc help Read Out</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getSc_help_WriteIn <em>Sc help Write In</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getSc_help_WriteOut <em>Sc help Write Out</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getMi <em>Mi</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getNet_address_inPort <em>Net address in Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getReceiver_net_address_inPort <em>Receiver net address in Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getLineFromReadOut <em>Line From Read Out</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getLineToReadIn <em>Line To Read In</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Port2PortsImpl#getLinkLayer <em>Link Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port2PortsImpl extends AbstractContainerCorrespondenceNodeImpl implements Port2Ports {
	/**
	 * The cached value of the '{@link #getInPort() <em>In Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPort()
	 * @generated
	 * @ordered
	 */
	protected InPortBlock inPort;

	/**
	 * The cached value of the '{@link #getOutPort() <em>Out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPort()
	 * @generated
	 * @ordered
	 */
	protected OutPortBlock outPort;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

	/**
	 * The cached value of the '{@link #getHelp_inPort() <em>Help in Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp_inPort()
	 * @generated
	 * @ordered
	 */
	protected InPortBlock help_inPort;

	/**
	 * The cached value of the '{@link #getHelp_outPort() <em>Help out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp_outPort()
	 * @generated
	 * @ordered
	 */
	protected OutPortBlock help_outPort;

	/**
	 * The cached value of the '{@link #getPortInst() <em>Port Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInst()
	 * @generated
	 * @ordered
	 */
	protected PortInstance portInst;

	/**
	 * The cached value of the '{@link #getMultiPortInst() <em>Multi Port Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiPortInst()
	 * @generated
	 * @ordered
	 */
	protected DiscreteMultiPortInstance multiPortInst;

	/**
	 * The cached value of the '{@link #getCompInst() <em>Comp Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompInst()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance compInst;

	/**
	 * The cached value of the '{@link #getSc_ReadIn() <em>Sc Read In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSc_ReadIn()
	 * @generated
	 * @ordered
	 */
	protected InPortBlock sc_ReadIn;

	/**
	 * The cached value of the '{@link #getSc_ReadOut() <em>Sc Read Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSc_ReadOut()
	 * @generated
	 * @ordered
	 */
	protected OutPortBlock sc_ReadOut;

	/**
	 * The cached value of the '{@link #getSc_WriteIn() <em>Sc Write In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSc_WriteIn()
	 * @generated
	 * @ordered
	 */
	protected InPortBlock sc_WriteIn;

	/**
	 * The cached value of the '{@link #getSc_WriteOut() <em>Sc Write Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSc_WriteOut()
	 * @generated
	 * @ordered
	 */
	protected OutPortBlock sc_WriteOut;

	/**
	 * The cached value of the '{@link #getSc_help_ReadIn() <em>Sc help Read In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSc_help_ReadIn()
	 * @generated
	 * @ordered
	 */
	protected OutPortBlock sc_help_ReadIn;

	/**
	 * The cached value of the '{@link #getSc_help_ReadOut() <em>Sc help Read Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSc_help_ReadOut()
	 * @generated
	 * @ordered
	 */
	protected InPortBlock sc_help_ReadOut;

	/**
	 * The cached value of the '{@link #getSc_help_WriteIn() <em>Sc help Write In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSc_help_WriteIn()
	 * @generated
	 * @ordered
	 */
	protected OutPortBlock sc_help_WriteIn;

	/**
	 * The cached value of the '{@link #getSc_help_WriteOut() <em>Sc help Write Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSc_help_WriteOut()
	 * @generated
	 * @ordered
	 */
	protected InPortBlock sc_help_WriteOut;

	/**
	 * The cached value of the '{@link #getMi() <em>Mi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMi()
	 * @generated
	 * @ordered
	 */
	protected MessageTypeRepository mi;

	/**
	 * The cached value of the '{@link #getNet_address_inPort() <em>Net address in Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet_address_inPort()
	 * @generated
	 * @ordered
	 */
	protected InPortBlock net_address_inPort;

	/**
	 * The cached value of the '{@link #getReceiver_net_address_inPort() <em>Receiver net address in Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver_net_address_inPort()
	 * @generated
	 * @ordered
	 */
	protected InPortBlock receiver_net_address_inPort;

	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant constant;

	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected DataType portType;

	/**
	 * The cached value of the '{@link #getLineFromReadOut() <em>Line From Read Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineFromReadOut()
	 * @generated
	 * @ordered
	 */
	protected Line lineFromReadOut;

	/**
	 * The cached value of the '{@link #getLineToReadIn() <em>Line To Read In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineToReadIn()
	 * @generated
	 * @ordered
	 */
	protected Line lineToReadIn;

	/**
	 * The cached value of the '{@link #getLinkLayer() <em>Link Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkLayer()
	 * @generated
	 * @ordered
	 */
	protected LinkLayer linkLayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port2PortsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fujaba2simulinkPackage.Literals.PORT2_PORTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock getInPort() {
		if (inPort != null && ((EObject)inPort).eIsProxy()) {
			InternalEObject oldInPort = (InternalEObject)inPort;
			inPort = (InPortBlock)eResolveProxy(oldInPort);
			if (inPort != oldInPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__IN_PORT, oldInPort, inPort));
			}
		}
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock basicGetInPort() {
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInPort(InPortBlock newInPort) {
		InPortBlock oldInPort = inPort;
		inPort = newInPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__IN_PORT, oldInPort, inPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock getOutPort() {
		if (outPort != null && ((EObject)outPort).eIsProxy()) {
			InternalEObject oldOutPort = (InternalEObject)outPort;
			outPort = (OutPortBlock)eResolveProxy(oldOutPort);
			if (outPort != oldOutPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__OUT_PORT, oldOutPort, outPort));
			}
		}
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock basicGetOutPort() {
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutPort(OutPortBlock newOutPort) {
		OutPortBlock oldOutPort = outPort;
		outPort = newOutPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__OUT_PORT, oldOutPort, outPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (Port)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock getHelp_inPort() {
		if (help_inPort != null && ((EObject)help_inPort).eIsProxy()) {
			InternalEObject oldHelp_inPort = (InternalEObject)help_inPort;
			help_inPort = (InPortBlock)eResolveProxy(oldHelp_inPort);
			if (help_inPort != oldHelp_inPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__HELP_IN_PORT, oldHelp_inPort, help_inPort));
			}
		}
		return help_inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock basicGetHelp_inPort() {
		return help_inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelp_inPort(InPortBlock newHelp_inPort) {
		InPortBlock oldHelp_inPort = help_inPort;
		help_inPort = newHelp_inPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__HELP_IN_PORT, oldHelp_inPort, help_inPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock getHelp_outPort() {
		if (help_outPort != null && ((EObject)help_outPort).eIsProxy()) {
			InternalEObject oldHelp_outPort = (InternalEObject)help_outPort;
			help_outPort = (OutPortBlock)eResolveProxy(oldHelp_outPort);
			if (help_outPort != oldHelp_outPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__HELP_OUT_PORT, oldHelp_outPort, help_outPort));
			}
		}
		return help_outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock basicGetHelp_outPort() {
		return help_outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelp_outPort(OutPortBlock newHelp_outPort) {
		OutPortBlock oldHelp_outPort = help_outPort;
		help_outPort = newHelp_outPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__HELP_OUT_PORT, oldHelp_outPort, help_outPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance getPortInst() {
		if (portInst != null && portInst.eIsProxy()) {
			InternalEObject oldPortInst = (InternalEObject)portInst;
			portInst = (PortInstance)eResolveProxy(oldPortInst);
			if (portInst != oldPortInst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__PORT_INST, oldPortInst, portInst));
			}
		}
		return portInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance basicGetPortInst() {
		return portInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortInst(PortInstance newPortInst) {
		PortInstance oldPortInst = portInst;
		portInst = newPortInst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__PORT_INST, oldPortInst, portInst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteMultiPortInstance getMultiPortInst() {
		if (multiPortInst != null && multiPortInst.eIsProxy()) {
			InternalEObject oldMultiPortInst = (InternalEObject)multiPortInst;
			multiPortInst = (DiscreteMultiPortInstance)eResolveProxy(oldMultiPortInst);
			if (multiPortInst != oldMultiPortInst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__MULTI_PORT_INST, oldMultiPortInst, multiPortInst));
			}
		}
		return multiPortInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteMultiPortInstance basicGetMultiPortInst() {
		return multiPortInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiPortInst(DiscreteMultiPortInstance newMultiPortInst) {
		DiscreteMultiPortInstance oldMultiPortInst = multiPortInst;
		multiPortInst = newMultiPortInst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__MULTI_PORT_INST, oldMultiPortInst, multiPortInst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getCompInst() {
		if (compInst != null && compInst.eIsProxy()) {
			InternalEObject oldCompInst = (InternalEObject)compInst;
			compInst = (ComponentInstance)eResolveProxy(oldCompInst);
			if (compInst != oldCompInst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__COMP_INST, oldCompInst, compInst));
			}
		}
		return compInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetCompInst() {
		return compInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompInst(ComponentInstance newCompInst) {
		ComponentInstance oldCompInst = compInst;
		compInst = newCompInst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__COMP_INST, oldCompInst, compInst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock getSc_ReadIn() {
		if (sc_ReadIn != null && ((EObject)sc_ReadIn).eIsProxy()) {
			InternalEObject oldSc_ReadIn = (InternalEObject)sc_ReadIn;
			sc_ReadIn = (InPortBlock)eResolveProxy(oldSc_ReadIn);
			if (sc_ReadIn != oldSc_ReadIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__SC_READ_IN, oldSc_ReadIn, sc_ReadIn));
			}
		}
		return sc_ReadIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock basicGetSc_ReadIn() {
		return sc_ReadIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSc_ReadIn(InPortBlock newSc_ReadIn) {
		InPortBlock oldSc_ReadIn = sc_ReadIn;
		sc_ReadIn = newSc_ReadIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__SC_READ_IN, oldSc_ReadIn, sc_ReadIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock getSc_ReadOut() {
		if (sc_ReadOut != null && ((EObject)sc_ReadOut).eIsProxy()) {
			InternalEObject oldSc_ReadOut = (InternalEObject)sc_ReadOut;
			sc_ReadOut = (OutPortBlock)eResolveProxy(oldSc_ReadOut);
			if (sc_ReadOut != oldSc_ReadOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__SC_READ_OUT, oldSc_ReadOut, sc_ReadOut));
			}
		}
		return sc_ReadOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock basicGetSc_ReadOut() {
		return sc_ReadOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSc_ReadOut(OutPortBlock newSc_ReadOut) {
		OutPortBlock oldSc_ReadOut = sc_ReadOut;
		sc_ReadOut = newSc_ReadOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__SC_READ_OUT, oldSc_ReadOut, sc_ReadOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock getSc_WriteIn() {
		if (sc_WriteIn != null && ((EObject)sc_WriteIn).eIsProxy()) {
			InternalEObject oldSc_WriteIn = (InternalEObject)sc_WriteIn;
			sc_WriteIn = (InPortBlock)eResolveProxy(oldSc_WriteIn);
			if (sc_WriteIn != oldSc_WriteIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__SC_WRITE_IN, oldSc_WriteIn, sc_WriteIn));
			}
		}
		return sc_WriteIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock basicGetSc_WriteIn() {
		return sc_WriteIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSc_WriteIn(InPortBlock newSc_WriteIn) {
		InPortBlock oldSc_WriteIn = sc_WriteIn;
		sc_WriteIn = newSc_WriteIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__SC_WRITE_IN, oldSc_WriteIn, sc_WriteIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock getSc_WriteOut() {
		if (sc_WriteOut != null && ((EObject)sc_WriteOut).eIsProxy()) {
			InternalEObject oldSc_WriteOut = (InternalEObject)sc_WriteOut;
			sc_WriteOut = (OutPortBlock)eResolveProxy(oldSc_WriteOut);
			if (sc_WriteOut != oldSc_WriteOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__SC_WRITE_OUT, oldSc_WriteOut, sc_WriteOut));
			}
		}
		return sc_WriteOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock basicGetSc_WriteOut() {
		return sc_WriteOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSc_WriteOut(OutPortBlock newSc_WriteOut) {
		OutPortBlock oldSc_WriteOut = sc_WriteOut;
		sc_WriteOut = newSc_WriteOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__SC_WRITE_OUT, oldSc_WriteOut, sc_WriteOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock getSc_help_ReadIn() {
		if (sc_help_ReadIn != null && ((EObject)sc_help_ReadIn).eIsProxy()) {
			InternalEObject oldSc_help_ReadIn = (InternalEObject)sc_help_ReadIn;
			sc_help_ReadIn = (OutPortBlock)eResolveProxy(oldSc_help_ReadIn);
			if (sc_help_ReadIn != oldSc_help_ReadIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_READ_IN, oldSc_help_ReadIn, sc_help_ReadIn));
			}
		}
		return sc_help_ReadIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock basicGetSc_help_ReadIn() {
		return sc_help_ReadIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSc_help_ReadIn(OutPortBlock newSc_help_ReadIn) {
		OutPortBlock oldSc_help_ReadIn = sc_help_ReadIn;
		sc_help_ReadIn = newSc_help_ReadIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_READ_IN, oldSc_help_ReadIn, sc_help_ReadIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock getSc_help_ReadOut() {
		if (sc_help_ReadOut != null && ((EObject)sc_help_ReadOut).eIsProxy()) {
			InternalEObject oldSc_help_ReadOut = (InternalEObject)sc_help_ReadOut;
			sc_help_ReadOut = (InPortBlock)eResolveProxy(oldSc_help_ReadOut);
			if (sc_help_ReadOut != oldSc_help_ReadOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_READ_OUT, oldSc_help_ReadOut, sc_help_ReadOut));
			}
		}
		return sc_help_ReadOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock basicGetSc_help_ReadOut() {
		return sc_help_ReadOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSc_help_ReadOut(InPortBlock newSc_help_ReadOut) {
		InPortBlock oldSc_help_ReadOut = sc_help_ReadOut;
		sc_help_ReadOut = newSc_help_ReadOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_READ_OUT, oldSc_help_ReadOut, sc_help_ReadOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock getSc_help_WriteIn() {
		if (sc_help_WriteIn != null && ((EObject)sc_help_WriteIn).eIsProxy()) {
			InternalEObject oldSc_help_WriteIn = (InternalEObject)sc_help_WriteIn;
			sc_help_WriteIn = (OutPortBlock)eResolveProxy(oldSc_help_WriteIn);
			if (sc_help_WriteIn != oldSc_help_WriteIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_WRITE_IN, oldSc_help_WriteIn, sc_help_WriteIn));
			}
		}
		return sc_help_WriteIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock basicGetSc_help_WriteIn() {
		return sc_help_WriteIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSc_help_WriteIn(OutPortBlock newSc_help_WriteIn) {
		OutPortBlock oldSc_help_WriteIn = sc_help_WriteIn;
		sc_help_WriteIn = newSc_help_WriteIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_WRITE_IN, oldSc_help_WriteIn, sc_help_WriteIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock getSc_help_WriteOut() {
		if (sc_help_WriteOut != null && ((EObject)sc_help_WriteOut).eIsProxy()) {
			InternalEObject oldSc_help_WriteOut = (InternalEObject)sc_help_WriteOut;
			sc_help_WriteOut = (InPortBlock)eResolveProxy(oldSc_help_WriteOut);
			if (sc_help_WriteOut != oldSc_help_WriteOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_WRITE_OUT, oldSc_help_WriteOut, sc_help_WriteOut));
			}
		}
		return sc_help_WriteOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock basicGetSc_help_WriteOut() {
		return sc_help_WriteOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSc_help_WriteOut(InPortBlock newSc_help_WriteOut) {
		InPortBlock oldSc_help_WriteOut = sc_help_WriteOut;
		sc_help_WriteOut = newSc_help_WriteOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_WRITE_OUT, oldSc_help_WriteOut, sc_help_WriteOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeRepository getMi() {
		if (mi != null && mi.eIsProxy()) {
			InternalEObject oldMi = (InternalEObject)mi;
			mi = (MessageTypeRepository)eResolveProxy(oldMi);
			if (mi != oldMi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__MI, oldMi, mi));
			}
		}
		return mi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeRepository basicGetMi() {
		return mi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMi(MessageTypeRepository newMi) {
		MessageTypeRepository oldMi = mi;
		mi = newMi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__MI, oldMi, mi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock getNet_address_inPort() {
		if (net_address_inPort != null && ((EObject)net_address_inPort).eIsProxy()) {
			InternalEObject oldNet_address_inPort = (InternalEObject)net_address_inPort;
			net_address_inPort = (InPortBlock)eResolveProxy(oldNet_address_inPort);
			if (net_address_inPort != oldNet_address_inPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__NET_ADDRESS_IN_PORT, oldNet_address_inPort, net_address_inPort));
			}
		}
		return net_address_inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock basicGetNet_address_inPort() {
		return net_address_inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet_address_inPort(InPortBlock newNet_address_inPort) {
		InPortBlock oldNet_address_inPort = net_address_inPort;
		net_address_inPort = newNet_address_inPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__NET_ADDRESS_IN_PORT, oldNet_address_inPort, net_address_inPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock getReceiver_net_address_inPort() {
		if (receiver_net_address_inPort != null && ((EObject)receiver_net_address_inPort).eIsProxy()) {
			InternalEObject oldReceiver_net_address_inPort = (InternalEObject)receiver_net_address_inPort;
			receiver_net_address_inPort = (InPortBlock)eResolveProxy(oldReceiver_net_address_inPort);
			if (receiver_net_address_inPort != oldReceiver_net_address_inPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__RECEIVER_NET_ADDRESS_IN_PORT, oldReceiver_net_address_inPort, receiver_net_address_inPort));
			}
		}
		return receiver_net_address_inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock basicGetReceiver_net_address_inPort() {
		return receiver_net_address_inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver_net_address_inPort(InPortBlock newReceiver_net_address_inPort) {
		InPortBlock oldReceiver_net_address_inPort = receiver_net_address_inPort;
		receiver_net_address_inPort = newReceiver_net_address_inPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__RECEIVER_NET_ADDRESS_IN_PORT, oldReceiver_net_address_inPort, receiver_net_address_inPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getConstant() {
		if (constant != null && ((EObject)constant).eIsProxy()) {
			InternalEObject oldConstant = (InternalEObject)constant;
			constant = (Constant)eResolveProxy(oldConstant);
			if (constant != oldConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__CONSTANT, oldConstant, constant));
			}
		}
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(Constant newConstant) {
		Constant oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getPortType() {
		if (portType != null && portType.eIsProxy()) {
			InternalEObject oldPortType = (InternalEObject)portType;
			portType = (DataType)eResolveProxy(oldPortType);
			if (portType != oldPortType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__PORT_TYPE, oldPortType, portType));
			}
		}
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetPortType() {
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortType(DataType newPortType) {
		DataType oldPortType = portType;
		portType = newPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__PORT_TYPE, oldPortType, portType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getLineFromReadOut() {
		if (lineFromReadOut != null && ((EObject)lineFromReadOut).eIsProxy()) {
			InternalEObject oldLineFromReadOut = (InternalEObject)lineFromReadOut;
			lineFromReadOut = (Line)eResolveProxy(oldLineFromReadOut);
			if (lineFromReadOut != oldLineFromReadOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__LINE_FROM_READ_OUT, oldLineFromReadOut, lineFromReadOut));
			}
		}
		return lineFromReadOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line basicGetLineFromReadOut() {
		return lineFromReadOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineFromReadOut(Line newLineFromReadOut) {
		Line oldLineFromReadOut = lineFromReadOut;
		lineFromReadOut = newLineFromReadOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__LINE_FROM_READ_OUT, oldLineFromReadOut, lineFromReadOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getLineToReadIn() {
		if (lineToReadIn != null && ((EObject)lineToReadIn).eIsProxy()) {
			InternalEObject oldLineToReadIn = (InternalEObject)lineToReadIn;
			lineToReadIn = (Line)eResolveProxy(oldLineToReadIn);
			if (lineToReadIn != oldLineToReadIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__LINE_TO_READ_IN, oldLineToReadIn, lineToReadIn));
			}
		}
		return lineToReadIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line basicGetLineToReadIn() {
		return lineToReadIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineToReadIn(Line newLineToReadIn) {
		Line oldLineToReadIn = lineToReadIn;
		lineToReadIn = newLineToReadIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__LINE_TO_READ_IN, oldLineToReadIn, lineToReadIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkLayer getLinkLayer() {
		if (linkLayer != null && ((EObject)linkLayer).eIsProxy()) {
			InternalEObject oldLinkLayer = (InternalEObject)linkLayer;
			linkLayer = (LinkLayer)eResolveProxy(oldLinkLayer);
			if (linkLayer != oldLinkLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.PORT2_PORTS__LINK_LAYER, oldLinkLayer, linkLayer));
			}
		}
		return linkLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkLayer basicGetLinkLayer() {
		return linkLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkLayer(LinkLayer newLinkLayer) {
		LinkLayer oldLinkLayer = linkLayer;
		linkLayer = newLinkLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.PORT2_PORTS__LINK_LAYER, oldLinkLayer, linkLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Fujaba2simulinkPackage.PORT2_PORTS__IN_PORT:
				if (resolve) return getInPort();
				return basicGetInPort();
			case Fujaba2simulinkPackage.PORT2_PORTS__OUT_PORT:
				if (resolve) return getOutPort();
				return basicGetOutPort();
			case Fujaba2simulinkPackage.PORT2_PORTS__PORT:
				if (resolve) return getPort();
				return basicGetPort();
			case Fujaba2simulinkPackage.PORT2_PORTS__HELP_IN_PORT:
				if (resolve) return getHelp_inPort();
				return basicGetHelp_inPort();
			case Fujaba2simulinkPackage.PORT2_PORTS__HELP_OUT_PORT:
				if (resolve) return getHelp_outPort();
				return basicGetHelp_outPort();
			case Fujaba2simulinkPackage.PORT2_PORTS__PORT_INST:
				if (resolve) return getPortInst();
				return basicGetPortInst();
			case Fujaba2simulinkPackage.PORT2_PORTS__MULTI_PORT_INST:
				if (resolve) return getMultiPortInst();
				return basicGetMultiPortInst();
			case Fujaba2simulinkPackage.PORT2_PORTS__COMP_INST:
				if (resolve) return getCompInst();
				return basicGetCompInst();
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_READ_IN:
				if (resolve) return getSc_ReadIn();
				return basicGetSc_ReadIn();
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_READ_OUT:
				if (resolve) return getSc_ReadOut();
				return basicGetSc_ReadOut();
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_WRITE_IN:
				if (resolve) return getSc_WriteIn();
				return basicGetSc_WriteIn();
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_WRITE_OUT:
				if (resolve) return getSc_WriteOut();
				return basicGetSc_WriteOut();
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_READ_IN:
				if (resolve) return getSc_help_ReadIn();
				return basicGetSc_help_ReadIn();
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_READ_OUT:
				if (resolve) return getSc_help_ReadOut();
				return basicGetSc_help_ReadOut();
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_WRITE_IN:
				if (resolve) return getSc_help_WriteIn();
				return basicGetSc_help_WriteIn();
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_WRITE_OUT:
				if (resolve) return getSc_help_WriteOut();
				return basicGetSc_help_WriteOut();
			case Fujaba2simulinkPackage.PORT2_PORTS__MI:
				if (resolve) return getMi();
				return basicGetMi();
			case Fujaba2simulinkPackage.PORT2_PORTS__NET_ADDRESS_IN_PORT:
				if (resolve) return getNet_address_inPort();
				return basicGetNet_address_inPort();
			case Fujaba2simulinkPackage.PORT2_PORTS__RECEIVER_NET_ADDRESS_IN_PORT:
				if (resolve) return getReceiver_net_address_inPort();
				return basicGetReceiver_net_address_inPort();
			case Fujaba2simulinkPackage.PORT2_PORTS__CONSTANT:
				if (resolve) return getConstant();
				return basicGetConstant();
			case Fujaba2simulinkPackage.PORT2_PORTS__PORT_TYPE:
				if (resolve) return getPortType();
				return basicGetPortType();
			case Fujaba2simulinkPackage.PORT2_PORTS__LINE_FROM_READ_OUT:
				if (resolve) return getLineFromReadOut();
				return basicGetLineFromReadOut();
			case Fujaba2simulinkPackage.PORT2_PORTS__LINE_TO_READ_IN:
				if (resolve) return getLineToReadIn();
				return basicGetLineToReadIn();
			case Fujaba2simulinkPackage.PORT2_PORTS__LINK_LAYER:
				if (resolve) return getLinkLayer();
				return basicGetLinkLayer();
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
			case Fujaba2simulinkPackage.PORT2_PORTS__IN_PORT:
				setInPort((InPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__OUT_PORT:
				setOutPort((OutPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__PORT:
				setPort((Port)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__HELP_IN_PORT:
				setHelp_inPort((InPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__HELP_OUT_PORT:
				setHelp_outPort((OutPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__PORT_INST:
				setPortInst((PortInstance)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__MULTI_PORT_INST:
				setMultiPortInst((DiscreteMultiPortInstance)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__COMP_INST:
				setCompInst((ComponentInstance)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_READ_IN:
				setSc_ReadIn((InPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_READ_OUT:
				setSc_ReadOut((OutPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_WRITE_IN:
				setSc_WriteIn((InPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_WRITE_OUT:
				setSc_WriteOut((OutPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_READ_IN:
				setSc_help_ReadIn((OutPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_READ_OUT:
				setSc_help_ReadOut((InPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_WRITE_IN:
				setSc_help_WriteIn((OutPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_WRITE_OUT:
				setSc_help_WriteOut((InPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__MI:
				setMi((MessageTypeRepository)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__NET_ADDRESS_IN_PORT:
				setNet_address_inPort((InPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__RECEIVER_NET_ADDRESS_IN_PORT:
				setReceiver_net_address_inPort((InPortBlock)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__CONSTANT:
				setConstant((Constant)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__PORT_TYPE:
				setPortType((DataType)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__LINE_FROM_READ_OUT:
				setLineFromReadOut((Line)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__LINE_TO_READ_IN:
				setLineToReadIn((Line)newValue);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__LINK_LAYER:
				setLinkLayer((LinkLayer)newValue);
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
			case Fujaba2simulinkPackage.PORT2_PORTS__IN_PORT:
				setInPort((InPortBlock)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__OUT_PORT:
				setOutPort((OutPortBlock)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__PORT:
				setPort((Port)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__HELP_IN_PORT:
				setHelp_inPort((InPortBlock)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__HELP_OUT_PORT:
				setHelp_outPort((OutPortBlock)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__PORT_INST:
				setPortInst((PortInstance)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__MULTI_PORT_INST:
				setMultiPortInst((DiscreteMultiPortInstance)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__COMP_INST:
				setCompInst((ComponentInstance)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_READ_IN:
				setSc_ReadIn((InPortBlock)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_READ_OUT:
				setSc_ReadOut((OutPortBlock)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_WRITE_IN:
				setSc_WriteIn((InPortBlock)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_WRITE_OUT:
				setSc_WriteOut((OutPortBlock)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_READ_IN:
				setSc_help_ReadIn((OutPortBlock)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_READ_OUT:
				setSc_help_ReadOut((InPortBlock)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_WRITE_IN:
				setSc_help_WriteIn((OutPortBlock)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_WRITE_OUT:
				setSc_help_WriteOut((InPortBlock)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__MI:
				setMi((MessageTypeRepository)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__NET_ADDRESS_IN_PORT:
				setNet_address_inPort((InPortBlock)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__RECEIVER_NET_ADDRESS_IN_PORT:
				setReceiver_net_address_inPort((InPortBlock)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__CONSTANT:
				setConstant((Constant)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__PORT_TYPE:
				setPortType((DataType)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__LINE_FROM_READ_OUT:
				setLineFromReadOut((Line)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__LINE_TO_READ_IN:
				setLineToReadIn((Line)null);
				return;
			case Fujaba2simulinkPackage.PORT2_PORTS__LINK_LAYER:
				setLinkLayer((LinkLayer)null);
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
			case Fujaba2simulinkPackage.PORT2_PORTS__IN_PORT:
				return inPort != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__OUT_PORT:
				return outPort != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__PORT:
				return port != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__HELP_IN_PORT:
				return help_inPort != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__HELP_OUT_PORT:
				return help_outPort != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__PORT_INST:
				return portInst != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__MULTI_PORT_INST:
				return multiPortInst != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__COMP_INST:
				return compInst != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_READ_IN:
				return sc_ReadIn != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_READ_OUT:
				return sc_ReadOut != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_WRITE_IN:
				return sc_WriteIn != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_WRITE_OUT:
				return sc_WriteOut != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_READ_IN:
				return sc_help_ReadIn != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_READ_OUT:
				return sc_help_ReadOut != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_WRITE_IN:
				return sc_help_WriteIn != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__SC_HELP_WRITE_OUT:
				return sc_help_WriteOut != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__MI:
				return mi != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__NET_ADDRESS_IN_PORT:
				return net_address_inPort != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__RECEIVER_NET_ADDRESS_IN_PORT:
				return receiver_net_address_inPort != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__CONSTANT:
				return constant != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__PORT_TYPE:
				return portType != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__LINE_FROM_READ_OUT:
				return lineFromReadOut != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__LINE_TO_READ_IN:
				return lineToReadIn != null;
			case Fujaba2simulinkPackage.PORT2_PORTS__LINK_LAYER:
				return linkLayer != null;
		}
		return super.eIsSet(featureID);
	}

} //Port2PortsImpl
