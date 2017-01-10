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
import org.muml.pim.coordinationprotocol.diagram.edit.commands.ConnectorQualityOfServiceAssumptionsCreateCommand;
import org.muml.pim.coordinationprotocol.diagram.edit.commands.CoordinationProtocol2CreateCommand;
import org.muml.pim.coordinationprotocol.diagram.edit.commands.MessageBufferCreateCommand;
import org.muml.pim.coordinationprotocol.diagram.edit.commands.RoleCreateCommand;
import org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class CoordinationProtocolCoordinationProtocolContainerCompartmentItemSemanticEditPolicy
		extends MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CoordinationProtocolCoordinationProtocolContainerCompartmentItemSemanticEditPolicy() {
		super(MumlElementTypes.CoordinationProtocol_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MumlElementTypes.CoordinationProtocol_3015 == req.getElementType()) {
			return getGEFWrapper(new CoordinationProtocol2CreateCommand(req));
		}
		if (MumlElementTypes.Role_3006 == req.getElementType()) {
			return getGEFWrapper(new RoleCreateCommand(req));
		}
		if (MumlElementTypes.MessageBuffer_3013 == req.getElementType()) {
			return getGEFWrapper(new MessageBufferCreateCommand(req));
		}
		if (MumlElementTypes.ConnectorQualityOfServiceAssumptions_3014 == req.getElementType()) {
			return getGEFWrapper(new ConnectorQualityOfServiceAssumptionsCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
