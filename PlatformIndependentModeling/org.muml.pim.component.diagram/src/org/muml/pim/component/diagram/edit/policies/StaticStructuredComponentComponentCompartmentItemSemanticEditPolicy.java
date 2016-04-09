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
package org.muml.pim.component.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.muml.pim.component.diagram.edit.commands.ComponentPartCreateCommand;
import org.muml.pim.component.diagram.edit.commands.CoordinationProtocolPartCreateCommand;
import org.muml.pim.component.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class StaticStructuredComponentComponentCompartmentItemSemanticEditPolicy
		extends MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StaticStructuredComponentComponentCompartmentItemSemanticEditPolicy() {
		super(MumlElementTypes.StaticStructuredComponent_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MumlElementTypes.ComponentPart_3012 == req.getElementType()) {
			return getGEFWrapper(new ComponentPartCreateCommand(req));
		}
		if (MumlElementTypes.CoordinationProtocolPart_3016 == req.getElementType()) {
			return getGEFWrapper(new CoordinationProtocolPartCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
