package org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({OneEmptyNodeTest.class,TwoEmptyNodesTest.class,SuccessFailureEdgesTest.class,JunctionNodeTest.class,
	MatchingStoryPatternTest.class,CreateObjectVariableTest.class,DestroyObjectVariableTest.class})
public class AllTests {

}
