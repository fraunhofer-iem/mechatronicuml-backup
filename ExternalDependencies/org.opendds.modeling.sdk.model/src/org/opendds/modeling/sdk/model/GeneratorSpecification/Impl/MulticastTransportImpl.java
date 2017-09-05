/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification.Impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.opendds.modeling.sdk.model.GeneratorSpecification.DefaultToIPv6;
import org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage;
import org.opendds.modeling.sdk.model.GeneratorSpecification.GroupAddress;
import org.opendds.modeling.sdk.model.GeneratorSpecification.MulticastTransport;
import org.opendds.modeling.sdk.model.GeneratorSpecification.NakDepth;
import org.opendds.modeling.sdk.model.GeneratorSpecification.NakInterval;
import org.opendds.modeling.sdk.model.GeneratorSpecification.NakMax;
import org.opendds.modeling.sdk.model.GeneratorSpecification.NakTimeout;
import org.opendds.modeling.sdk.model.GeneratorSpecification.PortOffset;
import org.opendds.modeling.sdk.model.GeneratorSpecification.RcvBufferSIze;
import org.opendds.modeling.sdk.model.GeneratorSpecification.Reliable;
import org.opendds.modeling.sdk.model.GeneratorSpecification.SynBackoff;
import org.opendds.modeling.sdk.model.GeneratorSpecification.SynInterval;
import org.opendds.modeling.sdk.model.GeneratorSpecification.SynTimeout;
import org.opendds.modeling.sdk.model.GeneratorSpecification.TTL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multicast Transport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl#getDefault_to_ipv6 <em>Default to ipv6</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl#getPort_offset <em>Port offset</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl#getGroup_address <em>Group address</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl#getReliable <em>Reliable</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl#getSyn_backoff <em>Syn backoff</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl#getSyn_interval <em>Syn interval</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl#getSyn_timeout <em>Syn timeout</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl#getNak_depth <em>Nak depth</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl#getNak_interval <em>Nak interval</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl#getNak_max <em>Nak max</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl#getNak_timeout <em>Nak timeout</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl#getTtl <em>Ttl</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.MulticastTransportImpl#getRcv_buffer_size <em>Rcv buffer size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MulticastTransportImpl extends TransportInstImpl implements MulticastTransport {
	/**
	 * The cached value of the '{@link #getDefault_to_ipv6() <em>Default to ipv6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_to_ipv6()
	 * @generated
	 * @ordered
	 */
	protected DefaultToIPv6 default_to_ipv6;

	/**
	 * The cached value of the '{@link #getPort_offset() <em>Port offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_offset()
	 * @generated
	 * @ordered
	 */
	protected PortOffset port_offset;

	/**
	 * The cached value of the '{@link #getGroup_address() <em>Group address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup_address()
	 * @generated
	 * @ordered
	 */
	protected GroupAddress group_address;

	/**
	 * The cached value of the '{@link #getReliable() <em>Reliable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliable()
	 * @generated
	 * @ordered
	 */
	protected Reliable reliable;

	/**
	 * The cached value of the '{@link #getSyn_backoff() <em>Syn backoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyn_backoff()
	 * @generated
	 * @ordered
	 */
	protected SynBackoff syn_backoff;

	/**
	 * The cached value of the '{@link #getSyn_interval() <em>Syn interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyn_interval()
	 * @generated
	 * @ordered
	 */
	protected SynInterval syn_interval;

	/**
	 * The cached value of the '{@link #getSyn_timeout() <em>Syn timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyn_timeout()
	 * @generated
	 * @ordered
	 */
	protected SynTimeout syn_timeout;

	/**
	 * The cached value of the '{@link #getNak_depth() <em>Nak depth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNak_depth()
	 * @generated
	 * @ordered
	 */
	protected NakDepth nak_depth;

	/**
	 * The cached value of the '{@link #getNak_interval() <em>Nak interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNak_interval()
	 * @generated
	 * @ordered
	 */
	protected NakInterval nak_interval;

	/**
	 * The cached value of the '{@link #getNak_max() <em>Nak max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNak_max()
	 * @generated
	 * @ordered
	 */
	protected NakMax nak_max;

	/**
	 * The cached value of the '{@link #getNak_timeout() <em>Nak timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNak_timeout()
	 * @generated
	 * @ordered
	 */
	protected NakTimeout nak_timeout;

	/**
	 * The cached value of the '{@link #getTtl() <em>Ttl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTtl()
	 * @generated
	 * @ordered
	 */
	protected TTL ttl;

	/**
	 * The cached value of the '{@link #getRcv_buffer_size() <em>Rcv buffer size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRcv_buffer_size()
	 * @generated
	 * @ordered
	 */
	protected RcvBufferSIze rcv_buffer_size;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MulticastTransportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MULTICAST_TRANSPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultToIPv6 getDefault_to_ipv6() {
		return default_to_ipv6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault_to_ipv6(DefaultToIPv6 newDefault_to_ipv6, NotificationChain msgs) {
		DefaultToIPv6 oldDefault_to_ipv6 = default_to_ipv6;
		default_to_ipv6 = newDefault_to_ipv6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MULTICAST_TRANSPORT__DEFAULT_TO_IPV6, oldDefault_to_ipv6, newDefault_to_ipv6);
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
	public void setDefault_to_ipv6(DefaultToIPv6 newDefault_to_ipv6) {
		if (newDefault_to_ipv6 != default_to_ipv6) {
			NotificationChain msgs = null;
			if (default_to_ipv6 != null)
				msgs = ((InternalEObject) default_to_ipv6).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__DEFAULT_TO_IPV6, null, msgs);
			if (newDefault_to_ipv6 != null)
				msgs = ((InternalEObject) newDefault_to_ipv6).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__DEFAULT_TO_IPV6, null, msgs);
			msgs = basicSetDefault_to_ipv6(newDefault_to_ipv6, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTICAST_TRANSPORT__DEFAULT_TO_IPV6,
					newDefault_to_ipv6, newDefault_to_ipv6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortOffset getPort_offset() {
		return port_offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort_offset(PortOffset newPort_offset, NotificationChain msgs) {
		PortOffset oldPort_offset = port_offset;
		port_offset = newPort_offset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MULTICAST_TRANSPORT__PORT_OFFSET, oldPort_offset, newPort_offset);
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
	public void setPort_offset(PortOffset newPort_offset) {
		if (newPort_offset != port_offset) {
			NotificationChain msgs = null;
			if (port_offset != null)
				msgs = ((InternalEObject) port_offset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__PORT_OFFSET, null, msgs);
			if (newPort_offset != null)
				msgs = ((InternalEObject) newPort_offset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__PORT_OFFSET, null, msgs);
			msgs = basicSetPort_offset(newPort_offset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTICAST_TRANSPORT__PORT_OFFSET,
					newPort_offset, newPort_offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupAddress getGroup_address() {
		return group_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup_address(GroupAddress newGroup_address, NotificationChain msgs) {
		GroupAddress oldGroup_address = group_address;
		group_address = newGroup_address;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MULTICAST_TRANSPORT__GROUP_ADDRESS, oldGroup_address, newGroup_address);
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
	public void setGroup_address(GroupAddress newGroup_address) {
		if (newGroup_address != group_address) {
			NotificationChain msgs = null;
			if (group_address != null)
				msgs = ((InternalEObject) group_address).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__GROUP_ADDRESS, null, msgs);
			if (newGroup_address != null)
				msgs = ((InternalEObject) newGroup_address).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__GROUP_ADDRESS, null, msgs);
			msgs = basicSetGroup_address(newGroup_address, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTICAST_TRANSPORT__GROUP_ADDRESS,
					newGroup_address, newGroup_address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reliable getReliable() {
		return reliable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReliable(Reliable newReliable, NotificationChain msgs) {
		Reliable oldReliable = reliable;
		reliable = newReliable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MULTICAST_TRANSPORT__RELIABLE, oldReliable, newReliable);
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
	public void setReliable(Reliable newReliable) {
		if (newReliable != reliable) {
			NotificationChain msgs = null;
			if (reliable != null)
				msgs = ((InternalEObject) reliable).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__RELIABLE, null, msgs);
			if (newReliable != null)
				msgs = ((InternalEObject) newReliable).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__RELIABLE, null, msgs);
			msgs = basicSetReliable(newReliable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTICAST_TRANSPORT__RELIABLE,
					newReliable, newReliable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynBackoff getSyn_backoff() {
		return syn_backoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyn_backoff(SynBackoff newSyn_backoff, NotificationChain msgs) {
		SynBackoff oldSyn_backoff = syn_backoff;
		syn_backoff = newSyn_backoff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MULTICAST_TRANSPORT__SYN_BACKOFF, oldSyn_backoff, newSyn_backoff);
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
	public void setSyn_backoff(SynBackoff newSyn_backoff) {
		if (newSyn_backoff != syn_backoff) {
			NotificationChain msgs = null;
			if (syn_backoff != null)
				msgs = ((InternalEObject) syn_backoff).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__SYN_BACKOFF, null, msgs);
			if (newSyn_backoff != null)
				msgs = ((InternalEObject) newSyn_backoff).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__SYN_BACKOFF, null, msgs);
			msgs = basicSetSyn_backoff(newSyn_backoff, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTICAST_TRANSPORT__SYN_BACKOFF,
					newSyn_backoff, newSyn_backoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynInterval getSyn_interval() {
		return syn_interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyn_interval(SynInterval newSyn_interval, NotificationChain msgs) {
		SynInterval oldSyn_interval = syn_interval;
		syn_interval = newSyn_interval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MULTICAST_TRANSPORT__SYN_INTERVAL, oldSyn_interval, newSyn_interval);
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
	public void setSyn_interval(SynInterval newSyn_interval) {
		if (newSyn_interval != syn_interval) {
			NotificationChain msgs = null;
			if (syn_interval != null)
				msgs = ((InternalEObject) syn_interval).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__SYN_INTERVAL, null, msgs);
			if (newSyn_interval != null)
				msgs = ((InternalEObject) newSyn_interval).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__SYN_INTERVAL, null, msgs);
			msgs = basicSetSyn_interval(newSyn_interval, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTICAST_TRANSPORT__SYN_INTERVAL,
					newSyn_interval, newSyn_interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynTimeout getSyn_timeout() {
		return syn_timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyn_timeout(SynTimeout newSyn_timeout, NotificationChain msgs) {
		SynTimeout oldSyn_timeout = syn_timeout;
		syn_timeout = newSyn_timeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MULTICAST_TRANSPORT__SYN_TIMEOUT, oldSyn_timeout, newSyn_timeout);
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
	public void setSyn_timeout(SynTimeout newSyn_timeout) {
		if (newSyn_timeout != syn_timeout) {
			NotificationChain msgs = null;
			if (syn_timeout != null)
				msgs = ((InternalEObject) syn_timeout).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__SYN_TIMEOUT, null, msgs);
			if (newSyn_timeout != null)
				msgs = ((InternalEObject) newSyn_timeout).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__SYN_TIMEOUT, null, msgs);
			msgs = basicSetSyn_timeout(newSyn_timeout, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTICAST_TRANSPORT__SYN_TIMEOUT,
					newSyn_timeout, newSyn_timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NakDepth getNak_depth() {
		return nak_depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNak_depth(NakDepth newNak_depth, NotificationChain msgs) {
		NakDepth oldNak_depth = nak_depth;
		nak_depth = newNak_depth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MULTICAST_TRANSPORT__NAK_DEPTH, oldNak_depth, newNak_depth);
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
	public void setNak_depth(NakDepth newNak_depth) {
		if (newNak_depth != nak_depth) {
			NotificationChain msgs = null;
			if (nak_depth != null)
				msgs = ((InternalEObject) nak_depth).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__NAK_DEPTH, null, msgs);
			if (newNak_depth != null)
				msgs = ((InternalEObject) newNak_depth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__NAK_DEPTH, null, msgs);
			msgs = basicSetNak_depth(newNak_depth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTICAST_TRANSPORT__NAK_DEPTH,
					newNak_depth, newNak_depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NakInterval getNak_interval() {
		return nak_interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNak_interval(NakInterval newNak_interval, NotificationChain msgs) {
		NakInterval oldNak_interval = nak_interval;
		nak_interval = newNak_interval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MULTICAST_TRANSPORT__NAK_INTERVAL, oldNak_interval, newNak_interval);
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
	public void setNak_interval(NakInterval newNak_interval) {
		if (newNak_interval != nak_interval) {
			NotificationChain msgs = null;
			if (nak_interval != null)
				msgs = ((InternalEObject) nak_interval).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__NAK_INTERVAL, null, msgs);
			if (newNak_interval != null)
				msgs = ((InternalEObject) newNak_interval).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__NAK_INTERVAL, null, msgs);
			msgs = basicSetNak_interval(newNak_interval, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTICAST_TRANSPORT__NAK_INTERVAL,
					newNak_interval, newNak_interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NakMax getNak_max() {
		if (nak_max != null && nak_max.eIsProxy()) {
			InternalEObject oldNak_max = (InternalEObject) nak_max;
			nak_max = (NakMax) eResolveProxy(oldNak_max);
			if (nak_max != oldNak_max) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.MULTICAST_TRANSPORT__NAK_MAX, oldNak_max, nak_max));
			}
		}
		return nak_max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NakMax basicGetNak_max() {
		return nak_max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNak_max(NakMax newNak_max) {
		NakMax oldNak_max = nak_max;
		nak_max = newNak_max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTICAST_TRANSPORT__NAK_MAX,
					oldNak_max, nak_max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NakTimeout getNak_timeout() {
		return nak_timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNak_timeout(NakTimeout newNak_timeout, NotificationChain msgs) {
		NakTimeout oldNak_timeout = nak_timeout;
		nak_timeout = newNak_timeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MULTICAST_TRANSPORT__NAK_TIMEOUT, oldNak_timeout, newNak_timeout);
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
	public void setNak_timeout(NakTimeout newNak_timeout) {
		if (newNak_timeout != nak_timeout) {
			NotificationChain msgs = null;
			if (nak_timeout != null)
				msgs = ((InternalEObject) nak_timeout).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__NAK_TIMEOUT, null, msgs);
			if (newNak_timeout != null)
				msgs = ((InternalEObject) newNak_timeout).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__NAK_TIMEOUT, null, msgs);
			msgs = basicSetNak_timeout(newNak_timeout, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTICAST_TRANSPORT__NAK_TIMEOUT,
					newNak_timeout, newNak_timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTL getTtl() {
		return ttl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTtl(TTL newTtl, NotificationChain msgs) {
		TTL oldTtl = ttl;
		ttl = newTtl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MULTICAST_TRANSPORT__TTL, oldTtl, newTtl);
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
	public void setTtl(TTL newTtl) {
		if (newTtl != ttl) {
			NotificationChain msgs = null;
			if (ttl != null)
				msgs = ((InternalEObject) ttl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__TTL, null, msgs);
			if (newTtl != null)
				msgs = ((InternalEObject) newTtl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__TTL, null, msgs);
			msgs = basicSetTtl(newTtl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTICAST_TRANSPORT__TTL, newTtl,
					newTtl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RcvBufferSIze getRcv_buffer_size() {
		return rcv_buffer_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRcv_buffer_size(RcvBufferSIze newRcv_buffer_size, NotificationChain msgs) {
		RcvBufferSIze oldRcv_buffer_size = rcv_buffer_size;
		rcv_buffer_size = newRcv_buffer_size;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.MULTICAST_TRANSPORT__RCV_BUFFER_SIZE, oldRcv_buffer_size, newRcv_buffer_size);
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
	public void setRcv_buffer_size(RcvBufferSIze newRcv_buffer_size) {
		if (newRcv_buffer_size != rcv_buffer_size) {
			NotificationChain msgs = null;
			if (rcv_buffer_size != null)
				msgs = ((InternalEObject) rcv_buffer_size).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__RCV_BUFFER_SIZE, null, msgs);
			if (newRcv_buffer_size != null)
				msgs = ((InternalEObject) newRcv_buffer_size).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.MULTICAST_TRANSPORT__RCV_BUFFER_SIZE, null, msgs);
			msgs = basicSetRcv_buffer_size(newRcv_buffer_size, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MULTICAST_TRANSPORT__RCV_BUFFER_SIZE,
					newRcv_buffer_size, newRcv_buffer_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.MULTICAST_TRANSPORT__DEFAULT_TO_IPV6:
			return basicSetDefault_to_ipv6(null, msgs);
		case GeneratorPackage.MULTICAST_TRANSPORT__PORT_OFFSET:
			return basicSetPort_offset(null, msgs);
		case GeneratorPackage.MULTICAST_TRANSPORT__GROUP_ADDRESS:
			return basicSetGroup_address(null, msgs);
		case GeneratorPackage.MULTICAST_TRANSPORT__RELIABLE:
			return basicSetReliable(null, msgs);
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_BACKOFF:
			return basicSetSyn_backoff(null, msgs);
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_INTERVAL:
			return basicSetSyn_interval(null, msgs);
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_TIMEOUT:
			return basicSetSyn_timeout(null, msgs);
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_DEPTH:
			return basicSetNak_depth(null, msgs);
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_INTERVAL:
			return basicSetNak_interval(null, msgs);
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_TIMEOUT:
			return basicSetNak_timeout(null, msgs);
		case GeneratorPackage.MULTICAST_TRANSPORT__TTL:
			return basicSetTtl(null, msgs);
		case GeneratorPackage.MULTICAST_TRANSPORT__RCV_BUFFER_SIZE:
			return basicSetRcv_buffer_size(null, msgs);
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
		case GeneratorPackage.MULTICAST_TRANSPORT__DEFAULT_TO_IPV6:
			return getDefault_to_ipv6();
		case GeneratorPackage.MULTICAST_TRANSPORT__PORT_OFFSET:
			return getPort_offset();
		case GeneratorPackage.MULTICAST_TRANSPORT__GROUP_ADDRESS:
			return getGroup_address();
		case GeneratorPackage.MULTICAST_TRANSPORT__RELIABLE:
			return getReliable();
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_BACKOFF:
			return getSyn_backoff();
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_INTERVAL:
			return getSyn_interval();
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_TIMEOUT:
			return getSyn_timeout();
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_DEPTH:
			return getNak_depth();
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_INTERVAL:
			return getNak_interval();
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_MAX:
			if (resolve)
				return getNak_max();
			return basicGetNak_max();
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_TIMEOUT:
			return getNak_timeout();
		case GeneratorPackage.MULTICAST_TRANSPORT__TTL:
			return getTtl();
		case GeneratorPackage.MULTICAST_TRANSPORT__RCV_BUFFER_SIZE:
			return getRcv_buffer_size();
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
		case GeneratorPackage.MULTICAST_TRANSPORT__DEFAULT_TO_IPV6:
			setDefault_to_ipv6((DefaultToIPv6) newValue);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__PORT_OFFSET:
			setPort_offset((PortOffset) newValue);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__GROUP_ADDRESS:
			setGroup_address((GroupAddress) newValue);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__RELIABLE:
			setReliable((Reliable) newValue);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_BACKOFF:
			setSyn_backoff((SynBackoff) newValue);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_INTERVAL:
			setSyn_interval((SynInterval) newValue);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_TIMEOUT:
			setSyn_timeout((SynTimeout) newValue);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_DEPTH:
			setNak_depth((NakDepth) newValue);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_INTERVAL:
			setNak_interval((NakInterval) newValue);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_MAX:
			setNak_max((NakMax) newValue);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_TIMEOUT:
			setNak_timeout((NakTimeout) newValue);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__TTL:
			setTtl((TTL) newValue);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__RCV_BUFFER_SIZE:
			setRcv_buffer_size((RcvBufferSIze) newValue);
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
		case GeneratorPackage.MULTICAST_TRANSPORT__DEFAULT_TO_IPV6:
			setDefault_to_ipv6((DefaultToIPv6) null);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__PORT_OFFSET:
			setPort_offset((PortOffset) null);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__GROUP_ADDRESS:
			setGroup_address((GroupAddress) null);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__RELIABLE:
			setReliable((Reliable) null);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_BACKOFF:
			setSyn_backoff((SynBackoff) null);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_INTERVAL:
			setSyn_interval((SynInterval) null);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_TIMEOUT:
			setSyn_timeout((SynTimeout) null);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_DEPTH:
			setNak_depth((NakDepth) null);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_INTERVAL:
			setNak_interval((NakInterval) null);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_MAX:
			setNak_max((NakMax) null);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_TIMEOUT:
			setNak_timeout((NakTimeout) null);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__TTL:
			setTtl((TTL) null);
			return;
		case GeneratorPackage.MULTICAST_TRANSPORT__RCV_BUFFER_SIZE:
			setRcv_buffer_size((RcvBufferSIze) null);
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
		case GeneratorPackage.MULTICAST_TRANSPORT__DEFAULT_TO_IPV6:
			return default_to_ipv6 != null;
		case GeneratorPackage.MULTICAST_TRANSPORT__PORT_OFFSET:
			return port_offset != null;
		case GeneratorPackage.MULTICAST_TRANSPORT__GROUP_ADDRESS:
			return group_address != null;
		case GeneratorPackage.MULTICAST_TRANSPORT__RELIABLE:
			return reliable != null;
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_BACKOFF:
			return syn_backoff != null;
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_INTERVAL:
			return syn_interval != null;
		case GeneratorPackage.MULTICAST_TRANSPORT__SYN_TIMEOUT:
			return syn_timeout != null;
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_DEPTH:
			return nak_depth != null;
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_INTERVAL:
			return nak_interval != null;
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_MAX:
			return nak_max != null;
		case GeneratorPackage.MULTICAST_TRANSPORT__NAK_TIMEOUT:
			return nak_timeout != null;
		case GeneratorPackage.MULTICAST_TRANSPORT__TTL:
			return ttl != null;
		case GeneratorPackage.MULTICAST_TRANSPORT__RCV_BUFFER_SIZE:
			return rcv_buffer_size != null;
		}
		return super.eIsSet(featureID);
	}

} //MulticastTransportImpl
