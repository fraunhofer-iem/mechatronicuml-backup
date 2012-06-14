package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part;

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

/**
 * @generated
 */
public class MumlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createComponentinstanceconfiguration1Group());
	}

	/**
	 * Creates "componentinstanceconfiguration" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponentinstanceconfiguration1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.Componentinstanceconfiguration1Group_title);
		paletteContainer.setId("createComponentinstanceconfiguration1Group"); //$NON-NLS-1$
		paletteContainer.add(createAtomicComponentInstance1CreationTool());
		paletteContainer.add(createStructuredComponentInstance2CreationTool());
		paletteContainer.add(createAssemblyInstance3CreationTool());
		paletteContainer.add(createDelegationInstance4CreationTool());
		paletteContainer.add(createDiscreteSinglePortInstance5CreationTool());
		paletteContainer.add(createDiscreteMultiPortInstance6CreationTool());
		paletteContainer.add(createContinuousPortInstance7CreationTool());
		paletteContainer.add(createHybridPortInstance8CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtomicComponentInstance1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AtomicComponentInstance_2016);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AtomicComponentInstance_3024);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.AtomicComponentInstance1CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.AtomicComponentInstance1CreationTool_desc,
				types);
		entry.setId("createAtomicComponentInstance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ComponentInstance.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredComponentInstance2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.StructuredComponentInstance_2015);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.StructuredComponentInstance_3025);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.StructuredComponentInstance2CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.StructuredComponentInstance2CreationTool_desc,
				types);
		entry.setId("createStructuredComponentInstance2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ComponentInstance.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssemblyInstance3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.AssemblyInstance3CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.AssemblyInstance3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AssemblyInstance_4005));
		entry.setId("createAssemblyInstance3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegationInstance4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DelegationInstance4CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DelegationInstance4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DelegationInstance_4006));
		entry.setId("createDelegationInstance4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/Assembly.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiscreteSinglePortInstance5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_2012);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3021);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3019);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DiscreteSinglePortInstance5CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DiscreteSinglePortInstance5CreationTool_desc,
				types);
		entry.setId("createDiscreteSinglePortInstance5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/DiscretePort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiscreteMultiPortInstance6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_2013);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_3020);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DiscreteMultiPortInstance6CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.DiscreteMultiPortInstance6CreationTool_desc,
				types);
		entry.setId("createDiscreteMultiPortInstance6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/DiscretePort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContinuousPortInstance7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ContinuousPortInstance_2014);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ContinuousPortInstance_3022);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.ContinuousPortInstance7CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.ContinuousPortInstance7CreationTool_desc,
				types);
		entry.setId("createContinuousPortInstance7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/ContinuousPort.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHybridPortInstance8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.HybridPortInstance_2011);
		types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.HybridPortInstance_3018);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.HybridPortInstance8CreationTool_title,
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.HybridPortInstance8CreationTool_desc,
				types);
		entry.setId("createHybridPortInstance8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/HybridPort.gif")); //$NON-NLS-1$
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
