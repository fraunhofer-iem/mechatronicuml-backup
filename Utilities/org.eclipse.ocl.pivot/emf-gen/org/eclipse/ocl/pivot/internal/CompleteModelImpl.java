/**
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package org.eclipse.ocl.pivot.internal;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.CollectionType;
import org.eclipse.ocl.pivot.Comment;
import org.eclipse.ocl.pivot.CompleteEnvironment;
import org.eclipse.ocl.pivot.CompleteModel;
import org.eclipse.ocl.pivot.CompletePackage;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.ElementExtension;
import org.eclipse.ocl.pivot.LambdaType;
import org.eclipse.ocl.pivot.MapType;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.OrphanCompletePackage;
import org.eclipse.ocl.pivot.PivotFactory;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.PrimitiveCompletePackage;
import org.eclipse.ocl.pivot.TemplateBinding;
import org.eclipse.ocl.pivot.TemplateParameter;
import org.eclipse.ocl.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.pivot.TupleType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.internal.complete.CompleteClassInternal;
import org.eclipse.ocl.pivot.internal.complete.CompleteEnvironmentInternal;
import org.eclipse.ocl.pivot.internal.complete.CompleteInheritanceImpl;
import org.eclipse.ocl.pivot.internal.complete.CompleteModelInternal;
import org.eclipse.ocl.pivot.internal.complete.CompletePackageInternal;
import org.eclipse.ocl.pivot.internal.complete.CompleteURIs;
import org.eclipse.ocl.pivot.internal.complete.PartialModels;
import org.eclipse.ocl.pivot.internal.complete.RootCompletePackages;
import org.eclipse.ocl.pivot.internal.complete.StandardLibraryInternal;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.internal.manager.Orphanage;
import org.eclipse.ocl.pivot.internal.manager.TupleTypeManager;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.util.Visitor;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.values.CollectionTypeParameters;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.MapTypeParameters;
import org.eclipse.ocl.pivot.values.TemplateParameterSubstitutions;
import org.eclipse.ocl.pivot.values.UnlimitedNaturalValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Model</b></em>'.
 * @extends org.eclipse.ocl.pivot.internal.complete.CompleteModelInternal
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.pivot.internal.CompleteModelImpl#getOrphanCompletePackage <em>Orphan Complete Package</em>}</li>
 *   <li>{@link org.eclipse.ocl.pivot.internal.CompleteModelImpl#getOwnedCompletePackages <em>Owned Complete Packages</em>}</li>
 *   <li>{@link org.eclipse.ocl.pivot.internal.CompleteModelImpl#getOwningCompleteEnvironment <em>Owning Complete Environment</em>}</li>
 *   <li>{@link org.eclipse.ocl.pivot.internal.CompleteModelImpl#getPartialModels <em>Partial Models</em>}</li>
 *   <li>{@link org.eclipse.ocl.pivot.internal.CompleteModelImpl#getPrimitiveCompletePackage <em>Primitive Complete Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompleteModelImpl extends NamedElementImpl implements CompleteModel, org.eclipse.ocl.pivot.internal.complete.CompleteModelInternal
{
	/**
	 * The cached value of the '{@link #getOrphanCompletePackage() <em>Orphan Complete Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrphanCompletePackage()
	 * @generated
	 * @ordered
	 */
	protected OrphanCompletePackage orphanCompletePackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PivotPackage.Literals.COMPLETE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PivotPackage.COMPLETE_MODEL__ANNOTATING_COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotatingComments()).basicAdd(otherEnd, msgs);
			case PivotPackage.COMPLETE_MODEL__OWNED_COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedComments()).basicAdd(otherEnd, msgs);
			case PivotPackage.COMPLETE_MODEL__OWNED_EXTENSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedExtensions()).basicAdd(otherEnd, msgs);
			case PivotPackage.COMPLETE_MODEL__OWNED_COMPLETE_PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedCompletePackages()).basicAdd(otherEnd, msgs);
			case PivotPackage.COMPLETE_MODEL__OWNING_COMPLETE_ENVIRONMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningCompleteEnvironment((CompleteEnvironment)otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case PivotPackage.COMPLETE_MODEL__ANNOTATING_COMMENTS:
				return ((InternalEList<?>)getAnnotatingComments()).basicRemove(otherEnd, msgs);
			case PivotPackage.COMPLETE_MODEL__OWNED_ANNOTATIONS:
				return ((InternalEList<?>)getOwnedAnnotations()).basicRemove(otherEnd, msgs);
			case PivotPackage.COMPLETE_MODEL__OWNED_COMMENTS:
				return ((InternalEList<?>)getOwnedComments()).basicRemove(otherEnd, msgs);
			case PivotPackage.COMPLETE_MODEL__OWNED_EXTENSIONS:
				return ((InternalEList<?>)getOwnedExtensions()).basicRemove(otherEnd, msgs);
			case PivotPackage.COMPLETE_MODEL__OWNED_COMPLETE_PACKAGES:
				return ((InternalEList<?>)getOwnedCompletePackages()).basicRemove(otherEnd, msgs);
			case PivotPackage.COMPLETE_MODEL__OWNING_COMPLETE_ENVIRONMENT:
				return basicSetOwningCompleteEnvironment(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case PivotPackage.COMPLETE_MODEL__OWNING_COMPLETE_ENVIRONMENT:
				return eInternalContainer().eInverseRemove(this, PivotPackage.COMPLETE_ENVIRONMENT__OWNED_COMPLETE_MODEL, CompleteEnvironment.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
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
			case PivotPackage.COMPLETE_MODEL__ANNOTATING_COMMENTS:
				return getAnnotatingComments();
			case PivotPackage.COMPLETE_MODEL__OWNED_ANNOTATIONS:
				return getOwnedAnnotations();
			case PivotPackage.COMPLETE_MODEL__OWNED_COMMENTS:
				return getOwnedComments();
			case PivotPackage.COMPLETE_MODEL__OWNED_EXTENSIONS:
				return getOwnedExtensions();
			case PivotPackage.COMPLETE_MODEL__NAME:
				return getName();
			case PivotPackage.COMPLETE_MODEL__ORPHAN_COMPLETE_PACKAGE:
				return getOrphanCompletePackage();
			case PivotPackage.COMPLETE_MODEL__OWNED_COMPLETE_PACKAGES:
				return getOwnedCompletePackages();
			case PivotPackage.COMPLETE_MODEL__OWNING_COMPLETE_ENVIRONMENT:
				return getOwningCompleteEnvironment();
			case PivotPackage.COMPLETE_MODEL__PARTIAL_MODELS:
				return getPartialModels();
			case PivotPackage.COMPLETE_MODEL__PRIMITIVE_COMPLETE_PACKAGE:
				return getPrimitiveCompletePackage();
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
			case PivotPackage.COMPLETE_MODEL__ANNOTATING_COMMENTS:
				getAnnotatingComments().clear();
				getAnnotatingComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.COMPLETE_MODEL__OWNED_ANNOTATIONS:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Element>)newValue);
				return;
			case PivotPackage.COMPLETE_MODEL__OWNED_COMMENTS:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.COMPLETE_MODEL__OWNED_EXTENSIONS:
				getOwnedExtensions().clear();
				getOwnedExtensions().addAll((Collection<? extends ElementExtension>)newValue);
				return;
			case PivotPackage.COMPLETE_MODEL__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.COMPLETE_MODEL__OWNED_COMPLETE_PACKAGES:
				getOwnedCompletePackages().clear();
				getOwnedCompletePackages().addAll((Collection<? extends CompletePackage>)newValue);
				return;
			case PivotPackage.COMPLETE_MODEL__OWNING_COMPLETE_ENVIRONMENT:
				setOwningCompleteEnvironment((CompleteEnvironment)newValue);
				return;
			case PivotPackage.COMPLETE_MODEL__PARTIAL_MODELS:
				getPartialModels().clear();
				getPartialModels().addAll((Collection<? extends Model>)newValue);
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
			case PivotPackage.COMPLETE_MODEL__ANNOTATING_COMMENTS:
				getAnnotatingComments().clear();
				return;
			case PivotPackage.COMPLETE_MODEL__OWNED_ANNOTATIONS:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.COMPLETE_MODEL__OWNED_COMMENTS:
				getOwnedComments().clear();
				return;
			case PivotPackage.COMPLETE_MODEL__OWNED_EXTENSIONS:
				getOwnedExtensions().clear();
				return;
			case PivotPackage.COMPLETE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.COMPLETE_MODEL__OWNED_COMPLETE_PACKAGES:
				getOwnedCompletePackages().clear();
				return;
			case PivotPackage.COMPLETE_MODEL__OWNING_COMPLETE_ENVIRONMENT:
				setOwningCompleteEnvironment((CompleteEnvironment)null);
				return;
			case PivotPackage.COMPLETE_MODEL__PARTIAL_MODELS:
				getPartialModels().clear();
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
			case PivotPackage.COMPLETE_MODEL__ANNOTATING_COMMENTS:
				return annotatingComments != null && !annotatingComments.isEmpty();
			case PivotPackage.COMPLETE_MODEL__OWNED_ANNOTATIONS:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.COMPLETE_MODEL__OWNED_COMMENTS:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.COMPLETE_MODEL__OWNED_EXTENSIONS:
				return ownedExtensions != null && !ownedExtensions.isEmpty();
			case PivotPackage.COMPLETE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.COMPLETE_MODEL__ORPHAN_COMPLETE_PACKAGE:
				return orphanCompletePackage != null;
			case PivotPackage.COMPLETE_MODEL__OWNED_COMPLETE_PACKAGES:
				return ownedCompletePackages != null && !ownedCompletePackages.isEmpty();
			case PivotPackage.COMPLETE_MODEL__OWNING_COMPLETE_ENVIRONMENT:
				return getOwningCompleteEnvironment() != null;
			case PivotPackage.COMPLETE_MODEL__PARTIAL_MODELS:
				return partialModels != null && !partialModels.isEmpty();
			case PivotPackage.COMPLETE_MODEL__PRIMITIVE_COMPLETE_PACKAGE:
				return primitiveCompletePackage != null;
		}
		return eDynamicIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case PivotPackage.COMPLETE_MODEL___ALL_OWNED_ELEMENTS:
				return allOwnedElements();
			case PivotPackage.COMPLETE_MODEL___GET_VALUE__TYPE_STRING:
				return getValue((Type)arguments.get(0), (String)arguments.get(1));
			case PivotPackage.COMPLETE_MODEL___GET_OWNED_COMPLETE_PACKAGE__STRING:
				return getOwnedCompletePackage((String)arguments.get(0));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * The cached value of the '{@link #getOwnedCompletePackages() <em>Owned Complete Packages</em>}' containment reference list.
	 */
	protected /*final @NonNull*/ RootCompletePackages ownedCompletePackages;

	/**
	 * The cached value of the '{@link #getPartialModels() <em>Partial Roots</em>}' reference list.
	 */
	protected /*final @NonNull*/ PartialModels partialModels;

	/**
	 * The cached value of the '{@link #getPrimitiveCompletePackage() <em>Primitive Complete Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveCompletePackage()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveCompletePackage primitiveCompletePackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompleteModelImpl()
	{
		super();
	}

	/**
	 * Map from each partial Class to the CompleteClass that supervises its merge. CompleteClass are created lazily. 
	 */
	private /*final @NonNull*/ CompleteEnvironmentInternal completeEnvironment;

	/**
	 * Map from complete to/from package URI. 
	 */
	private final @NonNull CompleteURIs completeURIs = new CompleteURIs(this);
	
	protected /*final @NonNull*/ EnvironmentFactoryInternal environmentFactory;
	
	private Orphanage orphanage = null;

	@Override
	public <R> R accept(@NonNull Visitor<R> visitor) {
		return visitor.visitCompleteModel(this);
	}

	/**
	 * Partial models such as the OCL Standard Library have their own distinct package URI. These partial
	 * models are merged by mapping the package URI to a complete URI. DomainConstants.METAMODEL_NAME is the
	 * complete URI for all contributions merged as the overall OCL metamodel. 
	 */
	@Override
	public void addPackageURI2completeURI(@NonNull String packageURI, @NonNull String newCompleteURI) {
		completeURIs.addPackageURI2completeURI(packageURI, newCompleteURI);
	}

	@Override
	public boolean conformsTo(@NonNull Type firstType, @NonNull TemplateParameterSubstitutions firstSubstitutions,
			@NonNull Type secondType, @NonNull TemplateParameterSubstitutions secondSubstitutions) {
		return completeEnvironment.conformsTo(firstType, firstSubstitutions, secondType, secondSubstitutions);
	}

	@Override
	public void didAddClass(@NonNull org.eclipse.ocl.pivot.Class partialClass, @NonNull CompleteClassInternal completeClass) {
		completeEnvironment.didAddClass(partialClass, completeClass);
	}

	@Override
	public void didAddCompletePackage(@NonNull CompletePackageInternal completePackage) {
		completeURIs.didAddCompletePackage(completePackage);
	}

	@Override
	public void didAddNestedPackage(@NonNull org.eclipse.ocl.pivot.Package pivotPackage) {
		ownedCompletePackages.didAddPackage(pivotPackage);
	}
	
	@Override
	public void didAddPartialModel(@NonNull Model partialModel) {
		completeURIs.didAddPartialModel(partialModel);
	}
	
	@Override
	public void didRemoveClass(@NonNull org.eclipse.ocl.pivot.Class pivotType) {
		completeEnvironment.didRemoveClass(pivotType);
	}

	@Override
	public void didRemoveCompletePackage(@NonNull CompletePackageInternal completePackage) {
		if (completePackage == primitiveCompletePackage) {
			primitiveCompletePackage = null;
		}
		completeURIs.didRemoveCompletePackage(completePackage);
	}

	@Override
	public void didRemoveNestedPackage(@NonNull org.eclipse.ocl.pivot.Package pivotPackage) {
		ownedCompletePackages.didRemovePackage(pivotPackage);
	}
	
	@Override
	public void didRemovePartialModel(@NonNull Model partialModel) {
		completeURIs.didRemovePartialModel(partialModel);
	}

	@Override
	public synchronized void dispose() {
		completeEnvironment.dispose();
		ownedCompletePackages.dispose();
		completeURIs.dispose();
		Orphanage orphanage2 = orphanage;
		if (orphanage2 != null) {
			orphanage2.removePackageListener(getOrphanCompletePackage().getPartialPackages());
			orphanage = null;
		}
	}

	@Override
	public @Nullable CollectionType findCollectionType(@NonNull CompleteClassInternal completeClass, @NonNull CollectionTypeParameters<Type> typeParameters) {
		return completeEnvironment.findCollectionType(completeClass, typeParameters);
	}

	@Override
	public @Nullable MapType findMapType(@NonNull CompleteClassInternal completeClass, @NonNull MapTypeParameters<Type, Type> typeParameters) {
		return completeEnvironment.findMapType(completeClass, typeParameters);
	}

	@Override
	public @NonNull Iterable<CompletePackageInternal> getAllCompletePackages() {
		return completeURIs.getAllCompletePackages();
	}

	@Override
	public @NonNull Iterable<? extends CompletePackage> getAllCompletePackagesWithUris() {
		return completeURIs.getAllCompletePackagesWithUris();
	}

	@Override
	public @NonNull CollectionType getCollectionType(@NonNull CompleteClassInternal completeClass, @NonNull CollectionTypeParameters<Type> typeParameters) {
		return completeEnvironment.getCollectionType(completeClass, typeParameters);
	}

	public @NonNull CollectionType getCollectionType(@NonNull CompleteClassInternal completeClass, @NonNull Type elementType, boolean isNullFree, @Nullable IntegerValue lower, @Nullable UnlimitedNaturalValue upper) {
		return completeEnvironment.getCollectionType(completeClass, TypeUtil.createCollectionTypeParameters(elementType, isNullFree, lower, upper));
	}
	
	@Override
	public @NonNull CompleteClassInternal getCompleteClass(@NonNull Type pivotType) {
		return completeEnvironment.getCompleteClass(pivotType);
	}

	@Override
	public @NonNull CompleteEnvironmentInternal getCompleteEnvironment() {
		assert completeEnvironment != null;
		return completeEnvironment;
	}

	@Override
	public @NonNull CompletePackageInternal getCompletePackage(@NonNull org.eclipse.ocl.pivot.Package asPackage) {
		return ownedCompletePackages.getCompletePackage(asPackage);
	}

	@Override
	public @Nullable CompletePackageInternal getCompletePackageByURI(@NonNull String packageURI) {
		return completeURIs.getCompletePackageByURI(packageURI);
	}

	@Override
	public @Nullable String getCompleteURI(@Nullable String packageURI) {
		return completeURIs.getCompleteURI(packageURI);
	}

	@Override
	public @NonNull CompleteURIs getCompleteURIs() {
		return completeURIs;
	}
	
	@Override
	public @NonNull LambdaType getLambdaType(@NonNull String typeName, @NonNull Type contextType, @NonNull List<? extends Type> parameterTypes, @NonNull Type resultType) {
		return completeEnvironment.getLambdaType(typeName, contextType, parameterTypes, resultType, null);
	}

	@Override
	public @NonNull LambdaType getLambdaType(@NonNull String typeName, @NonNull Type contextType, @NonNull List<? extends Type> parameterTypes, @NonNull Type resultType,
			@Nullable TemplateParameterSubstitutions bindings) {
		return completeEnvironment.getLambdaType(typeName, contextType, parameterTypes, resultType, bindings);
	}

	@Override
	public @NonNull MapType getMapType(@NonNull CompleteClassInternal completeClass, @NonNull MapTypeParameters<Type, Type> typeParameters) {
		return completeEnvironment.getMapType(completeClass, typeParameters);
	}

	public @Nullable CompletePackage getMemberPackage(@NonNull String memberPackageName) {
		return ownedCompletePackages.getOwnedCompletePackage(memberPackageName);
	}

	public @NonNull Iterable<? extends CompletePackage> getMemberPackages() {
		assert ownedCompletePackages != null;
		return ownedCompletePackages;
	}

	@Override
	public @NonNull PivotMetamodelManager getMetamodelManager() {
		return environmentFactory.getMetamodelManager();
	}

	@Override
	@SuppressWarnings("null")
	public @NonNull OrphanCompletePackageImpl getOrphanCompletePackage()
	{
		OrphanCompletePackage orphanCompletePackage2 = orphanCompletePackage;
		if (orphanCompletePackage2 == null) {
			orphanCompletePackage2 = orphanCompletePackage = PivotFactory.eINSTANCE.createOrphanCompletePackage();
			ownedCompletePackages.add(orphanCompletePackage2);
		}
		return (OrphanCompletePackageImpl)orphanCompletePackage2;
	}

	@Override
	public @NonNull Orphanage getOrphanage() {
		Orphanage orphanage2 = orphanage;
		if (orphanage2 == null) {
			orphanage2 = orphanage = environmentFactory.getMetamodelManager().createOrphanage();
			orphanage2.addPackageListener(getOrphanCompletePackage().getPartialPackages());
		}
		return orphanage2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public @NonNull List<CompletePackage> getOwnedCompletePackages() {
		assert ownedCompletePackages != null;
		return ownedCompletePackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompleteEnvironment getOwningCompleteEnvironment()
	{
		if (eContainerFeatureID() != PivotPackage.COMPLETE_MODEL__OWNING_COMPLETE_ENVIRONMENT) return null;
		return (CompleteEnvironment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningCompleteEnvironment(CompleteEnvironment newOwningCompleteEnvironment, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newOwningCompleteEnvironment, PivotPackage.COMPLETE_MODEL__OWNING_COMPLETE_ENVIRONMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningCompleteEnvironment(CompleteEnvironment newOwningCompleteEnvironment)
	{
		if (newOwningCompleteEnvironment != eInternalContainer() || (eContainerFeatureID() != PivotPackage.COMPLETE_MODEL__OWNING_COMPLETE_ENVIRONMENT && newOwningCompleteEnvironment != null))
		{
			if (EcoreUtil.isAncestor(this, newOwningCompleteEnvironment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningCompleteEnvironment != null)
				msgs = ((InternalEObject)newOwningCompleteEnvironment).eInverseAdd(this, PivotPackage.COMPLETE_ENVIRONMENT__OWNED_COMPLETE_MODEL, CompleteEnvironment.class, msgs);
			msgs = basicSetOwningCompleteEnvironment(newOwningCompleteEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.COMPLETE_MODEL__OWNING_COMPLETE_ENVIRONMENT, newOwningCompleteEnvironment, newOwningCompleteEnvironment));
	}

	@Override
	public @NonNull EnvironmentFactoryInternal getEnvironmentFactory() {
		return ClassUtil.nonNullState(environmentFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public @NonNull PartialModels getPartialModels() {
		assert partialModels != null;
		return partialModels;
	}
	
	@Override
	@SuppressWarnings("null")
	public @NonNull PrimitiveCompletePackageImpl getPrimitiveCompletePackage()
	{
		PrimitiveCompletePackage primitiveCompletePackage2 = primitiveCompletePackage;
		if (primitiveCompletePackage2 == null) {
			primitiveCompletePackage2 = primitiveCompletePackage = PivotFactory.eINSTANCE.createPrimitiveCompletePackage();
			ownedCompletePackages.add(primitiveCompletePackage2);
		}
		return (PrimitiveCompletePackageImpl) primitiveCompletePackage2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public @Nullable CompletePackage getOwnedCompletePackage(@Nullable String completeURIorName) {
		CompletePackage completePackage = completeURIs.getCompletePackage(completeURIorName);
		if (completePackage != null) {
			return completePackage;
		}
		return ownedCompletePackages.getOwnedCompletePackage(completeURIorName);
	}

	@Override
	public @Nullable org.eclipse.ocl.pivot.Package getRootPackage(@NonNull String completeURIorName) {
		CompletePackage completePackage = completeURIs.getCompletePackage(completeURIorName);
		if (completePackage != null) {
			return completePackage.getPrimaryPackage();
		}
		completePackage = getOwnedCompletePackage(completeURIorName);
		return completePackage != null ? completePackage.getPrimaryPackage() : null;
	}
	
	@Override
	public @NonNull Type getSpecializedType(@NonNull Type type, @Nullable TemplateParameterSubstitutions substitutions) {
		return completeEnvironment.getSpecializedType(type, substitutions);
	}

	@Override
	public @NonNull StandardLibraryInternal getStandardLibrary() {
		return completeEnvironment.getOwnedStandardLibrary();
	}
	
	@Override
	public @NonNull TupleTypeManager getTupleManager() {
		return completeEnvironment.getTupleManager();
	}

	@Override
	public @NonNull TupleType getTupleType(@NonNull String typeName, @NonNull Collection<? extends TypedElement> parts,
			@Nullable TemplateParameterSubstitutions bindings) {
		return completeEnvironment.getTupleType(typeName, parts, bindings);
	}

	@Override
	public @NonNull CompleteModelInternal init(@NonNull CompleteEnvironmentInternal completeEnvironment) {
		this.completeEnvironment = completeEnvironment;
		this.environmentFactory = completeEnvironment.getEnvironmentFactory();
		partialModels = new PartialModels(this);
		ownedCompletePackages = new RootCompletePackages(this);
		return this;
	}

/*	public void removedType(@NonNull org.eclipse.ocl.pivot.Class pivotType) {
		CompleteClass completeClass = class2completeClass.get(pivotType);
		if (completeClass != null) {
//			completeClass.dispose();
		}
	} */

	@Override
	public void resolveSuperClasses(@NonNull org.eclipse.ocl.pivot.Class specializedClass, @NonNull org.eclipse.ocl.pivot.Class unspecializedClass) {
		List<TemplateBinding> specializedTemplateBindings = specializedClass.getOwnedBindings();
		for (org.eclipse.ocl.pivot.Class superClass : unspecializedClass.getSuperClasses()) {
			List<TemplateBinding> superTemplateBindings = superClass.getOwnedBindings();
			if (superTemplateBindings.size() > 0) {
				List<TemplateParameterSubstitution> superSpecializedTemplateParameterSubstitutions = new ArrayList<TemplateParameterSubstitution>();
				for (TemplateBinding superTemplateBinding : superTemplateBindings) {
					for (TemplateParameterSubstitution superParameterSubstitution : superTemplateBinding.getOwnedSubstitutions()) {
						TemplateParameterSubstitution superSpecializedTemplateParameterSubstitution = null;
						Type superActual = superParameterSubstitution.getActual();
						for (TemplateBinding specializedTemplateBinding : specializedTemplateBindings) {
							for (TemplateParameterSubstitution specializedParameterSubstitution : specializedTemplateBinding.getOwnedSubstitutions()) {
								if (specializedParameterSubstitution.getFormal() == superActual) {
									Type specializedActual = ClassUtil.nonNullModel(specializedParameterSubstitution.getActual());
									TemplateParameter superFormal = ClassUtil.nonNullModel(superParameterSubstitution.getFormal());
									superSpecializedTemplateParameterSubstitution = PivotUtil.createTemplateParameterSubstitution(superFormal, specializedActual);
									break;
								}
							}
							if (superSpecializedTemplateParameterSubstitution != null) {
								break;
							}
						}
						if (superSpecializedTemplateParameterSubstitution != null) {
							superSpecializedTemplateParameterSubstitutions.add(superSpecializedTemplateParameterSubstitution);
						}
					}
				}
				@NonNull org.eclipse.ocl.pivot.Class unspecializedSuperClass = PivotUtil.getUnspecializedTemplateableElement(superClass);
				CompleteClassInternal superCompleteClass = environmentFactory.getMetamodelManager().getCompleteClass(unspecializedSuperClass);
				org.eclipse.ocl.pivot.Class superPivotClass = superCompleteClass.getPrimaryClass();
				if (superPivotClass instanceof CollectionType) {
					if (superSpecializedTemplateParameterSubstitutions.size() == 1) {
						Type templateArgument = superSpecializedTemplateParameterSubstitutions.get(0).getActual();
						if (templateArgument != null) {
							org.eclipse.ocl.pivot.Class specializedSuperClass = completeEnvironment.getCollectionType(superCompleteClass, TypeUtil.createCollectionTypeParameters(templateArgument, false, null, null));
							specializedClass.getSuperClasses().add(specializedSuperClass);
						}
					}
				}
				else {
					List<Type> superTemplateArgumentList = new ArrayList<Type>(superSpecializedTemplateParameterSubstitutions.size());
					for (TemplateParameterSubstitution superSpecializedTemplateParameterSubstitution : superSpecializedTemplateParameterSubstitutions) {
						superTemplateArgumentList.add(superSpecializedTemplateParameterSubstitution.getActual());
					}
					CompleteInheritanceImpl superCompleteInheritance = superCompleteClass.getCompleteInheritance();
					org.eclipse.ocl.pivot.Class specializedSuperType = superCompleteInheritance.getCompleteClass().getPartialClasses().getSpecializedType(superTemplateArgumentList);
					specializedClass.getSuperClasses().add(specializedSuperType);
				}
			}
			else {
				specializedClass.getSuperClasses().add(superClass);
			}
		}
	}
} //CompleteModelImpl
