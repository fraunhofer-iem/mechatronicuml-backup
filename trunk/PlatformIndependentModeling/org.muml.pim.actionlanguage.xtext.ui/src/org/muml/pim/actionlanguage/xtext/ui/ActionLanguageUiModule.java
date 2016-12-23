/*
 * generated by Xtext
 */
package org.muml.pim.actionlanguage.xtext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ActionLanguageUiModule extends org.muml.pim.actionlanguage.xtext.ui.AbstractActionLanguageUiModule {
	public ActionLanguageUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IResourceForEditorInputFactory> bindIResourceForEditorInputFactory() {
		//return JavaClassPathResourceForIEditorInputFactory.class;
		return CustomResourceForEditorInputFactory.class;
	}
	
	public Class<? extends XtextDocumentProvider> bindXtextDocumentProvider() {
		return CustomXtextDocumentProvider.class;
	}
}


