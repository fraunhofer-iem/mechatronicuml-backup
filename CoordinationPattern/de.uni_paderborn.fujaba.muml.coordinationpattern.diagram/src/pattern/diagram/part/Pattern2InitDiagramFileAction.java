package pattern.diagram.part;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;

/**
 * @generated
 */
public class Pattern2InitDiagramFileAction
		extends
		de.uni_paderborn.fujaba.modelinstance.ui.handlers.AbstractCreateDiagramFileCommand {

	/**
	 * @generated
	 */
	@Override
	public void setCharset(IFile diagramFile) {
		Pattern2DiagramEditorUtil.setCharset(diagramFile);
	}

	/**
	 * @generated
	 */
	@Override
	public String getUniqueFilename(String hint, String extension,
			IPath filePath) {
		return Pattern2DiagramEditorUtil.getUniqueFileName(filePath, hint,
				extension);
	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return Pattern2DiagramEditor.ID;

	}
}
