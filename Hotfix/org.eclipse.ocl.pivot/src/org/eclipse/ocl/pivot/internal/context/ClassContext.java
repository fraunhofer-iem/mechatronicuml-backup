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

import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.utilities.EnvironmentFactory;
import org.eclipse.ocl.pivot.utilities.PivotConstants;

/**
 * ClassContext supports parsing OCL expressions in the context of a Class.
 */
public class ClassContext extends AbstractParserContext
{
	protected final @Nullable org.eclipse.ocl.pivot.Class classContext;
	protected final @Nullable Type instanceContext;
	
	public ClassContext(@NonNull EnvironmentFactory environmentFactory, @Nullable URI uri, @Nullable org.eclipse.ocl.pivot.Class classContext, @Nullable Type instanceContext) {
		super(environmentFactory, uri);
 		this.classContext = classContext != null ? getMetamodelManager().getPrimaryClass(classContext) : null;
		this.instanceContext = instanceContext;
	}

	@Override
	public @Nullable org.eclipse.ocl.pivot.Class getClassContext() {
		return classContext;
	}

	@Override
	public @Nullable Type getInstanceContext() {
		return instanceContext;
	}

	@Override
	public void initialize(@NonNull Base2ASConversion conversion, @NonNull ExpressionInOCL expression) {
		super.initialize(conversion, expression);
		conversion.setContextVariable(expression, PivotConstants.SELF_NAME, classContext, instanceContext);
	}
}
