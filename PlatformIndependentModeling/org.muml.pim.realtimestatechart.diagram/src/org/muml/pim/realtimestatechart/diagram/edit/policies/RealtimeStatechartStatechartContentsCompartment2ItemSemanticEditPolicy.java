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
package org.muml.pim.realtimestatechart.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class RealtimeStatechartStatechartContentsCompartment2ItemSemanticEditPolicy
		extends org.muml.pim.realtimestatechart.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RealtimeStatechartStatechartContentsCompartment2ItemSemanticEditPolicy() {
		super(org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.RealtimeStatechart_3043);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes.State_3032 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.realtimestatechart.diagram.edit.commands.StateCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
