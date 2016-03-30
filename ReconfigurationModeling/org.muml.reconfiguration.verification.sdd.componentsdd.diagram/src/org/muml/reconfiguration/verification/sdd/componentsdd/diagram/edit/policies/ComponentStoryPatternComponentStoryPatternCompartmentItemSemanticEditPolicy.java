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
package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComponentStoryPatternComponentStoryPatternCompartmentItemSemanticEditPolicy
		extends
		org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.policies.ComponentSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentStoryPatternComponentStoryPatternCompartmentItemSemanticEditPolicy() {
		super(
				org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.ComponentStoryPattern_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.ComponentVariable_3002 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.commands.ComponentVariableCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
