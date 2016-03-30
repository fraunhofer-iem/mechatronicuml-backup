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
package org.muml.pim.component.diagram.edit.parts;

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
			switch (org.muml.pim.component.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {

			case org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.ModelElementCategoryEditPart(view);

			case org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentEditPart(
						view);

			case org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentNameEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.StaticAtomicComponentNameEditPart(
						view);

			case org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentEditPart(
						view);

			case org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentNameEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentNameEditPart(
						view);

			case org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.DiscretePortEditPart(view);

			case org.muml.pim.component.diagram.edit.parts.DiscretePortNameEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.DiscretePortNameEditPart(view);

			case org.muml.pim.component.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.WrappingLabelEditPart(view);

			case org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.ContinuousPortEditPart(view);

			case org.muml.pim.component.diagram.edit.parts.ContinuousPortNameEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.ContinuousPortNameEditPart(view);

			case org.muml.pim.component.diagram.edit.parts.HybridPortEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.HybridPortEditPart(view);

			case org.muml.pim.component.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.WrappingLabel2EditPart(view);

			case org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.ComponentPartEditPart(view);

			case org.muml.pim.component.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.WrappingLabel3EditPart(view);

			case org.muml.pim.component.diagram.edit.parts.PortPartEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.PortPartEditPart(view);

			case org.muml.pim.component.diagram.edit.parts.PortPartNameEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.PortPartNameEditPart(view);

			case org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart(
						view);

			case org.muml.pim.component.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.WrappingLabel4EditPart(view);

			case org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.StaticStructuredComponentComponentCompartmentEditPart(
						view);

			case org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.AssemblyConnectorEditPart(view);

			case org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.DelegationConnectorEditPart(view);

			case org.muml.pim.component.diagram.edit.parts.PortPartCoordinationProtocolPartEditPart.VISUAL_ID:
				return new org.muml.pim.component.diagram.edit.parts.PortPartCoordinationProtocolPartEditPart(
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
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
