package org.muml.pim.actionlanguage.xtext.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.xtext.ui.editor.XtextReadonlyEditorInput;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.editor.validation.AnnotationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.ValidationJob;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.muml.pim.actionlanguage.xtext.storage.IModelStorage;

import com.google.inject.Inject;

public class CustomXtextDocumentProvider extends XtextDocumentProvider {
	
	@Inject
	private IResourceValidator resourceValidator;
	
	@Inject
	private IssueResolutionProvider issueResolutionProvider;
	
	@Override
	protected String getPersistedEncoding(Object element) {
		return "UTF-8";
	}
	
	@Override
	protected ElementInfo createElementInfo(Object element) throws CoreException {
		ElementInfo info = super.createElementInfo(element);
		XtextDocument doc = (XtextDocument) info.fDocument;
		// set annotation model manually because we have no IFileEditorInput...
		info.fModel = new AnnotationModel();
		AnnotationIssueProcessor annotationIssueProcessor = new AnnotationIssueProcessor(doc, info.fModel, issueResolutionProvider);
		ValidationJob job = new ValidationJob(resourceValidator, doc, annotationIssueProcessor,CheckMode.FAST_ONLY);
		doc.setValidationJob(job);
		return info;
	}
	
	protected void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite) throws CoreException {
		//Status s = new Status(IStatus.ERROR, EditorsUI.PLUGIN_ID, IStatus.ERROR, "foo", null);
		//throw new CoreException(s);
		IModelStorage storage = (IModelStorage) ((XtextReadonlyEditorInput) element).getStorage();
		storage.save(document.get());
	}

}
