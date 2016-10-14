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
import java.util.List;
import java.util.Vector;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.RootNode;

/**
 * {@link ChangeCommand} that removes the runnables category (key
 * "org.muml.pim.runnables.category") from the {@link ModelElementCategory} of a
 * MechatronicUML model.
 * 
 * @author David Schmelter
 */
public class ClearMUMLRunnablesCommand extends ChangeCommand {

	private RootNode rootNode;

	public ClearMUMLRunnablesCommand(RootNode rootNode) {
		super(Collections.emptyList());
		this.rootNode = rootNode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.command.ChangeCommand#doExecute()
	 */
	@Override
	protected void doExecute() {
		List<EObject> elements = new Vector<>();
		rootNode.getCategories().forEach(c -> {
			if ("org.muml.pim.runnables.category".equals(c.getKey())) {
				elements.add(c);
			}
		});
		elements.forEach(e -> EcoreUtil.delete(e, true));
	}
}
