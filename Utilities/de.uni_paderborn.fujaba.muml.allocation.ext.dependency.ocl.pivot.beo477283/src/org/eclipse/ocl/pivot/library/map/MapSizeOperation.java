/*******************************************************************************
 * Copyright (c) 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.library.map;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.library.AbstractSimpleUnaryOperation;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.MapValue;

/**
 * MapSizeOperation realises the Map::size() library operation.
 */
public class MapSizeOperation extends AbstractSimpleUnaryOperation
{
	public static final @NonNull MapSizeOperation INSTANCE = new MapSizeOperation();

	@Override
	public @NonNull IntegerValue evaluate(@Nullable Object source) {
		MapValue mapValue = asMapValue(source);
		return mapValue.size();
	}
}
