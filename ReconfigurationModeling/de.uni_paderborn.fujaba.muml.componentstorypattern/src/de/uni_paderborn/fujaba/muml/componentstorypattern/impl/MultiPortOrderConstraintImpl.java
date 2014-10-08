/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraintType;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Port Order Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.MultiPortOrderConstraintImpl#getMultiPortVariable <em>Multi Port Variable</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.MultiPortOrderConstraintImpl#getSrcSubPortVariable <em>Src Sub Port Variable</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.MultiPortOrderConstraintImpl#getOrderConstraintType <em>Order Constraint Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiPortOrderConstraintImpl extends MultiPortConstraintImpl implements MultiPortOrderConstraint {
	/**
	 * The cached value of the '{@link #getSrcSubPortVariable() <em>Src Sub Port Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcSubPortVariable()
	 * @generated
	 * @ordered
	 */
	protected SinglePortVariable srcSubPortVariable;

	/**
	 * The default value of the '{@link #getOrderConstraintType() <em>Order Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderConstraintType()
	 * @generated
	 * @ordered
	 */
	protected static final MultiPortOrderConstraintType ORDER_CONSTRAINT_TYPE_EDEFAULT = MultiPortOrderConstraintType.NEXT;

	/**
	 * The cached value of the '{@link #getOrderConstraintType() <em>Order Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderConstraintType()
	 * @generated
	 * @ordered
	 */
	protected MultiPortOrderConstraintType orderConstraintType = ORDER_CONSTRAINT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiPortOrderConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.MULTI_PORT_ORDER_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPortVariable getMultiPortVariable() {
		if (eContainerFeatureID() != ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__MULTI_PORT_VARIABLE) return null;
		return (MultiPortVariable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPortVariable(MultiPortVariable newMultiPortVariable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMultiPortVariable, ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__MULTI_PORT_VARIABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiPortVariable(MultiPortVariable newMultiPortVariable) {
		if (newMultiPortVariable != eInternalContainer() || (eContainerFeatureID() != ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__MULTI_PORT_VARIABLE && newMultiPortVariable != null)) {
			if (EcoreUtil.isAncestor(this, newMultiPortVariable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMultiPortVariable != null)
				msgs = ((InternalEObject)newMultiPortVariable).eInverseAdd(this, ComponentstorypatternPackage.MULTI_PORT_VARIABLE__ORDER_CONSTRAINTS, MultiPortVariable.class, msgs);
			msgs = basicSetMultiPortVariable(newMultiPortVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__MULTI_PORT_VARIABLE, newMultiPortVariable, newMultiPortVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinglePortVariable getSrcSubPortVariable() {
		if (srcSubPortVariable != null && srcSubPortVariable.eIsProxy()) {
			InternalEObject oldSrcSubPortVariable = (InternalEObject)srcSubPortVariable;
			srcSubPortVariable = (SinglePortVariable)eResolveProxy(oldSrcSubPortVariable);
			if (srcSubPortVariable != oldSrcSubPortVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__SRC_SUB_PORT_VARIABLE, oldSrcSubPortVariable, srcSubPortVariable));
			}
		}
		return srcSubPortVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinglePortVariable basicGetSrcSubPortVariable() {
		return srcSubPortVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcSubPortVariable(SinglePortVariable newSrcSubPortVariable) {
		SinglePortVariable oldSrcSubPortVariable = srcSubPortVariable;
		srcSubPortVariable = newSrcSubPortVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__SRC_SUB_PORT_VARIABLE, oldSrcSubPortVariable, srcSubPortVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPortOrderConstraintType getOrderConstraintType() {
		return orderConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderConstraintType(MultiPortOrderConstraintType newOrderConstraintType) {
		MultiPortOrderConstraintType oldOrderConstraintType = orderConstraintType;
		orderConstraintType = newOrderConstraintType == null ? ORDER_CONSTRAINT_TYPE_EDEFAULT : newOrderConstraintType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__ORDER_CONSTRAINT_TYPE, oldOrderConstraintType, orderConstraintType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__MULTI_PORT_VARIABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMultiPortVariable((MultiPortVariable)otherEnd, msgs);
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
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__MULTI_PORT_VARIABLE:
				return basicSetMultiPortVariable(null, msgs);
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
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__MULTI_PORT_VARIABLE:
				return eInternalContainer().eInverseRemove(this, ComponentstorypatternPackage.MULTI_PORT_VARIABLE__ORDER_CONSTRAINTS, MultiPortVariable.class, msgs);
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
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__MULTI_PORT_VARIABLE:
				return getMultiPortVariable();
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__SRC_SUB_PORT_VARIABLE:
				if (resolve) return getSrcSubPortVariable();
				return basicGetSrcSubPortVariable();
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__ORDER_CONSTRAINT_TYPE:
				return getOrderConstraintType();
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
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__MULTI_PORT_VARIABLE:
				setMultiPortVariable((MultiPortVariable)newValue);
				return;
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__SRC_SUB_PORT_VARIABLE:
				setSrcSubPortVariable((SinglePortVariable)newValue);
				return;
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__ORDER_CONSTRAINT_TYPE:
				setOrderConstraintType((MultiPortOrderConstraintType)newValue);
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
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__MULTI_PORT_VARIABLE:
				setMultiPortVariable((MultiPortVariable)null);
				return;
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__SRC_SUB_PORT_VARIABLE:
				setSrcSubPortVariable((SinglePortVariable)null);
				return;
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__ORDER_CONSTRAINT_TYPE:
				setOrderConstraintType(ORDER_CONSTRAINT_TYPE_EDEFAULT);
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
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__MULTI_PORT_VARIABLE:
				return getMultiPortVariable() != null;
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__SRC_SUB_PORT_VARIABLE:
				return srcSubPortVariable != null;
			case ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__ORDER_CONSTRAINT_TYPE:
				return orderConstraintType != ORDER_CONSTRAINT_TYPE_EDEFAULT;
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
		result.append(" (orderConstraintType: ");
		result.append(orderConstraintType);
		result.append(')');
		return result.toString();
	}

} //MultiPortOrderConstraintImpl
