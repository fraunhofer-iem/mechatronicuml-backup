/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPort;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind;
import de.uni_paderborn.fujaba.muml.model.core.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuous Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousPortImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousPortImpl#isIsContinuousInPort <em>Is Continuous In Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousPortImpl#isIsContinuousOutPort <em>Is Continuous Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ContinuousPortImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuousPortImpl extends PortImpl implements ContinuousPort {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ContinuousPortDirectionKind KIND_EDEFAULT = ContinuousPortDirectionKind.IN;
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ContinuousPortDirectionKind kind = KIND_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #isIsContinuousInPort() <em>Is Continuous In Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContinuousInPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_CONTINUOUS_IN_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.CONTINUOUS_PORT__IS_CONTINUOUS_IN_PORT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #isIsContinuousOutPort() <em>Is Continuous Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContinuousOutPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_CONTINUOUS_OUT_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.CONTINUOUS_PORT__IS_CONTINUOUS_OUT_PORT).getSettingDelegate();
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.CONTINUOUS_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousPortDirectionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ContinuousPortDirectionKind newKind) {
		ContinuousPortDirectionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.CONTINUOUS_PORT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DataType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.CONTINUOUS_PORT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataType newType) {
		DataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.CONTINUOUS_PORT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsContinuousInPort() {
		return (Boolean)IS_CONTINUOUS_IN_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsContinuousOutPort() {
		return (Boolean)IS_CONTINUOUS_OUT_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.CONTINUOUS_PORT__KIND:
				return getKind();
			case ComponentPackage.CONTINUOUS_PORT__IS_CONTINUOUS_IN_PORT:
				return isIsContinuousInPort();
			case ComponentPackage.CONTINUOUS_PORT__IS_CONTINUOUS_OUT_PORT:
				return isIsContinuousOutPort();
			case ComponentPackage.CONTINUOUS_PORT__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case ComponentPackage.CONTINUOUS_PORT__KIND:
				setKind((ContinuousPortDirectionKind)newValue);
				return;
			case ComponentPackage.CONTINUOUS_PORT__TYPE:
				setType((DataType)newValue);
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
			case ComponentPackage.CONTINUOUS_PORT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case ComponentPackage.CONTINUOUS_PORT__TYPE:
				setType((DataType)null);
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
			case ComponentPackage.CONTINUOUS_PORT__KIND:
				return kind != KIND_EDEFAULT;
			case ComponentPackage.CONTINUOUS_PORT__IS_CONTINUOUS_IN_PORT:
				return IS_CONTINUOUS_IN_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.CONTINUOUS_PORT__IS_CONTINUOUS_OUT_PORT:
				return IS_CONTINUOUS_OUT_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.CONTINUOUS_PORT__TYPE:
				return type != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ContinuousPortImpl
