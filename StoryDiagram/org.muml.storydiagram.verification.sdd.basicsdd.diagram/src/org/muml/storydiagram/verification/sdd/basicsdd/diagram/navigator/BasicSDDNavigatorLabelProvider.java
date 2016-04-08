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

/**
 * @generated
 */
public class BasicSDDNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem
				&& !isOwnView(((org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorGroup) {
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorGroup group = (org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorGroup) element;
			return org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem) {
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem navigatorItem = (org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem) element;
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
		switch (org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.muml.org/storydiagram/verification/sdd/basicsdd/1.0.0?StoryDecisionDiagram", org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.StoryDecisionDiagram_1000); //$NON-NLS-1$
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/storydiagram/verification/sdd/basicsdd/1.0.0?StoryPatternNode", org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.StoryPatternNode_2003); //$NON-NLS-1$
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/verification/sdd/0.4.0?LeafNode", org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.LeafNode_2004); //$NON-NLS-1$
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?CollectionVariable", org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006); //$NON-NLS-1$
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?AttributeAssignment", org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.AttributeAssignment_3007); //$NON-NLS-1$
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?Constraint", org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.Constraint_3008); //$NON-NLS-1$
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?ObjectVariable", org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.ObjectVariable_3009); //$NON-NLS-1$
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?Constraint", org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.Constraint_3010); //$NON-NLS-1$
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/storydiagram/patterns/1.0.0?StoryPattern", org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.StoryPattern_3011); //$NON-NLS-1$
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/verification/sdd/0.4.0?Edge", org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.Edge_4001); //$NON-NLS-1$
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.muml.org/storydiagram/patterns/1.0.0?LinkVariable", org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes
						.isKnownElementType(elementType)) {
			image = org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes
					.getImage(elementType);
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
		if (element instanceof org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorGroup) {
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorGroup group = (org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem) {
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem navigatorItem = (org.muml.storydiagram.verification.sdd.basicsdd.diagram.navigator.BasicSDDNavigatorItem) element;
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
		switch (org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID:
			return getStoryDecisionDiagram_1000Text(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeEditPart.VISUAL_ID:
			return getStoryPatternNode_2003Text(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2004Text(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3006Text(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3007Text(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getConstraint_3008Text(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3009Text(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
			return getConstraint_3010Text(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3011Text(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001Text(view);
		case org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getStoryDecisionDiagram_1000Text(View view) {
		org.muml.storydiagram.verification.sdd.basicsdd.StoryDecisionDiagram domainModelElement = (org.muml.storydiagram.verification.sdd.basicsdd.StoryDecisionDiagram) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStoryPatternNode_2003Text(View view) {
		IParser parser = org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDParserProvider
				.getParser(
						org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.StoryPatternNode_2003,
						view.getElement() != null ? view.getElement() : view,
						org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
								.getType(org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryPatternNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLeafNode_2004Text(View view) {
		org.muml.storydiagram.verification.sdd.LeafNode domainModelElement = (org.muml.storydiagram.verification.sdd.LeafNode) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isValue());
		} else {
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCollectionVariable_3006Text(View view) {
		IParser parser = org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDParserProvider
				.getParser(
						org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006,
						view.getElement() != null ? view.getElement() : view,
						org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
								.getType(org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeAssignment_3007Text(View view) {
		IParser parser = org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDParserProvider
				.getParser(
						org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.AttributeAssignment_3007,
						view.getElement() != null ? view.getElement() : view,
						org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
								.getType(org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConstraint_3008Text(View view) {
		IParser parser = org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDParserProvider
				.getParser(
						org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.Constraint_3008,
						view.getElement() != null ? view.getElement() : view,
						org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
								.getType(org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getObjectVariable_3009Text(View view) {
		IParser parser = org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDParserProvider
				.getParser(
						org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.ObjectVariable_3009,
						view.getElement() != null ? view.getElement() : view,
						org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
								.getType(org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConstraint_3010Text(View view) {
		IParser parser = org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDParserProvider
				.getParser(
						org.muml.storydiagram.verification.sdd.basicsdd.diagram.providers.BasicSDDElementTypes.Constraint_3010,
						view.getElement() != null ? view.getElement() : view,
						org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
								.getType(org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 3010); //$NON-NLS-1$
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
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEdge_4001Text(View view) {
		org.muml.storydiagram.verification.sdd.Edge domainModelElement = (org.muml.storydiagram.verification.sdd.Edge) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType());
		} else {
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
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
			org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
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
		return org.muml.storydiagram.verification.sdd.basicsdd.diagram.edit.parts.StoryDecisionDiagramEditPart.MODEL_ID
				.equals(org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDVisualIDRegistry
						.getModelID(view));
	}

}
