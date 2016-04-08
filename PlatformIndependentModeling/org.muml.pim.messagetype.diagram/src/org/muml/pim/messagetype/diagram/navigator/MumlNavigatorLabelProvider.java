package org.muml.pim.messagetype.diagram.navigator;

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
public class MumlNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		org.muml.pim.messagetype.diagram.part.MessageTypeDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		org.muml.pim.messagetype.diagram.part.MessageTypeDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof org.muml.pim.messagetype.diagram.navigator.MumlNavigatorItem
				&& !isOwnView(((org.muml.pim.messagetype.diagram.navigator.MumlNavigatorItem) element)
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
		if (element instanceof org.muml.pim.messagetype.diagram.navigator.MumlNavigatorGroup) {
			org.muml.pim.messagetype.diagram.navigator.MumlNavigatorGroup group = (org.muml.pim.messagetype.diagram.navigator.MumlNavigatorGroup) element;
			return org.muml.pim.messagetype.diagram.part.MessageTypeDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof org.muml.pim.messagetype.diagram.navigator.MumlNavigatorItem) {
			org.muml.pim.messagetype.diagram.navigator.MumlNavigatorItem navigatorItem = (org.muml.pim.messagetype.diagram.navigator.MumlNavigatorItem) element;
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
		switch (org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.fujaba.de/modelinstance/0.4.0?ModelElementCategory", //$NON-NLS-1$
					org.muml.pim.messagetype.diagram.providers.MumlElementTypes.ModelElementCategory_1000);
		case org.muml.pim.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/pim/msgtype/1.0.0?MessageTypeRepository", //$NON-NLS-1$
					org.muml.pim.messagetype.diagram.providers.MumlElementTypes.MessageTypeRepository_2008);
		case org.muml.pim.messagetype.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/msgtype/1.0.0?MessageType", //$NON-NLS-1$
					org.muml.pim.messagetype.diagram.providers.MumlElementTypes.MessageType_3007);
		case org.muml.pim.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pim/behavior/1.0.0?Parameter", //$NON-NLS-1$
					org.muml.pim.messagetype.diagram.providers.MumlElementTypes.Parameter_3009);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = org.muml.pim.messagetype.diagram.part.MessageTypeDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& org.muml.pim.messagetype.diagram.providers.MumlElementTypes
						.isKnownElementType(elementType)) {
			image = org.muml.pim.messagetype.diagram.providers.MumlElementTypes.getImage(elementType);
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
		if (element instanceof org.muml.pim.messagetype.diagram.navigator.MumlNavigatorGroup) {
			org.muml.pim.messagetype.diagram.navigator.MumlNavigatorGroup group = (org.muml.pim.messagetype.diagram.navigator.MumlNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof org.muml.pim.messagetype.diagram.navigator.MumlNavigatorItem) {
			org.muml.pim.messagetype.diagram.navigator.MumlNavigatorItem navigatorItem = (org.muml.pim.messagetype.diagram.navigator.MumlNavigatorItem) element;
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
		switch (org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.getVisualID(view)) {
		case org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.VISUAL_ID:
			return getModelElementCategory_1000Text(view);
		case org.muml.pim.messagetype.diagram.edit.parts.MessageTypeRepositoryEditPart.VISUAL_ID:
			return getMessageTypeRepository_2008Text(view);
		case org.muml.pim.messagetype.diagram.edit.parts.MessageTypeEditPart.VISUAL_ID:
			return getMessageType_3007Text(view);
		case org.muml.pim.messagetype.diagram.edit.parts.ParameterEditPart.VISUAL_ID:
			return getParameter_3009Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getModelElementCategory_1000Text(View view) {
		org.muml.core.modelinstance.ModelElementCategory domainModelElement = (org.muml.core.modelinstance.ModelElementCategory) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			org.muml.pim.messagetype.diagram.part.MessageTypeDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMessageTypeRepository_2008Text(View view) {
		IParser parser = org.muml.pim.messagetype.diagram.providers.MumlParserProvider.getParser(
				org.muml.pim.messagetype.diagram.providers.MumlElementTypes.MessageTypeRepository_2008,
				view.getElement() != null ? view.getElement() : view,
				org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.getType(
						org.muml.pim.messagetype.diagram.edit.parts.MessageTypeRepositoryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pim.messagetype.diagram.part.MessageTypeDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMessageType_3007Text(View view) {
		IParser parser = org.muml.pim.messagetype.diagram.providers.MumlParserProvider
				.getParser(org.muml.pim.messagetype.diagram.providers.MumlElementTypes.MessageType_3007,
						view.getElement() != null ? view.getElement()
								: view,
						org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.getType(
								org.muml.pim.messagetype.diagram.edit.parts.MessageTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pim.messagetype.diagram.part.MessageTypeDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParameter_3009Text(View view) {
		IParser parser = org.muml.pim.messagetype.diagram.providers.MumlParserProvider
				.getParser(org.muml.pim.messagetype.diagram.providers.MumlElementTypes.Parameter_3009,
						view.getElement() != null ? view.getElement()
								: view,
						org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.getType(
								org.muml.pim.messagetype.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pim.messagetype.diagram.part.MessageTypeDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5016); //$NON-NLS-1$
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
		return org.muml.pim.messagetype.diagram.edit.parts.MessageInterfaceDiagramEditPart.MODEL_ID
				.equals(org.muml.pim.messagetype.diagram.part.MumlVisualIDRegistry.getModelID(view));
	}

}
