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
package org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComponentVariableComponentVariableCompartment2ItemSemanticEditPolicy
		extends
		org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentStoryDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentVariableComponentVariableCompartment2ItemSemanticEditPolicy() {
		super(
				org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ComponentVariable_3023);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ComponentPartVariable_3014 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.PartVariableCreateCommand(
					req));
		}
		if (org.muml.reconfiguration.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.FadingComponentPartVariable_3024 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.componentstorydiagram.diagram.edit.commands.FadingComponentPartVariableCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
