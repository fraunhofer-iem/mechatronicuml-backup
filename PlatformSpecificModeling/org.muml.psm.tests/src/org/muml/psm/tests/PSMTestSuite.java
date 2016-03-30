package org.muml.psm.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.muml.psm.tests.packages.PSMPluginXmlPackageTest;

@RunWith(Suite.class)
@SuiteClasses({ PSMMetamodelTest.class, PSMGenmodelTest.class, PSMPluginXmlPackageTest.class,
		PSMValidateMetamodelsTest.class, PSMQVTOCompileTest.class })
public class PSMTestSuite {
	// empty
}
