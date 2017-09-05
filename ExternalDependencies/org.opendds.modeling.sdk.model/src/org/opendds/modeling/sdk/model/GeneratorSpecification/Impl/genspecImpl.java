/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification.Impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage;
import org.opendds.modeling.sdk.model.GeneratorSpecification.Instances;
import org.opendds.modeling.sdk.model.GeneratorSpecification.ModelFile;
import org.opendds.modeling.sdk.model.GeneratorSpecification.SearchPaths;
import org.opendds.modeling.sdk.model.GeneratorSpecification.TargetDir;
import org.opendds.modeling.sdk.model.GeneratorSpecification.Transports;
import org.opendds.modeling.sdk.model.GeneratorSpecification.genspec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>genspec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.genspecImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.genspecImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.genspecImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.genspecImpl#getSearchPaths <em>Search Paths</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.genspecImpl#getTransports <em>Transports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class genspecImpl extends EObjectImpl implements genspec {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ModelFile source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TargetDir target;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected Instances instances;

	/**
	 * The cached value of the '{@link #getSearchPaths() <em>Search Paths</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchPaths()
	 * @generated
	 * @ordered
	 */
	protected SearchPaths searchPaths;

	/**
	 * The cached value of the '{@link #getTransports() <em>Transports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransports()
	 * @generated
	 * @ordered
	 */
	protected Transports transports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected genspecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GENSPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFile getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ModelFile newSource, NotificationChain msgs) {
		ModelFile oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GENSPEC__SOURCE, oldSource, newSource);
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
	public void setSource(ModelFile newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENSPEC__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENSPEC__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GENSPEC__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetDir getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(TargetDir newTarget, NotificationChain msgs) {
		TargetDir oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GENSPEC__TARGET, oldTarget, newTarget);
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
	public void setTarget(TargetDir newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENSPEC__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENSPEC__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GENSPEC__TARGET, newTarget,
					newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instances getInstances() {
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstances(Instances newInstances, NotificationChain msgs) {
		Instances oldInstances = instances;
		instances = newInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GENSPEC__INSTANCES, oldInstances, newInstances);
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
	public void setInstances(Instances newInstances) {
		if (newInstances != instances) {
			NotificationChain msgs = null;
			if (instances != null)
				msgs = ((InternalEObject) instances).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENSPEC__INSTANCES, null, msgs);
			if (newInstances != null)
				msgs = ((InternalEObject) newInstances).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENSPEC__INSTANCES, null, msgs);
			msgs = basicSetInstances(newInstances, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GENSPEC__INSTANCES, newInstances,
					newInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchPaths getSearchPaths() {
		return searchPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchPaths(SearchPaths newSearchPaths, NotificationChain msgs) {
		SearchPaths oldSearchPaths = searchPaths;
		searchPaths = newSearchPaths;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GENSPEC__SEARCH_PATHS, oldSearchPaths, newSearchPaths);
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
	public void setSearchPaths(SearchPaths newSearchPaths) {
		if (newSearchPaths != searchPaths) {
			NotificationChain msgs = null;
			if (searchPaths != null)
				msgs = ((InternalEObject) searchPaths).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENSPEC__SEARCH_PATHS, null, msgs);
			if (newSearchPaths != null)
				msgs = ((InternalEObject) newSearchPaths).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENSPEC__SEARCH_PATHS, null, msgs);
			msgs = basicSetSearchPaths(newSearchPaths, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GENSPEC__SEARCH_PATHS,
					newSearchPaths, newSearchPaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transports getTransports() {
		return transports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransports(Transports newTransports, NotificationChain msgs) {
		Transports oldTransports = transports;
		transports = newTransports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.GENSPEC__TRANSPORTS, oldTransports, newTransports);
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
	public void setTransports(Transports newTransports) {
		if (newTransports != transports) {
			NotificationChain msgs = null;
			if (transports != null)
				msgs = ((InternalEObject) transports).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENSPEC__TRANSPORTS, null, msgs);
			if (newTransports != null)
				msgs = ((InternalEObject) newTransports).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENSPEC__TRANSPORTS, null, msgs);
			msgs = basicSetTransports(newTransports, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GENSPEC__TRANSPORTS, newTransports,
					newTransports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.GENSPEC__SOURCE:
			return basicSetSource(null, msgs);
		case GeneratorPackage.GENSPEC__TARGET:
			return basicSetTarget(null, msgs);
		case GeneratorPackage.GENSPEC__INSTANCES:
			return basicSetInstances(null, msgs);
		case GeneratorPackage.GENSPEC__SEARCH_PATHS:
			return basicSetSearchPaths(null, msgs);
		case GeneratorPackage.GENSPEC__TRANSPORTS:
			return basicSetTransports(null, msgs);
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
		case GeneratorPackage.GENSPEC__SOURCE:
			return getSource();
		case GeneratorPackage.GENSPEC__TARGET:
			return getTarget();
		case GeneratorPackage.GENSPEC__INSTANCES:
			return getInstances();
		case GeneratorPackage.GENSPEC__SEARCH_PATHS:
			return getSearchPaths();
		case GeneratorPackage.GENSPEC__TRANSPORTS:
			return getTransports();
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
		case GeneratorPackage.GENSPEC__SOURCE:
			setSource((ModelFile) newValue);
			return;
		case GeneratorPackage.GENSPEC__TARGET:
			setTarget((TargetDir) newValue);
			return;
		case GeneratorPackage.GENSPEC__INSTANCES:
			setInstances((Instances) newValue);
			return;
		case GeneratorPackage.GENSPEC__SEARCH_PATHS:
			setSearchPaths((SearchPaths) newValue);
			return;
		case GeneratorPackage.GENSPEC__TRANSPORTS:
			setTransports((Transports) newValue);
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
		case GeneratorPackage.GENSPEC__SOURCE:
			setSource((ModelFile) null);
			return;
		case GeneratorPackage.GENSPEC__TARGET:
			setTarget((TargetDir) null);
			return;
		case GeneratorPackage.GENSPEC__INSTANCES:
			setInstances((Instances) null);
			return;
		case GeneratorPackage.GENSPEC__SEARCH_PATHS:
			setSearchPaths((SearchPaths) null);
			return;
		case GeneratorPackage.GENSPEC__TRANSPORTS:
			setTransports((Transports) null);
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
		case GeneratorPackage.GENSPEC__SOURCE:
			return source != null;
		case GeneratorPackage.GENSPEC__TARGET:
			return target != null;
		case GeneratorPackage.GENSPEC__INSTANCES:
			return instances != null;
		case GeneratorPackage.GENSPEC__SEARCH_PATHS:
			return searchPaths != null;
		case GeneratorPackage.GENSPEC__TRANSPORTS:
			return transports != null;
		}
		return super.eIsSet(featureID);
	}

} //genspecImpl
