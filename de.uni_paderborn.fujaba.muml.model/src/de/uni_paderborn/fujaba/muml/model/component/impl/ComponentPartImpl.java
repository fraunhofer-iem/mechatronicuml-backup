/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.common.adapter.DerivedAttributeAdapter;
import de.uni_paderborn.fujaba.muml.model.component.AssemblyConnector;
import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.DelegationConnector;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.model.types.DataType;
import de.uni_paderborn.fujaba.muml.model.valuetype.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#getAssemblyConnectors <em>Assembly Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#getDelegationConnectors <em>Delegation Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl#isMultiPart <em>Multi Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentPartImpl extends NamedElementImpl implements ComponentPart {
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
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected Component componentType;

	/**
	 * The cached setting delegate for the '{@link #getAssemblyConnectors() <em>Assembly Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyConnectors()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSEMBLY_CONNECTORS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.COMPONENT_PART__ASSEMBLY_CONNECTORS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getDelegationConnectors() <em>Delegation Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationConnectors()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DELEGATION_CONNECTORS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.COMPONENT_PART__DELEGATION_CONNECTORS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Range cardinality;

	/**
	 * The cached setting delegate for the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.COMPONENT_PART__PORTS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isMultiPart() <em>Multi Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiPart()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MULTI_PART__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.COMPONENT_PART__MULTI_PART).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ComponentPartImpl() {
		super();
		
		// Install a notification adapter that informs the
		// ports-reference, whenever one of the dependent features
		// was modified
		DerivedAttributeAdapter portsDerivedAdapter = new DerivedAttributeAdapter(this, ComponentPackage.Literals.COMPONENT_PART__PORTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT_PART__COMMENT, oldComment, comment));
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
	@SuppressWarnings("unchecked")
	public EList<AssemblyConnector> getAssemblyConnectors() {
		return (EList<AssemblyConnector>)ASSEMBLY_CONNECTORS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DelegationConnector> getDelegationConnectors() {
		return (EList<DelegationConnector>)DELEGATION_CONNECTORS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	public EList<Port> getPortsDerived() {
//
//		/* 
//		 * BEGIN: Bugfix to prevent NullPointerAccess:
//		 * 
//		 * Caused by: java.lang.NullPointerException
//		 * at org.eclipse.emf.ecore.impl.EStructuralFeatureImpl$InternalSettingDelegateMany.dynamicGet(EStructuralFeatureImpl.java:1710)
//		 * at de.uni_paderborn.fujaba.muml.model.component.impl.ComponentPartImpl.getPortsDerived(ComponentPartImpl.java:286)
//		 * 
//		 * TODO: Why was this exception thrown?
//		*/
//		if (componentType != null) {
//			return componentType.getPorts();
//		} else {
//			return ECollections.emptyEList();
//		}
//		
//		// Original Code:
//		// return (EList<Port>)PORTS_DERIVED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
//		
//		
//		/*
//		 * END: Bugfix
//		 */
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiPart() {
		return (Boolean)MULTI_PART__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultiPart() {
		return MULTI_PART__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Range newCardinality, NotificationChain msgs) {
		Range oldCardinality = cardinality;
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
	public void setCardinality(Range newCardinality) {
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
	public EList<Port> getPorts() {
		return (EList<Port>)PORTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPorts() {
		return PORTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case ComponentPackage.COMPONENT_PART__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case ComponentPackage.COMPONENT_PART__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
			case ComponentPackage.COMPONENT_PART__COMMENT:
				return getComment();
			case ComponentPackage.COMPONENT_PART__COMPONENT_TYPE:
				if (resolve) return getComponentType();
				return basicGetComponentType();
			case ComponentPackage.COMPONENT_PART__PARENT_COMPONENT:
				return getParentComponent();
			case ComponentPackage.COMPONENT_PART__ASSEMBLY_CONNECTORS:
				return getAssemblyConnectors();
			case ComponentPackage.COMPONENT_PART__DELEGATION_CONNECTORS:
				return getDelegationConnectors();
			case ComponentPackage.COMPONENT_PART__CARDINALITY:
				return getCardinality();
			case ComponentPackage.COMPONENT_PART__PORTS:
				return getPorts();
			case ComponentPackage.COMPONENT_PART__MULTI_PART:
				return isMultiPart();
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
			case ComponentPackage.COMPONENT_PART__COMMENT:
				setComment((String)newValue);
				return;
			case ComponentPackage.COMPONENT_PART__COMPONENT_TYPE:
				setComponentType((Component)newValue);
				return;
			case ComponentPackage.COMPONENT_PART__PARENT_COMPONENT:
				setParentComponent((StructuredComponent)newValue);
				return;
			case ComponentPackage.COMPONENT_PART__CARDINALITY:
				setCardinality((Range)newValue);
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
			case ComponentPackage.COMPONENT_PART__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT_PART__COMPONENT_TYPE:
				setComponentType((Component)null);
				return;
			case ComponentPackage.COMPONENT_PART__PARENT_COMPONENT:
				setParentComponent((StructuredComponent)null);
				return;
			case ComponentPackage.COMPONENT_PART__CARDINALITY:
				setCardinality((Range)null);
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
			case ComponentPackage.COMPONENT_PART__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ComponentPackage.COMPONENT_PART__COMPONENT_TYPE:
				return componentType != null;
			case ComponentPackage.COMPONENT_PART__PARENT_COMPONENT:
				return getParentComponent() != null;
			case ComponentPackage.COMPONENT_PART__ASSEMBLY_CONNECTORS:
				return ASSEMBLY_CONNECTORS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.COMPONENT_PART__DELEGATION_CONNECTORS:
				return DELEGATION_CONNECTORS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.COMPONENT_PART__CARDINALITY:
				return cardinality != null;
			case ComponentPackage.COMPONENT_PART__PORTS:
				return isSetPorts();
			case ComponentPackage.COMPONENT_PART__MULTI_PART:
				return isSetMultiPart();
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
				case ComponentPackage.COMPONENT_PART__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return ComponentPackage.COMPONENT_PART__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
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

} //ComponentPartImpl
