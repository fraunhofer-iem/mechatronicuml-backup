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
			switch (org.muml.pim.componentinstanceconfiguration.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceNameEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceNameEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel7EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceNameEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel9EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceNameEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceNameEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstanceEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstanceEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel5EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance2EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstance2EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceName2EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.HybridPortInstanceName2EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstance3EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceName3EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteSinglePortInstanceName3EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel8EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstance2EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceName2EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel10EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstance2EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceName2EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ContinuousPortInstanceName2EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AtomicComponentInstance2EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstance2EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstance2EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.WrappingLabel6EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartmentEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DiscreteMultiPortInstanceDiscreteMultiPortInstanceCompartment2EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartmentEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.StructuredComponentInstanceComponentInstanceContentsCompartment2EditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.AssemblyConnectorInstanceEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.DelegationConnectorInstanceEditPart(
						view);

			case org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart.VISUAL_ID:
				return new org.muml.pim.componentinstanceconfiguration.diagram.edit.parts.CoordinationProtocolInstancePortInstancesEditPart(
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
