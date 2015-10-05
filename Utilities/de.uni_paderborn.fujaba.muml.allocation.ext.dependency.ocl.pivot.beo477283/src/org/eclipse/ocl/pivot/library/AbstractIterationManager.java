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
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.evaluation.IterationManager;
import org.eclipse.ocl.pivot.values.CollectionValue;

public abstract class AbstractIterationManager implements IterationManager
{
	protected final @NonNull Evaluator evaluator;

	public AbstractIterationManager(@NonNull Evaluator evaluator) {
		this.evaluator = evaluator;
	}

	@Override
	public @NonNull IterationManager createNestedIterationManager(@NonNull CollectionValue value) {
		throw new UnsupportedOperationException();	// Only required for single iterator managers
	}

	@Override
	public void dispose() {
		evaluator.dispose();
	}

	@Override
	public @Nullable Object get() {
		throw new UnsupportedOperationException();	// Only required for single iterator managers
	}
	
	@Override
	public @NonNull Evaluator getEvaluator() {
		return evaluator;
	}

	@Override
	public @NonNull StandardLibrary getStandardLibrary() {
		return evaluator.getStandardLibrary();
	}
}