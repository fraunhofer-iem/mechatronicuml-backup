package org.muml.storydiagram.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.FlowFinalNode;
import org.muml.storydiagram.activities.JunctionNode;
import org.muml.storydiagram.diagram.edit.parts.ActivityCallNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityCallNodeNameEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityEdgeEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityEdgeGuardLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityFinalNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.ActivityFinalNodeLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.AttributeAssignmentEditPart;
import org.muml.storydiagram.diagram.edit.parts.CollectionVariableEditPart;
import org.muml.storydiagram.diagram.edit.parts.CollectionVariableOperatorLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.Constraint2EditPart;
import org.muml.storydiagram.diagram.edit.parts.ConstraintEditPart;
import org.muml.storydiagram.diagram.edit.parts.FlowFinalNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.InclusionLinkEditPart;
import org.muml.storydiagram.diagram.edit.parts.InclusionLinkLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.InitialNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.InitialNodeLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.JunctionNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.LinkVariableEditPart;
import org.muml.storydiagram.diagram.edit.parts.LinkVariableSourceEndLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingPatternEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingStoryNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.MatchingStoryNodeNameEditPart;
import org.muml.storydiagram.diagram.edit.parts.MaybeLinkEditPart;
import org.muml.storydiagram.diagram.edit.parts.MaybeLinkLabelEditPart;
import org.muml.storydiagram.diagram.edit.parts.ModifyingStoryNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.ModifyingStoryNodeNameEditPart;
import org.muml.storydiagram.diagram.edit.parts.ObjectVariableEditPart;
import org.muml.storydiagram.diagram.edit.parts.ObjectVariableOperatorEditPart;
import org.muml.storydiagram.diagram.edit.parts.StatementNodeEditPart;
import org.muml.storydiagram.diagram.edit.parts.StatementNodeNameEditPart;
import org.muml.storydiagram.diagram.edit.parts.StoryPatternEditPart;
import org.muml.storydiagram.diagram.part.StorydiagramsDiagramEditorPlugin;
import org.muml.storydiagram.diagram.part.StorydiagramsVisualIDRegistry;
import org.muml.storydiagram.diagram.providers.StorydiagramsElementTypes;
import org.muml.storydiagram.diagram.providers.StorydiagramsParserProvider;
import org.muml.storydiagram.patterns.MatchingPattern;
import org.muml.storydiagram.patterns.StoryPattern;

/**
 * @generated
 */
