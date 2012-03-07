package de.uni_paderborn.fujaba.muml.ui;

import java.util.List;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ui.editor.model.JavaClassPathResourceForIEditorInputFactory;

import de.uni_paderborn.fujaba.muml.ActionLanguageResource;

public class CustomResourceForEditorInputFactory extends JavaClassPathResourceForIEditorInputFactory {
	private static List<EAttribute> attributeList;
	
	public static void setAttributeList(List<EAttribute> attrList) {
		attributeList = attrList;
	}
	
	@Override
	protected Resource createResource(IStorage storage) throws CoreException {
		//System.out.println(storage);
		return ActionLanguageResource.getXtextResource(attributeList);
	}
}
