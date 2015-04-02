/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DoubleByteStringVar;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.StringVariable;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.DoubleByteCharacterString;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.IntegerLiteral;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Byte String Spec Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DoubleByteStringSpecInitImpl#getLength <em>Length</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DoubleByteStringSpecInitImpl#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoubleByteStringSpecInitImpl extends StringVarDeclImpl implements DoubleByteStringSpecInit {
	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected IntegerLiteral length;

	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected DoubleByteCharacterString init;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleByteStringSpecInitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.DOUBLE_BYTE_STRING_SPEC_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(IntegerLiteral newLength, NotificationChain msgs) {
		IntegerLiteral oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__LENGTH, oldLength, newLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(IntegerLiteral newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleByteCharacterString getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit(DoubleByteCharacterString newInit, NotificationChain msgs) {
		DoubleByteCharacterString oldInit = init;
		init = newInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__INIT, oldInit, newInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(DoubleByteCharacterString newInit) {
		if (newInit != init) {
			NotificationChain msgs = null;
			if (init != null)
				msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__INIT, null, msgs);
			if (newInit != null)
				msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__INIT, null, msgs);
			msgs = basicSetInit(newInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__INIT, newInit, newInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__LENGTH:
				return basicSetLength(null, msgs);
			case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__INIT:
				return basicSetInit(null, msgs);
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
			case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__LENGTH:
				return getLength();
			case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__INIT:
				return getInit();
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
			case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__LENGTH:
				setLength((IntegerLiteral)newValue);
				return;
			case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__INIT:
				setInit((DoubleByteCharacterString)newValue);
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
			case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__LENGTH:
				setLength((IntegerLiteral)null);
				return;
			case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__INIT:
				setInit((DoubleByteCharacterString)null);
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
			case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__LENGTH:
				return length != null;
			case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__INIT:
				return init != null;
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
		if (baseClass == StringVariable.class) {
			switch (derivedFeatureID) {
				case DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__LENGTH: return DeclarationsPackage.STRING_VARIABLE__LENGTH;
				default: return -1;
			}
		}
		if (baseClass == DoubleByteStringVar.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GlobalVarSpecInit.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == LocatedVarSpecInit.class) {
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
		if (baseClass == StringVariable.class) {
			switch (baseFeatureID) {
				case DeclarationsPackage.STRING_VARIABLE__LENGTH: return DeclarationsPackage.DOUBLE_BYTE_STRING_SPEC_INIT__LENGTH;
				default: return -1;
			}
		}
		if (baseClass == DoubleByteStringVar.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GlobalVarSpecInit.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == LocatedVarSpecInit.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DoubleByteStringSpecInitImpl
