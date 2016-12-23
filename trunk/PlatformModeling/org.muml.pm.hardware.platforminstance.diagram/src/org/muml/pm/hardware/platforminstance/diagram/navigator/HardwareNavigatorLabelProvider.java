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
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.ActuatorInstanceNameEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.BusInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.DelegationHWPortInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstance2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfiguration2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceConfigurationEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceName2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPlatformInstanceNameEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortLabel2EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.HWPortLabelEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkBridgeInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.NetworkConnectorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.SensorInstanceNameEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel11EditPart;
import org.muml.pm.hardware.platforminstance.diagram.edit.parts.WrappingLabel13EditPart;
import org.muml.pm.hardware.platforminstance.diagram.part.HardwareVisualIDRegistry;
import org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin;
import org.muml.pm.hardware.platforminstance.diagram.providers.HardwareElementTypes;
import org.muml.pm.hardware.platforminstance.diagram.providers.HardwareParserProvider;

/**
 * @generated
 */
public class HardwareNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		PlatformInstanceDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		PlatformInstanceDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
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
			return PlatformInstanceDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
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
		case HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.muml.org/pm/hardware/hwplatforminstance/1.0.0?HWPlatformInstanceConfiguration", //$NON-NLS-1$
					HardwareElementTypes.HWPlatformInstanceConfiguration_1000);
		case HWPlatformInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/pm/hardware/hwplatforminstance/1.0.0?HWPlatformInstance", //$NON-NLS-1$
					HardwareElementTypes.HWPlatformInstance_2005);
		case HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/pm/hardware/hwplatforminstance/1.0.0?HWPlatformInstanceConfiguration", //$NON-NLS-1$
					HardwareElementTypes.HWPlatformInstanceConfiguration_3039);
		case HWPlatformInstance2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/pm/hardware/hwplatforminstance/1.0.0?HWPlatformInstance", //$NON-NLS-1$
					HardwareElementTypes.HWPlatformInstance_3040);
		case DelegationHWPortInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/pm/hardware/hwplatforminstance/1.0.0?DelegationHWPortInstance", //$NON-NLS-1$
					HardwareElementTypes.DelegationHWPortInstance_3041);
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0?StructuredResourceInstance", //$NON-NLS-1$
					HardwareElementTypes.StructuredResourceInstance_3042);
		case HWPortInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwplatforminstance/1.0.0?HWPortInstance", //$NON-NLS-1$
					HardwareElementTypes.HWPortInstance_3043);
		case ActuatorInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0?ActuatorInstance", //$NON-NLS-1$
					HardwareElementTypes.ActuatorInstance_3044);
		case SensorInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0?SensorInstance", //$NON-NLS-1$
					HardwareElementTypes.SensorInstance_3045);
		case BusInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwplatforminstance/1.0.0?BusInstance", //$NON-NLS-1$
					HardwareElementTypes.BusInstance_3046);
		case NetworkBridgeInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/pm/hardware/hwplatforminstance/1.0.0?NetworkBridgeInstance", //$NON-NLS-1$
					HardwareElementTypes.NetworkBridgeInstance_3047);
		case NetworkConnectorInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.muml.org/pm/hardware/hwplatforminstance/1.0.0?NetworkConnectorInstance", //$NON-NLS-1$
					HardwareElementTypes.NetworkConnectorInstance_4012);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PlatformInstanceDiagramEditorPlugin.getInstance().getImageRegistry();
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
		case HWPlatformInstanceConfigurationEditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_1000Text(view);
		case HWPlatformInstanceEditPart.VISUAL_ID:
			return getHWPlatformInstance_2005Text(view);
		case HWPlatformInstanceConfiguration2EditPart.VISUAL_ID:
			return getHWPlatformInstanceConfiguration_3039Text(view);
		case HWPlatformInstance2EditPart.VISUAL_ID:
			return getHWPlatformInstance_3040Text(view);
		case DelegationHWPortInstanceEditPart.VISUAL_ID:
			return getDelegationHWPortInstance_3041Text(view);
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_3042Text(view);
		case HWPortInstanceEditPart.VISUAL_ID:
			return getHWPortInstance_3043Text(view);
		case ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_3044Text(view);
		case SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_3045Text(view);
		case BusInstanceEditPart.VISUAL_ID:
			return getBusInstance_3046Text(view);
		case NetworkBridgeInstanceEditPart.VISUAL_ID:
			return getNetworkBridgeInstance_3047Text(view);
		case NetworkConnectorInstanceEditPart.VISUAL_ID:
			return getNetworkConnectorInstance_4012Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getHWPlatformInstanceConfiguration_1000Text(View view) {
		HWPlatformInstanceConfiguration domainModelElement = (HWPlatformInstanceConfiguration) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			PlatformInstanceDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPlatformInstance_2005Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.HWPlatformInstance_2005,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(HWPlatformInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5118); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPlatformInstanceConfiguration_3039Text(View view) {
		HWPlatformInstanceConfiguration domainModelElement = (HWPlatformInstanceConfiguration) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			PlatformInstanceDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPlatformInstance_3040Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.HWPlatformInstance_3040,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(HWPlatformInstanceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5117); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDelegationHWPortInstance_3041Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.DelegationHWPortInstance_3041,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(HWPortLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5100); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredResourceInstance_3042Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.StructuredResourceInstance_3042,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(StructuredResourceInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5103); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPortInstance_3043Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.HWPortInstance_3043,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(HWPortLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5102); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActuatorInstance_3044Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.ActuatorInstance_3044,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(ActuatorInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5108); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSensorInstance_3045Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.SensorInstance_3045,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(SensorInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5111); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBusInstance_3046Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.BusInstance_3046,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(WrappingLabel11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5114); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNetworkBridgeInstance_3047Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.NetworkBridgeInstance_3047,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(WrappingLabel13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PlatformInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5116); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNetworkConnectorInstance_4012Text(View view) {
		NetworkConnectorInstance domainModelElement = (NetworkConnectorInstance) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			PlatformInstanceDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4012); //$NON-NLS-1$
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
		return HWPlatformInstanceConfigurationEditPart.MODEL_ID.equals(HardwareVisualIDRegistry.getModelID(view));
	}

}
