/**
 */
package es.unican.mast.xmlmast.trace.impl;

import es.unican.mast.xmlmast.trace.MessageType;
import es.unican.mast.xmlmast.trace.MsgTypeList;
import es.unican.mast.xmlmast.trace.TracePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Msg Type List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.trace.impl.MsgTypeListImpl#getMsgType <em>Msg Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MsgTypeListImpl extends MinimalEObjectImpl.Container implements MsgTypeList {
	/**
	 * The cached value of the '{@link #getMsgType() <em>Msg Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgType()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageType> msgType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MsgTypeListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.MSG_TYPE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getMsgType() {
		if (msgType == null) {
			msgType = new EObjectContainmentEList<MessageType>(MessageType.class, this, TracePackage.MSG_TYPE_LIST__MSG_TYPE);
		}
		return msgType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracePackage.MSG_TYPE_LIST__MSG_TYPE:
				return ((InternalEList<?>)getMsgType()).basicRemove(otherEnd, msgs);
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
			case TracePackage.MSG_TYPE_LIST__MSG_TYPE:
				return getMsgType();
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
			case TracePackage.MSG_TYPE_LIST__MSG_TYPE:
				getMsgType().clear();
				getMsgType().addAll((Collection<? extends MessageType>)newValue);
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
			case TracePackage.MSG_TYPE_LIST__MSG_TYPE:
				getMsgType().clear();
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
			case TracePackage.MSG_TYPE_LIST__MSG_TYPE:
				return msgType != null && !msgType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MsgTypeListImpl
