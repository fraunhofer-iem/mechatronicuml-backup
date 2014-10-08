/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortConstraint;
import de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Port Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.MultiPortConstraintImpl#getTgtSubPortVariable <em>Tgt Sub Port Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiPortConstraintImpl extends EObjectImpl implements MultiPortConstraint {
	/**
	 * The cached value of the '{@link #getTgtSubPortVariable() <em>Tgt Sub Port Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgtSubPortVariable()
	 * @generated
	 * @ordered
	 */
	protected SinglePortVariable tgtSubPortVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiPortConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.MULTI_PORT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinglePortVariable getTgtSubPortVariable() {
		if (tgtSubPortVariable != null && tgtSubPortVariable.eIsProxy()) {
			InternalEObject oldTgtSubPortVariable = (InternalEObject)tgtSubPortVariable;
			tgtSubPortVariable = (SinglePortVariable)eResolveProxy(oldTgtSubPortVariable);
			if (tgtSubPortVariable != oldTgtSubPortVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.MULTI_PORT_CONSTRAINT__TGT_SUB_PORT_VARIABLE, oldTgtSubPortVariable, tgtSubPortVariable));
			}
		}
		return tgtSubPortVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinglePortVariable basicGetTgtSubPortVariable() {
		return tgtSubPortVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTgtSubPortVariable(SinglePortVariable newTgtSubPortVariable) {
		SinglePortVariable oldTgtSubPortVariable = tgtSubPortVariable;
		tgtSubPortVariable = newTgtSubPortVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.MULTI_PORT_CONSTRAINT__TGT_SUB_PORT_VARIABLE, oldTgtSubPortVariable, tgtSubPortVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentstorypatternPackage.MULTI_PORT_CONSTRAINT__TGT_SUB_PORT_VARIABLE:
				if (resolve) return getTgtSubPortVariable();
				return basicGetTgtSubPortVariable();
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
			case ComponentstorypatternPackage.MULTI_PORT_CONSTRAINT__TGT_SUB_PORT_VARIABLE:
				setTgtSubPortVariable((SinglePortVariable)newValue);
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
			case ComponentstorypatternPackage.MULTI_PORT_CONSTRAINT__TGT_SUB_PORT_VARIABLE:
				setTgtSubPortVariable((SinglePortVariable)null);
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
			case ComponentstorypatternPackage.MULTI_PORT_CONSTRAINT__TGT_SUB_PORT_VARIABLE:
				return tgtSubPortVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiPortConstraintImpl
