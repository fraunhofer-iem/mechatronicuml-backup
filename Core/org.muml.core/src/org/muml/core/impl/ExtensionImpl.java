/**
 */
package org.muml.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.muml.core.CorePackage;
import org.muml.core.ExtendableElement;
import org.muml.core.Extension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.impl.ExtensionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.muml.core.impl.ExtensionImpl#getModelBase <em>Model Base</em>}</li>
 *   <li>{@link org.muml.core.impl.ExtensionImpl#getOwningAnnotation <em>Owning Annotation</em>}</li>
 *   <li>{@link org.muml.core.impl.ExtensionImpl#getExtendableBase <em>Extendable Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExtensionImpl extends ExtendableElementImpl implements Extension {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBase() {
		EObject base = basicGetBase();
		return base != null && base.eIsProxy() ? eResolveProxy((InternalEObject)base) : base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetBase() {
		// TODO: implement this method to return the 'Base' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement getModelBase() {
		EModelElement modelBase = basicGetModelBase();
		return modelBase != null && modelBase.eIsProxy() ? (EModelElement)eResolveProxy((InternalEObject)modelBase) : modelBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement basicGetModelBase() {
		// TODO: implement this method to return the 'Model Base' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelBase(EModelElement newModelBase) {
		// TODO: implement this method to set the 'Model Base' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModelBase() {
		// TODO: implement this method to unset the 'Model Base' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModelBase() {
		// TODO: implement this method to return whether the 'Model Base' reference is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getOwningAnnotation() {
		EAnnotation owningAnnotation = basicGetOwningAnnotation();
		return owningAnnotation != null && owningAnnotation.eIsProxy() ? (EAnnotation)eResolveProxy((InternalEObject)owningAnnotation) : owningAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation basicGetOwningAnnotation() {
		// TODO: implement this method to return the 'Owning Annotation' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningAnnotation(EAnnotation newOwningAnnotation) {
		// TODO: implement this method to set the 'Owning Annotation' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOwningAnnotation() {
		// TODO: implement this method to unset the 'Owning Annotation' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningAnnotation() {
		// TODO: implement this method to return whether the 'Owning Annotation' reference is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendableElement getExtendableBase() {
		if (eContainerFeatureID() != CorePackage.EXTENSION__EXTENDABLE_BASE) return null;
		return (ExtendableElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendableBase(ExtendableElement newExtendableBase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExtendableBase, CorePackage.EXTENSION__EXTENDABLE_BASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendableBase(ExtendableElement newExtendableBase) {
		if (newExtendableBase != eInternalContainer() || (eContainerFeatureID() != CorePackage.EXTENSION__EXTENDABLE_BASE && newExtendableBase != null)) {
			if (EcoreUtil.isAncestor(this, newExtendableBase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExtendableBase != null)
				msgs = ((InternalEObject)newExtendableBase).eInverseAdd(this, CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS, ExtendableElement.class, msgs);
			msgs = basicSetExtendableBase(newExtendableBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXTENSION__EXTENDABLE_BASE, newExtendableBase, newExtendableBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.EXTENSION__EXTENDABLE_BASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExtendableBase((ExtendableElement)otherEnd, msgs);
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
			case CorePackage.EXTENSION__EXTENDABLE_BASE:
				return basicSetExtendableBase(null, msgs);
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
			case CorePackage.EXTENSION__EXTENDABLE_BASE:
				return eInternalContainer().eInverseRemove(this, CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS, ExtendableElement.class, msgs);
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
			case CorePackage.EXTENSION__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case CorePackage.EXTENSION__MODEL_BASE:
				if (resolve) return getModelBase();
				return basicGetModelBase();
			case CorePackage.EXTENSION__OWNING_ANNOTATION:
				if (resolve) return getOwningAnnotation();
				return basicGetOwningAnnotation();
			case CorePackage.EXTENSION__EXTENDABLE_BASE:
				return getExtendableBase();
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
			case CorePackage.EXTENSION__MODEL_BASE:
				setModelBase((EModelElement)newValue);
				return;
			case CorePackage.EXTENSION__OWNING_ANNOTATION:
				setOwningAnnotation((EAnnotation)newValue);
				return;
			case CorePackage.EXTENSION__EXTENDABLE_BASE:
				setExtendableBase((ExtendableElement)newValue);
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
			case CorePackage.EXTENSION__MODEL_BASE:
				unsetModelBase();
				return;
			case CorePackage.EXTENSION__OWNING_ANNOTATION:
				unsetOwningAnnotation();
				return;
			case CorePackage.EXTENSION__EXTENDABLE_BASE:
				setExtendableBase((ExtendableElement)null);
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
			case CorePackage.EXTENSION__BASE:
				return basicGetBase() != null;
			case CorePackage.EXTENSION__MODEL_BASE:
				return isSetModelBase();
			case CorePackage.EXTENSION__OWNING_ANNOTATION:
				return isSetOwningAnnotation();
			case CorePackage.EXTENSION__EXTENDABLE_BASE:
				return getExtendableBase() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtensionImpl
