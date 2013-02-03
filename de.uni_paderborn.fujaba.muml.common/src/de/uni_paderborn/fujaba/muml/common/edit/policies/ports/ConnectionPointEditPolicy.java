package de.uni_paderborn.fujaba.muml.common.edit.policies.ports;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;

import de.uni_paderborn.fujaba.muml.common.edit.policies.EditPolicyRoles;
import de.uni_paderborn.fujaba.muml.common.edit.policies.statechart.StateEditPolicy;
import de.uni_paderborn.fujaba.muml.common.figures.CustomBorderItemLocator;

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
		return new CustomBorderItemLocator(original.getParentFigure(),
				original.getPreferredSideOfParent());
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
