/**
 */
package org.muml.emm.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.emm.Constraint;
import org.muml.emm.CreateClass;
import org.muml.emm.FeatureInitializer;
import org.muml.emm.MigrationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.emm.impl.CreateClassImpl#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link org.muml.emm.impl.CreateClassImpl#getFeatureInitializers <em>Feature Initializers</em>}</li>
 *   <li>{@link org.muml.emm.impl.CreateClassImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CreateClassImpl extends MinimalEObjectImpl.Container implements CreateClass {
	/**
	 * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClass()
	 * @generated
	 * @ordered
	 */
	protected EClass targetClass;

	/**
	 * The cached value of the '{@link #getFeatureInitializers() <em>Feature Initializers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureInitializers()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureInitializer> featureInitializers;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MigrationPackage.Literals.CREATE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetClass() {
		if (targetClass != null && targetClass.eIsProxy()) {
			InternalEObject oldTargetClass = (InternalEObject)targetClass;
			targetClass = (EClass)eResolveProxy(oldTargetClass);
			if (targetClass != oldTargetClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.CREATE_CLASS__TARGET_CLASS, oldTargetClass, targetClass));
			}
		}
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetTargetClass() {
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClass(EClass newTargetClass) {
		EClass oldTargetClass = targetClass;
		targetClass = newTargetClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.CREATE_CLASS__TARGET_CLASS, oldTargetClass, targetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureInitializer> getFeatureInitializers() {
		if (featureInitializers == null) {
			featureInitializers = new EObjectContainmentWithInverseEList<FeatureInitializer>(FeatureInitializer.class, this, MigrationPackage.CREATE_CLASS__FEATURE_INITIALIZERS, MigrationPackage.FEATURE_INITIALIZER__EMBEDDING_CREATE_CLASS);
		}
		return featureInitializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, MigrationPackage.CREATE_CLASS__CONSTRAINTS, MigrationPackage.CONSTRAINT__EMBEDDING_CREATE_CLASS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceClass() {
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
			case MigrationPackage.CREATE_CLASS__FEATURE_INITIALIZERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatureInitializers()).basicAdd(otherEnd, msgs);
			case MigrationPackage.CREATE_CLASS__CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraints()).basicAdd(otherEnd, msgs);
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
			case MigrationPackage.CREATE_CLASS__FEATURE_INITIALIZERS:
				return ((InternalEList<?>)getFeatureInitializers()).basicRemove(otherEnd, msgs);
			case MigrationPackage.CREATE_CLASS__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case MigrationPackage.CREATE_CLASS__TARGET_CLASS:
				if (resolve) return getTargetClass();
				return basicGetTargetClass();
			case MigrationPackage.CREATE_CLASS__FEATURE_INITIALIZERS:
				return getFeatureInitializers();
			case MigrationPackage.CREATE_CLASS__CONSTRAINTS:
				return getConstraints();
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
			case MigrationPackage.CREATE_CLASS__TARGET_CLASS:
				setTargetClass((EClass)newValue);
				return;
			case MigrationPackage.CREATE_CLASS__FEATURE_INITIALIZERS:
				getFeatureInitializers().clear();
				getFeatureInitializers().addAll((Collection<? extends FeatureInitializer>)newValue);
				return;
			case MigrationPackage.CREATE_CLASS__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
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
			case MigrationPackage.CREATE_CLASS__TARGET_CLASS:
				setTargetClass((EClass)null);
				return;
			case MigrationPackage.CREATE_CLASS__FEATURE_INITIALIZERS:
				getFeatureInitializers().clear();
				return;
			case MigrationPackage.CREATE_CLASS__CONSTRAINTS:
				getConstraints().clear();
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
			case MigrationPackage.CREATE_CLASS__TARGET_CLASS:
				return targetClass != null;
			case MigrationPackage.CREATE_CLASS__FEATURE_INITIALIZERS:
				return featureInitializers != null && !featureInitializers.isEmpty();
			case MigrationPackage.CREATE_CLASS__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
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
			case MigrationPackage.CREATE_CLASS___GET_SOURCE_CLASS:
				return getSourceClass();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CreateClassImpl
