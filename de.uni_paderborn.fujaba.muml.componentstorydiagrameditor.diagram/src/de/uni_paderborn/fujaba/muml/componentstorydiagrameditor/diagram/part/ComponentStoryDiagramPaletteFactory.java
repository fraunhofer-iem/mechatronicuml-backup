package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ComponentStoryDiagramPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createComponentStoryDiagram1Group());
		paletteRoot.add(createComponentStoryPattern2Group());
	}

	/**
	 * Creates "Component Story Diagram" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponentStoryDiagram1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.ComponentStoryDiagram1Group_title);
		paletteContainer.setId("createComponentStoryDiagram1Group"); //$NON-NLS-1$
		paletteContainer.add(createActivity1CreationTool());
		paletteContainer.add(createComponentStoryNode2CreationTool());
		paletteContainer.add(createActivityEdge3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Component Story Pattern" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponentStoryPattern2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.ComponentStoryPattern2Group_title);
		paletteContainer.setId("createComponentStoryPattern2Group"); //$NON-NLS-1$
		paletteContainer.add(createComponentVariable1CreationTool());
		paletteContainer.add(createPortVariable2CreationTool());
		paletteContainer.add(createPartVariable3CreationTool());
		paletteContainer.add(createAssemblyVariable4CreationTool());
		paletteContainer.add(createDelegationVariable5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivity1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.Activity1CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.Activity1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.Activity_2003));
		entry.setId("createActivity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.Activity_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentStoryNode2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.ComponentStoryNode2CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.ComponentStoryNode2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryNode_3001));
		entry.setId("createComponentStoryNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryNode_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityEdge3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.ActivityEdge3CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.ActivityEdge3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001));
		entry.setId("createActivityEdge3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentVariable1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.ComponentVariable1CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.ComponentVariable1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ComponentVariable_3003));
		entry.setId("createComponentVariable1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.ComponentVariable_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPortVariable2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.PortVariable_3004);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.PortVariable_3006);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.PortVariable2CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.PortVariable2CreationTool_desc,
				types);
		entry.setId("createPortVariable2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.PortVariable_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPartVariable3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.PartVariable3CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.PartVariable3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.PartVariable_3005));
		entry.setId("createPartVariable3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.PartVariable_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssemblyVariable4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.AssemblyVariable4CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.AssemblyVariable4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4002));
		entry.setId("createAssemblyVariable4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegationVariable5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.DelegationVariable5CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.part.Messages.DelegationVariable5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4003));
		entry.setId("createDelegationVariable5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4003));
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
