/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ConnectorVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.PartVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.PortVariable;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentVariableImpl#getPortVariables <em>Port Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentVariableImpl#getPartVariables <em>Part Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentVariableImpl#getConnectorVariables <em>Connector Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.ComponentVariableImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentVariableImpl extends ComponentStoryPatternVariableImpl implements ComponentVariable {
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
	 * The cached value of the '{@link #getPartVariables() <em>Part Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<PartVariable> partVariables;

	/**
	 * The cached value of the '{@link #getConnectorVariables() <em>Connector Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorVariable> connectorVariables;

	/**
	 * The cached setting delegate for the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentstorypatternPackage.Literals.COMPONENT_VARIABLE__TYPE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.COMPONENT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortVariable> getPortVariables() {
		if (portVariables == null) {
			portVariables = new EObjectContainmentEList<PortVariable>(PortVariable.class, this, ComponentstorypatternPackage.COMPONENT_VARIABLE__PORT_VARIABLES);
		}
		return portVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartVariable> getPartVariables() {
		if (partVariables == null) {
			partVariables = new EObjectContainmentEList<PartVariable>(PartVariable.class, this, ComponentstorypatternPackage.COMPONENT_VARIABLE__PART_VARIABLES);
		}
		return partVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorVariable> getConnectorVariables() {
		if (connectorVariables == null) {
			connectorVariables = new EObjectContainmentEList<ConnectorVariable>(ConnectorVariable.class, this, ComponentstorypatternPackage.COMPONENT_VARIABLE__CONNECTOR_VARIABLES);
		}
		return connectorVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurableComponent getType() {
		return (ReconfigurableComponent)TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurableComponent basicGetType() {
		return (ReconfigurableComponent)TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ReconfigurableComponent newType) {
		TYPE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__PORT_VARIABLES:
				return ((InternalEList<?>)getPortVariables()).basicRemove(otherEnd, msgs);
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__PART_VARIABLES:
				return ((InternalEList<?>)getPartVariables()).basicRemove(otherEnd, msgs);
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__CONNECTOR_VARIABLES:
				return ((InternalEList<?>)getConnectorVariables()).basicRemove(otherEnd, msgs);
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
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__PORT_VARIABLES:
				return getPortVariables();
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__PART_VARIABLES:
				return getPartVariables();
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__CONNECTOR_VARIABLES:
				return getConnectorVariables();
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__PORT_VARIABLES:
				getPortVariables().clear();
				getPortVariables().addAll((Collection<? extends PortVariable>)newValue);
				return;
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__PART_VARIABLES:
				getPartVariables().clear();
				getPartVariables().addAll((Collection<? extends PartVariable>)newValue);
				return;
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__CONNECTOR_VARIABLES:
				getConnectorVariables().clear();
				getConnectorVariables().addAll((Collection<? extends ConnectorVariable>)newValue);
				return;
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__TYPE:
				setType((ReconfigurableComponent)newValue);
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
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__PORT_VARIABLES:
				getPortVariables().clear();
				return;
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__PART_VARIABLES:
				getPartVariables().clear();
				return;
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__CONNECTOR_VARIABLES:
				getConnectorVariables().clear();
				return;
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__TYPE:
				setType((ReconfigurableComponent)null);
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
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__PORT_VARIABLES:
				return portVariables != null && !portVariables.isEmpty();
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__PART_VARIABLES:
				return partVariables != null && !partVariables.isEmpty();
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__CONNECTOR_VARIABLES:
				return connectorVariables != null && !connectorVariables.isEmpty();
			case ComponentstorypatternPackage.COMPONENT_VARIABLE__TYPE:
				return TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ComponentVariableImpl
