package de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteRoot.add(createHardware1Group());
	}

	/**
	 * Creates "hardware" palette tool group
	 * @generated
	 */
	private PaletteContainer createHardware1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.Messages.Hardware1Group_title);
		paletteContainer.setId("createHardware1Group"); //$NON-NLS-1$
		paletteContainer.add(createStructuredResourceInstance1CreationTool());
		paletteContainer.add(createSensorInstance2CreationTool());
		paletteContainer.add(createActuatorInstance3CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createBusPortInstance5CreationTool());
		paletteContainer.add(createLinkPortInstance6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredResourceInstance1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.Messages.StructuredResourceInstance1CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.Messages.StructuredResourceInstance1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.StructuredResourceInstance_2003));
		entry.setId("createStructuredResourceInstance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/box_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/box_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSensorInstance2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.Messages.SensorInstance2CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.Messages.SensorInstance2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.SensorInstance_2001));
		entry.setId("createSensorInstance2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/sensor_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/sensor_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActuatorInstance3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.Messages.ActuatorInstance3CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.Messages.ActuatorInstance3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.ActuatorInstance_2002));
		entry.setId("createActuatorInstance3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/actuator_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/actuator_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBusPortInstance5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.Messages.BusPortInstance5CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.Messages.BusPortInstance5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.BusPortInstance_3001));
		entry.setId("createBusPortInstance5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/busportInst_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/busportInst_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkPortInstance6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.Messages.LinkPortInstance6CreationTool_title,
				de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.Messages.LinkPortInstance6CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.providers.HardwareElementTypes.LinkPortInstance_3002));
		entry.setId("createLinkPortInstance6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/linkportInst_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram.part.ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.hardware.common/icons/linkportInst_large.gif")); //$NON-NLS-1$
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
}
