package de.uni_paderborn.fujaba.udbm.ruby.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import de.uni_paderborn.fujaba.udbm.test.AddClockTest;
import de.uni_paderborn.fujaba.udbm.test.AndTest;
import de.uni_paderborn.fujaba.udbm.test.CloneFederationTest;
import de.uni_paderborn.fujaba.udbm.test.DownTest;
import de.uni_paderborn.fujaba.udbm.test.EmptyFederationTest;
import de.uni_paderborn.fujaba.udbm.test.HashValueTest;
import de.uni_paderborn.fujaba.udbm.test.NormalizationTest;
import de.uni_paderborn.fujaba.udbm.test.OrTest;
import de.uni_paderborn.fujaba.udbm.test.RelaxTest;
import de.uni_paderborn.fujaba.udbm.test.RemoveClockTest;
import de.uni_paderborn.fujaba.udbm.test.ReplaceClockTest;
import de.uni_paderborn.fujaba.udbm.test.ResetTest;
import de.uni_paderborn.fujaba.udbm.test.SubstractTest;
import de.uni_paderborn.fujaba.udbm.test.UpTest;
import de.uni_paderborn.fujaba.udbm.test.UrgentDelayTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({	RubyUDBMTestInitializer.class,
						AddClockTest.class,
						AndTest.class,
						CloneFederationTest.class,
						DownTest.class,
						EmptyFederationTest.class,
						HashValueTest.class,
						NormalizationTest.class,
						OrTest.class,
						RelaxTest.class,
						RemoveClockTest.class,
						ReplaceClockTest.class,
						ResetTest.class,
						SubstractTest.class,
						UpTest.class,
						UrgentDelayTest.class,
						RubyUDBMTestFinalizer.class})
public class AllRubyUDBMTests {

}
