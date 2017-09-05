/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification.Impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryAttempts;
import org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryBackoffMultiplier;
import org.opendds.modeling.sdk.model.GeneratorSpecification.ConnRetryInitialDelay;
import org.opendds.modeling.sdk.model.GeneratorSpecification.EnableNagleAlgorithm;
import org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage;
import org.opendds.modeling.sdk.model.GeneratorSpecification.LocalAddressString;
import org.opendds.modeling.sdk.model.GeneratorSpecification.MaxOutputPausePeriod;
import org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveReconnectDuration;
import org.opendds.modeling.sdk.model.GeneratorSpecification.TcpTransport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tcp Transport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TcpTransportImpl#getLocal_address_str <em>Local address str</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TcpTransportImpl#getEnable_nagle_algorithm <em>Enable nagle algorithm</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TcpTransportImpl#getConn_retry_initial_delay <em>Conn retry initial delay</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TcpTransportImpl#getConn_retry_backoff_multiplier <em>Conn retry backoff multiplier</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TcpTransportImpl#getConn_retry_attempts <em>Conn retry attempts</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TcpTransportImpl#getMax_output_pause_period <em>Max output pause period</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TcpTransportImpl#getPassive_reconnect_duration <em>Passive reconnect duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TcpTransportImpl extends TransportInstImpl implements TcpTransport {
	/**
	 * The cached value of the '{@link #getLocal_address_str() <em>Local address str</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal_address_str()
	 * @generated
	 * @ordered
	 */
	protected LocalAddressString local_address_str;

	/**
	 * The cached value of the '{@link #getEnable_nagle_algorithm() <em>Enable nagle algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable_nagle_algorithm()
	 * @generated
	 * @ordered
	 */
	protected EnableNagleAlgorithm enable_nagle_algorithm;

	/**
	 * The cached value of the '{@link #getConn_retry_initial_delay() <em>Conn retry initial delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConn_retry_initial_delay()
	 * @generated
	 * @ordered
	 */
	protected ConnRetryInitialDelay conn_retry_initial_delay;

	/**
	 * The cached value of the '{@link #getConn_retry_backoff_multiplier() <em>Conn retry backoff multiplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConn_retry_backoff_multiplier()
	 * @generated
	 * @ordered
	 */
	protected ConnRetryBackoffMultiplier conn_retry_backoff_multiplier;

	/**
	 * The cached value of the '{@link #getConn_retry_attempts() <em>Conn retry attempts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConn_retry_attempts()
	 * @generated
	 * @ordered
	 */
	protected ConnRetryAttempts conn_retry_attempts;

	/**
	 * The cached value of the '{@link #getMax_output_pause_period() <em>Max output pause period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_output_pause_period()
	 * @generated
	 * @ordered
	 */
	protected MaxOutputPausePeriod max_output_pause_period;

	/**
	 * The cached value of the '{@link #getPassive_reconnect_duration() <em>Passive reconnect duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassive_reconnect_duration()
	 * @generated
	 * @ordered
	 */
	protected PassiveReconnectDuration passive_reconnect_duration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcpTransportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.TCP_TRANSPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAddressString getLocal_address_str() {
		return local_address_str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocal_address_str(LocalAddressString newLocal_address_str,
			NotificationChain msgs) {
		LocalAddressString oldLocal_address_str = local_address_str;
		local_address_str = newLocal_address_str;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TCP_TRANSPORT__LOCAL_ADDRESS_STR, oldLocal_address_str, newLocal_address_str);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal_address_str(LocalAddressString newLocal_address_str) {
		if (newLocal_address_str != local_address_str) {
			NotificationChain msgs = null;
			if (local_address_str != null)
				msgs = ((InternalEObject) local_address_str).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TCP_TRANSPORT__LOCAL_ADDRESS_STR, null, msgs);
			if (newLocal_address_str != null)
				msgs = ((InternalEObject) newLocal_address_str).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TCP_TRANSPORT__LOCAL_ADDRESS_STR, null, msgs);
			msgs = basicSetLocal_address_str(newLocal_address_str, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TCP_TRANSPORT__LOCAL_ADDRESS_STR,
					newLocal_address_str, newLocal_address_str));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableNagleAlgorithm getEnable_nagle_algorithm() {
		return enable_nagle_algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnable_nagle_algorithm(EnableNagleAlgorithm newEnable_nagle_algorithm,
			NotificationChain msgs) {
		EnableNagleAlgorithm oldEnable_nagle_algorithm = enable_nagle_algorithm;
		enable_nagle_algorithm = newEnable_nagle_algorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TCP_TRANSPORT__ENABLE_NAGLE_ALGORITHM, oldEnable_nagle_algorithm,
					newEnable_nagle_algorithm);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable_nagle_algorithm(EnableNagleAlgorithm newEnable_nagle_algorithm) {
		if (newEnable_nagle_algorithm != enable_nagle_algorithm) {
			NotificationChain msgs = null;
			if (enable_nagle_algorithm != null)
				msgs = ((InternalEObject) enable_nagle_algorithm).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TCP_TRANSPORT__ENABLE_NAGLE_ALGORITHM, null, msgs);
			if (newEnable_nagle_algorithm != null)
				msgs = ((InternalEObject) newEnable_nagle_algorithm).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TCP_TRANSPORT__ENABLE_NAGLE_ALGORITHM, null, msgs);
			msgs = basicSetEnable_nagle_algorithm(newEnable_nagle_algorithm, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TCP_TRANSPORT__ENABLE_NAGLE_ALGORITHM, newEnable_nagle_algorithm,
					newEnable_nagle_algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnRetryInitialDelay getConn_retry_initial_delay() {
		return conn_retry_initial_delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConn_retry_initial_delay(ConnRetryInitialDelay newConn_retry_initial_delay,
			NotificationChain msgs) {
		ConnRetryInitialDelay oldConn_retry_initial_delay = conn_retry_initial_delay;
		conn_retry_initial_delay = newConn_retry_initial_delay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_INITIAL_DELAY, oldConn_retry_initial_delay,
					newConn_retry_initial_delay);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConn_retry_initial_delay(ConnRetryInitialDelay newConn_retry_initial_delay) {
		if (newConn_retry_initial_delay != conn_retry_initial_delay) {
			NotificationChain msgs = null;
			if (conn_retry_initial_delay != null)
				msgs = ((InternalEObject) conn_retry_initial_delay).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_INITIAL_DELAY, null, msgs);
			if (newConn_retry_initial_delay != null)
				msgs = ((InternalEObject) newConn_retry_initial_delay).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_INITIAL_DELAY, null, msgs);
			msgs = basicSetConn_retry_initial_delay(newConn_retry_initial_delay, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_INITIAL_DELAY, newConn_retry_initial_delay,
					newConn_retry_initial_delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnRetryBackoffMultiplier getConn_retry_backoff_multiplier() {
		return conn_retry_backoff_multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConn_retry_backoff_multiplier(
			ConnRetryBackoffMultiplier newConn_retry_backoff_multiplier, NotificationChain msgs) {
		ConnRetryBackoffMultiplier oldConn_retry_backoff_multiplier = conn_retry_backoff_multiplier;
		conn_retry_backoff_multiplier = newConn_retry_backoff_multiplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_BACKOFF_MULTIPLIER, oldConn_retry_backoff_multiplier,
					newConn_retry_backoff_multiplier);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConn_retry_backoff_multiplier(ConnRetryBackoffMultiplier newConn_retry_backoff_multiplier) {
		if (newConn_retry_backoff_multiplier != conn_retry_backoff_multiplier) {
			NotificationChain msgs = null;
			if (conn_retry_backoff_multiplier != null)
				msgs = ((InternalEObject) conn_retry_backoff_multiplier).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_BACKOFF_MULTIPLIER, null,
						msgs);
			if (newConn_retry_backoff_multiplier != null)
				msgs = ((InternalEObject) newConn_retry_backoff_multiplier).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_BACKOFF_MULTIPLIER, null,
						msgs);
			msgs = basicSetConn_retry_backoff_multiplier(newConn_retry_backoff_multiplier, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_BACKOFF_MULTIPLIER, newConn_retry_backoff_multiplier,
					newConn_retry_backoff_multiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnRetryAttempts getConn_retry_attempts() {
		return conn_retry_attempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConn_retry_attempts(ConnRetryAttempts newConn_retry_attempts,
			NotificationChain msgs) {
		ConnRetryAttempts oldConn_retry_attempts = conn_retry_attempts;
		conn_retry_attempts = newConn_retry_attempts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_ATTEMPTS, oldConn_retry_attempts,
					newConn_retry_attempts);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConn_retry_attempts(ConnRetryAttempts newConn_retry_attempts) {
		if (newConn_retry_attempts != conn_retry_attempts) {
			NotificationChain msgs = null;
			if (conn_retry_attempts != null)
				msgs = ((InternalEObject) conn_retry_attempts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_ATTEMPTS, null, msgs);
			if (newConn_retry_attempts != null)
				msgs = ((InternalEObject) newConn_retry_attempts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_ATTEMPTS, null, msgs);
			msgs = basicSetConn_retry_attempts(newConn_retry_attempts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_ATTEMPTS,
					newConn_retry_attempts, newConn_retry_attempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxOutputPausePeriod getMax_output_pause_period() {
		return max_output_pause_period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax_output_pause_period(MaxOutputPausePeriod newMax_output_pause_period,
			NotificationChain msgs) {
		MaxOutputPausePeriod oldMax_output_pause_period = max_output_pause_period;
		max_output_pause_period = newMax_output_pause_period;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TCP_TRANSPORT__MAX_OUTPUT_PAUSE_PERIOD, oldMax_output_pause_period,
					newMax_output_pause_period);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_output_pause_period(MaxOutputPausePeriod newMax_output_pause_period) {
		if (newMax_output_pause_period != max_output_pause_period) {
			NotificationChain msgs = null;
			if (max_output_pause_period != null)
				msgs = ((InternalEObject) max_output_pause_period).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TCP_TRANSPORT__MAX_OUTPUT_PAUSE_PERIOD, null, msgs);
			if (newMax_output_pause_period != null)
				msgs = ((InternalEObject) newMax_output_pause_period).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TCP_TRANSPORT__MAX_OUTPUT_PAUSE_PERIOD, null, msgs);
			msgs = basicSetMax_output_pause_period(newMax_output_pause_period, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TCP_TRANSPORT__MAX_OUTPUT_PAUSE_PERIOD, newMax_output_pause_period,
					newMax_output_pause_period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveReconnectDuration getPassive_reconnect_duration() {
		return passive_reconnect_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassive_reconnect_duration(PassiveReconnectDuration newPassive_reconnect_duration,
			NotificationChain msgs) {
		PassiveReconnectDuration oldPassive_reconnect_duration = passive_reconnect_duration;
		passive_reconnect_duration = newPassive_reconnect_duration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TCP_TRANSPORT__PASSIVE_RECONNECT_DURATION, oldPassive_reconnect_duration,
					newPassive_reconnect_duration);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassive_reconnect_duration(PassiveReconnectDuration newPassive_reconnect_duration) {
		if (newPassive_reconnect_duration != passive_reconnect_duration) {
			NotificationChain msgs = null;
			if (passive_reconnect_duration != null)
				msgs = ((InternalEObject) passive_reconnect_duration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TCP_TRANSPORT__PASSIVE_RECONNECT_DURATION, null,
						msgs);
			if (newPassive_reconnect_duration != null)
				msgs = ((InternalEObject) newPassive_reconnect_duration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TCP_TRANSPORT__PASSIVE_RECONNECT_DURATION, null,
						msgs);
			msgs = basicSetPassive_reconnect_duration(newPassive_reconnect_duration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TCP_TRANSPORT__PASSIVE_RECONNECT_DURATION, newPassive_reconnect_duration,
					newPassive_reconnect_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.TCP_TRANSPORT__LOCAL_ADDRESS_STR:
			return basicSetLocal_address_str(null, msgs);
		case GeneratorPackage.TCP_TRANSPORT__ENABLE_NAGLE_ALGORITHM:
			return basicSetEnable_nagle_algorithm(null, msgs);
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_INITIAL_DELAY:
			return basicSetConn_retry_initial_delay(null, msgs);
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_BACKOFF_MULTIPLIER:
			return basicSetConn_retry_backoff_multiplier(null, msgs);
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_ATTEMPTS:
			return basicSetConn_retry_attempts(null, msgs);
		case GeneratorPackage.TCP_TRANSPORT__MAX_OUTPUT_PAUSE_PERIOD:
			return basicSetMax_output_pause_period(null, msgs);
		case GeneratorPackage.TCP_TRANSPORT__PASSIVE_RECONNECT_DURATION:
			return basicSetPassive_reconnect_duration(null, msgs);
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
		case GeneratorPackage.TCP_TRANSPORT__LOCAL_ADDRESS_STR:
			return getLocal_address_str();
		case GeneratorPackage.TCP_TRANSPORT__ENABLE_NAGLE_ALGORITHM:
			return getEnable_nagle_algorithm();
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_INITIAL_DELAY:
			return getConn_retry_initial_delay();
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_BACKOFF_MULTIPLIER:
			return getConn_retry_backoff_multiplier();
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_ATTEMPTS:
			return getConn_retry_attempts();
		case GeneratorPackage.TCP_TRANSPORT__MAX_OUTPUT_PAUSE_PERIOD:
			return getMax_output_pause_period();
		case GeneratorPackage.TCP_TRANSPORT__PASSIVE_RECONNECT_DURATION:
			return getPassive_reconnect_duration();
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
		case GeneratorPackage.TCP_TRANSPORT__LOCAL_ADDRESS_STR:
			setLocal_address_str((LocalAddressString) newValue);
			return;
		case GeneratorPackage.TCP_TRANSPORT__ENABLE_NAGLE_ALGORITHM:
			setEnable_nagle_algorithm((EnableNagleAlgorithm) newValue);
			return;
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_INITIAL_DELAY:
			setConn_retry_initial_delay((ConnRetryInitialDelay) newValue);
			return;
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_BACKOFF_MULTIPLIER:
			setConn_retry_backoff_multiplier((ConnRetryBackoffMultiplier) newValue);
			return;
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_ATTEMPTS:
			setConn_retry_attempts((ConnRetryAttempts) newValue);
			return;
		case GeneratorPackage.TCP_TRANSPORT__MAX_OUTPUT_PAUSE_PERIOD:
			setMax_output_pause_period((MaxOutputPausePeriod) newValue);
			return;
		case GeneratorPackage.TCP_TRANSPORT__PASSIVE_RECONNECT_DURATION:
			setPassive_reconnect_duration((PassiveReconnectDuration) newValue);
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
		case GeneratorPackage.TCP_TRANSPORT__LOCAL_ADDRESS_STR:
			setLocal_address_str((LocalAddressString) null);
			return;
		case GeneratorPackage.TCP_TRANSPORT__ENABLE_NAGLE_ALGORITHM:
			setEnable_nagle_algorithm((EnableNagleAlgorithm) null);
			return;
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_INITIAL_DELAY:
			setConn_retry_initial_delay((ConnRetryInitialDelay) null);
			return;
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_BACKOFF_MULTIPLIER:
			setConn_retry_backoff_multiplier((ConnRetryBackoffMultiplier) null);
			return;
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_ATTEMPTS:
			setConn_retry_attempts((ConnRetryAttempts) null);
			return;
		case GeneratorPackage.TCP_TRANSPORT__MAX_OUTPUT_PAUSE_PERIOD:
			setMax_output_pause_period((MaxOutputPausePeriod) null);
			return;
		case GeneratorPackage.TCP_TRANSPORT__PASSIVE_RECONNECT_DURATION:
			setPassive_reconnect_duration((PassiveReconnectDuration) null);
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
		case GeneratorPackage.TCP_TRANSPORT__LOCAL_ADDRESS_STR:
			return local_address_str != null;
		case GeneratorPackage.TCP_TRANSPORT__ENABLE_NAGLE_ALGORITHM:
			return enable_nagle_algorithm != null;
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_INITIAL_DELAY:
			return conn_retry_initial_delay != null;
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_BACKOFF_MULTIPLIER:
			return conn_retry_backoff_multiplier != null;
		case GeneratorPackage.TCP_TRANSPORT__CONN_RETRY_ATTEMPTS:
			return conn_retry_attempts != null;
		case GeneratorPackage.TCP_TRANSPORT__MAX_OUTPUT_PAUSE_PERIOD:
			return max_output_pause_period != null;
		case GeneratorPackage.TCP_TRANSPORT__PASSIVE_RECONNECT_DURATION:
			return passive_reconnect_duration != null;
		}
		return super.eIsSet(featureID);
	}

} //TcpTransportImpl
