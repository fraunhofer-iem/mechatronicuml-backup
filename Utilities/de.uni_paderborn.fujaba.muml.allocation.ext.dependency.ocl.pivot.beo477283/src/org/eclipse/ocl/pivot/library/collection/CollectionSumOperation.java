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
package org.eclipse.ocl.pivot.library.collection;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.AbstractUnaryOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.CollectionValue;

/**
 * CollectionSumOperation realises the Collection::sum() library operation.
 */
public class CollectionSumOperation extends AbstractUnaryOperation
{
	public static final @NonNull CollectionSumOperation INSTANCE = new CollectionSumOperation();

	@Override
	public @NonNull Object evaluate(@NonNull Evaluator evaluator, @NonNull TypeId returnTypeId, @Nullable Object sourceVal) {
		CollectionValue collectionValue = asCollectionValue(sourceVal);
		// FIXME Bug 301351 Look for user-defined zero
//			resultType.getZero();
		StandardLibrary standardLibrary = evaluator.getStandardLibrary();
		Type returnType = evaluator.getIdResolver().getType(returnTypeId, null);
		Object result;
		if (returnType.conformsTo(standardLibrary, standardLibrary.getIntegerType())) {
			result = ValueUtil.integerValueOf(0);
		}
		else {
			result = ValueUtil.realValueOf(0.0);
		}
        for (Object element : collectionValue.iterable()) {
        	result = NumericPlusOperation.INSTANCE.evaluate(result, element);
        }
        return result;
	}
}
