/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl;

import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ComponentInstanceReconf;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance Reconf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ComponentInstanceReconfImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ComponentInstanceReconfImpl#getReconfDiagram <em>Reconf Diagram</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.impl.ComponentInstanceReconfImpl#getStateToBeActivated <em>State To Be Activated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceReconfImpl extends EObjectImpl implements ComponentInstanceReconf {
	/**
	 * The cached value of the '{@link #getComponentInstance() <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance componentInstance;

	/**
	 * The cached value of the '{@link #getReconfDiagram() <em>Reconf Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfDiagram()
	 * @generated
	 * @ordered
	 */
	protected ReconfDiagram reconfDiagram;

	/**
	 * The cached value of the '{@link #getStateToBeActivated() <em>State To Be Activated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateToBeActivated()
	 * @generated
	 * @ordered
	 */
	protected State stateToBeActivated;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceReconfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfPackage.Literals.COMPONENT_INSTANCE_RECONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getComponentInstance() {
		if (componentInstance != null && componentInstance.eIsProxy()) {
			InternalEObject oldComponentInstance = (InternalEObject)componentInstance;
			componentInstance = (ComponentInstance)eResolveProxy(oldComponentInstance);
			if (componentInstance != oldComponentInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.COMPONENT_INSTANCE_RECONF__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
			}
		}
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetComponentInstance() {
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstance(ComponentInstance newComponentInstance) {
		ComponentInstance oldComponentInstance = componentInstance;
		componentInstance = newComponentInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.COMPONENT_INSTANCE_RECONF__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfDiagram getReconfDiagram() {
		if (reconfDiagram != null && reconfDiagram.eIsProxy()) {
			InternalEObject oldReconfDiagram = (InternalEObject)reconfDiagram;
			reconfDiagram = (ReconfDiagram)eResolveProxy(oldReconfDiagram);
			if (reconfDiagram != oldReconfDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.COMPONENT_INSTANCE_RECONF__RECONF_DIAGRAM, oldReconfDiagram, reconfDiagram));
			}
		}
		return reconfDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfDiagram basicGetReconfDiagram() {
		return reconfDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfDiagram(ReconfDiagram newReconfDiagram) {
		ReconfDiagram oldReconfDiagram = reconfDiagram;
		reconfDiagram = newReconfDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.COMPONENT_INSTANCE_RECONF__RECONF_DIAGRAM, oldReconfDiagram, reconfDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStateToBeActivated() {
		if (stateToBeActivated != null && stateToBeActivated.eIsProxy()) {
			InternalEObject oldStateToBeActivated = (InternalEObject)stateToBeActivated;
			stateToBeActivated = (State)eResolveProxy(oldStateToBeActivated);
			if (stateToBeActivated != oldStateToBeActivated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfPackage.COMPONENT_INSTANCE_RECONF__STATE_TO_BE_ACTIVATED, oldStateToBeActivated, stateToBeActivated));
			}
		}
		return stateToBeActivated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStateToBeActivated() {
		return stateToBeActivated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateToBeActivated(State newStateToBeActivated) {
		State oldStateToBeActivated = stateToBeActivated;
		stateToBeActivated = newStateToBeActivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfPackage.COMPONENT_INSTANCE_RECONF__STATE_TO_BE_ACTIVATED, oldStateToBeActivated, stateToBeActivated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReconfPackage.COMPONENT_INSTANCE_RECONF__COMPONENT_INSTANCE:
				if (resolve) return getComponentInstance();
				return basicGetComponentInstance();
			case ReconfPackage.COMPONENT_INSTANCE_RECONF__RECONF_DIAGRAM:
				if (resolve) return getReconfDiagram();
				return basicGetReconfDiagram();
			case ReconfPackage.COMPONENT_INSTANCE_RECONF__STATE_TO_BE_ACTIVATED:
				if (resolve) return getStateToBeActivated();
				return basicGetStateToBeActivated();
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
			case ReconfPackage.COMPONENT_INSTANCE_RECONF__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)newValue);
				return;
			case ReconfPackage.COMPONENT_INSTANCE_RECONF__RECONF_DIAGRAM:
				setReconfDiagram((ReconfDiagram)newValue);
				return;
			case ReconfPackage.COMPONENT_INSTANCE_RECONF__STATE_TO_BE_ACTIVATED:
				setStateToBeActivated((State)newValue);
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
			case ReconfPackage.COMPONENT_INSTANCE_RECONF__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)null);
				return;
			case ReconfPackage.COMPONENT_INSTANCE_RECONF__RECONF_DIAGRAM:
				setReconfDiagram((ReconfDiagram)null);
				return;
			case ReconfPackage.COMPONENT_INSTANCE_RECONF__STATE_TO_BE_ACTIVATED:
				setStateToBeActivated((State)null);
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
			case ReconfPackage.COMPONENT_INSTANCE_RECONF__COMPONENT_INSTANCE:
				return componentInstance != null;
			case ReconfPackage.COMPONENT_INSTANCE_RECONF__RECONF_DIAGRAM:
				return reconfDiagram != null;
			case ReconfPackage.COMPONENT_INSTANCE_RECONF__STATE_TO_BE_ACTIVATED:
				return stateToBeActivated != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ReconfPackage.COMPONENT_INSTANCE_RECONF___GET_CNAME:
				return getCName();
			case ReconfPackage.COMPONENT_INSTANCE_RECONF___GET_NAME:
				return getName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComponentInstanceReconfImpl
