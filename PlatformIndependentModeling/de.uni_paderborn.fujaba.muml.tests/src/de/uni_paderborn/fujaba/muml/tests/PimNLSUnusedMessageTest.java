package de.uni_paderborn.fujaba.muml.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import de.uni_paderborn.fujaba.tests.NLSUnusedMessageTest;

@RunWith(Parameterized.class)
public class PimNLSUnusedMessageTest extends NLSUnusedMessageTest {

	public PimNLSUnusedMessageTest(String[] pluginNames) {
		super(pluginNames);
	}
	
	@Parameters
	public static Collection<Object[]> getPluginIDs() {
		return new ArrayList<Object[]>(Arrays.asList(new Object[][] {
				new Object[] {"de.uni_paderborn.fujaba.muml.component.diagram"},
				new Object[] {"de.uni_paderborn.fujaba.muml.componentinstanceconfiguration.diagram"},
				new Object[] {"de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram"},
				new Object[] {"de.uni_paderborn.fujaba.muml.deployment.diagram"},
				new Object[] {"de.uni_paderborn.fujaba.muml.messagetype.diagram"},
				new Object[] {"de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram"},
				new Object[] {"de.uni_paderborn.fujaba.muml.realtimestatechart.diagram"}
		}));
	}
	
}
