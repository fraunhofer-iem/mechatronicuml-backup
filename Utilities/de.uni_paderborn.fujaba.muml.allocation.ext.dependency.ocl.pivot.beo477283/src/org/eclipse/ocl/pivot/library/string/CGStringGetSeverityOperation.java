/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.library.string;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.library.AbstractUntypedUnaryOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * CGStringGetSeverityOperation realises the String::getSeverity() library operation used as the
 * precursor to a validation.
 */
public class CGStringGetSeverityOperation extends AbstractUntypedUnaryOperation
{
	public static final @NonNull CGStringGetSeverityOperation INSTANCE = new CGStringGetSeverityOperation();

	@Override
	public @NonNull IntegerValue evaluate(@NonNull Evaluator evaluator, @Nullable Object sourceValue) {
		return ValueUtil.integerValueOf(evaluator.getSeverity(sourceValue));
	}
}
