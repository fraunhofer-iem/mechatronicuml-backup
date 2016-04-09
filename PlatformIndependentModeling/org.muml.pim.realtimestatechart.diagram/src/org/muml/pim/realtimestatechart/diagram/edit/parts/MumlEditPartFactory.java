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
package org.muml.pim.realtimestatechart.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.muml.pim.realtimestatechart.diagram.part.MumlVisualIDRegistry;

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

			case RealtimeStatechartEditPart.VISUAL_ID:
				return new RealtimeStatechartEditPart(view);

			case RealtimeStatechartNameEditPart.VISUAL_ID:
				return new RealtimeStatechartNameEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case StateEditPart.VISUAL_ID:
				return new StateEditPart(view);

			case StateNameEditPart.VISUAL_ID:
				return new StateNameEditPart(view);

			case EntryEventEditPart.VISUAL_ID:
				return new EntryEventEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case DoEventEditPart.VISUAL_ID:
				return new DoEventEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case ExitEventEditPart.VISUAL_ID:
				return new ExitEventEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case ClockConstraintEditPart.VISUAL_ID:
				return new ClockConstraintEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case SynchronizationChannelEditPart.VISUAL_ID:
				return new SynchronizationChannelEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case RegionEditPart.VISUAL_ID:
				return new RegionEditPart(view);

			case RegionNameEditPart.VISUAL_ID:
				return new RegionNameEditPart(view);

			case RegionPriorityEditPart.VISUAL_ID:
				return new RegionPriorityEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case RealtimeStatechart2EditPart.VISUAL_ID:
				return new RealtimeStatechart2EditPart(view);

			case EntryPointEditPart.VISUAL_ID:
				return new EntryPointEditPart(view);

			case ExitPointEditPart.VISUAL_ID:
				return new ExitPointEditPart(view);

			case RealtimeStatechartStatechartContentsCompartmentEditPart.VISUAL_ID:
				return new RealtimeStatechartStatechartContentsCompartmentEditPart(view);

			case StateActionCompartmentEditPart.VISUAL_ID:
				return new StateActionCompartmentEditPart(view);

			case StateRegionCompartmentEditPart.VISUAL_ID:
				return new StateRegionCompartmentEditPart(view);

			case StateChannelCompartmentEditPart.VISUAL_ID:
				return new StateChannelCompartmentEditPart(view);

			case StateInvariantCompartmentEditPart.VISUAL_ID:
				return new StateInvariantCompartmentEditPart(view);

			case RegionRegionContentsCompartmentEditPart.VISUAL_ID:
				return new RegionRegionContentsCompartmentEditPart(view);

			case RealtimeStatechartStatechartContentsCompartment2EditPart.VISUAL_ID:
				return new RealtimeStatechartStatechartContentsCompartment2EditPart(view);

			case TransitionEditPart.VISUAL_ID:
				return new TransitionEditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

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
