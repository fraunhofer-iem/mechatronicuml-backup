package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

/**
 * @generated
 */
public class StructuredResourceInstanceStructuredResourceCompartmentEditPart
		extends ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7009;

	/**
	 * @generated
	 */
	public StructuredResourceInstanceStructuredResourceCompartmentEditPart(
			View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.Messages.StructuredResourceInstanceStructuredResourceCompartmentEditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();

		result.setTitleVisibility(false);

		// Begin added to always stretch list layouts
		LayoutManager layoutManager = result.getContentPane()
				.getLayoutManager();
		if (layoutManager instanceof ConstrainedToolbarLayout) {
			ConstrainedToolbarLayout constrainedToolbarLayout = (ConstrainedToolbarLayout) layoutManager;
			constrainedToolbarLayout.setStretchMajorAxis(true);
			constrainedToolbarLayout.setStretchMinorAxis(true);
		}
		// End added

		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies.StructuredResourceInstanceStructuredResourceCompartmentItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.edit.policies.StructuredResourceInstanceStructuredResourceCompartmentCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.CacheInstance_3017) {
				return this;
			}
			if (type == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.ProgrammableLogicDeviceInstance_3018) {
				return this;
			}
			if (type == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.ProcessorInstance_3019) {
				return this;
			}
			if (type == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.ProcessingMemoryInstance_3020) {
				return this;
			}
			if (type == de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.providers.HardwareElementTypes.StorageMemoryInstance_3021) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
