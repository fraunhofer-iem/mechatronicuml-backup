/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.CompositeOperation;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.OverriddenFixedPriority;
import es.unican.mast.xmlmast.model.OverriddenPermanentFP;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.CompositeOperationImpl#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.CompositeOperationImpl#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.CompositeOperationImpl#getOperationList <em>Operation List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.CompositeOperationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeOperationImpl extends MinimalEObjectImpl.Container implements CompositeOperation {
	/**
	 * The cached value of the '{@link #getOverriddenFixedPriority() <em>Overridden Fixed Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverriddenFixedPriority()
	 * @generated
	 * @ordered
	 */
	protected OverriddenFixedPriority overriddenFixedPriority;

	/**
	 * The cached value of the '{@link #getOverriddenPermanentFP() <em>Overridden Permanent FP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverriddenPermanentFP()
	 * @generated
	 * @ordered
	 */
	protected OverriddenPermanentFP overriddenPermanentFP;

	/**
	 * The default value of the '{@link #getOperationList() <em>Operation List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationList()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> OPERATION_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationList() <em>Operation List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationList()
	 * @generated
	 * @ordered
	 */
	protected List<String> operationList = OPERATION_LIST_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPOSITE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverriddenFixedPriority getOverriddenFixedPriority() {
		return overriddenFixedPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverriddenFixedPriority(OverriddenFixedPriority newOverriddenFixedPriority, NotificationChain msgs) {
		OverriddenFixedPriority oldOverriddenFixedPriority = overriddenFixedPriority;
		overriddenFixedPriority = newOverriddenFixedPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_FIXED_PRIORITY, oldOverriddenFixedPriority, newOverriddenFixedPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverriddenFixedPriority(OverriddenFixedPriority newOverriddenFixedPriority) {
		if (newOverriddenFixedPriority != overriddenFixedPriority) {
			NotificationChain msgs = null;
			if (overriddenFixedPriority != null)
				msgs = ((InternalEObject)overriddenFixedPriority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_FIXED_PRIORITY, null, msgs);
			if (newOverriddenFixedPriority != null)
				msgs = ((InternalEObject)newOverriddenFixedPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_FIXED_PRIORITY, null, msgs);
			msgs = basicSetOverriddenFixedPriority(newOverriddenFixedPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_FIXED_PRIORITY, newOverriddenFixedPriority, newOverriddenFixedPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverriddenPermanentFP getOverriddenPermanentFP() {
		return overriddenPermanentFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverriddenPermanentFP(OverriddenPermanentFP newOverriddenPermanentFP, NotificationChain msgs) {
		OverriddenPermanentFP oldOverriddenPermanentFP = overriddenPermanentFP;
		overriddenPermanentFP = newOverriddenPermanentFP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_PERMANENT_FP, oldOverriddenPermanentFP, newOverriddenPermanentFP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverriddenPermanentFP(OverriddenPermanentFP newOverriddenPermanentFP) {
		if (newOverriddenPermanentFP != overriddenPermanentFP) {
			NotificationChain msgs = null;
			if (overriddenPermanentFP != null)
				msgs = ((InternalEObject)overriddenPermanentFP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_PERMANENT_FP, null, msgs);
			if (newOverriddenPermanentFP != null)
				msgs = ((InternalEObject)newOverriddenPermanentFP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_PERMANENT_FP, null, msgs);
			msgs = basicSetOverriddenPermanentFP(newOverriddenPermanentFP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_PERMANENT_FP, newOverriddenPermanentFP, newOverriddenPermanentFP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getOperationList() {
		return operationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationList(List<String> newOperationList) {
		List<String> oldOperationList = operationList;
		operationList = newOperationList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPOSITE_OPERATION__OPERATION_LIST, oldOperationList, operationList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPOSITE_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_FIXED_PRIORITY:
				return basicSetOverriddenFixedPriority(null, msgs);
			case ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_PERMANENT_FP:
				return basicSetOverriddenPermanentFP(null, msgs);
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
			case ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_FIXED_PRIORITY:
				return getOverriddenFixedPriority();
			case ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_PERMANENT_FP:
				return getOverriddenPermanentFP();
			case ModelPackage.COMPOSITE_OPERATION__OPERATION_LIST:
				return getOperationList();
			case ModelPackage.COMPOSITE_OPERATION__NAME:
				return getName();
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
			case ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_FIXED_PRIORITY:
				setOverriddenFixedPriority((OverriddenFixedPriority)newValue);
				return;
			case ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_PERMANENT_FP:
				setOverriddenPermanentFP((OverriddenPermanentFP)newValue);
				return;
			case ModelPackage.COMPOSITE_OPERATION__OPERATION_LIST:
				setOperationList((List<String>)newValue);
				return;
			case ModelPackage.COMPOSITE_OPERATION__NAME:
				setName((String)newValue);
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
			case ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_FIXED_PRIORITY:
				setOverriddenFixedPriority((OverriddenFixedPriority)null);
				return;
			case ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_PERMANENT_FP:
				setOverriddenPermanentFP((OverriddenPermanentFP)null);
				return;
			case ModelPackage.COMPOSITE_OPERATION__OPERATION_LIST:
				setOperationList(OPERATION_LIST_EDEFAULT);
				return;
			case ModelPackage.COMPOSITE_OPERATION__NAME:
				setName(NAME_EDEFAULT);
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
			case ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_FIXED_PRIORITY:
				return overriddenFixedPriority != null;
			case ModelPackage.COMPOSITE_OPERATION__OVERRIDDEN_PERMANENT_FP:
				return overriddenPermanentFP != null;
			case ModelPackage.COMPOSITE_OPERATION__OPERATION_LIST:
				return OPERATION_LIST_EDEFAULT == null ? operationList != null : !OPERATION_LIST_EDEFAULT.equals(operationList);
			case ModelPackage.COMPOSITE_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
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
		result.append(" (operationList: ");
		result.append(operationList);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CompositeOperationImpl
