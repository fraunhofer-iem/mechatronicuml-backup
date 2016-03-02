package de.uni_paderborn.examples.tests;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.lpg.BasicEnvironment;
import org.eclipse.ocl.lpg.ProblemHandler;
import org.eclipse.ocl.options.ProblemOption;
import org.eclipse.ocl.util.OCLUtil;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage;
import de.uni_paderborn.fujaba.muml.MumlPackage;
import de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage;
import de.uni_paderborn.fujaba.muml.verification.preferences.VerificationPreferencesPlugin;

@RunWith(Suite.class)
@SuiteClasses({ // CodegenTest.class,
		UppaalTest.class })
public class ExamplesTestSuite {
	// empty

	@BeforeClass 
	public static void init() {
		OCL OCL_ENV = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);

		BasicEnvironment benv = OCLUtil.getAdapter(OCL_ENV.getEnvironment(), BasicEnvironment.class);
		// Do not show warning for closure iterator (we currently display
		// warnings as errors)
		benv.setOption(ProblemOption.CLOSURE_ITERATOR, ProblemHandler.Severity.OK);

		// initialize OCL in ecore
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE
				.put("http://www.eclipse.org/emf/2002/Ecore/OCL", new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE
				.put("http://www.eclipse.org/emf/2002/Ecore/OCL", new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
				new OCLValidationDelegateFactory.Global());

		// MtctlStandaloneSetup.doSetup();
		CorePackage.eINSTANCE.eClass();
		ModelinstancePackage.eINSTANCE.eClass();

		MumlPackage.eINSTANCE.eClass();
		// MtctlPackage.eINSTANCE.eClass();
		ActionlanguagePackage.eINSTANCE.eClass();

		// Set path to the UPPAAL verifyta tool.
		IPreferenceStore preferenceStore = VerificationPreferencesPlugin.getDefault().getPreferenceStore();
		preferenceStore.setValue(VerificationPreferencesPlugin.VERIFYTA_KEY,
				"/data/jenkins/uppaal64-4.1.19/bin-Linux/verifyta");
	}
}
