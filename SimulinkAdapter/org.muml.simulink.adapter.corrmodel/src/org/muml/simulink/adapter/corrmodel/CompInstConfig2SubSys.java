/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel;

import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.simulink.BusCreator;
import org.muml.simulink.BusSelector;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.Line;
import org.muml.simulink.OutPortBlock;
import org.muml.simulink.SubSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Inst Config2 Sub Sys</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getInstConfig <em>Inst Config</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getSubSys <em>Sub Sys</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCommunicationSwitch <em>Communication Switch</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusCreator <em>Bus Creator</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusSelector <em>Bus Selector</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusCreatorOutPort <em>Bus Creator Out Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusSelectorInPort <em>Bus Selector In Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusOfBusses <em>Bus Of Busses</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCS_inPort <em>CS in Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCS_outPort <em>CS out Port</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCompInstName <em>Comp Inst Name</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInstConfig2SubSys()
 * @model
 * @generated
 */
public interface CompInstConfig2SubSys extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Inst Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst Config</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst Config</em>' reference.
	 * @see #setInstConfig(ComponentInstanceConfiguration)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInstConfig2SubSys_InstConfig()
	 * @model
	 * @generated
	 */
	ComponentInstanceConfiguration getInstConfig();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getInstConfig <em>Inst Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst Config</em>' reference.
	 * @see #getInstConfig()
	 * @generated
	 */
	void setInstConfig(ComponentInstanceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Sub Sys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Sys</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Sys</em>' reference.
	 * @see #setSubSys(de.uni_paderborn.fujaba.simulink.model.SubSystem)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInstConfig2SubSys_SubSys()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.simulink.model.SubSystem getSubSys();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getSubSys <em>Sub Sys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Sys</em>' reference.
	 * @see #getSubSys()
	 * @generated
	 */
	void setSubSys(de.uni_paderborn.fujaba.simulink.model.SubSystem value);

	/**
	 * Returns the value of the '<em><b>Communication Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Switch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Switch</em>' reference.
	 * @see #setCommunicationSwitch(de.uni_paderborn.fujaba.simulink.model.SubSystem)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInstConfig2SubSys_CommunicationSwitch()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.simulink.model.SubSystem getCommunicationSwitch();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCommunicationSwitch <em>Communication Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Switch</em>' reference.
	 * @see #getCommunicationSwitch()
	 * @generated
	 */
	void setCommunicationSwitch(de.uni_paderborn.fujaba.simulink.model.SubSystem value);

	/**
	 * Returns the value of the '<em><b>Bus Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Creator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Creator</em>' reference.
	 * @see #setBusCreator(de.uni_paderborn.fujaba.simulink.model.BusCreator)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInstConfig2SubSys_BusCreator()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.simulink.model.BusCreator getBusCreator();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusCreator <em>Bus Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Creator</em>' reference.
	 * @see #getBusCreator()
	 * @generated
	 */
	void setBusCreator(de.uni_paderborn.fujaba.simulink.model.BusCreator value);

	/**
	 * Returns the value of the '<em><b>Bus Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Selector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Selector</em>' reference.
	 * @see #setBusSelector(de.uni_paderborn.fujaba.simulink.model.BusSelector)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInstConfig2SubSys_BusSelector()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.simulink.model.BusSelector getBusSelector();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusSelector <em>Bus Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Selector</em>' reference.
	 * @see #getBusSelector()
	 * @generated
	 */
	void setBusSelector(de.uni_paderborn.fujaba.simulink.model.BusSelector value);

	/**
	 * Returns the value of the '<em><b>Bus Creator Out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Creator Out Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Creator Out Port</em>' reference.
	 * @see #setBusCreatorOutPort(de.uni_paderborn.fujaba.simulink.model.OutPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInstConfig2SubSys_BusCreatorOutPort()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.simulink.model.OutPortBlock getBusCreatorOutPort();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusCreatorOutPort <em>Bus Creator Out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Creator Out Port</em>' reference.
	 * @see #getBusCreatorOutPort()
	 * @generated
	 */
	void setBusCreatorOutPort(de.uni_paderborn.fujaba.simulink.model.OutPortBlock value);

	/**
	 * Returns the value of the '<em><b>Bus Selector In Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Selector In Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Selector In Port</em>' reference.
	 * @see #setBusSelectorInPort(de.uni_paderborn.fujaba.simulink.model.InPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInstConfig2SubSys_BusSelectorInPort()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.simulink.model.InPortBlock getBusSelectorInPort();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusSelectorInPort <em>Bus Selector In Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Selector In Port</em>' reference.
	 * @see #getBusSelectorInPort()
	 * @generated
	 */
	void setBusSelectorInPort(de.uni_paderborn.fujaba.simulink.model.InPortBlock value);

	/**
	 * Returns the value of the '<em><b>Bus Of Busses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Of Busses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Of Busses</em>' reference.
	 * @see #setBusOfBusses(de.uni_paderborn.fujaba.simulink.model.Line)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInstConfig2SubSys_BusOfBusses()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.simulink.model.Line getBusOfBusses();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getBusOfBusses <em>Bus Of Busses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Of Busses</em>' reference.
	 * @see #getBusOfBusses()
	 * @generated
	 */
	void setBusOfBusses(de.uni_paderborn.fujaba.simulink.model.Line value);

	/**
	 * Returns the value of the '<em><b>CS in Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CS in Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CS in Port</em>' reference.
	 * @see #setCS_inPort(de.uni_paderborn.fujaba.simulink.model.InPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInstConfig2SubSys_CS_inPort()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.simulink.model.InPortBlock getCS_inPort();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCS_inPort <em>CS in Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS in Port</em>' reference.
	 * @see #getCS_inPort()
	 * @generated
	 */
	void setCS_inPort(de.uni_paderborn.fujaba.simulink.model.InPortBlock value);

	/**
	 * Returns the value of the '<em><b>CS out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CS out Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CS out Port</em>' reference.
	 * @see #setCS_outPort(de.uni_paderborn.fujaba.simulink.model.OutPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInstConfig2SubSys_CS_outPort()
	 * @model
	 * @generated
	 */
	de.uni_paderborn.fujaba.simulink.model.OutPortBlock getCS_outPort();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCS_outPort <em>CS out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS out Port</em>' reference.
	 * @see #getCS_outPort()
	 * @generated
	 */
	void setCS_outPort(de.uni_paderborn.fujaba.simulink.model.OutPortBlock value);

	/**
	 * Returns the value of the '<em><b>Comp Inst Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Inst Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Inst Name</em>' attribute.
	 * @see #setCompInstName(String)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getCompInstConfig2SubSys_CompInstName()
	 * @model
	 * @generated
	 */
	String getCompInstName();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.CompInstConfig2SubSys#getCompInstName <em>Comp Inst Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp Inst Name</em>' attribute.
	 * @see #getCompInstName()
	 * @generated
	 */
	void setCompInstName(String value);

} // CompInstConfig2SubSys
