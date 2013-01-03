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
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind;
import de.uni_paderborn.fujaba.muml.model.component.DirectedTypedPort;
import de.uni_paderborn.fujaba.muml.model.types.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Typed Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DirectedTypedPortImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DirectedTypedPortImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DirectedTypedPortImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DirectedTypedPortImpl#isOutPort <em>Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DirectedTypedPortImpl#isInPort <em>In Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DirectedTypedPortImpl extends PortImpl implements DirectedTypedPort {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type;

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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DIRECTED_TYPED_PORT__KIND, oldKind, kind));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DIRECTED_TYPED_PORT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DIRECTED_TYPED_PORT__TYPE, oldType, type));
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
			case ComponentPackage.DIRECTED_TYPED_PORT__KIND:
				return getKind();
			case ComponentPackage.DIRECTED_TYPED_PORT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ComponentPackage.DIRECTED_TYPED_PORT__OPTIONAL:
				return isOptional();
			case ComponentPackage.DIRECTED_TYPED_PORT__OUT_PORT:
				return isOutPort();
			case ComponentPackage.DIRECTED_TYPED_PORT__IN_PORT:
				return isInPort();
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
			case ComponentPackage.DIRECTED_TYPED_PORT__KIND:
				setKind((ContinuousPortDirectionKind)newValue);
				return;
			case ComponentPackage.DIRECTED_TYPED_PORT__TYPE:
				setType((DataType)newValue);
				return;
			case ComponentPackage.DIRECTED_TYPED_PORT__OPTIONAL:
				setOptional((Boolean)newValue);
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
			case ComponentPackage.DIRECTED_TYPED_PORT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case ComponentPackage.DIRECTED_TYPED_PORT__TYPE:
				setType((DataType)null);
				return;
			case ComponentPackage.DIRECTED_TYPED_PORT__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
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
			case ComponentPackage.DIRECTED_TYPED_PORT__KIND:
				return kind != KIND_EDEFAULT;
			case ComponentPackage.DIRECTED_TYPED_PORT__TYPE:
				return type != null;
			case ComponentPackage.DIRECTED_TYPED_PORT__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case ComponentPackage.DIRECTED_TYPED_PORT__OUT_PORT:
				return OUT_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.DIRECTED_TYPED_PORT__IN_PORT:
				return IN_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //DirectedTypedPortImpl
