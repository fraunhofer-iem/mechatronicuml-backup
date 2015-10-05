/*******************************************************************************
 * Copyright (c) 2011, 2014 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.library;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.evaluation.IterationManager;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 */
public interface LibraryIteration extends LibraryFeature
{
	/**
	 * Create the value that will accumulate the iteration results.
	 */
	@NonNull Object createAccumulatorValue(@NonNull Evaluator evaluator, @NonNull TypeId accumulatorTypeId, @NonNull TypeId bodyTypeId);
	
	/**
	 * Evaluate the iteration under the supervision of an iterationManager.
	 * 
	 * @param iterationManager the iteration space
	 * @return the result
	 * @throws Exception 
	 * 
	 * @throws InvalidValueException if a body evaluates to invalid
	 */
	@Nullable Object evaluateIteration(@NonNull IterationManager iterationManager);
}
