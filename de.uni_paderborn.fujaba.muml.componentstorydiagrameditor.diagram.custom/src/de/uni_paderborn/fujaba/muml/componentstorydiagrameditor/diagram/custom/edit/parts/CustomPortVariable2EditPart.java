package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.RGB;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariable2EditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable;

public class CustomPortVariable2EditPart extends PortVariable2EditPart {

	public CustomPortVariable2EditPart(View view) {
		super(view);
	}
	
	private static final RGB RGB_CHECK = new RGB(0, 0, 0);
	private static final RGB RGB_CREATE = new RGB(0, 192, 0);
	private static final RGB RGB_DESTROY = new RGB(192, 0, 0);
	private static final Dimension OFFSET = new Dimension(12, 12);

	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		updateFigure();
		updateNegative();
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateNegative();
	}
	
	@Override
	public void activate() {
		IBorderItemLocator locator = getBorderItemLocator();
		if (locator instanceof BorderItemLocator) {
			((BorderItemLocator) locator).setBorderItemOffset(OFFSET);
		}
		super.activate();
	}

	private void updateFigure(){
		org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.draw2d.ColorConstants.blue
				.getRGB();

		BindingOperator bindingOperator = ((PortVariable) ((View) getModel()).getElement())
				.getBindingOperator();
		
		switch (bindingOperator) {
		case CREATE:
			lineRGB = RGB_CREATE;
			break;
		case DESTROY:
			lineRGB = RGB_DESTROY;
			break;
		default:
		case CHECK_ONLY:
			lineRGB = RGB_CHECK;
			break;
			
			
		}

		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
				.setStructuralFeatureValue(
						(View) getModel(),
						org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE
								.getLineStyle_LineColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(lineRGB));

		
	}
	
	private void updateNegative() {
		PortVariable portVariable = (PortVariable) ((View) getModel())
				.getElement();
		BindingSemantics semantics = portVariable.getBindingSemantics();

		boolean negative = semantics == BindingSemantics.NEGATIVE;
		((PortVariableFigure) primaryShape).getFigureNegativePort().setVisible(
				negative);
	
	}

}
