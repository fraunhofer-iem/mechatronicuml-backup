package de.uni_paderborn.fujaba.muml.messagetype.diagram.part;

import java.util.Collections;

import java.util.List;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

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
				de.uni_paderborn.fujaba.muml.messagetype.diagram.part.Messages.Messageinterfaceeditor1Group_title);
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.messagetype.diagram.part.Messages.MessageTypeRepository1CreationTool_title,
				de.uni_paderborn.fujaba.muml.messagetype.diagram.part.Messages.MessageTypeRepository1CreationTool_desc,
				Collections.singletonList(
						de.uni_paderborn.fujaba.muml.messagetype.diagram.providers.MumlElementTypes.MessageTypeRepository_2008));
		entry.setId("createMessageTypeRepository1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MessageTypeDiagramEditorPlugin
				.findImageDescriptor(
						"/de.uni_paderborn.fujaba.muml.messagetype.diagram.custom/icons/MessageInterface.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageType2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.messagetype.diagram.part.Messages.MessageType2CreationTool_title,
				de.uni_paderborn.fujaba.muml.messagetype.diagram.part.Messages.MessageType2CreationTool_desc,
				Collections.singletonList(
						de.uni_paderborn.fujaba.muml.messagetype.diagram.providers.MumlElementTypes.MessageType_3007));
		entry.setId("createMessageType2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				de.uni_paderborn.fujaba.muml.messagetype.diagram.providers.MumlElementTypes.getImageDescriptor(
						de.uni_paderborn.fujaba.muml.messagetype.diagram.providers.MumlElementTypes.MessageType_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParameter3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.messagetype.diagram.part.Messages.Parameter3CreationTool_title,
				de.uni_paderborn.fujaba.muml.messagetype.diagram.part.Messages.Parameter3CreationTool_desc,
				Collections.singletonList(
						de.uni_paderborn.fujaba.muml.messagetype.diagram.providers.MumlElementTypes.Parameter_3009));
		entry.setId("createParameter3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				de.uni_paderborn.fujaba.muml.messagetype.diagram.providers.MumlElementTypes.getImageDescriptor(
						de.uni_paderborn.fujaba.muml.messagetype.diagram.providers.MumlElementTypes.Parameter_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
