/**
 */
package de.uni_paderborn.fujaba.properties.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.properties.Plugin;
import de.uni_paderborn.fujaba.properties.PropertiesPackage;
import de.uni_paderborn.fujaba.properties.PropertyGenerator;
import de.uni_paderborn.fujaba.properties.PropertyTab;
import de.uni_paderborn.fujaba.properties.Reconciler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyGeneratorImpl#getReconciler <em>Reconciler</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyGeneratorImpl#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyGeneratorImpl#getReferencedGenerators <em>Referenced Generators</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyGeneratorImpl#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyGeneratorImpl#getDefaultTab <em>Default Tab</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyGeneratorImpl#getTabs <em>Tabs</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyGeneratorImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyGeneratorImpl#getContributorId <em>Contributor Id</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.PropertyGeneratorImpl#getSourceFolder <em>Source Folder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyGeneratorImpl extends EObjectImpl implements PropertyGenerator {
	/**
	 * The cached value of the '{@link #getReconciler() <em>Reconciler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconciler()
	 * @generated
	 * @ordered
	 */
	protected Reconciler reconciler;

	/**
	 * The cached value of the '{@link #getGenModel() <em>Gen Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenModel()
	 * @generated
	 * @ordered
	 */
	protected GenModel genModel;

	/**
	 * The cached value of the '{@link #getReferencedGenerators() <em>Referenced Generators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyGenerator> referencedGenerators;

	/**
	 * The cached value of the '{@link #getPlugin() <em>Plugin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugin()
	 * @generated
	 * @ordered
	 */
	protected Plugin plugin;

	/**
	 * The cached value of the '{@link #getDefaultTab() <em>Default Tab</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTab()
	 * @generated
	 * @ordered
	 */
	protected PropertyTab defaultTab;

	/**
	 * The cached value of the '{@link #getTabs() <em>Tabs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabs()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyTab> tabs;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<de.uni_paderborn.fujaba.properties.Package> packages;

	/**
	 * The default value of the '{@link #getContributorId() <em>Contributor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributorId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRIBUTOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContributorId() <em>Contributor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributorId()
	 * @generated
	 * @ordered
	 */
	protected String contributorId = CONTRIBUTOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceFolder() <em>Source Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_FOLDER_EDEFAULT = "src-gen";

	/**
	 * The cached value of the '{@link #getSourceFolder() <em>Source Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFolder()
	 * @generated
	 * @ordered
	 */
	protected String sourceFolder = SOURCE_FOLDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.PROPERTY_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reconciler getReconciler() {
		return reconciler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReconciler(Reconciler newReconciler, NotificationChain msgs) {
		Reconciler oldReconciler = reconciler;
		reconciler = newReconciler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY_GENERATOR__RECONCILER, oldReconciler, newReconciler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconciler(Reconciler newReconciler) {
		if (newReconciler != reconciler) {
			NotificationChain msgs = null;
			if (reconciler != null)
				msgs = ((InternalEObject)reconciler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.PROPERTY_GENERATOR__RECONCILER, null, msgs);
			if (newReconciler != null)
				msgs = ((InternalEObject)newReconciler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.PROPERTY_GENERATOR__RECONCILER, null, msgs);
			msgs = basicSetReconciler(newReconciler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY_GENERATOR__RECONCILER, newReconciler, newReconciler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel getGenModel() {
		if (genModel != null && genModel.eIsProxy()) {
			InternalEObject oldGenModel = (InternalEObject)genModel;
			genModel = (GenModel)eResolveProxy(oldGenModel);
			if (genModel != oldGenModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PROPERTY_GENERATOR__GEN_MODEL, oldGenModel, genModel));
			}
		}
		return genModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel basicGetGenModel() {
		return genModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenModel(GenModel newGenModel) {
		GenModel oldGenModel = genModel;
		genModel = newGenModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY_GENERATOR__GEN_MODEL, oldGenModel, genModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyGenerator> getReferencedGenerators() {
		if (referencedGenerators == null) {
			referencedGenerators = new EObjectResolvingEList<PropertyGenerator>(PropertyGenerator.class, this, PropertiesPackage.PROPERTY_GENERATOR__REFERENCED_GENERATORS);
		}
		return referencedGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plugin getPlugin() {
		return plugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlugin(Plugin newPlugin, NotificationChain msgs) {
		Plugin oldPlugin = plugin;
		plugin = newPlugin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY_GENERATOR__PLUGIN, oldPlugin, newPlugin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugin(Plugin newPlugin) {
		if (newPlugin != plugin) {
			NotificationChain msgs = null;
			if (plugin != null)
				msgs = ((InternalEObject)plugin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.PROPERTY_GENERATOR__PLUGIN, null, msgs);
			if (newPlugin != null)
				msgs = ((InternalEObject)newPlugin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.PROPERTY_GENERATOR__PLUGIN, null, msgs);
			msgs = basicSetPlugin(newPlugin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY_GENERATOR__PLUGIN, newPlugin, newPlugin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTab getDefaultTab() {
		if (defaultTab != null && defaultTab.eIsProxy()) {
			InternalEObject oldDefaultTab = (InternalEObject)defaultTab;
			defaultTab = (PropertyTab)eResolveProxy(oldDefaultTab);
			if (defaultTab != oldDefaultTab) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PROPERTY_GENERATOR__DEFAULT_TAB, oldDefaultTab, defaultTab));
			}
		}
		return defaultTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTab basicGetDefaultTab() {
		return defaultTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultTab(PropertyTab newDefaultTab) {
		PropertyTab oldDefaultTab = defaultTab;
		defaultTab = newDefaultTab;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY_GENERATOR__DEFAULT_TAB, oldDefaultTab, defaultTab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyTab> getTabs() {
		if (tabs == null) {
			tabs = new EObjectContainmentEList<PropertyTab>(PropertyTab.class, this, PropertiesPackage.PROPERTY_GENERATOR__TABS);
		}
		return tabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<de.uni_paderborn.fujaba.properties.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentWithInverseEList<de.uni_paderborn.fujaba.properties.Package>(de.uni_paderborn.fujaba.properties.Package.class, this, PropertiesPackage.PROPERTY_GENERATOR__PACKAGES, PropertiesPackage.PACKAGE__GENERATOR);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContributorId() {
		return contributorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributorId(String newContributorId) {
		String oldContributorId = contributorId;
		contributorId = newContributorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY_GENERATOR__CONTRIBUTOR_ID, oldContributorId, contributorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceFolder() {
		return sourceFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFolder(String newSourceFolder) {
		String oldSourceFolder = sourceFolder;
		sourceFolder = newSourceFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY_GENERATOR__SOURCE_FOLDER, oldSourceFolder, sourceFolder));
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
			case PropertiesPackage.PROPERTY_GENERATOR__PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackages()).basicAdd(otherEnd, msgs);
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
			case PropertiesPackage.PROPERTY_GENERATOR__RECONCILER:
				return basicSetReconciler(null, msgs);
			case PropertiesPackage.PROPERTY_GENERATOR__PLUGIN:
				return basicSetPlugin(null, msgs);
			case PropertiesPackage.PROPERTY_GENERATOR__TABS:
				return ((InternalEList<?>)getTabs()).basicRemove(otherEnd, msgs);
			case PropertiesPackage.PROPERTY_GENERATOR__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
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
			case PropertiesPackage.PROPERTY_GENERATOR__RECONCILER:
				return getReconciler();
			case PropertiesPackage.PROPERTY_GENERATOR__GEN_MODEL:
				if (resolve) return getGenModel();
				return basicGetGenModel();
			case PropertiesPackage.PROPERTY_GENERATOR__REFERENCED_GENERATORS:
				return getReferencedGenerators();
			case PropertiesPackage.PROPERTY_GENERATOR__PLUGIN:
				return getPlugin();
			case PropertiesPackage.PROPERTY_GENERATOR__DEFAULT_TAB:
				if (resolve) return getDefaultTab();
				return basicGetDefaultTab();
			case PropertiesPackage.PROPERTY_GENERATOR__TABS:
				return getTabs();
			case PropertiesPackage.PROPERTY_GENERATOR__PACKAGES:
				return getPackages();
			case PropertiesPackage.PROPERTY_GENERATOR__CONTRIBUTOR_ID:
				return getContributorId();
			case PropertiesPackage.PROPERTY_GENERATOR__SOURCE_FOLDER:
				return getSourceFolder();
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
			case PropertiesPackage.PROPERTY_GENERATOR__RECONCILER:
				setReconciler((Reconciler)newValue);
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__GEN_MODEL:
				setGenModel((GenModel)newValue);
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__REFERENCED_GENERATORS:
				getReferencedGenerators().clear();
				getReferencedGenerators().addAll((Collection<? extends PropertyGenerator>)newValue);
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__PLUGIN:
				setPlugin((Plugin)newValue);
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__DEFAULT_TAB:
				setDefaultTab((PropertyTab)newValue);
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__TABS:
				getTabs().clear();
				getTabs().addAll((Collection<? extends PropertyTab>)newValue);
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends de.uni_paderborn.fujaba.properties.Package>)newValue);
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__CONTRIBUTOR_ID:
				setContributorId((String)newValue);
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__SOURCE_FOLDER:
				setSourceFolder((String)newValue);
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
			case PropertiesPackage.PROPERTY_GENERATOR__RECONCILER:
				setReconciler((Reconciler)null);
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__GEN_MODEL:
				setGenModel((GenModel)null);
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__REFERENCED_GENERATORS:
				getReferencedGenerators().clear();
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__PLUGIN:
				setPlugin((Plugin)null);
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__DEFAULT_TAB:
				setDefaultTab((PropertyTab)null);
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__TABS:
				getTabs().clear();
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__PACKAGES:
				getPackages().clear();
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__CONTRIBUTOR_ID:
				setContributorId(CONTRIBUTOR_ID_EDEFAULT);
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__SOURCE_FOLDER:
				setSourceFolder(SOURCE_FOLDER_EDEFAULT);
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
			case PropertiesPackage.PROPERTY_GENERATOR__RECONCILER:
				return reconciler != null;
			case PropertiesPackage.PROPERTY_GENERATOR__GEN_MODEL:
				return genModel != null;
			case PropertiesPackage.PROPERTY_GENERATOR__REFERENCED_GENERATORS:
				return referencedGenerators != null && !referencedGenerators.isEmpty();
			case PropertiesPackage.PROPERTY_GENERATOR__PLUGIN:
				return plugin != null;
			case PropertiesPackage.PROPERTY_GENERATOR__DEFAULT_TAB:
				return defaultTab != null;
			case PropertiesPackage.PROPERTY_GENERATOR__TABS:
				return tabs != null && !tabs.isEmpty();
			case PropertiesPackage.PROPERTY_GENERATOR__PACKAGES:
				return packages != null && !packages.isEmpty();
			case PropertiesPackage.PROPERTY_GENERATOR__CONTRIBUTOR_ID:
				return CONTRIBUTOR_ID_EDEFAULT == null ? contributorId != null : !CONTRIBUTOR_ID_EDEFAULT.equals(contributorId);
			case PropertiesPackage.PROPERTY_GENERATOR__SOURCE_FOLDER:
				return SOURCE_FOLDER_EDEFAULT == null ? sourceFolder != null : !SOURCE_FOLDER_EDEFAULT.equals(sourceFolder);
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
		result.append(" (contributorId: ");
		result.append(contributorId);
		result.append(", sourceFolder: ");
		result.append(sourceFolder);
		result.append(')');
		return result.toString();
	}

} //PropertyGeneratorImpl
