/**
 */
package org.muml.emm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.emm.Constraint;
import org.muml.emm.CreateClass;
import org.muml.emm.MigrationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.emm.impl.ConstraintImpl#getEmbeddingCreateClass <em>Embedding Create Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends OclExpressionImpl implements Constraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigrationPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateClass getEmbeddingCreateClass() {
		if (eContainerFeatureID() != MigrationPackage.CONSTRAINT__EMBEDDING_CREATE_CLASS) return null;
		return (CreateClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddingCreateClass(CreateClass newEmbeddingCreateClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmbeddingCreateClass, MigrationPackage.CONSTRAINT__EMBEDDING_CREATE_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddingCreateClass(CreateClass newEmbeddingCreateClass) {
		if (newEmbeddingCreateClass != eInternalContainer() || (eContainerFeatureID() != MigrationPackage.CONSTRAINT__EMBEDDING_CREATE_CLASS && newEmbeddingCreateClass != null)) {
			if (EcoreUtil.isAncestor(this, newEmbeddingCreateClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmbeddingCreateClass != null)
				msgs = ((InternalEObject)newEmbeddingCreateClass).eInverseAdd(this, MigrationPackage.CREATE_CLASS__CONSTRAINTS, CreateClass.class, msgs);
			msgs = basicSetEmbeddingCreateClass(newEmbeddingCreateClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.CONSTRAINT__EMBEDDING_CREATE_CLASS, newEmbeddingCreateClass, newEmbeddingCreateClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return getEmbeddingCreateClass().getSourceClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MigrationPackage.CONSTRAINT__EMBEDDING_CREATE_CLASS:
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
			case MigrationPackage.CONSTRAINT__EMBEDDING_CREATE_CLASS:
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
			case MigrationPackage.CONSTRAINT__EMBEDDING_CREATE_CLASS:
				return eInternalContainer().eInverseRemove(this, MigrationPackage.CREATE_CLASS__CONSTRAINTS, CreateClass.class, msgs);
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
			case MigrationPackage.CONSTRAINT__EMBEDDING_CREATE_CLASS:
				return getEmbeddingCreateClass();
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
			case MigrationPackage.CONSTRAINT__EMBEDDING_CREATE_CLASS:
				setEmbeddingCreateClass((CreateClass)newValue);
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
			case MigrationPackage.CONSTRAINT__EMBEDDING_CREATE_CLASS:
				setEmbeddingCreateClass((CreateClass)null);
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
			case MigrationPackage.CONSTRAINT__EMBEDDING_CREATE_CLASS:
				return getEmbeddingCreateClass() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MigrationPackage.CONSTRAINT___GET_CONTEXT:
				return getContext();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConstraintImpl
