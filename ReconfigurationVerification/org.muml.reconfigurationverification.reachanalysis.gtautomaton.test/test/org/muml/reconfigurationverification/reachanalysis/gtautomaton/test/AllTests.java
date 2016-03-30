package org.muml.reconfigurationverification.reachanalysis.gtautomaton.test;

import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;



	@RunWith(Suite.class)
	@Suite.SuiteClasses({TestInitialGraphCreation.class, TestRuleApplications.class, 
		TestGtIsomorphisms.class, TestGtStepGraphCopy.class})
	public class AllTests extends TestSuite {
		

	}

