/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.component.impl.StructuredComponentImpl;
import org.muml.pim.instance.ComponentInstanceConfiguration;

import de.uni_paderborn.fujaba.muml.reconfiguration.Controller;
import de.uni_paderborn.fujaba.muml.reconfiguration.Executor;
import de.uni_paderborn.fujaba.muml.reconfiguration.Manager;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfigurable Structured Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurableStructuredComponentImpl#getController <em>Controller</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurableStructuredComponentImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurableStructuredComponentImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurableStructuredComponentImpl#getInitialConfiguration <em>Initial Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigurableStructuredComponentImpl extends StructuredComponentImpl implements ReconfigurableStructuredComponent {
	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected Controller controller;

	/**
	 * The cached setting delegate for the '{@link #getManager() <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MANAGER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ReconfigurationPackage.Literals.RECONFIGURABLE_STRUCTURED_COMPONENT__MANAGER).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getExecutor() <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EXECUTOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ReconfigurationPackage.Literals.RECONFIGURABLE_STRUCTURED_COMPONENT__EXECUTOR).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getInitialConfiguration() <em>Initial Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstanceConfiguration initialConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurableStructuredComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RECONFIGURABLE_STRUCTURED_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller getController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetController(Controller newController, NotificationChain msgs) {
		Controller oldController = controller;
		controller = newController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLER, oldController, newController);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(Controller newController) {
		if (newController != controller) {
			NotificationChain msgs = null;
			if (controller != null)
				msgs = ((InternalEObject)controller).eInverseRemove(this, ReconfigurationPackage.CONTROLLER__STRUCTURED_COMPONENT, Controller.class, msgs);
			if (newController != null)
				msgs = ((InternalEObject)newController).eInverseAdd(this, ReconfigurationPackage.CONTROLLER__STRUCTURED_COMPONENT, Controller.class, msgs);
			msgs = basicSetController(newController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLER, newController, newController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager getManager() {
		return (Manager)MANAGER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager basicGetManager() {
		return (Manager)MANAGER__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor getExecutor() {
		return (Executor)EXECUTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor basicGetExecutor() {
		return (Executor)EXECUTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration getInitialConfiguration() {
		if (initialConfiguration != null && initialConfiguration.eIsProxy()) {
			InternalEObject oldInitialConfiguration = (InternalEObject)initialConfiguration;
			initialConfiguration = (ComponentInstanceConfiguration)eResolveProxy(oldInitialConfiguration);
			if (initialConfiguration != oldInitialConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__INITIAL_CONFIGURATION, oldInitialConfiguration, initialConfiguration));
			}
		}
		return initialConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration basicGetInitialConfiguration() {
		return initialConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialConfiguration(ComponentInstanceConfiguration newInitialConfiguration) {
		ComponentInstanceConfiguration oldInitialConfiguration = initialConfiguration;
		initialConfiguration = newInitialConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__INITIAL_CONFIGURATION, oldInitialConfiguration, initialConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLER:
				if (controller != null)
					msgs = ((InternalEObject)controller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLER, null, msgs);
				return basicSetController((Controller)otherEnd, msgs);
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
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLER:
				return basicSetController(null, msgs);
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
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLER:
				return getController();
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__MANAGER:
				if (resolve) return getManager();
				return basicGetManager();
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__EXECUTOR:
				if (resolve) return getExecutor();
				return basicGetExecutor();
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__INITIAL_CONFIGURATION:
				if (resolve) return getInitialConfiguration();
				return basicGetInitialConfiguration();
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
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLER:
				setController((Controller)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__INITIAL_CONFIGURATION:
				setInitialConfiguration((ComponentInstanceConfiguration)newValue);
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
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLER:
				setController((Controller)null);
				return;
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__INITIAL_CONFIGURATION:
				setInitialConfiguration((ComponentInstanceConfiguration)null);
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
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLER:
				return controller != null;
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__MANAGER:
				return MANAGER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__EXECUTOR:
				return EXECUTOR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__INITIAL_CONFIGURATION:
				return initialConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

} //ReconfigurableStructuredComponentImpl
