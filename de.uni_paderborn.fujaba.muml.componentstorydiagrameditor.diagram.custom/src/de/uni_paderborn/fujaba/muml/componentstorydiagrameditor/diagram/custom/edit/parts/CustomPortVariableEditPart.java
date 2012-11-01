package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.RGB;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableEditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable;


public class CustomPortVariableEditPart extends
		PortVariableEditPart {
	
	private static final RGB RGB_CHECK = new RGB(0, 0, 0);
	private static final RGB RGB_CREATE = new RGB(0, 192, 0);
	private static final RGB RGB_DESTROY = new RGB(192, 0, 0);

	public CustomPortVariableEditPart(View view) {
		super(view);
	}

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
