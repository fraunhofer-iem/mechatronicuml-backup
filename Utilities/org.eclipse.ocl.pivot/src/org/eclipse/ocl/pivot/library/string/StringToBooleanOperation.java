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

/**
 * StringToBooleanOperation realises the String::toBoolean() library operation.
 */
public class StringToBooleanOperation extends AbstractSimpleUnaryOperation
{
	public static final @NonNull StringToBooleanOperation INSTANCE = new StringToBooleanOperation();

	@Override
	public @NonNull Boolean evaluate(@Nullable Object sourceVal) {
		String sourceString = asString(sourceVal);
		boolean result = "true".equals(sourceString); //$NON-NLS-1$
		return result;
	}
}
