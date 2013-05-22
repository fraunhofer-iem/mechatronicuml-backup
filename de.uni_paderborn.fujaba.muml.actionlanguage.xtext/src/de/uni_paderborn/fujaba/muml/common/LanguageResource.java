package de.uni_paderborn.fujaba.muml.common;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.TextualExpression;

import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

import de.uni_paderborn.fujaba.muml.ActionLanguageStandaloneSetup;
import de.uni_paderborn.fujaba.muml.scoping.ActionLanguageScopeProviderFactory;

public class LanguageResource {
	private static Injector injector = null;
	
	protected static class LoadResult implements ILoadResult {
		
		private EObject object;
		private List<Diagnostic> errorList;
		
		public void setEObject(EObject object) {
			this.object = object;
		}
		
		public void setErrorList(List<Diagnostic> errorList) {
			this.errorList = errorList;
		}

		@Override
		public EObject getEObject() {
			return object;
		}

		@Override
		public boolean hasError() {
			return !getErrorList().isEmpty();
		}

		@Override
		public String getError() {
			return hasError() ? getErrorList().toString() : "";
		}
		
		protected List<Diagnostic> getErrorList() {
			if (errorList == null) {
				return Collections.emptyList();
			}
			return errorList;
		}
		
	}
	
	public static void setInjector(Injector inj) {
		//System.out.println("set injector");
		injector = inj;
	}
	
	public static Resource getXtextResource(EObject object) {
		if (injector == null) {
			//throw new IllegalStateException("injector is null - call setInjector first");
			// this is a relict for the initial action "editor" - will be removed
			injector = new ActionLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
		XtextResourceSet resSet = injector.getInstance(XtextResourceSet.class);
		String ext = injector.getInstance(Key.get(String.class, Names.named(Constants.FILE_EXTENSIONS)));
		Resource resource = resSet.createResource(URI.createURI("dummy." + ext));
		ActionLanguageScopeProviderFactory.setScopeForEObject(object);
		return resource;
	}
	
	public static ILoadResult loadFromString(String text, EObject object) {
		Resource resource = getXtextResource(object);
		LoadResult result = new LoadResult();
		try {
			Map<String, Boolean> options = new HashMap<String, Boolean>();
			options.put(XtextResource.OPTION_RESOLVE_ALL, true);
			resource.load(new StringInputStream(text), options);
			//System.out.println(resource.getWarnings());
			//System.out.println(resource.getErrors());
			result.setErrorList(resource.getErrors());
			if (!result.hasError()) {
				result.setEObject(resource.getContents().get(0));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public static String serializeEObject(EObject object, EObject container) {
		if (!(object instanceof Expression) || object instanceof TextualExpression) {
			return null;
		}
		XtextResource resource = (XtextResource) getXtextResource(container);
		return resource.getSerializer().serialize(object);
	}
}
