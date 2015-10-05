/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.Comment;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.ElementExtension;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.TemplateBinding;
import org.eclipse.ocl.pivot.TemplateParameter;
import org.eclipse.ocl.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.WildcardType;
import org.eclipse.ocl.pivot.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.pivot.internal.TemplateParameterSubstitutionImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link org.eclipse.ocl.pivot.internal.TemplateParameterSubstitutionImpl#getFormal <em>Formal</em>}</li>
 *   <li>{@link org.eclipse.ocl.pivot.internal.TemplateParameterSubstitutionImpl#getOwnedWildcard <em>Owned Wildcard</em>}</li>
 *   <li>{@link org.eclipse.ocl.pivot.internal.TemplateParameterSubstitutionImpl#getOwningBinding <em>Owning Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateParameterSubstitutionImpl
		extends ElementImpl
		implements TemplateParameterSubstitution {

	/**
	 * The cached value of the '{@link #getActual() <em>Actual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual()
	 * @generated
	 * @ordered
	 */
	protected Type actual;

	/**
	 * The cached value of the '{@link #getFormal() <em>Formal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormal()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter formal;

	/**
	 * The cached value of the '{@link #getOwnedWildcard() <em>Owned Wildcard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedWildcard()
	 * @generated
	 * @ordered
	 */
	protected WildcardType ownedWildcard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateParameterSubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getActual() {
		if (actual != null && actual.eIsProxy())
		{
			InternalEObject oldActual = (InternalEObject)actual;
			actual = (Type)eResolveProxy(oldActual);
			if (actual != oldActual)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, oldActual, actual));
			}
		}
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetActual() {
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualGen(Type newActual)
	{
		Type oldActual = actual;
		actual = newActual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, oldActual, actual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateParameter getFormal() {
		if (formal != null && formal.eIsProxy())
		{
			InternalEObject oldFormal = (InternalEObject)formal;
			formal = (TemplateParameter)eResolveProxy(oldFormal);
			if (formal != oldFormal)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, oldFormal, formal));
			}
		}
		return formal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetFormal() {
		return formal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormal(TemplateParameter newFormal) {
		TemplateParameter oldFormal = formal;
		formal = newFormal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, oldFormal, formal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WildcardType getOwnedWildcard()
	{
		return ownedWildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedWildcard(WildcardType newOwnedWildcard, NotificationChain msgs)
	{
		WildcardType oldOwnedWildcard = ownedWildcard;
		ownedWildcard = newOwnedWildcard;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_WILDCARD, oldOwnedWildcard, newOwnedWildcard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedWildcard(WildcardType newOwnedWildcard)
	{
		if (newOwnedWildcard != ownedWildcard)
		{
			NotificationChain msgs = null;
			if (ownedWildcard != null)
				msgs = ((InternalEObject)ownedWildcard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_WILDCARD, null, msgs);
			if (newOwnedWildcard != null)
				msgs = ((InternalEObject)newOwnedWildcard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_WILDCARD, null, msgs);
			msgs = basicSetOwnedWildcard(newOwnedWildcard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_WILDCARD, newOwnedWildcard, newOwnedWildcard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateBinding getOwningBinding() {
		if (eContainerFeatureID() != PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNING_BINDING) return null;
		return (TemplateBinding)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningBinding(TemplateBinding newOwningBinding, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newOwningBinding, PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNING_BINDING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningBinding(TemplateBinding newOwningBinding)
	{
		if (newOwningBinding != eInternalContainer() || (eContainerFeatureID() != PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNING_BINDING && newOwningBinding != null))
		{
			if (EcoreUtil.isAncestor(this, newOwningBinding))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningBinding != null)
				msgs = ((InternalEObject)newOwningBinding).eInverseAdd(this, PivotPackage.TEMPLATE_BINDING__OWNED_SUBSTITUTIONS, TemplateBinding.class, msgs);
			msgs = basicSetOwningBinding(newOwningBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNING_BINDING, newOwningBinding, newOwningBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ANNOTATING_COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotatingComments()).basicAdd(otherEnd, msgs);
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedComments()).basicAdd(otherEnd, msgs);
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_EXTENSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedExtensions()).basicAdd(otherEnd, msgs);
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNING_BINDING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningBinding((TemplateBinding)otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ANNOTATING_COMMENTS:
				return ((InternalEList<?>)getAnnotatingComments()).basicRemove(otherEnd, msgs);
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ANNOTATIONS:
				return ((InternalEList<?>)getOwnedAnnotations()).basicRemove(otherEnd, msgs);
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENTS:
				return ((InternalEList<?>)getOwnedComments()).basicRemove(otherEnd, msgs);
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_EXTENSIONS:
				return ((InternalEList<?>)getOwnedExtensions()).basicRemove(otherEnd, msgs);
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_WILDCARD:
				return basicSetOwnedWildcard(null, msgs);
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNING_BINDING:
				return basicSetOwningBinding(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID())
		{
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNING_BINDING:
				return eInternalContainer().eInverseRemove(this, PivotPackage.TEMPLATE_BINDING__OWNED_SUBSTITUTIONS, TemplateBinding.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ANNOTATING_COMMENTS:
				return getAnnotatingComments();
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ANNOTATIONS:
				return getOwnedAnnotations();
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENTS:
				return getOwnedComments();
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_EXTENSIONS:
				return getOwnedExtensions();
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				if (resolve) return getActual();
				return basicGetActual();
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				if (resolve) return getFormal();
				return basicGetFormal();
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_WILDCARD:
				return getOwnedWildcard();
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNING_BINDING:
				return getOwningBinding();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ANNOTATING_COMMENTS:
				getAnnotatingComments().clear();
				getAnnotatingComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ANNOTATIONS:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Element>)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENTS:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_EXTENSIONS:
				getOwnedExtensions().clear();
				getOwnedExtensions().addAll((Collection<? extends ElementExtension>)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				setActual((Type)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				setFormal((TemplateParameter)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_WILDCARD:
				setOwnedWildcard((WildcardType)newValue);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNING_BINDING:
				setOwningBinding((TemplateBinding)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID)
		{
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ANNOTATING_COMMENTS:
				getAnnotatingComments().clear();
				return;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ANNOTATIONS:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENTS:
				getOwnedComments().clear();
				return;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_EXTENSIONS:
				getOwnedExtensions().clear();
				return;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				setActual((Type)null);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				setFormal((TemplateParameter)null);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_WILDCARD:
				setOwnedWildcard((WildcardType)null);
				return;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNING_BINDING:
				setOwningBinding((TemplateBinding)null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ANNOTATING_COMMENTS:
				return annotatingComments != null && !annotatingComments.isEmpty();
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ANNOTATIONS:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENTS:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_EXTENSIONS:
				return ownedExtensions != null && !ownedExtensions.isEmpty();
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				return actual != null;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				return formal != null;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_WILDCARD:
				return ownedWildcard != null;
			case PivotPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNING_BINDING:
				return getOwningBinding() != null;
		}
		return eDynamicIsSet(featureID);
	}

	@Override
	public <R> R accept(@NonNull Visitor<R> visitor) {
		return visitor.visitTemplateParameterSubstitution(this);
	}

	@Override
	public void setActual(Type newActual)
	{
		setActualGen(newActual);
		setOwnedWildcard(newActual instanceof WildcardType ? (WildcardType)newActual : null);
	}
} //TemplateParameterSubstitutionImpl
