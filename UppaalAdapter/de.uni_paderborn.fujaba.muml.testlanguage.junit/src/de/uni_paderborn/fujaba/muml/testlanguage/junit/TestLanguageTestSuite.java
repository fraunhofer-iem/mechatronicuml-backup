package de.uni_paderborn.fujaba.muml.testlanguage.junit;

import org.eclipse.jface.preference.IPreferenceStore;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.uni_paderborn.fujaba.muml.verification.preferences.VerificationPreferencesPlugin;

@RunWith(Suite.class)
@SuiteClasses({ RunTestCases.class })
public class TestLanguageTestSuite {

	@BeforeClass
	public static void init() {
		// Set path to the UPPAAL verifyta tool.
		IPreferenceStore preferenceStore = VerificationPreferencesPlugin
				.getDefault().getPreferenceStore();
		preferenceStore.setValue(VerificationPreferencesPlugin.VERIFYTA_KEY,
				"F:\\Bachelor\\uppaal-4.0.14\\bin-Win32\\verifyta.exe");
	}

}
