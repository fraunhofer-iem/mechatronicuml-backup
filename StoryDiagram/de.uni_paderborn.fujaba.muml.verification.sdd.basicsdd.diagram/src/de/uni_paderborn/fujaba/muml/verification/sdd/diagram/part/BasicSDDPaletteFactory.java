package de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part;

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
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class BasicSDDPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSDDTools1Group());
		paletteRoot.add(createMisreferencedtools2Group());
	}

	/**
	 * Creates "SDD Tools" palette tool group
	 * @generated
	 */
	private PaletteContainer createSDDTools1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.SDDTools1Group_title);
		paletteContainer.setId("createSDDTools1Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.SDDTools1Group_desc);
		paletteContainer.add(createEdge1CreationTool());
		paletteContainer.add(createLeafNode2CreationTool());
		paletteContainer.add(createPatternNode3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "-- Mis-referenced tools --" palette tool group
	 * @generated
	 */
	private PaletteContainer createMisreferencedtools2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.Misreferencedtools2Group_title);
		paletteContainer.setId("createMisreferencedtools2Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.Misreferencedtools2Group_desc);
		paletteContainer.add(createCollectionVariable1CreationTool());
		paletteContainer.add(createAttributeAssignment2CreationTool());
		paletteContainer.add(createConstraint3CreationTool());
		paletteContainer.add(createObjectVariable4CreationTool());
		paletteContainer.add(createLinkVariable5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEdge1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.Edge1CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.Edge1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Edge_4001));
		entry.setId("createEdge1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.pgSafeBots.verification.constraints.sdd/icons/edge.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.pgSafeBots.verification.constraints.sdd/icons/edge.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLeafNode2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.LeafNode2CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.LeafNode2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.LeafNode_2004));
		entry.setId("createLeafNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.pgSafeBots.verification.constraints.sdd/icons/leaf_node.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.pgSafeBots.verification.constraints.sdd/icons/leaf_node.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPatternNode3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.PatternNode3CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.PatternNode3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.StoryPatternNode_2003));
		entry.setId("createPatternNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.pgSafeBots.verification.constraints.sdd/icons/pattern_node.gif")); //$NON-NLS-1$
		entry.setLargeIcon(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.BasicSDDDiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.pgSafeBots.verification.constraints.sdd/icons/pattern_node.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCollectionVariable1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.CollectionVariable1CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.CollectionVariable1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006));
		entry.setId("createCollectionVariable1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.CollectionVariable_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeAssignment2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.AttributeAssignment2CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.AttributeAssignment2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.AttributeAssignment_3007));
		entry.setId("createAttributeAssignment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.AttributeAssignment_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraint3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Constraint_3008);
		types.add(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Constraint_3010);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.Constraint3CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.Constraint3CreationTool_desc,
				types);
		entry.setId("createConstraint3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.Constraint_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObjectVariable4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.ObjectVariable4CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.ObjectVariable4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.ObjectVariable_3009));
		entry.setId("createObjectVariable4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.ObjectVariable_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkVariable5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.LinkVariable5CreationTool_title,
				de.uni_paderborn.fujaba.muml.verification.sdd.diagram.part.Messages.LinkVariable5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003));
		entry.setId("createLinkVariable5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.verification.sdd.diagram.providers.BasicSDDElementTypes.LinkVariable_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
