/**
 */
package org.muml.psm.codegen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.muml.core.expressions.Expression;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.valuetype.TimeValue;
import org.muml.psm.codegen.CodegenPackage;
import org.muml.psm.codegen.GenPortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.codegen.impl.GenPortInstanceImpl#getPortInstance <em>Port Instance</em>}</li>
 *   <li>{@link org.muml.psm.codegen.impl.GenPortInstanceImpl#getSamplingTime <em>Sampling Time</em>}</li>
 *   <li>{@link org.muml.psm.codegen.impl.GenPortInstanceImpl#getExecCommand <em>Exec Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenPortInstanceImpl extends MinimalEObjectImpl.Container implements GenPortInstance {
	/**
	 * The cached value of the '{@link #getPortInstance() <em>Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstance()
	 * @generated
	 * @ordered
	 */
	protected PortInstance portInstance;

	/**
	 * The cached value of the '{@link #getSamplingTime() <em>Sampling Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingTime()
	 * @generated
	 * @ordered
	 */
	protected TimeValue samplingTime;

	/**
	 * The cached value of the '{@link #getExecCommand() <em>Exec Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecCommand()
	 * @generated
	 * @ordered
	 */
	protected Expression execCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenPortInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.GEN_PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance getPortInstance() {
		if (portInstance != null && portInstance.eIsProxy()) {
			InternalEObject oldPortInstance = (InternalEObject)portInstance;
			portInstance = (PortInstance)eResolveProxy(oldPortInstance);
			if (portInstance != oldPortInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.GEN_PORT_INSTANCE__PORT_INSTANCE, oldPortInstance, portInstance));
			}
		}
		return portInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance basicGetPortInstance() {
		return portInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortInstance(PortInstance newPortInstance) {
		PortInstance oldPortInstance = portInstance;
		portInstance = newPortInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.GEN_PORT_INSTANCE__PORT_INSTANCE, oldPortInstance, portInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getSamplingTime() {
		if (samplingTime != null && samplingTime.eIsProxy()) {
			InternalEObject oldSamplingTime = (InternalEObject)samplingTime;
			samplingTime = (TimeValue)eResolveProxy(oldSamplingTime);
			if (samplingTime != oldSamplingTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.GEN_PORT_INSTANCE__SAMPLING_TIME, oldSamplingTime, samplingTime));
			}
		}
		return samplingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue basicGetSamplingTime() {
		return samplingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplingTime(TimeValue newSamplingTime) {
		TimeValue oldSamplingTime = samplingTime;
		samplingTime = newSamplingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.GEN_PORT_INSTANCE__SAMPLING_TIME, oldSamplingTime, samplingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExecCommand() {
		if (execCommand != null && execCommand.eIsProxy()) {
			InternalEObject oldExecCommand = (InternalEObject)execCommand;
			execCommand = (Expression)eResolveProxy(oldExecCommand);
			if (execCommand != oldExecCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.GEN_PORT_INSTANCE__EXEC_COMMAND, oldExecCommand, execCommand));
			}
		}
		return execCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetExecCommand() {
		return execCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecCommand(Expression newExecCommand) {
		Expression oldExecCommand = execCommand;
		execCommand = newExecCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.GEN_PORT_INSTANCE__EXEC_COMMAND, oldExecCommand, execCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.GEN_PORT_INSTANCE__PORT_INSTANCE:
				if (resolve) return getPortInstance();
				return basicGetPortInstance();
			case CodegenPackage.GEN_PORT_INSTANCE__SAMPLING_TIME:
				if (resolve) return getSamplingTime();
				return basicGetSamplingTime();
			case CodegenPackage.GEN_PORT_INSTANCE__EXEC_COMMAND:
				if (resolve) return getExecCommand();
				return basicGetExecCommand();
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
			case CodegenPackage.GEN_PORT_INSTANCE__PORT_INSTANCE:
				setPortInstance((PortInstance)newValue);
				return;
			case CodegenPackage.GEN_PORT_INSTANCE__SAMPLING_TIME:
				setSamplingTime((TimeValue)newValue);
				return;
			case CodegenPackage.GEN_PORT_INSTANCE__EXEC_COMMAND:
				setExecCommand((Expression)newValue);
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
			case CodegenPackage.GEN_PORT_INSTANCE__PORT_INSTANCE:
				setPortInstance((PortInstance)null);
				return;
			case CodegenPackage.GEN_PORT_INSTANCE__SAMPLING_TIME:
				setSamplingTime((TimeValue)null);
				return;
			case CodegenPackage.GEN_PORT_INSTANCE__EXEC_COMMAND:
				setExecCommand((Expression)null);
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
			case CodegenPackage.GEN_PORT_INSTANCE__PORT_INSTANCE:
				return portInstance != null;
			case CodegenPackage.GEN_PORT_INSTANCE__SAMPLING_TIME:
				return samplingTime != null;
			case CodegenPackage.GEN_PORT_INSTANCE__EXEC_COMMAND:
				return execCommand != null;
		}
		return super.eIsSet(featureID);
	}

} //GenPortInstanceImpl
