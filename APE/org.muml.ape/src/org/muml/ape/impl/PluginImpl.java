/**
 */
package org.muml.ape.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.muml.ape.Plugin;
import org.muml.ape.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.ape.impl.PluginImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.muml.ape.impl.PluginImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.ape.impl.PluginImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.muml.ape.impl.PluginImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.muml.ape.impl.PluginImpl#getRequiredBundles <em>Required Bundles</em>}</li>
 *   <li>{@link org.muml.ape.impl.PluginImpl#getRequiredExecutionEnvironment <em>Required Execution Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginImpl extends EObjectImpl implements Plugin {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredBundles() <em>Required Bundles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requiredBundles;

	/**
	 * The default value of the '{@link #getRequiredExecutionEnvironment() <em>Required Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_EXECUTION_ENVIRONMENT_EDEFAULT = "JavaSE-1.6";

	/**
	 * The cached value of the '{@link #getRequiredExecutionEnvironment() <em>Required Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String requiredExecutionEnvironment = REQUIRED_EXECUTION_ENVIRONMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.PLUGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PLUGIN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PLUGIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PLUGIN__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PLUGIN__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRequiredBundles() {
		if (requiredBundles == null) {
			requiredBundles = new EDataTypeUniqueEList<String>(String.class, this, PropertiesPackage.PLUGIN__REQUIRED_BUNDLES);
		}
		return requiredBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredExecutionEnvironment() {
		return requiredExecutionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredExecutionEnvironment(String newRequiredExecutionEnvironment) {
		String oldRequiredExecutionEnvironment = requiredExecutionEnvironment;
		requiredExecutionEnvironment = newRequiredExecutionEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PLUGIN__REQUIRED_EXECUTION_ENVIRONMENT, oldRequiredExecutionEnvironment, requiredExecutionEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertiesPackage.PLUGIN__ID:
				return getId();
			case PropertiesPackage.PLUGIN__NAME:
				return getName();
			case PropertiesPackage.PLUGIN__VENDOR:
				return getVendor();
			case PropertiesPackage.PLUGIN__VERSION:
				return getVersion();
			case PropertiesPackage.PLUGIN__REQUIRED_BUNDLES:
				return getRequiredBundles();
			case PropertiesPackage.PLUGIN__REQUIRED_EXECUTION_ENVIRONMENT:
				return getRequiredExecutionEnvironment();
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
			case PropertiesPackage.PLUGIN__ID:
				setId((String)newValue);
				return;
			case PropertiesPackage.PLUGIN__NAME:
				setName((String)newValue);
				return;
			case PropertiesPackage.PLUGIN__VENDOR:
				setVendor((String)newValue);
				return;
			case PropertiesPackage.PLUGIN__VERSION:
				setVersion((String)newValue);
				return;
			case PropertiesPackage.PLUGIN__REQUIRED_BUNDLES:
				getRequiredBundles().clear();
				getRequiredBundles().addAll((Collection<? extends String>)newValue);
				return;
			case PropertiesPackage.PLUGIN__REQUIRED_EXECUTION_ENVIRONMENT:
				setRequiredExecutionEnvironment((String)newValue);
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
			case PropertiesPackage.PLUGIN__ID:
				setId(ID_EDEFAULT);
				return;
			case PropertiesPackage.PLUGIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PropertiesPackage.PLUGIN__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case PropertiesPackage.PLUGIN__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PropertiesPackage.PLUGIN__REQUIRED_BUNDLES:
				getRequiredBundles().clear();
				return;
			case PropertiesPackage.PLUGIN__REQUIRED_EXECUTION_ENVIRONMENT:
				setRequiredExecutionEnvironment(REQUIRED_EXECUTION_ENVIRONMENT_EDEFAULT);
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
			case PropertiesPackage.PLUGIN__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PropertiesPackage.PLUGIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PropertiesPackage.PLUGIN__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case PropertiesPackage.PLUGIN__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case PropertiesPackage.PLUGIN__REQUIRED_BUNDLES:
				return requiredBundles != null && !requiredBundles.isEmpty();
			case PropertiesPackage.PLUGIN__REQUIRED_EXECUTION_ENVIRONMENT:
				return REQUIRED_EXECUTION_ENVIRONMENT_EDEFAULT == null ? requiredExecutionEnvironment != null : !REQUIRED_EXECUTION_ENVIRONMENT_EDEFAULT.equals(requiredExecutionEnvironment);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", version: ");
		result.append(version);
		result.append(", requiredBundles: ");
		result.append(requiredBundles);
		result.append(", requiredExecutionEnvironment: ");
		result.append(requiredExecutionEnvironment);
		result.append(')');
		return result.toString();
	}

} //PluginImpl
