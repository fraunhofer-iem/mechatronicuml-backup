package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.LineAttributes;
import org.storydriven.storydiagrams.patterns.BindingSemantics;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariable2EditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable;

public class CustomPortVariable2EditPart extends PortVariable2EditPart {

	private static final Dimension OFFSET = new Dimension(12, 12);
	
	public CustomPortVariable2EditPart(View view) {
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
		updateNegative();
		updateOptional();
	}
	
	@Override
	public void activate() {
		IBorderItemLocator locator = getBorderItemLocator();
		if (locator instanceof BorderItemLocator) {
			((BorderItemLocator) locator).setBorderItemOffset(OFFSET);
		}
		super.activate();
	}
	
	private void updateNegative() {
		PortVariable portVariable = (PortVariable) ((View) getModel())
				.getElement();
		BindingSemantics semantics = portVariable.getBindingSemantics();

		boolean negative = semantics == BindingSemantics.NEGATIVE;
		((PortVariableFigure) primaryShape).getFigurePortNegative1().setVisible(
				negative);
		((PortVariableFigure) primaryShape).getFigurePortNegative2().setVisible(
				negative);
	
	}

	private void updateOptional() {
		PortVariable portVariable = (PortVariable) ((View) getModel())
				.getElement();
		BindingSemantics semantics = portVariable.getBindingSemantics();

		LineAttributes lineAttributes = ((PortVariableFigure) primaryShape)
				.getLineAttributes();

		if (semantics == BindingSemantics.OPTIONAL) {
			lineAttributes.style = SWT.LINE_DASH;
		} else {
			lineAttributes.style = SWT.LINE_SOLID;
		}
		((PortVariableFigure) primaryShape).setLineAttributes(lineAttributes);

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
}
