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

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class DiscreteInteractionEndpointReceiverMessageBufferItemSemanticEditPolicy
		extends org.muml.pim.coordinationprotocol.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DiscreteInteractionEndpointReceiverMessageBufferItemSemanticEditPolicy() {
		super(org.muml.pim.coordinationprotocol.diagram.providers.MumlElementTypes.DiscreteInteractionEndpointReceiverMessageBuffer_4008);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req) {
			protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info)
					throws ExecutionException {
				EObject referencedObject = getReferencedObject();
				Resource resource = referencedObject.eResource();
				CommandResult result = super.doExecuteWithResult(progressMonitor, info);
				if (resource != null) {
					resource.getContents().add(referencedObject);
				}
				return result;
			}
		});
	}

}