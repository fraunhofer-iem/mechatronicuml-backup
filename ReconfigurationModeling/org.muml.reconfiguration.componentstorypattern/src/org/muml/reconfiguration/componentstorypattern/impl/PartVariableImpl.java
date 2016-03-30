/**
 */
package org.muml.reconfiguration.componentstorypattern.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.TypedNamedElement;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.types.DataType;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.muml.reconfiguration.componentstorypattern.PartVariable;
import org.muml.reconfiguration.componentstorypattern.PortVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.PartVariableImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.PartVariableImpl#getPortVariables <em>Port Variables</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.impl.PartVariableImpl#getComponentPartType <em>Component Part Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PartVariableImpl extends ComponentStoryPatternVariableImpl implements PartVariable {
	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

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
	 * The cached setting delegate for the '{@link #getComponentPartType() <em>Component Part Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentPartType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate COMPONENT_PART_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentstorypatternPackage.Literals.PART_VARIABLE__COMPONENT_PART_TYPE).getSettingDelegate();

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
	public DataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DataType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.PART_VARIABLE__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.PART_VARIABLE__DATA_TYPE, oldDataType, dataType));
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
	public ComponentPart getComponentPartType() {
		return (ComponentPart)COMPONENT_PART_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPart basicGetComponentPartType() {
		return (ComponentPart)COMPONENT_PART_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
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
			case ComponentstorypatternPackage.PART_VARIABLE__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES:
				return getPortVariables();
			case ComponentstorypatternPackage.PART_VARIABLE__COMPONENT_PART_TYPE:
				if (resolve) return getComponentPartType();
				return basicGetComponentPartType();
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
			case ComponentstorypatternPackage.PART_VARIABLE__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES:
				getPortVariables().clear();
				getPortVariables().addAll((Collection<? extends PortVariable>)newValue);
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
			case ComponentstorypatternPackage.PART_VARIABLE__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES:
				getPortVariables().clear();
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
			case ComponentstorypatternPackage.PART_VARIABLE__DATA_TYPE:
				return dataType != null;
			case ComponentstorypatternPackage.PART_VARIABLE__PORT_VARIABLES:
				return portVariables != null && !portVariables.isEmpty();
			case ComponentstorypatternPackage.PART_VARIABLE__COMPONENT_PART_TYPE:
				return COMPONENT_PART_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypedNamedElement.class) {
			switch (derivedFeatureID) {
				case ComponentstorypatternPackage.PART_VARIABLE__DATA_TYPE: return BehaviorPackage.TYPED_NAMED_ELEMENT__DATA_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypedNamedElement.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.TYPED_NAMED_ELEMENT__DATA_TYPE: return ComponentstorypatternPackage.PART_VARIABLE__DATA_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PartVariableImpl
