/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.CompleteInheritance;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.TupleType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.util.Visitor;
import org.eclipse.ocl.pivot.utilities.NameUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@SuppressWarnings("cast")
public class TupleTypeImpl
		extends DataTypeImpl
		implements TupleType {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TupleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.TUPLE_TYPE;
	}
	
	private /*final @NonNull*/ TupleTypeId tupleTypeId;		// PivotSaver has to 'clone' these using EcoreUtil.Copier
	
	public TupleTypeImpl(@NonNull TupleTypeId tupleTypeId) {
		this.tupleTypeId = tupleTypeId;
		setName(tupleTypeId.getName());
	}

	@Override
	public @NonNull TypeId computeId() {
		TupleTypeId tupleTypeId2 = tupleTypeId;
		if (tupleTypeId2 == null) {
			String name2 = NameUtil.getSafeName(this);
			List<Property> parts = getOwnedProperties();
			int iSize = parts.size();
			List<TuplePartId> partIds = new ArrayList<TuplePartId>(iSize);
			for (int i = 0; i < iSize; i++) {
				@SuppressWarnings("null")@NonNull TypedElement part = parts.get(i);
				String partName = NameUtil.getSafeName(part);
				TypeId partTypeId = part.getTypeId();
				partIds.add(IdManager.getTuplePartId(i, partName, partTypeId));
			}
			tupleTypeId = tupleTypeId2 = IdManager.getTupleTypeId(name2, partIds);
		}
		return tupleTypeId2;
	}

	@Override
	public <R> R accept(@NonNull Visitor<R> visitor) {
		return visitor.visitTupleType(this);
	}

	@Override
	public @NonNull CompleteInheritance getInheritance(@NonNull StandardLibrary standardLibrary) {
		Type tupleType = standardLibrary.getOclTupleType();
		return tupleType.getInheritance(standardLibrary);
	}

	@Override
	public @NonNull TupleTypeId getTupleTypeId() {
		return (TupleTypeId) getTypeId();
	}

	@Override
	public @NonNull TupleTypeId getTypeId() {
		return (TupleTypeId) super.getTypeId();
	}
} //TupleTypeImpl
