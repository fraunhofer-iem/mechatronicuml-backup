package patterneditor.diagram.navigator;

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

import patterneditor.diagram.edit.parts.ConstrainableElementConstraint2EditPart;
import patterneditor.diagram.edit.parts.ConstrainableElementConstraintEditPart;
import patterneditor.diagram.edit.parts.CoordinationPatternEditPart;
import patterneditor.diagram.edit.parts.CoordinationPatternNameEditPart;
import patterneditor.diagram.edit.parts.PatternDiagramEditPart;
import patterneditor.diagram.edit.parts.RoleConnectorEditPart;
import patterneditor.diagram.edit.parts.RoleEditPart;
import patterneditor.diagram.edit.parts.RoleNameEditPart;
import patterneditor.diagram.edit.parts.RolePatternEditPart;
import patterneditor.diagram.edit.parts.TextualConstraintEditPart;
import patterneditor.diagram.part.PatternDiagramEditorPlugin;
import patterneditor.diagram.part.PatternVisualIDRegistry;
import patterneditor.diagram.providers.PatternElementTypes;
import patterneditor.diagram.providers.PatternParserProvider;

/**
 * @generated
 */
public class PatternNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		PatternDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		PatternDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PatternNavigatorItem
				&& !isOwnView(((PatternNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof PatternNavigatorGroup) {
			PatternNavigatorGroup group = (PatternNavigatorGroup) element;
			return PatternDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof PatternNavigatorItem) {
			PatternNavigatorItem navigatorItem = (PatternNavigatorItem) element;
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
		switch (PatternVisualIDRegistry.getVisualID(view)) {
		case ConstrainableElementConstraint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///de/uni_paderborn/fujaba/umlrt/emf/model/core?ConstrainableElement?constraint", PatternElementTypes.ConstrainableElementConstraint_4104); //$NON-NLS-1$
		case RolePatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///de/uni_paderborn/fujaba/umlrt/emf/model/pattern?Role?pattern", PatternElementTypes.RolePattern_4102); //$NON-NLS-1$
		case CoordinationPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/umlrt/emf/model/pattern?CoordinationPattern", PatternElementTypes.CoordinationPattern_2101); //$NON-NLS-1$
		case PatternDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://patterneditor?PatternDiagram", PatternElementTypes.PatternDiagram_1001); //$NON-NLS-1$
		case ConstrainableElementConstraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///de/uni_paderborn/fujaba/umlrt/emf/model/core?ConstrainableElement?constraint", PatternElementTypes.ConstrainableElementConstraint_4103); //$NON-NLS-1$
		case RoleConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///de/uni_paderborn/fujaba/umlrt/emf/model/pattern?RoleConnector", PatternElementTypes.RoleConnector_4101); //$NON-NLS-1$
		case RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/umlrt/emf/model/pattern?Role", PatternElementTypes.Role_2102); //$NON-NLS-1$
		case TextualConstraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///de/uni_paderborn/fujaba/umlrt/emf/model/constraint?TextualConstraint", PatternElementTypes.TextualConstraint_2103); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PatternDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& PatternElementTypes.isKnownElementType(elementType)) {
			image = PatternElementTypes.getImage(elementType);
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
		if (element instanceof PatternNavigatorGroup) {
			PatternNavigatorGroup group = (PatternNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PatternNavigatorItem) {
			PatternNavigatorItem navigatorItem = (PatternNavigatorItem) element;
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
		switch (PatternVisualIDRegistry.getVisualID(view)) {
		case ConstrainableElementConstraint2EditPart.VISUAL_ID:
			return getConstrainableElementConstraint_4104Text(view);
		case RolePatternEditPart.VISUAL_ID:
			return getRolePattern_4102Text(view);
		case CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2101Text(view);
		case PatternDiagramEditPart.VISUAL_ID:
			return getPatternDiagram_1001Text(view);
		case ConstrainableElementConstraintEditPart.VISUAL_ID:
			return getConstrainableElementConstraint_4103Text(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4101Text(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2102Text(view);
		case TextualConstraintEditPart.VISUAL_ID:
			return getTextualConstraint_2103Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getConstrainableElementConstraint_4104Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRolePattern_4102Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCoordinationPattern_2101Text(View view) {
		IParser parser = PatternParserProvider.getParser(
				PatternElementTypes.CoordinationPattern_2101,
				view.getElement() != null ? view.getElement() : view,
				PatternVisualIDRegistry
						.getType(CoordinationPatternNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PatternDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5101); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPatternDiagram_1001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConstrainableElementConstraint_4103Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRoleConnector_4101Text(View view) {
		de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector domainModelElement = (de.uni_paderborn.fujaba.umlrt.model.pattern.RoleConnector) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isBidirectional());
		} else {
			PatternDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4101); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRole_2102Text(View view) {
		IParser parser = PatternParserProvider.getParser(
				PatternElementTypes.Role_2102,
				view.getElement() != null ? view.getElement() : view,
				PatternVisualIDRegistry.getType(RoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PatternDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5102); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTextualConstraint_2103Text(View view) {
		de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint domainModelElement = (de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getCorrectness());
		} else {
			PatternDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2103); //$NON-NLS-1$
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
		return PatternDiagramEditPart.MODEL_ID.equals(PatternVisualIDRegistry
				.getModelID(view));
	}

}
