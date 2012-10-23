/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeAssemblyInstanceImpl#getStoredMessages <em>Stored Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RuntimeAssemblyInstanceImpl extends ExtendableElementImpl implements RuntimeAssemblyInstance {
	/**
	 * The cached value of the '{@link #getStoredMessages() <em>Stored Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageOnAssembly> storedMessages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeAssemblyInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.RUNTIME_ASSEMBLY_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageOnAssembly> getStoredMessages() {
		if (storedMessages == null) {
			storedMessages = new EObjectContainmentWithInverseEList<MessageOnAssembly>(MessageOnAssembly.class, this, RuntimePackage.RUNTIME_ASSEMBLY_INSTANCE__STORED_MESSAGES, RuntimePackage.MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY);
		}
		return storedMessages;
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
			case RuntimePackage.RUNTIME_ASSEMBLY_INSTANCE__STORED_MESSAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStoredMessages()).basicAdd(otherEnd, msgs);
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
			case RuntimePackage.RUNTIME_ASSEMBLY_INSTANCE__STORED_MESSAGES:
				return ((InternalEList<?>)getStoredMessages()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.RUNTIME_ASSEMBLY_INSTANCE__STORED_MESSAGES:
				return getStoredMessages();
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
			case RuntimePackage.RUNTIME_ASSEMBLY_INSTANCE__STORED_MESSAGES:
				getStoredMessages().clear();
				getStoredMessages().addAll((Collection<? extends MessageOnAssembly>)newValue);
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
			case RuntimePackage.RUNTIME_ASSEMBLY_INSTANCE__STORED_MESSAGES:
				getStoredMessages().clear();
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
			case RuntimePackage.RUNTIME_ASSEMBLY_INSTANCE__STORED_MESSAGES:
				return storedMessages != null && !storedMessages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuntimeAssemblyInstanceImpl
