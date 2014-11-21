/**
 */
package de.uni_paderborn.fujaba.muml.psm.properties.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.psm.properties.ComponentInstanceExecutionProperties;
import de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair;
import de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage;
import de.uni_paderborn.fujaba.muml.psm.properties.WCETpair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance Execution Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.ComponentInstanceExecutionPropertiesImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.ComponentInstanceExecutionPropertiesImpl#getWcet <em>Wcet</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.ComponentInstanceExecutionPropertiesImpl#getCodeMem <em>Code Mem</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.ComponentInstanceExecutionPropertiesImpl#getRamMem <em>Ram Mem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceExecutionPropertiesImpl extends MinimalEObjectImpl.Container implements ComponentInstanceExecutionProperties {
	/**
	 * The cached value of the '{@link #getComponentInstance() <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance componentInstance;

	/**
	 * The cached value of the '{@link #getWcet() <em>Wcet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet()
	 * @generated
	 * @ordered
	 */
	protected EList<WCETpair> wcet;

	/**
	 * The cached value of the '{@link #getCodeMem() <em>Code Mem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeMem()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryPair> codeMem;

	/**
	 * The cached value of the '{@link #getRamMem() <em>Ram Mem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamMem()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryPair> ramMem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceExecutionPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.COMPONENT_INSTANCE_EXECUTION_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getComponentInstance() {
		if (componentInstance != null && componentInstance.eIsProxy()) {
			InternalEObject oldComponentInstance = (InternalEObject)componentInstance;
			componentInstance = (ComponentInstance)eResolveProxy(oldComponentInstance);
			if (componentInstance != oldComponentInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
			}
		}
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetComponentInstance() {
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstance(ComponentInstance newComponentInstance) {
		ComponentInstance oldComponentInstance = componentInstance;
		componentInstance = newComponentInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WCETpair> getWcet() {
		if (wcet == null) {
			wcet = new EObjectContainmentEList<WCETpair>(WCETpair.class, this, PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__WCET);
		}
		return wcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryPair> getCodeMem() {
		if (codeMem == null) {
			codeMem = new EObjectContainmentEList<MemoryPair>(MemoryPair.class, this, PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__CODE_MEM);
		}
		return codeMem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryPair> getRamMem() {
		if (ramMem == null) {
			ramMem = new EObjectContainmentEList<MemoryPair>(MemoryPair.class, this, PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__RAM_MEM);
		}
		return ramMem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__WCET:
				return ((InternalEList<?>)getWcet()).basicRemove(otherEnd, msgs);
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__CODE_MEM:
				return ((InternalEList<?>)getCodeMem()).basicRemove(otherEnd, msgs);
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__RAM_MEM:
				return ((InternalEList<?>)getRamMem()).basicRemove(otherEnd, msgs);
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
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__COMPONENT_INSTANCE:
				if (resolve) return getComponentInstance();
				return basicGetComponentInstance();
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__WCET:
				return getWcet();
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__CODE_MEM:
				return getCodeMem();
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__RAM_MEM:
				return getRamMem();
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
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)newValue);
				return;
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__WCET:
				getWcet().clear();
				getWcet().addAll((Collection<? extends WCETpair>)newValue);
				return;
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__CODE_MEM:
				getCodeMem().clear();
				getCodeMem().addAll((Collection<? extends MemoryPair>)newValue);
				return;
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__RAM_MEM:
				getRamMem().clear();
				getRamMem().addAll((Collection<? extends MemoryPair>)newValue);
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
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)null);
				return;
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__WCET:
				getWcet().clear();
				return;
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__CODE_MEM:
				getCodeMem().clear();
				return;
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__RAM_MEM:
				getRamMem().clear();
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
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__COMPONENT_INSTANCE:
				return componentInstance != null;
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__WCET:
				return wcet != null && !wcet.isEmpty();
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__CODE_MEM:
				return codeMem != null && !codeMem.isEmpty();
			case PropertiesPackage.COMPONENT_INSTANCE_EXECUTION_PROPERTIES__RAM_MEM:
				return ramMem != null && !ramMem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentInstanceExecutionPropertiesImpl
