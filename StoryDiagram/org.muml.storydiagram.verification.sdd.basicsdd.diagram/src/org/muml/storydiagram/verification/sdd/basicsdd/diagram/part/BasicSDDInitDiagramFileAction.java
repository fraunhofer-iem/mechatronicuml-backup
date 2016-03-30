package org.muml.storydiagram.verification.sdd.basicsdd.diagram.part;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;

/**
 * @generated
 */
public class BasicSDDInitDiagramFileAction
		extends
		org.muml.core.modelinstance.ui.handlers.AbstractCreateDiagramFileCommand {

	/**
	 * @generated
	 */
	@Override
	public void setCharset(IFile diagramFile) {
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorUtil
				.setCharset(diagramFile);
	}

	/**
	 * @generated
	 */
	@Override
	public String getUniqueFilename(String hint, String extension,
			IPath filePath) {
		return org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorUtil
				.getUniqueFileName(filePath, hint, extension);
	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditor.ID;

	}
}
