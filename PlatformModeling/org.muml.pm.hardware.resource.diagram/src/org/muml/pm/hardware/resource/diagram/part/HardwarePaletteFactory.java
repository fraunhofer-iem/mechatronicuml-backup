package org.muml.pm.hardware.resource.diagram.part;

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
		paletteRoot.add(createCommunicationProtocol3Group());
	}

	/**
	 * Creates "General" palette tool group
	 * @generated
	 */
	private PaletteContainer createGeneral1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				org.muml.pm.hardware.resource.diagram.part.Messages.General1Group_title);
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
				org.muml.pm.hardware.resource.diagram.part.Messages.StructuredResourceandemebeddedResources2Group_title);
		paletteContainer.setId("createStructuredResourceandemebeddedResources2Group"); //$NON-NLS-1$
		paletteContainer.add(createStructuredResource1CreationTool());
		paletteContainer.add(createMemoryResource2CreationTool());
		paletteContainer.add(createCache3CreationTool());
		paletteContainer.add(createProgrammableLogicDevice4CreationTool());
		paletteContainer.add(createProcessor5CreationTool());
		paletteContainer.add(createProcessorOwnedCache6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Communication Protocol" palette tool group
	 * @generated
	 */
	private PaletteContainer createCommunicationProtocol3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				org.muml.pm.hardware.resource.diagram.part.Messages.CommunicationProtocol3Group_title);
		paletteContainer.setId("createCommunicationProtocol3Group"); //$NON-NLS-1$
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
				org.muml.pm.hardware.resource.diagram.part.Messages.Device1CreationTool_title,
				org.muml.pm.hardware.resource.diagram.part.Messages.Device1CreationTool_desc,
				Collections.singletonList(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.Device_2006));
		entry.setId("createDevice1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/device_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/device_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCommunicationResource2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(
				org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationResource_3011);
		types.add(
				org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationResource_3012);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.pm.hardware.resource.diagram.part.Messages.CommunicationResource2CreationTool_title,
				org.muml.pm.hardware.resource.diagram.part.Messages.CommunicationResource2CreationTool_desc,
				types);
		entry.setId("createCommunicationResource2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/port_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/port_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredResource1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.pm.hardware.resource.diagram.part.Messages.StructuredResource1CreationTool_title,
				org.muml.pm.hardware.resource.diagram.part.Messages.StructuredResource1CreationTool_desc,
				Collections.singletonList(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.StructuredResource_2007));
		entry.setId("createStructuredResource1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/box_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/box_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMemoryResource2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.pm.hardware.resource.diagram.part.Messages.MemoryResource2CreationTool_title,
				org.muml.pm.hardware.resource.diagram.part.Messages.MemoryResource2CreationTool_desc,
				Collections.singletonList(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.MemoryResource_3016));
		entry.setId("createMemoryResource2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/memory_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/memory_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCache3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.pm.hardware.resource.diagram.part.Messages.Cache3CreationTool_title,
				org.muml.pm.hardware.resource.diagram.part.Messages.Cache3CreationTool_desc,
				Collections.singletonList(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.Cache_3013));
		entry.setId("createCache3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/memory_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/memory_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProgrammableLogicDevice4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.pm.hardware.resource.diagram.part.Messages.ProgrammableLogicDevice4CreationTool_title,
				org.muml.pm.hardware.resource.diagram.part.Messages.ProgrammableLogicDevice4CreationTool_desc,
				Collections.singletonList(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.ProgrammableLogicDevice_3015));
		entry.setId("createProgrammableLogicDevice4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/pld_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/pld_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessor5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.pm.hardware.resource.diagram.part.Messages.Processor5CreationTool_title,
				org.muml.pm.hardware.resource.diagram.part.Messages.Processor5CreationTool_desc,
				Collections.singletonList(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.Processor_3014));
		entry.setId("createProcessor5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/cpu_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/cpu_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessorOwnedCache6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				org.muml.pm.hardware.resource.diagram.part.Messages.ProcessorOwnedCache6CreationTool_title,
				org.muml.pm.hardware.resource.diagram.part.Messages.ProcessorOwnedCache6CreationTool_desc,
				Collections.singletonList(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.ProcessorOwnedCache_4002));
		entry.setId("createProcessorOwnedCache6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/processorcache.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProtocolRepository1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.pm.hardware.resource.diagram.part.Messages.ProtocolRepository1CreationTool_title,
				null, Collections.singletonList(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.CommunicationProtocolRepository_2008));
		entry.setId("createProtocolRepository1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.resource.diagram/icons/ProtocolRepo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPointPointProtocol2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.pm.hardware.resource.diagram.part.Messages.PointPointProtocol2CreationTool_title,
				null, Collections.singletonList(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.LinkProtocol_3018));
		entry.setId("createPointPointProtocol2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes
				.getImageDescriptor(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.LinkProtocol_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBusProtocol3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				org.muml.pm.hardware.resource.diagram.part.Messages.BusProtocol3CreationTool_title,
				null, Collections.singletonList(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.BusProtocol_3017));
		entry.setId("createBusProtocol3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes
				.getImageDescriptor(
						org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes.BusProtocol_3017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
