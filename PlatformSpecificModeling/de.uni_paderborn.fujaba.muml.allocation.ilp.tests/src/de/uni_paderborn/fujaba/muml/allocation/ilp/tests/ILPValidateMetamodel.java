package de.uni_paderborn.fujaba.muml.allocation.ilp.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.uni_paderborn.fujaba.tests.ValidateMetamodelsTest;

@RunWith(Parameterized.class)
public class ILPValidateMetamodel extends ValidateMetamodelsTest {

	public ILPValidateMetamodel(String resourcePath) {
		super(resourcePath);
	}
	
	@Parameters
	public static Collection<Object[]> getResourcePaths() {
		return new ArrayList<Object[]>(Arrays.asList(new Object[][] {
				new Object[] {"de.uni_paderborn.fujaba.muml.allocation.ilp/model/ilp.ecore"}
		}));
	}

}
