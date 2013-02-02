/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.storydiagrams.activities.impl.ActivityNodeImpl;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.FadingFunction;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeNode;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControllerExchangeStrategy;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RelativeDeadline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Exchange Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControllerExchangeNodeImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControllerExchangeNodeImpl#getComponentStoryPattern <em>Component Story Pattern</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControllerExchangeNodeImpl#getControllerExchangeStrategy <em>Controller Exchange Strategy</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControllerExchangeNodeImpl#getFadingFunctions <em>Fading Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerExchangeNodeImpl extends ActivityNodeImpl implements ControllerExchangeNode {
	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected RelativeDeadline deadline;

	/**
	 * The cached value of the '{@link #getComponentStoryPattern() <em>Component Story Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentStoryPattern()
	 * @generated
	 * @ordered
	 */
	protected ComponentStoryPattern componentStoryPattern;

	/**
	 * The default value of the '{@link #getControllerExchangeStrategy() <em>Controller Exchange Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerExchangeStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final ControllerExchangeStrategy CONTROLLER_EXCHANGE_STRATEGY_EDEFAULT = ControllerExchangeStrategy.ATOMIC_SWITCHING;

	/**
	 * The cached value of the '{@link #getControllerExchangeStrategy() <em>Controller Exchange Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerExchangeStrategy()
	 * @generated
	 * @ordered
	 */
	protected ControllerExchangeStrategy controllerExchangeStrategy = CONTROLLER_EXCHANGE_STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFadingFunctions() <em>Fading Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFadingFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<FadingFunction> fadingFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerExchangeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlflowPackage.Literals.CONTROLLER_EXCHANGE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeDeadline getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeadline(RelativeDeadline newDeadline, NotificationChain msgs) {
		RelativeDeadline oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlflowPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE, oldDeadline, newDeadline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(RelativeDeadline newDeadline) {
		if (newDeadline != deadline) {
			NotificationChain msgs = null;
			if (deadline != null)
				msgs = ((InternalEObject)deadline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlflowPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE, null, msgs);
			if (newDeadline != null)
				msgs = ((InternalEObject)newDeadline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlflowPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE, null, msgs);
			msgs = basicSetDeadline(newDeadline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE, newDeadline, newDeadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStoryPattern getComponentStoryPattern() {
		return componentStoryPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentStoryPattern(ComponentStoryPattern newComponentStoryPattern, NotificationChain msgs) {
		ComponentStoryPattern oldComponentStoryPattern = componentStoryPattern;
		componentStoryPattern = newComponentStoryPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlflowPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN, oldComponentStoryPattern, newComponentStoryPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentStoryPattern(ComponentStoryPattern newComponentStoryPattern) {
		if (newComponentStoryPattern != componentStoryPattern) {
			NotificationChain msgs = null;
			if (componentStoryPattern != null)
				msgs = ((InternalEObject)componentStoryPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlflowPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN, null, msgs);
			if (newComponentStoryPattern != null)
				msgs = ((InternalEObject)newComponentStoryPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlflowPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN, null, msgs);
			msgs = basicSetComponentStoryPattern(newComponentStoryPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN, newComponentStoryPattern, newComponentStoryPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerExchangeStrategy getControllerExchangeStrategy() {
		return controllerExchangeStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllerExchangeStrategy(ControllerExchangeStrategy newControllerExchangeStrategy) {
		ControllerExchangeStrategy oldControllerExchangeStrategy = controllerExchangeStrategy;
		controllerExchangeStrategy = newControllerExchangeStrategy == null ? CONTROLLER_EXCHANGE_STRATEGY_EDEFAULT : newControllerExchangeStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.CONTROLLER_EXCHANGE_NODE__CONTROLLER_EXCHANGE_STRATEGY, oldControllerExchangeStrategy, controllerExchangeStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FadingFunction> getFadingFunctions() {
		if (fadingFunctions == null) {
			fadingFunctions = new EObjectContainmentEList<FadingFunction>(FadingFunction.class, this, ControlflowPackage.CONTROLLER_EXCHANGE_NODE__FADING_FUNCTIONS);
		}
		return fadingFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE:
				return basicSetDeadline(null, msgs);
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN:
				return basicSetComponentStoryPattern(null, msgs);
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__FADING_FUNCTIONS:
				return ((InternalEList<?>)getFadingFunctions()).basicRemove(otherEnd, msgs);
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
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE:
				return getDeadline();
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN:
				return getComponentStoryPattern();
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__CONTROLLER_EXCHANGE_STRATEGY:
				return getControllerExchangeStrategy();
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__FADING_FUNCTIONS:
				return getFadingFunctions();
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
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE:
				setDeadline((RelativeDeadline)newValue);
				return;
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN:
				setComponentStoryPattern((ComponentStoryPattern)newValue);
				return;
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__CONTROLLER_EXCHANGE_STRATEGY:
				setControllerExchangeStrategy((ControllerExchangeStrategy)newValue);
				return;
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__FADING_FUNCTIONS:
				getFadingFunctions().clear();
				getFadingFunctions().addAll((Collection<? extends FadingFunction>)newValue);
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
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE:
				setDeadline((RelativeDeadline)null);
				return;
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN:
				setComponentStoryPattern((ComponentStoryPattern)null);
				return;
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__CONTROLLER_EXCHANGE_STRATEGY:
				setControllerExchangeStrategy(CONTROLLER_EXCHANGE_STRATEGY_EDEFAULT);
				return;
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__FADING_FUNCTIONS:
				getFadingFunctions().clear();
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
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE:
				return deadline != null;
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN:
				return componentStoryPattern != null;
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__CONTROLLER_EXCHANGE_STRATEGY:
				return controllerExchangeStrategy != CONTROLLER_EXCHANGE_STRATEGY_EDEFAULT;
			case ControlflowPackage.CONTROLLER_EXCHANGE_NODE__FADING_FUNCTIONS:
				return fadingFunctions != null && !fadingFunctions.isEmpty();
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
		result.append(" (controllerExchangeStrategy: ");
		result.append(controllerExchangeStrategy);
		result.append(')');
		return result.toString();
	}

} //ControllerExchangeNodeImpl
