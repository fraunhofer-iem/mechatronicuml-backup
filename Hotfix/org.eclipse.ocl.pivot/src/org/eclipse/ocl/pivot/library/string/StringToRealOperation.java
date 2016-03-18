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
package org.eclipse.ocl.pivot.library.string;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.library.AbstractSimpleUnaryOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * StringToRealOperation realises the String::toReal() library operation.
 */
public class StringToRealOperation extends AbstractSimpleUnaryOperation
{
	public static final @NonNull StringToRealOperation INSTANCE = new StringToRealOperation();

	@Override
	public @NonNull RealValue evaluate(@Nullable Object sourceVal) {
		String sourceString = asString(sourceVal);
		return ValueUtil.realValueOf(sourceString);
	}
}
