package de.uni_paderborn.fujaba.muml.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.uni_paderborn.fujaba.tests.ValidateMetamodelsTest;

@RunWith(Parameterized.class)
public class PimValidateMetamodelsTest extends ValidateMetamodelsTest {

	public PimValidateMetamodelsTest(String resourcePath) {
		super(resourcePath);
	}

	@Parameters
	public static Collection<Object[]> getResourcePaths() {
		return new ArrayList<Object[]>(Arrays.asList(new Object[][] {
				new Object[] {"org.storydriven.core/model/core.ecore"},
				new Object[] {"de.uni_paderborn.fujaba.muml/model/muml.ecore"},
				new Object[] {"de.uni_paderborn.fujaba.muml.actionlanguage/model/actionlanguage.ecore"}
		}));
	}
}
