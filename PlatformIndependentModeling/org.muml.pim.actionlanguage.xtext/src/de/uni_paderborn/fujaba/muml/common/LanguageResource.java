package de.uni_paderborn.fujaba.muml.common;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.storydriven.core.expressions.Expression;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.common.xtext.AbstractLanguageResource;
import de.uni_paderborn.fujaba.common.xtext.ILoadResult;
import de.uni_paderborn.fujaba.muml.ActionLanguageStandaloneSetup;
import de.uni_paderborn.fujaba.muml.scoping.ActionLanguageScopeProviderFactory;

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
