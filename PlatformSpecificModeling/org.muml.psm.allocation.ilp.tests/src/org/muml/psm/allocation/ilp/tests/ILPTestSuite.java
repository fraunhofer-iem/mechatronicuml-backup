package org.muml.psm.allocation.ilp.tests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	ILPMetamodelTest.class,
	ILPGenmodelTest.class,
	ILPValidateMetamodel.class
})
public class ILPTestSuite {
}
