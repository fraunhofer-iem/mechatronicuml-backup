/*******************************************************************************
 * Copyright (c) 2015 Willink Transformations and others.
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
 * A MapTypeId provides a unique identifier for an unspecialized map type such as Map(K,V).
 */
public interface MapTypeId extends BuiltInTypeId, TemplateableId
{
	@Override
	@NonNull MapTypeId getGeneralizedId();
	@NonNull TypeId getKeyTypeId();
	@Override
	@NonNull String getMetaTypeName();
	@Override
	@NonNull MapTypeId getSpecializedId(@NonNull BindingsId templateBindings);
	@NonNull MapTypeId getSpecializedId(@NonNull ElementId... templateBindings);
	@NonNull TypeId getValueTypeId();
}
