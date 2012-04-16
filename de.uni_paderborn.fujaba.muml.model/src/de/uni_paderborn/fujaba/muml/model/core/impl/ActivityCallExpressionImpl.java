/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.TypedElement;
import org.storydriven.core.expressions.Expression;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.calls.impl.InvocationImpl;

import de.uni_paderborn.fujaba.muml.model.core.ActivityCallExpression;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.impl.ActivityCallExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.impl.ActivityCallExpressionImpl#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.impl.ActivityCallExpressionImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityCallExpressionImpl extends InvocationImpl implements ActivityCallExpression {
	/**
	 * The cached value of the '{@link #getGenericType() <em>Generic Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericType()
	 * @generated
	 * @ordered
	 */
	protected EGenericType genericType;
	/**
	 * This is true if the Generic Type containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean genericTypeESet;
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityCallExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ACTIVITY_CALL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClassifier getType() {
		EClassifier type = basicGetType();
		return type != null && type.eIsProxy() ? (EClassifier)eResolveProxy((InternalEObject)type) : type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetType() {
		// TODO: implement this method to return the 'Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EGenericType getGenericType() {
		if (genericType != null && genericType.eIsProxy()) {
			InternalEObject oldGenericType = (InternalEObject)genericType;
			genericType = (EGenericType)eResolveProxy(oldGenericType);
			if (genericType != oldGenericType) {
				InternalEObject newGenericType = (InternalEObject)genericType;
				NotificationChain msgs = oldGenericType.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE, null, null);
				if (newGenericType.eInternalContainer() == null) {
					msgs = newGenericType.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE, oldGenericType, genericType));
			}
		}
		return genericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType basicGetGenericType() {
		return genericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericType(EGenericType newGenericType, NotificationChain msgs) {
		EGenericType oldGenericType = genericType;
		genericType = newGenericType;
		boolean oldGenericTypeESet = genericTypeESet;
		genericTypeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE, oldGenericType, newGenericType, !oldGenericTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenericType(EGenericType newGenericType) {
		if (newGenericType != genericType) {
			NotificationChain msgs = null;
			if (genericType != null)
				msgs = ((InternalEObject)genericType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE, null, msgs);
			if (newGenericType != null)
				msgs = ((InternalEObject)newGenericType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE, null, msgs);
			msgs = basicSetGenericType(newGenericType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGenericTypeESet = genericTypeESet;
			genericTypeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE, newGenericType, newGenericType, !oldGenericTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetGenericType(NotificationChain msgs) {
		EGenericType oldGenericType = genericType;
		genericType = null;
		boolean oldGenericTypeESet = genericTypeESet;
		genericTypeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE, oldGenericType, null, oldGenericTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGenericType() {
		if (genericType != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)genericType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE, null, msgs);
			msgs = basicUnsetGenericType(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGenericTypeESet = genericTypeESet;
			genericTypeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE, null, null, oldGenericTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGenericType() {
		return genericTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY, oldActivity, newActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivity(Activity newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject)activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY, null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY, null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE:
				return basicUnsetGenericType(msgs);
			case CorePackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY:
				return basicSetActivity(null, msgs);
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
			case CorePackage.ACTIVITY_CALL_EXPRESSION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE:
				if (resolve) return getGenericType();
				return basicGetGenericType();
			case CorePackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY:
				return getActivity();
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
			case CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE:
				setGenericType((EGenericType)newValue);
				return;
			case CorePackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY:
				setActivity((Activity)newValue);
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
			case CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE:
				unsetGenericType();
				return;
			case CorePackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY:
				setActivity((Activity)null);
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
			case CorePackage.ACTIVITY_CALL_EXPRESSION__TYPE:
				return basicGetType() != null;
			case CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE:
				return isSetGenericType();
			case CorePackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY:
				return activity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.ACTIVITY_CALL_EXPRESSION__TYPE: return org.storydriven.core.CorePackage.TYPED_ELEMENT__TYPE;
				case CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE: return org.storydriven.core.CorePackage.TYPED_ELEMENT__GENERIC_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case org.storydriven.core.CorePackage.TYPED_ELEMENT__TYPE: return CorePackage.ACTIVITY_CALL_EXPRESSION__TYPE;
				case org.storydriven.core.CorePackage.TYPED_ELEMENT__GENERIC_TYPE: return CorePackage.ACTIVITY_CALL_EXPRESSION__GENERIC_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActivityCallExpressionImpl
