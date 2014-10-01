/**
 */
package de.uni_paderborn.fujaba.properties.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.properties.CustomTransformation;
import de.uni_paderborn.fujaba.properties.PropertiesPackage;
import de.uni_paderborn.fujaba.properties.Reconciler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconciler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.ReconcilerImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.ReconcilerImpl#isReconcilePackages <em>Reconcile Packages</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.ReconcilerImpl#isReconcileClasses <em>Reconcile Classes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.ReconcilerImpl#isReconcileProperties <em>Reconcile Properties</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.ReconcilerImpl#getCustomTransformations <em>Custom Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconcilerImpl extends EObjectImpl implements Reconciler {
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isReconcilePackages() <em>Reconcile Packages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReconcilePackages()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECONCILE_PACKAGES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReconcilePackages() <em>Reconcile Packages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReconcilePackages()
	 * @generated
	 * @ordered
	 */
	protected boolean reconcilePackages = RECONCILE_PACKAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #isReconcileClasses() <em>Reconcile Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReconcileClasses()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECONCILE_CLASSES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReconcileClasses() <em>Reconcile Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReconcileClasses()
	 * @generated
	 * @ordered
	 */
	protected boolean reconcileClasses = RECONCILE_CLASSES_EDEFAULT;

	/**
	 * The default value of the '{@link #isReconcileProperties() <em>Reconcile Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReconcileProperties()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECONCILE_PROPERTIES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReconcileProperties() <em>Reconcile Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReconcileProperties()
	 * @generated
	 * @ordered
	 */
	protected boolean reconcileProperties = RECONCILE_PROPERTIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomTransformations() <em>Custom Transformations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomTransformation> customTransformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconcilerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.RECONCILER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.RECONCILER__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReconcilePackages() {
		return reconcilePackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconcilePackages(boolean newReconcilePackages) {
		boolean oldReconcilePackages = reconcilePackages;
		reconcilePackages = newReconcilePackages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.RECONCILER__RECONCILE_PACKAGES, oldReconcilePackages, reconcilePackages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReconcileClasses() {
		return reconcileClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconcileClasses(boolean newReconcileClasses) {
		boolean oldReconcileClasses = reconcileClasses;
		reconcileClasses = newReconcileClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.RECONCILER__RECONCILE_CLASSES, oldReconcileClasses, reconcileClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReconcileProperties() {
		return reconcileProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconcileProperties(boolean newReconcileProperties) {
		boolean oldReconcileProperties = reconcileProperties;
		reconcileProperties = newReconcileProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.RECONCILER__RECONCILE_PROPERTIES, oldReconcileProperties, reconcileProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomTransformation> getCustomTransformations() {
		if (customTransformations == null) {
			customTransformations = new EObjectContainmentEList<CustomTransformation>(CustomTransformation.class, this, PropertiesPackage.RECONCILER__CUSTOM_TRANSFORMATIONS);
		}
		return customTransformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PropertiesPackage.RECONCILER__CUSTOM_TRANSFORMATIONS:
				return ((InternalEList<?>)getCustomTransformations()).basicRemove(otherEnd, msgs);
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
			case PropertiesPackage.RECONCILER__ENABLED:
				return isEnabled();
			case PropertiesPackage.RECONCILER__RECONCILE_PACKAGES:
				return isReconcilePackages();
			case PropertiesPackage.RECONCILER__RECONCILE_CLASSES:
				return isReconcileClasses();
			case PropertiesPackage.RECONCILER__RECONCILE_PROPERTIES:
				return isReconcileProperties();
			case PropertiesPackage.RECONCILER__CUSTOM_TRANSFORMATIONS:
				return getCustomTransformations();
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
			case PropertiesPackage.RECONCILER__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case PropertiesPackage.RECONCILER__RECONCILE_PACKAGES:
				setReconcilePackages((Boolean)newValue);
				return;
			case PropertiesPackage.RECONCILER__RECONCILE_CLASSES:
				setReconcileClasses((Boolean)newValue);
				return;
			case PropertiesPackage.RECONCILER__RECONCILE_PROPERTIES:
				setReconcileProperties((Boolean)newValue);
				return;
			case PropertiesPackage.RECONCILER__CUSTOM_TRANSFORMATIONS:
				getCustomTransformations().clear();
				getCustomTransformations().addAll((Collection<? extends CustomTransformation>)newValue);
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
			case PropertiesPackage.RECONCILER__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case PropertiesPackage.RECONCILER__RECONCILE_PACKAGES:
				setReconcilePackages(RECONCILE_PACKAGES_EDEFAULT);
				return;
			case PropertiesPackage.RECONCILER__RECONCILE_CLASSES:
				setReconcileClasses(RECONCILE_CLASSES_EDEFAULT);
				return;
			case PropertiesPackage.RECONCILER__RECONCILE_PROPERTIES:
				setReconcileProperties(RECONCILE_PROPERTIES_EDEFAULT);
				return;
			case PropertiesPackage.RECONCILER__CUSTOM_TRANSFORMATIONS:
				getCustomTransformations().clear();
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
			case PropertiesPackage.RECONCILER__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case PropertiesPackage.RECONCILER__RECONCILE_PACKAGES:
				return reconcilePackages != RECONCILE_PACKAGES_EDEFAULT;
			case PropertiesPackage.RECONCILER__RECONCILE_CLASSES:
				return reconcileClasses != RECONCILE_CLASSES_EDEFAULT;
			case PropertiesPackage.RECONCILER__RECONCILE_PROPERTIES:
				return reconcileProperties != RECONCILE_PROPERTIES_EDEFAULT;
			case PropertiesPackage.RECONCILER__CUSTOM_TRANSFORMATIONS:
				return customTransformations != null && !customTransformations.isEmpty();
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
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(", reconcilePackages: ");
		result.append(reconcilePackages);
		result.append(", reconcileClasses: ");
		result.append(reconcileClasses);
		result.append(", reconcileProperties: ");
		result.append(reconcileProperties);
		result.append(')');
		return result.toString();
	}

} //ReconcilerImpl
