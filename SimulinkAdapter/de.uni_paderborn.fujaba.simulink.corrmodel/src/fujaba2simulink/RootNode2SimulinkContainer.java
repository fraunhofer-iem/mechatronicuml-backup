/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.simulink.model.Bus;
import de.uni_paderborn.fujaba.simulink.model.SimulinkContainer;
import de.uni_paderborn.fujaba.simulink.model.SimulinkLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Node2 Simulink Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.RootNode2SimulinkContainer#getRootNode <em>Root Node</em>}</li>
 *   <li>{@link fujaba2simulink.RootNode2SimulinkContainer#getSimulinkContainer <em>Simulink Container</em>}</li>
 *   <li>{@link fujaba2simulink.RootNode2SimulinkContainer#getPacketBus <em>Packet Bus</em>}</li>
 *   <li>{@link fujaba2simulink.RootNode2SimulinkContainer#getBusOfBusses <em>Bus Of Busses</em>}</li>
 *   <li>{@link fujaba2simulink.RootNode2SimulinkContainer#getCic2ss <em>Cic2ss</em>}</li>
 *   <li>{@link fujaba2simulink.RootNode2SimulinkContainer#getAtomCompLib <em>Atom Comp Lib</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.Fujaba2simulinkPackage#getRootNode2SimulinkContainer()
 * @model
 * @generated
 */
public interface RootNode2SimulinkContainer extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Node</em>' reference.
	 * @see #setRootNode(RootNode)
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getRootNode2SimulinkContainer_RootNode()
	 * @model
	 * @generated
	 */
	RootNode getRootNode();

	/**
	 * Sets the value of the '{@link fujaba2simulink.RootNode2SimulinkContainer#getRootNode <em>Root Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Node</em>' reference.
	 * @see #getRootNode()
	 * @generated
	 */
	void setRootNode(RootNode value);

	/**
	 * Returns the value of the '<em><b>Simulink Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulink Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulink Container</em>' reference.
	 * @see #setSimulinkContainer(SimulinkContainer)
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getRootNode2SimulinkContainer_SimulinkContainer()
	 * @model
	 * @generated
	 */
	SimulinkContainer getSimulinkContainer();

	/**
	 * Sets the value of the '{@link fujaba2simulink.RootNode2SimulinkContainer#getSimulinkContainer <em>Simulink Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulink Container</em>' reference.
	 * @see #getSimulinkContainer()
	 * @generated
	 */
	void setSimulinkContainer(SimulinkContainer value);

	/**
	 * Returns the value of the '<em><b>Packet Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Bus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Bus</em>' reference.
	 * @see #setPacketBus(Bus)
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getRootNode2SimulinkContainer_PacketBus()
	 * @model
	 * @generated
	 */
	Bus getPacketBus();

	/**
	 * Sets the value of the '{@link fujaba2simulink.RootNode2SimulinkContainer#getPacketBus <em>Packet Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Bus</em>' reference.
	 * @see #getPacketBus()
	 * @generated
	 */
	void setPacketBus(Bus value);

	/**
	 * Returns the value of the '<em><b>Bus Of Busses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Of Busses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Of Busses</em>' reference.
	 * @see #setBusOfBusses(Bus)
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getRootNode2SimulinkContainer_BusOfBusses()
	 * @model
	 * @generated
	 */
	Bus getBusOfBusses();

	/**
	 * Sets the value of the '{@link fujaba2simulink.RootNode2SimulinkContainer#getBusOfBusses <em>Bus Of Busses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Of Busses</em>' reference.
	 * @see #getBusOfBusses()
	 * @generated
	 */
	void setBusOfBusses(Bus value);

	/**
	 * Returns the value of the '<em><b>Cic2ss</b></em>' reference list.
	 * The list contents are of type {@link fujaba2simulink.CompInstConfig2SubSys}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cic2ss</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cic2ss</em>' reference list.
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getRootNode2SimulinkContainer_Cic2ss()
	 * @model
	 * @generated
	 */
	EList<CompInstConfig2SubSys> getCic2ss();

	/**
	 * Returns the value of the '<em><b>Atom Comp Lib</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atom Comp Lib</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atom Comp Lib</em>' reference.
	 * @see #setAtomCompLib(SimulinkLibrary)
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getRootNode2SimulinkContainer_AtomCompLib()
	 * @model
	 * @generated
	 */
	SimulinkLibrary getAtomCompLib();

	/**
	 * Sets the value of the '{@link fujaba2simulink.RootNode2SimulinkContainer#getAtomCompLib <em>Atom Comp Lib</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atom Comp Lib</em>' reference.
	 * @see #getAtomCompLib()
	 * @generated
	 */
	void setAtomCompLib(SimulinkLibrary value);

} // RootNode2SimulinkContainer
