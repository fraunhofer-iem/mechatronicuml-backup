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
package org.eclipse.ocl.pivot.library.oclany;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.library.AbstractUntypedBinaryOperation;

/**
 * OclAnyOclIsTypeOfOperation realises the OclAny::oclIsTypeOf() library operation.
 */
public class OclAnyOclIsTypeOfOperation extends AbstractUntypedBinaryOperation
{
	public static final @NonNull OclAnyOclIsTypeOfOperation INSTANCE = new OclAnyOclIsTypeOfOperation();

	@Override
	public @NonNull Boolean evaluate(@NonNull Evaluator evaluator, @Nullable Object sourceVal, @Nullable Object argVal) {
		Type sourceType = evaluator.getIdResolver().getDynamicTypeOf(sourceVal);
		Type argType = asType(argVal);
		boolean result = sourceType.isEqualTo(evaluator.getStandardLibrary(), argType);
		return result;
	}
}
