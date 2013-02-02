/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

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
import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl#getPortConnectorInstances <em>Port Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ComponentInstanceConfigurationImpl#getParentPortInstances <em>Parent Port Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceConfigurationImpl extends NamedElementImpl implements ComponentInstanceConfiguration {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = "\"no comment provided\"";

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponentInstances() <em>Component Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> componentInstances;

	/**
	 * The cached value of the '{@link #getPortConnectorInstances() <em>Port Connector Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortConnectorInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<PortConnectorInstance> portConnectorInstances;

	/**
	 * The cached setting delegate for the '{@link #getParentPortInstances() <em>Parent Port Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PARENT_PORT_INSTANCES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.COMPONENT_INSTANCE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponentInstances() {
		if (componentInstances == null) {
			componentInstances = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this, InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES);
		}
		return componentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortConnectorInstance> getPortConnectorInstances() {
		if (portConnectorInstances == null) {
			portConnectorInstances = new EObjectContainmentEList<PortConnectorInstance>(PortConnectorInstance.class, this, InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES);
		}
		return portConnectorInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PortInstance> getParentPortInstances() {
		return (EList<PortInstance>)PARENT_PORT_INSTANCES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParentPortInstances() {
		return PARENT_PORT_INSTANCES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES:
				return ((InternalEList<?>)getComponentInstances()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES:
				return ((InternalEList<?>)getPortConnectorInstances()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES:
				return ((InternalEList<?>)getParentPortInstances()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMMENT:
				return getComment();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES:
				return getComponentInstances();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES:
				return getPortConnectorInstances();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES:
				return getParentPortInstances();
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
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMMENT:
				setComment((String)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				getComponentInstances().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES:
				getPortConnectorInstances().clear();
				getPortConnectorInstances().addAll((Collection<? extends PortConnectorInstance>)newValue);
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
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES:
				getPortConnectorInstances().clear();
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
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMPONENT_INSTANCES:
				return componentInstances != null && !componentInstances.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PORT_CONNECTOR_INSTANCES:
				return portConnectorInstances != null && !portConnectorInstances.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PARENT_PORT_INSTANCES:
				return isSetParentPortInstances();
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
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceConfigurationImpl
