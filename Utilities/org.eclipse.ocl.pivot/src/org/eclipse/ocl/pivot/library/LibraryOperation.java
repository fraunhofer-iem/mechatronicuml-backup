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
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.evaluation.Evaluator;

/**
 */
public interface LibraryOperation extends LibraryFeature
{
	/**
	 * Return the result of evaluating callExp and its arguments upon sourceValue within the environment
	 * provided by evaluator. An invalid return may be indicated by throwing an exception,
	 * returning Java null, or returning OCL invalid.
	 * <p>
	 * This invocation evaluates the arguments as required. Derived implementations may implement short circuit processing
	 * to skip redundant evlaution of later arguments.
	 * <p>
	 * Invocations may bypass dispatch if a derived LibraryOperation such as LibrarySimpleBinaryOperation
	 * makes its internal evaluate signature available for use after a type test and cast.
	 */
	@Nullable Object dispatch(@NonNull Evaluator evaluator, @NonNull OperationCallExp callExp, @Nullable Object sourceValue);
}
