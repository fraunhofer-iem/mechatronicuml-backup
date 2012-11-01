package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.LineType;
import org.eclipse.gmf.runtime.notation.LineTypeStyle;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.storydriven.storydiagrams.patterns.BindingSemantics;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PartVariableEditPart;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable;

public class CustomPartVariableEditPart extends PartVariableEditPart {

	public CustomPartVariableEditPart(View view) {
		super(view);
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		updateOptional();
		updateNegative();

	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateNegative();
	}
	
	@SuppressWarnings("unchecked")
	private void updateOptional() {
		// LineAttributes lineAttributes =
		// ((PartVariableFigure)primaryShape).getLineAttributes();
		// if (semantics == BindingSemantics.OPTIONAL) {
		// lineAttributes.style = SWT.LINE_DASH;
		// } else {
		// lineAttributes.style = SWT.LINE_SOLID;
		// }
		// ((PartVariableFigure)primaryShape).setLineAttributes(lineAttributes);
		
//		((View)getModel()).getStyles().add(NotationFactory.eINSTANCE.createLineTypeStyle());
//		
//		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
//				.setStructuralFeatureValue(
//						(View) getModel(),
//						org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineTypeStyle_LineType(), LineType.DASH);
	}
	
	private void updateNegative(){
		PartVariable partVariable = (PartVariable) ((View) getModel())
				.getElement();
		BindingSemantics semantics = partVariable.getBindingSemantics();

		boolean negative = semantics == BindingSemantics.NEGATIVE;
		((PartVariableFigure) primaryShape).getFigureNegative().setVisible(
				negative);
	}

}
