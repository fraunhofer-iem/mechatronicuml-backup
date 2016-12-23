/**
 */
package org.muml.pm.hardware.hwresource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pm.hardware.hwresource.Cache;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.Processor;
import org.muml.pm.hardware.hwresource.ReplacementPolicy;
import org.muml.pm.hardware.hwresource.WritePolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CacheImpl#getWritePolicy <em>Write Policy</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CacheImpl#getReplacementPolicy <em>Replacement Policy</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CacheImpl#getNbSets <em>Nb Sets</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CacheImpl#getAssociativity <em>Associativity</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.CacheImpl#getUsedByProcessor <em>Used By Processor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CacheImpl extends MemoryResourceImpl implements Cache {
	/**
	 * The default value of the '{@link #getWritePolicy() <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final WritePolicy WRITE_POLICY_EDEFAULT = WritePolicy.WRITE_THROUGH;

	/**
	 * The cached value of the '{@link #getWritePolicy() <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritePolicy()
	 * @generated
	 * @ordered
	 */
	protected WritePolicy writePolicy = WRITE_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplacementPolicy() <em>Replacement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final ReplacementPolicy REPLACEMENT_POLICY_EDEFAULT = ReplacementPolicy.FIFO;

	/**
	 * The cached value of the '{@link #getReplacementPolicy() <em>Replacement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementPolicy()
	 * @generated
	 * @ordered
	 */
	protected ReplacementPolicy replacementPolicy = REPLACEMENT_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbSets() <em>Nb Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbSets()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_SETS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbSets() <em>Nb Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbSets()
	 * @generated
	 * @ordered
	 */
	protected int nbSets = NB_SETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociativity() <em>Associativity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociativity()
	 * @generated
	 * @ordered
	 */
	protected static final int ASSOCIATIVITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAssociativity() <em>Associativity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociativity()
	 * @generated
	 * @ordered
	 */
	protected int associativity = ASSOCIATIVITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsedByProcessor() <em>Used By Processor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedByProcessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> usedByProcessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourcePackage.Literals.CACHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritePolicy getWritePolicy() {
		return writePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWritePolicy(WritePolicy newWritePolicy) {
		WritePolicy oldWritePolicy = writePolicy;
		writePolicy = newWritePolicy == null ? WRITE_POLICY_EDEFAULT : newWritePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.CACHE__WRITE_POLICY, oldWritePolicy, writePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplacementPolicy getReplacementPolicy() {
		return replacementPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacementPolicy(ReplacementPolicy newReplacementPolicy) {
		ReplacementPolicy oldReplacementPolicy = replacementPolicy;
		replacementPolicy = newReplacementPolicy == null ? REPLACEMENT_POLICY_EDEFAULT : newReplacementPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.CACHE__REPLACEMENT_POLICY, oldReplacementPolicy, replacementPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbSets() {
		return nbSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbSets(int newNbSets) {
		int oldNbSets = nbSets;
		nbSets = newNbSets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.CACHE__NB_SETS, oldNbSets, nbSets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAssociativity() {
		return associativity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociativity(int newAssociativity) {
		int oldAssociativity = associativity;
		associativity = newAssociativity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.CACHE__ASSOCIATIVITY, oldAssociativity, associativity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getUsedByProcessor() {
		if (usedByProcessor == null) {
			usedByProcessor = new EObjectWithInverseResolvingEList<Processor>(Processor.class, this, HwresourcePackage.CACHE__USED_BY_PROCESSOR, HwresourcePackage.PROCESSOR__OWNED_CACHE);
		}
		return usedByProcessor;
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
			case HwresourcePackage.CACHE__USED_BY_PROCESSOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedByProcessor()).basicAdd(otherEnd, msgs);
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
			case HwresourcePackage.CACHE__USED_BY_PROCESSOR:
				return ((InternalEList<?>)getUsedByProcessor()).basicRemove(otherEnd, msgs);
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
			case HwresourcePackage.CACHE__WRITE_POLICY:
				return getWritePolicy();
			case HwresourcePackage.CACHE__REPLACEMENT_POLICY:
				return getReplacementPolicy();
			case HwresourcePackage.CACHE__NB_SETS:
				return getNbSets();
			case HwresourcePackage.CACHE__ASSOCIATIVITY:
				return getAssociativity();
			case HwresourcePackage.CACHE__USED_BY_PROCESSOR:
				return getUsedByProcessor();
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
			case HwresourcePackage.CACHE__WRITE_POLICY:
				setWritePolicy((WritePolicy)newValue);
				return;
			case HwresourcePackage.CACHE__REPLACEMENT_POLICY:
				setReplacementPolicy((ReplacementPolicy)newValue);
				return;
			case HwresourcePackage.CACHE__NB_SETS:
				setNbSets((Integer)newValue);
				return;
			case HwresourcePackage.CACHE__ASSOCIATIVITY:
				setAssociativity((Integer)newValue);
				return;
			case HwresourcePackage.CACHE__USED_BY_PROCESSOR:
				getUsedByProcessor().clear();
				getUsedByProcessor().addAll((Collection<? extends Processor>)newValue);
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
			case HwresourcePackage.CACHE__WRITE_POLICY:
				setWritePolicy(WRITE_POLICY_EDEFAULT);
				return;
			case HwresourcePackage.CACHE__REPLACEMENT_POLICY:
				setReplacementPolicy(REPLACEMENT_POLICY_EDEFAULT);
				return;
			case HwresourcePackage.CACHE__NB_SETS:
				setNbSets(NB_SETS_EDEFAULT);
				return;
			case HwresourcePackage.CACHE__ASSOCIATIVITY:
				setAssociativity(ASSOCIATIVITY_EDEFAULT);
				return;
			case HwresourcePackage.CACHE__USED_BY_PROCESSOR:
				getUsedByProcessor().clear();
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
			case HwresourcePackage.CACHE__WRITE_POLICY:
				return writePolicy != WRITE_POLICY_EDEFAULT;
			case HwresourcePackage.CACHE__REPLACEMENT_POLICY:
				return replacementPolicy != REPLACEMENT_POLICY_EDEFAULT;
			case HwresourcePackage.CACHE__NB_SETS:
				return nbSets != NB_SETS_EDEFAULT;
			case HwresourcePackage.CACHE__ASSOCIATIVITY:
				return associativity != ASSOCIATIVITY_EDEFAULT;
			case HwresourcePackage.CACHE__USED_BY_PROCESSOR:
				return usedByProcessor != null && !usedByProcessor.isEmpty();
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
		result.append(" (writePolicy: ");
		result.append(writePolicy);
		result.append(", replacementPolicy: ");
		result.append(replacementPolicy);
		result.append(", nbSets: ");
		result.append(nbSets);
		result.append(", associativity: ");
		result.append(associativity);
		result.append(')');
		return result.toString();
	}

} //CacheImpl
