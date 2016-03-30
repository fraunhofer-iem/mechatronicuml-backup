package org.muml.uppaal.adapter.junit;

import org.eclipse.jface.preference.IPreferenceStore;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.muml.uppaal.adapter.mtctl.xtext.MtctlStandaloneSetup;
import org.muml.verification.core.preferences.VerificationPreferencesPlugin;

@RunWith(Suite.class)
@SuiteClasses({ RunTestCases.class })
public class TestLanguageTestSuite {

	@BeforeClass
	public static void init() {	
		
		MtctlStandaloneSetup.doSetup();

		// Set path to the UPPAAL verifyta tool.
		IPreferenceStore preferenceStore = VerificationPreferencesPlugin
				.getDefault().getPreferenceStore();
		preferenceStore.setValue(VerificationPreferencesPlugin.VERIFYTA_KEY,
				"/data/jenkins/uppaal64-4.1.19/bin-Linux/verifyta");
	}

}
