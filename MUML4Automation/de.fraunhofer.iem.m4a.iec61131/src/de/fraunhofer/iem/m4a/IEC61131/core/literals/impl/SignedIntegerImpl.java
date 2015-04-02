/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.literals.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.Constant;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.IntegerLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.Literal;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.NumericLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.SignedInteger;
import de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayInitElement;
import de.fraunhofer.iem.m4a.IEC61131.core.types.IntegerType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementValue;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpressionValue;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signed Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.SignedIntegerImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.SignedIntegerImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignedIntegerImpl extends MinimalEObjectImpl.Container implements SignedInteger {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected IntegerType typeName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignedIntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LiteralsPackage.Literals.SIGNED_INTEGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LiteralsPackage.SIGNED_INTEGER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType getTypeName() {
		if (typeName != null && typeName.eIsProxy()) {
			InternalEObject oldTypeName = (InternalEObject)typeName;
			typeName = (IntegerType)eResolveProxy(oldTypeName);
			if (typeName != oldTypeName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LiteralsPackage.SIGNED_INTEGER__TYPE_NAME, oldTypeName, typeName));
			}
		}
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType basicGetTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(IntegerType newTypeName) {
		IntegerType oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LiteralsPackage.SIGNED_INTEGER__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LiteralsPackage.SIGNED_INTEGER__VALUE:
				return getValue();
			case LiteralsPackage.SIGNED_INTEGER__TYPE_NAME:
				if (resolve) return getTypeName();
				return basicGetTypeName();
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
			case LiteralsPackage.SIGNED_INTEGER__VALUE:
				setValue((String)newValue);
				return;
			case LiteralsPackage.SIGNED_INTEGER__TYPE_NAME:
				setTypeName((IntegerType)newValue);
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
			case LiteralsPackage.SIGNED_INTEGER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case LiteralsPackage.SIGNED_INTEGER__TYPE_NAME:
				setTypeName((IntegerType)null);
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
			case LiteralsPackage.SIGNED_INTEGER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case LiteralsPackage.SIGNED_INTEGER__TYPE_NAME:
				return typeName != null;
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
		if (baseClass == Literal.class) {
			switch (derivedFeatureID) {
				case LiteralsPackage.SIGNED_INTEGER__VALUE: return LiteralsPackage.LITERAL__VALUE;
				default: return -1;
			}
		}
		if (baseClass == ArrayInitElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == StructureElementValue.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ProgDataSource.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PrimaryExpressionValue.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Constant.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NumericLiteral.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IntegerLiteral.class) {
			switch (derivedFeatureID) {
				case LiteralsPackage.SIGNED_INTEGER__TYPE_NAME: return LiteralsPackage.INTEGER_LITERAL__TYPE_NAME;
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
		if (baseClass == Literal.class) {
			switch (baseFeatureID) {
				case LiteralsPackage.LITERAL__VALUE: return LiteralsPackage.SIGNED_INTEGER__VALUE;
				default: return -1;
			}
		}
		if (baseClass == ArrayInitElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == StructureElementValue.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataSource.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ProgDataSource.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PrimaryExpressionValue.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Constant.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NumericLiteral.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IntegerLiteral.class) {
			switch (baseFeatureID) {
				case LiteralsPackage.INTEGER_LITERAL__TYPE_NAME: return LiteralsPackage.SIGNED_INTEGER__TYPE_NAME;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SignedIntegerImpl
