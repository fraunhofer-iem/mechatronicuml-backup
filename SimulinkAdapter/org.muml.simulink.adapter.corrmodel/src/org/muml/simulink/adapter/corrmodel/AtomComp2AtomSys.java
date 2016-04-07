/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel;

import org.muml.pim.component.Component;
import org.muml.simulink.InPortBlock;
import org.muml.simulink.SubSystem;
import org.muml.simulink.stateflow.Chart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom Comp2 Atom Sys</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getClockSignal <em>Clock Signal</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getChart <em>Chart</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getComp <em>Comp</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getSys <em>Sys</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getAtomComp2AtomSys()
 * @model
 * @generated
 */
public interface AtomComp2AtomSys extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Clock Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Signal</em>' reference.
	 * @see #setClockSignal(InPortBlock)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getAtomComp2AtomSys_ClockSignal()
	 * @model
	 * @generated
	 */
	InPortBlock getClockSignal();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getClockSignal <em>Clock Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Signal</em>' reference.
	 * @see #getClockSignal()
	 * @generated
	 */
	void setClockSignal(InPortBlock value);

	/**
	 * Returns the value of the '<em><b>Chart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart</em>' reference.
	 * @see #setChart(Chart)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getAtomComp2AtomSys_Chart()
	 * @model
	 * @generated
	 */
	Chart getChart();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getChart <em>Chart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart</em>' reference.
	 * @see #getChart()
	 * @generated
	 */
	void setChart(Chart value);

	/**
	 * Returns the value of the '<em><b>Comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp</em>' reference.
	 * @see #setComp(Component)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getAtomComp2AtomSys_Comp()
	 * @model
	 * @generated
	 */
	Component getComp();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getComp <em>Comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp</em>' reference.
	 * @see #getComp()
	 * @generated
	 */
	void setComp(Component value);

	/**
	 * Returns the value of the '<em><b>Sys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys</em>' reference.
	 * @see #setSys(SubSystem)
	 * @see org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage#getAtomComp2AtomSys_Sys()
	 * @model
	 * @generated
	 */
	SubSystem getSys();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.AtomComp2AtomSys#getSys <em>Sys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys</em>' reference.
	 * @see #getSys()
	 * @generated
	 */
	void setSys(SubSystem value);

} // AtomComp2AtomSys
