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

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ComponentInstanceConfigurationDiagramItemSemanticEditPolicy extends
		org.muml.pim.componentinstanceconfiguration.diagram.edit.policies.MumlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentInstanceConfigurationDiagramItemSemanticEditPolicy() {
		super(org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ComponentInstanceConfiguration_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.HybridPortInstance_2021 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.HybridPortInstanceCreateCommand(
							req));
		}
		if (org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_2022 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.DiscreteSinglePortInstanceCreateCommand(
							req));
		}
		if (org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_2023 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.DiscreteMultiPortInstanceCreateCommand(
							req));
		}
		if (org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.ContinuousPortInstance_2024 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.ContinuousPortInstanceCreateCommand(
							req));
		}
		if (org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.AtomicComponentInstance_2016 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.AtomicComponentInstanceCreateCommand(
							req));
		}
		if (org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.StructuredComponentInstance_2015 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.StructuredComponentInstanceCreateCommand(
							req));
		}
		if (org.muml.pim.componentinstanceconfiguration.diagram.providers.MumlElementTypes.CoordinationProtocolInstance_2025 == req
				.getElementType()) {
			return getGEFWrapper(
					new org.muml.pim.componentinstanceconfiguration.diagram.edit.commands.CoordinationProtocolInstanceCreateCommand(
							req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
