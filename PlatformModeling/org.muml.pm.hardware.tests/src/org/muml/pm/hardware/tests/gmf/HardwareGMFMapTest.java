package org.muml.pm.hardware.tests.gmf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.core.tests.gmf.GMFMapTest;
import org.muml.mumlcore.CorePackage;
import org.muml.pim.PimPackage;
import org.muml.pm.hardware.HardwarePackage;

@RunWith(Parameterized.class)
public class HardwareGMFMapTest extends GMFMapTest {

	public HardwareGMFMapTest(String gmfmap) {
		super(gmfmap);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() {
		CorePackage.eINSTANCE.eClass();
		PimPackage.eINSTANCE.eClass();
		HardwarePackage.eINSTANCE.eClass();
	}

	/**
	 * return gmfmap-models which should be test.
	 */
	@Parameters
	public static Collection<Object[]> getMappingModels() {
		List<Object[]> mappingModels = new ArrayList<Object[]>();
		mappingModels.add(new Object[] { "org.muml.pm.hardware.resource.diagram/model/resource.gmfmap" });
		mappingModels.add(new Object[] { "org.muml.pm.hardware.resourceinstance.diagram/model/resourceinstance.gmfmap" });
		mappingModels.add(new Object[] { "org.muml.pm.hardware.platform.diagram/model/platform.gmfmap" });
		mappingModels.add(new Object[] { "org.muml.pm.hardware.platforminstance.diagram/model/platforminstance.gmfmap" });
		return mappingModels;
	}

}
