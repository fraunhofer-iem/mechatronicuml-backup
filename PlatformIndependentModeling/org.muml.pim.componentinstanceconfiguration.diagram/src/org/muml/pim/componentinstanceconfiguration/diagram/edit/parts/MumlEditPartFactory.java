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
package org.muml.pim.componentinstanceconfiguration.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry;

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

			case ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
				return new ComponentInstanceConfigurationDiagramEditPart(view);

			case HybridPortInstanceEditPart.VISUAL_ID:
				return new HybridPortInstanceEditPart(view);

			case HybridPortInstanceNameEditPart.VISUAL_ID:
				return new HybridPortInstanceNameEditPart(view);

			case DiscreteSinglePortInstanceEditPart.VISUAL_ID:
				return new DiscreteSinglePortInstanceEditPart(view);

			case DiscreteSinglePortInstanceNameEditPart.VISUAL_ID:
				return new DiscreteSinglePortInstanceNameEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case DiscreteMultiPortInstanceEditPart.VISUAL_ID:
				return new DiscreteMultiPortInstanceEditPart(view);

			case DiscreteMultiPortInstanceNameEditPart.VISUAL_ID:
				return new DiscreteMultiPortInstanceNameEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case ContinuousPortInstanceEditPart.VISUAL_ID:
				return new ContinuousPortInstanceEditPart(view);

			case ContinuousPortInstanceNameEditPart.VISUAL_ID:
				return new ContinuousPortInstanceNameEditPart(view);

			case AtomicComponentInstanceEditPart.VISUAL_ID:
				return new AtomicComponentInstanceEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case StructuredComponentInstanceEditPart.VISUAL_ID:
				return new StructuredComponentInstanceEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case CoordinationProtocolInstanceEditPart.VISUAL_ID:
				return new CoordinationProtocolInstanceEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case DiscreteSinglePortInstance2EditPart.VISUAL_ID:
				return new DiscreteSinglePortInstance2EditPart(view);

			case HybridPortInstance2EditPart.VISUAL_ID:
				return new HybridPortInstance2EditPart(view);

			case HybridPortInstanceName2EditPart.VISUAL_ID:
				return new HybridPortInstanceName2EditPart(view);

			case DiscreteSinglePortInstance3EditPart.VISUAL_ID:
				return new DiscreteSinglePortInstance3EditPart(view);

			case DiscreteSinglePortInstanceName3EditPart.VISUAL_ID:
				return new DiscreteSinglePortInstanceName3EditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case DiscreteMultiPortInstance2EditPart.VISUAL_ID:
				return new DiscreteMultiPortInstance2EditPart(view);

			case DiscreteMultiPortInstanceName2EditPart.VISUAL_ID:
				return new DiscreteMultiPortInstanceName2EditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case ContinuousPortInstance2EditPart.VISUAL_ID:
				return new ContinuousPortInstance2EditPart(view);

			case ContinuousPortInstanceName2EditPart.VISUAL_ID:
				return new ContinuousPortInstanceName2EditPart(view);

			case ComponentInstanceConfigurationEditPart.VISUAL_ID:
				return new ComponentInstanceConfigurationEditPart(view);

			case AtomicComponentInstance2EditPart.VISUAL_ID:
				return new AtomicComponentInstance2EditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case StructuredComponentInstance2EditPart.VISUAL_ID:
				return new StructuredComponentInstance2EditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case CoordinationProtocolInstance2EditPart.VISUAL_ID:
				return new CoordinationProtocolInstance2EditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
				return new DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart(view);

			case DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
				return new DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart(view);

			case StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID:
				return new StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart(view);

			case ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
				return new ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart(
						view);

			case StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID:
				return new StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart(view);

			case AssemblyConnectorInstanceEditPart.VISUAL_ID:
				return new AssemblyConnectorInstanceEditPart(view);

			case DelegationConnectorInstanceEditPart.VISUAL_ID:
				return new DelegationConnectorInstanceEditPart(view);

			case CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID:
				return new CoordinationProtocolInstancePortInstancesEditPart(view);

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
