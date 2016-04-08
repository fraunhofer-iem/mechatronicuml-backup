package org.muml.pim.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.core.tests.ValidateMetamodelsTest;

@RunWith(Parameterized.class)
public class PimValidateMetamodelsTest extends ValidateMetamodelsTest {

	public PimValidateMetamodelsTest(String resourcePath) {
		super(resourcePath);
	}

	@Parameters
	public static Collection<Object[]> getResourcePaths() {
		return new ArrayList<Object[]>(Arrays.asList(new Object[][] {
				new Object[] {"org.muml.core/model/core.ecore"},
				new Object[] {"org.muml.pim/model/pim.ecore"},
				new Object[] {"org.muml.pim.actionlanguage/model/actionlanguage.ecore"}
		}));
	}
}
