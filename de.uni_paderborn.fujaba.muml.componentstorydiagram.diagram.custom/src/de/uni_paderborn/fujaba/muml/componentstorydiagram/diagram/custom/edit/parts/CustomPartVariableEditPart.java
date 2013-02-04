package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.LineAttributes;
import org.storydriven.storydiagrams.patterns.BindingSemantics;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PartVariable;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PartVariableEditPart;

public class CustomPartVariableEditPart extends PartVariableEditPart {

	public CustomPartVariableEditPart(View view) {
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
//			updateOptional();
//			updateNegative();
		}
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
//		updateOptional();
//		updateNegative();
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
//		PartVariable partVariable = (PartVariable) ((View) getModel())
//				.getElement();
//		BindingSemantics semantics = partVariable.getBindingSemantics();
//
//		boolean negative = semantics == BindingSemantics.NEGATIVE;
//		((PartVariableFigure) primaryShape).getFigurePartNegative1().setVisible(
//				negative);
//		((PartVariableFigure) primaryShape).getFigurePartNegative2().setVisible(
//				negative);
	}


}
