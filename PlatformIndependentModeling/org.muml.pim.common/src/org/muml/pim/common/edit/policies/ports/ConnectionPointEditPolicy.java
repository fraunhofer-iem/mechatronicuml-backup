package org.muml.pim.common.edit.policies.ports;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.muml.pim.common.edit.policies.EditPolicyRoles;
import org.muml.pim.common.edit.policies.statechart.StateEditPolicy;
import org.muml.pim.common.figures.CustomBorderItemLocator;

public class ConnectionPointEditPolicy extends
		AbstractRotatingBorderItemEditPolicy {


	private BorderItemLocator originalBorderItemLocator;
	private CustomBorderItemLocator customBorderItemLocator;
	private StateEditPolicy stateEditPolicy;

	@Override
	public void activate() {
		
		// store access to the StateEditPolicy, if found
		EditPart ep = getHost().getParent();
		while (ep != null) {
			StateEditPolicy editPolicy = (StateEditPolicy) ep.getEditPolicy(EditPolicyRoles.STATE_VISUALIZATION_ROLE);
			if (editPolicy != null) {
				this.stateEditPolicy = editPolicy;
				break;
			}
			ep = ep.getParent();
		}

		// store original border item locator and replace it
		IFigure parentFigure = getHostFigure().getParent();
		if (parentFigure != null && parentFigure.getLayoutManager() != null) {
			Object constraint = parentFigure.getLayoutManager().getConstraint(
					getHostFigure());
			if (constraint instanceof BorderItemLocator) {
				originalBorderItemLocator = (BorderItemLocator) constraint;
				customBorderItemLocator = createCustomLocator(originalBorderItemLocator);
				parentFigure.getLayoutManager().setConstraint(getHostFigure(),
						customBorderItemLocator);
			}
		}
		
		super.activate();
	}

	protected CustomBorderItemLocator createCustomLocator(
			BorderItemLocator original) {
		CustomBorderItemLocator locator = new CustomBorderItemLocator(original.getParentFigure(),
				original.getPreferredSideOfParent());
		
		// Copying the Constraint is not possible, because BorderItemLocator.getConstraint() is protected.
		// So we recalculate it.
		// Copied from AbstractBorderItemEditPart.refreshBounds()
		GraphicalEditPart host = (GraphicalEditPart) getHost();
		int x = ((Integer) host.getStructuralFeatureValue(NotationPackage.eINSTANCE
			.getLocation_X())).intValue();
		int y = ((Integer) host.getStructuralFeatureValue(NotationPackage.eINSTANCE
			.getLocation_Y())).intValue();
		Point loc = new Point(x, y);
		int width = ((Integer) host.getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		int height = ((Integer) host.getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Height())).intValue();
		Dimension size = new Dimension(width, height);
		locator.setConstraint(new Rectangle(
			loc, size));
		
		// Return the locator
		return locator;
	}

	@Override
	public void deactivate() {
		super.deactivate();
		
		// restore original border item locator
		if (originalBorderItemLocator != null) {
			IFigure parentFigure = getHostFigure().getParent();
			if (parentFigure != null && parentFigure.getLayoutManager() != null) {
				parentFigure.getLayoutManager().setConstraint(getHostFigure(),
						originalBorderItemLocator);
			}
		}
	}

	@Override
	public void updateBorderItemLocator() {
		if (customBorderItemLocator != null) {
			// Calculate correct offset
			Dimension offset = DEFAULT_OFFSET.getCopy();
			offset.height += getUpperMargin();

			// apply offset
			customBorderItemLocator.setBorderItemOffset(offset, DEFAULT_OFFSET);
			
			customBorderItemLocator.relocate(getHostFigure());
		}
	}

	private int getUpperMargin() {
		if (stateEditPolicy != null) {
			// minus one: makes sure that the border item is still on the border!
			// without it, the upper border is not usable anymore.
			return stateEditPolicy.getBorderItemUpperOffset() - 1;
		}
		return 0;
	}

}
