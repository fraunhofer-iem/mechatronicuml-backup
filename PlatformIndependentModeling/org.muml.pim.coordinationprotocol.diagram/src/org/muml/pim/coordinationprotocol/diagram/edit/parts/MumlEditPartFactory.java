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
package org.muml.pim.coordinationprotocol.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.muml.pim.coordinationprotocol.diagram.part.MumlVisualIDRegistry;

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
			switch (MumlVisualIDRegistry.getVisualID(view)) {

			case ModelElementCategoryEditPart.VISUAL_ID:
				return new ModelElementCategoryEditPart(view);

			case CoordinationProtocolEditPart.VISUAL_ID:
				return new CoordinationProtocolEditPart(view);

			case CoordinationProtocol2EditPart.VISUAL_ID:
				return new CoordinationProtocol2EditPart(view);

			case CoordinationProtocolNameEditPart.VISUAL_ID:
				return new CoordinationProtocolNameEditPart(view);

			case RoleEditPart.VISUAL_ID:
				return new RoleEditPart(view);

			case RoleNameEditPart.VISUAL_ID:
				return new RoleNameEditPart(view);

			case MessageBufferEditPart.VISUAL_ID:
				return new MessageBufferEditPart(view);

			case MessageBufferNameEditPart.VISUAL_ID:
				return new MessageBufferNameEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case MessageTypeEditPart.VISUAL_ID:
				return new MessageTypeEditPart(view);

			case MessageTypeNameEditPart.VISUAL_ID:
				return new MessageTypeNameEditPart(view);

			case ParameterEditPart.VISUAL_ID:
				return new ParameterEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case ConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
				return new ConnectorQualityOfServiceAssumptionsEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case CoordinationProtocolCoordinationProtocolContainerCompartmentEditPart.VISUAL_ID:
				return new CoordinationProtocolCoordinationProtocolContainerCompartmentEditPart(view);

			case MessageBufferMessageBufferCompartmentEditPart.VISUAL_ID:
				return new MessageBufferMessageBufferCompartmentEditPart(view);

			case MessageTypeMessageTypesCompartmentEditPart.VISUAL_ID:
				return new MessageTypeMessageTypesCompartmentEditPart(view);

			case AbstractCoordinationSpecificationRolesEditPart.VISUAL_ID:
				return new AbstractCoordinationSpecificationRolesEditPart(view);

			case RoleConnectorEditPart.VISUAL_ID:
				return new RoleConnectorEditPart(view);

			case DiscreteInteractionEndpointReceiverMessageBufferEditPart.VISUAL_ID:
				return new DiscreteInteractionEndpointReceiverMessageBufferEditPart(view);

			case RoleConnectorConnectorQualityOfServiceAssumptionsEditPart.VISUAL_ID:
				return new RoleConnectorConnectorQualityOfServiceAssumptionsEditPart(view);

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
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
