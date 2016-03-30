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
package org.muml.pim.coordinationprotocol.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MessageTypeMessageTypesCompartmentItemSemanticEditPolicy
		extends org.muml.pim.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageTypeMessageTypesCompartmentItemSemanticEditPolicy() {
		super(org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.MessageType_3009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.Parameter_3016 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.coordinationprotocol.diagram.edit.commands.ParameterCreateCommand(
							req));
		}
		return super.getCreateCommand(req);
	}

}
