package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part;

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
public class PatternPaletteFactory {

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
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.De1Group_title);
		paletteContainer.setId("createDe1Group"); //$NON-NLS-1$
		paletteContainer.add(createRoleConnector1CreationTool());
		paletteContainer.add(createCoordinationPattern2CreationTool());
		paletteContainer.add(createRole3CreationTool());
		paletteContainer
				.add(createCoordinationPatternConstraint4CreationTool());
		paletteContainer.add(createRoleConstraint5CreationTool());
		paletteContainer.add(createTextualConstraint6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoleConnector1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.RoleConnector1CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.RoleConnector1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RoleConnector_4001));
		entry.setId("createRoleConnector1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.RoleConnector_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCoordinationPattern2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.CoordinationPattern2CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.CoordinationPattern2CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.CoordinationPattern_2001));
		entry.setId("createCoordinationPattern2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.CoordinationPattern_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.Role3CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.Role3CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.Role_2002));
		entry.setId("createRole3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.Role_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCoordinationPatternConstraint4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.CoordinationPatternConstraint4CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.CoordinationPatternConstraint4CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4003));
		entry.setId("createCoordinationPatternConstraint4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoleConstraint5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.RoleConstraint5CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.RoleConstraint5CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4004));
		entry.setId("createRoleConstraint5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.ConstrainableElementConstraint_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTextualConstraint6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.TextualConstraint6CreationTool_title,
				de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.Messages.TextualConstraint6CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.TextualConstraint_2003));
		entry.setId("createTextualConstraint6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.providers.PatternElementTypes.TextualConstraint_2003));
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
