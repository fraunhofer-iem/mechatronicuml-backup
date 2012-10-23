/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CorePackage;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.Extension;

import de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleConnectorImpl;
import de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly;
import de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeRoleAssemblyImpl#getAnnotations <em>Annotation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeRoleAssemblyImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeRoleAssemblyImpl#getStoredMessages <em>Stored Messages</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeRoleAssemblyImpl#getRoleInstances <em>Role Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuntimeRoleAssemblyImpl extends RoleConnectorImpl implements RuntimeRoleAssembly {
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
	 * The cached value of the '{@link #getStoredMessages() <em>Stored Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageOnAssembly> storedMessages;

	/**
	 * The cached value of the '{@link #getRoleInstances() <em>Role Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleInstance> roleInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeRoleAssemblyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.RUNTIME_ROLE_ASSEMBLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList.Resolving<EAnnotation>(EAnnotation.class, this, RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ANNOTATION);
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
			extensions = new EObjectContainmentWithInverseEList.Resolving<Extension>(Extension.class, this, RuntimePackage.RUNTIME_ROLE_ASSEMBLY__EXTENSION, CorePackage.EXTENSION__EXTENDABLE_BASE);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageOnAssembly> getStoredMessages() {
		if (storedMessages == null) {
			storedMessages = new EObjectContainmentWithInverseEList<MessageOnAssembly>(MessageOnAssembly.class, this, RuntimePackage.RUNTIME_ROLE_ASSEMBLY__STORED_MESSAGES, RuntimePackage.MESSAGE_ON_ASSEMBLY__RUNTIME_ASSEMBLY);
		}
		return storedMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleInstance> getRoleInstances() {
		if (roleInstances == null) {
			roleInstances = new EObjectWithInverseResolvingEList<RoleInstance>(RoleInstance.class, this, RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES, RuntimePackage.ROLE_INSTANCE__CONNECTOR);
		}
		return roleInstances;
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
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__EXTENSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensions()).basicAdd(otherEnd, msgs);
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__STORED_MESSAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStoredMessages()).basicAdd(otherEnd, msgs);
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoleInstances()).basicAdd(otherEnd, msgs);
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
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ANNOTATION:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__EXTENSION:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__STORED_MESSAGES:
				return ((InternalEList<?>)getStoredMessages()).basicRemove(otherEnd, msgs);
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES:
				return ((InternalEList<?>)getRoleInstances()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ANNOTATION:
				return getAnnotations();
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__EXTENSION:
				return getExtensions();
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__STORED_MESSAGES:
				return getStoredMessages();
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES:
				return getRoleInstances();
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
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ANNOTATION:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends EAnnotation>)newValue);
				return;
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__EXTENSION:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__STORED_MESSAGES:
				getStoredMessages().clear();
				getStoredMessages().addAll((Collection<? extends MessageOnAssembly>)newValue);
				return;
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES:
				getRoleInstances().clear();
				getRoleInstances().addAll((Collection<? extends RoleInstance>)newValue);
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
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ANNOTATION:
				getAnnotations().clear();
				return;
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__EXTENSION:
				getExtensions().clear();
				return;
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__STORED_MESSAGES:
				getStoredMessages().clear();
				return;
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES:
				getRoleInstances().clear();
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
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ANNOTATION:
				return annotations != null && !annotations.isEmpty();
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__EXTENSION:
				return extensions != null && !extensions.isEmpty();
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__STORED_MESSAGES:
				return storedMessages != null && !storedMessages.isEmpty();
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES:
				return roleInstances != null && !roleInstances.isEmpty();
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
				case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ANNOTATION: return CorePackage.EXTENDABLE_ELEMENT__ANNOTATION;
				case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__EXTENSION: return CorePackage.EXTENDABLE_ELEMENT__EXTENSION;
				default: return -1;
			}
		}
		if (baseClass == RuntimeAssemblyInstance.class) {
			switch (derivedFeatureID) {
				case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__STORED_MESSAGES: return RuntimePackage.RUNTIME_ASSEMBLY_INSTANCE__STORED_MESSAGES;
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
				case CorePackage.EXTENDABLE_ELEMENT__ANNOTATION: return RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ANNOTATION;
				case CorePackage.EXTENDABLE_ELEMENT__EXTENSION: return RuntimePackage.RUNTIME_ROLE_ASSEMBLY__EXTENSION;
				default: return -1;
			}
		}
		if (baseClass == RuntimeAssemblyInstance.class) {
			switch (baseFeatureID) {
				case RuntimePackage.RUNTIME_ASSEMBLY_INSTANCE__STORED_MESSAGES: return RuntimePackage.RUNTIME_ROLE_ASSEMBLY__STORED_MESSAGES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RuntimeRoleAssemblyImpl
