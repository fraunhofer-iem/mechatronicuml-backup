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
package org.muml.pim.componentinstanceconfiguration.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentItemSemanticEditPolicy extends
		org.muml.pim.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentItemSemanticEditPolicy() {
		super(org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_2023);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3026 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.DiscreteSinglePortInstance2CreateCommand(
							req));
		}
		return super.getCreateCommand(req);
	}

}
