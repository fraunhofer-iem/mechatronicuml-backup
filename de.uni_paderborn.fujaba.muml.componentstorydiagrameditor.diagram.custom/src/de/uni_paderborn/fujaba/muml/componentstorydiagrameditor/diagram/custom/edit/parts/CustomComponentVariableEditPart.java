package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.RGB;
import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
import org.storydriven.storydiagrams.patterns.BindingOperator;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableEditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable;

public class CustomComponentVariableEditPart extends ComponentVariableEditPart {
	private static final RGB RGB_CHECK = new RGB(0, 0, 0);
	private static final RGB RGB_CREATE = new RGB(0, 192, 0);
	private static final RGB RGB_DESTROY = new RGB(192, 0, 0);

	public CustomComponentVariableEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		adaptViewColor((View) getModel());
//		adaptEditPartColor(this);
		super.handleNotificationEvent(event);
	}
//
//	
//	@Override
//	protected void refreshVisuals() {
//		adaptEditPartColor(this);
//		super.refreshVisuals();
//	}

	private void adaptViewColor(View view) {
		org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.draw2d.ColorConstants.blue
				.getRGB();

		BindingOperator bindingOperator = ((ComponentVariable) ((View) getModel()).getElement())
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

//		for (Object child : view.getChildren()) {
//			adaptViewColor((View) child);
//		}

	}
	
//	
//
//	private void adaptEditPartColor(GraphicalEditPart editPart) {
//		BindingOperator bindingOperator = ((ComponentVariable) ((View) getModel())
//				.getElement()).getBindingOperator();
//		SdmUtility.adaptColor(editPart.getFigure(), bindingOperator);
//
//		for (Object child : editPart.getChildren()) {
//			if (child instanceof GraphicalEditPart) {
//				GraphicalEditPart childEp = (GraphicalEditPart) child;
//				adaptEditPartColor(childEp);
//			}
//		}
//
//	}

}
