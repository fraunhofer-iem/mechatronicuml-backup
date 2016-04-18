/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.calls.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.core.CorePackage;
import org.muml.core.ExtendableElement;
import org.muml.core.Extension;
import org.muml.core.util.ExtensionOperations;
import org.muml.storydiagram.calls.CallsPackage;
import org.muml.storydiagram.calls.ParameterExtension;
import org.muml.storydiagram.impl.VariableImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Parameter Extension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.calls.impl.ParameterExtensionImpl#getExtendableBase <em>Extendable Base</em>}</li>
 *   <li>{@link org.muml.storydiagram.calls.impl.ParameterExtensionImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterExtensionImpl extends VariableImpl implements
		ParameterExtension {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallsPackage.Literals.PARAMETER_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EModelElement basicGetModelBase() {
		return getParameter();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setModelBase(EModelElement newModelBase) {
		setParameter((EParameter) newModelBase);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void unsetModelBase() {
		unsetParameter();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isSetModelBase() {
		return isSetParameter();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EAnnotation basicGetOwningAnnotation() {
		return ExtensionOperations.getOwningAnnotation(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setOwningAnnotation(EAnnotation newOwningAnnotation) {
		ExtensionOperations.setOwningAnnotation(this, newOwningAnnotation);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void unsetOwningAnnotation() {
		ExtensionOperations.unsetOwningAnnotation(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isSetOwningAnnotation() {
		return ExtensionOperations.isSetOwningAnnotation(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendableElement getExtendableBase() {
		if (eContainerFeatureID() != CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE) return null;
		return (ExtendableElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendableBase(
			ExtendableElement newExtendableBase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExtendableBase, CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendableBase(ExtendableElement newExtendableBase) {
		if (newExtendableBase != eInternalContainer() || (eContainerFeatureID() != CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE && newExtendableBase != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE, newExtendableBase, newExtendableBase));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EParameter getParameter() {
		return (EParameter) ExtensionOperations.getModelBase(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setParameter(EParameter newParameter) {
		ExtensionOperations.setModelBase(this, newParameter);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void unsetParameter() {
		ExtensionOperations.unsetModelBase(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isSetParameter() {
		return ExtensionOperations.isSetModelBase(this);
	}

	@Override
	public EClassifier basicGetType() {
		EParameter parameter = getParameter();
		return parameter == null ? null : parameter.getEType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExtendableBase((ExtendableElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
				return basicSetExtendableBase(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
				return eInternalContainer().eInverseRemove(this, CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS, ExtendableElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
				return getExtendableBase();
			case CallsPackage.PARAMETER_EXTENSION__PARAMETER:
				return getParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
				setExtendableBase((ExtendableElement)newValue);
				return;
			case CallsPackage.PARAMETER_EXTENSION__PARAMETER:
				setParameter((EParameter)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
				setExtendableBase((ExtendableElement)null);
				return;
			case CallsPackage.PARAMETER_EXTENSION__PARAMETER:
				unsetParameter();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE:
				return getExtendableBase() != null;
			case CallsPackage.PARAMETER_EXTENSION__PARAMETER:
				return isSetParameter();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Extension.class) {
			switch (derivedFeatureID) {
				case CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE: return CorePackage.EXTENSION__EXTENDABLE_BASE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Extension.class) {
			switch (baseFeatureID) {
				case CorePackage.EXTENSION__EXTENDABLE_BASE: return CallsPackage.PARAMETER_EXTENSION__EXTENDABLE_BASE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isSetBase() {
		return isSetParameter();
	}

	public String getVariableName() {
		ENamedElement namedElement = getParameter();
		return namedElement == null ? null : namedElement.getName();
	}

} // ParameterExtensionImpl
