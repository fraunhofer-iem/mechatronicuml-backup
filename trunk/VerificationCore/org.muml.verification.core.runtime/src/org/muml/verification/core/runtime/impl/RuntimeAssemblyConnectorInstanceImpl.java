/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.runtime.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pim.instance.impl.AssemblyConnectorInstanceImpl;
import org.muml.verification.core.runtime.MessageOnConnector;
import org.muml.verification.core.runtime.RuntimeAssemblyConnectorInstance;
import org.muml.verification.core.runtime.RuntimeConnectorInstance;
import org.muml.verification.core.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.runtime.impl.RuntimeAssemblyConnectorInstanceImpl#getTransientMessages <em>Transient Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeAssemblyConnectorInstanceImpl extends AssemblyConnectorInstanceImpl implements RuntimeAssemblyConnectorInstance {
	/**
	 * The cached value of the '{@link #getTransientMessages() <em>Transient Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageOnConnector> transientMessages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeAssemblyConnectorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageOnConnector> getTransientMessages() {
		if (transientMessages == null) {
			transientMessages = new EObjectContainmentWithInverseEList<MessageOnConnector>(MessageOnConnector.class, this, RuntimePackage.RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES, RuntimePackage.MESSAGE_ON_CONNECTOR__RUNTIME_CONNECTOR_INSTANCE);
		}
		return transientMessages;
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
			case RuntimePackage.RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransientMessages()).basicAdd(otherEnd, msgs);
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
			case RuntimePackage.RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES:
				return ((InternalEList<?>)getTransientMessages()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES:
				return getTransientMessages();
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
			case RuntimePackage.RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES:
				getTransientMessages().clear();
				getTransientMessages().addAll((Collection<? extends MessageOnConnector>)newValue);
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
			case RuntimePackage.RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES:
				getTransientMessages().clear();
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
			case RuntimePackage.RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES:
				return transientMessages != null && !transientMessages.isEmpty();
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
		if (baseClass == RuntimeConnectorInstance.class) {
			switch (derivedFeatureID) {
				case RuntimePackage.RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES: return RuntimePackage.RUNTIME_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES;
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
		if (baseClass == RuntimeConnectorInstance.class) {
			switch (baseFeatureID) {
				case RuntimePackage.RUNTIME_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES: return RuntimePackage.RUNTIME_ASSEMBLY_CONNECTOR_INSTANCE__TRANSIENT_MESSAGES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RuntimeAssemblyConnectorInstanceImpl
