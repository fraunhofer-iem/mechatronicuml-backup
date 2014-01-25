/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.TriggerEmbeddedComponentExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.PartVariableImpl#getPortVariables <em>Port Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.PartVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.PartVariableImpl#getTriggerEmbeddedComponentExpressions <em>Trigger Embedded Component Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartVariableImpl extends ComponentStoryPatternVariableImpl implements PartVariable {
	/**
	 * The cached value of the '{@link #getPortVariables() <em>Port Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<PortVariable> portVariables;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComponentPart type;

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
	protected PartVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.PART_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortVariable> getPortVariables() {
		if (portVariables == null) {
			portVariables = new EObjectContainmentEList<PortVariable>(PortVariable.class, this, ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES);
		}
		return portVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPart getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ComponentPart)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.PART_VARIABLE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPart basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ComponentPart newType) {
		ComponentPart oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.PART_VARIABLE__TYPE, oldType, type));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS, oldTriggerEmbeddedComponentExpressions, newTriggerEmbeddedComponentExpressions);
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
				msgs = ((InternalEObject)triggerEmbeddedComponentExpressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentstorypatternPackage.PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS, null, msgs);
			if (newTriggerEmbeddedComponentExpressions != null)
				msgs = ((InternalEObject)newTriggerEmbeddedComponentExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentstorypatternPackage.PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS, null, msgs);
			msgs = basicSetTriggerEmbeddedComponentExpressions(newTriggerEmbeddedComponentExpressions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS, newTriggerEmbeddedComponentExpressions, newTriggerEmbeddedComponentExpressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES:
				return ((InternalEList<?>)getPortVariables()).basicRemove(otherEnd, msgs);
			case ComponentstorypatternPackage.PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS:
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
			case ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES:
				return getPortVariables();
			case ComponentstorypatternPackage.PART_VARIABLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ComponentstorypatternPackage.PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS:
				return getTriggerEmbeddedComponentExpressions();
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
			case ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES:
				getPortVariables().clear();
				getPortVariables().addAll((Collection<? extends PortVariable>)newValue);
				return;
			case ComponentstorypatternPackage.PART_VARIABLE__TYPE:
				setType((ComponentPart)newValue);
				return;
			case ComponentstorypatternPackage.PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS:
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
			case ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES:
				getPortVariables().clear();
				return;
			case ComponentstorypatternPackage.PART_VARIABLE__TYPE:
				setType((ComponentPart)null);
				return;
			case ComponentstorypatternPackage.PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS:
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
			case ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES:
				return portVariables != null && !portVariables.isEmpty();
			case ComponentstorypatternPackage.PART_VARIABLE__TYPE:
				return type != null;
			case ComponentstorypatternPackage.PART_VARIABLE__TRIGGER_EMBEDDED_COMPONENT_EXPRESSIONS:
				return triggerEmbeddedComponentExpressions != null;
		}
		return super.eIsSet(featureID);
	}

} //PartVariableImpl
