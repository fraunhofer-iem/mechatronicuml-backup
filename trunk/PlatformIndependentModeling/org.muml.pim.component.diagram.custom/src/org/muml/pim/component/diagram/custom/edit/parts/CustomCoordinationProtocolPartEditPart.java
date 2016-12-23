package org.muml.pim.component.diagram.custom.edit.parts;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.component.diagram.edit.parts.CoordinationProtocolPartEditPart;

public class CustomCoordinationProtocolPartEditPart extends
		CoordinationProtocolPartEditPart {

	public CustomCoordinationProtocolPartEditPart(View view) {
		super(view);
	}

	/**
	 * Customized the CoordinationProtocol NodeFigure to have an EllipseAnchor.
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40) {
			@Override
			public ConnectionAnchor createDefaultAnchor() {
				return new EllipseAnchor(this);
			}
		};
		result.setMinimumSize(new Dimension(0, 0));
		return result;
	}

	@Override
	public void activate() {
		super.activate();
		// necessary to show the role pattern connection right after setting the
		// Port.refines feature
		java.util.List<org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy> editPolicies = org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy
				.getRegisteredEditPolicies(getDiagramView().getElement());
		for (org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy editPolicy : editPolicies) {
			editPolicy.refresh();
		}
	}
//
//	@Override
//	protected void createDefaultEditPolicies() {
//		super.createDefaultEditPolicies();
//		removeEditPolicy(EditPolicy.COMPONENT_ROLE);
//		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentEditPolicy() {
//			@Override
//			public Command getCommand(Request request) {
//				// If the user presses the delete key, don't delete
//				boolean keyboardDelete = request instanceof GroupRequestViaKeyboard
//						&& RequestConstants.REQ_DELETE.equals(request.getType());
//				if (request.getType() == RequestConstants.REQ_DELETE
//						|| keyboardDelete) {
//					return UnexecutableCommand.INSTANCE;
//				}
//
//				return super.getCommand(request);
//			}
//		});
//		removeEditPolicy(EditPolicyRoles.SEMANTIC_ROLE);
//		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
//				new CoordinationProtocolItemSemanticEditPolicy() {
//
//					@Override
//					protected Command getSemanticCommand(
//							IEditCommandRequest request) {
//						if (request instanceof DestroyRequest) {
//							return null;
//						}
//						return super.getSemanticCommand(request);
//					}
//
//				});
//
//		// TODO: Try to prevent view creation in EditHelper!
//		installEditPolicy(
//				EditPolicy.GRAPHICAL_NODE_ROLE,
//				new org.muml.pim.common.edit.policies.node.ConnectionConfigureHelperGraphicalNodeEditPolicy() {
//					/*
//					 * Make sure the outer DiscretePorts do not connect to the
//					 * CoordinationProtocol figure. We do this by making the
//					 * View invisible initially. EditParts use this information
//					 * in their refreshVisibility() method.
//					 */
//					protected Command getConnectionCompleteCommand(
//							CreateConnectionRequest request) {
//						Command result = super
//								.getConnectionCompleteCommand(request);
//
//						ICommandProxy proxy = (ICommandProxy) request
//								.getStartCommand();
//						View view = (View) request.getSourceEditPart()
//								.getModel();
//						View containerView = (View) view.eContainer();
//						if (proxy != null
//								&& containerView.getElement() instanceof StructuredComponent) {
//							CompositeCommand cc = (CompositeCommand) proxy
//									.getICommand();
//							cc.add(new SetPropertyCommand(
//									getEditingDomain(),
//									"Set invisible",
//									getViewAdapter(),
//									"notation.View.visible",
//									//MetamodelManager.getID(NotationPackage.Literals.VIEW__VISIBLE),
//									Boolean.FALSE));
//						}
//						return result;
//					}
//				});
//	}
}
