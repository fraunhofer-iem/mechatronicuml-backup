/*******************************************************************************
 * Copyright (c) 2013, 2014 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.ids;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.ParametersId;
import org.eclipse.ocl.pivot.ids.TypeId;

/**
 * ParametersId provides a hashed list of typeIds suitable for characterizing an operation signature.
 * parameter ids suitable for use when indexing operation overloads.
 */
public class ParametersIdImpl implements ParametersId, WeakHashMapOfListOfWeakReference2.MatchableId<TypeId[]>
{
	protected class Iterator implements java.util.Iterator<TypeId>
	{
		private int index = 0;
		
		@Override
		public boolean hasNext() {
			return index < typeIds.length;
		}

		@Override
		@SuppressWarnings("null")
		public @NonNull TypeId next() {
			return typeIds[index++];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	private final @NonNull Integer hashCode;
	private final @NonNull TypeId[] typeIds;

	/**
	 * Construct a ParametersId for an idManager that has computed the hashCode for the typeIds.
	 */
	public ParametersIdImpl(@NonNull IdManager idManager, @NonNull Integer hashCode, @NonNull TypeId[] typeIds) {
		this.hashCode = hashCode;
		this.typeIds = typeIds;
	}

	@Override
	public final boolean equals(Object obj) {
		return obj == this;
	}

	@Override
	public @NonNull TypeId get(int index) {
		TypeId parameterType = typeIds[index];
		assert parameterType != null;
		return parameterType;
	}

	public @NonNull TypeId[] get() {
		return typeIds;
	}


	@Override
	public int hashCode() {
		return hashCode;
	}

	@Override
	public java.util.Iterator<TypeId> iterator() {
		return new Iterator();
	}

	@Override
	public boolean matches(@NonNull TypeId[] thoseTypeIds) {
		if (typeIds.length != thoseTypeIds.length) {
			return false;
		}
		for (int i = 0; i < typeIds.length; i++) {
			if (typeIds[i] != thoseTypeIds[i]) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int size() {
		return typeIds.length;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append('(');
		for (int i = 0; i < typeIds.length; i++) {
			if (i > 0) {
				s.append(',');
			}
			TypeId typeId = typeIds[i];
			s.append(typeId != null ? typeId.toString() : "null");
		}
		s.append(')');
		return s.toString();
	}
}