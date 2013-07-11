package de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.custom.edit.parts;

import java.util.Comparator;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.SortingDirection;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.RegionEditPart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.diagram.edit.parts.StateRegionCompartmentEditPart;

public class CustomStateRegionCompartmentEditPart extends
		StateRegionCompartmentEditPart {
//	public static final String DEFAULT_SORTING_KEY = "default_sorting_key";

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
//			State state = (State) CustomStateRegionCompartmentEditPart.this.resolveSemanticElement();
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
//	// END #72


}
