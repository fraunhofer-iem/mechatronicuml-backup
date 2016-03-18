/*******************************************************************************
 * Copyright (c) 2012, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.context;

import org.eclipse.ocl.pivot.Constraint;

/**
 * DiagnosticContext supports parsing an OCL diagnostic expression reusing the context of an invariant.
 */
public class DiagnosticContext extends ClassContext
{
	public DiagnosticContext(ClassContext parserContext, Constraint constraint) {
		super(parserContext.getEnvironmentFactory(), null, parserContext.getClassContext(), parserContext.getInstanceContext());
	}
}
