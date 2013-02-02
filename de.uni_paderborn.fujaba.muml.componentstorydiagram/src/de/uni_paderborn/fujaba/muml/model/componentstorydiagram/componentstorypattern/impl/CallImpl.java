/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.Call;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl.CallImpl#getCallee <em>Callee</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl.CallImpl#getParameterBinding <em>Parameter Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallImpl extends ExtendableElementImpl implements Call {
	/**
	 * The cached value of the '{@link #getCallee() <em>Callee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallee()
	 * @generated
	 * @ordered
	 */
	protected ComponentStoryRule callee;

	/**
	 * The cached value of the '{@link #getParameterBinding() <em>Parameter Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterBinding> parameterBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStoryRule getCallee() {
		if (callee != null && callee.eIsProxy()) {
			InternalEObject oldCallee = (InternalEObject)callee;
			callee = (ComponentStoryRule)eResolveProxy(oldCallee);
			if (callee != oldCallee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.CALL__CALLEE, oldCallee, callee));
			}
		}
		return callee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStoryRule basicGetCallee() {
		return callee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallee(ComponentStoryRule newCallee) {
		ComponentStoryRule oldCallee = callee;
		callee = newCallee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.CALL__CALLEE, oldCallee, callee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterBinding> getParameterBinding() {
		if (parameterBinding == null) {
			parameterBinding = new EObjectContainmentEList<ParameterBinding>(ParameterBinding.class, this, ComponentstorypatternPackage.CALL__PARAMETER_BINDING);
		}
		return parameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorypatternPackage.CALL__PARAMETER_BINDING:
				return ((InternalEList<?>)getParameterBinding()).basicRemove(otherEnd, msgs);
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
			case ComponentstorypatternPackage.CALL__CALLEE:
				if (resolve) return getCallee();
				return basicGetCallee();
			case ComponentstorypatternPackage.CALL__PARAMETER_BINDING:
				return getParameterBinding();
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
			case ComponentstorypatternPackage.CALL__CALLEE:
				setCallee((ComponentStoryRule)newValue);
				return;
			case ComponentstorypatternPackage.CALL__PARAMETER_BINDING:
				getParameterBinding().clear();
				getParameterBinding().addAll((Collection<? extends ParameterBinding>)newValue);
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
			case ComponentstorypatternPackage.CALL__CALLEE:
				setCallee((ComponentStoryRule)null);
				return;
			case ComponentstorypatternPackage.CALL__PARAMETER_BINDING:
				getParameterBinding().clear();
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
			case ComponentstorypatternPackage.CALL__CALLEE:
				return callee != null;
			case ComponentstorypatternPackage.CALL__PARAMETER_BINDING:
				return parameterBinding != null && !parameterBinding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallImpl
