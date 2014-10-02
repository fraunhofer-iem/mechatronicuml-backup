/**
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl;

import de.uni_paderborn.fujaba.muml.componentstorypattern.impl.TriggerEmbeddedComponentExpressionImpl;

import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentStoryDecisionDiagram;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage;
import de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.EvaluateComponentSDDExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluate Component SDD Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.EvaluateComponentSDDExpressionImpl#getComponentSDD <em>Component SDD</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluateComponentSDDExpressionImpl extends TriggerEmbeddedComponentExpressionImpl implements EvaluateComponentSDDExpression {
	/**
	 * The cached value of the '{@link #getComponentSDD() <em>Component SDD</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSDD()
	 * @generated
	 * @ordered
	 */
	protected ComponentStoryDecisionDiagram componentSDD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluateComponentSDDExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsddPackage.Literals.EVALUATE_COMPONENT_SDD_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStoryDecisionDiagram getComponentSDD() {
		if (componentSDD != null && componentSDD.eIsProxy()) {
			InternalEObject oldComponentSDD = (InternalEObject)componentSDD;
			componentSDD = (ComponentStoryDecisionDiagram)eResolveProxy(oldComponentSDD);
			if (componentSDD != oldComponentSDD) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION__COMPONENT_SDD, oldComponentSDD, componentSDD));
			}
		}
		return componentSDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStoryDecisionDiagram basicGetComponentSDD() {
		return componentSDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentSDD(ComponentStoryDecisionDiagram newComponentSDD) {
		ComponentStoryDecisionDiagram oldComponentSDD = componentSDD;
		componentSDD = newComponentSDD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION__COMPONENT_SDD, oldComponentSDD, componentSDD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION__COMPONENT_SDD:
				if (resolve) return getComponentSDD();
				return basicGetComponentSDD();
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
			case ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION__COMPONENT_SDD:
				setComponentSDD((ComponentStoryDecisionDiagram)newValue);
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
			case ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION__COMPONENT_SDD:
				setComponentSDD((ComponentStoryDecisionDiagram)null);
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
			case ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION__COMPONENT_SDD:
				return componentSDD != null;
		}
		return super.eIsSet(featureID);
	}

} //EvaluateComponentSDDExpressionImpl
