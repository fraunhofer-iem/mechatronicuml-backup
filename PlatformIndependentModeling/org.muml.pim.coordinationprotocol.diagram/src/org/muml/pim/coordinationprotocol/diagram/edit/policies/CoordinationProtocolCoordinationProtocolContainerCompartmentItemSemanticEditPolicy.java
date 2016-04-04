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
public class CoordinationProtocolCoordinationProtocolContainerCompartmentItemSemanticEditPolicy
		extends org.muml.pim.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CoordinationProtocolCoordinationProtocolContainerCompartmentItemSemanticEditPolicy() {
		super(org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.CoordinationProtocol_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.CoordinationProtocol_3015 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.coordinationprotocol.diagram.edit.commands.CoordinationProtocol2CreateCommand(
							req));
		}
		if (org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.Role_3006 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.coordinationprotocol.diagram.edit.commands.RoleCreateCommand(req));
		}
		if (org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.MessageBuffer_3013 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.coordinationprotocol.diagram.edit.commands.MessageBufferCreateCommand(
							req));
		}
		if (org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.ConnectorQualityOfServiceAssumptions_3014 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.coordinationprotocol.diagram.edit.commands.ConnectorQualityOfServiceAssumptionsCreateCommand(
							req));
		}
		return super.getCreateCommand(req);
	}

}