public class StorydiagramsNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		StorydiagramsDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		StorydiagramsDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof StorydiagramsNavigatorItem
				&& !isOwnView(((StorydiagramsNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof StorydiagramsNavigatorGroup) {
			StorydiagramsNavigatorGroup group = (StorydiagramsNavigatorGroup) element;
			return StorydiagramsDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof StorydiagramsNavigatorItem) {
			StorydiagramsNavigatorItem navigatorItem = (StorydiagramsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (StorydiagramsVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.muml.org/storydiagram/activities/1.0.0?Activity", //$NON-NLS-1$
					StorydiagramsElementTypes.Activity_1000);
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/storydiagram/activities/1.0.0?ActivityCallNode", //$NON-NLS-1$
					StorydiagramsElementTypes.ActivityCallNode_2001);
		case StatementNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/storydiagram/activities/1.0.0?StatementNode", //$NON-NLS-1$
					StorydiagramsElementTypes.StatementNode_2002);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/storydiagram/activities/1.0.0?ModifyingStoryNode", //$NON-NLS-1$
					StorydiagramsElementTypes.ModifyingStoryNode_2003);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/storydiagram/activities/1.0.0?MatchingStoryNode", //$NON-NLS-1$
					StorydiagramsElementTypes.MatchingStoryNode_2004);
		case InitialNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/storydiagram/activities/1.0.0?InitialNode", //$NON-NLS-1$
					StorydiagramsElementTypes.InitialNode_2005);
		case JunctionNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/storydiagram/activities/1.0.0?JunctionNode", //$NON-NLS-1$
					StorydiagramsElementTypes.JunctionNode_2006);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/storydiagram/activities/1.0.0?FlowFinalNode", //$NON-NLS-1$
					StorydiagramsElementTypes.FlowFinalNode_2007);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/storydiagram/activities/1.0.0?ActivityFinalNode", //$NON-NLS-1$
					StorydiagramsElementTypes.ActivityFinalNode_2008);
		case StoryPatternEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?StoryPattern", //$NON-NLS-1$
					StorydiagramsElementTypes.StoryPattern_3001);
		case CollectionVariableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?CollectionVariable", //$NON-NLS-1$
					StorydiagramsElementTypes.CollectionVariable_3002);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?AttributeAssignment", //$NON-NLS-1$
					StorydiagramsElementTypes.AttributeAssignment_3003);
		case ConstraintEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?Constraint", //$NON-NLS-1$
					StorydiagramsElementTypes.Constraint_3004);
		case ObjectVariableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?ObjectVariable", //$NON-NLS-1$
					StorydiagramsElementTypes.ObjectVariable_3005);
		case Constraint2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?Constraint", //$NON-NLS-1$
					StorydiagramsElementTypes.Constraint_3006);
		case MatchingPatternEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?MatchingPattern", //$NON-NLS-1$
					StorydiagramsElementTypes.MatchingPattern_3007);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/storydiagram/activities/1.0.0?ActivityEdge", //$NON-NLS-1$
					StorydiagramsElementTypes.ActivityEdge_4001);
		case LinkVariableEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/storydiagram/patterns/1.0.0?LinkVariable", //$NON-NLS-1$
					StorydiagramsElementTypes.LinkVariable_4002);
		case InclusionLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/storydiagram/patterns/1.0.0?InclusionLink", //$NON-NLS-1$
					StorydiagramsElementTypes.InclusionLink_4003);
		case MaybeLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/storydiagram/patterns/1.0.0?MaybeLink", //$NON-NLS-1$
					StorydiagramsElementTypes.MaybeLink_4004);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = StorydiagramsDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && StorydiagramsElementTypes.isKnownElementType(elementType)) {
			image = StorydiagramsElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof StorydiagramsNavigatorGroup) {
			StorydiagramsNavigatorGroup group = (StorydiagramsNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof StorydiagramsNavigatorItem) {
			StorydiagramsNavigatorItem navigatorItem = (StorydiagramsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (StorydiagramsVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_1000Text(view);
		case ActivityCallNodeEditPart.VISUAL_ID:
			return getActivityCallNode_2001Text(view);
		case StatementNodeEditPart.VISUAL_ID:
			return getStatementNode_2002Text(view);
		case ModifyingStoryNodeEditPart.VISUAL_ID:
			return getModifyingStoryNode_2003Text(view);
		case MatchingStoryNodeEditPart.VISUAL_ID:
			return getMatchingStoryNode_2004Text(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2005Text(view);
		case JunctionNodeEditPart.VISUAL_ID:
			return getJunctionNode_2006Text(view);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getFlowFinalNode_2007Text(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_2008Text(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3001Text(view);
		case CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3002Text(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3003Text(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3004Text(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3005Text(view);
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_3006Text(view);
		case MatchingPatternEditPart.VISUAL_ID:
			return getMatchingPattern_3007Text(view);
		case ActivityEdgeEditPart.VISUAL_ID:
			return getActivityEdge_4001Text(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4002Text(view);
		case InclusionLinkEditPart.VISUAL_ID:
			return getInclusionLink_4003Text(view);
		case MaybeLinkEditPart.VISUAL_ID:
			return getMaybeLink_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getActivityFinalNode_2008Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ActivityFinalNode_2008,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ActivityFinalNodeLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModifyingStoryNode_2003Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ModifyingStoryNode_2003,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ModifyingStoryNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConstraint_3004Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.Constraint_3004,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMatchingStoryNode_2004Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.MatchingStoryNode_2004,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(MatchingStoryNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivityCallNode_2001Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ActivityCallNode_2001,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ActivityCallNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCollectionVariable_3002Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.CollectionVariable_3002,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(CollectionVariableOperatorLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivityEdge_4001Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ActivityEdge_4001,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ActivityEdgeGuardLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLinkVariable_4002Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.LinkVariable_4002,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(LinkVariableSourceEndLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeAssignment_3003Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.AttributeAssignment_3003,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(AttributeAssignmentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStoryPattern_3001Text(View view) {
		StoryPattern domainModelElement = (StoryPattern) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMatchingPattern_3007Text(View view) {
		MatchingPattern domainModelElement = (MatchingPattern) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJunctionNode_2006Text(View view) {
		JunctionNode domainModelElement = (JunctionNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMaybeLink_4004Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.MaybeLink_4004,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(MaybeLinkLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConstraint_3006Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.Constraint_3006,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(Constraint2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivity_1000Text(View view) {
		Activity domainModelElement = (Activity) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getObjectVariable_3005Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.ObjectVariable_3005,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(ObjectVariableOperatorEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInclusionLink_4003Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.InclusionLink_4003,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(InclusionLinkLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStatementNode_2002Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.StatementNode_2002,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(StatementNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlowFinalNode_2007Text(View view) {
		FlowFinalNode domainModelElement = (FlowFinalNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInitialNode_2005Text(View view) {
		IParser parser = StorydiagramsParserProvider.getParser(StorydiagramsElementTypes.InitialNode_2005,
				view.getElement() != null ? view.getElement() : view,
				StorydiagramsVisualIDRegistry.getType(InitialNodeLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			StorydiagramsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ActivityEditPart.MODEL_ID.equals(StorydiagramsVisualIDRegistry.getModelID(view));
	}

}
