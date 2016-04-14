/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.runtime.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pim.instance.impl.DiscretePortInstanceImpl;
import org.muml.pim.types.DataType;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;
import org.muml.verification.core.runtime.RuntimeBehavioralElement;
import org.muml.verification.core.runtime.RuntimeDiscreteInteractionEndpointInstance;
import org.muml.verification.core.runtime.RuntimeDiscretePortInstance;
import org.muml.verification.core.runtime.RuntimeMessageBuffer;
import org.muml.verification.core.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.runtime.impl.RuntimeDiscretePortInstanceImpl#getStatechartInstance <em>Statechart Instance</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.impl.RuntimeDiscretePortInstanceImpl#getMessageBuffer <em>Message Buffer</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RuntimeDiscretePortInstanceImpl extends DiscretePortInstanceImpl implements RuntimeDiscretePortInstance {
	/**
	 * The cached value of the '{@link #getStatechartInstance() <em>Statechart Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatechartInstance()
	 * @generated
	 * @ordered
	 */
	protected RealtimeStatechartInstance statechartInstance;
	/**
	 * The cached value of the '{@link #getMessageBuffer() <em>Message Buffer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageBuffer()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeMessageBuffer> messageBuffer;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeDiscretePortInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.RUNTIME_DISCRETE_PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechartInstance getStatechartInstance() {
		if (statechartInstance != null && statechartInstance.eIsProxy()) {
			InternalEObject oldStatechartInstance = (InternalEObject)statechartInstance;
			statechartInstance = (RealtimeStatechartInstance)eResolveProxy(oldStatechartInstance);
			if (statechartInstance != oldStatechartInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE, oldStatechartInstance, statechartInstance));
			}
		}
		return statechartInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechartInstance basicGetStatechartInstance() {
		return statechartInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatechartInstance(RealtimeStatechartInstance newStatechartInstance, NotificationChain msgs) {
		RealtimeStatechartInstance oldStatechartInstance = statechartInstance;
		statechartInstance = newStatechartInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE, oldStatechartInstance, newStatechartInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechartInstance(RealtimeStatechartInstance newStatechartInstance) {
		if (newStatechartInstance != statechartInstance) {
			NotificationChain msgs = null;
			if (statechartInstance != null)
				msgs = ((InternalEObject)statechartInstance).eInverseRemove(this, RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT, RealtimeStatechartInstance.class, msgs);
			if (newStatechartInstance != null)
				msgs = ((InternalEObject)newStatechartInstance).eInverseAdd(this, RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT, RealtimeStatechartInstance.class, msgs);
			msgs = basicSetStatechartInstance(newStatechartInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE, newStatechartInstance, newStatechartInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeMessageBuffer> getMessageBuffer() {
		if (messageBuffer == null) {
			messageBuffer = new EObjectContainmentWithInverseEList<RuntimeMessageBuffer>(RuntimeMessageBuffer.class, this, RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_BUFFER, RuntimePackage.RUNTIME_MESSAGE_BUFFER__RUNTIME_BEHAVIORAL_ELEMENT);
		}
		return messageBuffer;
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
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE:
				if (statechartInstance != null)
					msgs = ((InternalEObject)statechartInstance).eInverseRemove(this, RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT, RealtimeStatechartInstance.class, msgs);
				return basicSetStatechartInstance((RealtimeStatechartInstance)otherEnd, msgs);
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_BUFFER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMessageBuffer()).basicAdd(otherEnd, msgs);
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
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE:
				return basicSetStatechartInstance(null, msgs);
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_BUFFER:
				return ((InternalEList<?>)getMessageBuffer()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE:
				if (resolve) return getStatechartInstance();
				return basicGetStatechartInstance();
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_BUFFER:
				return getMessageBuffer();
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
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE:
				setStatechartInstance((RealtimeStatechartInstance)newValue);
				return;
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_BUFFER:
				getMessageBuffer().clear();
				getMessageBuffer().addAll((Collection<? extends RuntimeMessageBuffer>)newValue);
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
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE:
				setStatechartInstance((RealtimeStatechartInstance)null);
				return;
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_BUFFER:
				getMessageBuffer().clear();
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
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE:
				return statechartInstance != null;
			case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_BUFFER:
				return messageBuffer != null && !messageBuffer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RuntimeBehavioralElement.class) {
			switch (derivedFeatureID) {
				case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE: return RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE;
				case RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_BUFFER: return RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER;
				default: return -1;
			}
		}
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RuntimeDiscreteInteractionEndpointInstance.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RuntimeBehavioralElement.class) {
			switch (baseFeatureID) {
				case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE: return RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__STATECHART_INSTANCE;
				case RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__MESSAGE_BUFFER: return RuntimePackage.RUNTIME_DISCRETE_PORT_INSTANCE__MESSAGE_BUFFER;
				default: return -1;
			}
		}
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RuntimeDiscreteInteractionEndpointInstance.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RuntimeDiscretePortInstanceImpl
