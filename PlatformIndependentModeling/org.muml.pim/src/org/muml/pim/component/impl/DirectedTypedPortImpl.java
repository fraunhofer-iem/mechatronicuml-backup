/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.TypedNamedElement;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.DirectedTypedPort;
import org.muml.pim.component.PortDirectionKind;
import org.muml.pim.types.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Typed Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.component.impl.DirectedTypedPortImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DirectedTypedPortImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DirectedTypedPortImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DirectedTypedPortImpl#isOutPort <em>Out Port</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DirectedTypedPortImpl#isInPort <em>In Port</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DirectedTypedPortImpl#getInitializeExpression <em>Initialize Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DirectedTypedPortImpl extends PortImpl implements DirectedTypedPort {
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final PortDirectionKind KIND_EDEFAULT = PortDirectionKind.IN;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected PortDirectionKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #isOutPort() <em>Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OUT_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.DIRECTED_TYPED_PORT__OUT_PORT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isInPort() <em>In Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IN_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.DIRECTED_TYPED_PORT__IN_PORT).getSettingDelegate();

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
	protected DirectedTypedPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.DIRECTED_TYPED_PORT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DIRECTED_TYPED_PORT__DATA_TYPE, oldDataType, dataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DIRECTED_TYPED_PORT__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDirectionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(PortDirectionKind newKind) {
		PortDirectionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DIRECTED_TYPED_PORT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DIRECTED_TYPED_PORT__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInPort() {
		return (Boolean)IN_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION, oldInitializeExpression, newInitializeExpression);
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
				msgs = ((InternalEObject)initializeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION, null, msgs);
			if (newInitializeExpression != null)
				msgs = ((InternalEObject)newInitializeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION, null, msgs);
			msgs = basicSetInitializeExpression(newInitializeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION, newInitializeExpression, newInitializeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION:
				return basicSetInitializeExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutPort() {
		return (Boolean)OUT_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.DIRECTED_TYPED_PORT__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case ComponentPackage.DIRECTED_TYPED_PORT__KIND:
				return getKind();
			case ComponentPackage.DIRECTED_TYPED_PORT__OPTIONAL:
				return isOptional();
			case ComponentPackage.DIRECTED_TYPED_PORT__OUT_PORT:
				return isOutPort();
			case ComponentPackage.DIRECTED_TYPED_PORT__IN_PORT:
				return isInPort();
			case ComponentPackage.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION:
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
			case ComponentPackage.DIRECTED_TYPED_PORT__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case ComponentPackage.DIRECTED_TYPED_PORT__KIND:
				setKind((PortDirectionKind)newValue);
				return;
			case ComponentPackage.DIRECTED_TYPED_PORT__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case ComponentPackage.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION:
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
			case ComponentPackage.DIRECTED_TYPED_PORT__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case ComponentPackage.DIRECTED_TYPED_PORT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case ComponentPackage.DIRECTED_TYPED_PORT__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case ComponentPackage.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION:
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
			case ComponentPackage.DIRECTED_TYPED_PORT__DATA_TYPE:
				return dataType != null;
			case ComponentPackage.DIRECTED_TYPED_PORT__KIND:
				return kind != KIND_EDEFAULT;
			case ComponentPackage.DIRECTED_TYPED_PORT__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case ComponentPackage.DIRECTED_TYPED_PORT__OUT_PORT:
				return OUT_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.DIRECTED_TYPED_PORT__IN_PORT:
				return IN_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.DIRECTED_TYPED_PORT__INITIALIZE_EXPRESSION:
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
				case ComponentPackage.DIRECTED_TYPED_PORT__DATA_TYPE: return BehaviorPackage.TYPED_NAMED_ELEMENT__DATA_TYPE;
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
				case BehaviorPackage.TYPED_NAMED_ELEMENT__DATA_TYPE: return ComponentPackage.DIRECTED_TYPED_PORT__DATA_TYPE;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //DirectedTypedPortImpl
