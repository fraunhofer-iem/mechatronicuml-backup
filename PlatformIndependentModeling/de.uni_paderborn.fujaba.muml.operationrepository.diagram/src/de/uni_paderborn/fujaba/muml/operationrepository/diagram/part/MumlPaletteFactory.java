package de.uni_paderborn.fujaba.muml.operationrepository.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class MumlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createOperationrepositoryeditor1Group());
	}

	/**
	 * Creates "operationrepositoryeditor" palette tool group
	 * @generated
	 */
	private PaletteContainer createOperationrepositoryeditor1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.Messages.Operationrepositoryeditor1Group_title);
		paletteContainer.setId("createOperationrepositoryeditor1Group"); //$NON-NLS-1$
		paletteContainer.add(createOperationRepository1CreationTool());
		paletteContainer.add(createOperation2CreationTool());
		paletteContainer.add(createParameter3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperationRepository1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.Messages.OperationRepository1CreationTool_title,
				de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.Messages.OperationRepository1CreationTool_desc,
				Collections.singletonList(
						de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.OperationRepository_2001));
		entry.setId("createOperationRepository1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.getImageDescriptor(
						de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.OperationRepository_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.Messages.Operation2CreationTool_title,
				de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.Messages.Operation2CreationTool_desc,
				Collections.singletonList(
						de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.Operation_3001));
		entry.setId("createOperation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.getImageDescriptor(
						de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.Operation_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParameter3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.Messages.Parameter3CreationTool_title,
				de.uni_paderborn.fujaba.muml.operationrepository.diagram.part.Messages.Parameter3CreationTool_desc,
				Collections.singletonList(
						de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.Parameter_3002));
		entry.setId("createParameter3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.getImageDescriptor(
						de.uni_paderborn.fujaba.muml.operationrepository.diagram.providers.MumlElementTypes.Parameter_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
