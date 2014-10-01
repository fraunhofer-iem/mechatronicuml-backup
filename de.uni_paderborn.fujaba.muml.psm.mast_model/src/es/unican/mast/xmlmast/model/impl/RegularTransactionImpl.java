/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.Activity;
import es.unican.mast.xmlmast.model.Barrier;
import es.unican.mast.xmlmast.model.BurstyExternalEvent;
import es.unican.mast.xmlmast.model.Concentrator;
import es.unican.mast.xmlmast.model.Delay;
import es.unican.mast.xmlmast.model.DeliveryServer;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.Multicast;
import es.unican.mast.xmlmast.model.Offset;
import es.unican.mast.xmlmast.model.PeriodicExternalEvent;
import es.unican.mast.xmlmast.model.QueryServer;
import es.unican.mast.xmlmast.model.RateDivisor;
import es.unican.mast.xmlmast.model.RegularEvent;
import es.unican.mast.xmlmast.model.RegularTransaction;
import es.unican.mast.xmlmast.model.SingularExternalEvent;
import es.unican.mast.xmlmast.model.SporadicExternalEvent;
import es.unican.mast.xmlmast.model.SystemTimedActivity;
import es.unican.mast.xmlmast.model.UnboundedExternalEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getPeriodicExternalEvent <em>Periodic External Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getSporadicExternalEvent <em>Sporadic External Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getUnboundedExternalEvent <em>Unbounded External Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getBurstyExternalEvent <em>Bursty External Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getSingularExternalEvent <em>Singular External Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getRegularEvent <em>Regular Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getSystemTimedActivity <em>System Timed Activity</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getConcentrator <em>Concentrator</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getBarrier <em>Barrier</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getDeliveryServer <em>Delivery Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getQueryServer <em>Query Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getRateDivisor <em>Rate Divisor</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularTransactionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegularTransactionImpl extends MinimalEObjectImpl.Container implements RegularTransaction {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	protected RegularTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.REGULAR_TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ModelPackage.REGULAR_TRANSACTION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PeriodicExternalEvent> getPeriodicExternalEvent() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__PERIODIC_EXTERNAL_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SporadicExternalEvent> getSporadicExternalEvent() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__SPORADIC_EXTERNAL_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnboundedExternalEvent> getUnboundedExternalEvent() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__UNBOUNDED_EXTERNAL_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BurstyExternalEvent> getBurstyExternalEvent() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__BURSTY_EXTERNAL_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingularExternalEvent> getSingularExternalEvent() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__SINGULAR_EXTERNAL_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularEvent> getRegularEvent() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__REGULAR_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivity() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__ACTIVITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemTimedActivity> getSystemTimedActivity() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__SYSTEM_TIMED_ACTIVITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concentrator> getConcentrator() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__CONCENTRATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Barrier> getBarrier() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__BARRIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeliveryServer> getDeliveryServer() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__DELIVERY_SERVER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryServer> getQueryServer() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__QUERY_SERVER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Multicast> getMulticast() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__MULTICAST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RateDivisor> getRateDivisor() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__RATE_DIVISOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delay> getDelay() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__DELAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Offset> getOffset() {
		return getGroup().list(ModelPackage.Literals.REGULAR_TRANSACTION__OFFSET);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_TRANSACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.REGULAR_TRANSACTION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__PERIODIC_EXTERNAL_EVENT:
				return ((InternalEList<?>)getPeriodicExternalEvent()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__SPORADIC_EXTERNAL_EVENT:
				return ((InternalEList<?>)getSporadicExternalEvent()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__UNBOUNDED_EXTERNAL_EVENT:
				return ((InternalEList<?>)getUnboundedExternalEvent()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__BURSTY_EXTERNAL_EVENT:
				return ((InternalEList<?>)getBurstyExternalEvent()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__SINGULAR_EXTERNAL_EVENT:
				return ((InternalEList<?>)getSingularExternalEvent()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__REGULAR_EVENT:
				return ((InternalEList<?>)getRegularEvent()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__SYSTEM_TIMED_ACTIVITY:
				return ((InternalEList<?>)getSystemTimedActivity()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__CONCENTRATOR:
				return ((InternalEList<?>)getConcentrator()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__BARRIER:
				return ((InternalEList<?>)getBarrier()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__DELIVERY_SERVER:
				return ((InternalEList<?>)getDeliveryServer()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__QUERY_SERVER:
				return ((InternalEList<?>)getQueryServer()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__MULTICAST:
				return ((InternalEList<?>)getMulticast()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__RATE_DIVISOR:
				return ((InternalEList<?>)getRateDivisor()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__DELAY:
				return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGULAR_TRANSACTION__OFFSET:
				return ((InternalEList<?>)getOffset()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.REGULAR_TRANSACTION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ModelPackage.REGULAR_TRANSACTION__PERIODIC_EXTERNAL_EVENT:
				return getPeriodicExternalEvent();
			case ModelPackage.REGULAR_TRANSACTION__SPORADIC_EXTERNAL_EVENT:
				return getSporadicExternalEvent();
			case ModelPackage.REGULAR_TRANSACTION__UNBOUNDED_EXTERNAL_EVENT:
				return getUnboundedExternalEvent();
			case ModelPackage.REGULAR_TRANSACTION__BURSTY_EXTERNAL_EVENT:
				return getBurstyExternalEvent();
			case ModelPackage.REGULAR_TRANSACTION__SINGULAR_EXTERNAL_EVENT:
				return getSingularExternalEvent();
			case ModelPackage.REGULAR_TRANSACTION__REGULAR_EVENT:
				return getRegularEvent();
			case ModelPackage.REGULAR_TRANSACTION__ACTIVITY:
				return getActivity();
			case ModelPackage.REGULAR_TRANSACTION__SYSTEM_TIMED_ACTIVITY:
				return getSystemTimedActivity();
			case ModelPackage.REGULAR_TRANSACTION__CONCENTRATOR:
				return getConcentrator();
			case ModelPackage.REGULAR_TRANSACTION__BARRIER:
				return getBarrier();
			case ModelPackage.REGULAR_TRANSACTION__DELIVERY_SERVER:
				return getDeliveryServer();
			case ModelPackage.REGULAR_TRANSACTION__QUERY_SERVER:
				return getQueryServer();
			case ModelPackage.REGULAR_TRANSACTION__MULTICAST:
				return getMulticast();
			case ModelPackage.REGULAR_TRANSACTION__RATE_DIVISOR:
				return getRateDivisor();
			case ModelPackage.REGULAR_TRANSACTION__DELAY:
				return getDelay();
			case ModelPackage.REGULAR_TRANSACTION__OFFSET:
				return getOffset();
			case ModelPackage.REGULAR_TRANSACTION__NAME:
				return getName();
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
			case ModelPackage.REGULAR_TRANSACTION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__PERIODIC_EXTERNAL_EVENT:
				getPeriodicExternalEvent().clear();
				getPeriodicExternalEvent().addAll((Collection<? extends PeriodicExternalEvent>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__SPORADIC_EXTERNAL_EVENT:
				getSporadicExternalEvent().clear();
				getSporadicExternalEvent().addAll((Collection<? extends SporadicExternalEvent>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__UNBOUNDED_EXTERNAL_EVENT:
				getUnboundedExternalEvent().clear();
				getUnboundedExternalEvent().addAll((Collection<? extends UnboundedExternalEvent>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__BURSTY_EXTERNAL_EVENT:
				getBurstyExternalEvent().clear();
				getBurstyExternalEvent().addAll((Collection<? extends BurstyExternalEvent>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__SINGULAR_EXTERNAL_EVENT:
				getSingularExternalEvent().clear();
				getSingularExternalEvent().addAll((Collection<? extends SingularExternalEvent>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__REGULAR_EVENT:
				getRegularEvent().clear();
				getRegularEvent().addAll((Collection<? extends RegularEvent>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__SYSTEM_TIMED_ACTIVITY:
				getSystemTimedActivity().clear();
				getSystemTimedActivity().addAll((Collection<? extends SystemTimedActivity>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__CONCENTRATOR:
				getConcentrator().clear();
				getConcentrator().addAll((Collection<? extends Concentrator>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__BARRIER:
				getBarrier().clear();
				getBarrier().addAll((Collection<? extends Barrier>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__DELIVERY_SERVER:
				getDeliveryServer().clear();
				getDeliveryServer().addAll((Collection<? extends DeliveryServer>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__QUERY_SERVER:
				getQueryServer().clear();
				getQueryServer().addAll((Collection<? extends QueryServer>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__MULTICAST:
				getMulticast().clear();
				getMulticast().addAll((Collection<? extends Multicast>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__RATE_DIVISOR:
				getRateDivisor().clear();
				getRateDivisor().addAll((Collection<? extends RateDivisor>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__DELAY:
				getDelay().clear();
				getDelay().addAll((Collection<? extends Delay>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__OFFSET:
				getOffset().clear();
				getOffset().addAll((Collection<? extends Offset>)newValue);
				return;
			case ModelPackage.REGULAR_TRANSACTION__NAME:
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
			case ModelPackage.REGULAR_TRANSACTION__GROUP:
				getGroup().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__PERIODIC_EXTERNAL_EVENT:
				getPeriodicExternalEvent().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__SPORADIC_EXTERNAL_EVENT:
				getSporadicExternalEvent().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__UNBOUNDED_EXTERNAL_EVENT:
				getUnboundedExternalEvent().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__BURSTY_EXTERNAL_EVENT:
				getBurstyExternalEvent().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__SINGULAR_EXTERNAL_EVENT:
				getSingularExternalEvent().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__REGULAR_EVENT:
				getRegularEvent().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__ACTIVITY:
				getActivity().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__SYSTEM_TIMED_ACTIVITY:
				getSystemTimedActivity().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__CONCENTRATOR:
				getConcentrator().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__BARRIER:
				getBarrier().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__DELIVERY_SERVER:
				getDeliveryServer().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__QUERY_SERVER:
				getQueryServer().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__MULTICAST:
				getMulticast().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__RATE_DIVISOR:
				getRateDivisor().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__DELAY:
				getDelay().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__OFFSET:
				getOffset().clear();
				return;
			case ModelPackage.REGULAR_TRANSACTION__NAME:
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
			case ModelPackage.REGULAR_TRANSACTION__GROUP:
				return group != null && !group.isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__PERIODIC_EXTERNAL_EVENT:
				return !getPeriodicExternalEvent().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__SPORADIC_EXTERNAL_EVENT:
				return !getSporadicExternalEvent().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__UNBOUNDED_EXTERNAL_EVENT:
				return !getUnboundedExternalEvent().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__BURSTY_EXTERNAL_EVENT:
				return !getBurstyExternalEvent().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__SINGULAR_EXTERNAL_EVENT:
				return !getSingularExternalEvent().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__REGULAR_EVENT:
				return !getRegularEvent().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__ACTIVITY:
				return !getActivity().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__SYSTEM_TIMED_ACTIVITY:
				return !getSystemTimedActivity().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__CONCENTRATOR:
				return !getConcentrator().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__BARRIER:
				return !getBarrier().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__DELIVERY_SERVER:
				return !getDeliveryServer().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__QUERY_SERVER:
				return !getQueryServer().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__MULTICAST:
				return !getMulticast().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__RATE_DIVISOR:
				return !getRateDivisor().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__DELAY:
				return !getDelay().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__OFFSET:
				return !getOffset().isEmpty();
			case ModelPackage.REGULAR_TRANSACTION__NAME:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RegularTransactionImpl
