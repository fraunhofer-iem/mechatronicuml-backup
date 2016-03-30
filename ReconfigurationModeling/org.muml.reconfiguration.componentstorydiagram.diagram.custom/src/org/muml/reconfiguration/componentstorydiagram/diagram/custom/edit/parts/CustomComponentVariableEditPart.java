package org.muml.reconfiguration.componentstorydiagram.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.muml.core.CorePackage;
import org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule;
import org.muml.reconfiguration.componentstorydiagram.diagram.custom.util.CsdmUtility;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityActivityCompartmentEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ComponentVariableEditPart;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.parts.ActivityEditPart.ActivityFigure;
import org.muml.reconfiguration.componentstorydiagram.diagram.edit.policies.ComponentVariableItemSemanticEditPolicy;
import org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern;
import org.muml.reconfiguration.componentstorypattern.ComponentVariable;
import org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.activities.ActivityNode;

public class CustomComponentVariableEditPart extends ComponentVariableEditPart {

	public CustomComponentVariableEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ComponentVariableItemSemanticEditPolicy() {
					protected Command getSemanticCommand(
							IEditCommandRequest request) {
						if (request instanceof DestroyRequest) {
							return null;
						}
						return super.getSemanticCommand(request);
					}

				});

	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_OPERATOR
				.equals(notification.getFeature())) {
//			CsdmUtility.adaptColor(this);
		} else if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS
				.equals(notification.getFeature())) {
//			updateOptional();
//			updateNegative();
		} else if (ComponentstorypatternPackage.Literals.COMPONENT_VARIABLE__TYPE.equals(notification.getFeature())){
			updateActivityNameLabel();
		} else if (CorePackage.Literals.NAMED_ELEMENT__NAME.equals(notification.getFeature())){
			updateComponentVariableName();
		}
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		((ComponentVariableFigure) primaryShape)
				.getFigureComponentVariableNameFigure().setTextUnderline(true);
		updateActivityNameLabel();
	}
	
	private void updateComponentVariableName(){
		ComponentVariable componentVariable = (ComponentVariable) ((View) getModel()).getElement();
		componentVariable.setName("this");
	}

	private void updateActivityNameLabel() {

		ComponentVariable componentVariable = (ComponentVariable) ((View) getModel()).getElement();
		ComponentStoryPattern componentStoryPattern = (ComponentStoryPattern) componentVariable.eContainer();		
		ActivityNode activityNode = (ActivityNode) componentStoryPattern.eContainer();
		Activity activity = (Activity) activityNode.eContainer();
		ComponentStoryRule componentStoryRule = (ComponentStoryRule) activity.eContainer();
		
		ActivityActivityCompartmentEditPart activityActivityCompartmentEditPart = (ActivityActivityCompartmentEditPart) getParent().getParent().getParent().getParent().getParent();	
		ActivityEditPart activityEditPart = (ActivityEditPart) activityActivityCompartmentEditPart.getParent();

		WrappingLabel activityNameLabel = ((ActivityFigure) activityEditPart
				.getPrimaryShape()).getFigureActivityName();

		activityNameLabel.setText(CsdmUtility.getSignature(componentStoryRule));
	}

}
