package org.muml.pim.operationrepository.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.muml.pim.operationrepository.diagram.providers.MumlElementTypes;

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
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Operationrepositoryeditor1Group_title);
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OperationRepository1CreationTool_title,
				Messages.OperationRepository1CreationTool_desc,
				Collections.singletonList(MumlElementTypes.OperationRepository_2001));
		entry.setId("createOperationRepository1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MumlElementTypes.getImageDescriptor(MumlElementTypes.OperationRepository_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Operation2CreationTool_title,
				Messages.Operation2CreationTool_desc, Collections.singletonList(MumlElementTypes.Operation_3001));
		entry.setId("createOperation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MumlElementTypes.getImageDescriptor(MumlElementTypes.Operation_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParameter3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Parameter3CreationTool_title,
				Messages.Parameter3CreationTool_desc, Collections.singletonList(MumlElementTypes.Parameter_3002));
		entry.setId("createParameter3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MumlElementTypes.getImageDescriptor(MumlElementTypes.Parameter_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
