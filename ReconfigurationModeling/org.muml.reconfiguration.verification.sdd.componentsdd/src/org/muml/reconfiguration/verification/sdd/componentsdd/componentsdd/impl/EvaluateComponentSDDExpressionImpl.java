/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.pim.behavior.ParameterBinding;

import org.muml.reconfiguration.componentstorypattern.impl.TriggerEmbeddedComponentExpressionImpl;

import org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.ComponentStoryDecisionDiagram;
import org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.ComponentsddPackage;
import org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.EvaluateComponentSDDExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluate Component SDD Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.impl.EvaluateComponentSDDExpressionImpl#getComponentSDD <em>Component SDD</em>}</li>
 *   <li>{@link org.muml.reconfiguration.verification.sdd.componentsdd.componentsdd.impl.EvaluateComponentSDDExpressionImpl#getParameterBindings <em>Parameter Bindings</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getParameterBindings() <em>Parameter Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterBinding> parameterBindings;

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
	public EList<ParameterBinding> getParameterBindings() {
		if (parameterBindings == null) {
			parameterBindings = new EObjectContainmentEList<ParameterBinding>(ParameterBinding.class, this, ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION__PARAMETER_BINDINGS);
		}
		return parameterBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION__PARAMETER_BINDINGS:
				return ((InternalEList<?>)getParameterBindings()).basicRemove(otherEnd, msgs);
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
			case ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION__COMPONENT_SDD:
				if (resolve) return getComponentSDD();
				return basicGetComponentSDD();
			case ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION__PARAMETER_BINDINGS:
				return getParameterBindings();
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
			case ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION__COMPONENT_SDD:
				setComponentSDD((ComponentStoryDecisionDiagram)newValue);
				return;
			case ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION__PARAMETER_BINDINGS:
				getParameterBindings().clear();
				getParameterBindings().addAll((Collection<? extends ParameterBinding>)newValue);
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
			case ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION__PARAMETER_BINDINGS:
				getParameterBindings().clear();
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
			case ComponentsddPackage.EVALUATE_COMPONENT_SDD_EXPRESSION__PARAMETER_BINDINGS:
				return parameterBindings != null && !parameterBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvaluateComponentSDDExpressionImpl
