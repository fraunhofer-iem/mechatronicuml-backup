package org.muml.reconfigurationverification.fotctl.xtext.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LogicFormulaTest.class, PredicateTest.class,
		TemporalFormulaTest.class, QuantifiedFormulaTest.class})
public class AllFotctlTests {

}
