package de.uni_paderborn.fujaba.muml.ui.properties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.common.xtext.AbstractLanguageResource;
import de.uni_paderborn.fujaba.common.xtext.ILoadResult;
import de.uni_paderborn.fujaba.muml.verification.uppaal.MtctlStandaloneSetup;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.impl.MtctlFactoryImpl;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.impl.MtctlPackageImpl;
import de.uni_paderborn.fujaba.muml.verification.uppaal.scoping.MtctlScopeProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.ui.internal.MtctlActivator;
import de.uni_paderborn.fujaba.properties.runtime.editors.AbstractManyFeatureXtextPropertyEditor;

/**
 * Manages the use of the mtctl xtext editor in properties (see base class)
 *
 */
public class MtctlXtextPropertyEditor extends AbstractManyFeatureXtextPropertyEditor { 
	
	private static final String languageName = "de.uni_paderborn.fujaba.muml.verification.uppaal.Mtctl";
	private static class VerificationPropertyLanguageResource extends AbstractLanguageResource {
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
			return object instanceof PropertyRepository;
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
