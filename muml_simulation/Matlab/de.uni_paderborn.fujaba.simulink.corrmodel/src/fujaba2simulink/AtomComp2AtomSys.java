/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink;

import de.uni_paderborn.fujaba.muml.component.Component;

import de.uni_paderborn.fujaba.simulink.model.InPortBlock;
import de.uni_paderborn.fujaba.simulink.model.SubSystem;

import de.uni_paderborn.fujaba.simulink.model.stateflow.Chart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom Comp2 Atom Sys</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.AtomComp2AtomSys#getClockSignal <em>Clock Signal</em>}</li>
 *   <li>{@link fujaba2simulink.AtomComp2AtomSys#getChart <em>Chart</em>}</li>
 *   <li>{@link fujaba2simulink.AtomComp2AtomSys#getComp <em>Comp</em>}</li>
 *   <li>{@link fujaba2simulink.AtomComp2AtomSys#getSys <em>Sys</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.Fujaba2simulinkPackage#getAtomComp2AtomSys()
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
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getAtomComp2AtomSys_ClockSignal()
	 * @model
	 * @generated
	 */
	InPortBlock getClockSignal();

	/**
	 * Sets the value of the '{@link fujaba2simulink.AtomComp2AtomSys#getClockSignal <em>Clock Signal</em>}' reference.
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
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getAtomComp2AtomSys_Chart()
	 * @model
	 * @generated
	 */
	Chart getChart();

	/**
	 * Sets the value of the '{@link fujaba2simulink.AtomComp2AtomSys#getChart <em>Chart</em>}' reference.
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
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getAtomComp2AtomSys_Comp()
	 * @model
	 * @generated
	 */
	Component getComp();

	/**
	 * Sets the value of the '{@link fujaba2simulink.AtomComp2AtomSys#getComp <em>Comp</em>}' reference.
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
	 * @see fujaba2simulink.Fujaba2simulinkPackage#getAtomComp2AtomSys_Sys()
	 * @model
	 * @generated
	 */
	SubSystem getSys();

	/**
	 * Sets the value of the '{@link fujaba2simulink.AtomComp2AtomSys#getSys <em>Sys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys</em>' reference.
	 * @see #getSys()
	 * @generated
	 */
	void setSys(SubSystem value);

} // AtomComp2AtomSys
