package org.muml.pm.hardware.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.muml.pm.hardware.tests.gmf.HardwareGMFMapTest;
import org.muml.pm.hardware.tests.packages.HardwarePluginXmlPackageTest;

@RunWith(Suite.class)
@SuiteClasses({ HardwareMetamodelTest.class, HardwareGenmodelTest.class,
		HardwarePluginXmlPackageTest.class, HardwareValidateMetamodelsTest.class,
		HardwareDiagramPluginXmlTest.class, HardwareGMFMapTest.class, PMQVTOCompileTest.class })
public class MumlHardwareTestSuite {
	// empty
}
