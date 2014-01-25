package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;

/**
 * @generated
 */
public class ComponentStoryDiagramInitDiagramFileAction
		extends
		de.uni_paderborn.fujaba.modelinstance.ui.ui.commands.AbstractCreateDiagramFileCommand {

	/**
	 * @generated
	 */
	@Override
	public void setCharset(IFile diagramFile) {
		de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorUtil
				.setCharset(diagramFile);
	}

	/**
	 * @generated
	 */
	@Override
	public String getUniqueFilename(String hint, String extension,
			IPath filePath) {
		return de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorUtil
				.getUniqueFileName(filePath, hint, extension);
	}

	/**
	 * @generated
	 */
	@Override
	public String getEditorId() {
		return de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditor.ID;

	}
}
