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
import de.uni_paderborn.fujaba.muml.model.component.HybridPort;
import de.uni_paderborn.fujaba.muml.model.core.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl#isIsContinuousInPort <em>Is Continuous In Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl#isIsContinuousOutPort <em>Is Continuous Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl#isIsHybridInPort <em>Is Hybrid In Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl#isIsHybridOutPort <em>Is Hybrid Out Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HybridPortImpl extends DiscretePortImpl implements HybridPort {
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
	 * The cached setting delegate for the '{@link #isIsHybridInPort() <em>Is Hybrid In Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHybridInPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_HYBRID_IN_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.HYBRID_PORT__IS_HYBRID_IN_PORT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isIsHybridOutPort() <em>Is Hybrid Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHybridOutPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_HYBRID_OUT_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.HYBRID_PORT__IS_HYBRID_OUT_PORT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.HYBRID_PORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.HYBRID_PORT__KIND, oldKind, kind));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.HYBRID_PORT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.HYBRID_PORT__TYPE, oldType, type));
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
	public boolean isIsHybridInPort() {
		return (Boolean)IS_HYBRID_IN_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHybridOutPort() {
		return (Boolean)IS_HYBRID_OUT_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.HYBRID_PORT__KIND:
				return getKind();
			case ComponentPackage.HYBRID_PORT__IS_CONTINUOUS_IN_PORT:
				return isIsContinuousInPort();
			case ComponentPackage.HYBRID_PORT__IS_CONTINUOUS_OUT_PORT:
				return isIsContinuousOutPort();
			case ComponentPackage.HYBRID_PORT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ComponentPackage.HYBRID_PORT__IS_HYBRID_IN_PORT:
				return isIsHybridInPort();
			case ComponentPackage.HYBRID_PORT__IS_HYBRID_OUT_PORT:
				return isIsHybridOutPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentPackage.HYBRID_PORT__KIND:
				setKind((ContinuousPortDirectionKind)newValue);
				return;
			case ComponentPackage.HYBRID_PORT__TYPE:
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
			case ComponentPackage.HYBRID_PORT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case ComponentPackage.HYBRID_PORT__TYPE:
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
			case ComponentPackage.HYBRID_PORT__KIND:
				return kind != KIND_EDEFAULT;
			case ComponentPackage.HYBRID_PORT__IS_CONTINUOUS_IN_PORT:
				return IS_CONTINUOUS_IN_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.HYBRID_PORT__IS_CONTINUOUS_OUT_PORT:
				return IS_CONTINUOUS_OUT_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.HYBRID_PORT__TYPE:
				return type != null;
			case ComponentPackage.HYBRID_PORT__IS_HYBRID_IN_PORT:
				return IS_HYBRID_IN_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.HYBRID_PORT__IS_HYBRID_OUT_PORT:
				return IS_HYBRID_OUT_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == ContinuousPort.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.HYBRID_PORT__KIND: return ComponentPackage.CONTINUOUS_PORT__KIND;
				case ComponentPackage.HYBRID_PORT__IS_CONTINUOUS_IN_PORT: return ComponentPackage.CONTINUOUS_PORT__IS_CONTINUOUS_IN_PORT;
				case ComponentPackage.HYBRID_PORT__IS_CONTINUOUS_OUT_PORT: return ComponentPackage.CONTINUOUS_PORT__IS_CONTINUOUS_OUT_PORT;
				case ComponentPackage.HYBRID_PORT__TYPE: return ComponentPackage.CONTINUOUS_PORT__TYPE;
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
		if (baseClass == ContinuousPort.class) {
			switch (baseFeatureID) {
				case ComponentPackage.CONTINUOUS_PORT__KIND: return ComponentPackage.HYBRID_PORT__KIND;
				case ComponentPackage.CONTINUOUS_PORT__IS_CONTINUOUS_IN_PORT: return ComponentPackage.HYBRID_PORT__IS_CONTINUOUS_IN_PORT;
				case ComponentPackage.CONTINUOUS_PORT__IS_CONTINUOUS_OUT_PORT: return ComponentPackage.HYBRID_PORT__IS_CONTINUOUS_OUT_PORT;
				case ComponentPackage.CONTINUOUS_PORT__TYPE: return ComponentPackage.HYBRID_PORT__TYPE;
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
		result.append(')');
		return result.toString();
	}

} //HybridPortImpl
