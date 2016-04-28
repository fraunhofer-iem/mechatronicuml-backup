/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.muml.mumlcore.impl.ExtensionImpl;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.AtomicPropositionMapping;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.LabelingPackage;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Proposition Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.impl.AtomicPropositionMappingImpl#getPropositions <em>Propositions</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.impl.AtomicPropositionMappingImpl#getStepGraph <em>Step Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicPropositionMappingImpl extends ExtensionImpl implements AtomicPropositionMapping {
	/**
	 * The cached value of the '{@link #getPropositions() <em>Propositions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropositions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> propositions;

	/**
	 * The cached value of the '{@link #getStepGraph() <em>Step Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepGraph()
	 * @generated
	 * @ordered
	 */
	protected StepGraph stepGraph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicPropositionMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelingPackage.Literals.ATOMIC_PROPOSITION_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPropositions() {
		if (propositions == null) {
			propositions = new EDataTypeUniqueEList<String>(String.class, this, LabelingPackage.ATOMIC_PROPOSITION_MAPPING__PROPOSITIONS);
		}
		return propositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepGraph getStepGraph() {
		if (stepGraph != null && stepGraph.eIsProxy()) {
			InternalEObject oldStepGraph = (InternalEObject)stepGraph;
			stepGraph = (StepGraph)eResolveProxy(oldStepGraph);
			if (stepGraph != oldStepGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LabelingPackage.ATOMIC_PROPOSITION_MAPPING__STEP_GRAPH, oldStepGraph, stepGraph));
			}
		}
		return stepGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepGraph basicGetStepGraph() {
		return stepGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepGraph(StepGraph newStepGraph) {
		StepGraph oldStepGraph = stepGraph;
		stepGraph = newStepGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabelingPackage.ATOMIC_PROPOSITION_MAPPING__STEP_GRAPH, oldStepGraph, stepGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LabelingPackage.ATOMIC_PROPOSITION_MAPPING__PROPOSITIONS:
				return getPropositions();
			case LabelingPackage.ATOMIC_PROPOSITION_MAPPING__STEP_GRAPH:
				if (resolve) return getStepGraph();
				return basicGetStepGraph();
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
			case LabelingPackage.ATOMIC_PROPOSITION_MAPPING__PROPOSITIONS:
				getPropositions().clear();
				getPropositions().addAll((Collection<? extends String>)newValue);
				return;
			case LabelingPackage.ATOMIC_PROPOSITION_MAPPING__STEP_GRAPH:
				setStepGraph((StepGraph)newValue);
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
			case LabelingPackage.ATOMIC_PROPOSITION_MAPPING__PROPOSITIONS:
				getPropositions().clear();
				return;
			case LabelingPackage.ATOMIC_PROPOSITION_MAPPING__STEP_GRAPH:
				setStepGraph((StepGraph)null);
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
			case LabelingPackage.ATOMIC_PROPOSITION_MAPPING__PROPOSITIONS:
				return propositions != null && !propositions.isEmpty();
			case LabelingPackage.ATOMIC_PROPOSITION_MAPPING__STEP_GRAPH:
				return stepGraph != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (propositions: ");
		result.append(propositions);
		result.append(')');
		return result.toString();
	}

} //AtomicPropositionMappingImpl
