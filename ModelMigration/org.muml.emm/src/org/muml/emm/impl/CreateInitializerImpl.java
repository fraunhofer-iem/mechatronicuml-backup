/**
 */
package org.muml.emm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.emm.CreateClass;
import org.muml.emm.CreateInitializer;
import org.muml.emm.FeatureInitializer;
import org.muml.emm.Mapping;
import org.muml.emm.MigrationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.emm.impl.CreateInitializerImpl#getEmbeddingCreateClass <em>Embedding Create Class</em>}</li>
 *   <li>{@link org.muml.emm.impl.CreateInitializerImpl#getTargetFeature <em>Target Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateInitializerImpl extends CreateClassImpl implements CreateInitializer {
	/**
	 * The cached value of the '{@link #getTargetFeature() <em>Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature targetFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateInitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigrationPackage.Literals.CREATE_INITIALIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateClass getEmbeddingCreateClass() {
		if (eContainerFeatureID() != MigrationPackage.CREATE_INITIALIZER__EMBEDDING_CREATE_CLASS) return null;
		return (CreateClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddingCreateClass(CreateClass newEmbeddingCreateClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmbeddingCreateClass, MigrationPackage.CREATE_INITIALIZER__EMBEDDING_CREATE_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddingCreateClass(CreateClass newEmbeddingCreateClass) {
		if (newEmbeddingCreateClass != eInternalContainer() || (eContainerFeatureID() != MigrationPackage.CREATE_INITIALIZER__EMBEDDING_CREATE_CLASS && newEmbeddingCreateClass != null)) {
			if (EcoreUtil.isAncestor(this, newEmbeddingCreateClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmbeddingCreateClass != null)
				msgs = ((InternalEObject)newEmbeddingCreateClass).eInverseAdd(this, MigrationPackage.CREATE_CLASS__FEATURE_INITIALIZERS, CreateClass.class, msgs);
			msgs = basicSetEmbeddingCreateClass(newEmbeddingCreateClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.CREATE_INITIALIZER__EMBEDDING_CREATE_CLASS, newEmbeddingCreateClass, newEmbeddingCreateClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getTargetFeature() {
		if (targetFeature != null && targetFeature.eIsProxy()) {
			InternalEObject oldTargetFeature = (InternalEObject)targetFeature;
			targetFeature = (EStructuralFeature)eResolveProxy(oldTargetFeature);
			if (targetFeature != oldTargetFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.CREATE_INITIALIZER__TARGET_FEATURE, oldTargetFeature, targetFeature));
			}
		}
		return targetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetTargetFeature() {
		return targetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFeature(EStructuralFeature newTargetFeature) {
		EStructuralFeature oldTargetFeature = targetFeature;
		targetFeature = newTargetFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.CREATE_INITIALIZER__TARGET_FEATURE, oldTargetFeature, targetFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceClass() {
		Mapping mapping = getMapping();
		if (mapping != null) {
			return mapping.getSourceClass();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getMapping() {
		// Derive embedding Mapping
		EObject element = this;
		while (element.eContainer() != null && !(element instanceof Mapping)) {
			element = element.eContainer();
		}
		if (element instanceof Mapping) {
			return (Mapping) element;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MigrationPackage.CREATE_INITIALIZER__EMBEDDING_CREATE_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmbeddingCreateClass((CreateClass)otherEnd, msgs);
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
			case MigrationPackage.CREATE_INITIALIZER__EMBEDDING_CREATE_CLASS:
				return basicSetEmbeddingCreateClass(null, msgs);
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
			case MigrationPackage.CREATE_INITIALIZER__EMBEDDING_CREATE_CLASS:
				return eInternalContainer().eInverseRemove(this, MigrationPackage.CREATE_CLASS__FEATURE_INITIALIZERS, CreateClass.class, msgs);
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
			case MigrationPackage.CREATE_INITIALIZER__EMBEDDING_CREATE_CLASS:
				return getEmbeddingCreateClass();
			case MigrationPackage.CREATE_INITIALIZER__TARGET_FEATURE:
				if (resolve) return getTargetFeature();
				return basicGetTargetFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MigrationPackage.CREATE_INITIALIZER__EMBEDDING_CREATE_CLASS:
				setEmbeddingCreateClass((CreateClass)newValue);
				return;
			case MigrationPackage.CREATE_INITIALIZER__TARGET_FEATURE:
				setTargetFeature((EStructuralFeature)newValue);
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
			case MigrationPackage.CREATE_INITIALIZER__EMBEDDING_CREATE_CLASS:
				setEmbeddingCreateClass((CreateClass)null);
				return;
			case MigrationPackage.CREATE_INITIALIZER__TARGET_FEATURE:
				setTargetFeature((EStructuralFeature)null);
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
			case MigrationPackage.CREATE_INITIALIZER__EMBEDDING_CREATE_CLASS:
				return getEmbeddingCreateClass() != null;
			case MigrationPackage.CREATE_INITIALIZER__TARGET_FEATURE:
				return targetFeature != null;
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
		if (baseClass == FeatureInitializer.class) {
			switch (derivedFeatureID) {
				case MigrationPackage.CREATE_INITIALIZER__EMBEDDING_CREATE_CLASS: return MigrationPackage.FEATURE_INITIALIZER__EMBEDDING_CREATE_CLASS;
				case MigrationPackage.CREATE_INITIALIZER__TARGET_FEATURE: return MigrationPackage.FEATURE_INITIALIZER__TARGET_FEATURE;
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
		if (baseClass == FeatureInitializer.class) {
			switch (baseFeatureID) {
				case MigrationPackage.FEATURE_INITIALIZER__EMBEDDING_CREATE_CLASS: return MigrationPackage.CREATE_INITIALIZER__EMBEDDING_CREATE_CLASS;
				case MigrationPackage.FEATURE_INITIALIZER__TARGET_FEATURE: return MigrationPackage.CREATE_INITIALIZER__TARGET_FEATURE;
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
		if (baseClass == CreateClass.class) {
			switch (baseOperationID) {
				case MigrationPackage.CREATE_CLASS___GET_SOURCE_CLASS: return MigrationPackage.CREATE_INITIALIZER___GET_SOURCE_CLASS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == FeatureInitializer.class) {
			switch (baseOperationID) {
				case MigrationPackage.FEATURE_INITIALIZER___GET_MAPPING: return MigrationPackage.CREATE_INITIALIZER___GET_MAPPING;
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
			case MigrationPackage.CREATE_INITIALIZER___GET_SOURCE_CLASS:
				return getSourceClass();
			case MigrationPackage.CREATE_INITIALIZER___GET_MAPPING:
				return getMapping();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CreateInitializerImpl
