/*******************************************************************************
 * Copyright (c) 2010, 2014 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - initial API and implementation
 *   E.D.Willink (CEA LIST) - Bug 388529
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.internal.scoping.AbstractAttribution;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;
import org.eclipse.ocl.pivot.utilities.Pivotable;

public class ClassAttribution extends AbstractAttribution
{
	public static final ClassAttribution INSTANCE = new ClassAttribution();

	@Override
	public ScopeView computeLookup(@NonNull EObject target, @NonNull EnvironmentView environmentView, @NonNull ScopeView scopeView) {
		org.eclipse.ocl.pivot.Class targetClass = (org.eclipse.ocl.pivot.Class) target;
		if (targetClass.getOwnedBindings().size() == 0) {
			EObject scopeTarget = scopeView.getTarget();
			if (scopeTarget instanceof Pivotable) {
				scopeTarget = ((Pivotable)scopeTarget).getPivot();
			}
			if (scopeTarget == target) {		// Inherited template parameters are invisible.
				environmentView.addAllTemplateParameters(targetClass);
			}
		}
		environmentView.addAllOperations(targetClass, null);
		environmentView.addAllProperties(targetClass, null);
		environmentView.addAllStates(targetClass);
//		if (!environmentView.hasFinalResult()) {
//			MetamodelManager metamodelManager = environmentView.getMetamodelManager();
//			Type metatype = metamodelManager.getPivotType(targetClass.eClass().getName());		// FIXME getMetaType
//			if (metatype != null) {
//				environmentView.addAllOperations(metatype, FeatureFilter.SELECT_STATIC);
//				environmentView.addAllProperties(metatype, FeatureFilter.SELECT_STATIC);
//			}
//		}
		return scopeView.getParent();
	}
}
