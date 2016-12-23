/**
 */
package org.muml.reconfigurationverification.timedstorychart.transform.helper.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.HelperPackage;
import org.muml.reconfigurationverification.timedstorychart.transform.helper.TSCTransformationOutput;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSC Transformation Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorychart.transform.helper.impl.TSCTransformationOutputImpl#getTgts <em>Tgts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSCTransformationOutputImpl extends EObjectImpl implements TSCTransformationOutput {
	/**
	 * The cached value of the '{@link #getTgts() <em>Tgts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgts()
	 * @generated
	 * @ordered
	 */
	protected TimedGraphTransformationSystem tgts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSCTransformationOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelperPackage.Literals.TSC_TRANSFORMATION_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedGraphTransformationSystem getTgts() {
		return tgts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgts(TimedGraphTransformationSystem newTgts, NotificationChain msgs) {
		TimedGraphTransformationSystem oldTgts = tgts;
		tgts = newTgts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HelperPackage.TSC_TRANSFORMATION_OUTPUT__TGTS, oldTgts, newTgts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTgts(TimedGraphTransformationSystem newTgts) {
		if (newTgts != tgts) {
			NotificationChain msgs = null;
			if (tgts != null)
				msgs = ((InternalEObject)tgts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HelperPackage.TSC_TRANSFORMATION_OUTPUT__TGTS, null, msgs);
			if (newTgts != null)
				msgs = ((InternalEObject)newTgts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HelperPackage.TSC_TRANSFORMATION_OUTPUT__TGTS, null, msgs);
			msgs = basicSetTgts(newTgts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HelperPackage.TSC_TRANSFORMATION_OUTPUT__TGTS, newTgts, newTgts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HelperPackage.TSC_TRANSFORMATION_OUTPUT__TGTS:
				return basicSetTgts(null, msgs);
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
			case HelperPackage.TSC_TRANSFORMATION_OUTPUT__TGTS:
				return getTgts();
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
			case HelperPackage.TSC_TRANSFORMATION_OUTPUT__TGTS:
				setTgts((TimedGraphTransformationSystem)newValue);
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
			case HelperPackage.TSC_TRANSFORMATION_OUTPUT__TGTS:
				setTgts((TimedGraphTransformationSystem)null);
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
			case HelperPackage.TSC_TRANSFORMATION_OUTPUT__TGTS:
				return tgts != null;
		}
		return super.eIsSet(featureID);
	}

} //TSCTransformationOutputImpl
