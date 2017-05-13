/**
 */
package coordination.impl;

import coordination.ConnectorQualityOfServiceAssumptions;
import coordination.CoordinationPackage;
import coordination.Role;
import coordination.RoleConnector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link coordination.impl.RoleConnectorImpl#getConnectorQOSAssumptions <em>Connector QOS Assumptions</em>}</li>
 *   <li>{@link coordination.impl.RoleConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link coordination.impl.RoleConnectorImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleConnectorImpl extends MinimalEObjectImpl.Container implements RoleConnector {
	/**
	 * The cached value of the '{@link #getConnectorQOSAssumptions() <em>Connector QOS Assumptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorQOSAssumptions()
	 * @generated
	 * @ordered
	 */
	protected ConnectorQualityOfServiceAssumptions connectorQOSAssumptions;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Role source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Role target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoordinationPackage.Literals.ROLE_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptions getConnectorQOSAssumptions() {
		return connectorQOSAssumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorQOSAssumptions(ConnectorQualityOfServiceAssumptions newConnectorQOSAssumptions, NotificationChain msgs) {
		ConnectorQualityOfServiceAssumptions oldConnectorQOSAssumptions = connectorQOSAssumptions;
		connectorQOSAssumptions = newConnectorQOSAssumptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoordinationPackage.ROLE_CONNECTOR__CONNECTOR_QOS_ASSUMPTIONS, oldConnectorQOSAssumptions, newConnectorQOSAssumptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorQOSAssumptions(ConnectorQualityOfServiceAssumptions newConnectorQOSAssumptions) {
		if (newConnectorQOSAssumptions != connectorQOSAssumptions) {
			NotificationChain msgs = null;
			if (connectorQOSAssumptions != null)
				msgs = ((InternalEObject)connectorQOSAssumptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoordinationPackage.ROLE_CONNECTOR__CONNECTOR_QOS_ASSUMPTIONS, null, msgs);
			if (newConnectorQOSAssumptions != null)
				msgs = ((InternalEObject)newConnectorQOSAssumptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoordinationPackage.ROLE_CONNECTOR__CONNECTOR_QOS_ASSUMPTIONS, null, msgs);
			msgs = basicSetConnectorQOSAssumptions(newConnectorQOSAssumptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoordinationPackage.ROLE_CONNECTOR__CONNECTOR_QOS_ASSUMPTIONS, newConnectorQOSAssumptions, newConnectorQOSAssumptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Role)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoordinationPackage.ROLE_CONNECTOR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Role newSource) {
		Role oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoordinationPackage.ROLE_CONNECTOR__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Role)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoordinationPackage.ROLE_CONNECTOR__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Role newTarget) {
		Role oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoordinationPackage.ROLE_CONNECTOR__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoordinationPackage.ROLE_CONNECTOR__CONNECTOR_QOS_ASSUMPTIONS:
				return basicSetConnectorQOSAssumptions(null, msgs);
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
			case CoordinationPackage.ROLE_CONNECTOR__CONNECTOR_QOS_ASSUMPTIONS:
				return getConnectorQOSAssumptions();
			case CoordinationPackage.ROLE_CONNECTOR__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case CoordinationPackage.ROLE_CONNECTOR__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case CoordinationPackage.ROLE_CONNECTOR__CONNECTOR_QOS_ASSUMPTIONS:
				setConnectorQOSAssumptions((ConnectorQualityOfServiceAssumptions)newValue);
				return;
			case CoordinationPackage.ROLE_CONNECTOR__SOURCE:
				setSource((Role)newValue);
				return;
			case CoordinationPackage.ROLE_CONNECTOR__TARGET:
				setTarget((Role)newValue);
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
			case CoordinationPackage.ROLE_CONNECTOR__CONNECTOR_QOS_ASSUMPTIONS:
				setConnectorQOSAssumptions((ConnectorQualityOfServiceAssumptions)null);
				return;
			case CoordinationPackage.ROLE_CONNECTOR__SOURCE:
				setSource((Role)null);
				return;
			case CoordinationPackage.ROLE_CONNECTOR__TARGET:
				setTarget((Role)null);
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
			case CoordinationPackage.ROLE_CONNECTOR__CONNECTOR_QOS_ASSUMPTIONS:
				return connectorQOSAssumptions != null;
			case CoordinationPackage.ROLE_CONNECTOR__SOURCE:
				return source != null;
			case CoordinationPackage.ROLE_CONNECTOR__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleConnectorImpl
