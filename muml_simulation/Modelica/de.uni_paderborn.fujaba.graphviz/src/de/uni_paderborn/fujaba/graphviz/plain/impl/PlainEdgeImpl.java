/**
 */
package de.uni_paderborn.fujaba.graphviz.plain.impl;

import de.uni_paderborn.fujaba.graphviz.common.impl.EdgeImpl;

import de.uni_paderborn.fujaba.graphviz.plain.PlainEdge;
import de.uni_paderborn.fujaba.graphviz.plain.PlainNode;
import de.uni_paderborn.fujaba.graphviz.plain.PlainPackage;

import de.uni_paderborn.fujaba.graphviz.util.Point;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.plain.impl.PlainEdgeImpl#getSplinePoints <em>Spline Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlainEdgeImpl extends EdgeImpl<PlainNode> implements PlainEdge {
	/**
	 * The cached value of the '{@link #getSplinePoints() <em>Spline Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplinePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> splinePoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlainEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlainPackage.Literals.PLAIN_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setSource(PlainNode newSource) {
		super.setSource(newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setTarget(PlainNode newTarget) {
		super.setTarget(newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getSplinePoints() {
		if (splinePoints == null) {
			splinePoints = new EObjectContainmentEList<Point>(Point.class, this, PlainPackage.PLAIN_EDGE__SPLINE_POINTS);
		}
		return splinePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlainPackage.PLAIN_EDGE__SPLINE_POINTS:
				return ((InternalEList<?>)getSplinePoints()).basicRemove(otherEnd, msgs);
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
			case PlainPackage.PLAIN_EDGE__SPLINE_POINTS:
				return getSplinePoints();
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
			case PlainPackage.PLAIN_EDGE__SPLINE_POINTS:
				getSplinePoints().clear();
				getSplinePoints().addAll((Collection<? extends Point>)newValue);
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
			case PlainPackage.PLAIN_EDGE__SPLINE_POINTS:
				getSplinePoints().clear();
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
			case PlainPackage.PLAIN_EDGE__SPLINE_POINTS:
				return splinePoints != null && !splinePoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlainEdgeImpl
