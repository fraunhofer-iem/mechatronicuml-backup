package de.uni_paderborn.fujaba.muml.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.uni_paderborn.fujaba.properties.PropertiesPackage;
import de.uni_paderborn.fujaba.tests.ValidateMetamodelsTest;

@RunWith(Parameterized.class)
public class PimValidatePropsheetTest extends ValidateMetamodelsTest {

	public PimValidatePropsheetTest(String resourcePath) {
		super(resourcePath);
	}

	@Parameters
	public static Collection<Object[]> getResourcePaths() {
		PropertiesPackage.eINSTANCE.eClass();
		return new ArrayList<Object[]>(Arrays.asList(new Object[][] {
				new Object[] {"de.uni_paderborn.fujaba.muml/model/muml.propsheet"}
		}));
	}
}
