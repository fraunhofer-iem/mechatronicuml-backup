package org.muml.pm.hardware.resource.diagram.navigator;

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
import org.muml.pm.hardware.hwresource.ResourceRepository;
import org.muml.pm.hardware.resource.diagram.edit.parts.BusProtocolEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.BusProtocolNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CacheEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CacheNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResource2EditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResourceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.DeviceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.DeviceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.HWPortLabelEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.LinkProtocolEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.LinkProtocolNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.MemoryResourceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.MemoryResourceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorOwnedCacheEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.ResourceRepositoryEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceNameEditPart;
import org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel11EditPart;
import org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin;
import org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry;
import org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes;
import org.muml.pm.hardware.resource.diagram.providers.HardwareParserProvider;

/**
 * @generated
 */
public class HardwareNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		HardwareDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		HardwareDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
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
			return HardwareDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
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
		case ResourceRepositoryEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.muml.org/pm/hardware/hwresource/1.0.0?ResourceRepository", //$NON-NLS-1$
					HardwareElementTypes.ResourceRepository_1000);
		case DeviceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.muml.org/pm/hardware/hwresource/1.0.0?Device", //$NON-NLS-1$
					HardwareElementTypes.Device_2006);
		case StructuredResourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/pm/hardware/hwresource/1.0.0?StructuredResource", //$NON-NLS-1$
					HardwareElementTypes.StructuredResource_2007);
		case CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/pm/hardware/hwresource/1.0.0?CommunicationProtocolRepository", //$NON-NLS-1$
					HardwareElementTypes.CommunicationProtocolRepository_2008);
		case CommunicationResourceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwresource/1.0.0?CommunicationResource", //$NON-NLS-1$
					HardwareElementTypes.CommunicationResource_3011);
		case CommunicationResource2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwresource/1.0.0?CommunicationResource", //$NON-NLS-1$
					HardwareElementTypes.CommunicationResource_3012);
		case CacheEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwresource/1.0.0?Cache", //$NON-NLS-1$
					HardwareElementTypes.Cache_3013);
		case ProcessorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwresource/1.0.0?Processor", //$NON-NLS-1$
					HardwareElementTypes.Processor_3014);
		case ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwresource/1.0.0?ProgrammableLogicDevice", //$NON-NLS-1$
					HardwareElementTypes.ProgrammableLogicDevice_3015);
		case MemoryResourceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwresource/1.0.0?MemoryResource", //$NON-NLS-1$
					HardwareElementTypes.MemoryResource_3016);
		case BusProtocolEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwresource/1.0.0?BusProtocol", //$NON-NLS-1$
					HardwareElementTypes.BusProtocol_3017);
		case LinkProtocolEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwresource/1.0.0?LinkProtocol", //$NON-NLS-1$
					HardwareElementTypes.LinkProtocol_3018);
		case ProcessorOwnedCacheEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.muml.org/pm/hardware/hwresource/1.0.0?Processor?ownedCache", //$NON-NLS-1$
					HardwareElementTypes.ProcessorOwnedCache_4002);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = HardwareDiagramEditorPlugin.getInstance().getImageRegistry();
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
		case ResourceRepositoryEditPart.VISUAL_ID:
			return getResourceRepository_1000Text(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2006Text(view);
		case StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2007Text(view);
		case CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return getCommunicationProtocolRepository_2008Text(view);
		case CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3011Text(view);
		case CommunicationResource2EditPart.VISUAL_ID:
			return getCommunicationResource_3012Text(view);
		case CacheEditPart.VISUAL_ID:
			return getCache_3013Text(view);
		case ProcessorEditPart.VISUAL_ID:
			return getProcessor_3014Text(view);
		case ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3015Text(view);
		case MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3016Text(view);
		case BusProtocolEditPart.VISUAL_ID:
			return getBusProtocol_3017Text(view);
		case LinkProtocolEditPart.VISUAL_ID:
			return getLinkProtocol_3018Text(view);
		case ProcessorOwnedCacheEditPart.VISUAL_ID:
			return getProcessorOwnedCache_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getResourceRepository_1000Text(View view) {
		ResourceRepository domainModelElement = (ResourceRepository) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			HardwareDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDevice_2006Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.Device_2006,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(DeviceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HardwareDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredResource_2007Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.StructuredResource_2007,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(StructuredResourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HardwareDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCommunicationProtocolRepository_2008Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.CommunicationProtocolRepository_2008,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(CommunicationProtocolRepositoryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HardwareDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCommunicationResource_3011Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.CommunicationResource_3011,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(HWPortLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HardwareDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCommunicationResource_3012Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.CommunicationResource_3012,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(CommunicationResourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HardwareDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCache_3013Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.Cache_3013,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(CacheNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HardwareDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessor_3014Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.Processor_3014,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(WrappingLabel11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HardwareDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProgrammableLogicDevice_3015Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.ProgrammableLogicDevice_3015,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(ProgrammableLogicDeviceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HardwareDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMemoryResource_3016Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.MemoryResource_3016,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(MemoryResourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HardwareDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBusProtocol_3017Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.BusProtocol_3017,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(BusProtocolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HardwareDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLinkProtocol_3018Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.LinkProtocol_3018,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(LinkProtocolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HardwareDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessorOwnedCache_4002Text(View view) {
		return ""; //$NON-NLS-1$
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
		return ResourceRepositoryEditPart.MODEL_ID.equals(HardwareVisualIDRegistry.getModelID(view));
	}

}
