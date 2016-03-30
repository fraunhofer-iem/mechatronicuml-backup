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

/**
 * @generated
 */
public class HardwareNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof org.muml.pm.hardware.resource.diagram.navigator.HardwareNavigatorItem
				&& !isOwnView(
						((org.muml.pm.hardware.resource.diagram.navigator.HardwareNavigatorItem) element)
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
		if (element instanceof org.muml.pm.hardware.resource.diagram.navigator.HardwareNavigatorGroup) {
			org.muml.pm.hardware.resource.diagram.navigator.HardwareNavigatorGroup group = (org.muml.pm.hardware.resource.diagram.navigator.HardwareNavigatorGroup) element;
			return org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof org.muml.pm.hardware.resource.diagram.navigator.HardwareNavigatorItem) {
			org.muml.pm.hardware.resource.diagram.navigator.HardwareNavigatorItem navigatorItem = (org.muml.pm.hardware.resource.diagram.navigator.HardwareNavigatorItem) element;
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
		switch (org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pm.hardware.resource.diagram.edit.parts.ResourceRepositoryEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.fujaba.de/muml/hardware/hwresource/1.1/?ResourceRepository", //$NON-NLS-1$
					org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.ResourceRepository_1000);
		case org.muml.pm.hardware.resource.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.fujaba.de/muml/hardware/hwresource/1.1/?Device", //$NON-NLS-1$
					org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.Device_2006);
		case org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/hardware/hwresource/1.1/?StructuredResource", //$NON-NLS-1$
					org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.StructuredResource_2007);
		case org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/hardware/hwresource/1.1/?CommunicationProtocolRepository", //$NON-NLS-1$
					org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationProtocolRepository_2008);
		case org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/hardware/hwresource/1.1/?CommunicationResource", //$NON-NLS-1$
					org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationResource_3011);
		case org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResource2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/hardware/hwresource/1.1/?CommunicationResource", //$NON-NLS-1$
					org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationResource_3012);
		case org.muml.pm.hardware.resource.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/hardware/hwresource/1.1/?Cache", //$NON-NLS-1$
					org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.Cache_3013);
		case org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/hardware/hwresource/1.1/?Processor", //$NON-NLS-1$
					org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.Processor_3014);
		case org.muml.pm.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/hardware/hwresource/1.1/?ProgrammableLogicDevice", //$NON-NLS-1$
					org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.ProgrammableLogicDevice_3015);
		case org.muml.pm.hardware.resource.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/hardware/hwresource/1.1/?MemoryResource", //$NON-NLS-1$
					org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.MemoryResource_3016);
		case org.muml.pm.hardware.resource.diagram.edit.parts.BusProtocolEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/hardware/hwresource/1.1/?BusProtocol", //$NON-NLS-1$
					org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.BusProtocol_3017);
		case org.muml.pm.hardware.resource.diagram.edit.parts.LinkProtocolEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/hardware/hwresource/1.1/?LinkProtocol", //$NON-NLS-1$
					org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.LinkProtocol_3018);
		case org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorOwnedCacheEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.fujaba.de/muml/hardware/hwresource/1.1/?Processor?ownedCache", //$NON-NLS-1$
					org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.ProcessorOwnedCache_4002);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes
						.isKnownElementType(elementType)) {
			image = org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes
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
		if (element instanceof org.muml.pm.hardware.resource.diagram.navigator.HardwareNavigatorGroup) {
			org.muml.pm.hardware.resource.diagram.navigator.HardwareNavigatorGroup group = (org.muml.pm.hardware.resource.diagram.navigator.HardwareNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof org.muml.pm.hardware.resource.diagram.navigator.HardwareNavigatorItem) {
			org.muml.pm.hardware.resource.diagram.navigator.HardwareNavigatorItem navigatorItem = (org.muml.pm.hardware.resource.diagram.navigator.HardwareNavigatorItem) element;
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
		switch (org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pm.hardware.resource.diagram.edit.parts.ResourceRepositoryEditPart.VISUAL_ID:
			return getResourceRepository_1000Text(view);
		case org.muml.pm.hardware.resource.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getDevice_2006Text(view);
		case org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2007Text(view);
		case org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryEditPart.VISUAL_ID:
			return getCommunicationProtocolRepository_2008Text(view);
		case org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3011Text(view);
		case org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResource2EditPart.VISUAL_ID:
			return getCommunicationResource_3012Text(view);
		case org.muml.pm.hardware.resource.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return getCache_3013Text(view);
		case org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_3014Text(view);
		case org.muml.pm.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3015Text(view);
		case org.muml.pm.hardware.resource.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3016Text(view);
		case org.muml.pm.hardware.resource.diagram.edit.parts.BusProtocolEditPart.VISUAL_ID:
			return getBusProtocol_3017Text(view);
		case org.muml.pm.hardware.resource.diagram.edit.parts.LinkProtocolEditPart.VISUAL_ID:
			return getLinkProtocol_3018Text(view);
		case org.muml.pm.hardware.resource.diagram.edit.parts.ProcessorOwnedCacheEditPart.VISUAL_ID:
			return getProcessorOwnedCache_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getResourceRepository_1000Text(View view) {
		org.muml.pm.hardware.hwresource.ResourceRepository domainModelElement = (org.muml.pm.hardware.hwresource.ResourceRepository) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDevice_2006Text(View view) {
		IParser parser = org.muml.pm.hardware.resource.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.Device_2006,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.resource.diagram.edit.parts.DeviceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredResource_2007Text(View view) {
		IParser parser = org.muml.pm.hardware.resource.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.StructuredResource_2007,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.resource.diagram.edit.parts.StructuredResourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCommunicationProtocolRepository_2008Text(View view) {
		IParser parser = org.muml.pm.hardware.resource.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationProtocolRepository_2008,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationProtocolRepositoryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCommunicationResource_3011Text(View view) {
		IParser parser = org.muml.pm.hardware.resource.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationResource_3011,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.resource.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCommunicationResource_3012Text(View view) {
		IParser parser = org.muml.pm.hardware.resource.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationResource_3012,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.resource.diagram.edit.parts.CommunicationResourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCache_3013Text(View view) {
		IParser parser = org.muml.pm.hardware.resource.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.Cache_3013,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.resource.diagram.edit.parts.CacheNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessor_3014Text(View view) {
		IParser parser = org.muml.pm.hardware.resource.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.Processor_3014,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.resource.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProgrammableLogicDevice_3015Text(View view) {
		IParser parser = org.muml.pm.hardware.resource.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.ProgrammableLogicDevice_3015,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.resource.diagram.edit.parts.ProgrammableLogicDeviceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMemoryResource_3016Text(View view) {
		IParser parser = org.muml.pm.hardware.resource.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.MemoryResource_3016,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.resource.diagram.edit.parts.MemoryResourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBusProtocol_3017Text(View view) {
		IParser parser = org.muml.pm.hardware.resource.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.BusProtocol_3017,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.resource.diagram.edit.parts.BusProtocolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLinkProtocol_3018Text(View view) {
		IParser parser = org.muml.pm.hardware.resource.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.LinkProtocol_3018,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry.getType(
								org.muml.pm.hardware.resource.diagram.edit.parts.LinkProtocolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5069); //$NON-NLS-1$
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
		return org.muml.pm.hardware.resource.diagram.edit.parts.ResourceRepositoryEditPart.MODEL_ID
				.equals(org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry
						.getModelID(view));
	}

}
