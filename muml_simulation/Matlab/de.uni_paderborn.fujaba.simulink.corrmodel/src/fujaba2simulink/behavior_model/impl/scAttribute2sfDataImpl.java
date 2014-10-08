/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.behavior.Variable;
import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Data;
import fujaba2simulink.behavior_model.Behavior_modelPackage;
import fujaba2simulink.behavior_model.scAttribute2sfData;
import fujaba2simulink.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sc Attribute2sf Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scAttribute2sfDataImpl#getScAttribute <em>Sc Attribute</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scAttribute2sfDataImpl#getSfData <em>Sf Data</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scAttribute2sfDataImpl#getScType <em>Sc Type</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scAttribute2sfDataImpl#getScAttrType <em>Sc Attr Type</em>}</li>
 * </ul>
 * </p>
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
	protected PrimitiveDataType scType;

	/**
	 * The cached value of the '{@link #getScAttrType() <em>Sc Attr Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScAttrType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveDataType scAttrType;

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
		return Behavior_modelPackage.Literals.SC_ATTRIBUTE2SF_DATA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE, oldScAttribute, scAttribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE, oldScAttribute, scAttribute));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SF_DATA, oldSfData, sfData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SF_DATA, oldSfData, sfData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType getScType() {
		if (scType != null && scType.eIsProxy()) {
			InternalEObject oldScType = (InternalEObject)scType;
			scType = (PrimitiveDataType)eResolveProxy(oldScType);
			if (scType != oldScType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_TYPE, oldScType, scType));
			}
		}
		return scType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType basicGetScType() {
		return scType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScType(PrimitiveDataType newScType) {
		PrimitiveDataType oldScType = scType;
		scType = newScType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_TYPE, oldScType, scType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType getScAttrType() {
		if (scAttrType != null && scAttrType.eIsProxy()) {
			InternalEObject oldScAttrType = (InternalEObject)scAttrType;
			scAttrType = (PrimitiveDataType)eResolveProxy(oldScAttrType);
			if (scAttrType != oldScAttrType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE, oldScAttrType, scAttrType));
			}
		}
		return scAttrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType basicGetScAttrType() {
		return scAttrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScAttrType(PrimitiveDataType newScAttrType) {
		PrimitiveDataType oldScAttrType = scAttrType;
		scAttrType = newScAttrType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE, oldScAttrType, scAttrType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE:
				if (resolve) return getScAttribute();
				return basicGetScAttribute();
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SF_DATA:
				if (resolve) return getSfData();
				return basicGetSfData();
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_TYPE:
				if (resolve) return getScType();
				return basicGetScType();
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE:
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
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE:
				setScAttribute((Variable)newValue);
				return;
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SF_DATA:
				setSfData((Data)newValue);
				return;
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_TYPE:
				setScType((PrimitiveDataType)newValue);
				return;
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE:
				setScAttrType((PrimitiveDataType)newValue);
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
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE:
				setScAttribute((Variable)null);
				return;
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SF_DATA:
				setSfData((Data)null);
				return;
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_TYPE:
				setScType((PrimitiveDataType)null);
				return;
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE:
				setScAttrType((PrimitiveDataType)null);
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
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTRIBUTE:
				return scAttribute != null;
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SF_DATA:
				return sfData != null;
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_TYPE:
				return scType != null;
			case Behavior_modelPackage.SC_ATTRIBUTE2SF_DATA__SC_ATTR_TYPE:
				return scAttrType != null;
		}
		return super.eIsSet(featureID);
	}

} //scAttribute2sfDataImpl
