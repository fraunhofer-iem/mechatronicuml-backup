package de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part;

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
public class UmlrtPaletteFactory {

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
				de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.Messages.Componenteditor1Group_title);
		paletteContainer.setId("createComponenteditor1Group"); //$NON-NLS-1$
		paletteContainer.add(createAtomicComponent1CreationTool());
		paletteContainer.add(createPort2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtomicComponent1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.Messages.AtomicComponent1CreationTool_title,
				de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.Messages.AtomicComponent1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.UmlrtElementTypes.AtomicComponent_2001));
		entry.setId("createAtomicComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/AtomicComponent.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPort2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.Messages.Port2CreationTool_title,
				de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.Messages.Port2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.providers.UmlrtElementTypes.Port_3001));
		entry.setId("createPort2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.atomiccomponenteditor.diagram.part.AtomiccomponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Port.gif")); //$NON-NLS-1$
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
