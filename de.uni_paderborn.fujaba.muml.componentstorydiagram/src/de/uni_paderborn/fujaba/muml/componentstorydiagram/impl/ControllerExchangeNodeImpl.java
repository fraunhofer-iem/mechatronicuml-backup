/**
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.storydiagrams.activities.impl.ActivityNodeImpl;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ControllerExchangeNode;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RelativeDeadline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Exchange Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.impl.ControllerExchangeNodeImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.impl.ControllerExchangeNodeImpl#getComponentStoryPattern <em>Component Story Pattern</em>}</li>
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
		return ComponentstorydiagramPackage.Literals.CONTROLLER_EXCHANGE_NODE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE, oldDeadline, newDeadline);
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
				msgs = ((InternalEObject)deadline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE, null, msgs);
			if (newDeadline != null)
				msgs = ((InternalEObject)newDeadline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE, null, msgs);
			msgs = basicSetDeadline(newDeadline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE, newDeadline, newDeadline));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN, oldComponentStoryPattern, newComponentStoryPattern);
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
				msgs = ((InternalEObject)componentStoryPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN, null, msgs);
			if (newComponentStoryPattern != null)
				msgs = ((InternalEObject)newComponentStoryPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN, null, msgs);
			msgs = basicSetComponentStoryPattern(newComponentStoryPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN, newComponentStoryPattern, newComponentStoryPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE:
				return basicSetDeadline(null, msgs);
			case ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN:
				return basicSetComponentStoryPattern(null, msgs);
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
			case ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE:
				return getDeadline();
			case ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN:
				return getComponentStoryPattern();
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
			case ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE:
				setDeadline((RelativeDeadline)newValue);
				return;
			case ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN:
				setComponentStoryPattern((ComponentStoryPattern)newValue);
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
			case ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE:
				setDeadline((RelativeDeadline)null);
				return;
			case ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN:
				setComponentStoryPattern((ComponentStoryPattern)null);
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
			case ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE:
				return deadline != null;
			case ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN:
				return componentStoryPattern != null;
		}
		return super.eIsSet(featureID);
	}

} //ControllerExchangeNodeImpl
