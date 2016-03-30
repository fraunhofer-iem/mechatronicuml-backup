package org.muml.psm.allocation.algorithm.ilp.lpsolve.tests;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.muml.pim.MumlPackage;
import org.muml.pm.hardware.HardwarePackage;
import org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup;
import org.muml.psm.allocation.language.xtext.AllocationSpecificationLanguageStandaloneSetup;

@RunWith(Suite.class)
@SuiteClasses({
	LPSolveBasedAlgorithmTest.class
})
public class AllTestsSuite {
	@BeforeClass
	public static void setUpClass() {  
		AllocationSpecificationLanguageStandaloneSetup.doSetup();
		LPSolveStandaloneSetup.doSetup();
		// explicitly setup these packages otherwise the qvto compilation
		// fails (mars) - might be related to the qvto commit
		// de499dbfbd960a63f62c4938d9dc71172e075120
		MumlPackage.eINSTANCE.eClass();
		HardwarePackage.eINSTANCE.eClass();
	}
}