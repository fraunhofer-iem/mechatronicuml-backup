/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ResourceVariableDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.NamedElementImpl;
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
 * An implementation of the model object '<em><b>Resource Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ResourceDeclarationImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ResourceDeclarationImpl#getProgramConfigurations <em>Program Configurations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ResourceDeclarationImpl#getTaskConfigurations <em>Task Configurations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ResourceDeclarationImpl#getGlobalVarNames <em>Global Var Names</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ResourceDeclarationImpl#getOnHardwareResource <em>On Hardware Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceDeclarationImpl extends NamedElementImpl implements ResourceDeclaration {
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected ResourceVariableDeclaration declarations;

	/**
	 * The cached value of the '{@link #getProgramConfigurations() <em>Program Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramConfiguration> programConfigurations;

	/**
	 * The cached value of the '{@link #getTaskConfigurations() <em>Task Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskConfiguration> taskConfigurations;

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
	 * The default value of the '{@link #getOnHardwareResource() <em>On Hardware Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnHardwareResource()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_HARDWARE_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnHardwareResource() <em>On Hardware Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnHardwareResource()
	 * @generated
	 * @ordered
	 */
	protected String onHardwareResource = ON_HARDWARE_RESOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationsPackage.Literals.RESOURCE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVariableDeclaration getDeclarations() {
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclarations(ResourceVariableDeclaration newDeclarations, NotificationChain msgs) {
		ResourceVariableDeclaration oldDeclarations = declarations;
		declarations = newDeclarations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.RESOURCE_DECLARATION__DECLARATIONS, oldDeclarations, newDeclarations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclarations(ResourceVariableDeclaration newDeclarations) {
		if (newDeclarations != declarations) {
			NotificationChain msgs = null;
			if (declarations != null)
				msgs = ((InternalEObject)declarations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.RESOURCE_DECLARATION__DECLARATIONS, null, msgs);
			if (newDeclarations != null)
				msgs = ((InternalEObject)newDeclarations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationsPackage.RESOURCE_DECLARATION__DECLARATIONS, null, msgs);
			msgs = basicSetDeclarations(newDeclarations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.RESOURCE_DECLARATION__DECLARATIONS, newDeclarations, newDeclarations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProgramConfiguration> getProgramConfigurations() {
		if (programConfigurations == null) {
			programConfigurations = new EObjectContainmentEList<ProgramConfiguration>(ProgramConfiguration.class, this, ConfigurationsPackage.RESOURCE_DECLARATION__PROGRAM_CONFIGURATIONS);
		}
		return programConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskConfiguration> getTaskConfigurations() {
		if (taskConfigurations == null) {
			taskConfigurations = new EObjectContainmentEList<TaskConfiguration>(TaskConfiguration.class, this, ConfigurationsPackage.RESOURCE_DECLARATION__TASK_CONFIGURATIONS);
		}
		return taskConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVar> getGlobalVarNames() {
		if (globalVarNames == null) {
			globalVarNames = new EObjectContainmentEList<GlobalVar>(GlobalVar.class, this, ConfigurationsPackage.RESOURCE_DECLARATION__GLOBAL_VAR_NAMES);
		}
		return globalVarNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnHardwareResource() {
		return onHardwareResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnHardwareResource(String newOnHardwareResource) {
		String oldOnHardwareResource = onHardwareResource;
		onHardwareResource = newOnHardwareResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.RESOURCE_DECLARATION__ON_HARDWARE_RESOURCE, oldOnHardwareResource, onHardwareResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationsPackage.RESOURCE_DECLARATION__DECLARATIONS:
				return basicSetDeclarations(null, msgs);
			case ConfigurationsPackage.RESOURCE_DECLARATION__PROGRAM_CONFIGURATIONS:
				return ((InternalEList<?>)getProgramConfigurations()).basicRemove(otherEnd, msgs);
			case ConfigurationsPackage.RESOURCE_DECLARATION__TASK_CONFIGURATIONS:
				return ((InternalEList<?>)getTaskConfigurations()).basicRemove(otherEnd, msgs);
			case ConfigurationsPackage.RESOURCE_DECLARATION__GLOBAL_VAR_NAMES:
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
			case ConfigurationsPackage.RESOURCE_DECLARATION__DECLARATIONS:
				return getDeclarations();
			case ConfigurationsPackage.RESOURCE_DECLARATION__PROGRAM_CONFIGURATIONS:
				return getProgramConfigurations();
			case ConfigurationsPackage.RESOURCE_DECLARATION__TASK_CONFIGURATIONS:
				return getTaskConfigurations();
			case ConfigurationsPackage.RESOURCE_DECLARATION__GLOBAL_VAR_NAMES:
				return getGlobalVarNames();
			case ConfigurationsPackage.RESOURCE_DECLARATION__ON_HARDWARE_RESOURCE:
				return getOnHardwareResource();
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
			case ConfigurationsPackage.RESOURCE_DECLARATION__DECLARATIONS:
				setDeclarations((ResourceVariableDeclaration)newValue);
				return;
			case ConfigurationsPackage.RESOURCE_DECLARATION__PROGRAM_CONFIGURATIONS:
				getProgramConfigurations().clear();
				getProgramConfigurations().addAll((Collection<? extends ProgramConfiguration>)newValue);
				return;
			case ConfigurationsPackage.RESOURCE_DECLARATION__TASK_CONFIGURATIONS:
				getTaskConfigurations().clear();
				getTaskConfigurations().addAll((Collection<? extends TaskConfiguration>)newValue);
				return;
			case ConfigurationsPackage.RESOURCE_DECLARATION__GLOBAL_VAR_NAMES:
				getGlobalVarNames().clear();
				getGlobalVarNames().addAll((Collection<? extends GlobalVar>)newValue);
				return;
			case ConfigurationsPackage.RESOURCE_DECLARATION__ON_HARDWARE_RESOURCE:
				setOnHardwareResource((String)newValue);
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
			case ConfigurationsPackage.RESOURCE_DECLARATION__DECLARATIONS:
				setDeclarations((ResourceVariableDeclaration)null);
				return;
			case ConfigurationsPackage.RESOURCE_DECLARATION__PROGRAM_CONFIGURATIONS:
				getProgramConfigurations().clear();
				return;
			case ConfigurationsPackage.RESOURCE_DECLARATION__TASK_CONFIGURATIONS:
				getTaskConfigurations().clear();
				return;
			case ConfigurationsPackage.RESOURCE_DECLARATION__GLOBAL_VAR_NAMES:
				getGlobalVarNames().clear();
				return;
			case ConfigurationsPackage.RESOURCE_DECLARATION__ON_HARDWARE_RESOURCE:
				setOnHardwareResource(ON_HARDWARE_RESOURCE_EDEFAULT);
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
			case ConfigurationsPackage.RESOURCE_DECLARATION__DECLARATIONS:
				return declarations != null;
			case ConfigurationsPackage.RESOURCE_DECLARATION__PROGRAM_CONFIGURATIONS:
				return programConfigurations != null && !programConfigurations.isEmpty();
			case ConfigurationsPackage.RESOURCE_DECLARATION__TASK_CONFIGURATIONS:
				return taskConfigurations != null && !taskConfigurations.isEmpty();
			case ConfigurationsPackage.RESOURCE_DECLARATION__GLOBAL_VAR_NAMES:
				return globalVarNames != null && !globalVarNames.isEmpty();
			case ConfigurationsPackage.RESOURCE_DECLARATION__ON_HARDWARE_RESOURCE:
				return ON_HARDWARE_RESOURCE_EDEFAULT == null ? onHardwareResource != null : !ON_HARDWARE_RESOURCE_EDEFAULT.equals(onHardwareResource);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (onHardwareResource: ");
		result.append(onHardwareResource);
		result.append(')');
		return result.toString();
	}

} //ResourceDeclarationImpl
