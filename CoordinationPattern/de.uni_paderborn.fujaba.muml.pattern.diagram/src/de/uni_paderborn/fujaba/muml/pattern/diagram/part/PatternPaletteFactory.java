package de.uni_paderborn.fujaba.muml.pattern.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class PatternPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createPatternToolGroup1Group());
	}

	/**
	 * Creates "PatternToolGroup" palette tool group
	 * @generated
	 */
	private PaletteContainer createPatternToolGroup1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.pattern.diagram.part.Messages.PatternToolGroup1Group_title);
		paletteContainer.setId("createPatternToolGroup1Group"); //$NON-NLS-1$
		paletteContainer.add(createCoordinationPattern1CreationTool());
		paletteContainer.add(createRole2CreationTool());
		paletteContainer.add(createConnector3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCoordinationPattern1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.pattern.diagram.part.Messages.CoordinationPattern1CreationTool_title,
				de.uni_paderborn.fujaba.muml.pattern.diagram.part.Messages.CoordinationPattern1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.CoordinationPattern_2001));
		entry.setId("createCoordinationPattern1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.CoordinationPattern_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.pattern.diagram.part.Messages.Role2CreationTool_title,
				de.uni_paderborn.fujaba.muml.pattern.diagram.part.Messages.Role2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.Role_3002));
		entry.setId("createRole2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.Role_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnector3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				de.uni_paderborn.fujaba.muml.pattern.diagram.part.Messages.Connector3CreationTool_title,
				de.uni_paderborn.fujaba.muml.pattern.diagram.part.Messages.Connector3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.RoleConnector_4001));
		entry.setId("createConnector3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.pattern.diagram.providers.PatternElementTypes.RoleConnector_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
