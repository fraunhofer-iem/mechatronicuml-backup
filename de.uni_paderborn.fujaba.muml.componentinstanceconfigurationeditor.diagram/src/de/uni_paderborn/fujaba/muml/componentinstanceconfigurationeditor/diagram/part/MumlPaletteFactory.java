package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MumlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createComponentinstanceconfiguration1Group());
	}

	/**
	 * Creates "componentinstanceconfiguration" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponentinstanceconfiguration1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.Componentinstanceconfiguration1Group_title);
		paletteContainer.setId("createComponentinstanceconfiguration1Group"); //$NON-NLS-1$
		paletteContainer.add(createComponentInstance1CreationTool());
		paletteContainer.add(createAssemblyInstance2CreationTool());
		paletteContainer.add(createDelegationInstance3CreationTool());
		paletteContainer.add(createDiscreteSinglePortInstance4CreationTool());
		paletteContainer.add(createHardwarePortInstance5CreationTool());
		paletteContainer.add(createContinuousPortInstance6CreationTool());
		paletteContainer.add(createHybirdPortInstance7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentInstance1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.ComponentInstance1CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.ComponentInstance1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ComponentInstance_2004));
		entry.setId("createComponentInstance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ComponentInstance.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssemblyInstance2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.AssemblyInstance2CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.AssemblyInstance2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AssemblyInstance_4003));
		entry.setId("createAssemblyInstance2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegationInstance3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DelegationInstance3CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DelegationInstance3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DelegationInstance_4004));
		entry.setId("createDelegationInstance3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiscreteSinglePortInstance4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DiscreteSinglePortInstance4CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DiscreteSinglePortInstance4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3010));
		entry.setId("createDiscreteSinglePortInstance4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/DiscretePort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHardwarePortInstance5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.HardwarePortInstance5CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.HardwarePortInstance5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.HardwarePortIstance_3008));
		entry.setId("createHardwarePortInstance5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/HardwarePort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContinuousPortInstance6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.ContinuousPortInstance6CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.ContinuousPortInstance6CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ContinuousPortInstance_3011));
		entry.setId("createContinuousPortInstance6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ContinuousPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHybirdPortInstance7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.HybirdPortInstance7CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.HybirdPortInstance7CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.HybridPortInstance_3012));
		entry.setId("createHybirdPortInstance7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/HybridPort.gif")); //$NON-NLS-1$
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
