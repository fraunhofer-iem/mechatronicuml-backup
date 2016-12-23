/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.behavior.Variable;
import org.muml.pim.types.DataType;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.scAttribute2sfData;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;
import org.muml.simulink.stateflow.Data;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sc Attribute2sf Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAttribute2sfDataImpl#getScAttribute <em>Sc Attribute</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAttribute2sfDataImpl#getSfData <em>Sf Data</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAttribute2sfDataImpl#getScType <em>Sc Type</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.scAttribute2sfDataImpl#getScAttrType <em>Sc Attr Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class scAttribute2sfDataImpl extends AbstractContainerCorrespondenceNodeImpl implements scAttribute2sfData {
	/**
	 * The cached value of the '{@link #getScAttribute() <em>Sc Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScAttribute()
	 * @generated
	 * @ordered
	 */
	protected Variable scAttribute;

	/**
	 * The cached value of the '{@link #getSfData() <em>Sf Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfData()
	 * @generated
	 * @ordered
	 */
	protected Data sfData;

	/**
	 * The cached value of the '{@link #getScType() <em>Sc Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScType()
	 * @generated
	 * @ordered
	 */
	protected DataType scType;

	/**
	 * The cached value of the '{@link #getScAttrType() <em>Sc Attr Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScAttrType()
	 * @generated
	 * @ordered
	 */
	protected DataType scAttrType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scAttribute2sfDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SC_ATTRIBUTE2SF_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getScAttribute() {
		if (scAttribute != null && scAttribute.eIsProxy()) {
			InternalEObject oldScAttribute = (InternalEObject)scAttribute;
			scAttribute = (Variable)eResolveProxy(oldScAttribute);
			if (scAttribute != oldScAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE, oldScAttribute, scAttribute));
			}
		}
		return scAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetScAttribute() {
		return scAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScAttribute(Variable newScAttribute) {
		Variable oldScAttribute = scAttribute;
		scAttribute = newScAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE, oldScAttribute, scAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getSfData() {
		if (sfData != null && ((EObject)sfData).eIsProxy()) {
			InternalEObject oldSfData = (InternalEObject)sfData;
			sfData = (Data)eResolveProxy(oldSfData);
			if (sfData != oldSfData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SF_DATA, oldSfData, sfData));
			}
		}
		return sfData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetSfData() {
		return sfData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfData(Data newSfData) {
		Data oldSfData = sfData;
		sfData = newSfData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SF_DATA, oldSfData, sfData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getScType() {
		if (scType != null && scType.eIsProxy()) {
			InternalEObject oldScType = (InternalEObject)scType;
			scType = (DataType)eResolveProxy(oldScType);
			if (scType != oldScType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_TYPE, oldScType, scType));
			}
		}
		return scType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetScType() {
		return scType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScType(DataType newScType) {
		DataType oldScType = scType;
		scType = newScType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_TYPE, oldScType, scType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getScAttrType() {
		if (scAttrType != null && scAttrType.eIsProxy()) {
			InternalEObject oldScAttrType = (InternalEObject)scAttrType;
			scAttrType = (DataType)eResolveProxy(oldScAttrType);
			if (scAttrType != oldScAttrType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE, oldScAttrType, scAttrType));
			}
		}
		return scAttrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetScAttrType() {
		return scAttrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScAttrType(DataType newScAttrType) {
		DataType oldScAttrType = scAttrType;
		scAttrType = newScAttrType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE, oldScAttrType, scAttrType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE:
				if (resolve) return getScAttribute();
				return basicGetScAttribute();
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SF_DATA:
				if (resolve) return getSfData();
				return basicGetSfData();
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_TYPE:
				if (resolve) return getScType();
				return basicGetScType();
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE:
				if (resolve) return getScAttrType();
				return basicGetScAttrType();
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
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE:
				setScAttribute((Variable)newValue);
				return;
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SF_DATA:
				setSfData((Data)newValue);
				return;
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_TYPE:
				setScType((DataType)newValue);
				return;
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE:
				setScAttrType((DataType)newValue);
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
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE:
				setScAttribute((Variable)null);
				return;
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SF_DATA:
				setSfData((Data)null);
				return;
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_TYPE:
				setScType((DataType)null);
				return;
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE:
				setScAttrType((DataType)null);
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
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE:
				return scAttribute != null;
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SF_DATA:
				return sfData != null;
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_TYPE:
				return scType != null;
			case BehaviorPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE:
				return scAttrType != null;
		}
		return super.eIsSet(featureID);
	}

} //scAttribute2sfDataImpl
