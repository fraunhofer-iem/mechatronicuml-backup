/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.BufferMsgCountExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buffer Msg Count Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.BufferMsgCountExprImpl#getBuffer <em>Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BufferMsgCountExprImpl extends MapExprImpl implements BufferMsgCountExpr {
	/**
	 * The cached value of the '{@link #getBuffer() <em>Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffer()
	 * @generated
	 * @ordered
	 */
	protected EObject buffer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferMsgCountExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparablesPackage.Literals.BUFFER_MSG_COUNT_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBuffer() {
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuffer(EObject newBuffer, NotificationChain msgs) {
		EObject oldBuffer = buffer;
		buffer = newBuffer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComparablesPackage.BUFFER_MSG_COUNT_EXPR__BUFFER, oldBuffer, newBuffer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffer(EObject newBuffer) {
		if (newBuffer != buffer) {
			NotificationChain msgs = null;
			if (buffer != null)
				msgs = ((InternalEObject)buffer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComparablesPackage.BUFFER_MSG_COUNT_EXPR__BUFFER, null, msgs);
			if (newBuffer != null)
				msgs = ((InternalEObject)newBuffer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComparablesPackage.BUFFER_MSG_COUNT_EXPR__BUFFER, null, msgs);
			msgs = basicSetBuffer(newBuffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparablesPackage.BUFFER_MSG_COUNT_EXPR__BUFFER, newBuffer, newBuffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComparablesPackage.BUFFER_MSG_COUNT_EXPR__BUFFER:
				return basicSetBuffer(null, msgs);
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
			case ComparablesPackage.BUFFER_MSG_COUNT_EXPR__BUFFER:
				return getBuffer();
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
			case ComparablesPackage.BUFFER_MSG_COUNT_EXPR__BUFFER:
				setBuffer((EObject)newValue);
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
			case ComparablesPackage.BUFFER_MSG_COUNT_EXPR__BUFFER:
				setBuffer((EObject)null);
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
			case ComparablesPackage.BUFFER_MSG_COUNT_EXPR__BUFFER:
				return buffer != null;
		}
		return super.eIsSet(featureID);
	}

} //BufferMsgCountExprImpl
