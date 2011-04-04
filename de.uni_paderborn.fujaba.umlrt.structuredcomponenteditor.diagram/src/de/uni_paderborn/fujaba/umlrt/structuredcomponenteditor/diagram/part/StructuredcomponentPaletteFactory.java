package de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part;

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
public class StructuredcomponentPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createComponenteditor1Group());
	}

	/**
	 * Creates "componenteditor" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponenteditor1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.Messages.Componenteditor1Group_title);
		paletteContainer.setId("createComponenteditor1Group"); //$NON-NLS-1$
		paletteContainer.add(createStructuredComponent1CreationTool());
		paletteContainer.add(createComponentPart2CreationTool());
		paletteContainer.add(createPort3CreationTool());
		paletteContainer.add(createDelegation4CreationTool());
		paletteContainer.add(createAssembly5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredComponent1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.Messages.StructuredComponent1CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.Messages.StructuredComponent1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes.StructuredComponent_2001));
		entry.setId("createStructuredComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor/icons/StructuredComponent.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentPart2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.Messages.ComponentPart2CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.Messages.ComponentPart2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes.ComponentPart_3002));
		entry.setId("createComponentPart2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor/icons/ComponentPart.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPort3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.Messages.Port3CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.Messages.Port3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes.Port_3001));
		entry.setId("createPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor/icons/Port.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegation4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.Messages.Delegation4CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.Messages.Delegation4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes.Delegation_4001));
		entry.setId("createDelegation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor/icons/Delegation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssembly5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.Messages.Assembly5CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.Messages.Assembly5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes.Assembly_4002));
		entry.setId("createAssembly5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.umlrt.structuredcomponenteditor/icons/Assembly.gif")); //$NON-NLS-1$
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
