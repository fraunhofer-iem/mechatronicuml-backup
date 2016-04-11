package org.muml.pm.hardware.resourceinstance.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.muml.pm.hardware.resourceinstance.diagram.providers.HardwareElementTypes;

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
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Hardware1Group_title);
		paletteContainer.setId("createHardware1Group"); //$NON-NLS-1$
		paletteContainer.add(createStructuredResourceInstance1CreationTool());
		paletteContainer.add(createSensorInstance2CreationTool());
		paletteContainer.add(createActuatorInstance3CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createPortInstance5CreationTool());
		paletteContainer.add(createNetworkConnectorInstance6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredResourceInstance1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StructuredResourceInstance1CreationTool_title,
				Messages.StructuredResourceInstance1CreationTool_desc,
				Collections.singletonList(HardwareElementTypes.StructuredResourceInstance_2009));
		entry.setId("createStructuredResourceInstance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/box_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/box_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSensorInstance2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SensorInstance2CreationTool_title,
				Messages.SensorInstance2CreationTool_desc,
				Collections.singletonList(HardwareElementTypes.SensorInstance_2007));
		entry.setId("createSensorInstance2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/sensor_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/sensor_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActuatorInstance3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ActuatorInstance3CreationTool_title,
				Messages.ActuatorInstance3CreationTool_desc,
				Collections.singletonList(HardwareElementTypes.ActuatorInstance_2008));
		entry.setId("createActuatorInstance3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/actuator_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/actuator_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPortInstance5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PortInstance5CreationTool_title,
				Messages.PortInstance5CreationTool_desc, Collections.singletonList(HardwareElementTypes.HWPort_3017));
		entry.setId("createPortInstance5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/busportInst_small.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ResourceInstanceDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pm.hardware.common/icons/busportInst_large.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNetworkConnectorInstance6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.NetworkConnectorInstance6CreationTool_title, null, null, null) {
		};
		entry.setId("createNetworkConnectorInstance6CreationTool"); //$NON-NLS-1$
		return entry;
	}
}
