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
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.Behavior;
import org.eclipse.ocl.pivot.Comment;
import org.eclipse.ocl.pivot.Constraint;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.ElementExtension;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.PrimitiveType;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.TemplateBinding;
import org.eclipse.ocl.pivot.TemplateSignature;
import org.eclipse.ocl.pivot.TemplateableElement;
import org.eclipse.ocl.pivot.StereotypeExtender;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.util.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.pivot.internal.PrimitiveTypeImpl#getCoercions <em>Coercions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveTypeImpl
		extends DataTypeImpl
		implements PrimitiveType {

	/**
	 * The cached value of the '{@link #getCoercions() <em>Coercions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoercions()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> coercions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.PRIMITIVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Operation> getCoercions()
	{
		if (coercions == null)
		{
			coercions = new EObjectResolvingEList<Operation>(Operation.class, this, PivotPackage.PRIMITIVE_TYPE__COERCIONS);
		}
		return coercions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case PivotPackage.PRIMITIVE_TYPE__ANNOTATING_COMMENTS:
				return getAnnotatingComments();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_ANNOTATIONS:
				return getOwnedAnnotations();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_COMMENTS:
				return getOwnedComments();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_EXTENSIONS:
				return getOwnedExtensions();
			case PivotPackage.PRIMITIVE_TYPE__NAME:
				return getName();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_CONSTRAINTS:
				return getOwnedConstraints();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_BINDINGS:
				return getOwnedBindings();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_SIGNATURE:
				return getOwnedSignature();
			case PivotPackage.PRIMITIVE_TYPE__UNSPECIALIZED_ELEMENT:
				return getUnspecializedElement();
			case PivotPackage.PRIMITIVE_TYPE__EXTENDERS:
				return getExtenders();
			case PivotPackage.PRIMITIVE_TYPE__INSTANCE_CLASS_NAME:
				return getInstanceClassName();
			case PivotPackage.PRIMITIVE_TYPE__IS_ABSTRACT:
				return isIsAbstract();
			case PivotPackage.PRIMITIVE_TYPE__IS_ACTIVE:
				return isIsActive();
			case PivotPackage.PRIMITIVE_TYPE__IS_INTERFACE:
				return isIsInterface();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_BEHAVIORS:
				return getOwnedBehaviors();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_INVARIANTS:
				return getOwnedInvariants();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_OPERATIONS:
				return getOwnedOperations();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_PROPERTIES:
				return getOwnedProperties();
			case PivotPackage.PRIMITIVE_TYPE__OWNING_PACKAGE:
				return getOwningPackage();
			case PivotPackage.PRIMITIVE_TYPE__SUPER_CLASSES:
				return getSuperClasses();
			case PivotPackage.PRIMITIVE_TYPE__BEHAVIORAL_CLASS:
				if (resolve) return getBehavioralClass();
				return basicGetBehavioralClass();
			case PivotPackage.PRIMITIVE_TYPE__IS_SERIALIZABLE:
				return isIsSerializable();
			case PivotPackage.PRIMITIVE_TYPE__COERCIONS:
				return getCoercions();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case PivotPackage.PRIMITIVE_TYPE__ANNOTATING_COMMENTS:
				getAnnotatingComments().clear();
				getAnnotatingComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_ANNOTATIONS:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Element>)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_COMMENTS:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_EXTENSIONS:
				getOwnedExtensions().clear();
				getOwnedExtensions().addAll((Collection<? extends ElementExtension>)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_CONSTRAINTS:
				getOwnedConstraints().clear();
				getOwnedConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_BINDINGS:
				getOwnedBindings().clear();
				getOwnedBindings().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_SIGNATURE:
				setOwnedSignature((TemplateSignature)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__UNSPECIALIZED_ELEMENT:
				setUnspecializedElement((TemplateableElement)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__EXTENDERS:
				getExtenders().clear();
				getExtenders().addAll((Collection<? extends StereotypeExtender>)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__INSTANCE_CLASS_NAME:
				setInstanceClassName((String)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__IS_INTERFACE:
				setIsInterface((Boolean)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_BEHAVIORS:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection<? extends Behavior>)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_INVARIANTS:
				getOwnedInvariants().clear();
				getOwnedInvariants().addAll((Collection<? extends Constraint>)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_OPERATIONS:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_PROPERTIES:
				getOwnedProperties().clear();
				getOwnedProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNING_PACKAGE:
				setOwningPackage((org.eclipse.ocl.pivot.Package)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__SUPER_CLASSES:
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection<? extends org.eclipse.ocl.pivot.Class>)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__BEHAVIORAL_CLASS:
				setBehavioralClass((org.eclipse.ocl.pivot.Class)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__IS_SERIALIZABLE:
				setIsSerializable((Boolean)newValue);
				return;
			case PivotPackage.PRIMITIVE_TYPE__COERCIONS:
				getCoercions().clear();
				getCoercions().addAll((Collection<? extends Operation>)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case PivotPackage.PRIMITIVE_TYPE__ANNOTATING_COMMENTS:
				getAnnotatingComments().clear();
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_ANNOTATIONS:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_COMMENTS:
				getOwnedComments().clear();
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_EXTENSIONS:
				getOwnedExtensions().clear();
				return;
			case PivotPackage.PRIMITIVE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_CONSTRAINTS:
				getOwnedConstraints().clear();
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_BINDINGS:
				getOwnedBindings().clear();
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_SIGNATURE:
				setOwnedSignature((TemplateSignature)null);
				return;
			case PivotPackage.PRIMITIVE_TYPE__UNSPECIALIZED_ELEMENT:
				setUnspecializedElement((TemplateableElement)null);
				return;
			case PivotPackage.PRIMITIVE_TYPE__EXTENDERS:
				getExtenders().clear();
				return;
			case PivotPackage.PRIMITIVE_TYPE__INSTANCE_CLASS_NAME:
				setInstanceClassName(INSTANCE_CLASS_NAME_EDEFAULT);
				return;
			case PivotPackage.PRIMITIVE_TYPE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case PivotPackage.PRIMITIVE_TYPE__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case PivotPackage.PRIMITIVE_TYPE__IS_INTERFACE:
				setIsInterface(IS_INTERFACE_EDEFAULT);
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_BEHAVIORS:
				getOwnedBehaviors().clear();
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_INVARIANTS:
				getOwnedInvariants().clear();
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_OPERATIONS:
				getOwnedOperations().clear();
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_PROPERTIES:
				getOwnedProperties().clear();
				return;
			case PivotPackage.PRIMITIVE_TYPE__OWNING_PACKAGE:
				setOwningPackage((org.eclipse.ocl.pivot.Package)null);
				return;
			case PivotPackage.PRIMITIVE_TYPE__SUPER_CLASSES:
				getSuperClasses().clear();
				return;
			case PivotPackage.PRIMITIVE_TYPE__BEHAVIORAL_CLASS:
				setBehavioralClass((org.eclipse.ocl.pivot.Class)null);
				return;
			case PivotPackage.PRIMITIVE_TYPE__IS_SERIALIZABLE:
				setIsSerializable(IS_SERIALIZABLE_EDEFAULT);
				return;
			case PivotPackage.PRIMITIVE_TYPE__COERCIONS:
				getCoercions().clear();
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case PivotPackage.PRIMITIVE_TYPE__ANNOTATING_COMMENTS:
				return annotatingComments != null && !annotatingComments.isEmpty();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_ANNOTATIONS:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_COMMENTS:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_EXTENSIONS:
				return ownedExtensions != null && !ownedExtensions.isEmpty();
			case PivotPackage.PRIMITIVE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.PRIMITIVE_TYPE__OWNED_CONSTRAINTS:
				return ownedConstraints != null && !ownedConstraints.isEmpty();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_BINDINGS:
				return ownedBindings != null && !ownedBindings.isEmpty();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_SIGNATURE:
				return ownedSignature != null;
			case PivotPackage.PRIMITIVE_TYPE__UNSPECIALIZED_ELEMENT:
				return unspecializedElement != null;
			case PivotPackage.PRIMITIVE_TYPE__EXTENDERS:
				return extenders != null && !extenders.isEmpty();
			case PivotPackage.PRIMITIVE_TYPE__INSTANCE_CLASS_NAME:
				return INSTANCE_CLASS_NAME_EDEFAULT == null ? instanceClassName != null : !INSTANCE_CLASS_NAME_EDEFAULT.equals(instanceClassName);
			case PivotPackage.PRIMITIVE_TYPE__IS_ABSTRACT:
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case PivotPackage.PRIMITIVE_TYPE__IS_ACTIVE:
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case PivotPackage.PRIMITIVE_TYPE__IS_INTERFACE:
				return ((eFlags & IS_INTERFACE_EFLAG) != 0) != IS_INTERFACE_EDEFAULT;
			case PivotPackage.PRIMITIVE_TYPE__OWNED_BEHAVIORS:
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_INVARIANTS:
				return ownedInvariants != null && !ownedInvariants.isEmpty();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_OPERATIONS:
				return ownedOperations != null && !ownedOperations.isEmpty();
			case PivotPackage.PRIMITIVE_TYPE__OWNED_PROPERTIES:
				return ownedProperties != null && !ownedProperties.isEmpty();
			case PivotPackage.PRIMITIVE_TYPE__OWNING_PACKAGE:
				return getOwningPackage() != null;
			case PivotPackage.PRIMITIVE_TYPE__SUPER_CLASSES:
				return superClasses != null && !superClasses.isEmpty();
			case PivotPackage.PRIMITIVE_TYPE__BEHAVIORAL_CLASS:
				return behavioralClass != null;
			case PivotPackage.PRIMITIVE_TYPE__IS_SERIALIZABLE:
				return ((eFlags & IS_SERIALIZABLE_EFLAG) != 0) != IS_SERIALIZABLE_EDEFAULT;
			case PivotPackage.PRIMITIVE_TYPE__COERCIONS:
				return coercions != null && !coercions.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	@Override
	public <R> R accept(@NonNull Visitor<R> visitor) {
		return visitor.visitPrimitiveType(this);
	}
	
	@Override
	public @NonNull TypeId computeId() {
		String name2 = getName();
		assert name2 != null;
		return IdManager.getPrimitiveTypeId(name2);
	}
} //PrimitiveTypeImpl
