package org.muml.pim.actionlanguage.xtext.common;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.muml.core.common.xtext.AbstractLanguageResource;
import org.muml.core.common.xtext.ILoadResult;
import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.actionlanguage.xtext.ActionLanguageStandaloneSetup;
import org.muml.pim.actionlanguage.xtext.scoping.ActionLanguageScopeProviderFactory;

import com.google.inject.Injector;

public class LanguageResource {
	
	private static class InternalActionLanguageResource extends AbstractLanguageResource {
		@Override
		protected void init(EObject context) {
			ActionLanguageScopeProviderFactory.setScopeForEObject(context);
		}

		@Override
		protected Injector getInjector() {
			return new ActionLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		}

		@Override
		protected boolean isSerializable(EObject object) {
			return object instanceof Expression;
		}
		
	}
	
	// just provide the old static interface for now
	
	public static Resource getXtextResource(EObject object) {
		return new InternalActionLanguageResource().getXtextResource(object);
	}
	
	public static ILoadResult loadFromString(String text, EObject object) {
		return new InternalActionLanguageResource().loadFromString(text, object);
	}
	
	public static String serializeEObject(EObject object, EObject container) {
		return new InternalActionLanguageResource().serializeEObject(object, container);
	}
	
	public static String serializeEObjectSafe(EObject object, EObject container) {
		return new InternalActionLanguageResource().serializeEObjectSafe(object, container);
	}
	
	public static void setInjector(Injector injector) {
		// FIXME: remove me (nop)
	}
	
}
