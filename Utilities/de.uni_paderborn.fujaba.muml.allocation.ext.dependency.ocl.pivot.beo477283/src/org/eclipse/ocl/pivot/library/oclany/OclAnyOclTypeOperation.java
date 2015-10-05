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
import org.eclipse.ocl.pivot.library.AbstractUntypedUnaryOperation;

/**
 * OclAnyOclTypeOperation realises the OclAny::oclType() library operation.
 */
public class OclAnyOclTypeOperation extends AbstractUntypedUnaryOperation
{
	public static final @NonNull OclAnyOclTypeOperation INSTANCE = new OclAnyOclTypeOperation();

	@Override
	public @NonNull Type evaluate(@NonNull Evaluator evaluator, @Nullable Object sourceVal) {
//		return evaluator.getStaticTypeOf(sourceVal);
		return evaluator.getIdResolver().getDynamicTypeOf(sourceVal);
	}
}
