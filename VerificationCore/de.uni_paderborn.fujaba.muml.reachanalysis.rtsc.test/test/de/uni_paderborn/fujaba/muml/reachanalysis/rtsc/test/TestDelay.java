package de.uni_paderborn.fujaba.muml.reachanalysis.rtsc.test;

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

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.DelayTransition;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.RtscFactory;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraphState;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.runtime.RealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeFactory;
import de.uni_paderborn.fujaba.udbm.Federation;
import de.uni_paderborn.fujaba.udbm.FederationFactory;
import de.uni_paderborn.fujaba.udbm.SimpleClockConstraint;
import de.uni_paderborn.fujaba.udbm.UDBMClock;
import de.uni_paderborn.fujaba.udbm.clockconstraint.RelationalOperator;
import de.uni_paderborn.fujaba.udbm.java.JavaFederationFactory;
import de.uni_paderborn.fujaba.udbm.ruby.RubyFederationFactory;

public class TestDelay {

	private RuntimeFactory runtimefactory;
	private RealtimestatechartFactory rtscFactory;
	private RtscFactory rtscReachFactory;
	private FederationFactory fedFactory;


	private RealtimeStatechart rtsc1;
	private RealtimeStatechart rtsc2;
	private RealtimeStatechart root;
	private State state1;
	private State state2, parentState;
	private Region region1, region2;

	private RealtimeStatechartInstance rtscInstance1;
	private RealtimeStatechartInstance rtscInstance2;

	private ZoneGraphState zone1;

	private Federation fed1, fed2;

	private TestableRTSCReachabilityComputation reachComputation;

	private HashSet<RealtimeStatechart> rtscs;

	private HashSet<UDBMClock> udbmClocks;


	private UDBMClock cu1, cu2;

	HashSet<de.uni_paderborn.fujaba.udbm.ClockConstraint> invariants, invariants2;

	@Before
	public void setUp() {
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		           new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		           new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		           new OCLValidationDelegateFactory.Global());
		// set up factories
		runtimefactory = RuntimeFactory.eINSTANCE;
		rtscFactory = RealtimestatechartFactory.eINSTANCE;
		rtscReachFactory = RtscFactory.eINSTANCE;


		// set up rtsc objects
		rtsc1 = rtscFactory.createRealtimeStatechart();
		rtsc2 = rtscFactory.createRealtimeStatechart();
		state1 = rtscFactory.createState();
		state1.setParentStatechart(rtsc1);
		state2 = rtscFactory.createState();
		state2.setParentStatechart(rtsc2);

		// c1 = rtscFactory.createClock();
		// c2 = rtscFactory.createClock();

		rtscs = new HashSet<RealtimeStatechart>();
		rtscs.add(rtsc1);
		rtscs.add(rtsc2);

		// set up runtime objects
		rtscInstance1 = runtimefactory.createRealtimeStatechartInstance();
		rtscInstance2 = runtimefactory.createRealtimeStatechartInstance();

		// set up reach objects
		zone1 = rtscReachFactory.createZoneGraphState();

		cu1 = new UDBMClock("c1", "c1");
		cu2 = new UDBMClock("c2", "c2");

