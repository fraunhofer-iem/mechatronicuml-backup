/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.EDFPolicy;
import es.unican.mast.xmlmast.model.FixedPriorityPolicy;
import es.unican.mast.xmlmast.model.InterruptFPPolicy;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.NonPreemptibleFPPolicy;
import es.unican.mast.xmlmast.model.PollingPolicy;
import es.unican.mast.xmlmast.model.RegularSchedulingServer;
import es.unican.mast.xmlmast.model.SRPParameters;
import es.unican.mast.xmlmast.model.SporadicServerPolicy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Scheduling Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularSchedulingServerImpl#getNonPreemptibleFPPolicy <em>Non Preemptible FP Policy</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularSchedulingServerImpl#getFixedPriorityPolicy <em>Fixed Priority Policy</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularSchedulingServerImpl#getInterruptFPPolicy <em>Interrupt FP Policy</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularSchedulingServerImpl#getPollingPolicy <em>Polling Policy</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularSchedulingServerImpl#getSporadicServerPolicy <em>Sporadic Server Policy</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularSchedulingServerImpl#getEDFPolicy <em>EDF Policy</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularSchedulingServerImpl#getSRPParameters <em>SRP Parameters</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularSchedulingServerImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RegularSchedulingServerImpl#getScheduler <em>Scheduler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegularSchedulingServerImpl extends MinimalEObjectImpl.Container implements RegularSchedulingServer {
	/**
	 * The cached value of the '{@link #getNonPreemptibleFPPolicy() <em>Non Preemptible FP Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPreemptibleFPPolicy()
	 * @generated
	 * @ordered
	 */
	protected NonPreemptibleFPPolicy nonPreemptibleFPPolicy;

	/**
	 * The cached value of the '{@link #getFixedPriorityPolicy() <em>Fixed Priority Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPriorityPolicy()
	 * @generated
	 * @ordered
	 */
	protected FixedPriorityPolicy fixedPriorityPolicy;

	/**
	 * The cached value of the '{@link #getInterruptFPPolicy() <em>Interrupt FP Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptFPPolicy()
	 * @generated
	 * @ordered
	 */
	protected InterruptFPPolicy interruptFPPolicy;

	/**
	 * The cached value of the '{@link #getPollingPolicy() <em>Polling Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingPolicy()
	 * @generated
	 * @ordered
	 */
	protected PollingPolicy pollingPolicy;

	/**
	 * The cached value of the '{@link #getSporadicServerPolicy() <em>Sporadic Server Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSporadicServerPolicy()
	 * @generated
	 * @ordered
	 */
	protected SporadicServerPolicy sporadicServerPolicy;

	/**
	 * The cached value of the '{@link #getEDFPolicy() <em>EDF Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDFPolicy()
	 * @generated
	 * @ordered
	 */
	protected EDFPolicy eDFPolicy;

	/**
	 * The cached value of the '{@link #getSRPParameters() <em>SRP Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSRPParameters()
	 * @generated
	 * @ordered
	 */
	protected SRPParameters sRPParameters;

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
	 * The default value of the '{@link #getScheduler() <em>Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduler() <em>Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler()
	 * @generated
	 * @ordered
	 */
	protected String scheduler = SCHEDULER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularSchedulingServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.REGULAR_SCHEDULING_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonPreemptibleFPPolicy getNonPreemptibleFPPolicy() {
		return nonPreemptibleFPPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonPreemptibleFPPolicy(NonPreemptibleFPPolicy newNonPreemptibleFPPolicy, NotificationChain msgs) {
		NonPreemptibleFPPolicy oldNonPreemptibleFPPolicy = nonPreemptibleFPPolicy;
		nonPreemptibleFPPolicy = newNonPreemptibleFPPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__NON_PREEMPTIBLE_FP_POLICY, oldNonPreemptibleFPPolicy, newNonPreemptibleFPPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonPreemptibleFPPolicy(NonPreemptibleFPPolicy newNonPreemptibleFPPolicy) {
		if (newNonPreemptibleFPPolicy != nonPreemptibleFPPolicy) {
			NotificationChain msgs = null;
			if (nonPreemptibleFPPolicy != null)
				msgs = ((InternalEObject)nonPreemptibleFPPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_SCHEDULING_SERVER__NON_PREEMPTIBLE_FP_POLICY, null, msgs);
			if (newNonPreemptibleFPPolicy != null)
				msgs = ((InternalEObject)newNonPreemptibleFPPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_SCHEDULING_SERVER__NON_PREEMPTIBLE_FP_POLICY, null, msgs);
			msgs = basicSetNonPreemptibleFPPolicy(newNonPreemptibleFPPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__NON_PREEMPTIBLE_FP_POLICY, newNonPreemptibleFPPolicy, newNonPreemptibleFPPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedPriorityPolicy getFixedPriorityPolicy() {
		return fixedPriorityPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedPriorityPolicy(FixedPriorityPolicy newFixedPriorityPolicy, NotificationChain msgs) {
		FixedPriorityPolicy oldFixedPriorityPolicy = fixedPriorityPolicy;
		fixedPriorityPolicy = newFixedPriorityPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__FIXED_PRIORITY_POLICY, oldFixedPriorityPolicy, newFixedPriorityPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedPriorityPolicy(FixedPriorityPolicy newFixedPriorityPolicy) {
		if (newFixedPriorityPolicy != fixedPriorityPolicy) {
			NotificationChain msgs = null;
			if (fixedPriorityPolicy != null)
				msgs = ((InternalEObject)fixedPriorityPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_SCHEDULING_SERVER__FIXED_PRIORITY_POLICY, null, msgs);
			if (newFixedPriorityPolicy != null)
				msgs = ((InternalEObject)newFixedPriorityPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_SCHEDULING_SERVER__FIXED_PRIORITY_POLICY, null, msgs);
			msgs = basicSetFixedPriorityPolicy(newFixedPriorityPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__FIXED_PRIORITY_POLICY, newFixedPriorityPolicy, newFixedPriorityPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptFPPolicy getInterruptFPPolicy() {
		return interruptFPPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterruptFPPolicy(InterruptFPPolicy newInterruptFPPolicy, NotificationChain msgs) {
		InterruptFPPolicy oldInterruptFPPolicy = interruptFPPolicy;
		interruptFPPolicy = newInterruptFPPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__INTERRUPT_FP_POLICY, oldInterruptFPPolicy, newInterruptFPPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterruptFPPolicy(InterruptFPPolicy newInterruptFPPolicy) {
		if (newInterruptFPPolicy != interruptFPPolicy) {
			NotificationChain msgs = null;
			if (interruptFPPolicy != null)
				msgs = ((InternalEObject)interruptFPPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_SCHEDULING_SERVER__INTERRUPT_FP_POLICY, null, msgs);
			if (newInterruptFPPolicy != null)
				msgs = ((InternalEObject)newInterruptFPPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_SCHEDULING_SERVER__INTERRUPT_FP_POLICY, null, msgs);
			msgs = basicSetInterruptFPPolicy(newInterruptFPPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__INTERRUPT_FP_POLICY, newInterruptFPPolicy, newInterruptFPPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollingPolicy getPollingPolicy() {
		return pollingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPollingPolicy(PollingPolicy newPollingPolicy, NotificationChain msgs) {
		PollingPolicy oldPollingPolicy = pollingPolicy;
		pollingPolicy = newPollingPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__POLLING_POLICY, oldPollingPolicy, newPollingPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollingPolicy(PollingPolicy newPollingPolicy) {
		if (newPollingPolicy != pollingPolicy) {
			NotificationChain msgs = null;
			if (pollingPolicy != null)
				msgs = ((InternalEObject)pollingPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_SCHEDULING_SERVER__POLLING_POLICY, null, msgs);
			if (newPollingPolicy != null)
				msgs = ((InternalEObject)newPollingPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_SCHEDULING_SERVER__POLLING_POLICY, null, msgs);
			msgs = basicSetPollingPolicy(newPollingPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__POLLING_POLICY, newPollingPolicy, newPollingPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicServerPolicy getSporadicServerPolicy() {
		return sporadicServerPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSporadicServerPolicy(SporadicServerPolicy newSporadicServerPolicy, NotificationChain msgs) {
		SporadicServerPolicy oldSporadicServerPolicy = sporadicServerPolicy;
		sporadicServerPolicy = newSporadicServerPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__SPORADIC_SERVER_POLICY, oldSporadicServerPolicy, newSporadicServerPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSporadicServerPolicy(SporadicServerPolicy newSporadicServerPolicy) {
		if (newSporadicServerPolicy != sporadicServerPolicy) {
			NotificationChain msgs = null;
			if (sporadicServerPolicy != null)
				msgs = ((InternalEObject)sporadicServerPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_SCHEDULING_SERVER__SPORADIC_SERVER_POLICY, null, msgs);
			if (newSporadicServerPolicy != null)
				msgs = ((InternalEObject)newSporadicServerPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_SCHEDULING_SERVER__SPORADIC_SERVER_POLICY, null, msgs);
			msgs = basicSetSporadicServerPolicy(newSporadicServerPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__SPORADIC_SERVER_POLICY, newSporadicServerPolicy, newSporadicServerPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDFPolicy getEDFPolicy() {
		return eDFPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEDFPolicy(EDFPolicy newEDFPolicy, NotificationChain msgs) {
		EDFPolicy oldEDFPolicy = eDFPolicy;
		eDFPolicy = newEDFPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__EDF_POLICY, oldEDFPolicy, newEDFPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDFPolicy(EDFPolicy newEDFPolicy) {
		if (newEDFPolicy != eDFPolicy) {
			NotificationChain msgs = null;
			if (eDFPolicy != null)
				msgs = ((InternalEObject)eDFPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_SCHEDULING_SERVER__EDF_POLICY, null, msgs);
			if (newEDFPolicy != null)
				msgs = ((InternalEObject)newEDFPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_SCHEDULING_SERVER__EDF_POLICY, null, msgs);
			msgs = basicSetEDFPolicy(newEDFPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__EDF_POLICY, newEDFPolicy, newEDFPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRPParameters getSRPParameters() {
		return sRPParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSRPParameters(SRPParameters newSRPParameters, NotificationChain msgs) {
		SRPParameters oldSRPParameters = sRPParameters;
		sRPParameters = newSRPParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__SRP_PARAMETERS, oldSRPParameters, newSRPParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSRPParameters(SRPParameters newSRPParameters) {
		if (newSRPParameters != sRPParameters) {
			NotificationChain msgs = null;
			if (sRPParameters != null)
				msgs = ((InternalEObject)sRPParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_SCHEDULING_SERVER__SRP_PARAMETERS, null, msgs);
			if (newSRPParameters != null)
				msgs = ((InternalEObject)newSRPParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGULAR_SCHEDULING_SERVER__SRP_PARAMETERS, null, msgs);
			msgs = basicSetSRPParameters(newSRPParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__SRP_PARAMETERS, newSRPParameters, newSRPParameters));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheduler() {
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler(String newScheduler) {
		String oldScheduler = scheduler;
		scheduler = newScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGULAR_SCHEDULING_SERVER__SCHEDULER, oldScheduler, scheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.REGULAR_SCHEDULING_SERVER__NON_PREEMPTIBLE_FP_POLICY:
				return basicSetNonPreemptibleFPPolicy(null, msgs);
			case ModelPackage.REGULAR_SCHEDULING_SERVER__FIXED_PRIORITY_POLICY:
				return basicSetFixedPriorityPolicy(null, msgs);
			case ModelPackage.REGULAR_SCHEDULING_SERVER__INTERRUPT_FP_POLICY:
				return basicSetInterruptFPPolicy(null, msgs);
			case ModelPackage.REGULAR_SCHEDULING_SERVER__POLLING_POLICY:
				return basicSetPollingPolicy(null, msgs);
			case ModelPackage.REGULAR_SCHEDULING_SERVER__SPORADIC_SERVER_POLICY:
				return basicSetSporadicServerPolicy(null, msgs);
			case ModelPackage.REGULAR_SCHEDULING_SERVER__EDF_POLICY:
				return basicSetEDFPolicy(null, msgs);
			case ModelPackage.REGULAR_SCHEDULING_SERVER__SRP_PARAMETERS:
				return basicSetSRPParameters(null, msgs);
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
			case ModelPackage.REGULAR_SCHEDULING_SERVER__NON_PREEMPTIBLE_FP_POLICY:
				return getNonPreemptibleFPPolicy();
			case ModelPackage.REGULAR_SCHEDULING_SERVER__FIXED_PRIORITY_POLICY:
				return getFixedPriorityPolicy();
			case ModelPackage.REGULAR_SCHEDULING_SERVER__INTERRUPT_FP_POLICY:
				return getInterruptFPPolicy();
			case ModelPackage.REGULAR_SCHEDULING_SERVER__POLLING_POLICY:
				return getPollingPolicy();
			case ModelPackage.REGULAR_SCHEDULING_SERVER__SPORADIC_SERVER_POLICY:
				return getSporadicServerPolicy();
			case ModelPackage.REGULAR_SCHEDULING_SERVER__EDF_POLICY:
				return getEDFPolicy();
			case ModelPackage.REGULAR_SCHEDULING_SERVER__SRP_PARAMETERS:
				return getSRPParameters();
			case ModelPackage.REGULAR_SCHEDULING_SERVER__NAME:
				return getName();
			case ModelPackage.REGULAR_SCHEDULING_SERVER__SCHEDULER:
				return getScheduler();
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
			case ModelPackage.REGULAR_SCHEDULING_SERVER__NON_PREEMPTIBLE_FP_POLICY:
				setNonPreemptibleFPPolicy((NonPreemptibleFPPolicy)newValue);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__FIXED_PRIORITY_POLICY:
				setFixedPriorityPolicy((FixedPriorityPolicy)newValue);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__INTERRUPT_FP_POLICY:
				setInterruptFPPolicy((InterruptFPPolicy)newValue);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__POLLING_POLICY:
				setPollingPolicy((PollingPolicy)newValue);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__SPORADIC_SERVER_POLICY:
				setSporadicServerPolicy((SporadicServerPolicy)newValue);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__EDF_POLICY:
				setEDFPolicy((EDFPolicy)newValue);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__SRP_PARAMETERS:
				setSRPParameters((SRPParameters)newValue);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__SCHEDULER:
				setScheduler((String)newValue);
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
			case ModelPackage.REGULAR_SCHEDULING_SERVER__NON_PREEMPTIBLE_FP_POLICY:
				setNonPreemptibleFPPolicy((NonPreemptibleFPPolicy)null);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__FIXED_PRIORITY_POLICY:
				setFixedPriorityPolicy((FixedPriorityPolicy)null);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__INTERRUPT_FP_POLICY:
				setInterruptFPPolicy((InterruptFPPolicy)null);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__POLLING_POLICY:
				setPollingPolicy((PollingPolicy)null);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__SPORADIC_SERVER_POLICY:
				setSporadicServerPolicy((SporadicServerPolicy)null);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__EDF_POLICY:
				setEDFPolicy((EDFPolicy)null);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__SRP_PARAMETERS:
				setSRPParameters((SRPParameters)null);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__SCHEDULER:
				setScheduler(SCHEDULER_EDEFAULT);
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
			case ModelPackage.REGULAR_SCHEDULING_SERVER__NON_PREEMPTIBLE_FP_POLICY:
				return nonPreemptibleFPPolicy != null;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__FIXED_PRIORITY_POLICY:
				return fixedPriorityPolicy != null;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__INTERRUPT_FP_POLICY:
				return interruptFPPolicy != null;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__POLLING_POLICY:
				return pollingPolicy != null;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__SPORADIC_SERVER_POLICY:
				return sporadicServerPolicy != null;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__EDF_POLICY:
				return eDFPolicy != null;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__SRP_PARAMETERS:
				return sRPParameters != null;
			case ModelPackage.REGULAR_SCHEDULING_SERVER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.REGULAR_SCHEDULING_SERVER__SCHEDULER:
				return SCHEDULER_EDEFAULT == null ? scheduler != null : !SCHEDULER_EDEFAULT.equals(scheduler);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", scheduler: ");
		result.append(scheduler);
		result.append(')');
		return result.toString();
	}

} //RegularSchedulingServerImpl
