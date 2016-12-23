/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel;

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
import org.muml.simulink.msglib.LinkLayer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port2 Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getInPort <em>In Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getPort <em>Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getHelp_inPort <em>Help in Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getHelp_outPort <em>Help out Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getPortInst <em>Port Inst</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getMultiPortInst <em>Multi Port Inst</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getCompInst <em>Comp Inst</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_ReadIn <em>Sc Read In</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_ReadOut <em>Sc Read Out</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_WriteIn <em>Sc Write In</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_WriteOut <em>Sc Write Out</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_ReadIn <em>Sc help Read In</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_ReadOut <em>Sc help Read Out</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_WriteIn <em>Sc help Write In</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_WriteOut <em>Sc help Write Out</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getMi <em>Mi</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getNet_address_inPort <em>Net address in Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getReceiver_net_address_inPort <em>Receiver net address in Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getLineFromReadOut <em>Line From Read Out</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getLineToReadIn <em>Line To Read In</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getLinkLayer <em>Link Layer</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports()
 * @model
 * @generated
 */
public interface Port2Ports extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>In Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Port</em>' reference.
	 * @see #setInPort(InPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_InPort()
	 * @model
	 * @generated
	 */
	InPortBlock getInPort();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getInPort <em>In Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Port</em>' reference.
	 * @see #getInPort()
	 * @generated
	 */
	void setInPort(InPortBlock value);

	/**
	 * Returns the value of the '<em><b>Out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Port</em>' reference.
	 * @see #setOutPort(OutPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_OutPort()
	 * @model
	 * @generated
	 */
	OutPortBlock getOutPort();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getOutPort <em>Out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' reference.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(OutPortBlock value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Port()
	 * @model
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Help in Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help in Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help in Port</em>' reference.
	 * @see #setHelp_inPort(InPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Help_inPort()
	 * @model
	 * @generated
	 */
	InPortBlock getHelp_inPort();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getHelp_inPort <em>Help in Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help in Port</em>' reference.
	 * @see #getHelp_inPort()
	 * @generated
	 */
	void setHelp_inPort(InPortBlock value);

	/**
	 * Returns the value of the '<em><b>Help out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help out Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help out Port</em>' reference.
	 * @see #setHelp_outPort(OutPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Help_outPort()
	 * @model
	 * @generated
	 */
	OutPortBlock getHelp_outPort();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getHelp_outPort <em>Help out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help out Port</em>' reference.
	 * @see #getHelp_outPort()
	 * @generated
	 */
	void setHelp_outPort(OutPortBlock value);

	/**
	 * Returns the value of the '<em><b>Port Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Inst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Inst</em>' reference.
	 * @see #setPortInst(PortInstance)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_PortInst()
	 * @model
	 * @generated
	 */
	PortInstance getPortInst();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getPortInst <em>Port Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Inst</em>' reference.
	 * @see #getPortInst()
	 * @generated
	 */
	void setPortInst(PortInstance value);

	/**
	 * Returns the value of the '<em><b>Multi Port Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Port Inst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Port Inst</em>' reference.
	 * @see #setMultiPortInst(DiscreteMultiPortInstance)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_MultiPortInst()
	 * @model
	 * @generated
	 */
	DiscreteMultiPortInstance getMultiPortInst();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getMultiPortInst <em>Multi Port Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Port Inst</em>' reference.
	 * @see #getMultiPortInst()
	 * @generated
	 */
	void setMultiPortInst(DiscreteMultiPortInstance value);

	/**
	 * Returns the value of the '<em><b>Comp Inst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Inst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Inst</em>' reference.
	 * @see #setCompInst(ComponentInstance)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_CompInst()
	 * @model
	 * @generated
	 */
	ComponentInstance getCompInst();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getCompInst <em>Comp Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp Inst</em>' reference.
	 * @see #getCompInst()
	 * @generated
	 */
	void setCompInst(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Sc Read In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Read In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Read In</em>' reference.
	 * @see #setSc_ReadIn(InPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Sc_ReadIn()
	 * @model
	 * @generated
	 */
	InPortBlock getSc_ReadIn();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_ReadIn <em>Sc Read In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Read In</em>' reference.
	 * @see #getSc_ReadIn()
	 * @generated
	 */
	void setSc_ReadIn(InPortBlock value);

	/**
	 * Returns the value of the '<em><b>Sc Read Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Read Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Read Out</em>' reference.
	 * @see #setSc_ReadOut(OutPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Sc_ReadOut()
	 * @model
	 * @generated
	 */
	OutPortBlock getSc_ReadOut();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_ReadOut <em>Sc Read Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Read Out</em>' reference.
	 * @see #getSc_ReadOut()
	 * @generated
	 */
	void setSc_ReadOut(OutPortBlock value);

	/**
	 * Returns the value of the '<em><b>Sc Write In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Write In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Write In</em>' reference.
	 * @see #setSc_WriteIn(InPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Sc_WriteIn()
	 * @model
	 * @generated
	 */
	InPortBlock getSc_WriteIn();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_WriteIn <em>Sc Write In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Write In</em>' reference.
	 * @see #getSc_WriteIn()
	 * @generated
	 */
	void setSc_WriteIn(InPortBlock value);

	/**
	 * Returns the value of the '<em><b>Sc Write Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Write Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Write Out</em>' reference.
	 * @see #setSc_WriteOut(OutPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Sc_WriteOut()
	 * @model
	 * @generated
	 */
	OutPortBlock getSc_WriteOut();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_WriteOut <em>Sc Write Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Write Out</em>' reference.
	 * @see #getSc_WriteOut()
	 * @generated
	 */
	void setSc_WriteOut(OutPortBlock value);

	/**
	 * Returns the value of the '<em><b>Sc help Read In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc help Read In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc help Read In</em>' reference.
	 * @see #setSc_help_ReadIn(OutPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Sc_help_ReadIn()
	 * @model
	 * @generated
	 */
	OutPortBlock getSc_help_ReadIn();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_ReadIn <em>Sc help Read In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc help Read In</em>' reference.
	 * @see #getSc_help_ReadIn()
	 * @generated
	 */
	void setSc_help_ReadIn(OutPortBlock value);

	/**
	 * Returns the value of the '<em><b>Sc help Read Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc help Read Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc help Read Out</em>' reference.
	 * @see #setSc_help_ReadOut(InPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Sc_help_ReadOut()
	 * @model
	 * @generated
	 */
	InPortBlock getSc_help_ReadOut();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_ReadOut <em>Sc help Read Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc help Read Out</em>' reference.
	 * @see #getSc_help_ReadOut()
	 * @generated
	 */
	void setSc_help_ReadOut(InPortBlock value);

	/**
	 * Returns the value of the '<em><b>Sc help Write In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc help Write In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc help Write In</em>' reference.
	 * @see #setSc_help_WriteIn(OutPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Sc_help_WriteIn()
	 * @model
	 * @generated
	 */
	OutPortBlock getSc_help_WriteIn();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_WriteIn <em>Sc help Write In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc help Write In</em>' reference.
	 * @see #getSc_help_WriteIn()
	 * @generated
	 */
	void setSc_help_WriteIn(OutPortBlock value);

	/**
	 * Returns the value of the '<em><b>Sc help Write Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc help Write Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc help Write Out</em>' reference.
	 * @see #setSc_help_WriteOut(InPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Sc_help_WriteOut()
	 * @model
	 * @generated
	 */
	InPortBlock getSc_help_WriteOut();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getSc_help_WriteOut <em>Sc help Write Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc help Write Out</em>' reference.
	 * @see #getSc_help_WriteOut()
	 * @generated
	 */
	void setSc_help_WriteOut(InPortBlock value);

	/**
	 * Returns the value of the '<em><b>Mi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mi</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mi</em>' reference.
	 * @see #setMi(MessageTypeRepository)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Mi()
	 * @model
	 * @generated
	 */
	MessageTypeRepository getMi();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getMi <em>Mi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mi</em>' reference.
	 * @see #getMi()
	 * @generated
	 */
	void setMi(MessageTypeRepository value);

	/**
	 * Returns the value of the '<em><b>Net address in Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net address in Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net address in Port</em>' reference.
	 * @see #setNet_address_inPort(InPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Net_address_inPort()
	 * @model
	 * @generated
	 */
	InPortBlock getNet_address_inPort();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getNet_address_inPort <em>Net address in Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net address in Port</em>' reference.
	 * @see #getNet_address_inPort()
	 * @generated
	 */
	void setNet_address_inPort(InPortBlock value);

	/**
	 * Returns the value of the '<em><b>Receiver net address in Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver net address in Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver net address in Port</em>' reference.
	 * @see #setReceiver_net_address_inPort(InPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Receiver_net_address_inPort()
	 * @model
	 * @generated
	 */
	InPortBlock getReceiver_net_address_inPort();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getReceiver_net_address_inPort <em>Receiver net address in Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver net address in Port</em>' reference.
	 * @see #getReceiver_net_address_inPort()
	 * @generated
	 */
	void setReceiver_net_address_inPort(InPortBlock value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' reference.
	 * @see #setConstant(Constant)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_Constant()
	 * @model
	 * @generated
	 */
	Constant getConstant();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getConstant <em>Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(Constant value);

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' reference.
	 * @see #setPortType(DataType)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_PortType()
	 * @model
	 * @generated
	 */
	DataType getPortType();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getPortType <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' reference.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(DataType value);

	/**
	 * Returns the value of the '<em><b>Line From Read Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line From Read Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line From Read Out</em>' reference.
	 * @see #setLineFromReadOut(Line)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_LineFromReadOut()
	 * @model
	 * @generated
	 */
	Line getLineFromReadOut();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getLineFromReadOut <em>Line From Read Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line From Read Out</em>' reference.
	 * @see #getLineFromReadOut()
	 * @generated
	 */
	void setLineFromReadOut(Line value);

	/**
	 * Returns the value of the '<em><b>Line To Read In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line To Read In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line To Read In</em>' reference.
	 * @see #setLineToReadIn(Line)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_LineToReadIn()
	 * @model
	 * @generated
	 */
	Line getLineToReadIn();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getLineToReadIn <em>Line To Read In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line To Read In</em>' reference.
	 * @see #getLineToReadIn()
	 * @generated
	 */
	void setLineToReadIn(Line value);

	/**
	 * Returns the value of the '<em><b>Link Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Layer</em>' reference.
	 * @see #setLinkLayer(LinkLayer)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getPort2Ports_LinkLayer()
	 * @model
	 * @generated
	 */
	LinkLayer getLinkLayer();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.Port2Ports#getLinkLayer <em>Link Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Layer</em>' reference.
	 * @see #getLinkLayer()
	 * @generated
	 */
	void setLinkLayer(LinkLayer value);

} // Port2Ports
