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
package org.eclipse.ocl.pivot.internal.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.DataType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.internal.scoping.AbstractAttribution;
import org.eclipse.ocl.pivot.internal.scoping.Attribution;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

public class DataTypeAttribution extends AbstractAttribution
{
	public static final DataTypeAttribution INSTANCE = new DataTypeAttribution();

	@Override
	public ScopeView computeLookup(@NonNull EObject target, @NonNull EnvironmentView environmentView, @NonNull ScopeView scopeView) {
		DataType targetElement = (DataType) target;
		Type behavioralType = targetElement.getBehavioralClass();
		Attribution attribution;
		if (behavioralType != null) {
			attribution = PivotUtilInternal.getAttribution(behavioralType);
		}
		else {
			attribution = ClassAttribution.INSTANCE;
		}
		environmentView.addAllTemplateParameters(targetElement);
		if (attribution != this) {
			return attribution.computeLookup(target, environmentView, scopeView);
		}
		else {
			return scopeView.getParent();
		}
	}
}
