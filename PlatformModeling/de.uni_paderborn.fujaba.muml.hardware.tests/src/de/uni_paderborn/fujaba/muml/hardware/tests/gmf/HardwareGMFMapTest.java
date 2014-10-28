package de.uni_paderborn.fujaba.muml.hardware.tests.gmf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.gmf.tests.GMFMapTest;
import de.uni_paderborn.fujaba.muml.MumlPackage;
import de.uni_paderborn.fujaba.muml.hardware.HardwarePackage;

@RunWith(Parameterized.class)
public class HardwareGMFMapTest extends GMFMapTest {

	public HardwareGMFMapTest(String gmfmap) {
		super(gmfmap);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() {
		CorePackage.eINSTANCE.eClass();
		MumlPackage.eINSTANCE.eClass();
		HardwarePackage.eINSTANCE.eClass();
	}

	/**
	 * return gmfmap-models which should be test.
	 */
	@Parameters
	public static Collection<Object[]> getMappingModels() {
		List<Object[]> mappingModels = new ArrayList<Object[]>();
		mappingModels.add(new Object[] { "de.uni_paderborn.fujaba.muml.hardware.resource.diagram/model/resource.gmfmap" });
		mappingModels.add(new Object[] { "de.uni_paderborn.fujaba.muml.hardware.resourceinstance.diagram/model/resourceinstance.gmfmap" });
		mappingModels.add(new Object[] { "de.uni_paderborn.fujaba.muml.hardware.platform.diagram/model/platform.gmfmap" });
		mappingModels.add(new Object[] { "de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram/model/platforminstance.gmfmap" });
		return mappingModels;
	}

}
