package org.muml.pim.messagetype.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.muml.pim.messagetype.diagram.providers.MumlElementTypes;

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
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Messageinterfaceeditor1Group_title);
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MessageTypeRepository1CreationTool_title,
				Messages.MessageTypeRepository1CreationTool_desc,
				Collections.singletonList(MumlElementTypes.MessageTypeRepository_2008));
		entry.setId("createMessageTypeRepository1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MessageTypeDiagramEditorPlugin
				.findImageDescriptor("/org.muml.pim.messagetype.diagram.custom/icons/MessageInterface.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageType2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MessageType2CreationTool_title,
				Messages.MessageType2CreationTool_desc, Collections.singletonList(MumlElementTypes.MessageType_3007));
		entry.setId("createMessageType2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MumlElementTypes.getImageDescriptor(MumlElementTypes.MessageType_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParameter3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Parameter3CreationTool_title,
				Messages.Parameter3CreationTool_desc, Collections.singletonList(MumlElementTypes.Parameter_3009));
		entry.setId("createParameter3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MumlElementTypes.getImageDescriptor(MumlElementTypes.Parameter_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
