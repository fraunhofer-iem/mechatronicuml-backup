package org.muml.pm.hardware.resourceinstance.diagram.navigator;

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
		org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof org.muml.pm.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem
				&& !isOwnView(
						((org.muml.pm.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem) element)
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
		if (element instanceof org.muml.pm.hardware.resourceinstance.diagram.navigator.HardwareNavigatorGroup) {
			org.muml.pm.hardware.resourceinstance.diagram.navigator.HardwareNavigatorGroup group = (org.muml.pm.hardware.resourceinstance.diagram.navigator.HardwareNavigatorGroup) element;
			return org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof org.muml.pm.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem) {
			org.muml.pm.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem navigatorItem = (org.muml.pm.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem) element;
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
		switch (org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/?ResourceInstanceRepository", //$NON-NLS-1$
					org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ResourceInstanceRepository_1000);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/?SensorInstance", //$NON-NLS-1$
					org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.SensorInstance_2007);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/?ActuatorInstance", //$NON-NLS-1$
					org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ActuatorInstance_2008);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/?StructuredResourceInstance", //$NON-NLS-1$
					org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_2009);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/?HWPort", //$NON-NLS-1$
					org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.HWPort_3017);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/?CacheInstance", //$NON-NLS-1$
					org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.CacheInstance_3018);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/?ProgrammableLogicDeviceInstance", //$NON-NLS-1$
					org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProgrammableLogicDeviceInstance_3019);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/?ProcessorInstance", //$NON-NLS-1$
					org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessorInstance_3020);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/?ProcessingMemoryInstance", //$NON-NLS-1$
					org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessingMemoryInstance_3021);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/?StorageMemoryInstance", //$NON-NLS-1$
					org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StorageMemoryInstance_3022);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.1/?ProcessorInstance?ownedCacheInstance", //$NON-NLS-1$
					org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessorInstanceOwnedCacheInstance_4003);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes
						.isKnownElementType(elementType)) {
			image = org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes
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
		if (element instanceof org.muml.pm.hardware.resourceinstance.diagram.navigator.HardwareNavigatorGroup) {
			org.muml.pm.hardware.resourceinstance.diagram.navigator.HardwareNavigatorGroup group = (org.muml.pm.hardware.resourceinstance.diagram.navigator.HardwareNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof org.muml.pm.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem) {
			org.muml.pm.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem navigatorItem = (org.muml.pm.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem) element;
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
		switch (org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart.VISUAL_ID:
			return getResourceInstanceRepository_1000Text(view);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_2007Text(view);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2008Text(view);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2009Text(view);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart.VISUAL_ID:
			return getHWPort_3017Text(view);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3018Text(view);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3019Text(view);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3020Text(view);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3021Text(view);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3022Text(view);
		case org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID:
			return getProcessorInstanceOwnedCacheInstance_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getResourceInstanceRepository_1000Text(View view) {
		org.muml.pm.hardware.hwresourceinstance.ResourceInstanceRepository domainModelElement = (org.muml.pm.hardware.hwresourceinstance.ResourceInstanceRepository) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSensorInstance_2007Text(View view) {
		IParser parser = org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.SensorInstance_2007,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActuatorInstance_2008Text(View view) {
		IParser parser = org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ActuatorInstance_2008,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredResourceInstance_2009Text(View view) {
		IParser parser = org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_2009,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5101); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPort_3017Text(View view) {
		IParser parser = org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.HWPort_3017,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCacheInstance_3018Text(View view) {
		IParser parser = org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.CacheInstance_3018,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProgrammableLogicDeviceInstance_3019Text(View view) {
		IParser parser = org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProgrammableLogicDeviceInstance_3019,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5082); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessorInstance_3020Text(View view) {
		IParser parser = org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessorInstance_3020,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5086); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessingMemoryInstance_3021Text(View view) {
		IParser parser = org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessingMemoryInstance_3021,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5091); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStorageMemoryInstance_3022Text(View view) {
		IParser parser = org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StorageMemoryInstance_3022,
						view.getElement() != null ? view.getElement() : view,
						org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(
										org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError("Parser was not found for label " + 5096); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessorInstanceOwnedCacheInstance_4003Text(View view) {
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
		return org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart.MODEL_ID
				.equals(org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
						.getModelID(view));
	}

}
