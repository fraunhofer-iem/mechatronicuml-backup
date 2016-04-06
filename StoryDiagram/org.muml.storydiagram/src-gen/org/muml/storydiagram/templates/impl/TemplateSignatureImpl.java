/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.templates.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.storydiagram.patterns.PatternsPackage;
import org.muml.storydiagram.patterns.StoryPattern;
import org.muml.storydiagram.templates.TemplateBinding;
import org.muml.storydiagram.templates.TemplateSignature;
import org.muml.storydiagram.templates.TemplatesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Template Signature</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.templates.impl.TemplateSignatureImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link org.muml.storydiagram.templates.impl.TemplateSignatureImpl#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link org.muml.storydiagram.templates.impl.TemplateSignatureImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateSignatureImpl extends MinimalEObjectImpl.Container implements
		TemplateSignature {
	/**
	 * The cached value of the '{@link #getTemplateBinding() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> templateBinding;

	/**
	 * The cached value of the '{@link #getTypeParameter() <em>Type Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<EClassifier> typeParameter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemplatesPackage.Literals.TEMPLATE_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBinding() {
		if (templateBinding == null) {
			templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDING, TemplatesPackage.TEMPLATE_BINDING__TEMPLATE);
		}
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClassifier> getTypeParameter() {
		if (typeParameter == null) {
			typeParameter = new EObjectContainmentEList<EClassifier>(EClassifier.class, this, TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETER);
		}
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPattern getPattern() {
		if (eContainerFeatureID() != TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN) return null;
		return (StoryPattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(StoryPattern newPattern,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPattern, TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(StoryPattern newPattern) {
		if (newPattern != eInternalContainer() || (eContainerFeatureID() != TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN && newPattern != null)) {
			if (EcoreUtil.isAncestor(this, newPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE, StoryPattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
			case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPattern((StoryPattern)otherEnd, msgs);
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
			case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
				return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
			case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETER:
				return ((InternalEList<?>)getTypeParameter()).basicRemove(otherEnd, msgs);
			case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
				return basicSetPattern(null, msgs);
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
			case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
				return eInternalContainer().eInverseRemove(this, PatternsPackage.STORY_PATTERN__TEMPLATE_SIGNATURE, StoryPattern.class, msgs);
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
			case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
				return getTemplateBinding();
			case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETER:
				return getTypeParameter();
			case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
				return getPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETER:
				getTypeParameter().clear();
				getTypeParameter().addAll((Collection<? extends EClassifier>)newValue);
				return;
			case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
				setPattern((StoryPattern)newValue);
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
			case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				return;
			case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETER:
				getTypeParameter().clear();
				return;
			case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
				setPattern((StoryPattern)null);
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
			case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETER:
				return typeParameter != null && !typeParameter.isEmpty();
			case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
				return getPattern() != null;
		}
		return super.eIsSet(featureID);
	}

} // TemplateSignatureImpl
