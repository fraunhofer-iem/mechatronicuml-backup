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
package org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ComponentStoryDecisionDiagramItemSemanticEditPolicy
		extends
		org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.policies.ComponentSDDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentStoryDecisionDiagramItemSemanticEditPolicy() {
		super(
				org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.ComponentStoryDecisionDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.ComponentStoryPatternNode_2003 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.commands.ComponentStoryPatternNodeCreateCommand(
					req));
		}
		if (org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.LeafNode_2002 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.commands.LeafNodeCreateCommand(
					req));
		}
		if (org.muml.reconfiguration.verification.sdd.componentsdd.diagram.providers.ComponentSDDElementTypes.InitialNode_2004 == req
				.getElementType()) {
			return getGEFWrapper(new org.muml.reconfiguration.verification.sdd.componentsdd.diagram.edit.commands.InitialNodeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
