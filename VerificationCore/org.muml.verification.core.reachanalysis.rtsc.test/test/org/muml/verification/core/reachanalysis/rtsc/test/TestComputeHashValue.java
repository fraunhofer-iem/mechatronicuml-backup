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
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.udbm.Federation;
import org.muml.udbm.FederationFactory;
import org.muml.udbm.UDBMClock;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscFactory;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraphState;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;
import org.muml.verification.core.runtime.RuntimeFactory;

public class TestComputeHashValue extends AbstractRTSCTest{
	private RuntimeFactory runtimefactory;
	private RealtimestatechartFactory rtscFactory;
	private RtscFactory rtscReachFactory;
	private FederationFactory fedFactory;

	private RealtimeStatechart rtsc1;
	private RealtimeStatechart rtsc2, root;
	private State state1, state2, state3, state4, parentState;
	private Transition trans1, trans2;
	private Region region1, region2;

	private RealtimeStatechartInstance rtscInstance1;
	private RealtimeStatechartInstance rtscInstance2;

	private ZoneGraphState zone1, zone2;

	private Federation fed1, fed2;

	private TestableRTSCReachabilityComputation reachComputation;

	private HashSet<RealtimeStatechart> rtscs;

	private HashSet<UDBMClock> udbmClocks;

	private UDBMClock cu1, cu2;

	HashSet<org.muml.udbm.ClockConstraint> invariants,
			invariants2;

	@Before
	public void setUp() {
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		           new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		           new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		           new OCLValidationDelegateFactory.Global());
		
		runtimefactory = RuntimeFactory.eINSTANCE;
		rtscFactory = RealtimestatechartFactory.eINSTANCE;
		rtscReachFactory = RtscFactory.eINSTANCE;
		fedFactory = getFederationFactory();

		// set up rtsc objects
		rtsc1 = rtscFactory.createRealtimeStatechart();
		rtsc2 = rtscFactory.createRealtimeStatechart();
		state1 = rtscFactory.createState();
		state1.setParentStatechart(rtsc1);
		state2 = rtscFactory.createState();
		state2.setParentStatechart(rtsc1);
		
		trans1 = rtscFactory.createTransition();
		trans1.setSource(state1);
		trans1.setTarget(state2);
		rtsc1.getTransitions().add(trans1);

		state3 = rtscFactory.createState();
		state3.setParentStatechart(rtsc2);
		state4 = rtscFactory.createState();
		state4.setParentStatechart(rtsc2);
		
		trans2 = rtscFactory.createTransition();
		trans2.setSource(state3);
		trans2.setTarget(state4);
		rtsc2.getTransitions().add(trans2);


		rtscs = new HashSet<RealtimeStatechart>();
		rtscs.add(rtsc1);
		rtscs.add(rtsc2);
		
		root = rtscFactory.createRealtimeStatechart();
		root.setName("root");
		parentState = rtscFactory.createState();
		parentState.setParentStatechart(root);
		parentState.setInitial(true);
		region1 = rtscFactory.createRegion();
		region1.setParentState(parentState);
		region1.setEmbeddedStatechart(rtsc1);

		region2 = rtscFactory.createRegion();
		region2.setParentState(parentState);
		region2.setEmbeddedStatechart(rtsc2);

		// set up runtime objects
		rtscInstance1 = runtimefactory.createRealtimeStatechartInstance();
		rtscInstance2 = runtimefactory.createRealtimeStatechartInstance();

		// set up reach objects
		zone1 = rtscReachFactory.createZoneGraphState();
		zone2 = rtscReachFactory.createZoneGraphState();

		cu1 = new UDBMClock("c1", "c1");
		cu2 = new UDBMClock("c2", "c2");

		udbmClocks = new HashSet<UDBMClock>();
		udbmClocks.add(cu1);
		udbmClocks.add(cu2);
		
		fed1 = fedFactory.createZeroFederation(udbmClocks);
		fed2 = (Federation)fed1.clone();

	}

	@Test
	public void testIdentZones() {
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);

		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActiveVertex(state1);
		zone1.getLocations().add(rtscInstance1);
		zone1.setFederation(fed1);
		reachComputation.computeHashValue(zone1);

		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActiveVertex(state1);
		zone2.getLocations().add(rtscInstance2);
		zone2.setFederation(fed2);
		reachComputation.computeHashValue(zone2);

		assertTrue(zone1.getHash() == zone2.getHash());

	}

	@Test
	public void testNotIdentZones() {
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);

		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActiveVertex(state1);
		zone1.getLocations().add(rtscInstance1);
		reachComputation.computeHashValue(zone1);

		rtscInstance2.setInstanceOf(rtsc2);
		rtscInstance2.setActiveVertex(state3);
		zone2.getLocations().add(rtscInstance2);
		reachComputation.computeHashValue(zone2);

		assertTrue(zone1.getHash() != zone2.getHash());

	}
	
	@Test
	public void testDiffFeds() {
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);

		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActiveVertex(state1);
		zone1.getLocations().add(rtscInstance1);
		zone1.setFederation(fed1);
		reachComputation.computeHashValue(zone1);

		
		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActiveVertex(state1);
		zone2.getLocations().add(rtscInstance2);
		zone2.setFederation(fed2);
		fed2.up();
		reachComputation.computeHashValue(zone2);

		assertTrue(zone1.getHash() != zone2.getHash());

	}

	@Test
	public void testNoFeds() {
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);

		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActiveVertex(state1);
		zone1.getLocations().add(rtscInstance1);
		reachComputation.computeHashValue(zone1);

		
		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActiveVertex(state1);
		zone2.getLocations().add(rtscInstance2);
		reachComputation.computeHashValue(zone2);

		assertTrue(zone1.getHash() == zone2.getHash());

	}
	
	@Test
	public void testDiffActive() {
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);

		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActiveVertex(state1);
		zone1.getLocations().add(rtscInstance1);
		zone1.setFederation(fed1);
		reachComputation.computeHashValue(zone1);

		
		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActiveVertex(state2);
		zone2.getLocations().add(rtscInstance2);
		zone2.setFederation(fed2);
		reachComputation.computeHashValue(zone2);

		assertTrue(zone1.getHash() != zone2.getHash());

	}

}
