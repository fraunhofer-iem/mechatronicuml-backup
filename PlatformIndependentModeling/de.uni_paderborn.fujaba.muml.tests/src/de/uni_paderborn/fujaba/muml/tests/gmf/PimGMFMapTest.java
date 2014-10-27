package de.uni_paderborn.fujaba.muml.tests.gmf;

import de.uni_paderborn.fujaba.gmf.tests.GMFMapTest;

public class PimGMFMapTest extends GMFMapTest {

	/**
	 * initializes the gmfmap-models which should be test Subclasses should
	 * override this method
	 */
	protected void initGMFMapsToTest() {
		gmfmap_projects.add("de.uni_paderborn.fujaba.muml.component.diagram/model/component.gmfmap");
		gmfmap_projects.add("de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram/model/componentinstanceconfiguration.gmfmap");
		gmfmap_projects.add("de.uni_paderborn.fujaba.muml.realtimestatechart.diagram/model/realtimestatechart.gmfmap");
	}
	
}
