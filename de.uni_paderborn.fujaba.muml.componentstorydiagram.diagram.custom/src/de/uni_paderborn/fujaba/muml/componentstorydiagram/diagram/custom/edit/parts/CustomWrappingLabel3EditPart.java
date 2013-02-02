package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;
//package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;
//
//import org.eclipse.emf.common.notify.Notification;
//import org.eclipse.gmf.runtime.notation.View;
//import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.util.CsdmUtility;
//
//import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.util.CsdmUtility;
//import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.WrappingLabel3EditPart;
//import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.PortVariable;
//
//public class CustomWrappingLabel3EditPart extends WrappingLabel3EditPart {
//
//	public CustomWrappingLabel3EditPart(View view) {
//		super(view);
//	}
//	
//	@Override
//	protected void handleNotificationEvent(Notification event) {
//		updateText();
//		super.handleNotificationEvent(event);
//	}
//	
//	@Override
//	protected void refreshVisuals() {
//		super.refreshVisuals();
//		updateText();
//		CsdmUtility.adaptColor(getFigure(), ((PortVariable) ((View) this
//				.getModel()).getElement()).getBindingOperator());
//	}
//	
//	private void updateText(){
//		setLabelText(CsdmUtility.adaptComponentStoryPatternVariableText(this));
//	}
//
//}
