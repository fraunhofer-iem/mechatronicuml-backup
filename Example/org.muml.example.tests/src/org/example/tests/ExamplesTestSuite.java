package org.example.tests;

import org.eclipse.jface.preference.IPreferenceStore;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.muml.core.CorePackage;
import org.muml.core.modelinstance.ModelinstancePackage;
import org.muml.pim.PimPackage;
import org.muml.pim.actionlanguage.ActionlanguagePackage;
import org.muml.uppaal.adapter.mtctl.xtext.MtctlStandaloneSetup;
import org.muml.uppaal.preferences.UppaalPreferencesPlugin;

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

		PimPackage.eINSTANCE.eClass();
		// MtctlPackage.eINSTANCE.eClass();
		ActionlanguagePackage.eINSTANCE.eClass();

		// Set path to the UPPAAL verifyta tool.
		IPreferenceStore preferenceStore = UppaalPreferencesPlugin.getDefault().getPreferenceStore();
		preferenceStore.setValue(UppaalPreferencesPlugin.VERIFYTA_KEY,
				"/data/jenkins/uppaal64-4.1.19/bin-Linux/verifyta");
	}
}
