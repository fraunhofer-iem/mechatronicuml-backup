/*******************************************************************************
 * Copyright (c) 2010, 2014 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.labels;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Label is a facade for the ILabelGenerator extensible label generators.
 */
public class Label
{
	/**
	 * Generate a label for labelled object using the default global label generator
	 * registartions.
	 * 
	 * @param labelledObject to be labelled
	 * @return the label
	 */
    public static @NonNull String labelFor(@Nullable Object labelledObject) {
    	return ILabelGenerator.Registry.INSTANCE.labelFor(labelledObject);
    }
}