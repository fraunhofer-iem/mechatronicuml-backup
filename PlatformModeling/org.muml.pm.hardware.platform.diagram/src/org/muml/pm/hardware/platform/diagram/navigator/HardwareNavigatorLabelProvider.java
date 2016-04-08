package org.muml.pm.hardware.platform.diagram.navigator;

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
public class HardwareNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof org.muml.pm.hardware.platform.diagram.navigator.HardwareNavigatorItem
				&& !isOwnView(
						((org.muml.pm.hardware.platform.diagram.navigator.HardwareNavigatorItem) element)
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
		if (element instanceof org.muml.pm.hardware.platform.diagram.navigator.HardwareNavigatorGroup) {
			org.muml.pm.hardware.platform.diagram.navigator.HardwareNavigatorGroup group = (org.muml.pm.hardware.platform.diagram.navigator.HardwareNavigatorGroup) element;
			return org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof org.muml.pm.hardware.platform.diagram.navigator.HardwareNavigatorItem) {
			org.muml.pm.hardware.platform.diagram.navigator.HardwareNavigatorItem navigatorItem = (org.muml.pm.hardware.platform.diagram.navigator.HardwareNavigatorItem) element;
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
		switch (org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.muml.org/pm/hardware/hwplatform/1.0.0?HWPlatform", //$NON-NLS-1$
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatform_1000);
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/pm/hardware/hwplatform/1.0.0?HWPlatform", //$NON-NLS-1$
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatform_2009);
		case org.muml.pm.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwplatform/1.0.0?Bus", //$NON-NLS-1$
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.Bus_3025);
		case org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwplatform/1.0.0?NetworkBridge", //$NON-NLS-1$
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkBridge_3026);
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwplatform/1.0.0?HWPlatformPart", //$NON-NLS-1$
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatformPart_3027);
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwplatform/1.0.0?HWPortPart", //$NON-NLS-1$
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.HWPortPart_3028);
		case org.muml.pm.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwplatform/1.0.0?DelegationHWPort", //$NON-NLS-1$
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.DelegationHWPort_3029);
		case org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwplatform/1.0.0?ResourcePart", //$NON-NLS-1$
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.ResourcePart_3030);
		case org.muml.pm.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/pm/hardware/hwplatform/1.0.0?NetworkConnector", //$NON-NLS-1$
					org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkConnector_4032);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes
						.isKnownElementType(elementType)) {
			image = org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes
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
		if (element instanceof org.muml.pm.hardware.platform.diagram.navigator.HardwareNavigatorGroup) {
			org.muml.pm.hardware.platform.diagram.navigator.HardwareNavigatorGroup group = (org.muml.pm.hardware.platform.diagram.navigator.HardwareNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof org.muml.pm.hardware.platform.diagram.navigator.HardwareNavigatorItem) {
			org.muml.pm.hardware.platform.diagram.navigator.HardwareNavigatorItem navigatorItem = (org.muml.pm.hardware.platform.diagram.navigator.HardwareNavigatorItem) element;
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
		switch (org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.VISUAL_ID:
			return getHWPlatform_1000Text(view);
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatform2EditPart.VISUAL_ID:
			return getHWPlatform_2009Text(view);
		case org.muml.pm.hardware.platform.diagram.edit.parts.BusEditPart.VISUAL_ID:
			return getBus_3025Text(view);
		case org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart.VISUAL_ID:
			return getNetworkBridge_3026Text(view);
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3027Text(view);
		case org.muml.pm.hardware.platform.diagram.edit.parts.HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3028Text(view);
		case org.muml.pm.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart.VISUAL_ID:
			return getDelegationHWPort_3029Text(view);
		case org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartEditPart.VISUAL_ID:
			return getResourcePart_3030Text(view);
		case org.muml.pm.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart.VISUAL_ID:
			return getNetworkConnector_4032Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getHWPlatform_1000Text(View view) {
		org.muml.pm.hardware.hwplatform.HWPlatform domainModelElement = (org.muml.pm.hardware.hwplatform.HWPlatform) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPlatform_2009Text(View view) {
		IParser parser = org.muml.pm.hardware.platform.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatform_2009,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBus_3025Text(View view) {
		IParser parser = org.muml.pm.hardware.platform.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.Bus_3025,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNetworkBridge_3026Text(View view) {
		IParser parser = org.muml.pm.hardware.platform.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.NetworkBridge_3026,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPlatformPart_3027Text(View view) {
		IParser parser = org.muml.pm.hardware.platform.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.HWPlatformPart_3027,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPortPart_3028Text(View view) {
		IParser parser = org.muml.pm.hardware.platform.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.HWPortPart_3028,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.platform.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDelegationHWPort_3029Text(View view) {
		org.muml.pm.hardware.hwplatform.DelegationHWPort domainModelElement = (org.muml.pm.hardware.hwplatform.DelegationHWPort) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResourcePart_3030Text(View view) {
		IParser parser = org.muml.pm.hardware.platform.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes.ResourcePart_3030,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNetworkConnector_4032Text(View view) {
		org.muml.pm.hardware.hwplatform.NetworkConnector domainModelElement = (org.muml.pm.hardware.hwplatform.NetworkConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4032); //$NON-NLS-1$
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
		return org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart.MODEL_ID.equals(
				org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry.getModelID(view));
	}

}
