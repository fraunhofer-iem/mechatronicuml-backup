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

import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Data;
import fujaba2simulink.behavior_model.Behavior_modelPackage;
import fujaba2simulink.behavior_model.scOpData2sfEmbFuncData;
import fujaba2simulink.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sc Op Data2sf Emb Func Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scOpData2sfEmbFuncDataImpl#getScParameter <em>Sc Parameter</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scOpData2sfEmbFuncDataImpl#getSfData <em>Sf Data</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scOpData2sfEmbFuncDataImpl#getScParaType <em>Sc Para Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class scOpData2sfEmbFuncDataImpl extends AbstractContainerCorrespondenceNodeImpl implements scOpData2sfEmbFuncData {
	/**
	 * The cached value of the '{@link #getScParameter() <em>Sc Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter scParameter;

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
	 * The cached value of the '{@link #getScParaType() <em>Sc Para Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScParaType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveDataType scParaType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scOpData2sfEmbFuncDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Behavior_modelPackage.Literals.SC_OP_DATA2SF_EMB_FUNC_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getScParameter() {
		if (scParameter != null && scParameter.eIsProxy()) {
			InternalEObject oldScParameter = (InternalEObject)scParameter;
			scParameter = (Parameter)eResolveProxy(oldScParameter);
			if (scParameter != oldScParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARAMETER, oldScParameter, scParameter));
			}
		}
		return scParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetScParameter() {
		return scParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScParameter(Parameter newScParameter) {
		Parameter oldScParameter = scParameter;
		scParameter = newScParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARAMETER, oldScParameter, scParameter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SF_DATA, oldSfData, sfData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SF_DATA, oldSfData, sfData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType getScParaType() {
		if (scParaType != null && scParaType.eIsProxy()) {
			InternalEObject oldScParaType = (InternalEObject)scParaType;
			scParaType = (PrimitiveDataType)eResolveProxy(oldScParaType);
			if (scParaType != oldScParaType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARA_TYPE, oldScParaType, scParaType));
			}
		}
		return scParaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType basicGetScParaType() {
		return scParaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScParaType(PrimitiveDataType newScParaType) {
		PrimitiveDataType oldScParaType = scParaType;
		scParaType = newScParaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARA_TYPE, oldScParaType, scParaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARAMETER:
				if (resolve) return getScParameter();
				return basicGetScParameter();
			case Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SF_DATA:
				if (resolve) return getSfData();
				return basicGetSfData();
			case Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARA_TYPE:
				if (resolve) return getScParaType();
				return basicGetScParaType();
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
			case Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARAMETER:
				setScParameter((Parameter)newValue);
				return;
			case Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SF_DATA:
				setSfData((Data)newValue);
				return;
			case Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARA_TYPE:
				setScParaType((PrimitiveDataType)newValue);
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
			case Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARAMETER:
				setScParameter((Parameter)null);
				return;
			case Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SF_DATA:
				setSfData((Data)null);
				return;
			case Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARA_TYPE:
				setScParaType((PrimitiveDataType)null);
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
			case Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARAMETER:
				return scParameter != null;
			case Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SF_DATA:
				return sfData != null;
			case Behavior_modelPackage.SC_OP_DATA2SF_EMB_FUNC_DATA__SC_PARA_TYPE:
				return scParaType != null;
		}
		return super.eIsSet(featureID);
	}

} //scOpData2sfEmbFuncDataImpl
