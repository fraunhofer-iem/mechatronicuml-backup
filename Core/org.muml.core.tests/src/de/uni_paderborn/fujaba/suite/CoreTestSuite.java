package de.uni_paderborn.fujaba.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.uni_paderborn.fujaba.tests.ManifestTest;

@RunWith(Suite.class)
@SuiteClasses({ ManifestTest.class })
public class CoreTestSuite {
	// empty
}
