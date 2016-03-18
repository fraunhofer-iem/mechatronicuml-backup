/*******************************************************************************
 * Copyright (c) 2010, 2014 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.library.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.CompleteInheritance;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.evaluation.IterationManager;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.values.ValueImpl;
import org.eclipse.ocl.pivot.library.AbstractIteration;
import org.eclipse.ocl.pivot.library.LibraryBinaryOperation;
import org.eclipse.ocl.pivot.library.LibraryConstants;
import org.eclipse.ocl.pivot.library.LibraryFeature;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.Value;

/**
 * SelectIteration realizes the Collection::sortedBy() library iteration.
 */
public class SortedByIteration extends AbstractIteration
{
	protected static class SortingValue extends ValueImpl implements Comparator<Object>
	{
		protected final @NonNull CollectionTypeId typeId;
		private final @NonNull Evaluator evaluator;
		private final boolean isUnique;
		private final @NonNull LibraryBinaryOperation implementation;
		private final @NonNull Map<Object, Object> content = new HashMap<Object, Object>();	// User object to sortedBy value
		private Map<Object, Integer> repeatCounts = null;						// Repeat counts for non-unique content

		public SortingValue(@NonNull Evaluator evaluator, @NonNull CollectionTypeId returnTypeId, @NonNull LibraryBinaryOperation implementation) {
			this.typeId = returnTypeId;
			this.evaluator = evaluator;
			this.implementation = implementation;
			CollectionTypeId generalizedId = typeId.getGeneralizedId();
			isUnique = (generalizedId == TypeId.SET) || (generalizedId == TypeId.ORDERED_SET);
		}

		@Override
		public @NonNull Object asObject() {
			return content;
		}
		
		@Override
		public int compare(Object o1, Object o2) {
			if (o1 == o2) {
				return 0;
			}
			Object v1 = content.get(o1);
			Object v2 = content.get(o2);
			if (v1 == v2) {
				return 0;
			}
			else if (v1 == null) {
				return -1;
			}
			else if (v2 == null) {
				return 1;
			}
			try {
				IntegerValue comparison = ValueUtil.asIntegerValue(implementation.evaluate(evaluator, TypeId.INTEGER, v1, v2));
				return comparison.signum();
			} catch (InvalidValueException e) {
				throw e;
			} catch (Exception e) {
				throw new InvalidValueException(e);
			}
		}

		public @NonNull Value createSortedValue() {
			List<Object> result = new ArrayList<Object>(content.keySet());
			Collections.sort(result, this);
			if (isUnique || (repeatCounts == null)) {
				return evaluator.getIdResolver().createCollectionOfAll(true, isUnique, typeId, result);
			}
			else {
				List<Object> nonUniqueResult = new ArrayList<Object>();
				for (Object resultValue : result) {
					nonUniqueResult.add(resultValue);
					Integer repeatCount = repeatCounts.get(resultValue);
					if (repeatCount != null) {
						for (int i = repeatCount; i > 0; i--) {
							nonUniqueResult.add(resultValue);
						}
					}
				}
				return evaluator.getIdResolver().createCollectionOfAll(true, false, typeId, nonUniqueResult);
			}
		}

//		public @NonNull DomainType getType(@NonNull DomainStandardLibrary standardLibrary) {
//			return type;
//		}

		@Override
		public @NonNull TypeId getTypeId() {
			return typeId;
		}

		public void put(@Nullable Object iterVal, @Nullable Object comparable) {
			if (content.put(iterVal, comparable) != null) {
				if (!isUnique) {
					if (repeatCounts == null) {
						repeatCounts = new HashMap<Object, Integer>();
					}
					Integer repeatCount = repeatCounts.get(iterVal);
					if (repeatCount == null) {
						repeatCount = 1;
					}
					else {
						repeatCount++;
					}
					repeatCounts.put(iterVal, repeatCount);
				}
			}
		}

		@Override
		public String toString() {
			return content.toString();
		}
	}

	public static final @NonNull SortedByIteration INSTANCE = new SortedByIteration();

	@Override
	public @NonNull SortedByIteration.SortingValue createAccumulatorValue(@NonNull Evaluator evaluator, @NonNull TypeId accumulatorTypeId, @NonNull TypeId bodyTypeId) {
		StandardLibrary standardLibrary = evaluator.getStandardLibrary();
		CompleteInheritance comparableType = standardLibrary.getOclComparableType().getInheritance(standardLibrary);
		CompleteInheritance selfType = standardLibrary.getOclSelfType().getInheritance(standardLibrary);
		Operation staticOperation = comparableType.lookupLocalOperation(standardLibrary, LibraryConstants.COMPARE_TO, selfType);
		if (staticOperation != null) {
			org.eclipse.ocl.pivot.Class bodyType = evaluator.getIdResolver().getClass(bodyTypeId, null);
			LibraryFeature implementation = bodyType.lookupImplementation(standardLibrary, staticOperation);
			return new SortingValue(evaluator, (CollectionTypeId)accumulatorTypeId, (LibraryBinaryOperation) implementation);
		}
		throw new InvalidValueException(PivotMessages.UndefinedOperation, String.valueOf(comparableType) + "::" + LibraryConstants.COMPARE_TO); //$NON-NLS-1$
	}
	
	@Override
	protected @NonNull Object resolveTerminalValue(@NonNull IterationManager iterationManager) {
		SortingValue accumulatorValue = (SortingValue) iterationManager.getAccumulatorValue();
		assert accumulatorValue != null;
		return accumulatorValue.createSortedValue();
	}

	@Override
    protected @Nullable Object updateAccumulator(@NonNull IterationManager iterationManager) {
		Object bodyVal = iterationManager.evaluateBody();		
		if (bodyVal == null) {
			throw new InvalidValueException(PivotMessages.UndefinedBody, "sortedBy"); 	// Null body is invalid //$NON-NLS-1$
		}
		Object iterValue = iterationManager.get();		
		SortingValue accumulatorValue = (SortingValue) iterationManager.getAccumulatorValue();
		assert accumulatorValue != null;
		accumulatorValue.put(iterValue, bodyVal);
		return CARRY_ON;										// Carry on
	}
}
