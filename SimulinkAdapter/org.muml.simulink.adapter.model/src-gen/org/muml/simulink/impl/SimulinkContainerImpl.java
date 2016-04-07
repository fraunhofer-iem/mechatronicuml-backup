/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.simulink.SimulinkContainer;
import org.muml.simulink.SimulinkLibrary;
import org.muml.simulink.SimulinkModel;
import org.muml.simulink.SimulinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.impl.SimulinkContainerImpl#getModels <em>Models</em>}</li>
 *   <li>{@link org.muml.simulink.impl.SimulinkContainerImpl#getLibraries <em>Libraries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulinkContainerImpl extends ElementImpl implements SimulinkContainer {
	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<SimulinkModel> models;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<SimulinkLibrary> libraries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulinkContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.SIMULINK_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimulinkModel> getModels() {
		if (models == null) {
			models = new EObjectContainmentWithInverseEList<SimulinkModel>(SimulinkModel.class, this, SimulinkPackage.SIMULINK_CONTAINER__MODELS, SimulinkPackage.SIMULINK_MODEL__ROOT);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimulinkLibrary> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<SimulinkLibrary>(SimulinkLibrary.class, this, SimulinkPackage.SIMULINK_CONTAINER__LIBRARIES);
		}
		return libraries;
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
			case SimulinkPackage.SIMULINK_CONTAINER__MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModels()).basicAdd(otherEnd, msgs);
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
			case SimulinkPackage.SIMULINK_CONTAINER__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case SimulinkPackage.SIMULINK_CONTAINER__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
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
			case SimulinkPackage.SIMULINK_CONTAINER__MODELS:
				return getModels();
			case SimulinkPackage.SIMULINK_CONTAINER__LIBRARIES:
				return getLibraries();
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
			case SimulinkPackage.SIMULINK_CONTAINER__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends SimulinkModel>)newValue);
				return;
			case SimulinkPackage.SIMULINK_CONTAINER__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends SimulinkLibrary>)newValue);
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
			case SimulinkPackage.SIMULINK_CONTAINER__MODELS:
				getModels().clear();
				return;
			case SimulinkPackage.SIMULINK_CONTAINER__LIBRARIES:
				getLibraries().clear();
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
			case SimulinkPackage.SIMULINK_CONTAINER__MODELS:
				return models != null && !models.isEmpty();
			case SimulinkPackage.SIMULINK_CONTAINER__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimulinkContainerImpl
