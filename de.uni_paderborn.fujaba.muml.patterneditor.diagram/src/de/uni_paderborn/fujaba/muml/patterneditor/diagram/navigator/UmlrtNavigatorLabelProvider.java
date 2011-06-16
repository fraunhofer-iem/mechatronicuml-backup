package de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator;

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

/**
 * @generated
 */
public class UmlrtNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorGroup group = (de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorItem) {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.PatternDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///de/uni_paderborn/fujaba/muml/model/pattern?CoordinationPattern", de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.UmlrtElementTypes.CoordinationPattern_1000); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/muml/model/pattern?Role", de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.UmlrtElementTypes.Role_2001); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.ConstrainableElementConstraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///de/uni_paderborn/fujaba/muml/model/core?ConstrainableElement?constraint", de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.UmlrtElementTypes.ConstrainableElementConstraint_4002); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///de/uni_paderborn/fujaba/muml/model/pattern?RoleConnector", de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.UmlrtElementTypes.RoleConnector_4001); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RectangleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/muml/model/constraint?TextualConstraint", de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.UmlrtElementTypes.TextualConstraint_2002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.UmlrtElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.UmlrtElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorGroup group = (de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorItem) {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.UmlrtNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.PatternDiagramEditPart.VISUAL_ID:
			return getCoordinationPattern_1000Text(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationPatternEditPart.VISUAL_ID:
			return getRole_2001Text(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.ConstrainableElementConstraintEditPart.VISUAL_ID:
			return getConstrainableElementConstraint_4002Text(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4001Text(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RectangleEditPart.VISUAL_ID:
			return getTextualConstraint_2002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getCoordinationPattern_1000Text(View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern domainModelElement = (de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConstrainableElementConstraint_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTextualConstraint_2002Text(View view) {
		de.uni_paderborn.fujaba.muml.model.constraint.TextualConstraint domainModelElement = (de.uni_paderborn.fujaba.muml.model.constraint.TextualConstraint) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getCorrectness());
		} else {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRoleConnector_4001Text(View view) {
		de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector domainModelElement = (de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isBidirectional());
		} else {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRole_2001Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.UmlrtParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.UmlrtElementTypes.Role_2001,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
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
		return de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.PatternDiagramEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.UmlrtVisualIDRegistry
						.getModelID(view));
	}

}
