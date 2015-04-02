/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSink;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prog Cnxn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgCnxnImpl#getProgDataSourceVar <em>Prog Data Source Var</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgCnxnImpl#getProgDataSourceValue <em>Prog Data Source Value</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgCnxnImpl#getDataSinkVar <em>Data Sink Var</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgCnxnImpl#getDataSinkValue <em>Data Sink Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgCnxnImpl extends MinimalEObjectImpl.Container implements ProgCnxn {
	/**
	 * The cached value of the '{@link #getProgDataSourceVar() <em>Prog Data Source Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgDataSourceVar()
	 * @generated
	 * @ordered
	 */
	protected SymbolicVariable progDataSourceVar;

	/**
	 * The cached value of the '{@link #getProgDataSourceValue() <em>Prog Data Source Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgDataSourceValue()
	 * @generated
	 * @ordered
	 */
	protected ProgDataSource progDataSourceValue;

	/**
	 * The cached value of the '{@link #getDataSinkVar() <em>Data Sink Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSinkVar()
	 * @generated
	 * @ordered
	 */
	protected SymbolicVariable dataSinkVar;

	/**
	 * The cached value of the '{@link #getDataSinkValue() <em>Data Sink Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSinkValue()
	 * @generated
	 * @ordered
	 */
	protected DataSink dataSinkValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgCnxnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationsPackage.Literals.PROG_CNXN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicVariable getProgDataSourceVar() {
		return progDataSourceVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgDataSourceVar(SymbolicVariable newProgDataSourceVar, NotificationChain msgs) {
		SymbolicVariable oldProgDataSourceVar = progDataSourceVar;
		progDataSourceVar = newProgDataSourceVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VAR, oldProgDataSourceVar, newProgDataSourceVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgDataSourceVar(SymbolicVariable newProgDataSourceVar) {
		if (newProgDataSourceVar != progDataSourceVar) {
			NotificationChain msgs = null;
			if (progDataSourceVar != null)
				msgs = ((InternalEObject)progDataSourceVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VAR, null, msgs);
			if (newProgDataSourceVar != null)
				msgs = ((InternalEObject)newProgDataSourceVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VAR, null, msgs);
			msgs = basicSetProgDataSourceVar(newProgDataSourceVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VAR, newProgDataSourceVar, newProgDataSourceVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgDataSource getProgDataSourceValue() {
		return progDataSourceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgDataSourceValue(ProgDataSource newProgDataSourceValue, NotificationChain msgs) {
		ProgDataSource oldProgDataSourceValue = progDataSourceValue;
		progDataSourceValue = newProgDataSourceValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VALUE, oldProgDataSourceValue, newProgDataSourceValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgDataSourceValue(ProgDataSource newProgDataSourceValue) {
		if (newProgDataSourceValue != progDataSourceValue) {
			NotificationChain msgs = null;
			if (progDataSourceValue != null)
				msgs = ((InternalEObject)progDataSourceValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VALUE, null, msgs);
			if (newProgDataSourceValue != null)
				msgs = ((InternalEObject)newProgDataSourceValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VALUE, null, msgs);
			msgs = basicSetProgDataSourceValue(newProgDataSourceValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VALUE, newProgDataSourceValue, newProgDataSourceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicVariable getDataSinkVar() {
		return dataSinkVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSinkVar(SymbolicVariable newDataSinkVar, NotificationChain msgs) {
		SymbolicVariable oldDataSinkVar = dataSinkVar;
		dataSinkVar = newDataSinkVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.PROG_CNXN__DATA_SINK_VAR, oldDataSinkVar, newDataSinkVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSinkVar(SymbolicVariable newDataSinkVar) {
		if (newDataSinkVar != dataSinkVar) {
			NotificationChain msgs = null;
			if (dataSinkVar != null)
				msgs = ((InternalEObject)dataSinkVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.PROG_CNXN__DATA_SINK_VAR, null, msgs);
			if (newDataSinkVar != null)
				msgs = ((InternalEObject)newDataSinkVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.PROG_CNXN__DATA_SINK_VAR, null, msgs);
			msgs = basicSetDataSinkVar(newDataSinkVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.PROG_CNXN__DATA_SINK_VAR, newDataSinkVar, newDataSinkVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSink getDataSinkValue() {
		return dataSinkValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSinkValue(DataSink newDataSinkValue, NotificationChain msgs) {
		DataSink oldDataSinkValue = dataSinkValue;
		dataSinkValue = newDataSinkValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.PROG_CNXN__DATA_SINK_VALUE, oldDataSinkValue, newDataSinkValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSinkValue(DataSink newDataSinkValue) {
		if (newDataSinkValue != dataSinkValue) {
			NotificationChain msgs = null;
			if (dataSinkValue != null)
				msgs = ((InternalEObject)dataSinkValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.PROG_CNXN__DATA_SINK_VALUE, null, msgs);
			if (newDataSinkValue != null)
				msgs = ((InternalEObject)newDataSinkValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.PROG_CNXN__DATA_SINK_VALUE, null, msgs);
			msgs = basicSetDataSinkValue(newDataSinkValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.PROG_CNXN__DATA_SINK_VALUE, newDataSinkValue, newDataSinkValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VAR:
				return basicSetProgDataSourceVar(null, msgs);
			case ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VALUE:
				return basicSetProgDataSourceValue(null, msgs);
			case ConfigurationsPackage.PROG_CNXN__DATA_SINK_VAR:
				return basicSetDataSinkVar(null, msgs);
			case ConfigurationsPackage.PROG_CNXN__DATA_SINK_VALUE:
				return basicSetDataSinkValue(null, msgs);
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
			case ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VAR:
				return getProgDataSourceVar();
			case ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VALUE:
				return getProgDataSourceValue();
			case ConfigurationsPackage.PROG_CNXN__DATA_SINK_VAR:
				return getDataSinkVar();
			case ConfigurationsPackage.PROG_CNXN__DATA_SINK_VALUE:
				return getDataSinkValue();
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
			case ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VAR:
				setProgDataSourceVar((SymbolicVariable)newValue);
				return;
			case ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VALUE:
				setProgDataSourceValue((ProgDataSource)newValue);
				return;
			case ConfigurationsPackage.PROG_CNXN__DATA_SINK_VAR:
				setDataSinkVar((SymbolicVariable)newValue);
				return;
			case ConfigurationsPackage.PROG_CNXN__DATA_SINK_VALUE:
				setDataSinkValue((DataSink)newValue);
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
			case ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VAR:
				setProgDataSourceVar((SymbolicVariable)null);
				return;
			case ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VALUE:
				setProgDataSourceValue((ProgDataSource)null);
				return;
			case ConfigurationsPackage.PROG_CNXN__DATA_SINK_VAR:
				setDataSinkVar((SymbolicVariable)null);
				return;
			case ConfigurationsPackage.PROG_CNXN__DATA_SINK_VALUE:
				setDataSinkValue((DataSink)null);
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
			case ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VAR:
				return progDataSourceVar != null;
			case ConfigurationsPackage.PROG_CNXN__PROG_DATA_SOURCE_VALUE:
				return progDataSourceValue != null;
			case ConfigurationsPackage.PROG_CNXN__DATA_SINK_VAR:
				return dataSinkVar != null;
			case ConfigurationsPackage.PROG_CNXN__DATA_SINK_VALUE:
				return dataSinkValue != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgCnxnImpl
