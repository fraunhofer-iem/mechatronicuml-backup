package org.muml.pim.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.muml.core.tests.QVTOCompileErrorTest;
import org.muml.pim.tests.gmf.PimGMFMapTest;
import org.muml.pim.tests.packages.PimPluginXmlPackageTest;

@RunWith(Suite.class)
@SuiteClasses({ PimMetamodelTest.class, PimGenmodelTest.class,
		PimPluginXmlPackageTest.class, PimValidateMetamodelsTest.class,
		PimDiagramPluginXmlTest.class, PimGMFMapTest.class,
		PIMQVTOCompileTest.class })
public class MumlTestSuite {
	// empty
}
