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
 * An OperationId provides a unique hierarchical identifier for an operation name, operation parameter-types and template parameters.
 * <p>
 * An OperationId has a single ordered list of template parameters flattening all inherited package and type template parameters
 * as part of the single list. The least derived parameters appear first in the list, the operation parameters last.
 */
public interface OperationId extends TemplateableId
{
	@Override
	@NonNull OperationId getGeneralizedId();
	@Override
	@NonNull String getName();
	@NonNull ParametersId getParametersId();
	@NonNull TypeId getParent();
}