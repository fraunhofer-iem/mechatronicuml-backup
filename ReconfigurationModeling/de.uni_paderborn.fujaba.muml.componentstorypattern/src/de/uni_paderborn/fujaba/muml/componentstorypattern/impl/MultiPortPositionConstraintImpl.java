/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraint;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraintType;
import de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Port Position Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.MultiPortPositionConstraintImpl#getPositionConstraintType <em>Position Constraint Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.MultiPortPositionConstraintImpl#getSubPortVariable <em>Sub Port Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiPortPositionConstraintImpl extends EObjectImpl implements MultiPortPositionConstraint {
	/**
	 * The default value of the '{@link #getPositionConstraintType() <em>Position Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionConstraintType()
	 * @generated
	 * @ordered
	 */
	protected static final MultiPortPositionConstraintType POSITION_CONSTRAINT_TYPE_EDEFAULT = MultiPortPositionConstraintType.FIRST;

	/**
	 * The cached value of the '{@link #getPositionConstraintType() <em>Position Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionConstraintType()
	 * @generated
	 * @ordered
	 */
	protected MultiPortPositionConstraintType positionConstraintType = POSITION_CONSTRAINT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiPortPositionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.MULTI_PORT_POSITION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPortPositionConstraintType getPositionConstraintType() {
		return positionConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionConstraintType(MultiPortPositionConstraintType newPositionConstraintType) {
		MultiPortPositionConstraintType oldPositionConstraintType = positionConstraintType;
		positionConstraintType = newPositionConstraintType == null ? POSITION_CONSTRAINT_TYPE_EDEFAULT : newPositionConstraintType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__POSITION_CONSTRAINT_TYPE, oldPositionConstraintType, positionConstraintType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinglePortVariable getSubPortVariable() {
		if (eContainerFeatureID() != ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__SUB_PORT_VARIABLE) return null;
		return (SinglePortVariable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubPortVariable(SinglePortVariable newSubPortVariable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSubPortVariable, ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__SUB_PORT_VARIABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubPortVariable(SinglePortVariable newSubPortVariable) {
		if (newSubPortVariable != eInternalContainer() || (eContainerFeatureID() != ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__SUB_PORT_VARIABLE && newSubPortVariable != null)) {
			if (EcoreUtil.isAncestor(this, newSubPortVariable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSubPortVariable != null)
				msgs = ((InternalEObject)newSubPortVariable).eInverseAdd(this, ComponentstorypatternPackage.SINGLE_PORT_VARIABLE__POSITION_CONSTRAINTS, SinglePortVariable.class, msgs);
			msgs = basicSetSubPortVariable(newSubPortVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__SUB_PORT_VARIABLE, newSubPortVariable, newSubPortVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__SUB_PORT_VARIABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSubPortVariable((SinglePortVariable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__SUB_PORT_VARIABLE:
				return basicSetSubPortVariable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__SUB_PORT_VARIABLE:
				return eInternalContainer().eInverseRemove(this, ComponentstorypatternPackage.SINGLE_PORT_VARIABLE__POSITION_CONSTRAINTS, SinglePortVariable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__POSITION_CONSTRAINT_TYPE:
				return getPositionConstraintType();
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__SUB_PORT_VARIABLE:
				return getSubPortVariable();
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
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__POSITION_CONSTRAINT_TYPE:
				setPositionConstraintType((MultiPortPositionConstraintType)newValue);
				return;
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__SUB_PORT_VARIABLE:
				setSubPortVariable((SinglePortVariable)newValue);
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
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__POSITION_CONSTRAINT_TYPE:
				setPositionConstraintType(POSITION_CONSTRAINT_TYPE_EDEFAULT);
				return;
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__SUB_PORT_VARIABLE:
				setSubPortVariable((SinglePortVariable)null);
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
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__POSITION_CONSTRAINT_TYPE:
				return positionConstraintType != POSITION_CONSTRAINT_TYPE_EDEFAULT;
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__SUB_PORT_VARIABLE:
				return getSubPortVariable() != null;
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
		result.append(" (positionConstraintType: ");
		result.append(positionConstraintType);
		result.append(')');
		return result.toString();
	}

} //MultiPortPositionConstraintImpl
