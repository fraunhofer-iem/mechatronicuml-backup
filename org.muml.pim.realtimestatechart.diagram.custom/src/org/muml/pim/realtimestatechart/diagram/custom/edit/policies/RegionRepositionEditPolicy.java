package org.muml.pim.realtimestatechart.diagram.custom.edit.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.commands.AddCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableEditPolicyEx;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.diagram.part.RealtimestatechartDiagramEditorPlugin;

/**
 * This editpolicy allows reordering regions using drag and drop (MUML #653).
 * 
 * @since MUML 0.4
 * @see http://wiki.eclipse.org/GMF/Recipes
 */
public class RegionRepositionEditPolicy extends
		org.eclipse.gef.editpolicies.FlowLayoutEditPolicy {

	public RegionRepositionEditPolicy() {
	}

	protected Command createAddCommand(EditPart child, EditPart after) {
		int index = getHost().getChildren().indexOf(after);
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		AddCommand command = new AddCommand(editingDomain, new EObjectAdapter(
				(View) getHost().getModel()), new EObjectAdapter(
				(View) child.getModel()), index);
		return new ICommandProxy(command);
	}

	protected EditPolicy createChildEditPolicy(EditPart child) {
		ResizableEditPolicyEx policy = new ResizableEditPolicyEx();
		policy.setResizeDirections(0);
		return policy;
	}
	
	@Override
	public void showTargetFeedback(Request request) {
		// Make sure a Region is moved (and not a ConnectionPoint, see #723)
		if (request instanceof ChangeBoundsRequest) {
			List<?> parts = ((ChangeBoundsRequest) request).getEditParts();
			for (Object part : parts) {
				if (part instanceof GraphicalEditPart) {
					Object model = ((GraphicalEditPart) part).resolveSemanticElement();
					if (false == model instanceof Region) {
						// Do not show the feedback
						return;
					}
				}
			}
		}
		
		// Show the feedback
		super.showTargetFeedback(request);
	}


	protected Command createMoveChildCommand(EditPart child, EditPart after) {
		if (child == null || after == null) {
			return null;
		}
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		State element = (State) ((GraphicalEditPart) getHost())
				.resolveSemanticElement();
		Region childElement = (Region) ((GraphicalEditPart) child)
				.resolveSemanticElement();
		Region afterElement = (Region) ((GraphicalEditPart) after)
				.resolveSemanticElement();
		return new ICommandProxy(new RepositionCommand(editingDomain, element,
				childElement, afterElement) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				eraseLayoutTargetFeedback(null);
				return super.doExecuteWithResult(monitor, info);
			}
		});
	}

	protected Command getCreateCommand(CreateRequest request) {
		return null;
	}

	protected Command getDeleteDependantCommand(Request request) {
		return null;
	}

	protected Command getOrphanChildrenCommand(Request request) {
		return null;
	}

	private class RepositionCommand extends AbstractTransactionalCommand {
		private State state;
		private Region childElement;
		private Region destinationElement;

		public RepositionCommand(TransactionalEditingDomain domain,
				State state, Region childElement, Region afterElement) {
			super(domain, "Move Region", getWorkspaceFiles(state));
			this.state = state;
			this.childElement = childElement;
			this.destinationElement = afterElement;
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {
			CommandResult commandResult = null;
			try {
				// Create new order
				List<Region> newOrder = new ArrayList<Region>();
//				for (Region region : state.getEmbeddedRegions()) {
//
//					if (region == destinationElement) {
//						newOrder.add(childElement);
//					}
//					if (region != childElement) {
//						newOrder.add(region);
//					}
//				}
				if (destinationElement == null) {
					newOrder.add(childElement);
				}

				// Set using property descriptor
				IItemPropertyDescriptor propertyDescriptor = getPropertyDescriptor();
				if (propertyDescriptor != null) {
					propertyDescriptor.setPropertyValue(state, newOrder);
				}
			} catch (RuntimeException exp) {
				commandResult = CommandResult.newErrorCommandResult(exp);
			}
			return (commandResult == null) ? CommandResult.newOKCommandResult()
					: commandResult;
		}

		private IItemPropertyDescriptor getPropertyDescriptor() {
			IItemPropertySource ips = (IItemPropertySource) RealtimestatechartDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory()
					.adapt(state, IItemPropertySource.class);
//			for (IItemPropertyDescriptor descriptor : ips
//					.getPropertyDescriptors(state)) {
//				if (descriptor.getFeature(state) == RealtimestatechartPackage.Literals.STATE__EMBEDDED_REGIONS) {
//					return descriptor;
//				}
//			}
			return null;
		}

	}
}
