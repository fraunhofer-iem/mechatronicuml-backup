package org.muml.reconfiguration.ui.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.component.diagram.custom.edit.parts.CustomStructuredcomponentEditPartFactory;

public class CustomReconfigurationEditPartFactory extends
		CustomStructuredcomponentEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;

			switch (org.muml.pim.component.diagram.part.MumlVisualIDRegistry
					.getVisualID(view)) {

			case org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart(
						view);
			case org.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.ui.edit.parts.ReconfigurationMessagePortEditPart(
						view);
				
			case org.muml.reconfiguration.ui.edit.parts.InternalReconfigurationCommunicationPortEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.ui.edit.parts.InternalReconfigurationCommunicationPortEditPart(
						view);

			case org.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.ui.edit.parts.ReconfigurationExecutionPortEditPart(
						view);

			case org.muml.reconfiguration.ui.edit.parts.RuleBasedReconfigurationControllerEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.ui.edit.parts.RuleBasedReconfigurationControllerEditPart(
						view);
				
			case org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentCompartmentEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentCompartmentEditPart(
						view);
				
			case org.muml.reconfiguration.ui.edit.parts.ManagerEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.ui.edit.parts.ManagerEditPart(
						view);
				
			case org.muml.reconfiguration.ui.edit.parts.ExecutorEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.ui.edit.parts.ExecutorEditPart(
						view);
				
			case org.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.ui.edit.parts.ReconfigurationPortDelegationConnectorEditPart(
						view);
			case org.muml.reconfiguration.ui.edit.parts.ReconfigurationPortAssemblyConnectorEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.ui.edit.parts.ReconfigurationPortAssemblyConnectorEditPart(
						view);
			case org.muml.reconfiguration.ui.edit.parts.ReconfigurableAtomicComponentEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.ui.edit.parts.ReconfigurableAtomicComponentEditPart(
						view);
			case org.muml.reconfiguration.ui.edit.parts.FadingComponentEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.ui.edit.parts.FadingComponentEditPart(
						view);
			case org.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart.VISUAL_ID:
				return new org.muml.reconfiguration.ui.edit.parts.BroadcastPortEditPart(
						view);
			}
		}
		return super.createEditPart(context, model);

	}

}
