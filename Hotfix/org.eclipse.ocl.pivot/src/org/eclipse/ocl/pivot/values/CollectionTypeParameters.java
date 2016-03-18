/*******************************************************************************
 * Copyright (c) 2014, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.values;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.Type;

public interface CollectionTypeParameters<T extends Type> extends Iterable<Object>
{
	@NonNull T getElementType();

	@NonNull IntegerValue getLower();

	@NonNull UnlimitedNaturalValue getUpper();

	boolean isNullFree();
}