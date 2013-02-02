package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ComponentStoryRuleEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.edit.parts.ActivityEditPart.ActivityFigure;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule;

public class CustomComponentStoryRuleEditPart extends
		ComponentStoryRuleEditPart {

	public CustomComponentStoryRuleEditPart(View view) {
		super(view);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		updateActivityNameLabel();
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
//		if (ReconfigurationPackage.Literals.RECONFIGURATION_RULE__RECONFIGURED_COMPONENT.equals(notification.getFeature())) {
//			updateComponentVariableTypes();
//		}
		updateActivityNameLabel();
	}

	private void updateActivityNameLabel() {
		if (!getChildren().isEmpty()) {

			ActivityEditPart activityEditPart = (ActivityEditPart) getChildren()
					.get(0);
			WrappingLabel activityNameLabel = ((ActivityFigure) activityEditPart
					.getPrimaryShape()).getFigureActivityName();
			
			ComponentStoryRule componentStoryRule = (ComponentStoryRule) ((View) getModel()).getElement();
			
			activityNameLabel.setText(CsdmUtility.getSignature(componentStoryRule));
		}

	}
	
//	private void updateComponentVariableTypes(){
//		ComponentStoryRule componentStoryRule = (ComponentStoryRule) getNotationView().getElement();
//		ReconfigurableStructuredComponent reconfigurableComponent = (ReconfigurableStructuredComponent) componentStoryRule.getReconfiguredComponent();
//		if (reconfigurableComponent instanceof Component){
//			Component component = (Component) reconfigurableComponent;
//			Activity activity = (Activity) componentStoryRule.getActivity();
//			if (activity != null){
//				EList<ActivityNode> componentStoryNodes = activity.getOwnedActivityNodes();
//				if (!componentStoryNodes.isEmpty()){
//					for (ActivityNode node : componentStoryNodes){
//						if (node instanceof ComponentStoryNode){
//							ComponentStoryNode componentStoryNode = (ComponentStoryNode) node;
//							ComponentStoryPattern componentStoryPattern = componentStoryNode.getComponentStoryPattern();
//							if (componentStoryPattern != null){
//								ComponentVariable componentVariable = componentStoryPattern.getThisVariable();
//								if (componentVariable != null){
//									componentVariable.setType(component);
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//	}
}
