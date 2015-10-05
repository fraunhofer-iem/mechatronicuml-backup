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
package org.eclipse.ocl.pivot.library.enumeration;

import java.util.Set;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.Enumeration;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.values.OrderedSetImpl;
import org.eclipse.ocl.pivot.library.AbstractProperty;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * EnumerationOwnedLiteralProperty realizes the Enumeration::ownedLiteral() library property.
 */
public class EnumerationOwnedLiteralProperty extends AbstractProperty
{
	public static final @NonNull EnumerationOwnedLiteralProperty INSTANCE = new EnumerationOwnedLiteralProperty();

	@Override
	public @NonNull OrderedSetValue evaluate(@NonNull Evaluator evaluator, @NonNull TypeId returnTypeId, @Nullable Object sourceValue) {
		IdResolver idResolver = evaluator.getIdResolver();
		Type sourceType = asType(sourceValue);
		Set<Object> results = new OrderedSetImpl<Object>();
		for (Element instance : ((Enumeration)sourceType).getOwnedLiterals()) {
			if (instance != null) {
				results.add(idResolver.boxedValueOf(instance));
			}
		}
		return idResolver.createOrderedSetOfAll((CollectionTypeId)returnTypeId, results);
	}
}
