
package org.muml.pim.pattern.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.muml.pim.pattern.diagram.providers.MumlElementTypes;

/**
 * @generated
 */
public class MumlPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createPatternToolGroup1Group());
		paletteRoot.add(createMisreferencedtools2Group());
	}

	/**
	* Creates "PatternToolGroup" palette tool group
	* @generated
	*/
	private PaletteContainer createPatternToolGroup1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.PatternToolGroup1Group_title);
		paletteContainer.setId("createPatternToolGroup1Group"); //$NON-NLS-1$
		paletteContainer.add(createCoordinationPattern1CreationTool());
		paletteContainer.add(createConnector2CreationTool());
		paletteContainer.add(createCoordinationPatternVariation3CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "-- Mis-referenced tools --" palette tool group
	* @generated
	*/
	private PaletteContainer createMisreferencedtools2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Misreferencedtools2Group_title);
		paletteContainer.setId("createMisreferencedtools2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Misreferencedtools2Group_desc);
		paletteContainer.add(createRole1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createCoordinationPattern1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CoordinationPattern1CreationTool_title,
				Messages.CoordinationPattern1CreationTool_desc,
				Collections.singletonList(MumlElementTypes.CoordinationPattern_2001));
		entry.setId("createCoordinationPattern1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MumlElementTypes.getImageDescriptor(MumlElementTypes.CoordinationPattern_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConnector2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Connector2CreationTool_title,
				Messages.Connector2CreationTool_desc, Collections.singletonList(MumlElementTypes.RoleConnector_4001));
		entry.setId("createConnector2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MumlElementTypes.getImageDescriptor(MumlElementTypes.RoleConnector_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCoordinationPatternVariation3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CoordinationPatternVariation3CreationTool_title,
				Messages.CoordinationPatternVariation3CreationTool_desc,
				Collections.singletonList(MumlElementTypes.CoordinationPatternVariant_2002));
		entry.setId("createCoordinationPatternVariation3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MumlElementTypes.getImageDescriptor(MumlElementTypes.CoordinationPatternVariant_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRole1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Role1CreationTool_title,
				Messages.Role1CreationTool_desc, Collections.singletonList(MumlElementTypes.Role_3002));
		entry.setId("createRole1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MumlElementTypes.getImageDescriptor(MumlElementTypes.Role_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
