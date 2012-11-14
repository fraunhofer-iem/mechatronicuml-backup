package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.RGB;
import org.storydriven.storydiagrams.patterns.BindingOperator;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.DelegationVariableEditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.DelegationVariable;

public class CustomDelegationVariableEditPart extends
		DelegationVariableEditPart {

	private static final RGB RGB_CHECK = new RGB(0, 0, 0);
	private static final RGB RGB_CREATE = new RGB(0, 192, 0);
	private static final RGB RGB_DESTROY = new RGB(192, 0, 0);
	
	public CustomDelegationVariableEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		adaptViewColor((View)getModel());
	}
	
	private void adaptViewColor(View view) {
		org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.draw2d.ColorConstants.blue
				.getRGB();

		BindingOperator bindingOperator = ((DelegationVariable) ((View) getModel()).getElement())
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
						view,
						org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE
								.getLineStyle_LineColor(),
						org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities
								.RGBToInteger(lineRGB));

	}
}
