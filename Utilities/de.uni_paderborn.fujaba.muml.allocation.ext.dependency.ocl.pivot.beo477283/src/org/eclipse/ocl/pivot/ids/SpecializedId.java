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
package org.eclipse.ocl.pivot.ids;

import org.eclipse.jdt.annotation.NonNull;


/**
 * A SpecializedId defines a unique hierarchical specialization for a parameterized type which may have many 'actual' type variants.
 */
public interface SpecializedId extends ElementId
{
	@NonNull BindingsId getTemplateBindings();
}