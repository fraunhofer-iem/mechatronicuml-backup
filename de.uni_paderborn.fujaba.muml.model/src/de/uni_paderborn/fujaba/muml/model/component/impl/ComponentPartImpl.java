/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.impl.CommentableElementImpl;

import de.uni_paderborn.fujaba.common.adapter.DerivedAttributeAdapter;
import de.uni_paderborn.fujaba.muml.model.component.Assembly;
import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.Delegation;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.model.core.Cardinality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#getFromRev <em>From Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#getToRev <em>To Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#getDelegation <em>Delegation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#getPortsDerived <em>Ports Derived</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentPartImpl extends CommentableElementImpl implements ComponentPart {
	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected Component componentType;

	/**
	 * The cached value of the '{@link #getFromRev() <em>From Rev</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromRev()
	 * @generated
	 * @ordered
	 */
	protected EList<Assembly> fromRev;

	/**
	 * The cached value of the '{@link #getToRev() <em>To Rev</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRev()
	 * @generated
	 * @ordered
	 */
	protected EList<Assembly> toRev;

	/**
	 * The cached value of the '{@link #getDelegation() <em>Delegation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegation()
	 * @generated
	 * @ordered
	 */
	protected EList<Delegation> delegation;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality;

	/**
	 * The cached setting delegate for the '{@link #getPortsDerived() <em>Ports Derived</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsDerived()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORTS_DERIVED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.COMPONENT_PART__PORTS_DERIVED).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ComponentPartImpl() {
		super();
		
		// Install a notification adapter that informs the
		// portsDerived-reference, whenever one of the dependent features
		// was modified
		DerivedAttributeAdapter portsDerivedAdapter = new DerivedAttributeAdapter(this, ComponentPackage.Literals.COMPONENT_PART__PORTS_DERIVED);
		portsDerivedAdapter.addNavigatedDependency(ComponentPackage.Literals.COMPONENT_PART__COMPONENT_TYPE, ComponentPackage.Literals.COMPONENT__PORTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.COMPONENT_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponentType() {
		if (componentType != null && componentType.eIsProxy()) {
			InternalEObject oldComponentType = (InternalEObject)componentType;
			componentType = (Component)eResolveProxy(oldComponentType);
			if (componentType != oldComponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.COMPONENT_PART__COMPONENT_TYPE, oldComponentType, componentType));
			}
		}
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentType(Component newComponentType, NotificationChain msgs) {
		Component oldComponentType = componentType;
		componentType = newComponentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_PART__COMPONENT_TYPE, oldComponentType, newComponentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(Component newComponentType) {
		if (newComponentType != componentType) {
			NotificationChain msgs = null;
			if (componentType != null)
				msgs = ((InternalEObject)componentType).eInverseRemove(this, ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS, Component.class, msgs);
			if (newComponentType != null)
				msgs = ((InternalEObject)newComponentType).eInverseAdd(this, ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS, Component.class, msgs);
			msgs = basicSetComponentType(newComponentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_PART__COMPONENT_TYPE, newComponentType, newComponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredComponent getParentComponent() {
		if (eContainerFeatureID() != ComponentPackage.COMPONENT_PART__PARENT_COMPONENT) return null;
		return (StructuredComponent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentComponent(StructuredComponent newParentComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentComponent, ComponentPackage.COMPONENT_PART__PARENT_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentComponent(StructuredComponent newParentComponent) {
		if (newParentComponent != eInternalContainer() || (eContainerFeatureID() != ComponentPackage.COMPONENT_PART__PARENT_COMPONENT && newParentComponent != null)) {
			if (EcoreUtil.isAncestor(this, newParentComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentComponent != null)
				msgs = ((InternalEObject)newParentComponent).eInverseAdd(this, ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS, StructuredComponent.class, msgs);
			msgs = basicSetParentComponent(newParentComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_PART__PARENT_COMPONENT, newParentComponent, newParentComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assembly> getFromRev() {
		if (fromRev == null) {
			fromRev = new EObjectWithInverseResolvingEList<Assembly>(Assembly.class, this, ComponentPackage.COMPONENT_PART__FROM_REV, ComponentPackage.ASSEMBLY__FROM);
		}
		return fromRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assembly> getToRev() {
		if (toRev == null) {
			toRev = new EObjectWithInverseResolvingEList<Assembly>(Assembly.class, this, ComponentPackage.COMPONENT_PART__TO_REV, ComponentPackage.ASSEMBLY__TO);
		}
		return toRev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delegation> getDelegation() {
		if (delegation == null) {
			delegation = new EObjectWithInverseResolvingEList<Delegation>(Delegation.class, this, ComponentPackage.COMPONENT_PART__DELEGATION, ComponentPackage.DELEGATION__COMPONENT_PART);
		}
		return delegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Port> getPortsDerived() {

		/* 
		 * BEGIN: Bugfix to prevent NullPointerAccess:
		 * 
		 * Caused by: java.lang.NullPointerException
		 * at org.eclipse.emf.ecore.impl.EStructuralFeatureImpl$InternalSettingDelegateMany.dynamicGet(EStructuralFeatureImpl.java:1710)
		 * at de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl.getPortsDerived(ComponentPartImpl.java:286)
		 * 
		 * TODO: Why was this exception thrown?
		*/
		if (componentType != null) {
			return componentType.getPorts();
		} else {
			return ECollections.emptyEList();
		}
		
		// Original Code:
		// return (EList<Port>)PORTS_DERIVED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
		
		
		/*
		 * END: Bugfix
		 */
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPortsDerived() {
		return PORTS_DERIVED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_PART__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_PART__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT_PART__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_PART__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.COMPONENT_PART__COMPONENT_TYPE:
				if (componentType != null)
					msgs = ((InternalEObject)componentType).eInverseRemove(this, ComponentPackage.COMPONENT__REFERENCING_COMPONENT_PARTS, Component.class, msgs);
				return basicSetComponentType((Component)otherEnd, msgs);
			case ComponentPackage.COMPONENT_PART__PARENT_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentComponent((StructuredComponent)otherEnd, msgs);
			case ComponentPackage.COMPONENT_PART__FROM_REV:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromRev()).basicAdd(otherEnd, msgs);
			case ComponentPackage.COMPONENT_PART__TO_REV:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToRev()).basicAdd(otherEnd, msgs);
			case ComponentPackage.COMPONENT_PART__DELEGATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.COMPONENT_PART__COMPONENT_TYPE:
				return basicSetComponentType(null, msgs);
			case ComponentPackage.COMPONENT_PART__PARENT_COMPONENT:
				return basicSetParentComponent(null, msgs);
			case ComponentPackage.COMPONENT_PART__FROM_REV:
				return ((InternalEList<?>)getFromRev()).basicRemove(otherEnd, msgs);
			case ComponentPackage.COMPONENT_PART__TO_REV:
				return ((InternalEList<?>)getToRev()).basicRemove(otherEnd, msgs);
			case ComponentPackage.COMPONENT_PART__DELEGATION:
				return ((InternalEList<?>)getDelegation()).basicRemove(otherEnd, msgs);
			case ComponentPackage.COMPONENT_PART__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case ComponentPackage.COMPONENT_PART__PORTS_DERIVED:
				return ((InternalEList<?>)getPortsDerived()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ComponentPackage.COMPONENT_PART__PARENT_COMPONENT:
				return eInternalContainer().eInverseRemove(this, ComponentPackage.STRUCTURED_COMPONENT__EMBEDDED_PARTS, StructuredComponent.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.COMPONENT_PART__COMPONENT_TYPE:
				if (resolve) return getComponentType();
				return basicGetComponentType();
			case ComponentPackage.COMPONENT_PART__PARENT_COMPONENT:
				return getParentComponent();
			case ComponentPackage.COMPONENT_PART__FROM_REV:
				return getFromRev();
			case ComponentPackage.COMPONENT_PART__TO_REV:
				return getToRev();
			case ComponentPackage.COMPONENT_PART__DELEGATION:
				return getDelegation();
			case ComponentPackage.COMPONENT_PART__CARDINALITY:
				return getCardinality();
			case ComponentPackage.COMPONENT_PART__PORTS_DERIVED:
				return getPortsDerived();
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
			case ComponentPackage.COMPONENT_PART__COMPONENT_TYPE:
				setComponentType((Component)newValue);
				return;
			case ComponentPackage.COMPONENT_PART__PARENT_COMPONENT:
				setParentComponent((StructuredComponent)newValue);
				return;
			case ComponentPackage.COMPONENT_PART__FROM_REV:
				getFromRev().clear();
				getFromRev().addAll((Collection<? extends Assembly>)newValue);
				return;
			case ComponentPackage.COMPONENT_PART__TO_REV:
				getToRev().clear();
				getToRev().addAll((Collection<? extends Assembly>)newValue);
				return;
			case ComponentPackage.COMPONENT_PART__DELEGATION:
				getDelegation().clear();
				getDelegation().addAll((Collection<? extends Delegation>)newValue);
				return;
			case ComponentPackage.COMPONENT_PART__CARDINALITY:
				setCardinality((Cardinality)newValue);
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
			case ComponentPackage.COMPONENT_PART__COMPONENT_TYPE:
				setComponentType((Component)null);
				return;
			case ComponentPackage.COMPONENT_PART__PARENT_COMPONENT:
				setParentComponent((StructuredComponent)null);
				return;
			case ComponentPackage.COMPONENT_PART__FROM_REV:
				getFromRev().clear();
				return;
			case ComponentPackage.COMPONENT_PART__TO_REV:
				getToRev().clear();
				return;
			case ComponentPackage.COMPONENT_PART__DELEGATION:
				getDelegation().clear();
				return;
			case ComponentPackage.COMPONENT_PART__CARDINALITY:
				setCardinality((Cardinality)null);
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
			case ComponentPackage.COMPONENT_PART__COMPONENT_TYPE:
				return componentType != null;
			case ComponentPackage.COMPONENT_PART__PARENT_COMPONENT:
				return getParentComponent() != null;
			case ComponentPackage.COMPONENT_PART__FROM_REV:
				return fromRev != null && !fromRev.isEmpty();
			case ComponentPackage.COMPONENT_PART__TO_REV:
				return toRev != null && !toRev.isEmpty();
			case ComponentPackage.COMPONENT_PART__DELEGATION:
				return delegation != null && !delegation.isEmpty();
			case ComponentPackage.COMPONENT_PART__CARDINALITY:
				return cardinality != null;
			case ComponentPackage.COMPONENT_PART__PORTS_DERIVED:
				return isSetPortsDerived();
		}
		return super.eIsSet(featureID);
	}

} //ComponentPartImpl
