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

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.evaluation.IterationManager;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.AbstractIteration;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.values.CollectionValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.CollectionValue.Accumulator;

/**
 * RejectIteration realizes the Collection::reject() library iteration.
 */
public class RejectIteration extends AbstractIteration
{
	public static final @NonNull RejectIteration INSTANCE = new RejectIteration();

	@Override
	public @NonNull CollectionValue.Accumulator createAccumulatorValue(@NonNull Evaluator evaluator, @NonNull TypeId accumulatorTypeId, @NonNull TypeId bodyTypeId) {
		return createCollectionAccumulatorValue((CollectionTypeId)accumulatorTypeId);
	}
	
	@Override
    protected @Nullable Object updateAccumulator(@NonNull IterationManager iterationManager) {
		Object bodyVal = iterationManager.evaluateBody();		
		if (bodyVal == null) {
			throw new InvalidValueException(PivotMessages.UndefinedBody, "reject"); 	// Null body is invalid //$NON-NLS-1$
		}
		else if (bodyVal == Boolean.FALSE) {
			Object value = iterationManager.get();		
			Accumulator accumulatorValue = (CollectionValue.Accumulator)iterationManager.getAccumulatorValue();
			assert accumulatorValue != null;												// createAccumulatorValue is @NonNull
			accumulatorValue.add(value);
		}
		else if (bodyVal != Boolean.TRUE) {
			throw new InvalidValueException(PivotMessages.NonBooleanBody, "reject"); 	// Non boolean body is invalid //$NON-NLS-1$
		}
		return CARRY_ON;
	}
}
