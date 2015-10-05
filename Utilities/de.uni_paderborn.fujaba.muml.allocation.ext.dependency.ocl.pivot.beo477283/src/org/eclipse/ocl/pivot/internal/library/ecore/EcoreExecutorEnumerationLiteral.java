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
package org.eclipse.ocl.pivot.internal.library.ecore;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.Enumeration;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.utilities.ClassUtil;

public class EcoreExecutorEnumerationLiteral extends ExecutorEnumerationLiteral
{
	protected final EEnumLiteral eEnumLiteral;
	
	public EcoreExecutorEnumerationLiteral(/*@NonNull*/ EEnumLiteral eEnumLiteral, @NonNull Enumeration enumeration, int ordinal) {
		super(ClassUtil.nonNullEMF(eEnumLiteral.getName()), enumeration, ordinal);
		this.eEnumLiteral = eEnumLiteral;
	}

//	@Override
	@Override
	public @NonNull Enumerator getEnumerator() {
		return ClassUtil.nonNullEMF(ClassUtil.nonNullState(eEnumLiteral).getInstance());
	}
}