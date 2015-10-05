/*******************************************************************************
 * Copyright (c) 2014, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.utilities;

import java.util.Comparator;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.internal.manager.Orphanage;
import org.eclipse.ocl.pivot.internal.resource.ASSaver;
import org.eclipse.ocl.pivot.internal.utilities.AS2Moniker;
import org.eclipse.ocl.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.pivot.util.Visitable;

/**
 * ASSaverNormalizeVisitor normalizes contents by alphabeticizing 
 * - lists of Property.
 */
public class ASSaverNormalizeVisitor extends AbstractExtendingVisitor<Object, ASSaver>
{
	protected static final class PropertyComparator implements Comparator<Property>
	{
		public static final @NonNull Comparator<Property> INSTANCE = new PropertyComparator();

		@Override
		public int compare(Property o1, Property o2) {
			assert o1 != null;
			assert o2 != null;
			int l1 = o1.isIsImplicit() ? 1 : 0;
			int l2 = o2.isIsImplicit() ? 1 : 0;
			if (l1 != l2) {
				return l1 - l2;
			}
			String n1 = o1.getName();
			String n2 = o2.getName();
			if (n1 == null) n1 = "";
			if (n2 == null) n2 = "";
			return n1.compareTo(n2);
		}
	}
	
	protected static final class TypeComparator implements Comparator<org.eclipse.ocl.pivot.Class>
	{
		public static final @NonNull Comparator<org.eclipse.ocl.pivot.Class> INSTANCE = new TypeComparator();

		@Override
		public int compare(org.eclipse.ocl.pivot.Class o1, org.eclipse.ocl.pivot.Class o2) {
			assert o1 != null;
			assert o2 != null;
			String n1 = AS2Moniker.toString(o1);
			String n2 = AS2Moniker.toString(o2);
			return n1.compareTo(n2);
		}
	}

	public ASSaverNormalizeVisitor(@NonNull ASSaver context) {
		super(context);
	}

	@Override
	public Object visitClass(@NonNull org.eclipse.ocl.pivot.Class object) {
		List<Property> ownedAttributes = object.getOwnedProperties();
		ClassUtil.sort(ownedAttributes, PropertyComparator.INSTANCE);
		return null;
	}

	@Override
	public Object visitPackage(@NonNull org.eclipse.ocl.pivot.Package object) {
		if (!(object instanceof Orphanage)) {			// The Orphanage is not assignable/sortable
			@NonNull List<org.eclipse.ocl.pivot.Class> ownedTypes = object.getOwnedClasses();
			ClassUtil.sort(ownedTypes, TypeComparator.INSTANCE);
		}
		return null;
	}

	@Override
	public Object visiting(@NonNull Visitable visitable) {
		return null;
	}
}
