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

import de.fujaba.modelinstance.ModelElementCategory;

/**
 * @generated
 */
public class MumlNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.MumlNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.MumlNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.MumlNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.MumlNavigatorGroup group = (de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.MumlNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.MumlNavigatorItem) {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.MumlNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.MumlNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocolRolesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/model/protocol/0.3.17?CoordinationProtocol?roles", de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.CoordinationProtocolRoles_4007); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/model/protocol/0.3.17?CoordinationProtocol", de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.CoordinationProtocol_2005); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocol2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/model/protocol/0.3.17?CoordinationProtocol", de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.CoordinationProtocol_3005); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/model/protocol/0.3.17?RoleConnector", de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.RoleConnector_4006); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/model/protocol/0.3.17?Role", de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.Role_3006); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.fujaba.de/modelinstance/0.3.15?ModelElementCategory", de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.ModelElementCategory_1000); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.MumlNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.MumlNavigatorGroup group = (de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.MumlNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.MumlNavigatorItem) {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.MumlNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.patterneditor.diagram.navigator.MumlNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocolRolesEditPart.VISUAL_ID:
			return getCoordinationProtocolRoles_4007Text(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocolEditPart.VISUAL_ID:
			return getCoordinationProtocol_2005Text(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocol2EditPart.VISUAL_ID:
			return getCoordinationProtocol_3005Text(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleConnectorEditPart.VISUAL_ID:
			return getRoleConnector_4006Text(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3006Text(view);
		case de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.ModelElementCategoryEditPart.VISUAL_ID:
			return getModelElementCategory_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getRoleConnector_4006Text(View view) {
		de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector domainModelElement = (de.uni_paderborn.fujaba.muml.model.protocol.RoleConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCoordinationProtocolRoles_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCoordinationProtocol_3005Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.CoordinationProtocol_3005,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.CoordinationProtocolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCoordinationProtocol_2005Text(View view) {
		de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol domainModelElement = (de.uni_paderborn.fujaba.muml.model.protocol.CoordinationProtocol) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRole_3006Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.patterneditor.diagram.providers.MumlElementTypes.Role_3006,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.RoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModelElementCategory_1000Text(View view) {
		ModelElementCategory domainModelElement = (ModelElementCategory) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
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
		return de.uni_paderborn.fujaba.muml.patterneditor.diagram.edit.parts.ModelElementCategoryEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.patterneditor.diagram.part.MumlVisualIDRegistry
						.getModelID(view));
	}

}
