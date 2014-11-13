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
package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MumlEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.ModelElementCategoryEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.CoordinationProtocolEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.CoordinationProtocol2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.CoordinationProtocol2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.CoordinationProtocolNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.CoordinationProtocolNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.MessageBuffer2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.MessageBuffer2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.MessageBufferName2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.MessageBufferName2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.MessageTypeEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.MessageTypeNameEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.MessageTypeNameEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.CoordinationProtocolCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.CoordinationProtocolCoordinationProtocolContainerCompartmentEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.MessageBufferMessageBufferCompartment2EditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.MessageBufferMessageBufferCompartment2EditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.AbstractCoordinationSpecificationRolesEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.RoleConnectorEditPart(
						view);

			case de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID:
				return new de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.edit.parts.DiscreteInteractionEndpointReceiverMessageBufferEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
