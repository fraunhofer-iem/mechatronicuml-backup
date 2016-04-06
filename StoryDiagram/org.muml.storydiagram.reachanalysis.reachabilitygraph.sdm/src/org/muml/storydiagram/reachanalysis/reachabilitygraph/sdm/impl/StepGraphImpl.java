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
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphStateImpl;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.StepGraphImpl#getChangeableNodes <em>Changeable Nodes</em>}</li>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.StepGraphImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.StepGraphImpl#getUnchangeableNodes <em>Unchangeable Nodes</em>}</li>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.StepGraphImpl#getContainedNodes <em>Contained Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepGraphImpl extends ReachabilityGraphStateImpl implements StepGraph {
	/**
	 * The cached value of the '{@link #getChangeableNodes() <em>Changeable Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> changeableNodes;

	/**
	 * The cached value of the '{@link #getContainedNodes() <em>Contained Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> containedNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdmPackage.Literals.STEP_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getChangeableNodes() {
		if (changeableNodes == null) {
			changeableNodes = new EObjectResolvingEList<EObject>(EObject.class, this, SdmPackage.STEP_GRAPH__CHANGEABLE_NODES);
		}
		return changeableNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EObject> getContains() {
		int size = this.getChangeableNodes().size() + this.getUnchangeableNodes().size();
		Object[] objects = new Object[size];
		int j = 0;
		for(EObject curObject : this.getChangeableNodes()){
			objects[j] = curObject;
			j++;
		}
		for(EObject curObject : this.getUnchangeableNodes()){
			objects[j] = curObject;
			j++;
		}
		return new EcoreEList.UnmodifiableEList<EObject>(this, SdmPackage.eINSTANCE.getStepGraph_Contains(), size, objects);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EObject> getUnchangeableNodes() {
		//return empty, unmodifiable list if no reachability graph is set
		if (this.getReachabilityGraph() == null){
			return new EcoreEList.UnmodifiableEList<EObject>(this, SdmPackage.eINSTANCE.getStepGraph_UnchangeableNodes(), 0, new Object[]{});
		} else {
			return ((SDMReachabilityGraph)this.getReachabilityGraph()).getUnchangeableNodes();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getContainedNodes() {
		if (containedNodes == null) {
			containedNodes = new EObjectContainmentEList<EObject>(EObject.class, this, SdmPackage.STEP_GRAPH__CONTAINED_NODES);
		}
		return containedNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SdmPackage.STEP_GRAPH__CONTAINED_NODES:
				return ((InternalEList<?>)getContainedNodes()).basicRemove(otherEnd, msgs);
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
			case SdmPackage.STEP_GRAPH__CHANGEABLE_NODES:
				return getChangeableNodes();
			case SdmPackage.STEP_GRAPH__CONTAINS:
				return getContains();
			case SdmPackage.STEP_GRAPH__UNCHANGEABLE_NODES:
				return getUnchangeableNodes();
			case SdmPackage.STEP_GRAPH__CONTAINED_NODES:
				return getContainedNodes();
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
			case SdmPackage.STEP_GRAPH__CHANGEABLE_NODES:
				getChangeableNodes().clear();
				getChangeableNodes().addAll((Collection<? extends EObject>)newValue);
				return;
			case SdmPackage.STEP_GRAPH__CONTAINED_NODES:
				getContainedNodes().clear();
				getContainedNodes().addAll((Collection<? extends EObject>)newValue);
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
			case SdmPackage.STEP_GRAPH__CHANGEABLE_NODES:
				getChangeableNodes().clear();
				return;
			case SdmPackage.STEP_GRAPH__CONTAINED_NODES:
				getContainedNodes().clear();
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
			case SdmPackage.STEP_GRAPH__CHANGEABLE_NODES:
				return changeableNodes != null && !changeableNodes.isEmpty();
			case SdmPackage.STEP_GRAPH__CONTAINS:
				return !getContains().isEmpty();
			case SdmPackage.STEP_GRAPH__UNCHANGEABLE_NODES:
				return !getUnchangeableNodes().isEmpty();
			case SdmPackage.STEP_GRAPH__CONTAINED_NODES:
				return containedNodes != null && !containedNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StepGraphImpl
