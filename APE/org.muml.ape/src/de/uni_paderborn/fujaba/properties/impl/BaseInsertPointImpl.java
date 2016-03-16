/**
 */
package de.uni_paderborn.fujaba.properties.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.properties.BaseInsertPoint;
import de.uni_paderborn.fujaba.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Insert Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.BaseInsertPointImpl#getBaseClass <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseInsertPointImpl extends OrderedElementImpl implements BaseInsertPoint {
	/**
	 * The cached value of the '{@link #getBaseClass() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseClass()
	 * @generated
	 * @ordered
	 */
	protected de.uni_paderborn.fujaba.properties.Class baseClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseInsertPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.BASE_INSERT_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.properties.Class getBaseClass() {
		if (baseClass != null && baseClass.eIsProxy()) {
			InternalEObject oldBaseClass = (InternalEObject)baseClass;
			baseClass = (de.uni_paderborn.fujaba.properties.Class)eResolveProxy(oldBaseClass);
			if (baseClass != oldBaseClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.BASE_INSERT_POINT__BASE_CLASS, oldBaseClass, baseClass));
			}
		}
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uni_paderborn.fujaba.properties.Class basicGetBaseClass() {
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseClass(de.uni_paderborn.fujaba.properties.Class newBaseClass) {
		de.uni_paderborn.fujaba.properties.Class oldBaseClass = baseClass;
		baseClass = newBaseClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.BASE_INSERT_POINT__BASE_CLASS, oldBaseClass, baseClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertiesPackage.BASE_INSERT_POINT__BASE_CLASS:
				if (resolve) return getBaseClass();
				return basicGetBaseClass();
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
			case PropertiesPackage.BASE_INSERT_POINT__BASE_CLASS:
				setBaseClass((de.uni_paderborn.fujaba.properties.Class)newValue);
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
			case PropertiesPackage.BASE_INSERT_POINT__BASE_CLASS:
				setBaseClass((de.uni_paderborn.fujaba.properties.Class)null);
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
			case PropertiesPackage.BASE_INSERT_POINT__BASE_CLASS:
				return baseClass != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseInsertPointImpl
