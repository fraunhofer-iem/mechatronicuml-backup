package de.uni_paderborn.fujaba.muml.ui.properties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.ape.runtime.editors.AbstractManyFeatureXtextPropertyEditor;
import org.muml.core.common.xtext.AbstractLanguageResource;
import org.muml.core.common.xtext.ILoadResult;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.muml.verification.uppaal.MtctlStandaloneSetup;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Expression;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Property;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.impl.MtctlFactoryImpl;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.impl.MtctlPackageImpl;
import de.uni_paderborn.fujaba.muml.verification.uppaal.scoping.MtctlScopeProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.ui.internal.MtctlActivator;

/**
 * Manages the use of the mtctl xtext editor in properties (see base class)
 *
 */
public class MtctlXtextPropertyEditor extends AbstractManyFeatureXtextPropertyEditor { 
	
	private static final String languageName = "de.uni_paderborn.fujaba.muml.verification.uppaal.Mtctl";
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
