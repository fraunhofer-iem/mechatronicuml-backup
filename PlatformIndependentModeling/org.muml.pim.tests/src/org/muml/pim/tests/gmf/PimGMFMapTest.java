package org.muml.pim.tests.gmf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.core.tests.gmf.GMFMapTest;

@RunWith(Parameterized.class)
public class PimGMFMapTest extends GMFMapTest {

	public PimGMFMapTest(String gmfmap) {
		super(gmfmap);
	}

	/**
	 * return gmfmap-models which should be test.
	 */
	@Parameters
	public static Collection<Object[]> getMappingModels() {
		List<Object[]> mappingModels = new ArrayList<Object[]>();
		mappingModels.add(new Object[] { "org.muml.pim.component.diagram/model/component.gmfmap" });
		mappingModels.add(new Object[] { "org.muml.pim.componentinstanceconfiguration.diagram/model/componentinstanceconfiguration.gmfmap" });
		mappingModels.add(new Object[] { "org.muml.pim.realtimestatechart.diagram/model/realtimestatechart.gmfmap" });
		return mappingModels;
	}

}
