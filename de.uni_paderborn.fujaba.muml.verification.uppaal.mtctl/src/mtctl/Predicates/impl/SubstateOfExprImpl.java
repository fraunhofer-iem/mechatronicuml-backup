/**
 */
package mtctl.Predicates.impl;

import mtctl.Predicates.PredicatesPackage;
import mtctl.Predicates.SubstateOfExpr;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substate Of Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mtctl.Predicates.impl.SubstateOfExprImpl#getSuperstate <em>Superstate</em>}</li>
 *   <li>{@link mtctl.Predicates.impl.SubstateOfExprImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstateOfExprImpl extends StaticPredicateExprImpl implements SubstateOfExpr {
	/**
	 * The cached value of the '{@link #getSuperstate() <em>Superstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperstate()
	 * @generated
	 * @ordered
	 */
	protected EObject superstate;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EObject state;

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
	public EObject getSuperstate() {
		if (superstate != null && superstate.eIsProxy()) {
			InternalEObject oldSuperstate = (InternalEObject)superstate;
			superstate = eResolveProxy(oldSuperstate);
			if (superstate != oldSuperstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PredicatesPackage.SUBSTATE_OF_EXPR__SUPERSTATE, oldSuperstate, superstate));
			}
		}
		return superstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSuperstate() {
		return superstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperstate(EObject newSuperstate) {
		EObject oldSuperstate = superstate;
		superstate = newSuperstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PredicatesPackage.SUBSTATE_OF_EXPR__SUPERSTATE, oldSuperstate, superstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PredicatesPackage.SUBSTATE_OF_EXPR__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(EObject newState) {
		EObject oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PredicatesPackage.SUBSTATE_OF_EXPR__STATE, oldState, state));
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
				if (resolve) return getSuperstate();
				return basicGetSuperstate();
			case PredicatesPackage.SUBSTATE_OF_EXPR__STATE:
				if (resolve) return getState();
				return basicGetState();
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
				setSuperstate((EObject)newValue);
				return;
			case PredicatesPackage.SUBSTATE_OF_EXPR__STATE:
				setState((EObject)newValue);
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
				setSuperstate((EObject)null);
				return;
			case PredicatesPackage.SUBSTATE_OF_EXPR__STATE:
				setState((EObject)null);
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
