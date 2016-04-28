/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.TypedNamedElement;
import org.muml.pim.behavior.Variable;
import org.muml.pim.types.DataType;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.TimeParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.TimeParameterImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.TimeParameterImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.TimeParameterImpl#getInitializeExpression <em>Initialize Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeParameterImpl extends RealtimeStatechartParameterImpl implements TimeParameter {
	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

	/**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean constant = CONSTANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitializeExpression() <em>Initialize Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializeExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression initializeExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartparameterPackage.Literals.TIME_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DataType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartparameterPackage.TIME_PARAMETER__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartparameterPackage.TIME_PARAMETER__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(boolean newConstant) {
		boolean oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartparameterPackage.TIME_PARAMETER__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitializeExpression() {
		return initializeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializeExpression(Expression newInitializeExpression, NotificationChain msgs) {
		Expression oldInitializeExpression = initializeExpression;
		initializeExpression = newInitializeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartparameterPackage.TIME_PARAMETER__INITIALIZE_EXPRESSION, oldInitializeExpression, newInitializeExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializeExpression(Expression newInitializeExpression) {
		if (newInitializeExpression != initializeExpression) {
			NotificationChain msgs = null;
			if (initializeExpression != null)
				msgs = ((InternalEObject)initializeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartparameterPackage.TIME_PARAMETER__INITIALIZE_EXPRESSION, null, msgs);
			if (newInitializeExpression != null)
				msgs = ((InternalEObject)newInitializeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartparameterPackage.TIME_PARAMETER__INITIALIZE_EXPRESSION, null, msgs);
			msgs = basicSetInitializeExpression(newInitializeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartparameterPackage.TIME_PARAMETER__INITIALIZE_EXPRESSION, newInitializeExpression, newInitializeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartparameterPackage.TIME_PARAMETER__INITIALIZE_EXPRESSION:
				return basicSetInitializeExpression(null, msgs);
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
			case RealtimestatechartparameterPackage.TIME_PARAMETER__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case RealtimestatechartparameterPackage.TIME_PARAMETER__CONSTANT:
				return isConstant();
			case RealtimestatechartparameterPackage.TIME_PARAMETER__INITIALIZE_EXPRESSION:
				return getInitializeExpression();
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
			case RealtimestatechartparameterPackage.TIME_PARAMETER__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case RealtimestatechartparameterPackage.TIME_PARAMETER__CONSTANT:
				setConstant((Boolean)newValue);
				return;
			case RealtimestatechartparameterPackage.TIME_PARAMETER__INITIALIZE_EXPRESSION:
				setInitializeExpression((Expression)newValue);
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
			case RealtimestatechartparameterPackage.TIME_PARAMETER__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case RealtimestatechartparameterPackage.TIME_PARAMETER__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
			case RealtimestatechartparameterPackage.TIME_PARAMETER__INITIALIZE_EXPRESSION:
				setInitializeExpression((Expression)null);
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
			case RealtimestatechartparameterPackage.TIME_PARAMETER__DATA_TYPE:
				return dataType != null;
			case RealtimestatechartparameterPackage.TIME_PARAMETER__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
			case RealtimestatechartparameterPackage.TIME_PARAMETER__INITIALIZE_EXPRESSION:
				return initializeExpression != null;
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
		if (baseClass == TypedNamedElement.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartparameterPackage.TIME_PARAMETER__DATA_TYPE: return BehaviorPackage.TYPED_NAMED_ELEMENT__DATA_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartparameterPackage.TIME_PARAMETER__CONSTANT: return BehaviorPackage.VARIABLE__CONSTANT;
				case RealtimestatechartparameterPackage.TIME_PARAMETER__INITIALIZE_EXPRESSION: return BehaviorPackage.VARIABLE__INITIALIZE_EXPRESSION;
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
		if (baseClass == TypedNamedElement.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.TYPED_NAMED_ELEMENT__DATA_TYPE: return RealtimestatechartparameterPackage.TIME_PARAMETER__DATA_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.VARIABLE__CONSTANT: return RealtimestatechartparameterPackage.TIME_PARAMETER__CONSTANT;
				case BehaviorPackage.VARIABLE__INITIALIZE_EXPRESSION: return RealtimestatechartparameterPackage.TIME_PARAMETER__INITIALIZE_EXPRESSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (constant: ");
		result.append(constant);
		result.append(')');
		return result.toString();
	}

} //TimeParameterImpl
