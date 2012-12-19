package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator;

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
		de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageTypeDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageTypeDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator.MumlNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator.MumlNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator.MumlNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator.MumlNavigatorGroup group = (de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator.MumlNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageTypeDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator.MumlNavigatorItem) {
			de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator.MumlNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator.MumlNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.fujaba.de/modelinstance/0.3.8?ModelElementCategory", de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.ModelElementCategory_1000); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/model/msgtype/0.3.6?MessageTypeRepository", de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.MessageTypeRepository_2007); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/model/msgtype/0.3.6?MessageType", de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.MessageType_3007); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/model/core/0.3.8?Parameter", de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.Parameter_3008); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageTypeDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator.MumlNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator.MumlNavigatorGroup group = (de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator.MumlNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator.MumlNavigatorItem) {
			de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator.MumlNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.navigator.MumlNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MumlVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000Text(view);
		case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID:
			return getMessageTypeRepository_2007Text(view);
		case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3007Text(view);
		case de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3008Text(view);
		}
		return getUnknownElementText(view);
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
			de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageTypeDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMessageTypeRepository_2007Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.MessageTypeRepository_2007,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeRepositoryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageTypeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMessageType_3007Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.MessageType_3007,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageTypeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParameter_3008Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.Parameter_3008,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MumlVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageTypeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5013); //$NON-NLS-1$
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
		return de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.edit.parts.MessageInterfaceDiagramEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MumlVisualIDRegistry
						.getModelID(view));
	}

}
