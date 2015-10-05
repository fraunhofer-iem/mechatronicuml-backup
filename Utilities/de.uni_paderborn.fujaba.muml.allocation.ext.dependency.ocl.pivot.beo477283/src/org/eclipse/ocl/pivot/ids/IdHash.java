/*******************************************************************************
 * Copyright (c) 2013, 2014 Willink Transformations and others.
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
import org.eclipse.jdt.annotation.Nullable;

public class IdHash
{
	private static final int GLOBAL_CONTEXT_SCALING = 3;
	private static final int FUNCTION_PARAMETER_SCALING = 3;
	private static final int PARENT_SCALING = 47;
	private static final int PART_SCALING = 3;
	private static final int SPECIALIZATION_SCALING = 5;

	public static int createChildHash(@Nullable ElementId parentId, @Nullable String name) {
		long hash = 0;
		if (parentId != null) {
			hash += PARENT_SCALING * longValueOf(parentId.hashCode());
		}
		if (name != null) {
			hash += longValueOf(name.hashCode());
		}
		return (int)hash;
	}

	public static int createGlobalHash(@Nullable Class<? extends ElementId> globalContext, @Nullable String name) {
		long hash = 0;
		if (globalContext != null) {
			hash += GLOBAL_CONTEXT_SCALING * longValueOf(globalContext.getName().hashCode());
		}
		if (name != null) {
			hash += longValueOf(name.hashCode());
		}
		return (int)hash;
	}

	public static int createParametersHash(@NonNull Class<?> globalContext, @NonNull ElementId[] typeIds) {
		long hash = 0;
		for (ElementId typeId : typeIds) {
			hash = FUNCTION_PARAMETER_SCALING * hash + longValueOf(typeId.hashCode());
		}
		return (int)hash + globalContext.getName().hashCode();
	}

	public static int createSpecialization(@NonNull ElementId... elementIds) {
		long hash = 0;
		for (int i = 0; i < elementIds.length; i++) {
			hash = SPECIALIZATION_SCALING * hash + longValueOf(elementIds[i].hashCode());
		}
		return (int)hash;
	}

	public static int createTupleHash(@NonNull String name, @NonNull TuplePartId[] orderedParts) {
		int hash = 0;
		for (TuplePartId partId : orderedParts) {
			hash = PART_SCALING * hash + partId.hashCode();
		}
		hash += IdHash.createGlobalHash(TupleTypeId.class, name);
		return hash;
	}

	public static long longValueOf(long signedValue) {
		if (signedValue >= 0) {
			return signedValue;
		}
		else {
			return signedValue + (1L << Integer.SIZE);
		}
	}
}