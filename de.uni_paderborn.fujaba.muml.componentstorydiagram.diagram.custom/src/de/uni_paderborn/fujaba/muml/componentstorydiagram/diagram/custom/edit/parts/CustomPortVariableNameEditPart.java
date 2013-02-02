package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;
//package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;
//
//import org.eclipse.emf.common.notify.Notification;
//import org.eclipse.gmf.runtime.notation.View;
//import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.util.CsdmUtility;
//
//import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.PortVariableNameEditPart;
//import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
//import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PortVariable;
//
//public class CustomPortVariableNameEditPart extends PortVariableNameEditPart {
//
//	public CustomPortVariableNameEditPart(View view) {
//		super(view);
//	}
//
//	@Override
//	protected void handleNotificationEvent(Notification notification) {
//		if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR
//				.equals(notification.getFeature())) {
//			CsdmUtility.adaptColor(getFigure(), ((PortVariable) ((View) this
//					.getModel()).getElement()).getBindingOperator());
//		}
//		super.handleNotificationEvent(notification);
//	}
//
//	@Override
//	protected void refreshVisuals() {
//		super.refreshVisuals();
//		CsdmUtility.adaptColor(getFigure(), ((PortVariable) ((View) this
//				.getModel()).getElement()).getBindingOperator());
//	}
//
//}
