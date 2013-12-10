package de.uni_paderborn.fujaba.muml.hardware.tests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;





@RunWith(Suite.class)
@SuiteClasses({ ConstraintTest.class, DerivationTest.class, DiagramPluginXmlTest.class, NotExtendableElementTest.class, PSMGenModelTest.class, PSMGMFMapExpressionLabelTest.class,PSMGMFMapLinkConstraintTest.class})
public class HardwareTestSuite {

}
