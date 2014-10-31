package pattern.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteRoot.add(createPatternToolGroup1Group());
	}

	/**
	 * Creates "PatternToolGroup" palette tool group
	 * @generated
	 */
	private PaletteContainer createPatternToolGroup1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.PatternToolGroup1Group_title);
		paletteContainer.setId("createPatternToolGroup1Group"); //$NON-NLS-1$
		paletteContainer.add(createCoordinationPattern1CreationTool());
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
		entry.setSmallIcon(Pattern2ElementTypes
				.getImageDescriptor(Pattern2ElementTypes.CoordinationPattern_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
