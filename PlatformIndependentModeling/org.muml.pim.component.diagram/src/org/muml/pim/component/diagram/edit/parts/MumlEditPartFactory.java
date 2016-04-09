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
import org.muml.pim.component.diagram.part.MumlVisualIDRegistry;

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

			case StaticAtomicComponentEditPart.VISUAL_ID:
				return new StaticAtomicComponentEditPart(view);

			case StaticAtomicComponentNameEditPart.VISUAL_ID:
				return new StaticAtomicComponentNameEditPart(view);

			case StaticStructuredComponentEditPart.VISUAL_ID:
				return new StaticStructuredComponentEditPart(view);

			case StaticStructuredComponentNameEditPart.VISUAL_ID:
				return new StaticStructuredComponentNameEditPart(view);

			case DiscretePortEditPart.VISUAL_ID:
				return new DiscretePortEditPart(view);

			case DiscretePortNameEditPart.VISUAL_ID:
				return new DiscretePortNameEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case ContinuousPortEditPart.VISUAL_ID:
				return new ContinuousPortEditPart(view);

			case ContinuousPortNameEditPart.VISUAL_ID:
				return new ContinuousPortNameEditPart(view);

			case HybridPortEditPart.VISUAL_ID:
				return new HybridPortEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ComponentPartEditPart.VISUAL_ID:
				return new ComponentPartEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case PortPartEditPart.VISUAL_ID:
				return new PortPartEditPart(view);

			case PortPartNameEditPart.VISUAL_ID:
				return new PortPartNameEditPart(view);

			case CoordinationProtocolPartEditPart.VISUAL_ID:
				return new CoordinationProtocolPartEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case StaticStructuredComponentComponentCompartmentEditPart.VISUAL_ID:
				return new StaticStructuredComponentComponentCompartmentEditPart(view);

			case AssemblyConnectorEditPart.VISUAL_ID:
				return new AssemblyConnectorEditPart(view);

			case DelegationConnectorEditPart.VISUAL_ID:
				return new DelegationConnectorEditPart(view);

			case PortPartCoordinationProtocolPartEditPart.VISUAL_ID:
				return new PortPartCoordinationProtocolPartEditPart(view);

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
