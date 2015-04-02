/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.variables.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSink;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.Direction;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.IntegerLiteral;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;
import de.fraunhofer.iem.m4a.IEC61131.core.types.NonGenericType;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.DirectVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.DirectVariableImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.DirectVariableImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.DirectVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.DirectVariableImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.DirectVariableImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectVariableImpl extends MinimalEObjectImpl.Container implements DirectVariable {
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
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.READ_ONLY;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NonGenericType type;

	/**
	 * The cached value of the '{@link #getResourceRef() <em>Resource Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRef()
	 * @generated
	 * @ordered
	 */
	protected ResourceDeclaration resourceRef;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerLiteral> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariablesPackage.Literals.DIRECT_VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.DIRECT_VARIABLE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.DIRECT_VARIABLE__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonGenericType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (NonGenericType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariablesPackage.DIRECT_VARIABLE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonGenericType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(NonGenericType newType) {
		NonGenericType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.DIRECT_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDeclaration getResourceRef() {
		if (resourceRef != null && resourceRef.eIsProxy()) {
			InternalEObject oldResourceRef = (InternalEObject)resourceRef;
			resourceRef = (ResourceDeclaration)eResolveProxy(oldResourceRef);
			if (resourceRef != oldResourceRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariablesPackage.DIRECT_VARIABLE__RESOURCE_REF, oldResourceRef, resourceRef));
			}
		}
		return resourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDeclaration basicGetResourceRef() {
		return resourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceRef(ResourceDeclaration newResourceRef) {
		ResourceDeclaration oldResourceRef = resourceRef;
		resourceRef = newResourceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.DIRECT_VARIABLE__RESOURCE_REF, oldResourceRef, resourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerLiteral> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<IntegerLiteral>(IntegerLiteral.class, this, VariablesPackage.DIRECT_VARIABLE__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariablesPackage.DIRECT_VARIABLE__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
			case VariablesPackage.DIRECT_VARIABLE__IDENTIFIER:
				return getIdentifier();
			case VariablesPackage.DIRECT_VARIABLE__DIRECTION:
				return getDirection();
			case VariablesPackage.DIRECT_VARIABLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case VariablesPackage.DIRECT_VARIABLE__RESOURCE_REF:
				if (resolve) return getResourceRef();
				return basicGetResourceRef();
			case VariablesPackage.DIRECT_VARIABLE__VALUE:
				return getValue();
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
			case VariablesPackage.DIRECT_VARIABLE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case VariablesPackage.DIRECT_VARIABLE__DIRECTION:
				setDirection((Direction)newValue);
				return;
			case VariablesPackage.DIRECT_VARIABLE__TYPE:
				setType((NonGenericType)newValue);
				return;
			case VariablesPackage.DIRECT_VARIABLE__RESOURCE_REF:
				setResourceRef((ResourceDeclaration)newValue);
				return;
			case VariablesPackage.DIRECT_VARIABLE__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends IntegerLiteral>)newValue);
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
			case VariablesPackage.DIRECT_VARIABLE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case VariablesPackage.DIRECT_VARIABLE__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case VariablesPackage.DIRECT_VARIABLE__TYPE:
				setType((NonGenericType)null);
				return;
			case VariablesPackage.DIRECT_VARIABLE__RESOURCE_REF:
				setResourceRef((ResourceDeclaration)null);
				return;
			case VariablesPackage.DIRECT_VARIABLE__VALUE:
				getValue().clear();
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
			case VariablesPackage.DIRECT_VARIABLE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case VariablesPackage.DIRECT_VARIABLE__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case VariablesPackage.DIRECT_VARIABLE__TYPE:
				return type != null;
			case VariablesPackage.DIRECT_VARIABLE__RESOURCE_REF:
				return resourceRef != null;
			case VariablesPackage.DIRECT_VARIABLE__VALUE:
				return value != null && !value.isEmpty();
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
		if (baseClass == DataSource.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataSink.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ProgDataSource.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case VariablesPackage.DIRECT_VARIABLE__IDENTIFIER: return LiteralsPackage.NAMED_ELEMENT__IDENTIFIER;
				default: return -1;
			}
		}
		if (baseClass == AccessDeclaration.class) {
			switch (derivedFeatureID) {
				case VariablesPackage.DIRECT_VARIABLE__DIRECTION: return DeclarationsPackage.ACCESS_DECLARATION__DIRECTION;
				case VariablesPackage.DIRECT_VARIABLE__TYPE: return DeclarationsPackage.ACCESS_DECLARATION__TYPE;
				case VariablesPackage.DIRECT_VARIABLE__RESOURCE_REF: return DeclarationsPackage.ACCESS_DECLARATION__RESOURCE_REF;
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
		if (baseClass == DataSource.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataSink.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ProgDataSource.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case LiteralsPackage.NAMED_ELEMENT__IDENTIFIER: return VariablesPackage.DIRECT_VARIABLE__IDENTIFIER;
				default: return -1;
			}
		}
		if (baseClass == AccessDeclaration.class) {
			switch (baseFeatureID) {
				case DeclarationsPackage.ACCESS_DECLARATION__DIRECTION: return VariablesPackage.DIRECT_VARIABLE__DIRECTION;
				case DeclarationsPackage.ACCESS_DECLARATION__TYPE: return VariablesPackage.DIRECT_VARIABLE__TYPE;
				case DeclarationsPackage.ACCESS_DECLARATION__RESOURCE_REF: return VariablesPackage.DIRECT_VARIABLE__RESOURCE_REF;
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
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //DirectVariableImpl
