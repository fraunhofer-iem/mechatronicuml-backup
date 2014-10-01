/**
 * Copyright (c) 2013 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.refactor;

import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.common.refactor.AbstractExtractSubdiagramRefactoring;
import de.uni_paderborn.fujaba.muml.hardware.common.refactor.AbstractRefactoring;
import de.uni_paderborn.fujaba.muml.hardware.common.refactor.AbstractViewRefactoringHandler;


/**
 * Handler for {@link AbstractExtractSubdiagramRefactoring}.
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class ExtractSubdiagramHandler extends AbstractViewRefactoringHandler {

	@Override
	public AbstractRefactoring<View> createRefactoring() {
		return new HWPICExtractSubdiagram();
	}
}
