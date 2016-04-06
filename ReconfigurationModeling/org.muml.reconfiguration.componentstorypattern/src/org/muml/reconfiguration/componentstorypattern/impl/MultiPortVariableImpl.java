/**
 */
package org.muml.reconfiguration.componentstorypattern.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.reconfiguration.componentstorypattern.MultiPortOrderConstraint;
import org.muml.reconfiguration.componentstorypattern.MultiPortVariable;
import org.muml.reconfiguration.componentstorypattern.SinglePortVariable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Multi Port Variable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.MultiPortVariableImpl#getSubPortVariables <em>Sub Port Variables</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.MultiPortVariableImpl#getGmfSubPortVariables <em>Gmf Sub Port Variables</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.MultiPortVariableImpl#getOrderConstraints <em>Order Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiPortVariableImpl extends PortVariableImpl implements
		MultiPortVariable {
	/**
	 * The cached value of the '{@link #getSubPortVariables() <em>Sub Port Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPortVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<SinglePortVariable> subPortVariables;

	/**
	 * The cached setting delegate for the '{@link #getGmfSubPortVariables()
	 * <em>Gmf Sub Port Variables</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGmfSubPortVariables()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GMF_SUB_PORT_VARIABLES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentstorypatternPackage.Literals.MULTI_PORT_VARIABLE__GMF_SUB_PORT_VARIABLES).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getOrderConstraints() <em>Order Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiPortOrderConstraint> orderConstraints;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected MultiPortVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.MULTI_PORT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SinglePortVariable> getSubPortVariables() {
		if (subPortVariables == null) {
			subPortVariables = new EObjectWithInverseResolvingEList<SinglePortVariable>(SinglePortVariable.class, this, ComponentstorypatternPackage.MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES, ComponentstorypatternPackage.SINGLE_PORT_VARIABLE__MULTI_PORT_VARIABLE);
		}
		return subPortVariables;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<SinglePortVariable> getGmfSubPortVariables() {
		// The generated code had to be exchanged. Otherwise an
		// UnmodifiyableEList is returned, which ends up in crashing
		// de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.commands.SinglePortVariableCreateCommand.java
		return getSubPortVariables();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiPortOrderConstraint> getOrderConstraints() {
		if (orderConstraints == null) {
			orderConstraints = new EObjectContainmentWithInverseEList<MultiPortOrderConstraint>(MultiPortOrderConstraint.class, this, ComponentstorypatternPackage.MULTI_PORT_VARIABLE__ORDER_CONSTRAINTS, ComponentstorypatternPackage.MULTI_PORT_ORDER_CONSTRAINT__MULTI_PORT_VARIABLE);
		}
		return orderConstraints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubPortVariables()).basicAdd(otherEnd, msgs);
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__ORDER_CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrderConstraints()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES:
				return ((InternalEList<?>)getSubPortVariables()).basicRemove(otherEnd, msgs);
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__GMF_SUB_PORT_VARIABLES:
				return ((InternalEList<?>)getGmfSubPortVariables()).basicRemove(otherEnd, msgs);
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__ORDER_CONSTRAINTS:
				return ((InternalEList<?>)getOrderConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES:
				return getSubPortVariables();
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__GMF_SUB_PORT_VARIABLES:
				return getGmfSubPortVariables();
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__ORDER_CONSTRAINTS:
				return getOrderConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES:
				getSubPortVariables().clear();
				getSubPortVariables().addAll((Collection<? extends SinglePortVariable>)newValue);
				return;
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__GMF_SUB_PORT_VARIABLES:
				getGmfSubPortVariables().clear();
				getGmfSubPortVariables().addAll((Collection<? extends SinglePortVariable>)newValue);
				return;
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__ORDER_CONSTRAINTS:
				getOrderConstraints().clear();
				getOrderConstraints().addAll((Collection<? extends MultiPortOrderConstraint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES:
				getSubPortVariables().clear();
				return;
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__GMF_SUB_PORT_VARIABLES:
				getGmfSubPortVariables().clear();
				return;
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__ORDER_CONSTRAINTS:
				getOrderConstraints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES:
				return subPortVariables != null && !subPortVariables.isEmpty();
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__GMF_SUB_PORT_VARIABLES:
				return GMF_SUB_PORT_VARIABLES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentstorypatternPackage.MULTI_PORT_VARIABLE__ORDER_CONSTRAINTS:
				return orderConstraints != null && !orderConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // MultiPortVariableImpl
