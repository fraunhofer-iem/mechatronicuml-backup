/*******************************************************************************
 * Copyright (c) 2011, 2014 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.validation;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.osgi.util.NLS;

public class ValidationWarning extends BasicDiagnostic
{
	public ValidationWarning(String messageTemplate, Object... bindings) {
		super(PivotMessages.Validation, WARNING, NLS.bind(messageTemplate, bindings), null);
	}
}