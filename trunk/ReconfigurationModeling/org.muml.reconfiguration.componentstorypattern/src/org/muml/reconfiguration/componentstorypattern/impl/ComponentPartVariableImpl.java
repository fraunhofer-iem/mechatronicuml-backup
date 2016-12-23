/**
 */
package org.muml.reconfiguration.componentstorypattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.reconfiguration.componentstorypattern.ComponentPartVariable;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.reconfiguration.componentstorypattern.TriggerEmbeddedComponentExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Part Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.ComponentPartVariableImpl#getTriggerEmbeddedComponentExpressions <em>Trigger Embedded Component Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentPartVariableImpl extends PartVariableImpl implements ComponentPartVariable {
	/**
	 * The cached value of the '{@link #getTriggerEmbeddedComponentExpressions() <em>Trigger Embedded Component Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerEmbeddedComponentExpressions()
	 * @generated
	 * @ordered
	 */
	protected TriggerEmbeddedComponentExpression triggerEmbeddedComponentExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPartVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.COMPONENT_PART_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEmbeddedComponentExpression getTriggerEmbeddedComponentExpressions() {
		return triggerEmbeddedComponentExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggerEmbeddedComponentExpressions(TriggerEmbeddedComponentExpression newTriggerEmbeddedComponentExpressions, NotificationChain msgs) {
		TriggerEmbeddedComponentExpression oldTriggerEmbeddedComponentExpressions = triggerEmbeddedComponentExpressions;
		triggerEmbeddedComponentExpressions = newTriggerEmbeddedComponentExpressions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.COMPONENT_PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS, oldTriggerEmbeddedComponentExpressions, newTriggerEmbeddedComponentExpressions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerEmbeddedComponentExpressions(TriggerEmbeddedComponentExpression newTriggerEmbeddedComponentExpressions) {
		if (newTriggerEmbeddedComponentExpressions != triggerEmbeddedComponentExpressions) {
			NotificationChain msgs = null;
			if (triggerEmbeddedComponentExpressions != null)
				msgs = ((InternalEObject)triggerEmbeddedComponentExpressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentstorypatternPackage.COMPONENT_PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS, null, msgs);
			if (newTriggerEmbeddedComponentExpressions != null)
				msgs = ((InternalEObject)newTriggerEmbeddedComponentExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentstorypatternPackage.COMPONENT_PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS, null, msgs);
			msgs = basicSetTriggerEmbeddedComponentExpressions(newTriggerEmbeddedComponentExpressions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.COMPONENT_PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS, newTriggerEmbeddedComponentExpressions, newTriggerEmbeddedComponentExpressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorypatternPackage.COMPONENT_PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS:
				return basicSetTriggerEmbeddedComponentExpressions(null, msgs);
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
			case ComponentstorypatternPackage.COMPONENT_PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS:
				return getTriggerEmbeddedComponentExpressions();
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
			case ComponentstorypatternPackage.COMPONENT_PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS:
				setTriggerEmbeddedComponentExpressions((TriggerEmbeddedComponentExpression)newValue);
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
			case ComponentstorypatternPackage.COMPONENT_PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS:
				setTriggerEmbeddedComponentExpressions((TriggerEmbeddedComponentExpression)null);
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
			case ComponentstorypatternPackage.COMPONENT_PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS:
				return triggerEmbeddedComponentExpressions != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentPartVariableImpl
