package de.uni_paderborn.examples.tests;

import org.eclipse.jface.preference.IPreferenceStore;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.uni_paderborn.fujaba.muml.verification.preferences.VerificationPreferencesPlugin;
import de.uni_paderborn.fujaba.muml.verification.uppaal.MtctlStandaloneSetup;

@RunWith(Suite.class)
@SuiteClasses({ CodegenTest.class })
public class ExamplesTestSuite {
	// empty

	@BeforeClass
	public static void init() {

		MtctlStandaloneSetup.doSetup();

		// Set path to the UPPAAL verifyta tool.
		IPreferenceStore preferenceStore = VerificationPreferencesPlugin.getDefault().getPreferenceStore();
		preferenceStore.setValue(VerificationPreferencesPlugin.VERIFYTA_KEY,
				"/data/jenkins/uppaal64-4.1.19/bin-Linux/verifyta");
	}
}
