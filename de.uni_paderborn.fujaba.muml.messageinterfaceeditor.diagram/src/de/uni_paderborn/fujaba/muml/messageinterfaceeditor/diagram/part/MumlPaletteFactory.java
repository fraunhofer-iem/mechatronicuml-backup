package de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteRoot.add(createMessageinterfaceeditor1Group());
	}

	/**
	 * Creates "messageinterfaceeditor" palette tool group
	 * @generated
	 */
	private PaletteContainer createMessageinterfaceeditor1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.Messages.Messageinterfaceeditor1Group_title);
		paletteContainer.setId("createMessageinterfaceeditor1Group"); //$NON-NLS-1$
		paletteContainer.add(createMessageTypeRepository1CreationTool());
		paletteContainer.add(createMessageType2CreationTool());
		paletteContainer.add(createParameter3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageTypeRepository1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.Messages.MessageTypeRepository1CreationTool_title,
				de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.Messages.MessageTypeRepository1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.MessageTypeRepository_2007));
		entry.setId("createMessageTypeRepository1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.MessageTypeDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.custom/icons/MessageInterface.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageType2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.Messages.MessageType2CreationTool_title,
				de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.Messages.MessageType2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.MessageType_3007));
		entry.setId("createMessageType2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.MessageType_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParameter3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.Messages.Parameter3CreationTool_title,
				de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.part.Messages.Parameter3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.Parameter_3008));
		entry.setId("createParameter3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.messageinterfaceeditor.diagram.providers.MumlElementTypes.Parameter_3008));
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
}
