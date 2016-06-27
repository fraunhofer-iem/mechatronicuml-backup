/*
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentSDDEditPartFactory;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.parts.ComponentStoryDecisionDiagramEditPart;
import org.muml.reconfiguration.verification.sdd.componentsdd.diagram.part.ComponentSDDVisualIDRegistry;

/**
 * @generated
 */
public class ComponentSDDEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public ComponentSDDEditPartProvider() {
		super(new ComponentSDDEditPartFactory(), ComponentSDDVisualIDRegistry.TYPED_INSTANCE,
				ComponentStoryDecisionDiagramEditPart.MODEL_ID);
	}

}
