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
 *   <li>{@link org.muml.storydiagram.templates.impl.TemplateSignatureImpl#getTemplateBindings <em>Template Bindings</em>}</li>
 *   <li>{@link org.muml.storydiagram.templates.impl.TemplateSignatureImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.muml.storydiagram.templates.impl.TemplateSignatureImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateSignatureImpl extends MinimalEObjectImpl.Container implements
		TemplateSignature {
	/**
	 * The cached value of the '{@link #getTemplateBindings() <em>Template Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> templateBindings;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EClassifier> typeParameters;

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
	public EList<TemplateBinding> getTemplateBindings() {
		if (templateBindings == null) {
			templateBindings = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDINGS, TemplatesPackage.TEMPLATE_BINDING__TEMPLATE);
		}
		return templateBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClassifier> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<EClassifier>(EClassifier.class, this, TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETERS);
		}
		return typeParameters;
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
			case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBindings()).basicAdd(otherEnd, msgs);
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
			case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDINGS:
				return ((InternalEList<?>)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
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
			case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDINGS:
				return getTemplateBindings();
			case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETERS:
				return getTypeParameters();
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
			case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDINGS:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends EClassifier>)newValue);
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
			case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDINGS:
				getTemplateBindings().clear();
				return;
			case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETERS:
				getTypeParameters().clear();
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
			case TemplatesPackage.TEMPLATE_SIGNATURE__TEMPLATE_BINDINGS:
				return templateBindings != null && !templateBindings.isEmpty();
			case TemplatesPackage.TEMPLATE_SIGNATURE__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case TemplatesPackage.TEMPLATE_SIGNATURE__PATTERN:
				return getPattern() != null;
		}
		return super.eIsSet(featureID);
	}

} // TemplateSignatureImpl
