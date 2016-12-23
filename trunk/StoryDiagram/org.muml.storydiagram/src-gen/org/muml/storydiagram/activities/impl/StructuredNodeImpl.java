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
 *   <li>{@link org.muml.storydiagram.activities.impl.StructuredNodeImpl#getOwnedActivityNodes <em>Owned Activity Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredNodeImpl extends ActivityNodeImpl implements
		StructuredNode {
	/**
	 * The cached value of the '{@link #getOwnedActivityNodes() <em>Owned Activity Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActivityNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> ownedActivityNodes;
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
	public EList<ActivityNode> getOwnedActivityNodes() {
		if (ownedActivityNodes == null) {
			ownedActivityNodes = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODES, ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY_NODE);
		}
		return ownedActivityNodes;
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
			case ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedActivityNodes()).basicAdd(otherEnd, msgs);
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
			case ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODES:
				return ((InternalEList<?>)getOwnedActivityNodes()).basicRemove(otherEnd, msgs);
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
			case ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODES:
				return getOwnedActivityNodes();
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
			case ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODES:
				getOwnedActivityNodes().clear();
				getOwnedActivityNodes().addAll((Collection<? extends ActivityNode>)newValue);
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
			case ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODES:
				getOwnedActivityNodes().clear();
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
			case ActivitiesPackage.STRUCTURED_NODE__OWNED_ACTIVITY_NODES:
				return ownedActivityNodes != null && !ownedActivityNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StructuredNodeImpl
