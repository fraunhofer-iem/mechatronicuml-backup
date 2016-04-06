/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.StructuredNode;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Structured Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.impl.StructuredNodeImpl#getOwnedActivityNode <em>Owned Activity Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredNodeImpl extends ActivityNodeImpl implements
		StructuredNode {
	/**
	 * The cached value of the '{@link #getOwnedActivityNode() <em>Owned Activity Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActivityNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> ownedActivityNode;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.STRUCTURED_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getOwnedActivityNode() {
		if (ownedActivityNode == null) {
			ownedActivityNode = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODE, ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE);
		}
		return ownedActivityNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedActivityNode()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODE:
				return ((InternalEList<?>)getOwnedActivityNode()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODE:
				return getOwnedActivityNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODE:
				getOwnedActivityNode().clear();
				getOwnedActivityNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODE:
				getOwnedActivityNode().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODE:
				return ownedActivityNode != null && !ownedActivityNode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StructuredNodeImpl
