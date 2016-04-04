	
package org.muml.core.modelinstance.ui.handlers;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.muml.core.common.DiagramEditorUtil;
import org.muml.core.modelinstance.ui.ModelinstanceUiPlugin;

public class CreateModelFileCommand extends AbstractCreateFileCommand {

	@Override
	protected void createContents(URI selectedURI, IFile newFile) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		ModelinstanceUiPlugin.getDefault().createModel(newFile, editingDomain);
	}

	@Override
	protected String getExtension() {
		return "muml";
	}

	@Override
	protected void setCharset(IFile file) {
		DiagramEditorUtil.setCharset(file);
	}

}
