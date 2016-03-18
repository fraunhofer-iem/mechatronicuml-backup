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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.CollectionType;
import org.eclipse.ocl.pivot.Comment;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.ElementExtension;
import org.eclipse.ocl.pivot.IterateExp;
import org.eclipse.ocl.pivot.Iteration;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.PivotTables;
import org.eclipse.ocl.pivot.ReferringElement;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.ValueSpecification;
import org.eclipse.ocl.pivot.Variable;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.classifier.OclTypeConformsToOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.util.Visitor;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterate Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.pivot.internal.IterateExpImpl#getOwnedResult <em>Owned Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IterateExpImpl extends LoopExpImpl implements IterateExp
{
	/**
	 * The cached value of the '{@link #getOwnedResult() <em>Owned Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedResult()
	 * @generated
	 * @ordered
	 */
	protected Variable ownedResult;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterateExpImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PivotPackage.Literals.ITERATE_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getOwnedResult()
	{
		return ownedResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedResult(Variable newOwnedResult, NotificationChain msgs)
	{
		Variable oldOwnedResult = ownedResult;
		ownedResult = newOwnedResult;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PivotPackage.ITERATE_EXP__OWNED_RESULT, oldOwnedResult, newOwnedResult);
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
	public void setOwnedResult(Variable newOwnedResult)
	{
		if (newOwnedResult != ownedResult)
		{
			NotificationChain msgs = null;
			if (ownedResult != null)
				msgs = ((InternalEObject)ownedResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PivotPackage.ITERATE_EXP__OWNED_RESULT, null, msgs);
			if (newOwnedResult != null)
				msgs = ((InternalEObject)newOwnedResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PivotPackage.ITERATE_EXP__OWNED_RESULT, null, msgs);
			msgs = basicSetOwnedResult(newOwnedResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.ITERATE_EXP__OWNED_RESULT, newOwnedResult, newOwnedResult));
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
			case PivotPackage.ITERATE_EXP__ANNOTATING_COMMENTS:
				return ((InternalEList<?>)getAnnotatingComments()).basicRemove(otherEnd, msgs);
			case PivotPackage.ITERATE_EXP__OWNED_ANNOTATIONS:
				return ((InternalEList<?>)getOwnedAnnotations()).basicRemove(otherEnd, msgs);
			case PivotPackage.ITERATE_EXP__OWNED_COMMENTS:
				return ((InternalEList<?>)getOwnedComments()).basicRemove(otherEnd, msgs);
			case PivotPackage.ITERATE_EXP__OWNED_EXTENSIONS:
				return ((InternalEList<?>)getOwnedExtensions()).basicRemove(otherEnd, msgs);
			case PivotPackage.ITERATE_EXP__OWNED_SOURCE:
				return basicSetOwnedSource(null, msgs);
			case PivotPackage.ITERATE_EXP__OWNED_BODY:
				return basicSetOwnedBody(null, msgs);
			case PivotPackage.ITERATE_EXP__OWNED_ITERATORS:
				return ((InternalEList<?>)getOwnedIterators()).basicRemove(otherEnd, msgs);
			case PivotPackage.ITERATE_EXP__OWNED_RESULT:
				return basicSetOwnedResult(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
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
			case PivotPackage.ITERATE_EXP__ANNOTATING_COMMENTS:
				return getAnnotatingComments();
			case PivotPackage.ITERATE_EXP__OWNED_ANNOTATIONS:
				return getOwnedAnnotations();
			case PivotPackage.ITERATE_EXP__OWNED_COMMENTS:
				return getOwnedComments();
			case PivotPackage.ITERATE_EXP__OWNED_EXTENSIONS:
				return getOwnedExtensions();
			case PivotPackage.ITERATE_EXP__NAME:
				return getName();
			case PivotPackage.ITERATE_EXP__IS_MANY:
				return isIsMany();
			case PivotPackage.ITERATE_EXP__IS_REQUIRED:
				return isIsRequired();
			case PivotPackage.ITERATE_EXP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case PivotPackage.ITERATE_EXP__TYPE_VALUE:
				return getTypeValue();
			case PivotPackage.ITERATE_EXP__IS_IMPLICIT:
				return isIsImplicit();
			case PivotPackage.ITERATE_EXP__IS_SAFE:
				return isIsSafe();
			case PivotPackage.ITERATE_EXP__OWNED_SOURCE:
				return getOwnedSource();
			case PivotPackage.ITERATE_EXP__OWNED_BODY:
				return getOwnedBody();
			case PivotPackage.ITERATE_EXP__OWNED_ITERATORS:
				return getOwnedIterators();
			case PivotPackage.ITERATE_EXP__REFERRED_ITERATION:
				if (resolve) return getReferredIteration();
				return basicGetReferredIteration();
			case PivotPackage.ITERATE_EXP__OWNED_RESULT:
				return getOwnedResult();
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
			case PivotPackage.ITERATE_EXP__ANNOTATING_COMMENTS:
				getAnnotatingComments().clear();
				getAnnotatingComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.ITERATE_EXP__OWNED_ANNOTATIONS:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Element>)newValue);
				return;
			case PivotPackage.ITERATE_EXP__OWNED_COMMENTS:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.ITERATE_EXP__OWNED_EXTENSIONS:
				getOwnedExtensions().clear();
				getOwnedExtensions().addAll((Collection<? extends ElementExtension>)newValue);
				return;
			case PivotPackage.ITERATE_EXP__NAME:
				setName((String)newValue);
				return;
			case PivotPackage.ITERATE_EXP__IS_REQUIRED:
				setIsRequired((Boolean)newValue);
				return;
			case PivotPackage.ITERATE_EXP__TYPE:
				setType((Type)newValue);
				return;
			case PivotPackage.ITERATE_EXP__TYPE_VALUE:
				setTypeValue((Type)newValue);
				return;
			case PivotPackage.ITERATE_EXP__IS_IMPLICIT:
				setIsImplicit((Boolean)newValue);
				return;
			case PivotPackage.ITERATE_EXP__IS_SAFE:
				setIsSafe((Boolean)newValue);
				return;
			case PivotPackage.ITERATE_EXP__OWNED_SOURCE:
				setOwnedSource((OCLExpression)newValue);
				return;
			case PivotPackage.ITERATE_EXP__OWNED_BODY:
				setOwnedBody((OCLExpression)newValue);
				return;
			case PivotPackage.ITERATE_EXP__OWNED_ITERATORS:
				getOwnedIterators().clear();
				getOwnedIterators().addAll((Collection<? extends Variable>)newValue);
				return;
			case PivotPackage.ITERATE_EXP__REFERRED_ITERATION:
				setReferredIteration((Iteration)newValue);
				return;
			case PivotPackage.ITERATE_EXP__OWNED_RESULT:
				setOwnedResult((Variable)newValue);
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
			case PivotPackage.ITERATE_EXP__ANNOTATING_COMMENTS:
				getAnnotatingComments().clear();
				return;
			case PivotPackage.ITERATE_EXP__OWNED_ANNOTATIONS:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.ITERATE_EXP__OWNED_COMMENTS:
				getOwnedComments().clear();
				return;
			case PivotPackage.ITERATE_EXP__OWNED_EXTENSIONS:
				getOwnedExtensions().clear();
				return;
			case PivotPackage.ITERATE_EXP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PivotPackage.ITERATE_EXP__IS_REQUIRED:
				setIsRequired(IS_REQUIRED_EDEFAULT);
				return;
			case PivotPackage.ITERATE_EXP__TYPE:
				setType((Type)null);
				return;
			case PivotPackage.ITERATE_EXP__TYPE_VALUE:
				setTypeValue((Type)null);
				return;
			case PivotPackage.ITERATE_EXP__IS_IMPLICIT:
				setIsImplicit(IS_IMPLICIT_EDEFAULT);
				return;
			case PivotPackage.ITERATE_EXP__IS_SAFE:
				setIsSafe(IS_SAFE_EDEFAULT);
				return;
			case PivotPackage.ITERATE_EXP__OWNED_SOURCE:
				setOwnedSource((OCLExpression)null);
				return;
			case PivotPackage.ITERATE_EXP__OWNED_BODY:
				setOwnedBody((OCLExpression)null);
				return;
			case PivotPackage.ITERATE_EXP__OWNED_ITERATORS:
				getOwnedIterators().clear();
				return;
			case PivotPackage.ITERATE_EXP__REFERRED_ITERATION:
				setReferredIteration((Iteration)null);
				return;
			case PivotPackage.ITERATE_EXP__OWNED_RESULT:
				setOwnedResult((Variable)null);
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
			case PivotPackage.ITERATE_EXP__ANNOTATING_COMMENTS:
				return annotatingComments != null && !annotatingComments.isEmpty();
			case PivotPackage.ITERATE_EXP__OWNED_ANNOTATIONS:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.ITERATE_EXP__OWNED_COMMENTS:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.ITERATE_EXP__OWNED_EXTENSIONS:
				return ownedExtensions != null && !ownedExtensions.isEmpty();
			case PivotPackage.ITERATE_EXP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PivotPackage.ITERATE_EXP__IS_MANY:
				return isIsMany() != IS_MANY_EDEFAULT;
			case PivotPackage.ITERATE_EXP__IS_REQUIRED:
				return ((eFlags & IS_REQUIRED_EFLAG) != 0) != IS_REQUIRED_EDEFAULT;
			case PivotPackage.ITERATE_EXP__TYPE:
				return type != null;
			case PivotPackage.ITERATE_EXP__TYPE_VALUE:
				return typeValue != null;
			case PivotPackage.ITERATE_EXP__IS_IMPLICIT:
				return ((eFlags & IS_IMPLICIT_EFLAG) != 0) != IS_IMPLICIT_EDEFAULT;
			case PivotPackage.ITERATE_EXP__IS_SAFE:
				return ((eFlags & IS_SAFE_EFLAG) != 0) != IS_SAFE_EDEFAULT;
			case PivotPackage.ITERATE_EXP__OWNED_SOURCE:
				return ownedSource != null;
			case PivotPackage.ITERATE_EXP__OWNED_BODY:
				return ownedBody != null;
			case PivotPackage.ITERATE_EXP__OWNED_ITERATORS:
				return ownedIterators != null && !ownedIterators.isEmpty();
			case PivotPackage.ITERATE_EXP__REFERRED_ITERATION:
				return referredIteration != null;
			case PivotPackage.ITERATE_EXP__OWNED_RESULT:
				return ownedResult != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
	{
		if (baseClass == ReferringElement.class)
		{
			switch (baseOperationID)
			{
				case PivotPackage.REFERRING_ELEMENT___GET_REFERRED_ELEMENT: return PivotPackage.ITERATE_EXP___GET_REFERRED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case PivotPackage.ITERATE_EXP___ALL_OWNED_ELEMENTS:
				return allOwnedElements();
			case PivotPackage.ITERATE_EXP___GET_VALUE__TYPE_STRING:
				return getValue((Type)arguments.get(0), (String)arguments.get(1));
			case PivotPackage.ITERATE_EXP___COMPATIBLE_BODY__VALUESPECIFICATION:
				return CompatibleBody((ValueSpecification)arguments.get(0));
			case PivotPackage.ITERATE_EXP___VALIDATE_TYPE_IS_NOT_INVALID__DIAGNOSTICCHAIN_MAP:
				return validateTypeIsNotInvalid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PivotPackage.ITERATE_EXP___VALIDATE_NO_INITIALIZERS__DIAGNOSTICCHAIN_MAP:
				return validateNoInitializers((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PivotPackage.ITERATE_EXP___VALIDATE_SOURCE_IS_COLLECTION__DIAGNOSTICCHAIN_MAP:
				return validateSourceIsCollection((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PivotPackage.ITERATE_EXP___GET_REFERRED_ELEMENT:
				return getReferredElement();
			case PivotPackage.ITERATE_EXP___VALIDATE_BODY_TYPE_CONFORMS_TO_RESULT_TYPE__DIAGNOSTICCHAIN_MAP:
				return validateBodyTypeConformsToResultType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PivotPackage.ITERATE_EXP___VALIDATE_ONE_INITIALIZER__DIAGNOSTICCHAIN_MAP:
				return validateOneInitializer((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PivotPackage.ITERATE_EXP___VALIDATE_SAFE_ITERATOR_IS_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSafeIteratorIsRequired((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PivotPackage.ITERATE_EXP___VALIDATE_SAFE_SOURCE_CAN_BE_NULL__DIAGNOSTICCHAIN_MAP:
				return validateSafeSourceCanBeNull((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PivotPackage.ITERATE_EXP___VALIDATE_TYPE_IS_RESULT_TYPE__DIAGNOSTICCHAIN_MAP:
				return validateTypeIsResultType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case PivotPackage.ITERATE_EXP___VALIDATE_UNSAFE_SOURCE_CAN_NOT_BE_NULL__DIAGNOSTICCHAIN_MAP:
				return validateUnsafeSourceCanNotBeNull((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	@Override
	public <R> R accept(@NonNull Visitor<R> visitor) {
		return visitor.visitIterateExp(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Element getReferredElement()
	{
		return getReferredIteration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTypeIsResultType(final DiagnosticChain diagnostics, final Map<Object, Object> context)
	{
		/**
		 * 
		 * inv validateTypeIsResultType:
		 *   let severity : Integer[1] = 'IterateExp::TypeIsResultType'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : OclAny[1] = type = ownedResult?.type
		 *       in
		 *         'IterateExp::TypeIsResultType'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final @NonNull /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final @NonNull /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, PivotTables.STR_IterateExp_c_c_TypeIsResultType);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, PivotTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    @NonNull /*@Caught*/ Object CAUGHT_status;
		    try {
		        final @Nullable /*@Thrown*/ Type type = this.getType();
		        final @Nullable /*@Thrown*/ Variable ownedResult = this.getOwnedResult();
		        @Nullable /*@Caught*/ Object CAUGHT_ownedResult;
		        try {
		            CAUGHT_ownedResult = ownedResult;
		        }
		        catch (Exception e) {
		            CAUGHT_ownedResult = ValueUtil.createInvalidValue(e);
		        }
		        final @NonNull /*@NonInvalid*/ Object symbol_0 = CAUGHT_ownedResult == null;
		        @Nullable /*@Thrown*/ Type safe_type_source;
		        if (symbol_0 == Boolean.TRUE) {
		            safe_type_source = null;
		        }
		        else {
		            assert ownedResult != null;
		            final @Nullable /*@Thrown*/ Type type_0 = ownedResult.getType();
		            safe_type_source = type_0;
		        }
		        final /*@Thrown*/ boolean status = (type != null) && (safe_type_source != null) ? (type.getTypeId() == safe_type_source.getTypeId()) : false;
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, PivotTables.STR_IterateExp_c_c_TypeIsResultType, this, null, diagnostics, context, null, severity_0, CAUGHT_status, PivotTables.INT_0).booleanValue();
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateUnsafeSourceCanNotBeNull(final DiagnosticChain diagnostics, final Map<Object, Object> context)
	{
		/**
		 * 
		 * inv validateUnsafeSourceCanNotBeNull:
		 *   let
		 *     severity : Integer[1] = 'IterateExp::UnsafeSourceCanNotBeNull'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : OclAny[?] = not isSafe and
		 *         ownedIterators?->exists(isRequired) implies
		 *         ownedSource?.type.oclAsType(CollectionType).isNullFree
		 *       in
		 *         'IterateExp::UnsafeSourceCanNotBeNull'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final @NonNull /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final @NonNull /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final @NonNull /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, PivotTables.STR_IterateExp_c_c_UnsafeSourceCanNotBeNull);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, PivotTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    @Nullable /*@Caught*/ Object CAUGHT_status;
		    try {
		        @Nullable /*@Caught*/ Object CAUGHT_and;
		        try {
		            @Nullable /*@Caught*/ Object CAUGHT_not;
		            try {
		                final @Nullable /*@Thrown*/ Boolean isSafe = this.isIsSafe();
		                final @Nullable /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(isSafe);
		                CAUGHT_not = not;
		            }
		            catch (Exception e) {
		                CAUGHT_not = ValueUtil.createInvalidValue(e);
		            }
		            @NonNull /*@Caught*/ Object CAUGHT_exists;
		            try {
		                final @NonNull /*@Thrown*/ List<Variable> ownedIterators = this.getOwnedIterators();
		                final @NonNull /*@Thrown*/ OrderedSetValue BOXED_ownedIterators = idResolver.createOrderedSetOfAll(PivotTables.ORD_CLSSid_Variable, ownedIterators);
		                final @NonNull /*@Thrown*/ OrderedSetValue safe_null_sources = (OrderedSetValue)CollectionExcludingOperation.INSTANCE.evaluate(BOXED_ownedIterators, null);
		                @Nullable /*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
		                @NonNull Iterator<?> ITERATOR__1 = safe_null_sources.iterator();
		                /*@Thrown*/ boolean exists;
		                while (true) {
		                    if (!ITERATOR__1.hasNext()) {
		                        if (accumulator == ValueUtil.FALSE_VALUE) {
		                            exists = ValueUtil.FALSE_VALUE;
		                        }
		                        else {
		                            throw (InvalidValueException)accumulator;
		                        }
		                        break;
		                    }
		                    @NonNull /*@NonInvalid*/ Variable _1 = (Variable)ITERATOR__1.next();
		                    /**
		                     * isRequired
		                     */
		                    @NonNull /*@Caught*/ Object CAUGHT_isRequired;
		                    try {
		                        final /*@Thrown*/ boolean isRequired = _1.isIsRequired();
		                        CAUGHT_isRequired = isRequired;
		                    }
		                    catch (Exception e) {
		                        CAUGHT_isRequired = ValueUtil.createInvalidValue(e);
		                    }
		                    //
		                    if (CAUGHT_isRequired == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
		                        exists = ValueUtil.TRUE_VALUE;
		                        break;														// Stop immediately 
		                    }
		                    else if (CAUGHT_isRequired == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
		                        ;															// Carry on
		                    }
		                    else if (CAUGHT_isRequired instanceof InvalidValueException) {		// Abnormal exception evaluation result
		                        accumulator = CAUGHT_isRequired;									// Cache an exception failure
		                    }
		                    else {															// Impossible badly typed result
		                        accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
		                    }
		                }
		                CAUGHT_exists = exists;
		            }
		            catch (Exception e) {
		                CAUGHT_exists = ValueUtil.createInvalidValue(e);
		            }
		            final @Nullable /*@Thrown*/ Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_not, CAUGHT_exists);
		            CAUGHT_and = and;
		        }
		        catch (Exception e) {
		            CAUGHT_and = ValueUtil.createInvalidValue(e);
		        }
		        @NonNull /*@Caught*/ Object CAUGHT_isNullFree;
		        try {
		            final @NonNull /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_CollectionType_0 = idResolver.getClass(PivotTables.CLSSid_CollectionType, null);
		            final @Nullable /*@Thrown*/ OCLExpression ownedSource = this.getOwnedSource();
		            @Nullable /*@Caught*/ Object CAUGHT_ownedSource;
		            try {
		                CAUGHT_ownedSource = ownedSource;
		            }
		            catch (Exception e) {
		                CAUGHT_ownedSource = ValueUtil.createInvalidValue(e);
		            }
		            final @NonNull /*@NonInvalid*/ Object symbol_0 = CAUGHT_ownedSource == null;
		            @Nullable /*@Thrown*/ Type safe_type_source;
		            if (symbol_0 == Boolean.TRUE) {
		                safe_type_source = null;
		            }
		            else {
		                assert ownedSource != null;
		                final @Nullable /*@Thrown*/ Type type = ownedSource.getType();
		                safe_type_source = type;
		            }
		            final @NonNull /*@Thrown*/ CollectionType oclAsType = ClassUtil.nonNullState((CollectionType)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, safe_type_source, TYP_CollectionType_0));
		            final /*@Thrown*/ boolean isNullFree = oclAsType.isIsNullFree();
		            CAUGHT_isNullFree = isNullFree;
		        }
		        catch (Exception e) {
		            CAUGHT_isNullFree = ValueUtil.createInvalidValue(e);
		        }
		        final @Nullable /*@Thrown*/ Boolean status = BooleanImpliesOperation.INSTANCE.evaluate(CAUGHT_and, CAUGHT_isNullFree);
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, PivotTables.STR_IterateExp_c_c_UnsafeSourceCanNotBeNull, this, null, diagnostics, context, null, severity_0, CAUGHT_status, PivotTables.INT_0).booleanValue();
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyTypeConformsToResultType(final DiagnosticChain diagnostics, final Map<Object, Object> context)
	{
		/**
		 * 
		 * inv validateBodyTypeConformsToResultType:
		 *   let
		 *     severity : Integer[1] = 'IterateExp::BodyTypeConformsToResultType'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[1] = ownedBody.type.conformsTo(ownedResult?.type)
		 *       in
		 *         'IterateExp::BodyTypeConformsToResultType'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final @NonNull /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final @NonNull /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, PivotTables.STR_IterateExp_c_c_BodyTypeConformsToResultType);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, PivotTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    @NonNull /*@Caught*/ Object CAUGHT_status;
		    try {
		        @SuppressWarnings("null")
		        final @NonNull /*@Thrown*/ OCLExpression ownedBody = this.getOwnedBody();
		        final @Nullable /*@Thrown*/ Type type = ownedBody.getType();
		        final @Nullable /*@Thrown*/ Variable ownedResult = this.getOwnedResult();
		        @Nullable /*@Caught*/ Object CAUGHT_ownedResult;
		        try {
		            CAUGHT_ownedResult = ownedResult;
		        }
		        catch (Exception e) {
		            CAUGHT_ownedResult = ValueUtil.createInvalidValue(e);
		        }
		        final @NonNull /*@NonInvalid*/ Object symbol_0 = CAUGHT_ownedResult == null;
		        @Nullable /*@Thrown*/ Type safe_type_source;
		        if (symbol_0 == Boolean.TRUE) {
		            safe_type_source = null;
		        }
		        else {
		            assert ownedResult != null;
		            final @Nullable /*@Thrown*/ Type type_0 = ownedResult.getType();
		            safe_type_source = type_0;
		        }
		        final /*@Thrown*/ boolean status = OclTypeConformsToOperation.INSTANCE.evaluate(evaluator, type, safe_type_source).booleanValue();
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, PivotTables.STR_IterateExp_c_c_BodyTypeConformsToResultType, this, null, diagnostics, context, null, severity_0, CAUGHT_status, PivotTables.INT_0).booleanValue();
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateOneInitializer(final DiagnosticChain diagnostics, final Map<Object, Object> context)
	{
		/**
		 * 
		 * inv validateOneInitializer:
		 *   let severity : Integer[1] = 'IterateExp::OneInitializer'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : OclAny[1] = self.ownedResult?.ownedInit->size() = 1
		 *       in
		 *         'IterateExp::OneInitializer'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final @NonNull /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final @NonNull /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, PivotTables.STR_IterateExp_c_c_OneInitializer);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, PivotTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    @NonNull /*@Caught*/ Object CAUGHT_status;
		    try {
		        final @Nullable /*@Thrown*/ Variable ownedResult = this.getOwnedResult();
		        @Nullable /*@Caught*/ Object CAUGHT_ownedResult;
		        try {
		            CAUGHT_ownedResult = ownedResult;
		        }
		        catch (Exception e) {
		            CAUGHT_ownedResult = ValueUtil.createInvalidValue(e);
		        }
		        final @NonNull /*@NonInvalid*/ Object symbol_0 = CAUGHT_ownedResult == null;
		        @Nullable /*@Thrown*/ OCLExpression safe_ownedInit_source;
		        if (symbol_0 == Boolean.TRUE) {
		            safe_ownedInit_source = null;
		        }
		        else {
		            assert ownedResult != null;
		            final @Nullable /*@Thrown*/ OCLExpression ownedInit = ownedResult.getOwnedInit();
		            safe_ownedInit_source = ownedInit;
		        }
		        final @NonNull /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(evaluator, PivotTables.SET_CLSSid_OCLExpression, safe_ownedInit_source);
		        final @NonNull /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(oclAsSet);
		        final /*@Thrown*/ boolean status = size.equals(PivotTables.INT_1);
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, PivotTables.STR_IterateExp_c_c_OneInitializer, this, null, diagnostics, context, null, severity_0, CAUGHT_status, PivotTables.INT_0).booleanValue();
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSafeIteratorIsRequired(final DiagnosticChain diagnostics, final Map<Object, Object> context)
	{
		/**
		 * 
		 * inv validateSafeIteratorIsRequired:
		 *   let
		 *     severity : Integer[1] = 'IterateExp::SafeIteratorIsRequired'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : OclAny[?] = isSafe implies
		 *         ownedIterators?->forAll(isRequired)
		 *       in
		 *         'IterateExp::SafeIteratorIsRequired'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final @NonNull /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final @NonNull /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final @NonNull /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, PivotTables.STR_IterateExp_c_c_SafeIteratorIsRequired);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, PivotTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    @Nullable /*@Caught*/ Object CAUGHT_status;
		    try {
		        @Nullable /*@Caught*/ Object CAUGHT_isSafe;
		        try {
		            final @Nullable /*@Thrown*/ Boolean isSafe = this.isIsSafe();
		            CAUGHT_isSafe = isSafe;
		        }
		        catch (Exception e) {
		            CAUGHT_isSafe = ValueUtil.createInvalidValue(e);
		        }
		        @NonNull /*@Caught*/ Object CAUGHT_forAll;
		        try {
		            final @NonNull /*@Thrown*/ List<Variable> ownedIterators = this.getOwnedIterators();
		            final @NonNull /*@Thrown*/ OrderedSetValue BOXED_ownedIterators = idResolver.createOrderedSetOfAll(PivotTables.ORD_CLSSid_Variable, ownedIterators);
		            final @NonNull /*@Thrown*/ OrderedSetValue safe_null_sources = (OrderedSetValue)CollectionExcludingOperation.INSTANCE.evaluate(BOXED_ownedIterators, null);
		            @Nullable /*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
		            @NonNull Iterator<?> ITERATOR__1 = safe_null_sources.iterator();
		            /*@Thrown*/ boolean forAll;
		            while (true) {
		                if (!ITERATOR__1.hasNext()) {
		                    if (accumulator == ValueUtil.TRUE_VALUE) {
		                        forAll = ValueUtil.TRUE_VALUE;
		                    }
		                    else {
		                        throw (InvalidValueException)accumulator;
		                    }
		                    break;
		                }
		                @NonNull /*@NonInvalid*/ Variable _1 = (Variable)ITERATOR__1.next();
		                /**
		                 * isRequired
		                 */
		                @NonNull /*@Caught*/ Object CAUGHT_isRequired;
		                try {
		                    final /*@Thrown*/ boolean isRequired = _1.isIsRequired();
		                    CAUGHT_isRequired = isRequired;
		                }
		                catch (Exception e) {
		                    CAUGHT_isRequired = ValueUtil.createInvalidValue(e);
		                }
		                //
		                if (CAUGHT_isRequired == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
		                    forAll = ValueUtil.FALSE_VALUE;
		                    break;														// Stop immediately 
		                }
		                else if (CAUGHT_isRequired == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
		                    ;															// Carry on
		                }
		                else if (CAUGHT_isRequired instanceof InvalidValueException) {		// Abnormal exception evaluation result
		                    accumulator = CAUGHT_isRequired;									// Cache an exception failure
		                }
		                else {															// Impossible badly typed result
		                    accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
		                }
		            }
		            CAUGHT_forAll = forAll;
		        }
		        catch (Exception e) {
		            CAUGHT_forAll = ValueUtil.createInvalidValue(e);
		        }
		        final @Nullable /*@Thrown*/ Boolean status = BooleanImpliesOperation.INSTANCE.evaluate(CAUGHT_isSafe, CAUGHT_forAll);
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, PivotTables.STR_IterateExp_c_c_SafeIteratorIsRequired, this, null, diagnostics, context, null, severity_0, CAUGHT_status, PivotTables.INT_0).booleanValue();
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSafeSourceCanBeNull(final DiagnosticChain diagnostics, final Map<Object, Object> context)
	{
		/**
		 * 
		 * inv validateSafeSourceCanBeNull:
		 *   let severity : Integer[1] = 'IterateExp::SafeSourceCanBeNull'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : OclAny[?] = isSafe implies
		 *         not ownedSource?.type.oclAsType(CollectionType).isNullFree
		 *       in
		 *         'IterateExp::SafeSourceCanBeNull'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final @NonNull /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final @NonNull /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final @NonNull /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, PivotTables.STR_IterateExp_c_c_SafeSourceCanBeNull);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, PivotTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    @Nullable /*@Caught*/ Object CAUGHT_status;
		    try {
		        @Nullable /*@Caught*/ Object CAUGHT_isSafe;
		        try {
		            final @Nullable /*@Thrown*/ Boolean isSafe = this.isIsSafe();
		            CAUGHT_isSafe = isSafe;
		        }
		        catch (Exception e) {
		            CAUGHT_isSafe = ValueUtil.createInvalidValue(e);
		        }
		        @Nullable /*@Caught*/ Object CAUGHT_not;
		        try {
		            final @NonNull /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_CollectionType = idResolver.getClass(PivotTables.CLSSid_CollectionType, null);
		            final @Nullable /*@Thrown*/ OCLExpression ownedSource = this.getOwnedSource();
		            @Nullable /*@Caught*/ Object CAUGHT_ownedSource;
		            try {
		                CAUGHT_ownedSource = ownedSource;
		            }
		            catch (Exception e) {
		                CAUGHT_ownedSource = ValueUtil.createInvalidValue(e);
		            }
		            final @NonNull /*@NonInvalid*/ Object symbol_0 = CAUGHT_ownedSource == null;
		            @Nullable /*@Thrown*/ Type safe_type_source;
		            if (symbol_0 == Boolean.TRUE) {
		                safe_type_source = null;
		            }
		            else {
		                assert ownedSource != null;
		                final @Nullable /*@Thrown*/ Type type = ownedSource.getType();
		                safe_type_source = type;
		            }
		            final @NonNull /*@Thrown*/ CollectionType oclAsType = ClassUtil.nonNullState((CollectionType)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, safe_type_source, TYP_CollectionType));
		            final /*@Thrown*/ boolean isNullFree = oclAsType.isIsNullFree();
		            final @Nullable /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(isNullFree);
		            CAUGHT_not = not;
		        }
		        catch (Exception e) {
		            CAUGHT_not = ValueUtil.createInvalidValue(e);
		        }
		        final @Nullable /*@Thrown*/ Boolean status = BooleanImpliesOperation.INSTANCE.evaluate(CAUGHT_isSafe, CAUGHT_not);
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, PivotTables.STR_IterateExp_c_c_SafeSourceCanBeNull, this, null, diagnostics, context, null, severity_0, CAUGHT_status, PivotTables.INT_0).booleanValue();
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

} //IterateExpImpl
