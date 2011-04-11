package de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part;

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
public class ComponentinstanceconfigurationPaletteFactory {

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
				de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.Messages.Componentinstanceconfiguration1Group_title);
		paletteContainer.setId("createComponentinstanceconfiguration1Group"); //$NON-NLS-1$
		paletteContainer.add(createComponentInstance1CreationTool());
		paletteContainer.add(createAssemblyInstance2CreationTool());
		paletteContainer.add(createPort3CreationTool());
		paletteContainer.add(createDelegationInstance4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentInstance1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.ComponentInstance_2002);
		types.add(de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.ComponentInstance_3002);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.Messages.ComponentInstance1CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.Messages.ComponentInstance1CreationTool_desc,
				types);
		entry.setId("createComponentInstance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.common/icons/ComponentInstance.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssemblyInstance2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.Messages.AssemblyInstance2CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.Messages.AssemblyInstance2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.AssemblyInstance_4001));
		entry.setId("createAssemblyInstance2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPort3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.Messages.Port3CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.Messages.Port3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.PortInstance_3001));
		entry.setId("createPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.common/icons/Port.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegationInstance4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.Messages.DelegationInstance4CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.Messages.DelegationInstance4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.providers.ComponentinstanceconfigurationElementTypes.DelegationInstance_4002));
		entry.setId("createDelegationInstance4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.componentinstanceconfiguration.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.common/icons/Delegation.gif")); //$NON-NLS-1$
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
