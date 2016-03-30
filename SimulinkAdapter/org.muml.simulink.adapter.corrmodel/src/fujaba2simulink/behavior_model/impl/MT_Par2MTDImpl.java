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
import org.muml.pim.behavior.Parameter;
import org.muml.pim.msgtype.MessageType;

import de.uni_paderborn.fujaba.simulink.model.stateflow.Data;
import fujaba2simulink.behavior_model.Behavior_modelPackage;
import fujaba2simulink.behavior_model.MT_Par2MTD;
import fujaba2simulink.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MT Par2 MTD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.impl.MT_Par2MTDImpl#getMt <em>Mt</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.MT_Par2MTDImpl#getPar <em>Par</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.MT_Par2MTDImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MT_Par2MTDImpl extends AbstractContainerCorrespondenceNodeImpl implements MT_Par2MTD {
	/**
	 * The cached value of the '{@link #getMt() <em>Mt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMt()
	 * @generated
	 * @ordered
	 */
	protected MessageType mt;

	/**
	 * The cached value of the '{@link #getPar() <em>Par</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPar()
	 * @generated
	 * @ordered
	 */
	protected Parameter par;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MT_Par2MTDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Behavior_modelPackage.Literals.MT_PAR2_MTD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType getMt() {
		if (mt != null && mt.eIsProxy()) {
			InternalEObject oldMt = (InternalEObject)mt;
			mt = (MessageType)eResolveProxy(oldMt);
			if (mt != oldMt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.MT_PAR2_MTD__MT, oldMt, mt));
			}
		}
		return mt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType basicGetMt() {
		return mt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMt(MessageType newMt) {
		MessageType oldMt = mt;
		mt = newMt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.MT_PAR2_MTD__MT, oldMt, mt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getPar() {
		if (par != null && par.eIsProxy()) {
			InternalEObject oldPar = (InternalEObject)par;
			par = (Parameter)eResolveProxy(oldPar);
			if (par != oldPar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.MT_PAR2_MTD__PAR, oldPar, par));
			}
		}
		return par;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetPar() {
		return par;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPar(Parameter newPar) {
		Parameter oldPar = par;
		par = newPar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.MT_PAR2_MTD__PAR, oldPar, par));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData() {
		if (data != null && ((EObject)data).eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (Data)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.MT_PAR2_MTD__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.MT_PAR2_MTD__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Behavior_modelPackage.MT_PAR2_MTD__MT:
				if (resolve) return getMt();
				return basicGetMt();
			case Behavior_modelPackage.MT_PAR2_MTD__PAR:
				if (resolve) return getPar();
				return basicGetPar();
			case Behavior_modelPackage.MT_PAR2_MTD__DATA:
				if (resolve) return getData();
				return basicGetData();
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
			case Behavior_modelPackage.MT_PAR2_MTD__MT:
				setMt((MessageType)newValue);
				return;
			case Behavior_modelPackage.MT_PAR2_MTD__PAR:
				setPar((Parameter)newValue);
				return;
			case Behavior_modelPackage.MT_PAR2_MTD__DATA:
				setData((Data)newValue);
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
			case Behavior_modelPackage.MT_PAR2_MTD__MT:
				setMt((MessageType)null);
				return;
			case Behavior_modelPackage.MT_PAR2_MTD__PAR:
				setPar((Parameter)null);
				return;
			case Behavior_modelPackage.MT_PAR2_MTD__DATA:
				setData((Data)null);
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
			case Behavior_modelPackage.MT_PAR2_MTD__MT:
				return mt != null;
			case Behavior_modelPackage.MT_PAR2_MTD__PAR:
				return par != null;
			case Behavior_modelPackage.MT_PAR2_MTD__DATA:
				return data != null;
		}
		return super.eIsSet(featureID);
	}

} //MT_Par2MTDImpl
