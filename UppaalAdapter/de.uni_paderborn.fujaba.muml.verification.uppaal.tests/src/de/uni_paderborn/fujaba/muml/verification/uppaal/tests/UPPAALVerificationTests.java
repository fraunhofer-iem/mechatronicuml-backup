package de.uni_paderborn.fujaba.muml.verification.uppaal.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({CompileTransformation.class, MUML2UPPAAL.class, MUML2MUML.class })
public class UPPAALVerificationTests {

}
