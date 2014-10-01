/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.DistributionType;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.SporadicExternalEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sporadic External Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SporadicExternalEventImpl#getAvgInterarrival <em>Avg Interarrival</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SporadicExternalEventImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SporadicExternalEventImpl#getMinInterarrival <em>Min Interarrival</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SporadicExternalEventImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SporadicExternalEventImpl extends MinimalEObjectImpl.Container implements SporadicExternalEvent {
	/**
	 * The default value of the '{@link #getAvgInterarrival() <em>Avg Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgInterarrival()
	 * @generated
	 * @ordered
	 */
	protected static final float AVG_INTERARRIVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAvgInterarrival() <em>Avg Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgInterarrival()
	 * @generated
	 * @ordered
	 */
	protected float avgInterarrival = AVG_INTERARRIVAL_EDEFAULT;

	/**
	 * This is true if the Avg Interarrival attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean avgInterarrivalESet;

	/**
	 * The default value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final DistributionType DISTRIBUTION_EDEFAULT = DistributionType.UNIFORM;

	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected DistributionType distribution = DISTRIBUTION_EDEFAULT;

	/**
	 * This is true if the Distribution attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean distributionESet;

	/**
	 * The default value of the '{@link #getMinInterarrival() <em>Min Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterarrival()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_INTERARRIVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinInterarrival() <em>Min Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterarrival()
	 * @generated
	 * @ordered
	 */
	protected float minInterarrival = MIN_INTERARRIVAL_EDEFAULT;

	/**
	 * This is true if the Min Interarrival attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minInterarrivalESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SporadicExternalEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SPORADIC_EXTERNAL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAvgInterarrival() {
		return avgInterarrival;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgInterarrival(float newAvgInterarrival) {
		float oldAvgInterarrival = avgInterarrival;
		avgInterarrival = newAvgInterarrival;
		boolean oldAvgInterarrivalESet = avgInterarrivalESet;
		avgInterarrivalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPORADIC_EXTERNAL_EVENT__AVG_INTERARRIVAL, oldAvgInterarrival, avgInterarrival, !oldAvgInterarrivalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAvgInterarrival() {
		float oldAvgInterarrival = avgInterarrival;
		boolean oldAvgInterarrivalESet = avgInterarrivalESet;
		avgInterarrival = AVG_INTERARRIVAL_EDEFAULT;
		avgInterarrivalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPORADIC_EXTERNAL_EVENT__AVG_INTERARRIVAL, oldAvgInterarrival, AVG_INTERARRIVAL_EDEFAULT, oldAvgInterarrivalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAvgInterarrival() {
		return avgInterarrivalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionType getDistribution() {
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution(DistributionType newDistribution) {
		DistributionType oldDistribution = distribution;
		distribution = newDistribution == null ? DISTRIBUTION_EDEFAULT : newDistribution;
		boolean oldDistributionESet = distributionESet;
		distributionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPORADIC_EXTERNAL_EVENT__DISTRIBUTION, oldDistribution, distribution, !oldDistributionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistribution() {
		DistributionType oldDistribution = distribution;
		boolean oldDistributionESet = distributionESet;
		distribution = DISTRIBUTION_EDEFAULT;
		distributionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPORADIC_EXTERNAL_EVENT__DISTRIBUTION, oldDistribution, DISTRIBUTION_EDEFAULT, oldDistributionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistribution() {
		return distributionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinInterarrival() {
		return minInterarrival;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInterarrival(float newMinInterarrival) {
		float oldMinInterarrival = minInterarrival;
		minInterarrival = newMinInterarrival;
		boolean oldMinInterarrivalESet = minInterarrivalESet;
		minInterarrivalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPORADIC_EXTERNAL_EVENT__MIN_INTERARRIVAL, oldMinInterarrival, minInterarrival, !oldMinInterarrivalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinInterarrival() {
		float oldMinInterarrival = minInterarrival;
		boolean oldMinInterarrivalESet = minInterarrivalESet;
		minInterarrival = MIN_INTERARRIVAL_EDEFAULT;
		minInterarrivalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPORADIC_EXTERNAL_EVENT__MIN_INTERARRIVAL, oldMinInterarrival, MIN_INTERARRIVAL_EDEFAULT, oldMinInterarrivalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinInterarrival() {
		return minInterarrivalESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPORADIC_EXTERNAL_EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__AVG_INTERARRIVAL:
				return getAvgInterarrival();
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__DISTRIBUTION:
				return getDistribution();
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__MIN_INTERARRIVAL:
				return getMinInterarrival();
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__NAME:
				return getName();
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
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__AVG_INTERARRIVAL:
				setAvgInterarrival((Float)newValue);
				return;
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__DISTRIBUTION:
				setDistribution((DistributionType)newValue);
				return;
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__MIN_INTERARRIVAL:
				setMinInterarrival((Float)newValue);
				return;
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__NAME:
				setName((String)newValue);
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
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__AVG_INTERARRIVAL:
				unsetAvgInterarrival();
				return;
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__DISTRIBUTION:
				unsetDistribution();
				return;
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__MIN_INTERARRIVAL:
				unsetMinInterarrival();
				return;
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__NAME:
				setName(NAME_EDEFAULT);
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
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__AVG_INTERARRIVAL:
				return isSetAvgInterarrival();
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__DISTRIBUTION:
				return isSetDistribution();
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__MIN_INTERARRIVAL:
				return isSetMinInterarrival();
			case ModelPackage.SPORADIC_EXTERNAL_EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (avgInterarrival: ");
		if (avgInterarrivalESet) result.append(avgInterarrival); else result.append("<unset>");
		result.append(", distribution: ");
		if (distributionESet) result.append(distribution); else result.append("<unset>");
		result.append(", minInterarrival: ");
		if (minInterarrivalESet) result.append(minInterarrival); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SporadicExternalEventImpl
