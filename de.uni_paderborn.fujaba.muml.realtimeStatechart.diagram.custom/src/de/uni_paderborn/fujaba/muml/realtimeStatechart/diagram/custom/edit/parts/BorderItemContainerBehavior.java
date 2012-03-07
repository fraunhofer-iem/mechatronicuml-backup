package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.edit.parts;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;

import de.uni_paderborn.fujaba.muml.common.figures.CustomBorderItemLocator;

public abstract class BorderItemContainerBehavior {

	protected AbstractBorderedShapeEditPart editPart;
	
	public void setEditPart(AbstractBorderedShapeEditPart editPart) {
		this.editPart = editPart;
		updateBorderItems();
	}
	
	public void afterAddFixedChild(EditPart childEditPart) {
		if (editPart != null) {
			Figure borderItemContainer = (Figure) editPart.getBorderedFigure()
					.getBorderItemContainer();
			updateBorderItem(borderItemContainer,
					((AbstractGraphicalEditPart) childEditPart).getFigure());
		}
	}

	protected void updateBorderItem(Figure borderItemContainer, IFigure borderItem) {
		Object constraint = borderItemContainer.getLayoutManager()
				.getConstraint(borderItem);
		if (constraint instanceof BorderItemLocator) {
			BorderItemLocator locator = (BorderItemLocator) constraint;
			CustomBorderItemLocator customLocator;
			if (locator instanceof CustomBorderItemLocator) {
				customLocator = (CustomBorderItemLocator) locator;
			} else {
				customLocator = new CustomBorderItemLocator(
						editPart.getMainFigure(),
						locator.getPreferredSideOfParent());
			}
			customLocator.setBorderItemOffset(getTopLeftOffset(), getBottomRightOffset());

			// Always call setConstraint(), to update visuals (even if
			// locator==customLocator).
			borderItemContainer.setConstraint((IFigure) borderItem,
					customLocator);
		}
	}
	
	protected void updateBorderItems() {
		if (editPart != null) {
			Figure borderItemContainer = (Figure) editPart.getBorderedFigure()
					.getBorderItemContainer();

			for (Object borderItem : borderItemContainer.getChildren()) {
				updateBorderItem(borderItemContainer, (IFigure) borderItem);
			}
		}
	}
	
	protected abstract Dimension getTopLeftOffset();
	
	protected abstract Dimension getBottomRightOffset();

}
