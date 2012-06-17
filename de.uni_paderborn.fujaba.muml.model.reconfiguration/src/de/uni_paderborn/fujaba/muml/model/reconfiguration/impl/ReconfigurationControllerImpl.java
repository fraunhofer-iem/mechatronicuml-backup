/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationControllerImplementation;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;

import org.storydriven.core.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImpl#getStructuredComponent <em>Structured Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationControllerImpl#getImplementations <em>Implementations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ReconfigurationControllerImpl extends NamedElementImpl implements ReconfigurationController {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = "\"no comment provided\"";

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplementations() <em>Implementations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementations()
	 * @generated
	 * @ordered
	 */
	protected ReconfigurationControllerImplementation implementations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RECONFIGURATION_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_CONTROLLER__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurableStructuredComponent getStructuredComponent() {
		if (eContainerFeatureID() != ReconfigurationPackage.RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT) return null;
		return (ReconfigurableStructuredComponent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredComponent(ReconfigurableStructuredComponent newStructuredComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStructuredComponent, ReconfigurationPackage.RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredComponent(ReconfigurableStructuredComponent newStructuredComponent) {
		if (newStructuredComponent != eInternalContainer() || (eContainerFeatureID() != ReconfigurationPackage.RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT && newStructuredComponent != null)) {
			if (EcoreUtil.isAncestor(this, newStructuredComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStructuredComponent != null)
				msgs = ((InternalEObject)newStructuredComponent).eInverseAdd(this, ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLERS, ReconfigurableStructuredComponent.class, msgs);
			msgs = basicSetStructuredComponent(newStructuredComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT, newStructuredComponent, newStructuredComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationControllerImplementation getImplementations() {
		return implementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementations(ReconfigurationControllerImplementation newImplementations, NotificationChain msgs) {
		ReconfigurationControllerImplementation oldImplementations = implementations;
		implementations = newImplementations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_CONTROLLER__IMPLEMENTATIONS, oldImplementations, newImplementations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementations(ReconfigurationControllerImplementation newImplementations) {
		if (newImplementations != implementations) {
			NotificationChain msgs = null;
			if (implementations != null)
				msgs = ((InternalEObject)implementations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_CONTROLLER__IMPLEMENTATIONS, null, msgs);
			if (newImplementations != null)
				msgs = ((InternalEObject)newImplementations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_CONTROLLER__IMPLEMENTATIONS, null, msgs);
			msgs = basicSetImplementations(newImplementations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_CONTROLLER__IMPLEMENTATIONS, newImplementations, newImplementations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStructuredComponent((ReconfigurableStructuredComponent)otherEnd, msgs);
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
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT:
				return basicSetStructuredComponent(null, msgs);
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__IMPLEMENTATIONS:
				return basicSetImplementations(null, msgs);
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
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT:
				return eInternalContainer().eInverseRemove(this, ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLERS, ReconfigurableStructuredComponent.class, msgs);
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
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__COMMENT:
				return getComment();
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT:
				return getStructuredComponent();
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__IMPLEMENTATIONS:
				return getImplementations();
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
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__COMMENT:
				setComment((String)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT:
				setStructuredComponent((ReconfigurableStructuredComponent)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__IMPLEMENTATIONS:
				setImplementations((ReconfigurationControllerImplementation)newValue);
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
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT:
				setStructuredComponent((ReconfigurableStructuredComponent)null);
				return;
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__IMPLEMENTATIONS:
				setImplementations((ReconfigurationControllerImplementation)null);
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
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT:
				return getStructuredComponent() != null;
			case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__IMPLEMENTATIONS:
				return implementations != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case ReconfigurationPackage.RECONFIGURATION_CONTROLLER__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return ReconfigurationPackage.RECONFIGURATION_CONTROLLER__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //ReconfigurationControllerImpl
