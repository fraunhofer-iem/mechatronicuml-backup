/*******************************************************************************
 * Copyright (c) 2011, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.executor;

import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.MapType;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.MapTypeId;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

public class ExecutorMapType extends AbstractSpecializedType implements MapType
{
	protected final @NonNull Type keyType;
	protected final @NonNull Type valueType;
	protected final @NonNull MapTypeId typeId;
	
	public ExecutorMapType(@NonNull String name,
			@NonNull org.eclipse.ocl.pivot.Class containerType, @NonNull Type keyType, @NonNull Type valueType) {
		super(name, containerType);
		this.keyType = keyType;
		this.valueType = valueType;
		this.typeId = IdManager.getMapTypeId(name).getSpecializedId(keyType.getTypeId(), valueType.getTypeId());
	}

	@Override
	public boolean conformsTo(@NonNull StandardLibrary standardLibrary, @NonNull Type type) {
		if (this == type) {
			return true;
		}
		if (!(type instanceof MapType)) {
			return false;
		}
		return TypeUtil.conformsToMapType(standardLibrary, this, (MapType)type);
	}

	@Override
	public @NonNull org.eclipse.ocl.pivot.Class getCommonType(@NonNull IdResolver idResolver, @NonNull Type type) {
		StandardLibrary standardLibrary = idResolver.getStandardLibrary();
		if (!(type instanceof ExecutorMapType)) {
			return standardLibrary.getOclAnyType();
		}
		ExecutorMapType thatClass = (ExecutorMapType) type;
		// FIXME kind
		org.eclipse.ocl.pivot.Class commonContainerClass = containerType;		// FIXME WIP
		Type commonKeyClass = keyType.getCommonType(idResolver, thatClass.getKeyType());
		Type commonValueClass = valueType.getCommonType(idResolver, thatClass.getValueType());
		if ((commonContainerClass == containerType) && (commonKeyClass == keyType) && (commonValueClass == valueType)) {
			return this;
		}
		else if ((commonContainerClass == thatClass.containerType) && (commonKeyClass == keyType) && (commonValueClass == valueType)) {
			return thatClass;
		}
		else {
			return standardLibrary.getMapType(standardLibrary.getMapType(), commonKeyClass, commonValueClass);
		}
	}

	@Override
	public @NonNull org.eclipse.ocl.pivot.Class getContainerType() {
		return containerType;
	}

	@Override
	public @NonNull Type getKeyType() {
		return keyType;
	}

//	@Override
//	public @NonNull String getMetaTypeName() {
//		return getTypeId().getCollectionTypeId().getMetaTypeName();
//	}

	@Override
	public @NonNull List<Operation> getOwnedOperations() {
		return containerType.getOwnedOperations();
	}

	@Override
	public @NonNull MapTypeId getTypeId() {
		return typeId;
	}

	@Override
	public @NonNull Type getValueType() {
		return valueType;
	}

	@Override
	public boolean isEqualTo(@NonNull StandardLibrary standardLibrary, @NonNull Type type) {
		if (this == type) {
			return true;
		}
		if (!(type instanceof MapType)) {
			return false;
		}
		return TypeUtil.isEqualToMapType(standardLibrary, this, (MapType)type);
	}

	@Override
	public void setKeyType(Type value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setValueType(Type value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return String.valueOf(containerType) + "(" + String.valueOf(keyType) + "," + String.valueOf(valueType) + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}