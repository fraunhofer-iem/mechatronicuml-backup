package de.uni_paderborn.fujaba.muml.deployment.diagram.part;

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
public class AllocationPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDeployment1Group());
	}

	/**
	 * Creates "Deployment" palette tool group
	 * @generated
	 */
	private PaletteContainer createDeployment1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.deployment.diagram.part.Messages.Deployment1Group_title);
		paletteContainer.setId("createDeployment1Group"); //$NON-NLS-1$
		paletteContainer.add(createHardwareNode1CreationTool());
		paletteContainer.add(createHardwarePort2CreationTool());
		paletteContainer.add(createCommunicationLink3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHardwareNode1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.deployment.diagram.part.Messages.HardwareNode1CreationTool_title,
				de.uni_paderborn.fujaba.muml.deployment.diagram.part.Messages.HardwareNode1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes.HardwareNode_2003));
		entry.setId("createHardwareNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.deployment.diagram/icons/obj16/HardwareNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHardwarePort2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.deployment.diagram.part.Messages.HardwarePort2CreationTool_title,
				de.uni_paderborn.fujaba.muml.deployment.diagram.part.Messages.HardwarePort2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes.HardwarePort_3003));
		entry.setId("createHardwarePort2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.deployment.diagram/icons/obj16/HardwarePort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCommunicationLink3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.deployment.diagram.part.Messages.CommunicationLink3CreationTool_title,
				de.uni_paderborn.fujaba.muml.deployment.diagram.part.Messages.CommunicationLink3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.deployment.diagram.providers.AllocationElementTypes.CommunicationLink_4003));
		entry.setId("createCommunicationLink3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.deployment.diagram.part.AllocationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.deployment.diagram/icons/obj16/CommunicationLink.gif")); //$NON-NLS-1$
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
