/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.component.AssemblyConnector;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.instance.impl.AssemblyConnectorInstanceImpl#getAssemblyConnectorType <em>Assembly Connector Type</em>}</li>
 *   <li>{@link org.muml.pim.instance.impl.AssemblyConnectorInstanceImpl#getConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorInstanceImpl extends PortConnectorInstanceImpl implements AssemblyConnectorInstance {
	/**
	 * The cached setting delegate for the '{@link #getAssemblyConnectorType() <em>Assembly Connector Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyConnectorType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSEMBLY_CONNECTOR_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_TYPE).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getConnectorQualityOfServiceAssumptions() <em>Connector Quality Of Service Assumptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 * @ordered
	 */
	protected ConnectorQualityOfServiceAssumptions connectorQualityOfServiceAssumptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.ASSEMBLY_CONNECTOR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector getAssemblyConnectorType() {
		return (AssemblyConnector)ASSEMBLY_CONNECTOR_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector basicGetAssemblyConnectorType() {
		return (AssemblyConnector)ASSEMBLY_CONNECTOR_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptions getConnectorQualityOfServiceAssumptions() {
		return connectorQualityOfServiceAssumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions newConnectorQualityOfServiceAssumptions, NotificationChain msgs) {
		ConnectorQualityOfServiceAssumptions oldConnectorQualityOfServiceAssumptions = connectorQualityOfServiceAssumptions;
		connectorQualityOfServiceAssumptions = newConnectorQualityOfServiceAssumptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS, oldConnectorQualityOfServiceAssumptions, newConnectorQualityOfServiceAssumptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions newConnectorQualityOfServiceAssumptions) {
		if (newConnectorQualityOfServiceAssumptions != connectorQualityOfServiceAssumptions) {
			NotificationChain msgs = null;
			if (connectorQualityOfServiceAssumptions != null)
				msgs = ((InternalEObject)connectorQualityOfServiceAssumptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS, null, msgs);
			if (newConnectorQualityOfServiceAssumptions != null)
				msgs = ((InternalEObject)newConnectorQualityOfServiceAssumptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS, null, msgs);
			msgs = basicSetConnectorQualityOfServiceAssumptions(newConnectorQualityOfServiceAssumptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS, newConnectorQualityOfServiceAssumptions, newConnectorQualityOfServiceAssumptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				return basicSetConnectorQualityOfServiceAssumptions(null, msgs);
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
			case InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_TYPE:
				if (resolve) return getAssemblyConnectorType();
				return basicGetAssemblyConnectorType();
			case InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				return getConnectorQualityOfServiceAssumptions();
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
			case InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				setConnectorQualityOfServiceAssumptions((ConnectorQualityOfServiceAssumptions)newValue);
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
			case InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				setConnectorQualityOfServiceAssumptions((ConnectorQualityOfServiceAssumptions)null);
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
			case InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_TYPE:
				return ASSEMBLY_CONNECTOR_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS:
				return connectorQualityOfServiceAssumptions != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyConnectorInstanceImpl
