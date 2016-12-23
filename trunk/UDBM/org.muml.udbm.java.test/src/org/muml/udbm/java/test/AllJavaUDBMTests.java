package org.muml.udbm.java.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.muml.udbm.test.AddClockTest;
import org.muml.udbm.test.AndTest;
import org.muml.udbm.test.CloneFederationTest;
import org.muml.udbm.test.ContainsTest;
import org.muml.udbm.test.DownTest;
import org.muml.udbm.test.EmptyFederationTest;
import org.muml.udbm.test.HashValueTest;
import org.muml.udbm.test.NormalizationTest;
import org.muml.udbm.test.OrTest;
import org.muml.udbm.test.RelaxTest;
import org.muml.udbm.test.RemoveClockTest;
import org.muml.udbm.test.ReplaceClockTest;
import org.muml.udbm.test.ResetTest;
import org.muml.udbm.test.SubstractTest;
import org.muml.udbm.test.UpTest;
import org.muml.udbm.test.UrgentDelayTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({	JavaUDBMTestInitializer.class, 
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
						ContainsTest.class})
public class AllJavaUDBMTests {

}
