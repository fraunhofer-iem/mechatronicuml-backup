/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.impl.CommentableElementImpl;

import de.uni_paderborn.fujaba.muml.reconfiguration.Executor;
import de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutorImpl#getSpecificationEntries <em>Specification Entries</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutorImpl#getReconfigurationController <em>Reconfiguration Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutorImpl extends CommentableElementImpl implements Executor {
	/**
	 * The cached value of the '{@link #getSpecificationEntries() <em>Specification Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutorSpecificationEntry> specificationEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.EXECUTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutorSpecificationEntry> getSpecificationEntries() {
		if (specificationEntries == null) {
			specificationEntries = new EObjectContainmentWithInverseEList<ExecutorSpecificationEntry>(ExecutorSpecificationEntry.class, this, ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES, ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR);
		}
		return specificationEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleBasedReconfigurationController getReconfigurationController() {
		if (eContainerFeatureID() != ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER) return null;
		return (RuleBasedReconfigurationController)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReconfigurationController(RuleBasedReconfigurationController newReconfigurationController, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReconfigurationController, ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurationController(RuleBasedReconfigurationController newReconfigurationController) {
		if (newReconfigurationController != eInternalContainer() || (eContainerFeatureID() != ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER && newReconfigurationController != null)) {
			if (EcoreUtil.isAncestor(this, newReconfigurationController))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReconfigurationController != null)
				msgs = ((InternalEObject)newReconfigurationController).eInverseAdd(this, ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR, RuleBasedReconfigurationController.class, msgs);
			msgs = basicSetReconfigurationController(newReconfigurationController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER, newReconfigurationController, newReconfigurationController));
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
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecificationEntries()).basicAdd(otherEnd, msgs);
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReconfigurationController((RuleBasedReconfigurationController)otherEnd, msgs);
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
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
				return ((InternalEList<?>)getSpecificationEntries()).basicRemove(otherEnd, msgs);
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER:
				return basicSetReconfigurationController(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER:
				return eInternalContainer().eInverseRemove(this, ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR, RuleBasedReconfigurationController.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
				return getSpecificationEntries();
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER:
				return getReconfigurationController();
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
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
				getSpecificationEntries().clear();
				getSpecificationEntries().addAll((Collection<? extends ExecutorSpecificationEntry>)newValue);
				return;
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER:
				setReconfigurationController((RuleBasedReconfigurationController)newValue);
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
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
				getSpecificationEntries().clear();
				return;
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER:
				setReconfigurationController((RuleBasedReconfigurationController)null);
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
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
				return specificationEntries != null && !specificationEntries.isEmpty();
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER:
				return getReconfigurationController() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutorImpl
