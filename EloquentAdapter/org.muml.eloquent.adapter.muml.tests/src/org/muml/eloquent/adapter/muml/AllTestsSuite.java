package org.muml.eloquent.adapter.muml;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.muml.eloquent.adapter.muml.algorithm.tests.AlgorithmTestSuite;
import org.muml.eloquent.adapter.muml.ilp.tests.Specification2ILPTestSuite;
import org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup;
import org.muml.psm.allocation.language.xtext.AllocationSpecificationLanguageStandaloneSetup;

@RunWith(Suite.class)
@SuiteClasses({
	AlgorithmTestSuite.class,
	Specification2ILPTestSuite.class
})
public class AllTestsSuite {
	// hmm this is not the ideal package for this class...
	// (maybe we should rename some packages ({algorithm,ilp}.tests))
	@BeforeClass
	public static void setup() {
		LPSolveStandaloneSetup.doSetup();
		AllocationSpecificationLanguageStandaloneSetup.doSetup();
	}
}