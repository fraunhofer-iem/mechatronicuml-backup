/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CorePackage;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.Extension;
import org.storydriven.core.NamedElement;
import org.storydriven.core.util.ExtendableElementOperations;

import de.uni_paderborn.fujaba.muml.verification.sdd.PatternNode;
import de.uni_paderborn.fujaba.muml.verification.sdd.PatternNodeType;
import de.uni_paderborn.fujaba.muml.verification.sdd.SDDPackage;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.sdd.impl.PatternNodeImpl#getAnnotations <em>Annotation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.sdd.impl.PatternNodeImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.sdd.impl.PatternNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.sdd.impl.PatternNodeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PatternNodeImpl extends NodeImpl implements PatternNode {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PatternNodeType TYPE_EDEFAULT = PatternNodeType.EXISTENTIAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PatternNodeType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SDDPackage.Literals.PATTERN_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList.Resolving<EAnnotation>(EAnnotation.class, this, SDDPackage.PATTERN_NODE__ANNOTATION);
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
			extensions = new EObjectContainmentWithInverseEList.Resolving<Extension>(Extension.class, this, SDDPackage.PATTERN_NODE__EXTENSION, CorePackage.EXTENSION__EXTENDABLE_BASE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SDDPackage.PATTERN_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternNodeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PatternNodeType newType) {
		PatternNodeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SDDPackage.PATTERN_NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(final EClass type) {
		return ExtendableElementOperations.getExtension(this, type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension provideExtension(final EClass type) {
		return ExtendableElementOperations.provideExtension(this, type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getAnnotation(final String source) {
		return ExtendableElementOperations.getAnnotation(this, source);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation provideAnnotation(final String source) {
		return ExtendableElementOperations.provideAnnotation(this, source);
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
			case SDDPackage.PATTERN_NODE__EXTENSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensions()).basicAdd(otherEnd, msgs);
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
			case SDDPackage.PATTERN_NODE__ANNOTATION:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case SDDPackage.PATTERN_NODE__EXTENSION:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
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
			case SDDPackage.PATTERN_NODE__ANNOTATION:
				return getAnnotations();
			case SDDPackage.PATTERN_NODE__EXTENSION:
				return getExtensions();
			case SDDPackage.PATTERN_NODE__NAME:
				return getName();
			case SDDPackage.PATTERN_NODE__TYPE:
				return getType();
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
			case SDDPackage.PATTERN_NODE__ANNOTATION:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends EAnnotation>)newValue);
				return;
			case SDDPackage.PATTERN_NODE__EXTENSION:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case SDDPackage.PATTERN_NODE__NAME:
				setName((String)newValue);
				return;
			case SDDPackage.PATTERN_NODE__TYPE:
				setType((PatternNodeType)newValue);
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
			case SDDPackage.PATTERN_NODE__ANNOTATION:
				getAnnotations().clear();
				return;
			case SDDPackage.PATTERN_NODE__EXTENSION:
				getExtensions().clear();
				return;
			case SDDPackage.PATTERN_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SDDPackage.PATTERN_NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case SDDPackage.PATTERN_NODE__ANNOTATION:
				return annotations != null && !annotations.isEmpty();
			case SDDPackage.PATTERN_NODE__EXTENSION:
				return extensions != null && !extensions.isEmpty();
			case SDDPackage.PATTERN_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SDDPackage.PATTERN_NODE__TYPE:
				return type != TYPE_EDEFAULT;
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
				case SDDPackage.PATTERN_NODE__ANNOTATION: return CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;
				case SDDPackage.PATTERN_NODE__EXTENSION: return CorePackage.EXTENDABLE_ELEMENT__EXTENSION;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case SDDPackage.PATTERN_NODE__NAME: return CorePackage.NAMED_ELEMENT__NAME;
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
				case CorePackage.EXTENDABLE_ELEMENT__ANNOTATION: return SDDPackage.PATTERN_NODE__ANNOTATION;
				case CorePackage.EXTENDABLE_ELEMENT__EXTENSION: return SDDPackage.PATTERN_NODE__EXTENSION;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAME: return SDDPackage.PATTERN_NODE__NAME;
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
				case EcorePackage.EOBJECT___ECLASS: return SDDPackage.PATTERN_NODE___ECLASS;
				case EcorePackage.EOBJECT___EIS_PROXY: return SDDPackage.PATTERN_NODE___EIS_PROXY;
				case EcorePackage.EOBJECT___ERESOURCE: return SDDPackage.PATTERN_NODE___ERESOURCE;
				case EcorePackage.EOBJECT___ECONTAINER: return SDDPackage.PATTERN_NODE___ECONTAINER;
				case EcorePackage.EOBJECT___ECONTAINING_FEATURE: return SDDPackage.PATTERN_NODE___ECONTAINING_FEATURE;
				case EcorePackage.EOBJECT___ECONTAINMENT_FEATURE: return SDDPackage.PATTERN_NODE___ECONTAINMENT_FEATURE;
				case EcorePackage.EOBJECT___ECONTENTS: return SDDPackage.PATTERN_NODE___ECONTENTS;
				case EcorePackage.EOBJECT___EALL_CONTENTS: return SDDPackage.PATTERN_NODE___EALL_CONTENTS;
				case EcorePackage.EOBJECT___ECROSS_REFERENCES: return SDDPackage.PATTERN_NODE___ECROSS_REFERENCES;
				case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE: return SDDPackage.PATTERN_NODE___EGET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN: return SDDPackage.PATTERN_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN;
				case EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT: return SDDPackage.PATTERN_NODE___ESET__ESTRUCTURALFEATURE_OBJECT;
				case EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE: return SDDPackage.PATTERN_NODE___EIS_SET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE: return SDDPackage.PATTERN_NODE___EUNSET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST: return SDDPackage.PATTERN_NODE___EINVOKE__EOPERATION_ELIST;
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (baseOperationID) {
				case CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS: return SDDPackage.PATTERN_NODE___GET_EXTENSION__ECLASS;
				case CorePackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS: return SDDPackage.PATTERN_NODE___PROVIDE_EXTENSION__ECLASS;
				case CorePackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING: return SDDPackage.PATTERN_NODE___GET_ANNOTATION__STRING;
				case CorePackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING: return SDDPackage.PATTERN_NODE___PROVIDE_ANNOTATION__STRING;
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
			case SDDPackage.PATTERN_NODE___GET_EXTENSION__ECLASS:
				return getExtension((EClass)arguments.get(0));
			case SDDPackage.PATTERN_NODE___PROVIDE_EXTENSION__ECLASS:
				return provideExtension((EClass)arguments.get(0));
			case SDDPackage.PATTERN_NODE___GET_ANNOTATION__STRING:
				return getAnnotation((String)arguments.get(0));
			case SDDPackage.PATTERN_NODE___PROVIDE_ANNOTATION__STRING:
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PatternNodeImpl
