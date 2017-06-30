/**
 */
package org.muml.uppaal.adapter.mtctl.predicates.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.uppaal.adapter.mtctl.comparables.MapExpr;
import org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage;
import org.muml.uppaal.adapter.mtctl.predicates.StateInStatechartExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State In Statechart Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.predicates.impl.StateInStatechartExprImpl#getState <em>State</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.predicates.impl.StateInStatechartExprImpl#getStatechart <em>Statechart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateInStatechartExprImpl extends StaticPredicateExprImpl implements StateInStatechartExpr {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected MapExpr state;

	/**
	 * The cached value of the '{@link #getStatechart() <em>Statechart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatechart()
	 * @generated
	 * @ordered
	 */
	protected MapExpr statechart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateInStatechartExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PredicatesPackage.Literals.STATE_IN_STATECHART_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapExpr getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(MapExpr newState, NotificationChain msgs) {
		MapExpr oldState = state;
		state = newState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PredicatesPackage.STATE_IN_STATECHART_EXPR__STATE, oldState, newState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(MapExpr newState) {
		if (newState != state) {
			NotificationChain msgs = null;
			if (state != null)
				msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PredicatesPackage.STATE_IN_STATECHART_EXPR__STATE, null, msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PredicatesPackage.STATE_IN_STATECHART_EXPR__STATE, null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PredicatesPackage.STATE_IN_STATECHART_EXPR__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapExpr getStatechart() {
		return statechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatechart(MapExpr newStatechart, NotificationChain msgs) {
		MapExpr oldStatechart = statechart;
		statechart = newStatechart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PredicatesPackage.STATE_IN_STATECHART_EXPR__STATECHART, oldStatechart, newStatechart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechart(MapExpr newStatechart) {
		if (newStatechart != statechart) {
			NotificationChain msgs = null;
			if (statechart != null)
				msgs = ((InternalEObject)statechart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PredicatesPackage.STATE_IN_STATECHART_EXPR__STATECHART, null, msgs);
			if (newStatechart != null)
				msgs = ((InternalEObject)newStatechart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PredicatesPackage.STATE_IN_STATECHART_EXPR__STATECHART, null, msgs);
			msgs = basicSetStatechart(newStatechart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PredicatesPackage.STATE_IN_STATECHART_EXPR__STATECHART, newStatechart, newStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PredicatesPackage.STATE_IN_STATECHART_EXPR__STATE:
				return basicSetState(null, msgs);
			case PredicatesPackage.STATE_IN_STATECHART_EXPR__STATECHART:
				return basicSetStatechart(null, msgs);
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
			case PredicatesPackage.STATE_IN_STATECHART_EXPR__STATE:
				return getState();
			case PredicatesPackage.STATE_IN_STATECHART_EXPR__STATECHART:
				return getStatechart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PredicatesPackage.STATE_IN_STATECHART_EXPR__STATE:
				setState((MapExpr)newValue);
				return;
			case PredicatesPackage.STATE_IN_STATECHART_EXPR__STATECHART:
				setStatechart((MapExpr)newValue);
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
			case PredicatesPackage.STATE_IN_STATECHART_EXPR__STATE:
				setState((MapExpr)null);
				return;
			case PredicatesPackage.STATE_IN_STATECHART_EXPR__STATECHART:
				setStatechart((MapExpr)null);
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
			case PredicatesPackage.STATE_IN_STATECHART_EXPR__STATE:
				return state != null;
			case PredicatesPackage.STATE_IN_STATECHART_EXPR__STATECHART:
				return statechart != null;
		}
		return super.eIsSet(featureID);
	}

} //StateInStatechartExprImpl
