package org.muml.cbs.dependencylanguage.xtext.common;

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
import org.eclipse.xtext.parsetree.reconstr.XtextSerializationException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.muml.cbs.dependencylanguage.Condition;
import org.muml.cbs.dependencylanguage.Dependency;
import org.muml.cbs.dependencylanguage.DependencyModel;
import org.muml.cbs.dependencylanguage.Effect;
import org.muml.cbs.dependencylanguage.Event;
import org.muml.cbs.dependencylanguage.xtext.DependencyModelLanguageStandaloneSetup;
import org.muml.cbs.dependencylanguage.xtext.scoping.DependencyModelLanguageScopeProviderFactory;
import org.muml.core.common.xtext.ILoadResult;

import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

public class DependencyModelLanguageResource {
	private static Injector injector = null;
	private static String INVALID = "unable to serialize expression "
			+ "because it does not conform to the dependencylanguage grammar";
	
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
			injector = new DependencyModelLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
		XtextResourceSet resSet = injector.getInstance(XtextResourceSet.class);
		String ext = injector.getInstance(Key.get(String.class, Names.named(Constants.FILE_EXTENSIONS)));
		Resource resource = resSet.createResource(URI.createURI("dummy." + ext));
		DependencyModelLanguageScopeProviderFactory.setScopeForEObject(object);
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
		if (!(	(object instanceof DependencyModel) ||
				(object instanceof Dependency) ||
				(object instanceof Event) ||
				(object instanceof Condition) ||
				(object instanceof Effect)
			)) {
			return null;
		}
		XtextResource resource = (XtextResource) getXtextResource(container);
		return resource.getSerializer().serialize(object);
	}
	
	public static String serializeEObjectSafe(EObject object, EObject container) {
		try {
			return serializeEObject(object, container);
		} catch (XtextSerializationException e) {
			return INVALID;
		}
	}
}
