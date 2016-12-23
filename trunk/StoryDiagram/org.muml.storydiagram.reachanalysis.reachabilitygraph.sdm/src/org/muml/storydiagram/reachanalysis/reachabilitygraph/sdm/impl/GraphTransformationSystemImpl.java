/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Transformation System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.GraphTransformationSystemImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.GraphTransformationSystemImpl#getUnchangeableNodes <em>Unchangeable Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphTransformationSystemImpl extends EObjectImpl implements GraphTransformationSystem {
	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activities;

	/**
	 * The cached value of the '{@link #getUnchangeableNodes() <em>Unchangeable Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> unchangeableNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphTransformationSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdmPackage.Literals.GRAPH_TRANSFORMATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectResolvingEList<Activity>(Activity.class, this, SdmPackage.GRAPH_TRANSFORMATION_SYSTEM__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getUnchangeableNodes() {
		if (unchangeableNodes == null) {
			unchangeableNodes = new EObjectResolvingEList<EClass>(EClass.class, this, SdmPackage.GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES);
		}
		return unchangeableNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SdmPackage.GRAPH_TRANSFORMATION_SYSTEM__ACTIVITIES:
				return getActivities();
			case SdmPackage.GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES:
				return getUnchangeableNodes();
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
			case SdmPackage.GRAPH_TRANSFORMATION_SYSTEM__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case SdmPackage.GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES:
				getUnchangeableNodes().clear();
				getUnchangeableNodes().addAll((Collection<? extends EClass>)newValue);
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
			case SdmPackage.GRAPH_TRANSFORMATION_SYSTEM__ACTIVITIES:
				getActivities().clear();
				return;
			case SdmPackage.GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES:
				getUnchangeableNodes().clear();
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
			case SdmPackage.GRAPH_TRANSFORMATION_SYSTEM__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case SdmPackage.GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES:
				return unchangeableNodes != null && !unchangeableNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphTransformationSystemImpl
