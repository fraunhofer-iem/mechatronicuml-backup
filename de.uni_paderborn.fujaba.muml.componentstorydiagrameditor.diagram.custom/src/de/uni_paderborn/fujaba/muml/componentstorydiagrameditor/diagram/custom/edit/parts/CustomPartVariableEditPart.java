package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.LineType;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.LineAttributes;
import org.eclipse.swt.graphics.RGB;
import org.storydriven.storydiagrams.patterns.BindingOperator;
import org.storydriven.storydiagrams.patterns.BindingSemantics;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PartVariableEditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable;

public class CustomPartVariableEditPart extends PartVariableEditPart {
	private static final RGB RGB_CHECK = new RGB(0, 0, 0);
	private static final RGB RGB_CREATE = new RGB(0, 192, 0);
	private static final RGB RGB_DESTROY = new RGB(192, 0, 0);

	public CustomPartVariableEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR
				.equals(notification.getFeature())) {
			adaptViewColor((View) getModel());
		} else if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS
				.equals(notification.getFeature())) {
			updateOptional();
			updateNegative();
		}
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateOptional();
		updateNegative();
	}

	private void updateOptional() {
		PartVariable partVariable = (PartVariable) ((View) getModel())
				.getElement();
		BindingSemantics semantics = partVariable.getBindingSemantics();

		LineAttributes lineAttributes = ((PartVariableFigure) primaryShape)
				.getLineAttributes();

		if (semantics == BindingSemantics.OPTIONAL) {
			lineAttributes.style = SWT.LINE_DASH;
		} else {
			lineAttributes.style = SWT.LINE_SOLID;
		}
		((PartVariableFigure) primaryShape).setLineAttributes(lineAttributes);

		// setLineType(SWT.LINE_DASH);

		//
		// Using styles:
		//
		//
		// ((View) getModel()).getStyles().add(
		// NotationFactory.eINSTANCE.createLineTypeStyle());
		//
		// org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
		// .setStructuralFeatureValue(
		// (View) getModel(),
		// org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE
		// .getLineTypeStyle_LineType(),
		// LineType.DASH_LITERAL);

	}

	private void updateNegative() {
		PartVariable partVariable = (PartVariable) ((View) getModel())
				.getElement();
		BindingSemantics semantics = partVariable.getBindingSemantics();

		boolean negative = semantics == BindingSemantics.NEGATIVE;
		((PartVariableFigure) primaryShape).getFigureNegative().setVisible(
				negative);
		((PartVariableFigure) primaryShape).getFigureNegative2().setVisible(
				negative);
	}

	private void adaptViewColor(View view) {
		org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.draw2d.ColorConstants.blue
				.getRGB();

		BindingOperator bindingOperator = ((PartVariable) ((View) getModel())
				.getElement()).getBindingOperator();

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
