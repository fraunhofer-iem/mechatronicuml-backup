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
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.ids.BindingsId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.ElementId;
import org.eclipse.ocl.pivot.ids.IdVisitor;
import org.eclipse.ocl.pivot.ids.OclVoidTypeId;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TypeId;

public class OclVoidTypeIdImpl extends UnscopedId implements OclVoidTypeId
{
	public OclVoidTypeIdImpl(@NonNull String name) {
		super(name);
	}

	@Override
	public @Nullable <R> R accept(@NonNull IdVisitor<R> visitor) {
		return visitor.visitNullId(this);
	}

	public @NonNull CollectionTypeId getCollectedTypeId() {
		return this;
	}

	public @NonNull TypeId getElementId() {
		return this;
	}

	@Override
	public @NonNull TypeId getElementTypeId() {
		return this;
	}

	@Override
	public @NonNull OclVoidTypeIdImpl getGeneralizedId() {
		return this;
	}

	@Override
	public int getIndex() {
		return 0;
	}

	@Override
	public @Nullable String getLiteralName() {
		if (this == TypeId.OCL_ANY) {
			return "OCL_ANY";
		}
		else {
			return "OCL_VOID";
		}
	}

	@Override
	public @NonNull String getMetaTypeName() {
		return "VoidType";
	}

	public @Nullable Element getOrigin() {
		return null;
	}

	public @NonNull TypeId getParent() {
		return this;									// FIXME Is this safe?
	}

	@Override
	public TuplePartId getPartId(@NonNull String name) {
		return null;
	}

	@Override
	public @NonNull TuplePartId[] getPartIds() {
		return NULL_TUPLE_PART_ID_ARRAY;
	}

	@Override
	public @NonNull OclVoidTypeIdImpl getSpecializedId(@NonNull BindingsId templateBindings) {
		return this;
	}

	@Override
	public @NonNull CollectionTypeId getSpecializedId(@NonNull ElementId... templateBindings) {
		return this;
	}
}