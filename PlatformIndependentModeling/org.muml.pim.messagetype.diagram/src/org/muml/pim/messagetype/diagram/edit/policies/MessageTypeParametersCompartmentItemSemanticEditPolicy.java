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
package org.muml.pim.messagetype.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MessageTypeParametersCompartmentItemSemanticEditPolicy
		extends org.muml.pim.messagetype.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageTypeParametersCompartmentItemSemanticEditPolicy() {
		super(org.muml.pim.messagetype.diagram.providers.MumlElementTypes.MessageType_3007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pim.messagetype.diagram.providers.MumlElementTypes.Parameter_3009 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.messagetype.diagram.edit.commands.ParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
