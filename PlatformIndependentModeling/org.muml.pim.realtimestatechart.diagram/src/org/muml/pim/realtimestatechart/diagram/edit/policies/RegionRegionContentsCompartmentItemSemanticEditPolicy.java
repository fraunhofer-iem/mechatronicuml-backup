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
import org.muml.pim.realtimestatechart.diagram.edit.commands.RealtimeStatechart2CreateCommand;
import org.muml.pim.realtimestatechart.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class RegionRegionContentsCompartmentItemSemanticEditPolicy extends MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RegionRegionContentsCompartmentItemSemanticEditPolicy() {
		super(MumlElementTypes.Region_3042);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MumlElementTypes.RealtimeStatechart_3043 == req.getElementType()) {
			return getGEFWrapper(new RealtimeStatechart2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
