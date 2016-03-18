package de.uni_paderborn.fujaba.muml.testlanguage.diagram.part;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Request;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;

import de.uni_paderborn.fujaba.muml.testlanguage.specification.NodeSpecification;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationFactory;

/**
 * @generated
 */
public class TestLanguagePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGeneral1Group());
		paletteRoot.add(createNodes2Group());
	}

	/**
	 * Creates "General" palette tool group
	 * @generated
	 */
	private PaletteContainer createGeneral1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.Messages.General1Group_title);
		paletteContainer.setId("createGeneral1Group"); //$NON-NLS-1$
		paletteContainer.add(createConnection1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.Messages.Nodes2Group_title);
		paletteContainer.setId("createNodes2Group"); //$NON-NLS-1$

		List<String> specs = de.uni_paderborn.fujaba.muml.testlanguage.specification.custom.SpecificationRegistry
				.getSpecificationClasses();
		for (String spec : specs) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Node_2001);
			types.add(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Input_3001);
			types.add(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Output_3002);

			// Create a NodeSpecification-instance of the given type to get the
			// label. *cough* A bit of a hack, but EMF won't allow static
			// members.
			String label = spec;
			try {
				SpecificationFactory fac = de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationFactory.eINSTANCE;
				Method creator = fac.getClass().getMethod("create" + spec);
				NodeSpecification concSpec = (NodeSpecification) creator
						.invoke(fac);
				concSpec.initialize();
				label = concSpec.getLabel();
			} catch (Exception e) {
				// If something went wrong, then so be it.
				label = spec;
			}

			// Create the tool entry.
			NodeToolEntry entry = new NodeToolEntry(label, spec, types);
			entry.setId("createNode1" + spec); //$NON-NLS-1$
			entry.setSmallIcon(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes
					.getImageDescriptor(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Node_2001));
			entry.setLargeIcon(entry.getSmallIcon());
			entry.setSpecificationClassName(spec);
			paletteContainer.add(entry);
		}
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.Messages.Connection1CreationTool_title,
				de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.Messages.Connection1CreationTool_desc,
				Collections
						.singletonList(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.OutputTargets_4001));
		entry.setId("createConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.OutputTargets_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Node_2001);
		types.add(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Input_3001);
		types.add(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Output_3002);
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.Messages.Node1CreationTool_title,
				de.uni_paderborn.fujaba.muml.testlanguage.diagram.part.Messages.Node1CreationTool_desc,
				types);
		entry.setId("createNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes
				.getImageDescriptor(de.uni_paderborn.fujaba.muml.testlanguage.diagram.providers.TestLanguageElementTypes.Node_2001));
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

		private String specificationClassName = null;

		public void setSpecificationClassName(String className) {
			this.specificationClassName = className;
		}

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
			final String specificationClassName = this.specificationClassName;
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes) {
				@Override
				protected Request createTargetRequest() {
					Request req = super.createTargetRequest();
					req.getExtendedData().put("specificationClassName",
							specificationClassName);
					return req;
				}
			};
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends DefaultLinkToolEntry {

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, elementTypes);
		}
	}

}
