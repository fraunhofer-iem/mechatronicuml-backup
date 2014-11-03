package de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;

/**
 * @generated
 */
public class MumlInitDiagramFileAction
		extends
		de.uni_paderborn.fujaba.modelinstance.ui.handlers.AbstractCreateDiagramFileCommand {

	/**
	 * @generated
	 */
	@Override
	public void setCharset(IFile diagramFile) {
		de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.MumlDiagramEditorUtil
				.setCharset(diagramFile);
	}

	/**
	 * @generated
	 */
	@Override
	public String getUniqueFilename(String hint, String extension,
			IPath filePath) {
		return de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.MumlDiagramEditorUtil
				.getUniqueFileName(filePath, hint, extension);
	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram.part.CoordinationProtocolDiagramEditor.ID;

	}
}
