package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part;

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
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.ComponentStoryDiagram1Group_title);
		paletteContainer.setId("createComponentStoryDiagram1Group"); //$NON-NLS-1$
		paletteContainer.add(createActivity1CreationTool());
		paletteContainer.add(createComponentStoryNode2CreationTool());
		paletteContainer.add(createControllerExchangeNode3CreationTool());
		paletteContainer.add(createFadingFunction4CreationTool());
		paletteContainer.add(createActivityEdge5CreationTool());
		paletteContainer.add(createInitialNode6CreationTool());
		paletteContainer.add(createJunctionNode7CreationTool());
		paletteContainer.add(createActivityFinalNode8CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Component Story Pattern" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponentStoryPattern2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.ComponentStoryPattern2Group_title);
		paletteContainer.setId("createComponentStoryPattern2Group"); //$NON-NLS-1$
		paletteContainer.add(createPartVariable1CreationTool());
		paletteContainer.add(createSinglePortVariable2CreationTool());
		paletteContainer.add(createMultiPortVariable3CreationTool());
		paletteContainer.add(createAssemblyVariable4CreationTool());
		paletteContainer.add(createDelegationVariable5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivity1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.Activity1CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.Activity1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.Activity_2003));
		entry.setId("createActivity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.Activity_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentStoryNode2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.ComponentStoryNode2CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.ComponentStoryNode2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ComponentStoryNode_3001));
		entry.setId("createComponentStoryNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram/icons/obj16/ComponentStoryDiagramFile.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControllerExchangeNode3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.ControllerExchangeNode3CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.ControllerExchangeNode3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ControllerExchangeNode_3021));
		entry.setId("createControllerExchangeNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram/icons/obj16/ComponentStoryDiagramFile.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFadingFunction4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.FadingFunction4CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.FadingFunction4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.FadingFunction_3023));
		entry.setId("createFadingFunction4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram/icons/obj16/ComponentStoryDiagramFile.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityEdge5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.ActivityEdge5CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.ActivityEdge5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001));
		entry.setId("createActivityEdge5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityEdge_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitialNode6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.InitialNode6CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.InitialNode6CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.InitialNode_3007));
		entry.setId("createInitialNode6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.InitialNode_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJunctionNode7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.JunctionNode7CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.JunctionNode7CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.JunctionNode_3008));
		entry.setId("createJunctionNode7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.JunctionNode_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityFinalNode8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.ActivityFinalNode8CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.ActivityFinalNode8CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityFinalNode_3010));
		entry.setId("createActivityFinalNode8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.ActivityFinalNode_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPartVariable1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.PartVariable1CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.PartVariable1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.PartVariable_3014));
		entry.setId("createPartVariable1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ComponentPart.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSinglePortVariable2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3017);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3018);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.SinglePortVariable_3020);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.SinglePortVariable2CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.SinglePortVariable2CreationTool_desc,
				types);
		entry.setId("createSinglePortVariable2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Port.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiPortVariable3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3016);
		types.add(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.MultiPortVariable_3019);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.MultiPortVariable3CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.MultiPortVariable3CreationTool_desc,
				types);
		entry.setId("createMultiPortVariable3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Port.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssemblyVariable4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.AssemblyVariable4CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.AssemblyVariable4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.AssemblyVariable_4004));
		entry.setId("createAssemblyVariable4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegationVariable5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.DelegationVariable5CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.Messages.DelegationVariable5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.providers.ComponentStoryDiagramElementTypes.DelegationVariable_4005));
		entry.setId("createDelegationVariable5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Delegation.gif")); //$NON-NLS-1$
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
