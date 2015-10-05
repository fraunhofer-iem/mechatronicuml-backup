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
package org.eclipse.ocl.pivot.options;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.common.preferences.PreferenceableOption;
import org.eclipse.ocl.pivot.utilities.Option;

/**
 * Abstract implementation of a configurable option that can also be a preference.
 */
public abstract class BasicOption<T> implements Option<T>, PreferenceableOption<T>
{
	protected final @NonNull String pluginId;
	protected final @NonNull String key;
	protected final @Nullable T defaultValue;
	
	protected BasicOption(@NonNull String pluginId, @NonNull String key, @Nullable T defaultValue) {
		this.pluginId = pluginId;
		this.key = key;
		this.defaultValue = defaultValue;
	}
	
	@Override
	public final @NonNull String getKey() {
		return key;
	}
	
	@Override
	public final @Nullable T getDefaultValue() {
		return defaultValue;
	}

	@Override
	public final @NonNull String getPluginId() {
		return pluginId;
	}
}
