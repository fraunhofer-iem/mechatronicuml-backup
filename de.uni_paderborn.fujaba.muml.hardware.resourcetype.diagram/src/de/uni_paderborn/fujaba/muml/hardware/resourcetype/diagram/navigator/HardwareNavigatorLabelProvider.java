package de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator;

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
		de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorItem
				&& !isOwnView(((de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorItem) element)
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
		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorGroup group = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorGroup) element;
			return de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorItem) {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ResourceTypeRepositoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.fujaba.de/muml/hardware/resourcetype/1.0/?ResourceTypeRepository", de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.ResourceTypeRepository_1000); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/hardware/resourcetype/1.0/?Device", de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.Device_2005); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.fujaba.de/muml/hardware/resourcetype/1.0/?StructuredResource", de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.StructuredResource_2007); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/resourcetype/1.0/?HWPort", de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.HWPort_3001); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/resourcetype/1.0/?Cache", de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.Cache_3002); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/resourcetype/1.0/?Processor", de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.Processor_3003); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/resourcetype/1.0/?ProgrammableLogicDevice", de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.ProgrammableLogicDevice_3004); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.fujaba.de/muml/hardware/resourcetype/1.0/?MemoryResource", de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.MemoryResource_3005); //$NON-NLS-1$
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorOwnedCacheEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.fujaba.de/muml/hardware/resourcetype/1.0/?Processor?ownedCache", de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.ProcessorOwnedCache_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes
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
		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorGroup) {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorGroup group = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorItem) {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorItem navigatorItem = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.navigator.HardwareNavigatorItem) element;
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
		switch (de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ResourceTypeRepositoryEditPart.VISUAL_ID:
			return getResourceTypeRepository_1000Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getDevice_2005Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceEditPart.VISUAL_ID:
			return getStructuredResource_2007Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortEditPart.VISUAL_ID:
			return getHWPort_3001Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.CacheEditPart.VISUAL_ID:
			return getCache_3002Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorEditPart.VISUAL_ID:
			return getProcessor_3003Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProgrammableLogicDeviceEditPart.VISUAL_ID:
			return getProgrammableLogicDevice_3004Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceEditPart.VISUAL_ID:
			return getMemoryResource_3005Text(view);
		case de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProcessorOwnedCacheEditPart.VISUAL_ID:
			return getProcessorOwnedCache_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getResourceTypeRepository_1000Text(View view) {
		de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository domainModelElement = (de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDevice_2005Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.Device_2005,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.DeviceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredResource_2007Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.StructuredResource_2007,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.StructuredResourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWPort_3001Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.HWPort_3001,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.HWPortLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCache_3002Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.Cache_3002,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.CacheNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessor_3003Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.Processor_3003,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProgrammableLogicDevice_3004Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.ProgrammableLogicDevice_3004,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ProgrammableLogicDeviceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMemoryResource_3005Text(View view) {
		IParser parser = de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareParserProvider
				.getParser(
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.MemoryResource_3005,
						view.getElement() != null ? view.getElement() : view,
						de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
								.getType(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.MemoryResourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessorOwnedCache_4001Text(View view) {
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
		return de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.edit.parts.ResourceTypeRepositoryEditPart.MODEL_ID
				.equals(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareVisualIDRegistry
						.getModelID(view));
	}

}
