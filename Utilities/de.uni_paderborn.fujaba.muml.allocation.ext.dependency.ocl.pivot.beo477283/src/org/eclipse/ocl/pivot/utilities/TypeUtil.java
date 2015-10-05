/*******************************************************************************
 * Copyright (c) 2011, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.utilities;

import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.BagType;
import org.eclipse.ocl.pivot.CollectionKind;
import org.eclipse.ocl.pivot.CollectionType;
import org.eclipse.ocl.pivot.CompleteInheritance;
import org.eclipse.ocl.pivot.Iteration;
import org.eclipse.ocl.pivot.LambdaType;
import org.eclipse.ocl.pivot.MapType;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.OrderedSetType;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.SequenceType;
import org.eclipse.ocl.pivot.SetType;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.TemplateParameter;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.TupleType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.ids.PrimitiveTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.values.CollectionTypeParametersImpl;
import org.eclipse.ocl.pivot.internal.values.MapTypeParametersImpl;
import org.eclipse.ocl.pivot.types.ParameterTypesImpl;
import org.eclipse.ocl.pivot.types.TemplateParametersImpl;
import org.eclipse.ocl.pivot.values.CollectionTypeParameters;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.MapTypeParameters;
import org.eclipse.ocl.pivot.values.UnlimitedNaturalValue;

public class TypeUtil
{
	public static boolean conformsToCollectionType(@NonNull StandardLibrary standardLibrary, @NonNull CollectionType firstCollectionType, @NonNull CollectionType secondCollectionType) {
		Type firstContainerType = firstCollectionType.getContainerType();
		Type secondContainerType = secondCollectionType.getContainerType();
		if (firstContainerType != secondContainerType) {
			CompleteInheritance firstInheritance = firstContainerType.getInheritance(standardLibrary);
			CompleteInheritance secondInheritance = secondContainerType.getInheritance(standardLibrary);
			if (!secondInheritance.isSuperInheritanceOf(firstInheritance)) {
				return false;
			}
		}
		Type firstElementType = firstCollectionType.getElementType();
		Type secondElementType = secondCollectionType.getElementType();
		if (firstElementType != secondElementType) {
			if ((firstElementType == null) || (secondElementType == null)) {
				return false;
			}
			if (!firstElementType.conformsTo(standardLibrary, secondElementType)) {
				return false;
			}
		}
		IntegerValue firstLower = firstCollectionType.getLowerValue();
		IntegerValue secondLower = secondCollectionType.getLowerValue();
		if (firstLower.compareTo(secondLower) < 0) {
			return false;
		}
		UnlimitedNaturalValue firstUpper = firstCollectionType.getUpperValue();
		UnlimitedNaturalValue secondUpper = secondCollectionType.getUpperValue();
		if (firstUpper.compareTo(secondUpper) > 0) {
			return false;
		}
		return true;
	}

	public static boolean conformsToLambdaType(@NonNull StandardLibrary standardLibrary, @NonNull LambdaType firstLambdaType, @NonNull LambdaType secondLambdaType) {
		throw new UnsupportedOperationException();
	}
	
	public static boolean conformsToMapType(@NonNull StandardLibrary standardLibrary, @NonNull MapType firstMapType, @NonNull MapType secondMapType) {
//		Type firstContainerType = firstMapType.getContainerType();
//		Type secondContainerType = secondMapType.getContainerType();
//		if (firstContainerType != secondContainerType) {
//			CompleteInheritance firstInheritance = firstContainerType.getInheritance(standardLibrary);
//			CompleteInheritance secondInheritance = secondContainerType.getInheritance(standardLibrary);
//			if (!secondInheritance.isSuperInheritanceOf(firstInheritance)) {
//				return false;
//			}
//		}
		Type firstKeyType = firstMapType.getKeyType();
		Type secondKeyType = secondMapType.getKeyType();
		if (firstKeyType != secondKeyType) {
			if ((firstKeyType == null) || (secondKeyType == null)) {
				return false;
			}
			if (!firstKeyType.conformsTo(standardLibrary, secondKeyType)) {
				return false;
			}
		}
		Type firstValueType = firstMapType.getValueType();
		Type secondValueType = secondMapType.getValueType();
		if (firstValueType != secondValueType) {
			if ((firstValueType == null) || (secondValueType == null)) {
				return false;
			}
			if (!firstValueType.conformsTo(standardLibrary, secondValueType)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean conformsToTupleType(@NonNull StandardLibrary standardLibrary, @NonNull TupleType firstTupleType, @NonNull TupleType secondTupleType) {
		if (isEqualToTupleType(standardLibrary, firstTupleType, secondTupleType)) {
			return true;
		}
		CompleteInheritance firstInheritance = firstTupleType.getInheritance(standardLibrary);
		CompleteInheritance secondInheritance = secondTupleType.getInheritance(standardLibrary);
		return firstInheritance.isSuperInheritanceOf(secondInheritance);
	}

	/**
	 * @deprecated add isNullFree argument
	 */
	@Deprecated
	public static @NonNull CollectionTypeParameters<Type> createCollectionTypeParameters(@NonNull Type elementType,
		@Nullable IntegerValue lower, @Nullable UnlimitedNaturalValue upper) {
		return new CollectionTypeParametersImpl<Type>(elementType, false, lower, upper);
	}

	public static @NonNull CollectionTypeParameters<Type> createCollectionTypeParameters(@NonNull Type elementType, boolean isNullFree,
		@Nullable IntegerValue lower, @Nullable UnlimitedNaturalValue upper) {
		return new CollectionTypeParametersImpl<Type>(elementType, isNullFree, lower, upper);
	}

	public static @NonNull MapTypeParameters<Type, Type> createMapTypeParameters(@NonNull Type keyType, @NonNull Type valueType) {
		return new MapTypeParametersImpl<Type, Type>(keyType, valueType);
	}

	public static @NonNull ParameterTypes createParameterTypes(@NonNull Type... parameterTypes) {
		return new ParameterTypesImpl(parameterTypes);
	}

	public static @NonNull TemplateParameters createTemplateParameters(@NonNull TemplateParameter... parameters) {
		return new TemplateParametersImpl(parameters);
	}

	public static @NonNull TemplateParameters createTemplateParameters(@NonNull List<? extends Type> parameters) {
		return new TemplateParametersImpl(parameters);
	}

	public static @NonNull Type[] getLambdaParameterTypes(@NonNull LambdaType lambdaType) {
		int iParameter = 0;
		List<? extends Type> ownedParameters = lambdaType.getParameterTypes();
		Type[] parameterTypes = new Type[ownedParameters.size() + 2];
		parameterTypes[iParameter++] = lambdaType.getContextType();
		parameterTypes[iParameter++] = lambdaType.getResultType();
		for (Type parameterType : ownedParameters) {
			parameterTypes[iParameter++] = parameterType;
		}
		return parameterTypes;
	}

	public static @NonNull Type[] getOperationParameterTypes(@NonNull Operation anOperation) {
		Type[] parameterTypes;
		int iParameter = 0;
		List<? extends TypedElement> ownedParameters = anOperation.getOwnedParameters();
		if (anOperation instanceof Iteration) {
			Iteration anIteration = (Iteration)anOperation;
			List<? extends TypedElement> ownedIterators = anIteration.getOwnedIterators();
			List<? extends TypedElement> ownedAccumulators = anIteration.getOwnedAccumulators();
			parameterTypes = new Type[ownedIterators.size() + ownedAccumulators.size() + ownedParameters.size()];
			for (TypedElement ownedIterator : ownedIterators) {
				parameterTypes[iParameter++] = ownedIterator.getType();
			}
			for (TypedElement ownedAccumulator : ownedAccumulators) {
				parameterTypes[iParameter++] = ownedAccumulator.getType();
			}
		}
		else {
			parameterTypes = new Type[ownedParameters.size()];
		}
		for (TypedElement ownedParameter : ownedParameters) {
			parameterTypes[iParameter++] = ownedParameter.getType();
		}
		return parameterTypes;
	}

	public static @Nullable Type getPrimitiveType(@NonNull StandardLibrary standardLibrary, @NonNull PrimitiveTypeId typeId) {
		if (typeId == TypeId.BOOLEAN) {
			return standardLibrary.getBooleanType();
		}
		else if (typeId == TypeId.INTEGER) {
			return standardLibrary.getIntegerType();
		}
		else if (typeId == TypeId.REAL) {
			return standardLibrary.getRealType();
		}
		else if (typeId == TypeId.STRING) {
			return standardLibrary.getStringType();
		}
		else if (typeId == TypeId.UNLIMITED_NATURAL) {
			return standardLibrary.getUnlimitedNaturalType();
		}
		else if (typeId == TypeId.OCL_ANY) {
			return standardLibrary.getOclAnyType();
		}
		else if (typeId == TypeId.OCL_COMPARABLE) {
			return standardLibrary.getOclComparableType();
		}
		else if (typeId == TypeId.OCL_SELF) {
			return standardLibrary.getOclSelfType();
		}
		else if (typeId == TypeId.OCL_SUMMABLE) {
			return standardLibrary.getOclSummableType();
		}
		throw new UnsupportedOperationException();
	}
	
	public static boolean isEqualToCollectionType(@NonNull StandardLibrary standardLibrary, @NonNull CollectionType firstCollectionType, @NonNull CollectionType secondCollectionType) {
		Type firstContainerType = firstCollectionType.getContainerType();
		Type secondContainerType = secondCollectionType.getContainerType();
		if ((firstContainerType != secondContainerType) && !firstContainerType.isEqualToUnspecializedType(standardLibrary, secondContainerType)) {
			return false;
		}
		Type firstElementType = firstCollectionType.getElementType();
		Type secondElementType = secondCollectionType.getElementType();
		if (firstElementType != secondElementType) {
			if ((firstElementType == null) || (secondElementType == null)) {
				return false;
			}
			if (!firstElementType.isEqualTo(standardLibrary, secondElementType)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEqualToMapType(@NonNull StandardLibrary standardLibrary, @NonNull MapType firstMapType, @NonNull MapType secondMapType) {
//		Type firstContainerType = firstMapType.getContainerType();
//		Type secondContainerType = secondMapType.getContainerType();
//		if ((firstContainerType != secondContainerType) && !firstContainerType.isEqualToUnspecializedType(standardLibrary, secondContainerType)) {
//			return false;
//		}
		Type firstKeyType = firstMapType.getKeyType();
		Type secondKeyType = secondMapType.getKeyType();
		if (firstKeyType != secondKeyType) {
			if ((firstKeyType == null) || (secondKeyType == null)) {
				return false;
			}
			if (!firstKeyType.isEqualTo(standardLibrary, secondKeyType)) {
				return false;
			}
		}
		Type firstValueType = firstMapType.getValueType();
		Type secondValueType = secondMapType.getValueType();
		if (firstValueType != secondValueType) {
			if ((firstValueType == null) || (secondValueType == null)) {
				return false;
			}
			if (!firstValueType.isEqualTo(standardLibrary, secondValueType)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEqualToTupleType(@NonNull StandardLibrary standardLibrary, @NonNull TupleType firstTupleType, @NonNull TupleType secondTupleType) {
		TypeId firstParts = firstTupleType.getTypeId();
		TypeId secondParts = secondTupleType.getTypeId();
		return firstParts == secondParts;
	}

	public static CollectionKind getCollectionKind(CollectionType collectionType) {
		if (collectionType instanceof OrderedSetType) {
			return CollectionKind.ORDERED_SET;
		}
		else if (collectionType instanceof SequenceType) {
			return CollectionKind.SEQUENCE;
		}
		else if (collectionType instanceof SetType) {
			return CollectionKind.SET;
		}
		else if (collectionType instanceof BagType) {
			return CollectionKind.BAG;
		}
		else {
			return CollectionKind.COLLECTION;
		}
	}
}
