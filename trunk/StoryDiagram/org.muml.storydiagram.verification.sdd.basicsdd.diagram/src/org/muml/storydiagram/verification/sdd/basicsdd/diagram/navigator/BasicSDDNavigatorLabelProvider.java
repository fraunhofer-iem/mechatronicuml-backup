package org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator;

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
import org.muml.storydiagram.patterns.LinkVariable;
import org.muml.storydiagram.patterns.StoryPattern;
import org.muml.storydiagram.verification.sdd.Edge;
import org.muml.storydiagram.verification.sdd.LeafNode;
import org.muml.storydiagram.verification.sdd.basicsdd.StoryDecisionDiagram;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.AttributeAssignmentEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.Constraint2EditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ConstraintEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LeafNodeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryDecisionDiagramEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeNameEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.WrappingLabel3EditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes;
import org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDParserProvider;

/**
 * @generated
 */
public class BasicSDDNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		BasicSDDDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		BasicSDDDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof BasicSDDNavigatorItem && !isOwnView(((BasicSDDNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof BasicSDDNavigatorGroup) {
			BasicSDDNavigatorGroup group = (BasicSDDNavigatorGroup) element;
			return BasicSDDDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof BasicSDDNavigatorItem) {
			BasicSDDNavigatorItem navigatorItem = (BasicSDDNavigatorItem) element;
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
		switch (BasicSDDVisualIDRegistry.getVisualID(view)) {
		case StoryDecisionDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.muml.org/storydiagram/verification/sdd/basicsdd/1.0.0?StoryDecisionDiagram", //$NON-NLS-1$
					BasicSDDElementTypes.StoryDecisionDiagram_1000);
		case StoryPatternNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/storydiagram/verification/sdd/basicsdd/1.0.0?StoryPatternNode", //$NON-NLS-1$
					BasicSDDElementTypes.StoryPatternNode_2003);
		case LeafNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/storydiagram/verification/sdd/1.0.0?LeafNode", //$NON-NLS-1$
					BasicSDDElementTypes.LeafNode_2004);
		case CollectionVariableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?CollectionVariable", //$NON-NLS-1$
					BasicSDDElementTypes.CollectionVariable_3006);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?AttributeAssignment", //$NON-NLS-1$
					BasicSDDElementTypes.AttributeAssignment_3007);
		case ConstraintEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?Constraint", //$NON-NLS-1$
					BasicSDDElementTypes.Constraint_3008);
		case ObjectVariableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?ObjectVariable", //$NON-NLS-1$
					BasicSDDElementTypes.ObjectVariable_3009);
		case Constraint2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?Constraint", //$NON-NLS-1$
					BasicSDDElementTypes.Constraint_3010);
		case StoryPatternEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?StoryPattern", //$NON-NLS-1$
					BasicSDDElementTypes.StoryPattern_3011);
		case EdgeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/storydiagram/verification/sdd/1.0.0?Edge", //$NON-NLS-1$
					BasicSDDElementTypes.Edge_4001);
		case LinkVariableEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/storydiagram/patterns/1.0.0?LinkVariable", //$NON-NLS-1$
					BasicSDDElementTypes.LinkVariable_4003);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = BasicSDDDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && BasicSDDElementTypes.isKnownElementType(elementType)) {
			image = BasicSDDElementTypes.getImage(elementType);
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
		if (element instanceof BasicSDDNavigatorGroup) {
			BasicSDDNavigatorGroup group = (BasicSDDNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof BasicSDDNavigatorItem) {
			BasicSDDNavigatorItem navigatorItem = (BasicSDDNavigatorItem) element;
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
		switch (BasicSDDVisualIDRegistry.getVisualID(view)) {
		case StoryDecisionDiagramEditPart.VISUAL_ID:
			return getStoryDecisionDiagram_1000Text(view);
		case StoryPatternNodeEditPart.VISUAL_ID:
			return getStoryPatternNode_2003Text(view);
		case LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2004Text(view);
		case CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3006Text(view);
		case AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3007Text(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_3008Text(view);
		case ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3009Text(view);
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_3010Text(view);
		case StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3011Text(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001Text(view);
		case LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getStoryDecisionDiagram_1000Text(View view) {
		StoryDecisionDiagram domainModelElement = (StoryDecisionDiagram) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			BasicSDDDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStoryPatternNode_2003Text(View view) {
		IParser parser = BasicSDDParserProvider.getParser(BasicSDDElementTypes.StoryPatternNode_2003,
				view.getElement() != null ? view.getElement() : view,
				BasicSDDVisualIDRegistry.getType(StoryPatternNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BasicSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLeafNode_2004Text(View view) {
		LeafNode domainModelElement = (LeafNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isValue());
		} else {
			BasicSDDDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCollectionVariable_3006Text(View view) {
		IParser parser = BasicSDDParserProvider.getParser(BasicSDDElementTypes.CollectionVariable_3006,
				view.getElement() != null ? view.getElement() : view,
				BasicSDDVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BasicSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeAssignment_3007Text(View view) {
		IParser parser = BasicSDDParserProvider.getParser(BasicSDDElementTypes.AttributeAssignment_3007,
				view.getElement() != null ? view.getElement() : view,
				BasicSDDVisualIDRegistry.getType(AttributeAssignmentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BasicSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConstraint_3008Text(View view) {
		IParser parser = BasicSDDParserProvider.getParser(BasicSDDElementTypes.Constraint_3008,
				view.getElement() != null ? view.getElement() : view,
				BasicSDDVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BasicSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getObjectVariable_3009Text(View view) {
		IParser parser = BasicSDDParserProvider.getParser(BasicSDDElementTypes.ObjectVariable_3009,
				view.getElement() != null ? view.getElement() : view,
				BasicSDDVisualIDRegistry.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BasicSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConstraint_3010Text(View view) {
		IParser parser = BasicSDDParserProvider.getParser(BasicSDDElementTypes.Constraint_3010,
				view.getElement() != null ? view.getElement() : view,
				BasicSDDVisualIDRegistry.getType(Constraint2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BasicSDDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStoryPattern_3011Text(View view) {
		StoryPattern domainModelElement = (StoryPattern) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			BasicSDDDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEdge_4001Text(View view) {
		Edge domainModelElement = (Edge) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType());
		} else {
			BasicSDDDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLinkVariable_4003Text(View view) {
		LinkVariable domainModelElement = (LinkVariable) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			BasicSDDDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4003); //$NON-NLS-1$
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
		return StoryDecisionDiagramEditPart.MODEL_ID.equals(BasicSDDVisualIDRegistry.getModelID(view));
	}

}
