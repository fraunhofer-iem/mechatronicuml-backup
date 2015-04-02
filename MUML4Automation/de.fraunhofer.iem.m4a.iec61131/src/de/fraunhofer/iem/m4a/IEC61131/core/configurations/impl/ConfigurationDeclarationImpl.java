/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessVarContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationVariableDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarContainter;
import de.fraunhofer.iem.m4a.IEC61131.core.impl.LibraryElementImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.GlobalVar;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationDeclarationImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationDeclarationImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationDeclarationImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationDeclarationImpl#getInstanceSpecificInits <em>Instance Specific Inits</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationDeclarationImpl#getGlobalVarNames <em>Global Var Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationDeclarationImpl extends LibraryElementImpl implements ConfigurationDeclaration {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceDeclaration> resources;

	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationVariableDeclaration> declarations;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected AccessVarContainer access;

	/**
	 * The cached value of the '{@link #getInstanceSpecificInits() <em>Instance Specific Inits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceSpecificInits()
	 * @generated
	 * @ordered
	 */
	protected InstanceSpecificVarContainter instanceSpecificInits;

	/**
	 * The cached value of the '{@link #getGlobalVarNames() <em>Global Var Names</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVarNames()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVar> globalVarNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationsPackage.Literals.CONFIGURATION_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceDeclaration> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<ResourceDeclaration>(ResourceDeclaration.class, this, ConfigurationsPackage.CONFIGURATION_DECLARATION__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationVariableDeclaration> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<ConfigurationVariableDeclaration>(ConfigurationVariableDeclaration.class, this, ConfigurationsPackage.CONFIGURATION_DECLARATION__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessVarContainer getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccess(AccessVarContainer newAccess, NotificationChain msgs) {
		AccessVarContainer oldAccess = access;
		access = newAccess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.CONFIGURATION_DECLARATION__ACCESS, oldAccess, newAccess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(AccessVarContainer newAccess) {
		if (newAccess != access) {
			NotificationChain msgs = null;
			if (access != null)
				msgs = ((InternalEObject)access).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.CONFIGURATION_DECLARATION__ACCESS, null, msgs);
			if (newAccess != null)
				msgs = ((InternalEObject)newAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.CONFIGURATION_DECLARATION__ACCESS, null, msgs);
			msgs = basicSetAccess(newAccess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.CONFIGURATION_DECLARATION__ACCESS, newAccess, newAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecificVarContainter getInstanceSpecificInits() {
		return instanceSpecificInits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceSpecificInits(InstanceSpecificVarContainter newInstanceSpecificInits, NotificationChain msgs) {
		InstanceSpecificVarContainter oldInstanceSpecificInits = instanceSpecificInits;
		instanceSpecificInits = newInstanceSpecificInits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS, oldInstanceSpecificInits, newInstanceSpecificInits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceSpecificInits(InstanceSpecificVarContainter newInstanceSpecificInits) {
		if (newInstanceSpecificInits != instanceSpecificInits) {
			NotificationChain msgs = null;
			if (instanceSpecificInits != null)
				msgs = ((InternalEObject)instanceSpecificInits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS, null, msgs);
			if (newInstanceSpecificInits != null)
				msgs = ((InternalEObject)newInstanceSpecificInits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS, null, msgs);
			msgs = basicSetInstanceSpecificInits(newInstanceSpecificInits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS, newInstanceSpecificInits, newInstanceSpecificInits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVar> getGlobalVarNames() {
		if (globalVarNames == null) {
			globalVarNames = new EObjectContainmentEList<GlobalVar>(GlobalVar.class, this, ConfigurationsPackage.CONFIGURATION_DECLARATION__GLOBAL_VAR_NAMES);
		}
		return globalVarNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__ACCESS:
				return basicSetAccess(null, msgs);
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS:
				return basicSetInstanceSpecificInits(null, msgs);
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__GLOBAL_VAR_NAMES:
				return ((InternalEList<?>)getGlobalVarNames()).basicRemove(otherEnd, msgs);
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
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__RESOURCES:
				return getResources();
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__DECLARATIONS:
				return getDeclarations();
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__ACCESS:
				return getAccess();
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS:
				return getInstanceSpecificInits();
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__GLOBAL_VAR_NAMES:
				return getGlobalVarNames();
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
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends ResourceDeclaration>)newValue);
				return;
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends ConfigurationVariableDeclaration>)newValue);
				return;
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__ACCESS:
				setAccess((AccessVarContainer)newValue);
				return;
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS:
				setInstanceSpecificInits((InstanceSpecificVarContainter)newValue);
				return;
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__GLOBAL_VAR_NAMES:
				getGlobalVarNames().clear();
				getGlobalVarNames().addAll((Collection<? extends GlobalVar>)newValue);
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
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__RESOURCES:
				getResources().clear();
				return;
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__DECLARATIONS:
				getDeclarations().clear();
				return;
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__ACCESS:
				setAccess((AccessVarContainer)null);
				return;
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS:
				setInstanceSpecificInits((InstanceSpecificVarContainter)null);
				return;
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__GLOBAL_VAR_NAMES:
				getGlobalVarNames().clear();
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
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__RESOURCES:
				return resources != null && !resources.isEmpty();
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__ACCESS:
				return access != null;
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS:
				return instanceSpecificInits != null;
			case ConfigurationsPackage.CONFIGURATION_DECLARATION__GLOBAL_VAR_NAMES:
				return globalVarNames != null && !globalVarNames.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationDeclarationImpl
