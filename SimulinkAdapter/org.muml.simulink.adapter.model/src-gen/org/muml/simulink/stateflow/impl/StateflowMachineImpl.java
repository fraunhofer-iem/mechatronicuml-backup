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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.simulink.SimulinkFile;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.stateflow.Chart;
import org.muml.simulink.stateflow.StateflowMachine;
import org.muml.simulink.stateflow.StateflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateflowMachineImpl#getCharts <em>Charts</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateflowMachineImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateflowMachineImpl extends StateflowElementImpl implements StateflowMachine {
	/**
	 * The cached value of the '{@link #getCharts() <em>Charts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharts()
	 * @generated
	 * @ordered
	 */
	protected EList<Chart> charts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateflowMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateflowPackage.Literals.STATEFLOW_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chart> getCharts() {
		if (charts == null) {
			charts = new EObjectContainmentWithInverseEList<Chart>(Chart.class, this, StateflowPackage.STATEFLOW_MACHINE__CHARTS, StateflowPackage.CHART__MACHINE);
		}
		return charts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkFile getModel() {
		if (eContainerFeatureID() != StateflowPackage.STATEFLOW_MACHINE__MODEL) return null;
		return (SimulinkFile)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(SimulinkFile newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, StateflowPackage.STATEFLOW_MACHINE__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(SimulinkFile newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != StateflowPackage.STATEFLOW_MACHINE__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, SimulinkPackage.SIMULINK_FILE__STATEFLOW_MACHINE, SimulinkFile.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateflowPackage.STATEFLOW_MACHINE__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateflowPackage.STATEFLOW_MACHINE__CHARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCharts()).basicAdd(otherEnd, msgs);
			case StateflowPackage.STATEFLOW_MACHINE__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((SimulinkFile)otherEnd, msgs);
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
			case StateflowPackage.STATEFLOW_MACHINE__CHARTS:
				return ((InternalEList<?>)getCharts()).basicRemove(otherEnd, msgs);
			case StateflowPackage.STATEFLOW_MACHINE__MODEL:
				return basicSetModel(null, msgs);
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
			case StateflowPackage.STATEFLOW_MACHINE__MODEL:
				return eInternalContainer().eInverseRemove(this, SimulinkPackage.SIMULINK_FILE__STATEFLOW_MACHINE, SimulinkFile.class, msgs);
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
			case StateflowPackage.STATEFLOW_MACHINE__CHARTS:
				return getCharts();
			case StateflowPackage.STATEFLOW_MACHINE__MODEL:
				return getModel();
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
			case StateflowPackage.STATEFLOW_MACHINE__CHARTS:
				getCharts().clear();
				getCharts().addAll((Collection<? extends Chart>)newValue);
				return;
			case StateflowPackage.STATEFLOW_MACHINE__MODEL:
				setModel((SimulinkFile)newValue);
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
			case StateflowPackage.STATEFLOW_MACHINE__CHARTS:
				getCharts().clear();
				return;
			case StateflowPackage.STATEFLOW_MACHINE__MODEL:
				setModel((SimulinkFile)null);
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
			case StateflowPackage.STATEFLOW_MACHINE__CHARTS:
				return charts != null && !charts.isEmpty();
			case StateflowPackage.STATEFLOW_MACHINE__MODEL:
				return getModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //StateflowMachineImpl
