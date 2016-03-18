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
package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.policies.ComponentStoryNodeFigureEditPolicy;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryNodeEditPart;


public class CustomComponentStoryNodeEditPart extends ComponentStoryNodeEditPart {


	public CustomComponentStoryNodeEditPart(View view) {
		super(view);
	}


	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		ComponentStoryNodeFigureEditPolicy figureEditPolicy = (ComponentStoryNodeFigureEditPolicy)getEditPolicy("ComponentStoryNodeFigureRole");
		if(figureEditPolicy != null)
			figureEditPolicy.handleNotificationEvent(null);
	}
}