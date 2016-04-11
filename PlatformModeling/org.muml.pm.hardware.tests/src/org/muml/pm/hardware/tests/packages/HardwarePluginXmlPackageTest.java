package org.muml.pm.hardware.tests.packages;

import java.util.Collection;
import java.util.Collections;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.core.tests.packages.PluginXmlPackageTest;

@RunWith(Parameterized.class)
public class HardwarePluginXmlPackageTest extends PluginXmlPackageTest {

	public HardwarePluginXmlPackageTest(String pluginName, String modelFile) {
		super(pluginName, modelFile);
	}

	@Parameters
	public static Collection<Object[]> getData() {
		return Collections.singleton(new Object[] {"org.muml.pm.hardware", "model/hardware.ecore"});
	}
}
