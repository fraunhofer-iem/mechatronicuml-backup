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
import org.muml.pm.hardware.hwplatform.DelegationHWPort;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatform.NetworkConnector;
import org.muml.pm.hardware.platform.diagram.edit.parts.BusEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.DelegationHWPortEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatform2EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPlatformPartNameEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPortLabelEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.HWPortPartEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.NetworkBridgeEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.NetworkConnectorEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.ResourcePartNameEditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel2EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabel4EditPart;
import org.muml.pm.hardware.platform.diagram.edit.parts.WrappingLabelEditPart;
import org.muml.pm.hardware.platform.diagram.part.HardwareVisualIDRegistry;
import org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin;
import org.muml.pm.hardware.platform.diagram.providers.HardwareElementTypes;
import org.muml.pm.hardware.platform.diagram.providers.HardwareParserProvider;

/**
 * @generated
 */
public class HardwareNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		PlatformDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		PlatformDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof HardwareNavigatorItem && !isOwnView(((HardwareNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof HardwareNavigatorGroup) {
			HardwareNavigatorGroup group = (HardwareNavigatorGroup) element;
			return PlatformDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof HardwareNavigatorItem) {
			HardwareNavigatorItem navigatorItem = (HardwareNavigatorItem) element;
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
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case HWPlatformEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.muml.org/pm/hardware/hwplatform/1.0.0?HWPlatform", //$NON-NLS-1$
					HardwareElementTypes.HWPlatform_1000);
		case HWPlatform2EditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/pm/hardware/hwplatform/1.0.0?HWPlatform", //$NON-NLS-1$
					HardwareElementTypes.HWPlatform_2009);
		case BusEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwplatform/1.0.0?Bus", //$NON-NLS-1$
					HardwareElementTypes.Bus_3025);
		case NetworkBridgeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwplatform/1.0.0?NetworkBridge", //$NON-NLS-1$
					HardwareElementTypes.NetworkBridge_3026);
		case HWPlatformPartEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwplatform/1.0.0?HWPlatformPart", //$NON-NLS-1$
					HardwareElementTypes.HWPlatformPart_3027);
		case HWPortPartEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwplatform/1.0.0?HWPortPart", //$NON-NLS-1$
					HardwareElementTypes.HWPortPart_3028);
		case DelegationHWPortEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwplatform/1.0.0?DelegationHWPort", //$NON-NLS-1$
					HardwareElementTypes.DelegationHWPort_3029);
		case ResourcePartEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwplatform/1.0.0?ResourcePart", //$NON-NLS-1$
					HardwareElementTypes.ResourcePart_3030);
		case NetworkConnectorEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/pm/hardware/hwplatform/1.0.0?NetworkConnector", //$NON-NLS-1$
					HardwareElementTypes.NetworkConnector_4032);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PlatformDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && HardwareElementTypes.isKnownElementType(elementType)) {
			image = HardwareElementTypes.getImage(elementType);
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
		if (element instanceof HardwareNavigatorGroup) {
			HardwareNavigatorGroup group = (HardwareNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof HardwareNavigatorItem) {
			HardwareNavigatorItem navigatorItem = (HardwareNavigatorItem) element;
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
		switch (HardwareVisualIDRegistry.getVisualID(view)) {
		case HWPlatformEditPart.VISUAL_ID:
			return getHWPlatform_1000Text(view);
		case HWPlatform2EditPart.VISUAL_ID:
			return getHWPlatform_2009Text(view);
		case BusEditPart.VISUAL_ID:
			return getBus_3025Text(view);
		case NetworkBridgeEditPart.VISUAL_ID:
			return getNetworkBridge_3026Text(view);
		case HWPlatformPartEditPart.VISUAL_ID:
			return getHWPlatformPart_3027Text(view);
		case HWPortPartEditPart.VISUAL_ID:
			return getHWPortPart_3028Text(view);
		case DelegationHWPortEditPart.VISUAL_ID:
			return getDelegationHWPort_3029Text(view);
		case ResourcePartEditPart.VISUAL_ID:
			return getResourcePart_3030Text(view);
		case NetworkConnectorEditPart.VISUAL_ID:
			return getNetworkConnector_4032Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getHWPlatform_1000Text(View view) {
		HWPlatform domainModelElement = (HWPlatform) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			PlatformDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPlatform_2009Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.HWPlatform_2009,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBus_3025Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.Bus_3025,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNetworkBridge_3026Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.NetworkBridge_3026,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPlatformPart_3027Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.HWPlatformPart_3027,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(HWPlatformPartNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPortPart_3028Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.HWPortPart_3028,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(HWPortLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDelegationHWPort_3029Text(View view) {
		DelegationHWPort domainModelElement = (DelegationHWPort) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			PlatformDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResourcePart_3030Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.ResourcePart_3030,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(ResourcePartNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNetworkConnector_4032Text(View view) {
		NetworkConnector domainModelElement = (NetworkConnector) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			PlatformDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4032); //$NON-NLS-1$
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
		return HWPlatformEditPart.MODEL_ID.equals(HardwareVisualIDRegistry.getModelID(view));
	}

}
