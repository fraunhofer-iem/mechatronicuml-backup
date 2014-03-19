package de.uni_paderborn.fujaba.muml.component.diagram.part;

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
		paletteRoot.add(createCoordinationProtocol4Group());
	}

	/**
	 * Creates "Components" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponents1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.Components1Group_title);
		paletteContainer.setId("createComponents1Group"); //$NON-NLS-1$
		paletteContainer.add(createAtomicComponent1CreationTool());
		paletteContainer.add(createStructuredComponent2CreationTool());
		paletteContainer.add(createComponentPart3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Ports" palette tool group
	 * @generated
	 */
	private PaletteContainer createPorts2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.Ports2Group_title);
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
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.Connectors3Group_title);
		paletteContainer.setId("createConnectors3Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.Connectors3Group_desc);
		paletteContainer.add(createAssembly1CreationTool());
		paletteContainer.add(createDelegation2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Coordination Protocol" palette tool group
	 * @generated
	 */
	private PaletteContainer createCoordinationProtocol4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.CoordinationProtocol4Group_title);
		paletteContainer.setId("createCoordinationProtocol4Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.CoordinationProtocol4Group_desc);
		paletteContainer.add(createCoordinationProtocolPart1CreationTool());
		paletteContainer.add(createRefinement2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtomicComponent1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.AtomicComponent1CreationTool_title,
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.AtomicComponent1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.StaticAtomicComponent_2006));
		entry.setId("createAtomicComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/AtomicComponent.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredComponent2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.StructuredComponent2CreationTool_title,
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.StructuredComponent2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.StaticStructuredComponent_2005));
		entry.setId("createStructuredComponent2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/StructuredComponent.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentPart3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.ComponentPart3CreationTool_title,
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.ComponentPart3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.ComponentPart_3012));
		entry.setId("createComponentPart3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ComponentPart.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiscretePort1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.DiscretePort1CreationTool_title,
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.DiscretePort1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.DiscretePort_3010));
		entry.setId("createDiscretePort1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/DiscretePort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContinuousPort2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.ContinuousPort2CreationTool_title,
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.ContinuousPort2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.ContinuousPort_3011));
		entry.setId("createContinuousPort2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ContinuousPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHybridPort3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.HybridPort3CreationTool_title,
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.HybridPort3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.HybridPort_3013));
		entry.setId("createHybridPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/HybridPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssembly1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.Assembly1CreationTool_title,
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.Assembly1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.AssemblyConnector_4001));
		entry.setId("createAssembly1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegation2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.Delegation2CreationTool_title,
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.Delegation2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.DelegationConnector_4002));
		entry.setId("createDelegation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Delegation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCoordinationProtocolPart1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.CoordinationProtocolPart1CreationTool_title,
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.CoordinationProtocolPart1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.CoordinationProtocolPart_3016));
		entry.setId("createCoordinationProtocolPart1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/CoordinationProtocol.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRefinement2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.Refinement2CreationTool_title,
				de.uni_paderborn.fujaba.muml.component.diagram.part.Messages.Refinement2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.component.diagram.providers.MumlElementTypes.PortPartCoordinationProtocolPart_4004));
		entry.setId("createRefinement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Refinement.gif")); //$NON-NLS-1$
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
