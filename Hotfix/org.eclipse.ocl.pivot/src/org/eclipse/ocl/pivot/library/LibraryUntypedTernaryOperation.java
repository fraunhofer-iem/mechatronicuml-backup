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
package org.eclipse.ocl.pivot.library;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Evaluator;

/**
 * LibraryUntypedTernaryOperation extends the invocation API of a ternary operation to support using just
 * <br>
 * an evaluator and arguments.
 */
public interface LibraryUntypedTernaryOperation extends LibraryTernaryOperation, LibraryUntypedOperation
{
	@Nullable Object evaluate(@NonNull Evaluator evaluator, @Nullable Object sourceValue, @Nullable Object firstArgumentValue, @Nullable Object secondArgumentValue);
}
