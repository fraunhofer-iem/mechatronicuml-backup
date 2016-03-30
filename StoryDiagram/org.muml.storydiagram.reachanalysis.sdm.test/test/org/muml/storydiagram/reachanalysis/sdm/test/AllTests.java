package org.muml.storydiagram.reachanalysis.sdm.test;

import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({TestPermutation.class, TestDerivedImplementations.class, TestHashComputation.class, 
	TestIsomorphismCheck.class,	TestStepGraphCopy.class, TestIdentifyUnchangeableNodes.class, TestAttributeObjectReferences.class})
public class AllTests extends TestSuite {
	

}
