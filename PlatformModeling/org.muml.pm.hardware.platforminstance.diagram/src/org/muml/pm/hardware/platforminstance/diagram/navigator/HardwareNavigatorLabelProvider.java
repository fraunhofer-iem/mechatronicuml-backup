package org.muml.pm.hardware.platforminstance.diagram.navigator;

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
		org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorItem
				&& !isOwnView(
						((org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorItem) element)
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
		if (element instanceof org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorGroup) {
			org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorGroup group = (org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorGroup) element;
			return org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorItem) {
			org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorItem navigatorItem = (org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorItem) element;
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
		switch (org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.fujaba.de/muml/hardware/hwplatforminstance/1.1/?HWPlatformInstanceConfiguration", //$NON-NLS-1$
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstanceConfiguration_1000);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/hardware/hwplatforminstance/1.1/?HWPlatformInstance", //$NON-NLS-1$
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstance_2005);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwplatforminstance/1.1/?HWPlatformInstanceConfiguration", //$NON-NLS-1$
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstanceConfiguration_3039);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwplatforminstance/1.1/?HWPlatformInstance", //$NON-NLS-1$
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstance_3040);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwplatforminstance/1.1/?DelegationHWPortInstance", //$NON-NLS-1$
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationHWPortInstance_3041);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/?StructuredResourceInstance", //$NON-NLS-1$
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_3042);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/hardware/hwplatforminstance/1.1/?HWPortInstance", //$NON-NLS-1$
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortInstance_3043);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/?ActuatorInstance", //$NON-NLS-1$
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.ActuatorInstance_3044);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/?SensorInstance", //$NON-NLS-1$
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.SensorInstance_3045);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/hardware/hwplatforminstance/1.1/?BusInstance", //$NON-NLS-1$
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusInstance_3046);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwplatforminstance/1.1/?NetworkBridgeInstance", //$NON-NLS-1$
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkBridgeInstance_3047);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/hardware/hwplatforminstance/1.1/?NetworkConnectorInstance", //$NON-NLS-1$
					org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkConnectorInstance_4012);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes
						.isKnownElementType(elementType)) {
			image = org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes
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
		if (element instanceof org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorGroup) {
			org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorGroup group = (org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorItem) {
			org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorItem navigatorItem = (org.muml.pm.hardware.platforminstance.diagram.navigator.HardwareNavigatorItem) element;
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
		switch (org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_1000Text(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2005Text(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_3039Text(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3040Text(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart.VISUAL_ID:
			return getDelegationHWPortInstance_3041Text(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3042Text(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart.VISUAL_ID:
			return getHWPortInstance_3043Text(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3044Text(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3045Text(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart.VISUAL_ID:
			return getBusInstance_3046Text(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart.VISUAL_ID:
			return getNetworkBridgeInstance_3047Text(view);
		case org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart.VISUAL_ID:
			return getNetworkConnectorInstance_4012Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getHWPlatformInstanceConfiguration_1000Text(View view) {
		org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration domainModelElement = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPlatformInstance_2005Text(View view) {
		IParser parser = org.muml.pm.hardware.platforminstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstance_2005,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5118); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPlatformInstanceConfiguration_3039Text(View view) {
		org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration domainModelElement = (org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("No domain element for view with visualID = " + 3039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPlatformInstance_3040Text(View view) {
		IParser parser = org.muml.pm.hardware.platforminstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPlatformInstance_3040,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5117); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDelegationHWPortInstance_3041Text(View view) {
		IParser parser = org.muml.pm.hardware.platforminstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.DelegationHWPortInstance_3041,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5100); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredResourceInstance_3042Text(View view) {
		IParser parser = org.muml.pm.hardware.platforminstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_3042,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5103); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPortInstance_3043Text(View view) {
		IParser parser = org.muml.pm.hardware.platforminstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.HWPortInstance_3043,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5102); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActuatorInstance_3044Text(View view) {
		IParser parser = org.muml.pm.hardware.platforminstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.ActuatorInstance_3044,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5108); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSensorInstance_3045Text(View view) {
		IParser parser = org.muml.pm.hardware.platforminstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.SensorInstance_3045,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5111); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBusInstance_3046Text(View view) {
		IParser parser = org.muml.pm.hardware.platforminstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.BusInstance_3046,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5114); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNetworkBridgeInstance_3047Text(View view) {
		IParser parser = org.muml.pm.hardware.platforminstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes.NetworkBridgeInstance_3047,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5116); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNetworkConnectorInstance_4012Text(View view) {
		org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance domainModelElement = (org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin
					.getInstance().logError("No domain element for view with visualID = " + 4012); //$NON-NLS-1$
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
		return org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart.MODEL_ID
				.equals(org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry
						.getModelID(view));
	}

}
