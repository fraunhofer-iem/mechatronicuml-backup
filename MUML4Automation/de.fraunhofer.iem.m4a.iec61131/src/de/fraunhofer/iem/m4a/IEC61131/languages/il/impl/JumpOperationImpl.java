/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.impl;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlLabel;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.Instruction;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperation;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.JumpOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jump Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.JumpOperationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.JumpOperationImpl#getJumpOperatorLabel <em>Jump Operator Label</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.JumpOperationImpl#getJumpOperator <em>Jump Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JumpOperationImpl extends MinimalEObjectImpl.Container implements JumpOperation {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected IlLabel label;

	/**
	 * The cached value of the '{@link #getJumpOperatorLabel() <em>Jump Operator Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpOperatorLabel()
	 * @generated
	 * @ordered
	 */
	protected Instruction jumpOperatorLabel;

	/**
	 * The default value of the '{@link #getJumpOperator() <em>Jump Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpOperator()
	 * @generated
	 * @ordered
	 */
	protected static final JumpOperator JUMP_OPERATOR_EDEFAULT = JumpOperator.JMP;

	/**
	 * The cached value of the '{@link #getJumpOperator() <em>Jump Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpOperator()
	 * @generated
	 * @ordered
	 */
	protected JumpOperator jumpOperator = JUMP_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JumpOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.JUMP_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlLabel getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(IlLabel newLabel, NotificationChain msgs) {
		IlLabel oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IlPackage.JUMP_OPERATION__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(IlLabel newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IlPackage.JUMP_OPERATION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IlPackage.JUMP_OPERATION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.JUMP_OPERATION__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction getJumpOperatorLabel() {
		if (jumpOperatorLabel != null && jumpOperatorLabel.eIsProxy()) {
			InternalEObject oldJumpOperatorLabel = (InternalEObject)jumpOperatorLabel;
			jumpOperatorLabel = (Instruction)eResolveProxy(oldJumpOperatorLabel);
			if (jumpOperatorLabel != oldJumpOperatorLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IlPackage.JUMP_OPERATION__JUMP_OPERATOR_LABEL, oldJumpOperatorLabel, jumpOperatorLabel));
			}
		}
		return jumpOperatorLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction basicGetJumpOperatorLabel() {
		return jumpOperatorLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJumpOperatorLabel(Instruction newJumpOperatorLabel) {
		Instruction oldJumpOperatorLabel = jumpOperatorLabel;
		jumpOperatorLabel = newJumpOperatorLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.JUMP_OPERATION__JUMP_OPERATOR_LABEL, oldJumpOperatorLabel, jumpOperatorLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpOperator getJumpOperator() {
		return jumpOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJumpOperator(JumpOperator newJumpOperator) {
		JumpOperator oldJumpOperator = jumpOperator;
		jumpOperator = newJumpOperator == null ? JUMP_OPERATOR_EDEFAULT : newJumpOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.JUMP_OPERATION__JUMP_OPERATOR, oldJumpOperator, jumpOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IlPackage.JUMP_OPERATION__LABEL:
				return basicSetLabel(null, msgs);
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
			case IlPackage.JUMP_OPERATION__LABEL:
				return getLabel();
			case IlPackage.JUMP_OPERATION__JUMP_OPERATOR_LABEL:
				if (resolve) return getJumpOperatorLabel();
				return basicGetJumpOperatorLabel();
			case IlPackage.JUMP_OPERATION__JUMP_OPERATOR:
				return getJumpOperator();
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
			case IlPackage.JUMP_OPERATION__LABEL:
				setLabel((IlLabel)newValue);
				return;
			case IlPackage.JUMP_OPERATION__JUMP_OPERATOR_LABEL:
				setJumpOperatorLabel((Instruction)newValue);
				return;
			case IlPackage.JUMP_OPERATION__JUMP_OPERATOR:
				setJumpOperator((JumpOperator)newValue);
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
			case IlPackage.JUMP_OPERATION__LABEL:
				setLabel((IlLabel)null);
				return;
			case IlPackage.JUMP_OPERATION__JUMP_OPERATOR_LABEL:
				setJumpOperatorLabel((Instruction)null);
				return;
			case IlPackage.JUMP_OPERATION__JUMP_OPERATOR:
				setJumpOperator(JUMP_OPERATOR_EDEFAULT);
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
			case IlPackage.JUMP_OPERATION__LABEL:
				return label != null;
			case IlPackage.JUMP_OPERATION__JUMP_OPERATOR_LABEL:
				return jumpOperatorLabel != null;
			case IlPackage.JUMP_OPERATION__JUMP_OPERATOR:
				return jumpOperator != JUMP_OPERATOR_EDEFAULT;
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
		result.append(" (JumpOperator: ");
		result.append(jumpOperator);
		result.append(')');
		return result.toString();
	}

} //JumpOperationImpl
