/**
 */
package org.muml.storydiagram.verification.sdd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.NamedElementImpl;
import org.muml.storydiagram.verification.sdd.AbstractStoryDecisionDiagram;
import org.muml.storydiagram.verification.sdd.Edge;
import org.muml.storydiagram.verification.sdd.Node;
import org.muml.storydiagram.verification.sdd.SDDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Story Decision Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.verification.sdd.impl.AbstractStoryDecisionDiagramImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.muml.storydiagram.verification.sdd.impl.AbstractStoryDecisionDiagramImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractStoryDecisionDiagramImpl extends NamedElementImpl implements AbstractStoryDecisionDiagram {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStoryDecisionDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SDDPackage.Literals.ABSTRACT_STORY_DECISION_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<Edge>(Edge.class, this, SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
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
			case SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__NODES:
				return getNodes();
			case SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__EDGES:
				return getEdges();
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
			case SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
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
			case SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__NODES:
				getNodes().clear();
				return;
			case SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__EDGES:
				getEdges().clear();
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
			case SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__NODES:
				return nodes != null && !nodes.isEmpty();
			case SDDPackage.ABSTRACT_STORY_DECISION_DIAGRAM__EDGES:
				return edges != null && !edges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractStoryDecisionDiagramImpl
