package de.uni_paderborn.fujaba.muml.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.uni_paderborn.fujaba.gmf.tests.GMFMapExpressionLabelTest;
import de.uni_paderborn.fujaba.gmf.tests.GMFMapLinkConstraintTest;
import de.uni_paderborn.fujaba.muml.tests.packages.EditPluginXmlPackageTest;
import de.uni_paderborn.fujaba.muml.tests.packages.ModelPluginXmlPackageTest;

@RunWith(Suite.class)
@SuiteClasses({ MetamodelOCLTest.class, MetamodelURITest.class, GenmodelTest.class,
		ModelPluginXmlPackageTest.class, EditPluginXmlPackageTest.class,
		ValidateMetamodelsTest.class,
		DiagramPluginXmlTest.class, GMFMapLinkConstraintTest.class, GMFMapExpressionLabelTest.class,
		MetamodelEOperationTest.class})
public class MumlTestSuite {
	// empty
}
