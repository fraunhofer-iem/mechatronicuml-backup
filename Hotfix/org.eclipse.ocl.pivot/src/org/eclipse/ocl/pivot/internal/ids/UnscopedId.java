/*******************************************************************************
 * Copyright (c) 2012, 2014 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.ids;

import org.eclipse.jdt.annotation.NonNull;

public abstract class UnscopedId extends AbstractTypeId
{
	protected final @NonNull String name;
	protected final int hashCode;

	protected UnscopedId(@NonNull String name) {
		this.name = name;
		this.hashCode = name.hashCode();
	}

	@Override
	public @NonNull String getDisplayName() {
		return name;
	}

	public @NonNull String getName() {
		return name;
	}

	@Override
	public final int hashCode() {
		return hashCode;
	}
}