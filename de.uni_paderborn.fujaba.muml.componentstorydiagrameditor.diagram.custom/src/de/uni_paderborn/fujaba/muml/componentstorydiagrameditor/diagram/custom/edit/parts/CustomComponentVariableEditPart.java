package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.LineAttributes;
import org.storydriven.core.CorePackage;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.patterns.BindingSemantics;

import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.util.CsdmUtility;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityActivityCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ActivityEditPart.ActivityFigure;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeComponentStoryNodeCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryNodeEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryPatternComponentStoryPatternCompartmentEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentStoryPatternEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.parts.ComponentVariableEditPart;
import de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.edit.policies.ComponentVariableItemSemanticEditPolicy;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule;

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
			CsdmUtility.adaptColor(this);
		} else if (ComponentstorypatternPackage.Literals.COMPONENT_STORY_PATTERN_VARIABLE__BINDING_SEMANTICS
				.equals(notification.getFeature())) {
			updateOptional();
			updateNegative();
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
		updateNegative();
		updateOptional();
		updateActivityNameLabel();
	}
	
	private void updateComponentVariableName(){
		ComponentVariable componentVariable = (ComponentVariable) ((View) getModel()).getElement();
		componentVariable.setName("this");
	}

	private void updateNegative() {
		ComponentVariable componentVariable = (ComponentVariable) ((View) getModel())
				.getElement();
		BindingSemantics semantics = componentVariable.getBindingSemantics();

		boolean negative = semantics == BindingSemantics.NEGATIVE;
		((ComponentVariableFigure) primaryShape).getFigureComponentNegative1()
				.setVisible(negative);
		((ComponentVariableFigure) primaryShape).getFigureComponentNegative2()
				.setVisible(negative);

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
		((ComponentVariableFigure) primaryShape)
				.setLineAttributes(lineAttributes);

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

	private void updateActivityNameLabel() {

		ComponentVariable componentVariable = (ComponentVariable) ((View) getModel()).getElement();
		ComponentStoryPattern componentStoryPattern = (ComponentStoryPattern) componentVariable.eContainer();
		ComponentStoryNode componentStoryNode = (ComponentStoryNode) componentStoryPattern.eContainer();
		Activity activity = (Activity) componentStoryNode.eContainer();
		ComponentStoryRule componentStoryRule = (ComponentStoryRule) activity.eContainer();
		
		ComponentStoryPatternComponentStoryPatternCompartmentEditPart componentStoryPatternComponentStoryPatternCompartmentEditPart = (ComponentStoryPatternComponentStoryPatternCompartmentEditPart) getParent();
		ComponentStoryPatternEditPart componentStoryPatternEditPart= (ComponentStoryPatternEditPart) componentStoryPatternComponentStoryPatternCompartmentEditPart.getParent();
		ComponentStoryNodeComponentStoryNodeCompartmentEditPart componentStoryNodeComponentStoryNodeCompartmentEditPart = (ComponentStoryNodeComponentStoryNodeCompartmentEditPart) componentStoryPatternEditPart.getParent();
		ComponentStoryNodeEditPart componentStoryNodeEditPart = (ComponentStoryNodeEditPart) componentStoryNodeComponentStoryNodeCompartmentEditPart.getParent();
		ActivityActivityCompartmentEditPart activityActivityCompartmentEditPart = (ActivityActivityCompartmentEditPart) componentStoryNodeEditPart.getParent();
		ActivityEditPart activityEditPart = (ActivityEditPart) activityActivityCompartmentEditPart.getParent();

		WrappingLabel activityNameLabel = ((ActivityFigure) activityEditPart
				.getPrimaryShape()).getFigureActivityName();

		activityNameLabel.setText(CsdmUtility.getSignature(componentStoryRule));
	}

}
