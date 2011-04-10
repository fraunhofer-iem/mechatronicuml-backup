/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.instance.impl;

import de.uni_paderborn.fujaba.umlrt.model.component.Port;

import de.uni_paderborn.fujaba.umlrt.model.component.impl.BehavioralConnectorImpl;

import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage;

import de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.Extension;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.SDMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ConnectorInstanceImpl#getAnnotations <em>Annotation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ConnectorInstanceImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ConnectorInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ConnectorInstanceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ConnectorInstanceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ConnectorInstanceImpl#getParentComponentInstance <em>Parent Component Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorInstanceImpl extends BehavioralConnectorImpl implements ConnectorInstance {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<EAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extensions;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected PortInstance source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected PortInstance target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.CONNECTOR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList.Resolving<EAnnotation>(EAnnotation.class, this, InstancePackage.CONNECTOR_INSTANCE__ANNOTATION);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentWithInverseEList.Resolving<Extension>(Extension.class, this, InstancePackage.CONNECTOR_INSTANCE__EXTENSION, SDMPackage.EXTENSION__EXTENDABLE_BASE);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (PortInstance)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTOR_INSTANCE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(PortInstance newSource) {
		PortInstance oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (PortInstance)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTOR_INSTANCE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(PortInstance newTarget) {
		PortInstance oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getParentComponentInstance() {
		if (eContainerFeatureID() != InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE) return null;
		return (ComponentInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentComponentInstance(ComponentInstance newParentComponentInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentComponentInstance, InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentComponentInstance(ComponentInstance newParentComponentInstance) {
		if (newParentComponentInstance != eInternalContainer() || (eContainerFeatureID() != InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE && newParentComponentInstance != null)) {
			if (EcoreUtil.isAncestor(this, newParentComponentInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentComponentInstance != null)
				msgs = ((InternalEObject)newParentComponentInstance).eInverseAdd(this, InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES, ComponentInstance.class, msgs);
			msgs = basicSetParentComponentInstance(newParentComponentInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE, newParentComponentInstance, newParentComponentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(EClass type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension provideExtension(EClass type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getAnnotation(String source) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation provideAnnotation(String source) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case InstancePackage.CONNECTOR_INSTANCE__EXTENSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensions()).basicAdd(otherEnd, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentComponentInstance((ComponentInstance)otherEnd, msgs);
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
			case InstancePackage.CONNECTOR_INSTANCE__ANNOTATION:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__EXTENSION:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE:
				return basicSetParentComponentInstance(null, msgs);
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
			case InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE:
				return eInternalContainer().eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES, ComponentInstance.class, msgs);
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
			case InstancePackage.CONNECTOR_INSTANCE__ANNOTATION:
				return getAnnotations();
			case InstancePackage.CONNECTOR_INSTANCE__EXTENSION:
				return getExtensions();
			case InstancePackage.CONNECTOR_INSTANCE__NAME:
				return getName();
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE:
				return getParentComponentInstance();
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
			case InstancePackage.CONNECTOR_INSTANCE__ANNOTATION:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends EAnnotation>)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__EXTENSION:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				setSource((PortInstance)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				setTarget((PortInstance)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE:
				setParentComponentInstance((ComponentInstance)newValue);
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
			case InstancePackage.CONNECTOR_INSTANCE__ANNOTATION:
				getAnnotations().clear();
				return;
			case InstancePackage.CONNECTOR_INSTANCE__EXTENSION:
				getExtensions().clear();
				return;
			case InstancePackage.CONNECTOR_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				setSource((PortInstance)null);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				setTarget((PortInstance)null);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE:
				setParentComponentInstance((ComponentInstance)null);
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
			case InstancePackage.CONNECTOR_INSTANCE__ANNOTATION:
				return annotations != null && !annotations.isEmpty();
			case InstancePackage.CONNECTOR_INSTANCE__EXTENSION:
				return extensions != null && !extensions.isEmpty();
			case InstancePackage.CONNECTOR_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				return source != null;
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				return target != null;
			case InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE:
				return getParentComponentInstance() != null;
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
		if (baseClass == EObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (derivedFeatureID) {
				case InstancePackage.CONNECTOR_INSTANCE__ANNOTATION: return SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;
				case InstancePackage.CONNECTOR_INSTANCE__EXTENSION: return SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case InstancePackage.CONNECTOR_INSTANCE__NAME: return SDMPackage.NAMED_ELEMENT__NAME;
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
		if (baseClass == EObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (baseFeatureID) {
				case SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION: return InstancePackage.CONNECTOR_INSTANCE__ANNOTATION;
				case SDMPackage.EXTENDABLE_ELEMENT__EXTENSION: return InstancePackage.CONNECTOR_INSTANCE__EXTENSION;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case SDMPackage.NAMED_ELEMENT__NAME: return InstancePackage.CONNECTOR_INSTANCE__NAME;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == EObject.class) {
			switch (baseOperationID) {
				case EcorePackage.EOBJECT___ECLASS: return InstancePackage.CONNECTOR_INSTANCE___ECLASS;
				case EcorePackage.EOBJECT___EIS_PROXY: return InstancePackage.CONNECTOR_INSTANCE___EIS_PROXY;
				case EcorePackage.EOBJECT___ERESOURCE: return InstancePackage.CONNECTOR_INSTANCE___ERESOURCE;
				case EcorePackage.EOBJECT___ECONTAINER: return InstancePackage.CONNECTOR_INSTANCE___ECONTAINER;
				case EcorePackage.EOBJECT___ECONTAINING_FEATURE: return InstancePackage.CONNECTOR_INSTANCE___ECONTAINING_FEATURE;
				case EcorePackage.EOBJECT___ECONTAINMENT_FEATURE: return InstancePackage.CONNECTOR_INSTANCE___ECONTAINMENT_FEATURE;
				case EcorePackage.EOBJECT___ECONTENTS: return InstancePackage.CONNECTOR_INSTANCE___ECONTENTS;
				case EcorePackage.EOBJECT___EALL_CONTENTS: return InstancePackage.CONNECTOR_INSTANCE___EALL_CONTENTS;
				case EcorePackage.EOBJECT___ECROSS_REFERENCES: return InstancePackage.CONNECTOR_INSTANCE___ECROSS_REFERENCES;
				case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE: return InstancePackage.CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN: return InstancePackage.CONNECTOR_INSTANCE___EGET__ESTRUCTURALFEATURE_BOOLEAN;
				case EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT: return InstancePackage.CONNECTOR_INSTANCE___ESET__ESTRUCTURALFEATURE_OBJECT;
				case EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE: return InstancePackage.CONNECTOR_INSTANCE___EIS_SET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE: return InstancePackage.CONNECTOR_INSTANCE___EUNSET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST: return InstancePackage.CONNECTOR_INSTANCE___EINVOKE__EOPERATION_ELIST;
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (baseOperationID) {
				case SDMPackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS: return InstancePackage.CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS;
				case SDMPackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS: return InstancePackage.CONNECTOR_INSTANCE___PROVIDE_EXTENSION__ECLASS;
				case SDMPackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING: return InstancePackage.CONNECTOR_INSTANCE___GET_ANNOTATION__STRING;
				case SDMPackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING: return InstancePackage.CONNECTOR_INSTANCE___PROVIDE_ANNOTATION__STRING;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InstancePackage.CONNECTOR_INSTANCE___GET_EXTENSION__ECLASS:
				return getExtension((EClass)arguments.get(0));
			case InstancePackage.CONNECTOR_INSTANCE___PROVIDE_EXTENSION__ECLASS:
				return provideExtension((EClass)arguments.get(0));
			case InstancePackage.CONNECTOR_INSTANCE___GET_ANNOTATION__STRING:
				return getAnnotation((String)arguments.get(0));
			case InstancePackage.CONNECTOR_INSTANCE___PROVIDE_ANNOTATION__STRING:
				return provideAnnotation((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConnectorInstanceImpl
