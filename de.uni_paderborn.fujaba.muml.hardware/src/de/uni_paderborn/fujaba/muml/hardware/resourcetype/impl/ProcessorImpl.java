/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.hardware.resourcetype.Cache;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.Processor;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ProcessorArchitecture;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;
import de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ProcessorImpl#getOwnedCache <em>Owned Cache</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ProcessorImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ProcessorImpl#getNbCores <em>Nb Cores</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ProcessorImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ProcessorImpl#getNbPipelineStages <em>Nb Pipeline Stages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorImpl extends ComputingResourceImpl implements Processor {
	/**
	 * The cached value of the '{@link #getOwnedCache() <em>Owned Cache</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCache()
	 * @generated
	 * @ordered
	 */
	protected Cache ownedCache;

	/**
	 * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessorArchitecture ARCHITECTURE_EDEFAULT = ProcessorArchitecture.RISC;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected ProcessorArchitecture architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNbCores() <em>Nb Cores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCores()
	 * @generated
	 * @ordered
	 */
	protected NaturalNumber nbCores;

	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected String family = FAMILY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNbPipelineStages() <em>Nb Pipeline Stages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPipelineStages()
	 * @generated
	 * @ordered
	 */
	protected NaturalNumber nbPipelineStages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcetypePackage.Literals.PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache getOwnedCache() {
		if (ownedCache != null && ownedCache.eIsProxy()) {
			InternalEObject oldOwnedCache = (InternalEObject)ownedCache;
			ownedCache = (Cache)eResolveProxy(oldOwnedCache);
			if (ownedCache != oldOwnedCache) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcetypePackage.PROCESSOR__OWNED_CACHE, oldOwnedCache, ownedCache));
			}
		}
		return ownedCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache basicGetOwnedCache() {
		return ownedCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedCache(Cache newOwnedCache, NotificationChain msgs) {
		Cache oldOwnedCache = ownedCache;
		ownedCache = newOwnedCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcetypePackage.PROCESSOR__OWNED_CACHE, oldOwnedCache, newOwnedCache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedCache(Cache newOwnedCache) {
		if (newOwnedCache != ownedCache) {
			NotificationChain msgs = null;
			if (ownedCache != null)
				msgs = ((InternalEObject)ownedCache).eInverseRemove(this, ResourcetypePackage.CACHE__USED_BY_PROCESSOR, Cache.class, msgs);
			if (newOwnedCache != null)
				msgs = ((InternalEObject)newOwnedCache).eInverseAdd(this, ResourcetypePackage.CACHE__USED_BY_PROCESSOR, Cache.class, msgs);
			msgs = basicSetOwnedCache(newOwnedCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcetypePackage.PROCESSOR__OWNED_CACHE, newOwnedCache, newOwnedCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorArchitecture getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(ProcessorArchitecture newArchitecture) {
		ProcessorArchitecture oldArchitecture = architecture;
		architecture = newArchitecture == null ? ARCHITECTURE_EDEFAULT : newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcetypePackage.PROCESSOR__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNumber getNbCores() {
		return nbCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbCores(NaturalNumber newNbCores, NotificationChain msgs) {
		NaturalNumber oldNbCores = nbCores;
		nbCores = newNbCores;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcetypePackage.PROCESSOR__NB_CORES, oldNbCores, newNbCores);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbCores(NaturalNumber newNbCores) {
		if (newNbCores != nbCores) {
			NotificationChain msgs = null;
			if (nbCores != null)
				msgs = ((InternalEObject)nbCores).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcetypePackage.PROCESSOR__NB_CORES, null, msgs);
			if (newNbCores != null)
				msgs = ((InternalEObject)newNbCores).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcetypePackage.PROCESSOR__NB_CORES, null, msgs);
			msgs = basicSetNbCores(newNbCores, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcetypePackage.PROCESSOR__NB_CORES, newNbCores, newNbCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(String newFamily) {
		String oldFamily = family;
		family = newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcetypePackage.PROCESSOR__FAMILY, oldFamily, family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNumber getNbPipelineStages() {
		return nbPipelineStages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbPipelineStages(NaturalNumber newNbPipelineStages, NotificationChain msgs) {
		NaturalNumber oldNbPipelineStages = nbPipelineStages;
		nbPipelineStages = newNbPipelineStages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcetypePackage.PROCESSOR__NB_PIPELINE_STAGES, oldNbPipelineStages, newNbPipelineStages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbPipelineStages(NaturalNumber newNbPipelineStages) {
		if (newNbPipelineStages != nbPipelineStages) {
			NotificationChain msgs = null;
			if (nbPipelineStages != null)
				msgs = ((InternalEObject)nbPipelineStages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcetypePackage.PROCESSOR__NB_PIPELINE_STAGES, null, msgs);
			if (newNbPipelineStages != null)
				msgs = ((InternalEObject)newNbPipelineStages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcetypePackage.PROCESSOR__NB_PIPELINE_STAGES, null, msgs);
			msgs = basicSetNbPipelineStages(newNbPipelineStages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcetypePackage.PROCESSOR__NB_PIPELINE_STAGES, newNbPipelineStages, newNbPipelineStages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcetypePackage.PROCESSOR__OWNED_CACHE:
				if (ownedCache != null)
					msgs = ((InternalEObject)ownedCache).eInverseRemove(this, ResourcetypePackage.CACHE__USED_BY_PROCESSOR, Cache.class, msgs);
				return basicSetOwnedCache((Cache)otherEnd, msgs);
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
			case ResourcetypePackage.PROCESSOR__OWNED_CACHE:
				return basicSetOwnedCache(null, msgs);
			case ResourcetypePackage.PROCESSOR__NB_CORES:
				return basicSetNbCores(null, msgs);
			case ResourcetypePackage.PROCESSOR__NB_PIPELINE_STAGES:
				return basicSetNbPipelineStages(null, msgs);
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
			case ResourcetypePackage.PROCESSOR__OWNED_CACHE:
				if (resolve) return getOwnedCache();
				return basicGetOwnedCache();
			case ResourcetypePackage.PROCESSOR__ARCHITECTURE:
				return getArchitecture();
			case ResourcetypePackage.PROCESSOR__NB_CORES:
				return getNbCores();
			case ResourcetypePackage.PROCESSOR__FAMILY:
				return getFamily();
			case ResourcetypePackage.PROCESSOR__NB_PIPELINE_STAGES:
				return getNbPipelineStages();
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
			case ResourcetypePackage.PROCESSOR__OWNED_CACHE:
				setOwnedCache((Cache)newValue);
				return;
			case ResourcetypePackage.PROCESSOR__ARCHITECTURE:
				setArchitecture((ProcessorArchitecture)newValue);
				return;
			case ResourcetypePackage.PROCESSOR__NB_CORES:
				setNbCores((NaturalNumber)newValue);
				return;
			case ResourcetypePackage.PROCESSOR__FAMILY:
				setFamily((String)newValue);
				return;
			case ResourcetypePackage.PROCESSOR__NB_PIPELINE_STAGES:
				setNbPipelineStages((NaturalNumber)newValue);
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
			case ResourcetypePackage.PROCESSOR__OWNED_CACHE:
				setOwnedCache((Cache)null);
				return;
			case ResourcetypePackage.PROCESSOR__ARCHITECTURE:
				setArchitecture(ARCHITECTURE_EDEFAULT);
				return;
			case ResourcetypePackage.PROCESSOR__NB_CORES:
				setNbCores((NaturalNumber)null);
				return;
			case ResourcetypePackage.PROCESSOR__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case ResourcetypePackage.PROCESSOR__NB_PIPELINE_STAGES:
				setNbPipelineStages((NaturalNumber)null);
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
			case ResourcetypePackage.PROCESSOR__OWNED_CACHE:
				return ownedCache != null;
			case ResourcetypePackage.PROCESSOR__ARCHITECTURE:
				return architecture != ARCHITECTURE_EDEFAULT;
			case ResourcetypePackage.PROCESSOR__NB_CORES:
				return nbCores != null;
			case ResourcetypePackage.PROCESSOR__FAMILY:
				return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
			case ResourcetypePackage.PROCESSOR__NB_PIPELINE_STAGES:
				return nbPipelineStages != null;
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
		result.append(" (architecture: ");
		result.append(architecture);
		result.append(", family: ");
		result.append(family);
		result.append(')');
		return result.toString();
	}

} //ProcessorImpl
