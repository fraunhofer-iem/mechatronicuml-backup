package de.uni_paderborn.fujaba.muml.psm.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.core.tests.ValidateMetamodelsTest;

@RunWith(Parameterized.class)
public class PSMValidateMetamodelsTest extends ValidateMetamodelsTest {

	public PSMValidateMetamodelsTest(String resourcePath) {
		super(resourcePath);
	}

	@Parameters
	public static Collection<Object[]> getResourcePaths() {
		return new ArrayList<Object[]>(Arrays.asList(new Object[][] {
//				new Object[] {"org.storydriven.core/model/core.ecore"},
//				new Object[] {"de.uni_paderborn.fujaba.muml/model/muml.ecore"},
//				new Object[] {"de.uni_paderborn.fujaba.muml.actionlanguage/model/actionlanguage.ecore"},
				new Object[] {"de.uni_paderborn.fujaba.muml.psm/model/psm.ecore"}
		}));
	}
}
