package de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part;

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
public class MumlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createComponents1Group());
		paletteRoot.add(createPorts2Group());
		paletteRoot.add(createConnectors3Group());
	}

	/**
	 * Creates "Components" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponents1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.Components1Group_title);
		paletteContainer.setId("createComponents1Group"); //$NON-NLS-1$
		paletteContainer.add(createStructuredComponent1CreationTool());
		paletteContainer.add(createComponentPart2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Ports" palette tool group
	 * @generated
	 */
	private PaletteContainer createPorts2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.Ports2Group_title);
		paletteContainer.setId("createPorts2Group"); //$NON-NLS-1$
		paletteContainer.add(createDiscretePort1CreationTool());
		paletteContainer.add(createContinuousPort2CreationTool());
		paletteContainer.add(createHybridPort3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connectors" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnectors3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.Connectors3Group_title);
		paletteContainer.setId("createConnectors3Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.Connectors3Group_desc);
		paletteContainer.add(createAssembly1CreationTool());
		paletteContainer.add(createDelegation2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredComponent1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.StructuredComponent1CreationTool_title,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.StructuredComponent1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.StructuredComponent_2004));
		entry.setId("createStructuredComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/StructuredComponent.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentPart2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.ComponentPart2CreationTool_title,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.ComponentPart2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.ComponentPart_3012));
		entry.setId("createComponentPart2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ComponentPart.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiscretePort1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.DiscretePort_3010);
		types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.DiscretePort_3014);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.DiscretePort1CreationTool_title,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.DiscretePort1CreationTool_desc,
				types);
		entry.setId("createDiscretePort1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/DiscretePort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContinuousPort2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.ContinuousPort_3011);
		types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.ContinuousPort_3015);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.ContinuousPort2CreationTool_title,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.ContinuousPort2CreationTool_desc,
				types);
		entry.setId("createContinuousPort2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ContinuousPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHybridPort3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.HybridPort_3009);
		types.add(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.HybridPort_3013);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.HybridPort3CreationTool_title,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.HybridPort3CreationTool_desc,
				types);
		entry.setId("createHybridPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/HybridPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssembly1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.Assembly1CreationTool_title,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.Assembly1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Assembly_4004));
		entry.setId("createAssembly1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegation2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.Delegation2CreationTool_title,
				de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.Messages.Delegation2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.providers.MumlElementTypes.Delegation_4003));
		entry.setId("createDelegation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.structuredcomponenteditor.diagram.part.StructuredcomponentDiagramEditorPlugin
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
