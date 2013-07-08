/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.VertexImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.VertexImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.impl.VertexImpl#getAllSuperVertices <em>All Super Vertices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VertexImpl extends NamedElementImpl implements Vertex {
	/**
	 * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingTransitions;

	/**
	 * The cached value of the '{@link #getIncomingTransitions() <em>Incoming Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incomingTransitions;

	/**
	 * The cached setting delegate for the '{@link #getAllSuperVertices() <em>All Super Vertices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllSuperVertices()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_SUPER_VERTICES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.VERTEX__ALL_SUPER_VERTICES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.VERTEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS, RealtimestatechartPackage.TRANSITION__SOURCE);
		}
		return outgoingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS, RealtimestatechartPackage.TRANSITION__TARGET);
		}
		return incomingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Vertex> getAllSuperVertices() {
		return (EList<Vertex>)ALL_SUPER_VERTICES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * The cached invocation delegate for the '{@link #isSuperVertexOf(de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex) <em>Is Super Vertex Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuperVertexOf(de.uni_paderborn.fujaba.muml.realtimestatechart.Vertex)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SUPER_VERTEX_OF_VERTEX__EINVOCATION_DELEGATE = ((EOperation.Internal)RealtimestatechartPackage.Literals.VERTEX___IS_SUPER_VERTEX_OF__VERTEX).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuperVertexOf(Vertex vertex) {
		try {
			return (Boolean)IS_SUPER_VERTEX_OF_VERTEX__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{vertex}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUniqueTransitionPriority(final int hint) {
		int nextHighestTransitionPriority = hint;
		for (; hasOutgoingTransitionOfPriority(nextHighestTransitionPriority); nextHighestTransitionPriority++);
		return nextHighestTransitionPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasOutgoingTransitionOfPriority(final int priority) {
		for (Transition transition : getOutgoingTransitions()) {
			if (transition.getPriority() == priority) {
				return true;
			}
		}
		return false;
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
			case RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransitions()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTransitions()).basicAdd(otherEnd, msgs);
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
			case RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS:
				return ((InternalEList<?>)getIncomingTransitions()).basicRemove(otherEnd, msgs);
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
			case RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case RealtimestatechartPackage.VERTEX__ALL_SUPER_VERTICES:
				return getAllSuperVertices();
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
			case RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				getIncomingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RealtimestatechartPackage.VERTEX__ALL_SUPER_VERTICES:
				getAllSuperVertices().clear();
				getAllSuperVertices().addAll((Collection<? extends Vertex>)newValue);
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
			case RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				return;
			case RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				return;
			case RealtimestatechartPackage.VERTEX__ALL_SUPER_VERTICES:
				getAllSuperVertices().clear();
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
			case RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS:
				return outgoingTransitions != null && !outgoingTransitions.isEmpty();
			case RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS:
				return incomingTransitions != null && !incomingTransitions.isEmpty();
			case RealtimestatechartPackage.VERTEX__ALL_SUPER_VERTICES:
				return ALL_SUPER_VERTICES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RealtimestatechartPackage.VERTEX___IS_SUPER_VERTEX_OF__VERTEX:
				return isSuperVertexOf((Vertex)arguments.get(0));
			case RealtimestatechartPackage.VERTEX___GET_UNIQUE_TRANSITION_PRIORITY__INT:
				return getUniqueTransitionPriority((Integer)arguments.get(0));
			case RealtimestatechartPackage.VERTEX___HAS_OUTGOING_TRANSITION_OF_PRIORITY__INT:
				return hasOutgoingTransitionOfPriority((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //VertexImpl
