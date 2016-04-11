package org.muml.uppaal.adapter.mtctl.xtext.ui.properties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.ape.runtime.editors.AbstractManyFeatureXtextPropertyEditor;
import org.muml.core.common.xtext.AbstractLanguageResource;
import org.muml.core.common.xtext.ILoadResult;
import org.muml.uppaal.adapter.mtctl.Expression;
import org.muml.uppaal.adapter.mtctl.Property;
import org.muml.uppaal.adapter.mtctl.PropertyRepository;
import org.muml.uppaal.adapter.mtctl.impl.MtctlFactoryImpl;
import org.muml.uppaal.adapter.mtctl.impl.MtctlPackageImpl;
import org.muml.uppaal.adapter.mtctl.xtext.MtctlStandaloneSetup;
import org.muml.uppaal.adapter.mtctl.xtext.scoping.MtctlScopeProvider;
import org.muml.uppaal.adapter.mtctl.xtext.ui.internal.MtctlActivator;

import com.google.inject.Injector;

/**
 * Manages the use of the mtctl xtext editor in properties (see base class)
 *
 */
public class MtctlXtextPropertyEditor extends AbstractManyFeatureXtextPropertyEditor { 
	
	private static final String languageName = "org.muml.uppaal.adapter.mtctl";
	public static class VerificationPropertyLanguageResource extends AbstractLanguageResource {
		@Override
		protected void init(EObject context) {
			MtctlScopeProvider.getInstance().setScopeForEObject(context);
		}

		@Override
		protected Injector getInjector() {
			return new MtctlStandaloneSetup().createInjectorAndDoEMFRegistration();
		}

		@Override
		protected boolean isSerializable(EObject object) {
			return object instanceof PropertyRepository || object instanceof Property || object instanceof Expression;
		}
		
	}
	
	public MtctlXtextPropertyEditor(AdapterFactory adapterFactory, EStructuralFeature feature) {
		super(MtctlPackageImpl.eINSTANCE.getPropertyRepository_Properties(), new MtctlFactoryImpl(), adapterFactory, feature, MtctlActivator.getInstance().getInjector(languageName));
	}


	@Override
	protected String serializeEObject(EObject object) {
		return new VerificationPropertyLanguageResource().serializeEObjectSafe(object, element);
	}

	@Override
	protected EObject parse(String text) {
		ILoadResult loadResult = new VerificationPropertyLanguageResource().loadFromString(text, element);		
		return loadResult.getEObject();
	}
}
