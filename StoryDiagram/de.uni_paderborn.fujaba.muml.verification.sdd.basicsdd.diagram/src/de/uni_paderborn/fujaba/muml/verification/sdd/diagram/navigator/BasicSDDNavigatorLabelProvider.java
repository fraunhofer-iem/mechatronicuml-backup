package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator;

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
import org.storydriven.storydiagrams.patterns.LinkVariable;
import org.storydriven.storydiagrams.patterns.StoryPattern;

/**
 * @generated
 */
public class BasicSDDNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorGroup group = (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorItem) {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.fujaba.de/muml/verification/sdd/basicSDD/0.4.0?StoryDecisionDiagram", de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.StoryDecisionDiagram_1000); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/verification/sdd/basicSDD/0.4.0?StoryPatternNode", de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.StoryPatternNode_2003); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/verification/sdd/0.4.0?LeafNode", de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.LeafNode_2004); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?CollectionVariable", de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?AttributeAssignment", de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.AttributeAssignment_3007); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?Constraint", de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Constraint_3008); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?ObjectVariable", de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.ObjectVariable_3009); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?Constraint", de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Constraint_3010); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.storydriven.org/storydiagrams/patterns/0.2.1?StoryPattern", de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.StoryPattern_3011); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/verification/sdd/0.4.0?Edge", de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Edge_4001); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.storydriven.org/storydiagrams/patterns/0.2.1?LinkVariable", de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorGroup group = (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorItem) {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.navigator.BasicSDDNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.VISUAL_ID:
			return getStoryDecisionDiagram_1000Text(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeEditPart.VISUAL_ID:
			return getStoryPatternNode_2003Text(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.LeafNodeEditPart.VISUAL_ID:
			return getLeafNode_2004Text(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.CollectionVariableEditPart.VISUAL_ID:
			return getCollectionVariable_3006Text(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID:
			return getAttributeAssignment_3007Text(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getConstraint_3008Text(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ObjectVariableEditPart.VISUAL_ID:
			return getObjectVariable_3009Text(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
			return getConstraint_3010Text(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternEditPart.VISUAL_ID:
			return getStoryPattern_3011Text(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.EdgeEditPart.VISUAL_ID:
			return getEdge_4001Text(view);
		case de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.LinkVariableEditPart.VISUAL_ID:
			return getLinkVariable_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getStoryDecisionDiagram_1000Text(View view) {
		de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryDecisionDiagram domainModelElement = (de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.StoryDecisionDiagram) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
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
		IParser parser = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.StoryPatternNode_2003,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryPatternNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLeafNode_2004Text(View view) {
		de.uni_paderborn.fujaba.muml.verification.sdd.LeafNode domainModelElement = (de.uni_paderborn.fujaba.muml.verification.sdd.LeafNode) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isValue());
		} else {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
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
		IParser parser = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeAssignment_3007Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.AttributeAssignment_3007,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.AttributeAssignmentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConstraint_3008Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Constraint_3008,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.ConstraintEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getObjectVariable_3009Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.ObjectVariable_3009,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConstraint_3010Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Constraint_3010,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.Constraint2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
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
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
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
		de.uni_paderborn.fujaba.muml.verification.sdd.Edge domainModelElement = (de.uni_paderborn.fujaba.muml.verification.sdd.Edge) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType());
		} else {
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
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
			de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
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
		return de.uni_paderborn.fujaba.muml.verification.sdd.diagram.edit.parts.StoryDecisionDiagramEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDVisualIDRegistry
						.getModelID(view));
	}

}
