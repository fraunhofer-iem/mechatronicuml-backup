package de.uni_paderborn.fujaba.muml.hardware.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.uni_paderborn.fujaba.muml.hardware.tests.gmf.HardwareGMFMapTest;
import de.uni_paderborn.fujaba.muml.hardware.tests.packages.HardwarePluginXmlPackageTest;

@RunWith(Suite.class)
@SuiteClasses({ HardwareMetamodelTest.class, HardwareGenmodelTest.class,
		HardwarePluginXmlPackageTest.class, HardwareValidateMetamodelsTest.class,
		HardwareDiagramPluginXmlTest.class, HardwareGMFMapTest.class })
public class MumlHardwareTestSuite {
	// empty
}
