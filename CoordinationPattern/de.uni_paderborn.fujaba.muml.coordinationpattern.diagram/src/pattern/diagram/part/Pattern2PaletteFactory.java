package pattern.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import pattern.diagram.providers.Pattern2ElementTypes;

/**
 * @generated
 */
public class Pattern2PaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDe1Group());
	}

	/**
	 * Creates "de" palette tool group
	 * @generated
	 */
	private PaletteContainer createDe1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.De1Group_title);
		paletteContainer.setId("createDe1Group"); //$NON-NLS-1$
		paletteContainer.add(createCoordinationPattern1CreationTool());
		paletteContainer.add(createRole2CreationTool());
		paletteContainer.add(createRoleConnector3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCoordinationPattern1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.CoordinationPattern1CreationTool_title,
				Messages.CoordinationPattern1CreationTool_desc,
				Collections
						.singletonList(Pattern2ElementTypes.CoordinationPattern_2001));
		entry.setId("createCoordinationPattern1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Pattern2DiagramEditorPlugin
				.findImageDescriptor("/de.uni_paderborn.fujaba.muml.common/icons/CoordinationPattern.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Role2CreationTool_title,
				Messages.Role2CreationTool_desc,
				Collections.singletonList(Pattern2ElementTypes.Role_3002));
		entry.setId("createRole2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Pattern2ElementTypes
				.getImageDescriptor(Pattern2ElementTypes.Role_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoleConnector3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.RoleConnector3CreationTool_title,
				Messages.RoleConnector3CreationTool_desc,
				Collections
						.singletonList(Pattern2ElementTypes.RoleConnector_4002));
		entry.setId("createRoleConnector3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Pattern2ElementTypes
				.getImageDescriptor(Pattern2ElementTypes.RoleConnector_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
