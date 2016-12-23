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
import org.muml.pm.hardware.hwresourceinstance.ResourceInstanceRepository;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.CacheInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HWPortEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.HWPortLabelEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceOwnedCacheInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.SensorInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart;
import org.muml.pm.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry;
import org.muml.pm.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin;
import org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes;
import org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareParserProvider;

/**
 * @generated
 */
public class HardwareNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ResourceInstanceDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ResourceInstanceDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
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
			return ResourceInstanceDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
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
		case ResourceInstanceRepositoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0?ResourceInstanceRepository", //$NON-NLS-1$
					HardwareElementTypes.ResourceInstanceRepository_1000);
		case SensorInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0?SensorInstance", //$NON-NLS-1$
					HardwareElementTypes.SensorInstance_2007);
		case ActuatorInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0?ActuatorInstance", //$NON-NLS-1$
					HardwareElementTypes.ActuatorInstance_2008);
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0?StructuredResourceInstance", //$NON-NLS-1$
					HardwareElementTypes.StructuredResourceInstance_2009);
		case HWPortEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0?HWPort", //$NON-NLS-1$
					HardwareElementTypes.HWPort_3017);
		case CacheInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0?CacheInstance", //$NON-NLS-1$
					HardwareElementTypes.CacheInstance_3018);
		case ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0?ProgrammableLogicDeviceInstance", //$NON-NLS-1$
					HardwareElementTypes.ProgrammableLogicDeviceInstance_3019);
		case ProcessorInstanceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0?ProcessorInstance", //$NON-NLS-1$
					HardwareElementTypes.ProcessorInstance_3020);
		case ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0?ProcessingMemoryInstance", //$NON-NLS-1$
					HardwareElementTypes.ProcessingMemoryInstance_3021);
		case StorageMemoryInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0?StorageMemoryInstance", //$NON-NLS-1$
					HardwareElementTypes.StorageMemoryInstance_3022);
		case ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.muml.org/pm/hardware/hwresourceinstance/1.0.0?ProcessorInstance?ownedCacheInstance", //$NON-NLS-1$
					HardwareElementTypes.ProcessorInstanceOwnedCacheInstance_4003);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ResourceInstanceDiagramEditorPlugin.getInstance().getImageRegistry();
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
		case ResourceInstanceRepositoryEditPart.VISUAL_ID:
			return getResourceInstanceRepository_1000Text(view);
		case SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_2007Text(view);
		case ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2008Text(view);
		case StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2009Text(view);
		case HWPortEditPart.VISUAL_ID:
			return getHWPort_3017Text(view);
		case CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3018Text(view);
		case ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3019Text(view);
		case ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3020Text(view);
		case ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3021Text(view);
		case StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3022Text(view);
		case ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID:
			return getProcessorInstanceOwnedCacheInstance_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getResourceInstanceRepository_1000Text(View view) {
		ResourceInstanceRepository domainModelElement = (ResourceInstanceRepository) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			ResourceInstanceDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSensorInstance_2007Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.SensorInstance_2007,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(SensorInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActuatorInstance_2008Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.ActuatorInstance_2008,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(ActuatorInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredResourceInstance_2009Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.StructuredResourceInstance_2009,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(StructuredResourceInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5101); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPort_3017Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.HWPort_3017,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(HWPortLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCacheInstance_3018Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.CacheInstance_3018,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(CacheInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProgrammableLogicDeviceInstance_3019Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.ProgrammableLogicDeviceInstance_3019,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(ProgrammableLogicDeviceInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5082); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessorInstance_3020Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.ProcessorInstance_3020,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(ProcessorInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5086); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessingMemoryInstance_3021Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.ProcessingMemoryInstance_3021,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(ProcessingMemoryInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5091); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStorageMemoryInstance_3022Text(View view) {
		IParser parser = HardwareParserProvider.getParser(HardwareElementTypes.StorageMemoryInstance_3022,
				view.getElement() != null ? view.getElement() : view,
				HardwareVisualIDRegistry.getType(StorageMemoryInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ResourceInstanceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5096); //$NON-NLS-1$
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
		return ResourceInstanceRepositoryEditPart.MODEL_ID.equals(HardwareVisualIDRegistry.getModelID(view));
	}

}
