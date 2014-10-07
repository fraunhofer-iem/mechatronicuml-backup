package de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part;

import java.util.ArrayList;
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
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class HardwarePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGeneral1Group());
		paletteRoot.add(createStructuredResourceandemebeddedResources2Group());
		paletteRoot.add(createCommunicationMedia3Group());
		paletteRoot.add(createCommunicationProtocol4Group());
	}

	/**
	 * Creates "General" palette tool group
	 * @generated
	 */
	private PaletteContainer createGeneral1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.General1Group_title);
		paletteContainer.setId("createGeneral1Group"); //$NON-NLS-1$
		paletteContainer.add(createDevice1CreationTool());
		paletteContainer.add(createCommunicationResource2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "StructuredResource and emebedded Resources" palette tool group
	 * @generated
	 */
	private PaletteContainer createStructuredResourceandemebeddedResources2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.StructuredResourceandemebeddedResources2Group_title);
		paletteContainer
				.setId("createStructuredResourceandemebeddedResources2Group"); //$NON-NLS-1$
		paletteContainer.add(createStructuredResource1CreationTool());
		paletteContainer.add(createMemoryResource2CreationTool());
		paletteContainer.add(createCache3CreationTool());
		paletteContainer.add(createProgrammableLogicDevice4CreationTool());
		paletteContainer.add(createProcessor5CreationTool());
		paletteContainer.add(createProcessorOwnedCache6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "CommunicationMedia" palette tool group
	 * @generated
	 */
	private PaletteContainer createCommunicationMedia3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.CommunicationMedia3Group_title);
		paletteContainer.setId("createCommunicationMedia3Group"); //$NON-NLS-1$
		paletteContainer.add(createBusResource1CreationTool());
		paletteContainer.add(createLinkResource2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "CommunicationProtocol" palette tool group
	 * @generated
	 */
	private PaletteContainer createCommunicationProtocol4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.CommunicationProtocol4Group_title);
		paletteContainer.setId("createCommunicationProtocol4Group"); //$NON-NLS-1$
		paletteContainer.add(createProtocolRepository1CreationTool());
		paletteContainer.add(createPointPointProtocol2CreationTool());
		paletteContainer.add(createBusProtocol3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDevice1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.Device1CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.Device1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.Device_2001));
		entry.setId("createDevice1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/device_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/device_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCommunicationResource2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationResource_3001);
		types.add(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationResource_3008);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.CommunicationResource2CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.CommunicationResource2CreationTool_desc,
				types);
		entry.setId("createCommunicationResource2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/port_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/port_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredResource1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.StructuredResource1CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.StructuredResource1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.StructuredResource_2002));
		entry.setId("createStructuredResource1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/box_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/box_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMemoryResource2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.MemoryResource2CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.MemoryResource2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.MemoryResource_3005));
		entry.setId("createMemoryResource2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/memory_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/memory_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCache3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.Cache3CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.Cache3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.Cache_3002));
		entry.setId("createCache3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/memory_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/memory_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProgrammableLogicDevice4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.ProgrammableLogicDevice4CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.ProgrammableLogicDevice4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.ProgrammableLogicDevice_3004));
		entry.setId("createProgrammableLogicDevice4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/pld_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/pld_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessor5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.Processor5CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.Processor5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.Processor_3003));
		entry.setId("createProcessor5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/cpu_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/cpu_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessorOwnedCache6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.ProcessorOwnedCache6CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.ProcessorOwnedCache6CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.ProcessorOwnedCache_4001));
		entry.setId("createProcessorOwnedCache6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/processorcache.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBusResource1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.BusResource1CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.BusResource1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.Bus_2003));
		entry.setId("createBusResource1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/bus_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/bus_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkResource2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.LinkResource2CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.LinkResource2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.Link_2004));
		entry.setId("createLinkResource2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/link_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/link_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProtocolRepository1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.ProtocolRepository1CreationTool_title,
				null,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationProtocolRepository_2005));
		entry.setId("createProtocolRepository1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.resource.diagram/icons/ProtocolRepo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPointPointProtocol2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.PointPointProtocol2CreationTool_title,
				null,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.LinkProtocol_3007));
		entry.setId("createPointPointProtocol2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.LinkProtocol_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBusProtocol3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resource.diagram.part.Messages.BusProtocol3CreationTool_title,
				null,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.BusProtocol_3006));
		entry.setId("createBusProtocol3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.hardware.resource.diagram.providers.HardwareElementTypes.BusProtocol_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