		udbmClocks = new HashSet<UDBMClock>();
		udbmClocks.add(cu1);
		udbmClocks.add(cu2);
		
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

	}

	// All c==0 no invariants, Ruby Federation
	@Test
	public void testCZeroRuby() {
		fedFactory = new RubyFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);

		// set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);

		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);

		// set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks);
		fed2 = (Federation) fed1.clone();

		fed2.up();

		// set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone1.getLocations().add(rtscInstance2);

		zone1.setFederation(fed1);

		ZoneGraphState delayState = (ZoneGraphState) reachComputation.delay(
				zone1, null, false, null);

		assertTrue(delayState.getFederation().equals(fed2));
	}

	// All c==0 no invariants, Java Federation
	@Test
	public void testCZeroJava() {
		fedFactory = new JavaFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);

		// set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);

		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);


		// set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks);
		fed2 = (Federation) fed1.clone();

		fed2.up();

		// set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone1.getLocations().add(rtscInstance2);

		zone1.setFederation(fed1);

		ZoneGraphState delayState = (ZoneGraphState) reachComputation.delay(
				zone1, null, false, null);

		assertTrue(delayState.getFederation().equals(fed2));
	}

	// All c==0, with invariants, Ruby Federation
	@Test
	public void testCZeroRubyInv() {
		fedFactory = new RubyFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		invariants = new HashSet<de.uni_paderborn.fujaba.udbm.ClockConstraint>();

		// create invariant(s)
		SimpleClockConstraint constraint = new SimpleClockConstraint(cu1,
				RelationalOperator.LessOperator, 10);
		invariants.add(constraint);
		SimpleClockConstraint constraint2 = new SimpleClockConstraint(cu2,
				RelationalOperator.GreaterOperator, 10);
		invariants.add(constraint2);

		// set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);

		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);


		// set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks);
		fed2 = (Federation) fed1.clone();

		fed2.up();
		fed2.and(invariants);

		// set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone1.getLocations().add(rtscInstance2);

		zone1.setFederation(fed1);

		ZoneGraphState delayState = (ZoneGraphState) reachComputation.delay(
				zone1, invariants, false, null);

		assertTrue(delayState.getFederation().equals(fed2));
		
	}

	// All c==0, with invariants, Java Federation
	@Test
	public void testCZeroJavaInv() {
		fedFactory = new JavaFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		invariants = new HashSet<de.uni_paderborn.fujaba.udbm.ClockConstraint>();

		// create invariant(s)
		SimpleClockConstraint constraint = new SimpleClockConstraint(cu1,
				RelationalOperator.LessOperator, 10);
		invariants.add(constraint);
		SimpleClockConstraint constraint2 = new SimpleClockConstraint(cu2,
				RelationalOperator.GreaterOperator, 10);
		invariants.add(constraint2);

		// set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);

		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);


		// set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks);
		fed2 = (Federation) fed1.clone();

		fed2.up();
		fed2.and(invariants);

		// set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone1.getLocations().add(rtscInstance2);

		zone1.setFederation(fed1);

		ZoneGraphState delayState = (ZoneGraphState) reachComputation.delay(
				zone1, invariants, false, null);

		assertTrue(delayState.getFederation().equals(fed2));
	}

	@Test
	public void testCNotZeroRuby() {
		fedFactory = new RubyFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		invariants = new HashSet<de.uni_paderborn.fujaba.udbm.ClockConstraint>();

		// create invariant(s)
		SimpleClockConstraint constraint = new SimpleClockConstraint(cu1,
				RelationalOperator.GreaterOrEqualOperator, 10);
		invariants.add(constraint);
		SimpleClockConstraint constraint2 = new SimpleClockConstraint(cu2,
				RelationalOperator.LessOrEqualOperator, 10);
		invariants.add(constraint2);

		// set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);

		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);

		// set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks);
		fed1.up();
		fed1.and(invariants);
		
		fed2 = (Federation) fed1.clone();

		fed2.up();

		// set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone1.getLocations().add(rtscInstance2);

		zone1.setFederation(fed1);

		ZoneGraphState delayState = (ZoneGraphState) reachComputation.delay(
				zone1, null, false, null);

		assertTrue(delayState.getFederation().equals(fed2));

	}
	
	@Test
	public void testCNotZeroJava() {
		fedFactory = new JavaFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		invariants = new HashSet<de.uni_paderborn.fujaba.udbm.ClockConstraint>();

		// create invariant(s)
		SimpleClockConstraint constraint = new SimpleClockConstraint(cu1,
				RelationalOperator.GreaterOrEqualOperator, 10);
		invariants.add(constraint);
		SimpleClockConstraint constraint2 = new SimpleClockConstraint(cu2,
				RelationalOperator.LessOrEqualOperator, 10);
		invariants.add(constraint2);

		// set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);

		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);


		// set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks);
		fed1.up();
		fed1.and(invariants);
		
		fed2 = (Federation) fed1.clone();

		fed2.up();

		// set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone1.getLocations().add(rtscInstance2);

		zone1.setFederation(fed1);

		ZoneGraphState delayState = (ZoneGraphState) reachComputation.delay(
				zone1, null, false, null);

		assertTrue(delayState.getFederation().equals(fed2));

	}

	@Test
	public void testCNotZeroRubyInv() {
		fedFactory = new RubyFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		invariants = new HashSet<de.uni_paderborn.fujaba.udbm.ClockConstraint>();
		invariants2 = new HashSet<de.uni_paderborn.fujaba.udbm.ClockConstraint>();

		// create invariant(s)
		SimpleClockConstraint constraint = new SimpleClockConstraint(cu1,
				RelationalOperator.GreaterOrEqualOperator, 10);
		invariants.add(constraint);
		SimpleClockConstraint constraint2 = new SimpleClockConstraint(cu2,
				RelationalOperator.LessOrEqualOperator, 10);
		invariants.add(constraint2);
		
		SimpleClockConstraint constraint3 = new SimpleClockConstraint(cu1,
				RelationalOperator.GreaterOperator, 20);
		invariants.add(constraint3);
		SimpleClockConstraint constraint4 = new SimpleClockConstraint(cu2,
				RelationalOperator.LessOperator, 20);
		invariants.add(constraint4);

		// set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);

		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);


		// set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks);
		fed1.up();
		fed1.and(invariants);
		
		fed2 = (Federation) fed1.clone();
		fed2.up();
		fed2.and(invariants2);

		// set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone1.getLocations().add(rtscInstance2);

		zone1.setFederation(fed1);

		ZoneGraphState delayState = (ZoneGraphState) reachComputation.delay(
				zone1, invariants, false, null);

		assertTrue(delayState.getFederation().equals(fed2));

	}

	@Test
	public void testCNotZeroJavaInv() {
		fedFactory = new JavaFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		invariants = new HashSet<de.uni_paderborn.fujaba.udbm.ClockConstraint>();
		invariants2 = new HashSet<de.uni_paderborn.fujaba.udbm.ClockConstraint>();

		// create invariant(s)
		SimpleClockConstraint constraint = new SimpleClockConstraint(cu1,
				RelationalOperator.GreaterOrEqualOperator, 10);
		invariants.add(constraint);
		SimpleClockConstraint constraint2 = new SimpleClockConstraint(cu2,
				RelationalOperator.LessOrEqualOperator, 10);
		invariants.add(constraint2);
		
		SimpleClockConstraint constraint3 = new SimpleClockConstraint(cu1,
				RelationalOperator.GreaterOperator, 20);
		invariants.add(constraint3);
		SimpleClockConstraint constraint4 = new SimpleClockConstraint(cu2,
				RelationalOperator.LessOperator, 20);
		invariants.add(constraint4);

		// set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);

		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);


		// set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks);
		fed1.up();
		fed1.and(invariants);
		
		fed2 = (Federation) fed1.clone();
		fed2.up();
		fed2.and(invariants2);

		// set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone1.getLocations().add(rtscInstance2);

		zone1.setFederation(fed1);

		ZoneGraphState delayState = (ZoneGraphState) reachComputation.delay(
				zone1, invariants, false, null);

		assertTrue(delayState.getFederation().equals(fed2));

	}
	
	@Test
	public void testStateIsReachedByDelayRuby(){
		fedFactory = new RubyFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);

		// set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);

		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);

		// set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks);

		// set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone1.getLocations().add(rtscInstance2);
		
		

		zone1.setFederation(fed1);

		ZoneGraphState delayState = (ZoneGraphState) reachComputation.delay(
				zone1, null, false, null);
		
		
		DelayTransition delayTransition = rtscReachFactory.createDelayTransition();
		delayTransition.setTarget(delayState);
		delayTransition.setSource(zone1);
		
		ZoneGraphState delayState2 = (ZoneGraphState)reachComputation.delay(delayState,null, false, null);

		assertTrue(delayState2 == null);
		
	}
	
	@Test
	public void testStateIsReachedByDelayJava(){
		fedFactory = new JavaFederationFactory();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);

		// set up runtime objects
		rtscInstance1.setInstanceOf(rtsc1);
		rtscInstance1.setActive(state1);

		rtscInstance2.setInstanceOf(rtsc1);
		rtscInstance2.setActive(state1);

		// set up federations
		fed1 = fedFactory.createZeroFederation(udbmClocks);

		// set up reach objects
		zone1.getLocations().add(rtscInstance1);
		zone1.getLocations().add(rtscInstance2);
		
		

		zone1.setFederation(fed1);

		ZoneGraphState delayState = (ZoneGraphState) reachComputation.delay(
				zone1, null, false, null);
		
		
		DelayTransition delayTransition = rtscReachFactory.createDelayTransition();
		delayTransition.setTarget(delayState);
		delayTransition.setSource(zone1);
		
		ZoneGraphState delayState2 = (ZoneGraphState)reachComputation.delay(delayState,null, false, null);

		assertTrue(delayState2 == null);
		
	}


}
