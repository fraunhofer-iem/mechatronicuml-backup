/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *   Adolfo Sanchez-Barbudo Herrera (University of York) - Bug 415697
 *******************************************************************************/

package org.eclipse.ocl.pivot.internal.utilities;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.common.OCLCommon;
import org.eclipse.ocl.common.preferences.PreferenceableOption;
import org.eclipse.ocl.pivot.resource.ProjectManager;
import org.eclipse.ocl.pivot.utilities.AbstractEnvironmentFactory;
import org.eclipse.ocl.pivot.utilities.Customizable;
import org.eclipse.ocl.pivot.utilities.Option;

/**
 * Implementation of the {@link EnvironmentFactoryInternal} for parsing OCL expressions
 * on Ecore models.
 */
public class PivotEnvironmentFactory extends AbstractEnvironmentFactory
{
	private @Nullable IProject project = null;		// Eclipse project for project-specifuc preferences
	private @Nullable IScopeContext[] scopeContexts = null;
	
	/**
	 * Initializes me with an optional <code>StandaloneProjectMap</code> of accessible resources and
	 * an optional <code>ModelManager</code> for loaded instances.
	 */
	public PivotEnvironmentFactory(@NonNull ProjectManager projectManager, @Nullable ResourceSet externalResourceSet) {
		super(projectManager, externalResourceSet);
	}
	
	@Override
	public @Nullable <T> T getValue(@NonNull Option<T> option) {
		@SuppressWarnings("unchecked") T result = (T) getOptions().get(option);
		if (result != null) {
			return result;
		}
		Customizable parent2 = getParent();
		if (parent2 != null) {
			return parent2.getValue(option);
		}
		if (option instanceof PreferenceableOption<?>) {
			if (project != null) {
				scopeContexts = new IScopeContext[]{ new ProjectScope(project), ConfigurationScope.INSTANCE};
			}
			else {
				scopeContexts = null;
			}
			@SuppressWarnings("unchecked") PreferenceableOption<T> preferenceableOption = (PreferenceableOption<T>)option;
			result = OCLCommon.getPreference(preferenceableOption, scopeContexts);
			if (result != null) {
				return result;
			}
		}		
		return option.getDefaultValue();
	}

	@Override
	public void setProject(@Nullable IProject project) {
		this.project = project;
	}
}
