package org.muml.reconfigurationverification.timedstorychart.transform.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ActionLanguageTransformationTest.class,
		CopyInputModelTest.class, PreTransformationTest.class,
		TSCTransformationTest.class })
public class AllTSCTransformationTests {

}
