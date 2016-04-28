/**
 */
package org.muml.psm.portapimapping.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.core.expressions.Expression;
import org.muml.core.impl.CommentableElementImpl;
import org.muml.pim.instance.ContinuousPortInstance;
import org.muml.psm.portapimapping.MappingRepository;
import org.muml.psm.portapimapping.PortApiMapping;
import org.muml.psm.portapimapping.PortapimappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Api Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.portapimapping.impl.PortApiMappingImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.muml.psm.portapimapping.impl.PortApiMappingImpl#getExecCommand <em>Exec Command</em>}</li>
 *   <li>{@link org.muml.psm.portapimapping.impl.PortApiMappingImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.muml.psm.portapimapping.impl.PortApiMappingImpl#getInitCommand <em>Init Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortApiMappingImpl extends CommentableElementImpl implements PortApiMapping {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected ContinuousPortInstance port;

	/**
	 * The cached value of the '{@link #getExecCommand() <em>Exec Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecCommand()
	 * @generated
	 * @ordered
	 */
	protected Expression execCommand;

	/**
	 * The cached value of the '{@link #getInitCommand() <em>Init Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitCommand()
	 * @generated
	 * @ordered
	 */
	protected Expression initCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortApiMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortapimappingPackage.Literals.PORT_API_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousPortInstance getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (ContinuousPortInstance)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortapimappingPackage.PORT_API_MAPPING__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousPortInstance basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(ContinuousPortInstance newPort) {
		ContinuousPortInstance oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortapimappingPackage.PORT_API_MAPPING__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExecCommand() {
		return execCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecCommand(Expression newExecCommand, NotificationChain msgs) {
		Expression oldExecCommand = execCommand;
		execCommand = newExecCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PortapimappingPackage.PORT_API_MAPPING__EXEC_COMMAND, oldExecCommand, newExecCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecCommand(Expression newExecCommand) {
		if (newExecCommand != execCommand) {
			NotificationChain msgs = null;
			if (execCommand != null)
				msgs = ((InternalEObject)execCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PortapimappingPackage.PORT_API_MAPPING__EXEC_COMMAND, null, msgs);
			if (newExecCommand != null)
				msgs = ((InternalEObject)newExecCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PortapimappingPackage.PORT_API_MAPPING__EXEC_COMMAND, null, msgs);
			msgs = basicSetExecCommand(newExecCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortapimappingPackage.PORT_API_MAPPING__EXEC_COMMAND, newExecCommand, newExecCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRepository getRepository() {
		if (eContainerFeatureID() != PortapimappingPackage.PORT_API_MAPPING__REPOSITORY) return null;
		return (MappingRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(MappingRepository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository, PortapimappingPackage.PORT_API_MAPPING__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(MappingRepository newRepository) {
		if (newRepository != eInternalContainer() || (eContainerFeatureID() != PortapimappingPackage.PORT_API_MAPPING__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, PortapimappingPackage.MAPPING_REPOSITORY__PORT_API_MAPPINGS, MappingRepository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortapimappingPackage.PORT_API_MAPPING__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitCommand() {
		return initCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitCommand(Expression newInitCommand, NotificationChain msgs) {
		Expression oldInitCommand = initCommand;
		initCommand = newInitCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PortapimappingPackage.PORT_API_MAPPING__INIT_COMMAND, oldInitCommand, newInitCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitCommand(Expression newInitCommand) {
		if (newInitCommand != initCommand) {
			NotificationChain msgs = null;
			if (initCommand != null)
				msgs = ((InternalEObject)initCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PortapimappingPackage.PORT_API_MAPPING__INIT_COMMAND, null, msgs);
			if (newInitCommand != null)
				msgs = ((InternalEObject)newInitCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PortapimappingPackage.PORT_API_MAPPING__INIT_COMMAND, null, msgs);
			msgs = basicSetInitCommand(newInitCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortapimappingPackage.PORT_API_MAPPING__INIT_COMMAND, newInitCommand, newInitCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PortapimappingPackage.PORT_API_MAPPING__REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository((MappingRepository)otherEnd, msgs);
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
			case PortapimappingPackage.PORT_API_MAPPING__EXEC_COMMAND:
				return basicSetExecCommand(null, msgs);
			case PortapimappingPackage.PORT_API_MAPPING__REPOSITORY:
				return basicSetRepository(null, msgs);
			case PortapimappingPackage.PORT_API_MAPPING__INIT_COMMAND:
				return basicSetInitCommand(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PortapimappingPackage.PORT_API_MAPPING__REPOSITORY:
				return eInternalContainer().eInverseRemove(this, PortapimappingPackage.MAPPING_REPOSITORY__PORT_API_MAPPINGS, MappingRepository.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortapimappingPackage.PORT_API_MAPPING__PORT:
				if (resolve) return getPort();
				return basicGetPort();
			case PortapimappingPackage.PORT_API_MAPPING__EXEC_COMMAND:
				return getExecCommand();
			case PortapimappingPackage.PORT_API_MAPPING__REPOSITORY:
				return getRepository();
			case PortapimappingPackage.PORT_API_MAPPING__INIT_COMMAND:
				return getInitCommand();
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
			case PortapimappingPackage.PORT_API_MAPPING__PORT:
				setPort((ContinuousPortInstance)newValue);
				return;
			case PortapimappingPackage.PORT_API_MAPPING__EXEC_COMMAND:
				setExecCommand((Expression)newValue);
				return;
			case PortapimappingPackage.PORT_API_MAPPING__REPOSITORY:
				setRepository((MappingRepository)newValue);
				return;
			case PortapimappingPackage.PORT_API_MAPPING__INIT_COMMAND:
				setInitCommand((Expression)newValue);
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
			case PortapimappingPackage.PORT_API_MAPPING__PORT:
				setPort((ContinuousPortInstance)null);
				return;
			case PortapimappingPackage.PORT_API_MAPPING__EXEC_COMMAND:
				setExecCommand((Expression)null);
				return;
			case PortapimappingPackage.PORT_API_MAPPING__REPOSITORY:
				setRepository((MappingRepository)null);
				return;
			case PortapimappingPackage.PORT_API_MAPPING__INIT_COMMAND:
				setInitCommand((Expression)null);
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
			case PortapimappingPackage.PORT_API_MAPPING__PORT:
				return port != null;
			case PortapimappingPackage.PORT_API_MAPPING__EXEC_COMMAND:
				return execCommand != null;
			case PortapimappingPackage.PORT_API_MAPPING__REPOSITORY:
				return getRepository() != null;
			case PortapimappingPackage.PORT_API_MAPPING__INIT_COMMAND:
				return initCommand != null;
		}
		return super.eIsSet(featureID);
	}

} //PortApiMappingImpl
