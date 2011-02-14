package structuredcomponenteditor.diagram.part;

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

import structuredcomponenteditor.diagram.providers.StructuredcomponentElementTypes;

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
				Messages.Componenteditor1Group_title);
		paletteContainer.setId("createComponenteditor1Group"); //$NON-NLS-1$
		paletteContainer.add(createComponent1CreationTool());
		paletteContainer.add(createComponentPart2CreationTool());
		paletteContainer.add(createPort3CreationTool());
		paletteContainer.add(createDelegation4CreationTool());
		paletteContainer.add(createAssembly5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Component1CreationTool_title,
				Messages.Component1CreationTool_desc,
				Collections
						.singletonList(StructuredcomponentElementTypes.StructuredComponent_2001));
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StructuredcomponentElementTypes
				.getImageDescriptor(StructuredcomponentElementTypes.StructuredComponent_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentPart2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ComponentPart2CreationTool_title,
				Messages.ComponentPart2CreationTool_desc,
				Collections
						.singletonList(StructuredcomponentElementTypes.ComponentPart_3002));
		entry.setId("createComponentPart2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StructuredcomponentElementTypes
				.getImageDescriptor(StructuredcomponentElementTypes.ComponentPart_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPort3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StructuredcomponentElementTypes.Port_3001);
		types.add(StructuredcomponentElementTypes.Port_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Port3CreationTool_title,
				Messages.Port3CreationTool_desc, types);
		entry.setId("createPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StructuredcomponentElementTypes
				.getImageDescriptor(StructuredcomponentElementTypes.Port_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegation4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Delegation4CreationTool_title,
				Messages.Delegation4CreationTool_desc,
				Collections
						.singletonList(StructuredcomponentElementTypes.Delegation_4001));
		entry.setId("createDelegation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StructuredcomponentElementTypes
				.getImageDescriptor(StructuredcomponentElementTypes.Delegation_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssembly5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Assembly5CreationTool_title,
				Messages.Assembly5CreationTool_desc,
				Collections
						.singletonList(StructuredcomponentElementTypes.Assembly_4002));
		entry.setId("createAssembly5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StructuredcomponentElementTypes
				.getImageDescriptor(StructuredcomponentElementTypes.Assembly_4002));
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
