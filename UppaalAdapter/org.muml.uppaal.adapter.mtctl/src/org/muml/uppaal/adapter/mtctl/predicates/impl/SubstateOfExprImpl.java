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
import org.muml.uppaal.adapter.mtctl.predicates.SubstateOfExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substate Of Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.predicates.impl.SubstateOfExprImpl#getSuperstate <em>Superstate</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.predicates.impl.SubstateOfExprImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstateOfExprImpl extends StaticPredicateExprImpl implements SubstateOfExpr {
	/**
	 * The cached value of the '{@link #getSuperstate() <em>Superstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperstate()
	 * @generated
	 * @ordered
	 */
	protected MapExpr superstate;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstateOfExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PredicatesPackage.Literals.SUBSTATE_OF_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapExpr getSuperstate() {
		return superstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperstate(MapExpr newSuperstate, NotificationChain msgs) {
		MapExpr oldSuperstate = superstate;
		superstate = newSuperstate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PredicatesPackage.SUBSTATE_OF_EXPR__SUPERSTATE, oldSuperstate, newSuperstate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperstate(MapExpr newSuperstate) {
		if (newSuperstate != superstate) {
			NotificationChain msgs = null;
			if (superstate != null)
				msgs = ((InternalEObject)superstate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PredicatesPackage.SUBSTATE_OF_EXPR__SUPERSTATE, null, msgs);
			if (newSuperstate != null)
				msgs = ((InternalEObject)newSuperstate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PredicatesPackage.SUBSTATE_OF_EXPR__SUPERSTATE, null, msgs);
			msgs = basicSetSuperstate(newSuperstate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PredicatesPackage.SUBSTATE_OF_EXPR__SUPERSTATE, newSuperstate, newSuperstate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PredicatesPackage.SUBSTATE_OF_EXPR__STATE, oldState, newState);
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
				msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PredicatesPackage.SUBSTATE_OF_EXPR__STATE, null, msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PredicatesPackage.SUBSTATE_OF_EXPR__STATE, null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PredicatesPackage.SUBSTATE_OF_EXPR__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PredicatesPackage.SUBSTATE_OF_EXPR__SUPERSTATE:
				return basicSetSuperstate(null, msgs);
			case PredicatesPackage.SUBSTATE_OF_EXPR__STATE:
				return basicSetState(null, msgs);
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
			case PredicatesPackage.SUBSTATE_OF_EXPR__SUPERSTATE:
				return getSuperstate();
			case PredicatesPackage.SUBSTATE_OF_EXPR__STATE:
				return getState();
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
			case PredicatesPackage.SUBSTATE_OF_EXPR__SUPERSTATE:
				setSuperstate((MapExpr)newValue);
				return;
			case PredicatesPackage.SUBSTATE_OF_EXPR__STATE:
				setState((MapExpr)newValue);
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
			case PredicatesPackage.SUBSTATE_OF_EXPR__SUPERSTATE:
				setSuperstate((MapExpr)null);
				return;
			case PredicatesPackage.SUBSTATE_OF_EXPR__STATE:
				setState((MapExpr)null);
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
			case PredicatesPackage.SUBSTATE_OF_EXPR__SUPERSTATE:
				return superstate != null;
			case PredicatesPackage.SUBSTATE_OF_EXPR__STATE:
				return state != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstateOfExprImpl
