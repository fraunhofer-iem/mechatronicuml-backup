package org.muml.pim.realtimestatechart.design.providers;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractDiagramEdgeEditPart;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.AirResizableEditPolicy;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.AirXYLayoutEditPolicy;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.RegionContainerResizableEditPolicy;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.RegionRegionContainerResizableEditPolicy;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.RegionResizableEditPolicy;
import org.eclipse.sirius.diagram.ui.internal.edit.commands.ChildrenAdjustmentCommand;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.muml.core.common.edit.policies.compartment.BorderlessCompartmentEditPolicy;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.design.edit.policies.SiriusTransitionColorEditPolicy;

import com.google.common.collect.Iterables;

public class MyEditPolicyProvider extends AbstractEditPolicyProvider {

	public void createEditPolicies(EditPart editPart) {
		if (getSemanticElement(editPart) instanceof RealtimeStatechart) {
			// Hack to get states resizable, even if they do not have any contents yet (see #1575)
			editPart.removeEditPolicy(EditPolicy.LAYOUT_ROLE);
			editPart.installEditPolicy(EditPolicy.LAYOUT_ROLE, new AirXYLayoutEditPolicy() {
				@Override
				protected EditPolicy createChildEditPolicy(final EditPart child) {
					EditPolicy childEditPolicy = super.createChildEditPolicy(child);
					if (childEditPolicy instanceof RegionContainerResizableEditPolicy) {
						childEditPolicy = new RegionContainerResizableEditPolicy() {
							@Override
							protected void completeResizeCommand(CompositeTransactionalCommand ctc,
									ChangeBoundsRequest request) {
								super.completeResizeCommand(ctc, request);
								if (!(request.isConstrainedMove() || request.isConstrainedResize())) {
									// Super implementation added unexecutable-command; we remove it again.
									ctc.remove(UnexecutableCommand.INSTANCE);
								}
							}
						};
					}
					return childEditPolicy;
				}
			});
		}
		if (editPart instanceof CompartmentEditPart) {
			editPart.installEditPolicy("BorderRole", new BorderlessCompartmentEditPolicy());
		}
		if (getSemanticElement(editPart) instanceof Transition && editPart instanceof AbstractDiagramEdgeEditPart) {
			editPart.installEditPolicy("FlashingRole", new SiriusTransitionColorEditPolicy());
		}
		if (getSemanticElement(editPart) instanceof State) {

		}
	}

	private EObject getSemanticElement(EditPart editPart) {
		Object model = editPart.getModel();
		if (model instanceof View) {
			View view = (View) model;
			EObject element = view.getElement();
			if (element instanceof DSemanticDecorator) {
				element = ((DSemanticDecorator) element).getTarget();
			}
			return element;
		}
		return null;
	}

	public boolean provides(IOperation operation) {
		if (operation instanceof CreateEditPoliciesOperation) {
			CreateEditPoliciesOperation castedOperation = (CreateEditPoliciesOperation) operation;
			EditPart editPart = castedOperation.getEditPart();
			EObject element = getSemanticElement(editPart);
			if (element instanceof Transition) {
				return true;
			}
			if (element instanceof State) {
				return true;
			}
			if (element instanceof RealtimeStatechart) {
				return true;
			}
		}
		return false;
	}

}
