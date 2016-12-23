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
import org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.AtomicComponentInstance2CreateCommand;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.CoordinationProtocolInstance2CreateCommand;
import org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.StructuredComponentInstance2CreateCommand;
import org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentItemSemanticEditPolicy
		extends MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentItemSemanticEditPolicy() {
		super(MumlElementTypes.ComponentInstanceConfiguration_3023);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MumlElementTypes.AtomicComponentInstance_3024 == req.getElementType()) {
			return getGEFWrapper(new AtomicComponentInstance2CreateCommand(req));
		}
		if (MumlElementTypes.StructuredComponentInstance_3025 == req.getElementType()) {
			return getGEFWrapper(new StructuredComponentInstance2CreateCommand(req));
		}
		if (MumlElementTypes.CoordinationProtocolInstance_3035 == req.getElementType()) {
			return getGEFWrapper(new CoordinationProtocolInstance2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
