package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator;

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
		de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator.HardwareNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator.HardwareNavigatorGroup group = (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator.HardwareNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.0/?ResourceInstanceRepository", de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ResourceInstanceRepository_1000); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.0/?SensorInstance", de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.SensorInstance_2004); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.0/?ActuatorInstance", de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ActuatorInstance_2005); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.0/?StructuredResourceInstance", de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_2006); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwresource/1.0/?CommunicationResource", de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.CommunicationResource_3008); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.0/?CacheInstance", de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.CacheInstance_3009); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.0/?ProgrammableLogicDeviceInstance", de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProgrammableLogicDeviceInstance_3010); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.0/?ProcessorInstance", de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessorInstance_3011); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.0/?ProcessingMemoryInstance", de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessingMemoryInstance_3012); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.0/?StorageMemoryInstance", de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StorageMemoryInstance_3013); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/hardware/hwresourceinstance/1.0/?ProcessorInstance?ownedCacheInstance", de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessorInstanceOwnedCacheInstance_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator.HardwareNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator.HardwareNavigatorGroup group = (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator.HardwareNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem) {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.navigator.HardwareNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart.VISUAL_ID:
			return getResourceInstanceRepository_1000Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.SensorInstanceEditPart.VISUAL_ID:
			return getSensorInstance_2004Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceEditPart.VISUAL_ID:
			return getActuatorInstance_2005Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceEditPart.VISUAL_ID:
			return getStructuredResourceInstance_2006Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CommunicationResourceEditPart.VISUAL_ID:
			return getCommunicationResource_3008Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CacheInstanceEditPart.VISUAL_ID:
			return getCacheInstance_3009Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceEditPart.VISUAL_ID:
			return getProgrammableLogicDeviceInstance_3010Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceEditPart.VISUAL_ID:
			return getProcessorInstance_3011Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceEditPart.VISUAL_ID:
			return getProcessingMemoryInstance_3012Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceEditPart.VISUAL_ID:
			return getStorageMemoryInstance_3013Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceOwnedCacheInstanceEditPart.VISUAL_ID:
			return getProcessorInstanceOwnedCacheInstance_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getResourceInstanceRepository_1000Text(View view) {
		de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstanceRepository domainModelElement = (de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstanceRepository) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getComment();
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSensorInstance_2004Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.SensorInstance_2004,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.SensorInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActuatorInstance_2005Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ActuatorInstance_2005,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ActuatorInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredResourceInstance_2006Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_2006,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StructuredResourceInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCommunicationResource_3008Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.CommunicationResource_3008,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCacheInstance_3009Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.CacheInstance_3009,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.CacheInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProgrammableLogicDeviceInstance_3010Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProgrammableLogicDeviceInstance_3010,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProgrammableLogicDeviceInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessorInstance_3011Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessorInstance_3011,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessorInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessingMemoryInstance_3012Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ProcessingMemoryInstance_3012,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ProcessingMemoryInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStorageMemoryInstance_3013Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StorageMemoryInstance_3013,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.StorageMemoryInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessorInstanceOwnedCacheInstance_4002Text(View view) {
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
		return de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.edit.parts.ResourceInstanceRepositoryEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.HardwareVisualIDRegistry
						.getModelID(view));
	}

}
