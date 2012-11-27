package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.LineAttributes;
import org.storydriven.storydiagrams.patterns.BindingSemantics;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableEditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;

public class CustomComponentVariableEditPart extends ComponentVariableEditPart {

	public CustomComponentVariableEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR
				.equals(notification.getFeature())) {
			CsdmUtility.adaptColor(this);
		} else if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS
				.equals(notification.getFeature())) {
			updateOptional();
			updateNegative();
		}
	}

	
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		((ComponentVariableFigure) primaryShape).getFigureComponentVariableNameFigure().setTextUnderline(true);
		updateNegative();
		updateOptional();
	}
	
	private void updateNegative() {
		ComponentVariable componentVariable = (ComponentVariable) ((View) getModel())
				.getElement();
		BindingSemantics semantics = componentVariable.getBindingSemantics();

		boolean negative = semantics == BindingSemantics.NEGATIVE;
		((ComponentVariableFigure) primaryShape).getFigureComponentNegative1().setVisible(
				negative);
		((ComponentVariableFigure) primaryShape).getFigureComponentNegative2().setVisible(
				negative);
	
	}
	
	private void updateOptional() {
		ComponentVariable componentVariable = (ComponentVariable) ((View) getModel())
				.getElement();
		BindingSemantics semantics = componentVariable.getBindingSemantics();

		LineAttributes lineAttributes = ((ComponentVariableFigure) primaryShape)
				.getLineAttributes();

		if (semantics == BindingSemantics.OPTIONAL) {
			lineAttributes.style = SWT.LINE_DASH;
		} else {
			lineAttributes.style = SWT.LINE_SOLID;
		}
		((ComponentVariableFigure) primaryShape).setLineAttributes(lineAttributes);

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
