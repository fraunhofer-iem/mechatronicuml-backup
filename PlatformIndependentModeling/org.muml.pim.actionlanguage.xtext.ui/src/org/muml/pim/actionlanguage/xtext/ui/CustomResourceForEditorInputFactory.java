package org.muml.pim.actionlanguage.xtext.ui;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ui.editor.model.JavaClassPathResourceForIEditorInputFactory;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;

public class CustomResourceForEditorInputFactory extends JavaClassPathResourceForIEditorInputFactory {
	private static EObject container;
	
	public static void setContainer(EObject object) {
		container = object;
	}
	
	@Override
	protected Resource createResource(IStorage storage) throws CoreException {
		if (container == null) {
			throw new IllegalStateException("container must not be null");
		}
		//System.out.println(storage);
		return LanguageResource.getXtextResource(container);
	}
}
