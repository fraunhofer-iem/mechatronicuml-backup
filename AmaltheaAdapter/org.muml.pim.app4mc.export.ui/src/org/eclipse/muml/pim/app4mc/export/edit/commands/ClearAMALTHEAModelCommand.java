/*******************************************************************************
 * Copyright (c) 2016 Fraunhofer IEM.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    David Schmelter - initial implementation
 *******************************************************************************/
package org.eclipse.muml.pim.app4mc.export.edit.commands;

import java.util.Collections;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.ChangeCommand;

/**
 * {@link ChangeCommand} that removes the {@link SWModel} from an
 * {@link Amalthea} model.
 * 
 * @author David Schmelter
 */
public class ClearAMALTHEAModelCommand extends ChangeCommand {

	private Amalthea amalthea;

	public ClearAMALTHEAModelCommand(Amalthea amalthea) {
		super(Collections.emptyList());
		this.amalthea = amalthea;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.command.ChangeCommand#doExecute()
	 */
	@Override
	protected void doExecute() {
		if (amalthea.getSwModel() != null) {
			EcoreUtil.delete(amalthea.getSwModel(), true);
		}
	}
}
