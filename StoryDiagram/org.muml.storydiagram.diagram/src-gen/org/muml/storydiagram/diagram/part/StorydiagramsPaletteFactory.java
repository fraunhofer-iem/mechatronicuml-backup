package org.muml.storydiagram.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.muml.storydiagram.diagram.providers.StorydiagramsElementTypes;

/**
 * @generated
 */
public class StorydiagramsPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createActivities1Group());
		paletteRoot.add(createPatterns2Group());
	}

	/**
	 * Creates "Activities" palette tool group
	 * @generated
	 */
	private PaletteContainer createActivities1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Activities1Group_title);
		paletteContainer.setId("createActivities1Group"); //$NON-NLS-1$
		paletteContainer.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.muml.storydiagram.diagram.custom/icons/palette/activities.png")); //$NON-NLS-1$
		paletteContainer.add(createActivityCallNode1CreationTool());
		paletteContainer.add(createModifyingStoryNode2CreationTool());
		paletteContainer.add(createMatchingStoryNode3CreationTool());
		paletteContainer.add(createStatementNode4CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createActivityEdge6CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createInitialNode8CreationTool());
		paletteContainer.add(createJunctionNode9CreationTool());
		paletteContainer.add(createActivityFinalNode10CreationTool());
		paletteContainer.add(createFlowFinalNode11CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Patterns" palette tool group
	 * @generated
	 */
	private PaletteContainer createPatterns2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Patterns2Group_title);
		paletteContainer.setId("createPatterns2Group"); //$NON-NLS-1$
		paletteContainer.setSmallIcon(StorydiagramsDiagramEditorPlugin
				.findImageDescriptor("/org.muml.storydiagram.diagram.custom/icons/palette/patterns.png")); //$NON-NLS-1$
		paletteContainer.add(createObjectVariable1CreationTool());
		paletteContainer.add(createCollectionVariable2CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createLinkVariable4CreationTool());
		paletteContainer.add(createInclusionLink5CreationTool());
		paletteContainer.add(createMaybeLink6CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createConstraint8CreationTool());
		paletteContainer.add(createLinkConstraint9CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAttributeAssignment11CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityCallNode1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ActivityCallNode1CreationTool_title,
				Messages.ActivityCallNode1CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ActivityCallNode_2001));
		entry.setId("createActivityCallNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.ActivityCallNode_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModifyingStoryNode2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ModifyingStoryNode2CreationTool_title,
				Messages.ModifyingStoryNode2CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ModifyingStoryNode_2003));
		entry.setId("createModifyingStoryNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.ModifyingStoryNode_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMatchingStoryNode3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MatchingStoryNode3CreationTool_title,
				Messages.MatchingStoryNode3CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.MatchingStoryNode_2004));
		entry.setId("createMatchingStoryNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.MatchingStoryNode_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStatementNode4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StatementNode4CreationTool_title,
				Messages.StatementNode4CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.StatementNode_2002));
		entry.setId("createStatementNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.StatementNode_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityEdge6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ActivityEdge6CreationTool_title,
				Messages.ActivityEdge6CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ActivityEdge_4001));
		entry.setId("createActivityEdge6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.ActivityEdge_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitialNode8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InitialNode8CreationTool_title,
				Messages.InitialNode8CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.InitialNode_2005));
		entry.setId("createInitialNode8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.InitialNode_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJunctionNode9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.JunctionNode9CreationTool_title,
				Messages.JunctionNode9CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.JunctionNode_2006));
		entry.setId("createJunctionNode9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.JunctionNode_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityFinalNode10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ActivityFinalNode10CreationTool_title,
				Messages.ActivityFinalNode10CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ActivityFinalNode_2008));
		entry.setId("createActivityFinalNode10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.ActivityFinalNode_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFlowFinalNode11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FlowFinalNode11CreationTool_title,
				Messages.FlowFinalNode11CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.FlowFinalNode_2007));
		entry.setId("createFlowFinalNode11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.FlowFinalNode_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObjectVariable1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ObjectVariable1CreationTool_title,
				Messages.ObjectVariable1CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.ObjectVariable_3005));
		entry.setId("createObjectVariable1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.ObjectVariable_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCollectionVariable2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CollectionVariable2CreationTool_title,
				Messages.CollectionVariable2CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.CollectionVariable_3002));
		entry.setId("createCollectionVariable2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.CollectionVariable_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkVariable4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LinkVariable4CreationTool_title,
				Messages.LinkVariable4CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.LinkVariable_4002));
		entry.setId("createLinkVariable4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.LinkVariable_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInclusionLink5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InclusionLink5CreationTool_title,
				Messages.InclusionLink5CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.InclusionLink_4003));
		entry.setId("createInclusionLink5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.InclusionLink_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMaybeLink6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.MaybeLink6CreationTool_title,
				Messages.MaybeLink6CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.MaybeLink_4004));
		entry.setId("createMaybeLink6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.MaybeLink_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraint8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(StorydiagramsElementTypes.Constraint_3004);
		types.add(StorydiagramsElementTypes.Constraint_3006);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Constraint8CreationTool_title,
				Messages.Constraint8CreationTool_desc, types);
		entry.setId("createConstraint8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.Constraint_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkConstraint9CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.LinkConstraint9CreationTool_title,
				Messages.LinkConstraint9CreationTool_desc, null, null) {
		};
		entry.setId("createLinkConstraint9CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeAssignment11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AttributeAssignment11CreationTool_title,
				Messages.AttributeAssignment11CreationTool_desc,
				Collections.singletonList(StorydiagramsElementTypes.AttributeAssignment_3003));
		entry.setId("createAttributeAssignment11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				StorydiagramsElementTypes.getImageDescriptor(StorydiagramsElementTypes.AttributeAssignment_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
