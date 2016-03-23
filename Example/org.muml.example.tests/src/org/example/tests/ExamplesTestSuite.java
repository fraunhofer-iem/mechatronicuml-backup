package org.example.tests;

import org.eclipse.jface.preference.IPreferenceStore;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage;
import de.uni_paderborn.fujaba.muml.MumlPackage;
import de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage;
import de.uni_paderborn.fujaba.muml.verification.preferences.VerificationPreferencesPlugin;
import de.uni_paderborn.fujaba.muml.verification.uppaal.MtctlStandaloneSetup;

@RunWith(Suite.class)
@SuiteClasses({  CodegenTest.class,
		UppaalTest.class,
		ModelicaTest.class})
public class ExamplesTestSuite {
	// empty

	@BeforeClass 
	public static void init() {


	 MtctlStandaloneSetup.doSetup();
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
