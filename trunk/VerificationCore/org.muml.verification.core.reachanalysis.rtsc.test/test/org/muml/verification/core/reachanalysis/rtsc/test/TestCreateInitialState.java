package org.muml.verification.core.reachanalysis.rtsc.test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.junit.Before;
import org.junit.Test;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraphState;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;

public class TestCreateInitialState {

	private RealtimestatechartFactory rtscFactory;

	private RealtimeStatechart rtsc1, rtsc2, parentRtsc, subRtsc;
	private State state1, state2, state3, state4, parentState, subState;
	private Region region1, region2, subRegion;
	private Transition transition1, transition2;
	private SynchronizationChannel syncChannel;
	private Clock c1, c2;

	private RealtimeStatechartInstance embeddedInst;

	private ZoneGraphState initialState;

	private HashSet<RealtimeStatechart> rtscs;

	private TestableRTSCReachabilityComputation reachComputation;

	@Before
	public void setUp() {
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE
				.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
						new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				new OCLValidationDelegateFactory.Global());

		rtscFactory = RealtimestatechartFactory.eINSTANCE;

		// setUp rtsc Elements
		syncChannel = rtscFactory.createSynchronizationChannel();
		syncChannel.setName("sync");

		parentRtsc = rtscFactory.createRealtimeStatechart();
		parentRtsc.setName("root");
		parentState = rtscFactory.createState();
		parentState.setParentStatechart(parentRtsc);
		parentState.setInitial(true);
		region1 = rtscFactory.createRegion();
		region1.setParentState(parentState);
		region2 = rtscFactory.createRegion();
		region2.setParentState(parentState);

		// rtsc1
		rtsc1 = rtscFactory.createRealtimeStatechart();

		state1 = rtscFactory.createState();
		state1.setParentStatechart(rtsc1);
		state1.setInitial(true);

		state2 = rtscFactory.createState();
		state2.setParentStatechart(rtsc1);

		transition1 = rtscFactory.createTransition();
		rtsc1.getTransitions().add(transition1);
		transition1.setSource(state1);
		transition1.setTarget(state2);

		c1 = rtscFactory.createClock();
		c1.setName("c1");
		c1.setStatechart(rtsc1);

		rtsc1.setParentRegion(region1);

		// rtsc2
		rtsc2 = rtscFactory.createRealtimeStatechart();
		rtsc2.setParentRegion(region2);

		state3 = rtscFactory.createState();
		state3.setParentStatechart(rtsc2);
		state3.setInitial(true);

		state4 = rtscFactory.createState();
		state4.setParentStatechart(rtsc2);

		transition2 = rtscFactory.createTransition();
		rtsc2.getTransitions().add(transition2);
		transition2.setSource(state3);
		transition2.setTarget(state4);

		c2 = rtscFactory.createClock();
		c2.setName("c2");
		c2.setStatechart(rtsc2);

		rtscs = new HashSet<RealtimeStatechart>();
		rtscs.add(rtsc1);
		rtscs.add(rtsc2);


	}

	@Test
	public void testSimpleInitState() {
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		initialState = (ZoneGraphState) reachComputation.createInitialState();

		for (RealtimeStatechartInstance rtscInst : initialState.getLocations()) {
			assertTrue(rtscInst.getInstanceOf().equals(rtsc1)
					|| rtscInst.getInstanceOf().equals(rtsc2)
					|| rtscInst.getInstanceOf().equals(parentRtsc));
			if (rtscInst.getInstanceOf().equals(rtsc1)) {
				assertTrue(rtscInst.getActiveVertex().equals(state1));
			}
			if (rtscInst.getInstanceOf().equals(rtsc2)) {
				assertTrue(rtscInst.getActiveVertex().equals(state3));
			}
		}
	}

	@Test
	public void testSubRtsc() {

		subRegion = rtscFactory.createRegion();
		subRegion.setParentState(state1);

		subRtsc = rtscFactory.createRealtimeStatechart();
		subRtsc.setParentRegion(subRegion);
		subRtsc.setName("subRtsc");

		subState = rtscFactory.createState();
		subState.setParentStatechart(subRtsc);
		subState.setInitial(true);
		subState.setName("subState");

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);

		initialState = (ZoneGraphState) reachComputation.createInitialState();

		for (RealtimeStatechartInstance rtscInst : initialState.getLocations()) {
			if (rtscInst.getInstanceOf().equals(subRtsc))
				embeddedInst = rtscInst;
		}

		assertTrue(embeddedInst.getActiveVertex().equals(subState));
	}

	@Test
	public void testNoClocks() {
		rtsc1.getClocks().clear();
		rtsc2.getClocks().clear();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		initialState = (ZoneGraphState) reachComputation.createInitialState();

		for (RealtimeStatechartInstance rtscInst : initialState.getLocations()) {
			assertTrue(rtscInst.getInstanceOf().equals(rtsc1)
					|| rtscInst.getInstanceOf().equals(rtsc2) || rtscInst.getInstanceOf().equals(parentRtsc));
			if (rtscInst.getInstanceOf().equals(rtsc1)) {
				assertTrue(rtscInst.getActiveVertex().equals(state1));
			}
			if (rtscInst.getInstanceOf().equals(rtsc2)) {
				assertTrue(rtscInst.getActiveVertex().equals(state3));
			}
		}

		assertTrue(initialState.getFederation() == null);
	}
}
