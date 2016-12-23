/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ExceptionVariable;
import org.muml.storydiagram.impl.VariableImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Exception Variable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.impl.ExceptionVariableImpl#getActivityEdge <em>Activity Edge</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.ExceptionVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.impl.ExceptionVariableImpl#getGenericExceptionTypes <em>Generic Exception Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionVariableImpl extends VariableImpl implements
		ExceptionVariable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenericExceptionTypes() <em>Generic Exception Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericExceptionTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EGenericType> genericExceptionTypes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.EXCEPTION_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.EXCEPTION_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EGenericType> getGenericExceptionTypes() {
		if (genericExceptionTypes == null) {
			genericExceptionTypes = new EObjectResolvingEList<EGenericType>(EGenericType.class, this, ActivitiesPackage.EXCEPTION_VARIABLE__GENERIC_EXCEPTION_TYPES);
		}
		return genericExceptionTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getActivityEdge() {
		if (eContainerFeatureID() != ActivitiesPackage.EXCEPTION_VARIABLE__ACTIVITY_EDGE) return null;
		return (ActivityEdge)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityEdge(ActivityEdge newActivityEdge,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivityEdge, ActivitiesPackage.EXCEPTION_VARIABLE__ACTIVITY_EDGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityEdge(ActivityEdge newActivityEdge) {
		if (newActivityEdge != eInternalContainer() || (eContainerFeatureID() != ActivitiesPackage.EXCEPTION_VARIABLE__ACTIVITY_EDGE && newActivityEdge != null)) {
			if (EcoreUtil.isAncestor(this, newActivityEdge))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivityEdge != null)
				msgs = ((InternalEObject)newActivityEdge).eInverseAdd(this, ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXCEPTIONS, ActivityEdge.class, msgs);
			msgs = basicSetActivityEdge(newActivityEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.EXCEPTION_VARIABLE__ACTIVITY_EDGE, newActivityEdge, newActivityEdge));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.EXCEPTION_VARIABLE__ACTIVITY_EDGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivityEdge((ActivityEdge)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.EXCEPTION_VARIABLE__ACTIVITY_EDGE:
				return basicSetActivityEdge(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ActivitiesPackage.EXCEPTION_VARIABLE__ACTIVITY_EDGE:
				return eInternalContainer().eInverseRemove(this, ActivitiesPackage.ACTIVITY_EDGE__GUARD_EXCEPTIONS, ActivityEdge.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitiesPackage.EXCEPTION_VARIABLE__ACTIVITY_EDGE:
				return getActivityEdge();
			case ActivitiesPackage.EXCEPTION_VARIABLE__NAME:
				return getName();
			case ActivitiesPackage.EXCEPTION_VARIABLE__GENERIC_EXCEPTION_TYPES:
				return getGenericExceptionTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitiesPackage.EXCEPTION_VARIABLE__ACTIVITY_EDGE:
				setActivityEdge((ActivityEdge)newValue);
				return;
			case ActivitiesPackage.EXCEPTION_VARIABLE__NAME:
				setName((String)newValue);
				return;
			case ActivitiesPackage.EXCEPTION_VARIABLE__GENERIC_EXCEPTION_TYPES:
				getGenericExceptionTypes().clear();
				getGenericExceptionTypes().addAll((Collection<? extends EGenericType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.EXCEPTION_VARIABLE__ACTIVITY_EDGE:
				setActivityEdge((ActivityEdge)null);
				return;
			case ActivitiesPackage.EXCEPTION_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivitiesPackage.EXCEPTION_VARIABLE__GENERIC_EXCEPTION_TYPES:
				getGenericExceptionTypes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivitiesPackage.EXCEPTION_VARIABLE__ACTIVITY_EDGE:
				return getActivityEdge() != null;
			case ActivitiesPackage.EXCEPTION_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActivitiesPackage.EXCEPTION_VARIABLE__GENERIC_EXCEPTION_TYPES:
				return genericExceptionTypes != null && !genericExceptionTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

	@Override
	public String getVariableName() {
		return getName();
	}

} // ExceptionVariableImpl
