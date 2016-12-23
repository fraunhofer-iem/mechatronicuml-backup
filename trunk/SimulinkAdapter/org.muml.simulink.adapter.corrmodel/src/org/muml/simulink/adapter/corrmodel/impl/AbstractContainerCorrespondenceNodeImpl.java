/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Container Correspondence Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl#getChildCorresp <em>Child Corresp</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractContainerCorrespondenceNodeImpl extends EObjectImpl implements AbstractContainerCorrespondenceNode {
	/**
	 * The cached value of the '{@link #getChildCorresp() <em>Child Corresp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildCorresp()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractContainerCorrespondenceNode> childCorresp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractContainerCorrespondenceNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fujaba2simulinkPackage.Literals.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractContainerCorrespondenceNode> getChildCorresp() {
		if (childCorresp == null) {
			childCorresp = new EObjectContainmentEList<AbstractContainerCorrespondenceNode>(AbstractContainerCorrespondenceNode.class, this, Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP);
		}
		return childCorresp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP:
				return ((InternalEList<?>)getChildCorresp()).basicRemove(otherEnd, msgs);
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
			case Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP:
				return getChildCorresp();
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
			case Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP:
				getChildCorresp().clear();
				getChildCorresp().addAll((Collection<? extends AbstractContainerCorrespondenceNode>)newValue);
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
			case Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP:
				getChildCorresp().clear();
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
			case Fujaba2simulinkPackage.ABSTRACT_CONTAINER_CORRESPONDENCE_NODE__CHILD_CORRESP:
				return childCorresp != null && !childCorresp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractContainerCorrespondenceNodeImpl
