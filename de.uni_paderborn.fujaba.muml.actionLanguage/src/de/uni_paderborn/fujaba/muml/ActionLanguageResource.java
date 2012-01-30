package de.uni_paderborn.fujaba.muml;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.storydriven.modeling.expressions.Expression;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.muml.model.actionLanguage.Block;
import de.uni_paderborn.fujaba.muml.scoping.ActionLanguageScopeProviderFactory;

public class ActionLanguageResource {
	private static Injector injector = null;
	private static String loadError = "";
	
	public static Resource getXtextResource(List<EAttribute> attributeList) {
		if (injector == null) {
			injector = new ActionLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
		XtextResourceSet resSet = injector.getInstance(XtextResourceSet.class);
		Resource resource = resSet.createResource(URI.createURI("dummy.action"));
		ActionLanguageScopeProviderFactory.setAttributeList(attributeList);
		return resource;
	}
	
	public static String getloadErrorMessage() {
		return loadError;
	}
	
	private static void setError(Resource resource) {
		// that's not the smartest solution
		loadError = "";
		if (!resource.getErrors().isEmpty()) {
			loadError = resource.getErrors().toString();
		}
	}
	public static EObject loadFromString(String text, List<EAttribute> attributeList) {
		Resource resource = getXtextResource(attributeList);
		EObject expression = null;
		try {
			Map<String, Boolean> options = new HashMap<String, Boolean>();
			options.put(XtextResource.OPTION_RESOLVE_ALL, true);
			resource.load(new StringInputStream(text), options);
			//System.out.println(resource.getWarnings());
			//System.out.println(resource.getErrors());
			setError(resource);
			if (resource.getErrors().isEmpty()) {
				expression = resource.getContents().get(0);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return expression;
	}
	
	public static String serializeEObject(EObject object, List<EAttribute> attributeList) {
		if (!(object instanceof Block)) {
			return null;
		}
		XtextResource resource = (XtextResource) getXtextResource(attributeList);
		return resource.getSerializer().serialize(object);
	}

}
