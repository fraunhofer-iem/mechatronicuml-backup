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
package org.eclipse.ocl.pivot.internal.library.ecore;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.AbstractProperty;

/** 
 * An EcoreLibraryProperty provides the LibraryProperty to implement a
 * PropertyCallExp using an EStructuralFeature.
 */
public class EcoreLibraryProperty extends AbstractProperty
{
	protected final @NonNull EStructuralFeature eFeature;

	public EcoreLibraryProperty(/*@NonNull*/ EStructuralFeature eFeature) {
		assert eFeature != null;
		this.eFeature = eFeature;
	}

	@Override
	public @Nullable Object evaluate(@NonNull Evaluator evaluator, @NonNull TypeId returnTypeId, @Nullable Object sourceValue) {
		EObject eObject = asNavigableObject(sourceValue, eFeature, evaluator);
		Object eValue = eObject.eGet(eFeature);
		return eValue != null ? evaluator.getIdResolver().boxedValueOf(eValue, eFeature, returnTypeId) : null;
	}
	
	public @NonNull EStructuralFeature getEFeature() {
		return eFeature;
	}

	@Override
	public String toString() {
		return String.valueOf(eFeature.getContainerClass().getPackage().getName()) + "::" + String.valueOf(eFeature.getContainerClass().getName()) + "." + String.valueOf(eFeature.getName());  //$NON-NLS-1$//$NON-NLS-2$
	}
}