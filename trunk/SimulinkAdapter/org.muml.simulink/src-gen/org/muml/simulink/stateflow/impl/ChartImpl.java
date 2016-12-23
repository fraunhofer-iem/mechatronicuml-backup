/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.stateflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.simulink.ChartBlock;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.Data;
import org.muml.simulink.stateflow.StateflowMachine;
import org.muml.simulink.stateflow.StateflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.stateflow.impl.ChartImpl#getMachine <em>Machine</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.ChartImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.ChartImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.ChartImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChartImpl extends StateImpl implements Chart {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> output;
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> input;
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected ChartBlock block;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateflowPackage.Literals.CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateflowMachine getMachine() {
		if (eContainerFeatureID() != StateflowPackage.CHART__MACHINE) return null;
		return (StateflowMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachine(StateflowMachine newMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMachine, StateflowPackage.CHART__MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachine(StateflowMachine newMachine) {
		if (newMachine != eInternalContainer() || (eContainerFeatureID() != StateflowPackage.CHART__MACHINE && newMachine != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMachine != null)
				msgs = ((InternalEObject)newMachine).eInverseAdd(this, StateflowPackage.STATEFLOW_MACHINE__CHARTS, StateflowMachine.class, msgs);
			msgs = basicSetMachine(newMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateflowPackage.CHART__MACHINE, newMachine, newMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Data>(Data.class, this, StateflowPackage.CHART__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Data>(Data.class, this, StateflowPackage.CHART__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartBlock getBlock() {
		if (block != null && ((EObject)block).eIsProxy()) {
			InternalEObject oldBlock = (InternalEObject)block;
			block = (ChartBlock)eResolveProxy(oldBlock);
			if (block != oldBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateflowPackage.CHART__BLOCK, oldBlock, block));
			}
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartBlock basicGetBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(ChartBlock newBlock, NotificationChain msgs) {
		ChartBlock oldBlock = block;
		block = newBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateflowPackage.CHART__BLOCK, oldBlock, newBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(ChartBlock newBlock) {
		if (newBlock != block) {
			NotificationChain msgs = null;
			if (block != null)
				msgs = ((InternalEObject)block).eInverseRemove(this, SimulinkPackage.CHART_BLOCK__CHART, ChartBlock.class, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, SimulinkPackage.CHART_BLOCK__CHART, ChartBlock.class, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateflowPackage.CHART__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateflowPackage.CHART__MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMachine((StateflowMachine)otherEnd, msgs);
			case StateflowPackage.CHART__BLOCK:
				if (block != null)
					msgs = ((InternalEObject)block).eInverseRemove(this, SimulinkPackage.CHART_BLOCK__CHART, ChartBlock.class, msgs);
				return basicSetBlock((ChartBlock)otherEnd, msgs);
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
			case StateflowPackage.CHART__MACHINE:
				return basicSetMachine(null, msgs);
			case StateflowPackage.CHART__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case StateflowPackage.CHART__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case StateflowPackage.CHART__BLOCK:
				return basicSetBlock(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StateflowPackage.CHART__MACHINE:
				return eInternalContainer().eInverseRemove(this, StateflowPackage.STATEFLOW_MACHINE__CHARTS, StateflowMachine.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateflowPackage.CHART__MACHINE:
				return getMachine();
			case StateflowPackage.CHART__OUTPUT:
				return getOutput();
			case StateflowPackage.CHART__INPUT:
				return getInput();
			case StateflowPackage.CHART__BLOCK:
				if (resolve) return getBlock();
				return basicGetBlock();
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
			case StateflowPackage.CHART__MACHINE:
				setMachine((StateflowMachine)newValue);
				return;
			case StateflowPackage.CHART__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Data>)newValue);
				return;
			case StateflowPackage.CHART__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Data>)newValue);
				return;
			case StateflowPackage.CHART__BLOCK:
				setBlock((ChartBlock)newValue);
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
			case StateflowPackage.CHART__MACHINE:
				setMachine((StateflowMachine)null);
				return;
			case StateflowPackage.CHART__OUTPUT:
				getOutput().clear();
				return;
			case StateflowPackage.CHART__INPUT:
				getInput().clear();
				return;
			case StateflowPackage.CHART__BLOCK:
				setBlock((ChartBlock)null);
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
			case StateflowPackage.CHART__MACHINE:
				return getMachine() != null;
			case StateflowPackage.CHART__OUTPUT:
				return output != null && !output.isEmpty();
			case StateflowPackage.CHART__INPUT:
				return input != null && !input.isEmpty();
			case StateflowPackage.CHART__BLOCK:
				return block != null;
		}
		return super.eIsSet(featureID);
	}

} //ChartImpl
