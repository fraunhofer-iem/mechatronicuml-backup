package de.uni_paderborn.fujaba.muml.testlanguage.junit;

import org.eclipse.jface.preference.IPreferenceStore;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.uni_paderborn.fujaba.muml.verification.preferences.VerificationPreferencesPlugin;
import de.uni_paderborn.fujaba.muml.verification.uppaal.MtctlStandaloneSetup;

@RunWith(Suite.class)
@SuiteClasses({ RunTestCases.class })
public class TestLanguageTestSuite {

	@BeforeClass
	public static void init() {
		// Set path to the UPPAAL verifyta tool.
		MtctlStandaloneSetup.doSetup();
		IPreferenceStore preferenceStore = VerificationPreferencesPlugin
				.getDefault().getPreferenceStore();
		preferenceStore.setValue(VerificationPreferencesPlugin.VERIFYTA_KEY,
				"C:\\Users\\Milan\\Desktop\\uppaal-4.1.19\\uppaal-4.1.19\\bin-Win32\\verifyta.exe");
	}

}
