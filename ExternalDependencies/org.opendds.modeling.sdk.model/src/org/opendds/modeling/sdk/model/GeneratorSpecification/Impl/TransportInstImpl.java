/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification.Impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkControlChunks;
import org.opendds.modeling.sdk.model.GeneratorSpecification.DatalinkReleaseDelay;
import org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage;
import org.opendds.modeling.sdk.model.GeneratorSpecification.MaxPacketSize;
import org.opendds.modeling.sdk.model.GeneratorSpecification.MaxSamplesPerPacket;
import org.opendds.modeling.sdk.model.GeneratorSpecification.OptimumPacketSize;
import org.opendds.modeling.sdk.model.GeneratorSpecification.QueueInitialPool;
import org.opendds.modeling.sdk.model.GeneratorSpecification.QueueMessagesPerPool;
import org.opendds.modeling.sdk.model.GeneratorSpecification.ThreadPerConnection;
import org.opendds.modeling.sdk.model.GeneratorSpecification.TransportInst;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Inst</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportInstImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportInstImpl#getQueue_messages_per_pool <em>Queue messages per pool</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportInstImpl#getQueue_initial_pools <em>Queue initial pools</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportInstImpl#getMax_packet_size <em>Max packet size</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportInstImpl#getMax_samples_per_packet <em>Max samples per packet</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportInstImpl#getOptimum_packet_size <em>Optimum packet size</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportInstImpl#getThread_per_connection <em>Thread per connection</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportInstImpl#getDatalink_release_delay <em>Datalink release delay</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportInstImpl#getDatalink_control_chunks <em>Datalink control chunks</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransportInstImpl extends EObjectImpl implements TransportInst {
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
	 * The cached value of the '{@link #getQueue_messages_per_pool() <em>Queue messages per pool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueue_messages_per_pool()
	 * @generated
	 * @ordered
	 */
	protected QueueMessagesPerPool queue_messages_per_pool;

	/**
	 * The cached value of the '{@link #getQueue_initial_pools() <em>Queue initial pools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueue_initial_pools()
	 * @generated
	 * @ordered
	 */
	protected QueueInitialPool queue_initial_pools;

	/**
	 * The cached value of the '{@link #getMax_packet_size() <em>Max packet size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_packet_size()
	 * @generated
	 * @ordered
	 */
	protected MaxPacketSize max_packet_size;

	/**
	 * The cached value of the '{@link #getMax_samples_per_packet() <em>Max samples per packet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_samples_per_packet()
	 * @generated
	 * @ordered
	 */
	protected MaxSamplesPerPacket max_samples_per_packet;

	/**
	 * The cached value of the '{@link #getOptimum_packet_size() <em>Optimum packet size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimum_packet_size()
	 * @generated
	 * @ordered
	 */
	protected OptimumPacketSize optimum_packet_size;

	/**
	 * The cached value of the '{@link #getThread_per_connection() <em>Thread per connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThread_per_connection()
	 * @generated
	 * @ordered
	 */
	protected ThreadPerConnection thread_per_connection;

	/**
	 * The cached value of the '{@link #getDatalink_release_delay() <em>Datalink release delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatalink_release_delay()
	 * @generated
	 * @ordered
	 */
	protected DatalinkReleaseDelay datalink_release_delay;

	/**
	 * The cached value of the '{@link #getDatalink_control_chunks() <em>Datalink control chunks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatalink_control_chunks()
	 * @generated
	 * @ordered
	 */
	protected DatalinkControlChunks datalink_control_chunks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportInstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.TRANSPORT_INST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TRANSPORT_INST__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueMessagesPerPool getQueue_messages_per_pool() {
		return queue_messages_per_pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueue_messages_per_pool(QueueMessagesPerPool newQueue_messages_per_pool,
			NotificationChain msgs) {
		QueueMessagesPerPool oldQueue_messages_per_pool = queue_messages_per_pool;
		queue_messages_per_pool = newQueue_messages_per_pool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL, oldQueue_messages_per_pool,
					newQueue_messages_per_pool);
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
	public void setQueue_messages_per_pool(QueueMessagesPerPool newQueue_messages_per_pool) {
		if (newQueue_messages_per_pool != queue_messages_per_pool) {
			NotificationChain msgs = null;
			if (queue_messages_per_pool != null)
				msgs = ((InternalEObject) queue_messages_per_pool).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL, null, msgs);
			if (newQueue_messages_per_pool != null)
				msgs = ((InternalEObject) newQueue_messages_per_pool).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL, null, msgs);
			msgs = basicSetQueue_messages_per_pool(newQueue_messages_per_pool, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL, newQueue_messages_per_pool,
					newQueue_messages_per_pool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueInitialPool getQueue_initial_pools() {
		return queue_initial_pools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueue_initial_pools(QueueInitialPool newQueue_initial_pools,
			NotificationChain msgs) {
		QueueInitialPool oldQueue_initial_pools = queue_initial_pools;
		queue_initial_pools = newQueue_initial_pools;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_INST__QUEUE_INITIAL_POOLS, oldQueue_initial_pools,
					newQueue_initial_pools);
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
	public void setQueue_initial_pools(QueueInitialPool newQueue_initial_pools) {
		if (newQueue_initial_pools != queue_initial_pools) {
			NotificationChain msgs = null;
			if (queue_initial_pools != null)
				msgs = ((InternalEObject) queue_initial_pools).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__QUEUE_INITIAL_POOLS, null, msgs);
			if (newQueue_initial_pools != null)
				msgs = ((InternalEObject) newQueue_initial_pools).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__QUEUE_INITIAL_POOLS, null, msgs);
			msgs = basicSetQueue_initial_pools(newQueue_initial_pools, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TRANSPORT_INST__QUEUE_INITIAL_POOLS,
					newQueue_initial_pools, newQueue_initial_pools));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxPacketSize getMax_packet_size() {
		return max_packet_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax_packet_size(MaxPacketSize newMax_packet_size, NotificationChain msgs) {
		MaxPacketSize oldMax_packet_size = max_packet_size;
		max_packet_size = newMax_packet_size;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_INST__MAX_PACKET_SIZE, oldMax_packet_size, newMax_packet_size);
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
	public void setMax_packet_size(MaxPacketSize newMax_packet_size) {
		if (newMax_packet_size != max_packet_size) {
			NotificationChain msgs = null;
			if (max_packet_size != null)
				msgs = ((InternalEObject) max_packet_size).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__MAX_PACKET_SIZE, null, msgs);
			if (newMax_packet_size != null)
				msgs = ((InternalEObject) newMax_packet_size).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__MAX_PACKET_SIZE, null, msgs);
			msgs = basicSetMax_packet_size(newMax_packet_size, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TRANSPORT_INST__MAX_PACKET_SIZE,
					newMax_packet_size, newMax_packet_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxSamplesPerPacket getMax_samples_per_packet() {
		return max_samples_per_packet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax_samples_per_packet(MaxSamplesPerPacket newMax_samples_per_packet,
			NotificationChain msgs) {
		MaxSamplesPerPacket oldMax_samples_per_packet = max_samples_per_packet;
		max_samples_per_packet = newMax_samples_per_packet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_INST__MAX_SAMPLES_PER_PACKET, oldMax_samples_per_packet,
					newMax_samples_per_packet);
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
	public void setMax_samples_per_packet(MaxSamplesPerPacket newMax_samples_per_packet) {
		if (newMax_samples_per_packet != max_samples_per_packet) {
			NotificationChain msgs = null;
			if (max_samples_per_packet != null)
				msgs = ((InternalEObject) max_samples_per_packet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__MAX_SAMPLES_PER_PACKET, null, msgs);
			if (newMax_samples_per_packet != null)
				msgs = ((InternalEObject) newMax_samples_per_packet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__MAX_SAMPLES_PER_PACKET, null, msgs);
			msgs = basicSetMax_samples_per_packet(newMax_samples_per_packet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_INST__MAX_SAMPLES_PER_PACKET, newMax_samples_per_packet,
					newMax_samples_per_packet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimumPacketSize getOptimum_packet_size() {
		return optimum_packet_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptimum_packet_size(OptimumPacketSize newOptimum_packet_size,
			NotificationChain msgs) {
		OptimumPacketSize oldOptimum_packet_size = optimum_packet_size;
		optimum_packet_size = newOptimum_packet_size;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_INST__OPTIMUM_PACKET_SIZE, oldOptimum_packet_size,
					newOptimum_packet_size);
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
	public void setOptimum_packet_size(OptimumPacketSize newOptimum_packet_size) {
		if (newOptimum_packet_size != optimum_packet_size) {
			NotificationChain msgs = null;
			if (optimum_packet_size != null)
				msgs = ((InternalEObject) optimum_packet_size).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__OPTIMUM_PACKET_SIZE, null, msgs);
			if (newOptimum_packet_size != null)
				msgs = ((InternalEObject) newOptimum_packet_size).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__OPTIMUM_PACKET_SIZE, null, msgs);
			msgs = basicSetOptimum_packet_size(newOptimum_packet_size, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TRANSPORT_INST__OPTIMUM_PACKET_SIZE,
					newOptimum_packet_size, newOptimum_packet_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadPerConnection getThread_per_connection() {
		return thread_per_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThread_per_connection(ThreadPerConnection newThread_per_connection,
			NotificationChain msgs) {
		ThreadPerConnection oldThread_per_connection = thread_per_connection;
		thread_per_connection = newThread_per_connection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_INST__THREAD_PER_CONNECTION, oldThread_per_connection,
					newThread_per_connection);
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
	public void setThread_per_connection(ThreadPerConnection newThread_per_connection) {
		if (newThread_per_connection != thread_per_connection) {
			NotificationChain msgs = null;
			if (thread_per_connection != null)
				msgs = ((InternalEObject) thread_per_connection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__THREAD_PER_CONNECTION, null, msgs);
			if (newThread_per_connection != null)
				msgs = ((InternalEObject) newThread_per_connection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__THREAD_PER_CONNECTION, null, msgs);
			msgs = basicSetThread_per_connection(newThread_per_connection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_INST__THREAD_PER_CONNECTION, newThread_per_connection,
					newThread_per_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatalinkReleaseDelay getDatalink_release_delay() {
		return datalink_release_delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatalink_release_delay(DatalinkReleaseDelay newDatalink_release_delay,
			NotificationChain msgs) {
		DatalinkReleaseDelay oldDatalink_release_delay = datalink_release_delay;
		datalink_release_delay = newDatalink_release_delay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_INST__DATALINK_RELEASE_DELAY, oldDatalink_release_delay,
					newDatalink_release_delay);
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
	public void setDatalink_release_delay(DatalinkReleaseDelay newDatalink_release_delay) {
		if (newDatalink_release_delay != datalink_release_delay) {
			NotificationChain msgs = null;
			if (datalink_release_delay != null)
				msgs = ((InternalEObject) datalink_release_delay).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__DATALINK_RELEASE_DELAY, null, msgs);
			if (newDatalink_release_delay != null)
				msgs = ((InternalEObject) newDatalink_release_delay).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__DATALINK_RELEASE_DELAY, null, msgs);
			msgs = basicSetDatalink_release_delay(newDatalink_release_delay, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_INST__DATALINK_RELEASE_DELAY, newDatalink_release_delay,
					newDatalink_release_delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatalinkControlChunks getDatalink_control_chunks() {
		return datalink_control_chunks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatalink_control_chunks(DatalinkControlChunks newDatalink_control_chunks,
			NotificationChain msgs) {
		DatalinkControlChunks oldDatalink_control_chunks = datalink_control_chunks;
		datalink_control_chunks = newDatalink_control_chunks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_INST__DATALINK_CONTROL_CHUNKS, oldDatalink_control_chunks,
					newDatalink_control_chunks);
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
	public void setDatalink_control_chunks(DatalinkControlChunks newDatalink_control_chunks) {
		if (newDatalink_control_chunks != datalink_control_chunks) {
			NotificationChain msgs = null;
			if (datalink_control_chunks != null)
				msgs = ((InternalEObject) datalink_control_chunks).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__DATALINK_CONTROL_CHUNKS, null, msgs);
			if (newDatalink_control_chunks != null)
				msgs = ((InternalEObject) newDatalink_control_chunks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_INST__DATALINK_CONTROL_CHUNKS, null, msgs);
			msgs = basicSetDatalink_control_chunks(newDatalink_control_chunks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_INST__DATALINK_CONTROL_CHUNKS, newDatalink_control_chunks,
					newDatalink_control_chunks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL:
			return basicSetQueue_messages_per_pool(null, msgs);
		case GeneratorPackage.TRANSPORT_INST__QUEUE_INITIAL_POOLS:
			return basicSetQueue_initial_pools(null, msgs);
		case GeneratorPackage.TRANSPORT_INST__MAX_PACKET_SIZE:
			return basicSetMax_packet_size(null, msgs);
		case GeneratorPackage.TRANSPORT_INST__MAX_SAMPLES_PER_PACKET:
			return basicSetMax_samples_per_packet(null, msgs);
		case GeneratorPackage.TRANSPORT_INST__OPTIMUM_PACKET_SIZE:
			return basicSetOptimum_packet_size(null, msgs);
		case GeneratorPackage.TRANSPORT_INST__THREAD_PER_CONNECTION:
			return basicSetThread_per_connection(null, msgs);
		case GeneratorPackage.TRANSPORT_INST__DATALINK_RELEASE_DELAY:
			return basicSetDatalink_release_delay(null, msgs);
		case GeneratorPackage.TRANSPORT_INST__DATALINK_CONTROL_CHUNKS:
			return basicSetDatalink_control_chunks(null, msgs);
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
		case GeneratorPackage.TRANSPORT_INST__NAME:
			return getName();
		case GeneratorPackage.TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL:
			return getQueue_messages_per_pool();
		case GeneratorPackage.TRANSPORT_INST__QUEUE_INITIAL_POOLS:
			return getQueue_initial_pools();
		case GeneratorPackage.TRANSPORT_INST__MAX_PACKET_SIZE:
			return getMax_packet_size();
		case GeneratorPackage.TRANSPORT_INST__MAX_SAMPLES_PER_PACKET:
			return getMax_samples_per_packet();
		case GeneratorPackage.TRANSPORT_INST__OPTIMUM_PACKET_SIZE:
			return getOptimum_packet_size();
		case GeneratorPackage.TRANSPORT_INST__THREAD_PER_CONNECTION:
			return getThread_per_connection();
		case GeneratorPackage.TRANSPORT_INST__DATALINK_RELEASE_DELAY:
			return getDatalink_release_delay();
		case GeneratorPackage.TRANSPORT_INST__DATALINK_CONTROL_CHUNKS:
			return getDatalink_control_chunks();
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
		case GeneratorPackage.TRANSPORT_INST__NAME:
			setName((String) newValue);
			return;
		case GeneratorPackage.TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL:
			setQueue_messages_per_pool((QueueMessagesPerPool) newValue);
			return;
		case GeneratorPackage.TRANSPORT_INST__QUEUE_INITIAL_POOLS:
			setQueue_initial_pools((QueueInitialPool) newValue);
			return;
		case GeneratorPackage.TRANSPORT_INST__MAX_PACKET_SIZE:
			setMax_packet_size((MaxPacketSize) newValue);
			return;
		case GeneratorPackage.TRANSPORT_INST__MAX_SAMPLES_PER_PACKET:
			setMax_samples_per_packet((MaxSamplesPerPacket) newValue);
			return;
		case GeneratorPackage.TRANSPORT_INST__OPTIMUM_PACKET_SIZE:
			setOptimum_packet_size((OptimumPacketSize) newValue);
			return;
		case GeneratorPackage.TRANSPORT_INST__THREAD_PER_CONNECTION:
			setThread_per_connection((ThreadPerConnection) newValue);
			return;
		case GeneratorPackage.TRANSPORT_INST__DATALINK_RELEASE_DELAY:
			setDatalink_release_delay((DatalinkReleaseDelay) newValue);
			return;
		case GeneratorPackage.TRANSPORT_INST__DATALINK_CONTROL_CHUNKS:
			setDatalink_control_chunks((DatalinkControlChunks) newValue);
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
		case GeneratorPackage.TRANSPORT_INST__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorPackage.TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL:
			setQueue_messages_per_pool((QueueMessagesPerPool) null);
			return;
		case GeneratorPackage.TRANSPORT_INST__QUEUE_INITIAL_POOLS:
			setQueue_initial_pools((QueueInitialPool) null);
			return;
		case GeneratorPackage.TRANSPORT_INST__MAX_PACKET_SIZE:
			setMax_packet_size((MaxPacketSize) null);
			return;
		case GeneratorPackage.TRANSPORT_INST__MAX_SAMPLES_PER_PACKET:
			setMax_samples_per_packet((MaxSamplesPerPacket) null);
			return;
		case GeneratorPackage.TRANSPORT_INST__OPTIMUM_PACKET_SIZE:
			setOptimum_packet_size((OptimumPacketSize) null);
			return;
		case GeneratorPackage.TRANSPORT_INST__THREAD_PER_CONNECTION:
			setThread_per_connection((ThreadPerConnection) null);
			return;
		case GeneratorPackage.TRANSPORT_INST__DATALINK_RELEASE_DELAY:
			setDatalink_release_delay((DatalinkReleaseDelay) null);
			return;
		case GeneratorPackage.TRANSPORT_INST__DATALINK_CONTROL_CHUNKS:
			setDatalink_control_chunks((DatalinkControlChunks) null);
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
		case GeneratorPackage.TRANSPORT_INST__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorPackage.TRANSPORT_INST__QUEUE_MESSAGES_PER_POOL:
			return queue_messages_per_pool != null;
		case GeneratorPackage.TRANSPORT_INST__QUEUE_INITIAL_POOLS:
			return queue_initial_pools != null;
		case GeneratorPackage.TRANSPORT_INST__MAX_PACKET_SIZE:
			return max_packet_size != null;
		case GeneratorPackage.TRANSPORT_INST__MAX_SAMPLES_PER_PACKET:
			return max_samples_per_packet != null;
		case GeneratorPackage.TRANSPORT_INST__OPTIMUM_PACKET_SIZE:
			return optimum_packet_size != null;
		case GeneratorPackage.TRANSPORT_INST__THREAD_PER_CONNECTION:
			return thread_per_connection != null;
		case GeneratorPackage.TRANSPORT_INST__DATALINK_RELEASE_DELAY:
			return datalink_release_delay != null;
		case GeneratorPackage.TRANSPORT_INST__DATALINK_CONTROL_CHUNKS:
			return datalink_control_chunks != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransportInstImpl
