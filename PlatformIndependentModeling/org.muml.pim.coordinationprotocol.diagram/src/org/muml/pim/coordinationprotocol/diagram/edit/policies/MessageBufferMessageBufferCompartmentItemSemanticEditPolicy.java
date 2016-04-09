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
import org.muml.pim.coordinationprotocol.diagram.edit.commands.MessageTypeCreateCommand;
import org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class MessageBufferMessageBufferCompartmentItemSemanticEditPolicy extends MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageBufferMessageBufferCompartmentItemSemanticEditPolicy() {
		super(MumlElementTypes.MessageBuffer_3013);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MumlElementTypes.MessageType_3009 == req.getElementType()) {
			return getGEFWrapper(new MessageTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
