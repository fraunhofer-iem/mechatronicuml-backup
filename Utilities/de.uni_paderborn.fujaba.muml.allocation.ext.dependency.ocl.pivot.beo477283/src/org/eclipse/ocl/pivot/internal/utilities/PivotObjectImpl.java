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
package org.eclipse.ocl.pivot.internal.utilities;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.pivot.utilities.PivotObject;

public abstract class PivotObjectImpl extends EObjectImpl implements PivotObject
{
	private @Nullable EObject esObject;

	@Override
	protected void eBasicSetContainer(InternalEObject newContainer, int newContainerFeatureID) {
		if (newContainer != null) {
			EObject oldContainer = eInternalContainer();
			assert (oldContainer == null) || oldContainer.eIsProxy() || (newContainer == oldContainer) || (oldContainer.eResource() == null);
		}		
		super.eBasicSetContainer(newContainer, newContainerFeatureID);
	}
	
	public @Nullable EObject getESObject() {
		return esObject;
	}
	
	@Deprecated // Use getESObject()
	public @Nullable EObject getETarget() {
		return esObject;
	}

	@Override
	public Object getImage() {
		return null;
	}
	
	@Deprecated // Use getESObject()
	public @Nullable EObject getTarget() {
		return esObject;
	}
	
	@Override
	public String getText() {
		return toString();
	}
	
	public void setESObject(@Nullable EObject newTarget) {
		esObject = newTarget;
	}
	
	@Deprecated // Use setESObject()
	public void setTarget(@Nullable EObject newTarget) {
		esObject = newTarget;
	}

	public void unloaded(@NonNull ASResource asResource) {
		esObject = null;
	}
}
