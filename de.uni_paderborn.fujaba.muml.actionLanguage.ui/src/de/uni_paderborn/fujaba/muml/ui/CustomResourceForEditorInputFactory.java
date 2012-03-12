package de.uni_paderborn.fujaba.muml.ui;

import java.util.List;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ui.editor.model.JavaClassPathResourceForIEditorInputFactory;

import de.uni_paderborn.fujaba.muml.ActionLanguageResource;
import de.uni_paderborn.fujaba.muml.model.core.Attribute;

public class CustomResourceForEditorInputFactory extends JavaClassPathResourceForIEditorInputFactory {
	private static List<Attribute> attributeList;
	
	public static void setAttributeList(List<Attribute> attrList) {
		attributeList = attrList;
	}
	
	@Override
	protected Resource createResource(IStorage storage) throws CoreException {
		//System.out.println(storage);
		return ActionLanguageResource.getXtextResource(attributeList);
	}
}
