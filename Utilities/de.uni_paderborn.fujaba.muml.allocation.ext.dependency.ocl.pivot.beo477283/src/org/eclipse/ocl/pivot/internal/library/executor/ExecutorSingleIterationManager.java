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
package org.eclipse.ocl.pivot.internal.library.executor;

import java.util.Iterator;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.evaluation.IterationManager;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.AbstractIterationManager;
import org.eclipse.ocl.pivot.library.LibraryBinaryOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.CollectionValue;

public class ExecutorSingleIterationManager extends AbstractIterationManager
{	
	class Nested extends ExecutorSingleIterationManager
	{
		protected final @NonNull ExecutorSingleIterationManager rootIterationManager;
		protected final int depth;

		protected Nested(@NonNull ExecutorSingleIterationManager iterationManager, @NonNull CollectionValue value) {
			super(iterationManager, value);
			this.rootIterationManager = iterationManager.getRootIterationManager();
			this.depth = iterationManager.getDepth() + 1;
		}

		@Override
		public int getDepth() {
			return depth;
		}
		
		@Override
		public @NonNull ExecutorSingleIterationManager getRootIterationManager() {
			return rootIterationManager;
		}

		@Override
		public @NonNull CollectionValue getSourceCollection() {
			return rootIterationManager.getSourceCollection();
		}
	}
	
	protected final @NonNull CollectionValue collectionValue;
	protected final @NonNull TypeId returnTypeId;
	protected final @NonNull LibraryBinaryOperation body;
	private @Nullable Object accumulatorValue;
	protected final @NonNull Iterator<? extends Object> iteratorValue;
	private Object currentValue;		// 'null' is a valid value so 'iteratorValue' is used as end of iteration

	public ExecutorSingleIterationManager(@NonNull Evaluator evaluator, @NonNull TypeId returnTypeId, @NonNull LibraryBinaryOperation body,
			@Nullable CollectionValue value, @Nullable Object accumulatorValue) {
		super(evaluator);
		this.collectionValue = ValueUtil.asCollectionValue(value);
		this.returnTypeId = returnTypeId;
		this.body = body;
		updateAccumulator(accumulatorValue);
		this.iteratorValue = collectionValue.iterator();
		advanceIterators();
	}

	protected ExecutorSingleIterationManager(@NonNull ExecutorSingleIterationManager iterationManager, @NonNull CollectionValue collectionValue) {
		super(iterationManager.getEvaluator());
		this.collectionValue = collectionValue;
		this.returnTypeId = iterationManager.returnTypeId;
		this.body = iterationManager.body;
		this.accumulatorValue = iterationManager.accumulatorValue;
		this.iteratorValue = collectionValue.iterator();
		advanceIterators();
	}
	
	@Override
	public boolean advanceIterators() {
		currentValue = iteratorValue.hasNext() ? iteratorValue.next() : iteratorValue;
		return currentValue != iteratorValue;
	}

	@Override
	public @NonNull IterationManager createNestedIterationManager(@NonNull CollectionValue value) {
		return new Nested(this, value);
	}

	@Override
	public @Nullable Object evaluateBody() {
		return body.evaluate(evaluator, returnTypeId, accumulatorValue, get());
	}

	@Override
	public @Nullable Object get() {
		return currentValue;
	}

	@Override
	public @Nullable Object getAccumulatorValue() {
		return accumulatorValue;
	}

	public int getDepth() {
		return 0;
	}
	
	public @NonNull ExecutorSingleIterationManager getRootIterationManager() {
		return this;
	}

	@Override
	public @NonNull CollectionValue getSourceCollection() {
		return collectionValue;
	}
	
	@Override
	public boolean hasCurrent() {
		return currentValue != iteratorValue;
	}

	@Override
	public @Nullable Object updateAccumulator(Object newValue) {
		this.accumulatorValue = newValue;
		return null;					// carry on
	}
}