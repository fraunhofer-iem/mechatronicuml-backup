package pattern.diagram.navigator;

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

import pattern.CoordinationPattern;
import pattern.diagram.edit.parts.CoordinationPattern2EditPart;
import pattern.diagram.edit.parts.CoordinationPatternEditPart;
import pattern.diagram.edit.parts.CoordinationPatternNameEditPart;
import pattern.diagram.edit.parts.ModelElementCategoryEditPart;
import pattern.diagram.edit.parts.RoleConnectorEditPart;
import pattern.diagram.edit.parts.RoleCoordinationProtocolEditPart;
import pattern.diagram.edit.parts.RoleEditPart;
import pattern.diagram.edit.parts.RoleNameEditPart;
import pattern.diagram.part.Pattern2DiagramEditorPlugin;
import pattern.diagram.part.Pattern2VisualIDRegistry;
import pattern.diagram.providers.Pattern2ElementTypes;
import pattern.diagram.providers.Pattern2ParserProvider;

/**
 * @generated
 */
public class Pattern2NavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		Pattern2DiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Pattern2DiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Pattern2NavigatorItem
				&& !isOwnView(((Pattern2NavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof Pattern2NavigatorGroup) {
			Pattern2NavigatorGroup group = (Pattern2NavigatorGroup) element;
			return Pattern2DiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof Pattern2NavigatorItem) {
			Pattern2NavigatorItem navigatorItem = (Pattern2NavigatorItem) element;
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
		switch (Pattern2VisualIDRegistry.getVisualID(view)) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.fujaba.de/modelinstance/0.4.0?ModelElementCategory", Pattern2ElementTypes.ModelElementCategory_1000); //$NON-NLS-1$
		case CoordinationPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/pattern/0.3.18?CoordinationPattern", Pattern2ElementTypes.CoordinationPattern_2001); //$NON-NLS-1$
		case CoordinationPattern2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/pattern/0.3.18?CoordinationPattern", Pattern2ElementTypes.CoordinationPattern_3001); //$NON-NLS-1$
		case RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/protocol/0.4.0?Role", Pattern2ElementTypes.Role_3002); //$NON-NLS-1$
		case RoleCoordinationProtocolEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/protocol/0.4.0?Role?coordinationProtocol", Pattern2ElementTypes.RoleCoordinationProtocol_4001); //$NON-NLS-1$
		case RoleConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/protocol/0.4.0?RoleConnector", Pattern2ElementTypes.RoleConnector_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Pattern2DiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& Pattern2ElementTypes.isKnownElementType(elementType)) {
			image = Pattern2ElementTypes.getImage(elementType);
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
		if (element instanceof Pattern2NavigatorGroup) {
			Pattern2NavigatorGroup group = (Pattern2NavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Pattern2NavigatorItem) {
			Pattern2NavigatorItem navigatorItem = (Pattern2NavigatorItem) element;
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
		switch (Pattern2VisualIDRegistry.getVisualID(view)) {
		case ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000Text(view);
		case CoordinationPatternEditPart.VISUAL_ID:
			return getCoordinationPattern_2001Text(view);
		case CoordinationPattern2EditPart.VISUAL_ID:
			return getCoordinationPattern_3001Text(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3002Text(view);
		case RoleCoordinationProtocolEditPart.VISUAL_ID:
			return getRoleCoordinationProtocol_4001Text(view);
		case RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getModelElementCategory_1000Text(View view) {
		de.uni_paderborn.fujaba.modelinstance.ModelElementCategory domainModelElement = (de.uni_paderborn.fujaba.modelinstance.ModelElementCategory) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			Pattern2DiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCoordinationPattern_2001Text(View view) {
		CoordinationPattern domainModelElement = (CoordinationPattern) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			Pattern2DiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCoordinationPattern_3001Text(View view) {
		IParser parser = Pattern2ParserProvider.getParser(
				Pattern2ElementTypes.CoordinationPattern_3001, view
						.getElement() != null ? view.getElement() : view,
				Pattern2VisualIDRegistry
						.getType(CoordinationPatternNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Pattern2DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRole_3002Text(View view) {
		IParser parser = Pattern2ParserProvider.getParser(
				Pattern2ElementTypes.Role_3002,
				view.getElement() != null ? view.getElement() : view,
				Pattern2VisualIDRegistry.getType(RoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Pattern2DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRoleCoordinationProtocol_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRoleConnector_4002Text(View view) {
		de.uni_paderborn.fujaba.muml.protocol.RoleConnector domainModelElement = (de.uni_paderborn.fujaba.muml.protocol.RoleConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			Pattern2DiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
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
		return ModelElementCategoryEditPart.MODEL_ID
				.equals(Pattern2VisualIDRegistry.getModelID(view));
	}

}
