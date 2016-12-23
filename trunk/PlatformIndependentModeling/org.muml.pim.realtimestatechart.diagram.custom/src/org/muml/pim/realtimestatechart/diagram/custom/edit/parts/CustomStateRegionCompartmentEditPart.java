package org.muml.pim.realtimestatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.pim.realtimestatechart.diagram.custom.edit.policies.RegionRepositionEditPolicy;
import org.muml.pim.realtimestatechart.diagram.edit.parts.RegionEditPart;
import org.muml.pim.realtimestatechart.diagram.edit.parts.StateRegionCompartmentEditPart;

public class CustomStateRegionCompartmentEditPart extends
		StateRegionCompartmentEditPart {
	// public static final String DEFAULT_SORTING_KEY = "default_sorting_key";

	public CustomStateRegionCompartmentEditPart(View view) {
		super(view);
	}

	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		super.addChildVisual(childEditPart, index);
		updateRegionBorders();
	}

	@Override
	protected void removeChildVisual(EditPart childEditPart) {
		super.removeChildVisual(childEditPart);
		updateRegionBorders();
	}

	// Convenience method to make sure all Regions, except the Region at the
	// bottom have a dashed bottom border.
	private void updateRegionBorders() {
		LineBorder lastLineBorder = null;
		for (Object editPart : getChildren()) {
			if (editPart instanceof RegionEditPart) {
				RegionEditPart regionEditPart = (RegionEditPart) editPart;
				if (getContentPane().getChildren().contains(
						regionEditPart.getFigure())) {
					Border border = regionEditPart.getPrimaryShape()
							.getBorder();
					if (border instanceof LineBorder) {
						LineBorder lineBorder = (LineBorder) border;
						lineBorder.setColor(ColorConstants.black);
						lastLineBorder = lineBorder;
					}
				}
			}
		}
		if (lastLineBorder != null) {
			lastLineBorder.setColor(ColorConstants.white);
		}
	}

	// BEGIN #72: Visual order of regions depends on the order of regions in the model.
	// DEACTIVATED: not necessary for #72 to work, but kept for reference purposes.
//	@Override
//	protected Comparator<Shape> getComparator(String name,
//			SortingDirection direction) {
//		if (DEFAULT_SORTING_KEY.equals(name)) {
//			return new StateCompartmentComparator(direction);
//		}
//		return null;
//	}
//
//	public class StateCompartmentComparator implements Comparator<Shape> {
//
//		private final SortingDirection direction;
//
//		public StateCompartmentComparator(SortingDirection direction) {
//			this.direction = direction;
//		}
//
//		@Override
//		public int compare(Shape lhs, Shape rhs) {
//			State state = (State) CustomStateRegionCompartmentEditPart.this
//					.resolveSemanticElement();
//
//			int result = 0;
//			for (Region region : state.getEmbeddedRegions()) {
//				if (lhs.getElement() == region) {
//					result = 1;
//					break;
//				} else if (rhs.getElement() == region) {
//					result = -1;
//					break;
//				}
//			}
//
//			if (direction.getValue() == SortingDirection.DESCENDING) {
//				result = -result;
//			}
//			return result;
//
//		}
//	}
	// END #72

	// Begin MUML #653 (Use drag'n'drop to change region priorities)
	// See solution at http://wiki.eclipse.org/GMF/Recipes
	public IFigure createFigure() {
		ResizableCompartmentFigure rcf = (ResizableCompartmentFigure) super
				.createFigure();
		FlowLayout layout = new FlowLayout();
		layout.setMajorSpacing(getMapMode().DPtoLP(5));
		layout.setMinorSpacing(getMapMode().DPtoLP(5));
		// Caution: This actually makes it vertical, because setHorizontal is
		// implemented wrongly.
		layout.setHorizontal(true);
		rcf.getContentPane().setLayoutManager(layout);
		rcf.setTitleVisibility(false);
		return rcf;
	}

	@Override
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new RegionRepositionEditPolicy());
		super.createDefaultEditPolicies();
	}
	// END #653

}
