/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.simulink.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.simulink.model.Bus;
import de.uni_paderborn.fujaba.simulink.model.SimulinkFile;
import de.uni_paderborn.fujaba.simulink.model.SimulinkPackage;
import de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowMachine;
import de.uni_paderborn.fujaba.simulink.model.stateflow.StateflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.impl.SimulinkFileImpl#getStateflowMachine <em>Stateflow Machine</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.simulink.model.impl.SimulinkFileImpl#getBuses <em>Buses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SimulinkFileImpl extends SubSystemImpl implements SimulinkFile {
	/**
	 * The cached value of the '{@link #getStateflowMachine() <em>Stateflow Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateflowMachine()
	 * @generated
	 * @ordered
	 */
	protected StateflowMachine stateflowMachine;

	/**
	 * The cached value of the '{@link #getBuses() <em>Buses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuses()
	 * @generated
	 * @ordered
	 */
	protected EList<Bus> buses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulinkFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.SIMULINK_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateflowMachine getStateflowMachine() {
		return stateflowMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateflowMachine(StateflowMachine newStateflowMachine, NotificationChain msgs) {
		StateflowMachine oldStateflowMachine = stateflowMachine;
		stateflowMachine = newStateflowMachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimulinkPackage.SIMULINK_FILE__STATEFLOW_MACHINE, oldStateflowMachine, newStateflowMachine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateflowMachine(StateflowMachine newStateflowMachine) {
		if (newStateflowMachine != stateflowMachine) {
			NotificationChain msgs = null;
			if (stateflowMachine != null)
				msgs = ((InternalEObject)stateflowMachine).eInverseRemove(this, StateflowPackage.STATEFLOW_MACHINE__MODEL, StateflowMachine.class, msgs);
			if (newStateflowMachine != null)
				msgs = ((InternalEObject)newStateflowMachine).eInverseAdd(this, StateflowPackage.STATEFLOW_MACHINE__MODEL, StateflowMachine.class, msgs);
			msgs = basicSetStateflowMachine(newStateflowMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.SIMULINK_FILE__STATEFLOW_MACHINE, newStateflowMachine, newStateflowMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bus> getBuses() {
		if (buses == null) {
			buses = new EObjectContainmentEList<Bus>(Bus.class, this, SimulinkPackage.SIMULINK_FILE__BUSES);
		}
		return buses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimulinkPackage.SIMULINK_FILE__STATEFLOW_MACHINE:
				if (stateflowMachine != null)
					msgs = ((InternalEObject)stateflowMachine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimulinkPackage.SIMULINK_FILE__STATEFLOW_MACHINE, null, msgs);
				return basicSetStateflowMachine((StateflowMachine)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimulinkPackage.SIMULINK_FILE__STATEFLOW_MACHINE:
				return basicSetStateflowMachine(null, msgs);
			case SimulinkPackage.SIMULINK_FILE__BUSES:
				return ((InternalEList<?>)getBuses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulinkPackage.SIMULINK_FILE__STATEFLOW_MACHINE:
				return getStateflowMachine();
			case SimulinkPackage.SIMULINK_FILE__BUSES:
				return getBuses();
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
			case SimulinkPackage.SIMULINK_FILE__STATEFLOW_MACHINE:
				setStateflowMachine((StateflowMachine)newValue);
				return;
			case SimulinkPackage.SIMULINK_FILE__BUSES:
				getBuses().clear();
				getBuses().addAll((Collection<? extends Bus>)newValue);
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
			case SimulinkPackage.SIMULINK_FILE__STATEFLOW_MACHINE:
				setStateflowMachine((StateflowMachine)null);
				return;
			case SimulinkPackage.SIMULINK_FILE__BUSES:
				getBuses().clear();
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
			case SimulinkPackage.SIMULINK_FILE__STATEFLOW_MACHINE:
				return stateflowMachine != null;
			case SimulinkPackage.SIMULINK_FILE__BUSES:
				return buses != null && !buses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimulinkFileImpl
