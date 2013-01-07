//package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;
//
//import org.eclipse.emf.common.notify.Notification;
//import org.eclipse.gmf.runtime.notation.View;
//import org.storydriven.storydiagrams.diagram.custom.util.SdmUtility;
//
//import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.PortVariableName2EditPart;
//import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
//import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable;
//
//public class CustomPortVariableName2EditPart extends PortVariableName2EditPart {
//
//	public CustomPortVariableName2EditPart(View view) {
//		super(view);
//	}
//
//	@Override
//	protected void handleNotificationEvent(Notification notification) {
//		if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR
//				.equals(notification.getFeature())) {
//			SdmUtility.adaptColor(getFigure(), ((PortVariable) ((View) this
//					.getModel()).getElement()).getBindingOperator());
//		}
//		super.handleNotificationEvent(notification);
//	}
//
//	@Override
//	protected void refreshVisuals() {
//		super.refreshVisuals();
//		SdmUtility.adaptColor(getFigure(), ((PortVariable) ((View) this
//				.getModel()).getElement()).getBindingOperator());
//	}
//}
