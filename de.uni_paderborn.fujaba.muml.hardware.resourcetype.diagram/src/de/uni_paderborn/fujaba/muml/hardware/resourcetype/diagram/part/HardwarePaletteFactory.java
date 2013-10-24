package de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class HardwarePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createResourceType1Group());
		paletteRoot.add(createAtomicResources2Group());
	}

	/**
	 * Creates "ResourceType" palette tool group
	 * @generated
	 */
	private PaletteContainer createResourceType1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.ResourceType1Group_title);
		paletteContainer.setId("createResourceType1Group"); //$NON-NLS-1$
		paletteContainer.add(createDevice1CreationTool());
		paletteContainer.add(createStructuredResource2CreationTool());
		paletteContainer.add(createHWPort3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "AtomicResources" palette tool group
	 * @generated
	 */
	private PaletteContainer createAtomicResources2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.AtomicResources2Group_title);
		paletteContainer.setId("createAtomicResources2Group"); //$NON-NLS-1$
		paletteContainer.add(createMemoryResource1CreationTool());
		paletteContainer.add(createCache2CreationTool());
		paletteContainer.add(createProgrammableLogicDevice3CreationTool());
		paletteContainer.add(createProcessor4CreationTool());
		paletteContainer.add(createProcessorOwnedCache5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDevice1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.Device1CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.Device1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.Device_2005));
		entry.setId("createDevice1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/device_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/device_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredResource2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.StructuredResource2CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.StructuredResource2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.StructuredResource_2007));
		entry.setId("createStructuredResource2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/box_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/box_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHWPort3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.HWPort3CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.HWPort3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.HWPort_3001));
		entry.setId("createHWPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/port_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/port_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMemoryResource1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.MemoryResource1CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.MemoryResource1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.MemoryResource_3005));
		entry.setId("createMemoryResource1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/memory_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/memory_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCache2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.Cache2CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.Cache2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.Cache_3002));
		entry.setId("createCache2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/memory_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/memory_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProgrammableLogicDevice3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.ProgrammableLogicDevice3CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.ProgrammableLogicDevice3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.ProgrammableLogicDevice_3004));
		entry.setId("createProgrammableLogicDevice3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/pld_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/pld_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessor4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.Processor4CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.Processor4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.Processor_3003));
		entry.setId("createProcessor4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/cpu_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/cpu_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessorOwnedCache5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.ProcessorOwnedCache5CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.Messages.ProcessorOwnedCache5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.providers.HardwareElementTypes.ProcessorOwnedCache_4001));
		entry.setId("createProcessorOwnedCache5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resourcetype.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/processorcache.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
