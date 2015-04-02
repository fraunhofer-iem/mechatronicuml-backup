/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationOnly;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.AbstractFunctionBlockDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureInit;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FB Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.FBInstanceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.FBInstanceImpl#getInit <em>Init</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.FBInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.FBInstanceImpl#getFunctionBlockType <em>Function Block Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FBInstanceImpl extends MinimalEObjectImpl.Container implements FBInstance {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected StructureInit init;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AbstractFunctionBlockDeclaration type;

	/**
	 * The cached value of the '{@link #getFunctionBlockType() <em>Function Block Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionBlockType()
	 * @generated
	 * @ordered
	 */
	protected AbstractFunctionBlockDeclaration functionBlockType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FBInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.FB_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.FB_INSTANCE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureInit getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit(StructureInit newInit, NotificationChain msgs) {
		StructureInit oldInit = init;
		init = newInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.FB_INSTANCE__INIT, oldInit, newInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(StructureInit newInit) {
		if (newInit != init) {
			NotificationChain msgs = null;
			if (init != null)
				msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.FB_INSTANCE__INIT, null, msgs);
			if (newInit != null)
				msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.FB_INSTANCE__INIT, null, msgs);
			msgs = basicSetInit(newInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.FB_INSTANCE__INIT, newInit, newInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunctionBlockDeclaration getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (AbstractFunctionBlockDeclaration)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationsPackage.FB_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunctionBlockDeclaration basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AbstractFunctionBlockDeclaration newType) {
		AbstractFunctionBlockDeclaration oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.FB_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunctionBlockDeclaration getFunctionBlockType() {
		if (functionBlockType != null && functionBlockType.eIsProxy()) {
			InternalEObject oldFunctionBlockType = (InternalEObject)functionBlockType;
			functionBlockType = (AbstractFunctionBlockDeclaration)eResolveProxy(oldFunctionBlockType);
			if (functionBlockType != oldFunctionBlockType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationsPackage.FB_INSTANCE__FUNCTION_BLOCK_TYPE, oldFunctionBlockType, functionBlockType));
			}
		}
		return functionBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunctionBlockDeclaration basicGetFunctionBlockType() {
		return functionBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionBlockType(AbstractFunctionBlockDeclaration newFunctionBlockType) {
		AbstractFunctionBlockDeclaration oldFunctionBlockType = functionBlockType;
		functionBlockType = newFunctionBlockType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.FB_INSTANCE__FUNCTION_BLOCK_TYPE, oldFunctionBlockType, functionBlockType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.FB_INSTANCE__INIT:
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
			case DeclarationsPackage.FB_INSTANCE__IDENTIFIER:
				return getIdentifier();
			case DeclarationsPackage.FB_INSTANCE__INIT:
				return getInit();
			case DeclarationsPackage.FB_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DeclarationsPackage.FB_INSTANCE__FUNCTION_BLOCK_TYPE:
				if (resolve) return getFunctionBlockType();
				return basicGetFunctionBlockType();
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
			case DeclarationsPackage.FB_INSTANCE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case DeclarationsPackage.FB_INSTANCE__INIT:
				setInit((StructureInit)newValue);
				return;
			case DeclarationsPackage.FB_INSTANCE__TYPE:
				setType((AbstractFunctionBlockDeclaration)newValue);
				return;
			case DeclarationsPackage.FB_INSTANCE__FUNCTION_BLOCK_TYPE:
				setFunctionBlockType((AbstractFunctionBlockDeclaration)newValue);
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
			case DeclarationsPackage.FB_INSTANCE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case DeclarationsPackage.FB_INSTANCE__INIT:
				setInit((StructureInit)null);
				return;
			case DeclarationsPackage.FB_INSTANCE__TYPE:
				setType((AbstractFunctionBlockDeclaration)null);
				return;
			case DeclarationsPackage.FB_INSTANCE__FUNCTION_BLOCK_TYPE:
				setFunctionBlockType((AbstractFunctionBlockDeclaration)null);
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
			case DeclarationsPackage.FB_INSTANCE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case DeclarationsPackage.FB_INSTANCE__INIT:
				return init != null;
			case DeclarationsPackage.FB_INSTANCE__TYPE:
				return type != null;
			case DeclarationsPackage.FB_INSTANCE__FUNCTION_BLOCK_TYPE:
				return functionBlockType != null;
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
		if (baseClass == VarDeclarationOnly.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case DeclarationsPackage.FB_INSTANCE__IDENTIFIER: return LiteralsPackage.NAMED_ELEMENT__IDENTIFIER;
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
		if (baseClass == VarDeclarationOnly.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case LiteralsPackage.NAMED_ELEMENT__IDENTIFIER: return DeclarationsPackage.FB_INSTANCE__IDENTIFIER;
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //FBInstanceImpl
