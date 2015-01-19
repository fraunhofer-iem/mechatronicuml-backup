package de.uni_paderborn.fujaba.muml.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.uni_paderborn.fujaba.muml.tests.gmf.PimGMFMapTest;
import de.uni_paderborn.fujaba.muml.tests.packages.PimPluginXmlPackageTest;
import de.uni_paderborn.fujaba.tests.QVTOCompileErrorTest;

@RunWith(Suite.class)
@SuiteClasses({ PimMetamodelTest.class, PimGenmodelTest.class,
		PimPluginXmlPackageTest.class, PimValidateMetamodelsTest.class,
		PimDiagramPluginXmlTest.class, PimGMFMapTest.class, QVTOCompileErrorTest.class })
public class MumlTestSuite {
	// empty
}
