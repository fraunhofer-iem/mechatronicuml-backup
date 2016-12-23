/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphImpl;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SDM Reachability Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMReachabilityGraphImpl#getUnchangeableNodes <em>Unchangeable Nodes</em>}</li>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMReachabilityGraphImpl#getContainedUnchangeableNodes <em>Contained Unchangeable Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDMReachabilityGraphImpl extends ReachabilityGraphImpl implements SDMReachabilityGraph {
	/**
	 * The cached value of the '{@link #getUnchangeableNodes() <em>Unchangeable Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> unchangeableNodes;

	/**
	 * The cached value of the '{@link #getContainedUnchangeableNodes() <em>Contained Unchangeable Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedUnchangeableNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> containedUnchangeableNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDMReachabilityGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdmPackage.Literals.SDM_REACHABILITY_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getUnchangeableNodes() {
		if (unchangeableNodes == null) {
			unchangeableNodes = new EObjectResolvingEList<EObject>(EObject.class, this, SdmPackage.SDM_REACHABILITY_GRAPH__UNCHANGEABLE_NODES);
		}
		return unchangeableNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getContainedUnchangeableNodes() {
		if (containedUnchangeableNodes == null) {
			containedUnchangeableNodes = new EObjectContainmentEList<EObject>(EObject.class, this, SdmPackage.SDM_REACHABILITY_GRAPH__CONTAINED_UNCHANGEABLE_NODES);
		}
		return containedUnchangeableNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SdmPackage.SDM_REACHABILITY_GRAPH__CONTAINED_UNCHANGEABLE_NODES:
				return ((InternalEList<?>)getContainedUnchangeableNodes()).basicRemove(otherEnd, msgs);
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
			case SdmPackage.SDM_REACHABILITY_GRAPH__UNCHANGEABLE_NODES:
				return getUnchangeableNodes();
			case SdmPackage.SDM_REACHABILITY_GRAPH__CONTAINED_UNCHANGEABLE_NODES:
				return getContainedUnchangeableNodes();
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
			case SdmPackage.SDM_REACHABILITY_GRAPH__UNCHANGEABLE_NODES:
				getUnchangeableNodes().clear();
				getUnchangeableNodes().addAll((Collection<? extends EObject>)newValue);
				return;
			case SdmPackage.SDM_REACHABILITY_GRAPH__CONTAINED_UNCHANGEABLE_NODES:
				getContainedUnchangeableNodes().clear();
				getContainedUnchangeableNodes().addAll((Collection<? extends EObject>)newValue);
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
			case SdmPackage.SDM_REACHABILITY_GRAPH__UNCHANGEABLE_NODES:
				getUnchangeableNodes().clear();
				return;
			case SdmPackage.SDM_REACHABILITY_GRAPH__CONTAINED_UNCHANGEABLE_NODES:
				getContainedUnchangeableNodes().clear();
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
			case SdmPackage.SDM_REACHABILITY_GRAPH__UNCHANGEABLE_NODES:
				return unchangeableNodes != null && !unchangeableNodes.isEmpty();
			case SdmPackage.SDM_REACHABILITY_GRAPH__CONTAINED_UNCHANGEABLE_NODES:
				return containedUnchangeableNodes != null && !containedUnchangeableNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SDMReachabilityGraphImpl
