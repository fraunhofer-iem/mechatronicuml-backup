package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator;

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
public class HardwareNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator.HardwareNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator.HardwareNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator.HardwareNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator.HardwareNavigatorGroup group = (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator.HardwareNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator.HardwareNavigatorItem) {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator.HardwareNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator.HardwareNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.fujaba.de/muml/hardware/hwplatform/1.1/?HWPlatform", de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatform_1000); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/hardware/hwplatform/1.1/?HWPlatform", de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatform_2009); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwplatform/1.1/?Bus", de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Bus_3025); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwplatform/1.1/?NetworkBridge", de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.NetworkBridge_3026); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwplatform/1.1/?HWPlatformPart", de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatformPart_3027); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwplatform/1.1/?HWPortPart", de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPortPart_3028); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwplatform/1.1/?DelegationHWPort", de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.DelegationHWPort_3029); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwplatform/1.1/?ResourcePart", de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.ResourcePart_3030); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/hardware/hwplatform/1.1/?NetworkConnector", de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.NetworkConnector_4032); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator.HardwareNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator.HardwareNavigatorGroup group = (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator.HardwareNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator.HardwareNavigatorItem) {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator.HardwareNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.navigator.HardwareNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID:
			return getHWPlatform_1000Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID:
			return getHWPlatform_2009Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getBus_3025Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart.VISUAL_ID:
			return getNetworkBridge_3026Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3027Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3028Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID:
			return getDelegationHWPort_3029Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			return getResourcePart_3030Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID:
			return getNetworkConnector_4032Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getHWPlatform_1000Text(View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform domainModelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPlatform_2009Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatform_2009,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBus_3025Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.Bus_3025,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNetworkBridge_3026Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.NetworkBridge_3026,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPlatformPart_3027Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatformPart_3027,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformPartNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPortPart_3028Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.HWPortPart_3028,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDelegationHWPort_3029Text(View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort domainModelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResourcePart_3030Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.providers.HardwareElementTypes.ResourcePart_3030,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.ResourcePartNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNetworkConnector_4032Text(View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector domainModelElement = (de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4032); //$NON-NLS-1$
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
		return de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.HWPlatformEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.hardware.platform.diagram.part.HardwareVisualIDRegistry
						.getModelID(view));
	}

}
