package org.muml.verification.core.reachanalysis.rtsc.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.junit.Before;
import org.junit.Test;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.mumlcore.expressions.common.CommonExpressionsFactory;
import org.muml.mumlcore.expressions.common.ComparingOperator;
import org.muml.mumlcore.expressions.common.LiteralExpression;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.pim.realtimestatechart.SynchronizationKind;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.pim.types.PrimitiveTypes;
import org.muml.pim.types.TypesFactory;
import org.muml.pim.valuetype.TimeValue;
import org.muml.pim.valuetype.ValuetypeFactory;
import org.muml.udbm.ClockZone;
import org.muml.udbm.Federation;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.DelayTransition;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraphState;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;

public class TestComputeSuccessors extends AbstractRTSCTest {

	private RealtimestatechartFactory rtscFactory;

	private ValuetypeFactory valueTypeFactory;

	private RealtimeStatechart rtsc1, rtsc2, root;
	private State state1, state2, state3, state4, parentState, state5;
	private Region region1, region2;
	private Transition transition1, transition2, transition3;
	private SynchronizationChannel syncChannel;
	private Synchronization sync1, sync2;
	private Clock c1, c2;
	private ClockConstraint cCon1, cCon2;

	private TimeValue tnn1, tnn2;

	private ZoneGraphState zone1;

	private HashSet<RealtimeStatechart> rtscs;

	private TestableRTSCReachabilityComputation reachComputation;

	private HashSet<ReachabilityGraphState> successors;

	@Before
	public void setUp() {

		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE
				.put("http://www.eclipse.org/emf/2002/Ecore/OCL", new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE
				.put("http://www.eclipse.org/emf/2002/Ecore/OCL", new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
				new OCLValidationDelegateFactory.Global());

		rtscFactory = RealtimestatechartFactory.eINSTANCE;
		valueTypeFactory = ValuetypeFactory.eINSTANCE;

		// setUp rtsc Elements

		syncChannel = rtscFactory.createSynchronizationChannel();
		syncChannel.setName("sync");

		rtsc1 = rtscFactory.createRealtimeStatechart();
		rtsc1.setName("rtsc1");

		state1 = rtscFactory.createState();
		state1.setParentStatechart(rtsc1);
		state1.setInitial(true);
		state1.setName("state1");

		state2 = rtscFactory.createState();
		state2.setParentStatechart(rtsc1);
		state2.setName("state2");

		transition1 = rtscFactory.createTransition();
		rtsc1.getTransitions().add(transition1);
		transition1.setSource(state1);
		transition1.setTarget(state2);
		transition1.setUrgent(false);

		rtsc2 = rtscFactory.createRealtimeStatechart();
		rtsc2.setName("rtsc2");

		state3 = rtscFactory.createState();
		state3.setParentStatechart(rtsc2);
		state3.setInitial(true);
		state3.setName("state3");

		state4 = rtscFactory.createState();
		state4.setParentStatechart(rtsc2);
		state4.setName("state4");

		transition2 = rtscFactory.createTransition();
		rtsc2.getTransitions().add(transition2);
		transition2.setSource(state3);
		transition2.setTarget(state4);
		transition2.setUrgent(false);

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

	}

	// TODO deprecated?
	@Test
	public void testInfinityConstraint() {

		c1 = rtscFactory.createClock();
		c1.setName("c1");
		c1.setStatechart(rtsc1);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("5");

		tnn1 = valueTypeFactory.createTimeValue();
		tnn1.setValue(value);

		cCon1 = rtscFactory.createClockConstraint();
		cCon1.setBound(tnn1);
		cCon1.setClock(c1);
		cCon1.setOperator(ComparingOperator.LESS_OR_EQUAL);
		// cCon1.getBound().getValue().setInfinity(true);
		transition1.getClockConstraints().add(cCon1);

		rtscs.clear();
		rtscs.add(rtsc1);
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		zone1.getFederation().up();

		successors = reachComputation.computeSuccessors(zone1);

		boolean rtsc1Fired = false;
		for (ReachabilityGraphState successor : successors) {

			for (RealtimeStatechartInstance rtscInstance : ((ZoneGraphState) successor).getLocations()) {

				if (rtscInstance.getInstanceOf().equals(rtsc1) && rtscInstance.getActiveVertex().equals(state2)) {
					rtsc1Fired = true;
				}

			}

		}
		assertTrue(rtsc1Fired);
	}

	@Test
	public void testSynchronization() {
		// setUp synchronizations
		sync1 = rtscFactory.createSynchronization();
		sync1.setKind(SynchronizationKind.RECEIVE);
		sync1.setSyncChannel(syncChannel);

		transition1.setSynchronization(sync1);

		sync2 = rtscFactory.createSynchronization();
		sync2.setKind(SynchronizationKind.SEND);
		sync2.setSyncChannel(syncChannel);

		transition2.setSynchronization(sync2);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		successors = reachComputation.computeSuccessors(zone1);

		for (ReachabilityGraphState successor : successors) {
			for (RealtimeStatechartInstance rtscInstance : ((ZoneGraphState) successor).getLocations()) {
				assertTrue((rtscInstance.getInstanceOf().equals(rtsc1) && rtscInstance.getActiveVertex().equals(state2))
						|| (rtscInstance.getInstanceOf().equals(rtsc2) && rtscInstance.getActiveVertex().equals(state4))
						|| rtscInstance.getInstanceOf().equals(root));
			}
		}

	}

	@Test
	public void testSynchronizationNoClocks() {
		rtsc1.getClocks().clear();
		rtsc2.getClocks().clear();
		// setUp synchronizations
		sync1 = rtscFactory.createSynchronization();
		sync1.setKind(SynchronizationKind.RECEIVE);
		sync1.setSyncChannel(syncChannel);

		transition1.setSynchronization(sync1);

		sync2 = rtscFactory.createSynchronization();
		sync2.setKind(SynchronizationKind.SEND);
		sync2.setSyncChannel(syncChannel);

		transition2.setSynchronization(sync2);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		successors = reachComputation.computeSuccessors(zone1);

		for (ReachabilityGraphState successor : successors) {
			for (RealtimeStatechartInstance rtscInstance : ((ZoneGraphState) successor).getLocations()) {
				assertTrue((rtscInstance.getInstanceOf().equals(rtsc1) && rtscInstance.getActiveVertex().equals(state2))
						|| (rtscInstance.getInstanceOf().equals(rtsc2) && rtscInstance.getActiveVertex().equals(state4))
						|| rtscInstance.getInstanceOf().equals(root));
			}
		}

	}

	@Test
	public void testSynchronizationSelectorExpressions() {
		rtsc1.getClocks().clear();
		rtsc2.getClocks().clear();
		// set up literal expression
		LiteralExpression litExp1 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		litExp1.setValue("1");

		LiteralExpression litExp2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		litExp2.setValue("1");

		LiteralExpression litExp3 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		litExp3.setValue("2");

		// set data type for selector
		PrimitiveDataType dataType = TypesFactory.eINSTANCE.createPrimitiveDataType();
		dataType.setPrimitiveType(PrimitiveTypes.INT32);
		syncChannel.setSelectorType(dataType);

		// setUp synchronizations
		sync1 = rtscFactory.createSynchronization();
		sync1.setKind(SynchronizationKind.RECEIVE);
		sync1.setSyncChannel(syncChannel);
		sync1.setSelectorExpression(litExp1);

		transition1.setSynchronization(sync1);

		sync2 = rtscFactory.createSynchronization();
		sync2.setKind(SynchronizationKind.SEND);
		sync2.setSyncChannel(syncChannel);
		sync2.setSelectorExpression(litExp2);

		transition2.setSynchronization(sync2);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		successors = reachComputation.computeSuccessors(zone1);

		for (ReachabilityGraphState successor : successors) {
			for (RealtimeStatechartInstance rtscInstance : ((ZoneGraphState) successor).getLocations()) {
				assertTrue((rtscInstance.getInstanceOf().equals(rtsc1) && rtscInstance.getActiveVertex().equals(state2))
						|| (rtscInstance.getInstanceOf().equals(rtsc2) && rtscInstance.getActiveVertex().equals(state4))
						|| rtscInstance.getInstanceOf().equals(root));
			}
		}

		sync2.setSelectorExpression(litExp3);

		successors = reachComputation.computeSuccessors(zone1);

		for (ReachabilityGraphState successor : successors) {
			for (RealtimeStatechartInstance rtscInstance : ((ZoneGraphState) successor).getLocations()) {
				assertTrue((rtscInstance.getInstanceOf().equals(rtsc1) && rtscInstance.getActiveVertex().equals(state2))
						|| (rtscInstance.getInstanceOf().equals(rtsc2) && rtscInstance.getActiveVertex().equals(state3))
						|| rtscInstance.getInstanceOf().equals(root));
			}
		}
	}

	@Test
	public void testTauTransition() {

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		successors = reachComputation.computeSuccessors(zone1);

		for (ReachabilityGraphState successor : successors) {
			boolean rtsc1Fired = false;
			boolean rtsc2Fired = false;
			for (RealtimeStatechartInstance rtscInstance : ((ZoneGraphState) successor).getLocations()) {

				if (!rtsc1Fired && !rtsc2Fired) {
					if (rtscInstance.getInstanceOf().equals(rtsc1) && rtscInstance.getActiveVertex().equals(state2)) {
						rtsc1Fired = true;
					}
					if ((rtscInstance.getInstanceOf().equals(rtsc2) && rtscInstance.getActiveVertex().equals(state4))) {
						rtsc2Fired = true;
					}
					continue;
				}

				if (rtsc1Fired && !(rtscInstance.getInstanceOf().equals(root))) {
					assertTrue(rtscInstance.getInstanceOf().equals(rtsc2)
							&& rtscInstance.getActiveVertex().equals(state3));
				}

				if (rtsc2Fired && !(rtscInstance.getInstanceOf().equals(root))) {
					assertTrue(rtscInstance.getInstanceOf().equals(rtsc1)
							&& rtscInstance.getActiveVertex().equals(state1));
				}

			}
		}
	}

	@Test
	public void testTauTransitionNoClocks() {
		rtsc1.getClocks().clear();
		rtsc2.getClocks().clear();
		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		successors = reachComputation.computeSuccessors(zone1);

		for (ReachabilityGraphState successor : successors) {
			boolean rtsc1Fired = false;
			boolean rtsc2Fired = false;
			for (RealtimeStatechartInstance rtscInstance : ((ZoneGraphState) successor).getLocations()) {

				if (!rtsc1Fired && !rtsc2Fired) {
					if (rtscInstance.getInstanceOf().equals(rtsc1) && rtscInstance.getActiveVertex().equals(state2)) {
						rtsc1Fired = true;
					}
					if ((rtscInstance.getInstanceOf().equals(rtsc2) && rtscInstance.getActiveVertex().equals(state4))) {
						rtsc2Fired = true;
					}
					continue;
				}

				if (rtsc1Fired && !(rtscInstance.getInstanceOf().equals(root))) {
					assertTrue(rtscInstance.getInstanceOf().equals(rtsc2)
							&& rtscInstance.getActiveVertex().equals(state3));
				}

				if (rtsc2Fired && !(rtscInstance.getInstanceOf().equals(root))) {
					assertTrue(rtscInstance.getInstanceOf().equals(rtsc1)
							&& rtscInstance.getActiveVertex().equals(state1));
				}

			}
		}
	}

	@Test
	public void testSynchronizationWithClockConstraintTrue() {

		sync1 = rtscFactory.createSynchronization();
		sync1.setKind(SynchronizationKind.RECEIVE);
		sync1.setSyncChannel(syncChannel);

		transition1.setSynchronization(sync1);

		sync2 = rtscFactory.createSynchronization();
		sync2.setKind(SynchronizationKind.SEND);
		sync2.setSyncChannel(syncChannel);

		transition2.setSynchronization(sync2);

		c1 = rtscFactory.createClock();
		c1.setName("c1");
		c1.setStatechart(rtsc1);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("0");
		tnn1 = valueTypeFactory.createTimeValue();
		tnn1.setValue(value);

		cCon1 = rtscFactory.createClockConstraint();
		cCon1.setBound(tnn1);
		cCon1.setClock(c1);
		cCon1.setOperator(ComparingOperator.EQUAL);
		transition1.getClockConstraints().add(cCon1);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		successors = reachComputation.computeSuccessors(zone1);

		// following zones should exists because synchronization can fire
		for (ReachabilityGraphState successor : successors) {
			assertFalse(((ZoneGraphState) successor).getFederation().isEmpty());
			for (RealtimeStatechartInstance rtscInstance : ((ZoneGraphState) successor).getLocations()) {
				assertTrue((rtscInstance.getInstanceOf().equals(rtsc1) && rtscInstance.getActiveVertex().equals(state2))
						|| (rtscInstance.getInstanceOf().equals(rtsc2) && rtscInstance.getActiveVertex().equals(state4))
						|| rtscInstance.getInstanceOf().equals(root)
								&& rtscInstance.getActiveVertex().equals(parentState)
						|| successor.getIncomingTransitions().get(0) instanceof DelayTransition);
			}
		}

	}

	@Test
	public void testSynchronizationWithClockConstraintFalse() {

		sync1 = rtscFactory.createSynchronization();
		sync1.setKind(SynchronizationKind.RECEIVE);
		sync1.setSyncChannel(syncChannel);

		transition1.setSynchronization(sync1);

		sync2 = rtscFactory.createSynchronization();
		sync2.setKind(SynchronizationKind.SEND);
		sync2.setSyncChannel(syncChannel);

		transition2.setSynchronization(sync2);

		c1 = rtscFactory.createClock();
		c1.setName("c1");
		c1.setStatechart(rtsc1);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("0");

		tnn1 = valueTypeFactory.createTimeValue();
		tnn1.setValue(value);

		cCon1 = rtscFactory.createClockConstraint();
		cCon1.setBound(tnn1);
		cCon1.setClock(c1);
		cCon1.setOperator(ComparingOperator.EQUAL);
		transition1.getClockConstraints().add(cCon1);

		c2 = rtscFactory.createClock();
		c2.setName("c2");
		c2.setStatechart(rtsc2);

		LiteralExpression value2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value2.setValue("10");

		tnn2 = valueTypeFactory.createTimeValue();
		tnn2.setValue(value2);

		cCon2 = rtscFactory.createClockConstraint();
		cCon2.setBound(tnn2);
		cCon2.setClock(c2);
		cCon2.setOperator(ComparingOperator.GREATER);
		transition2.getClockConstraints().add(cCon2);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		successors = reachComputation.computeSuccessors(zone1);

		// Delay state should be only successor because synchronizations cannot
		// fire
		for (ReachabilityGraphState successor : successors) {
			assertTrue(successor.getIncomingTransitions().get(0) instanceof DelayTransition);
		}
	}

	@Test
	public void testTauTransitionWithClockConstraintsTrue() {

		c1 = rtscFactory.createClock();
		c1.setName("c1");
		c1.setStatechart(rtsc1);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("0");

		tnn1 = valueTypeFactory.createTimeValue();
		tnn1.setValue(value);

		cCon1 = rtscFactory.createClockConstraint();
		cCon1.setBound(tnn1);
		cCon1.setClock(c1);
		cCon1.setOperator(ComparingOperator.EQUAL);
		transition1.getClockConstraints().add(cCon1);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.createInitialState();
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		successors = reachComputation.computeSuccessors(zone1);

		for (ReachabilityGraphState successor : successors) {
			boolean rtsc1Fired = false;
			boolean rtsc2Fired = false;
			for (RealtimeStatechartInstance rtscInstance : ((ZoneGraphState) successor).getLocations()) {

				if (!rtsc1Fired && !rtsc2Fired) {
					if (rtscInstance.getInstanceOf().equals(rtsc1) && rtscInstance.getActiveVertex().equals(state2)) {
						rtsc1Fired = true;
					}
					if ((rtscInstance.getInstanceOf().equals(rtsc2) && rtscInstance.getActiveVertex().equals(state4))) {
						rtsc2Fired = true;
					}
					continue;
				}

				if (rtsc1Fired && !(rtscInstance.getInstanceOf().equals(root))) {
					assertTrue(rtscInstance.getInstanceOf().equals(rtsc2)
							&& rtscInstance.getActiveVertex().equals(state3));
				}

				if (rtsc2Fired && !(rtscInstance.getInstanceOf().equals(root))) {
					assertTrue(rtscInstance.getInstanceOf().equals(rtsc1)
							&& rtscInstance.getActiveVertex().equals(state1));
				}

			}
		}

	}

	@Test
	public void testTauTransitionWithClockConstraintsFalse() {

		c1 = rtscFactory.createClock();
		c1.setName("c1");
		c1.setStatechart(rtsc1);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("0");

		tnn1 = valueTypeFactory.createTimeValue();
		tnn1.setValue(value);

		cCon1 = rtscFactory.createClockConstraint();
		cCon1.setBound(tnn1);
		cCon1.setClock(c1);
		cCon1.setOperator(ComparingOperator.EQUAL);
		transition1.getClockConstraints().add(cCon1);

		c2 = rtscFactory.createClock();
		c2.setName("c2");
		c2.setStatechart(rtsc2);

		LiteralExpression value2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value2.setValue("10");

		tnn2 = valueTypeFactory.createTimeValue();
		tnn2.setValue(value2);

		cCon2 = rtscFactory.createClockConstraint();
		cCon2.setBound(tnn2);
		cCon2.setClock(c2);
		cCon2.setOperator(ComparingOperator.GREATER);
		transition2.getClockConstraints().add(cCon2);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.createInitialState();
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		successors = reachComputation.computeSuccessors(zone1);

		// transition2 should never be fired because the clock constraint can't
		// be true
		for (ReachabilityGraphState successor : successors) {

			for (RealtimeStatechartInstance rtscInstance : ((ZoneGraphState) successor).getLocations()) {

				assertFalse(
						(rtscInstance.getInstanceOf().equals(rtsc2) && rtscInstance.getActiveVertex().equals(state4)));

			}
		}
	}

	// TODO add test with embedded rtscs

	@Test
	public void urgentTauTransitionTrueGuard() {
		state5 = rtscFactory.createState();
		state5.setParentStatechart(rtsc1);

		transition3 = rtscFactory.createTransition();
		rtsc1.getTransitions().add(transition3);
		transition3.setSource(state1);
		transition3.setTarget(state5);
		transition3.setUrgent(false);

		c1 = rtscFactory.createClock();
		c1.setName("c1");
		c1.setStatechart(rtsc1);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("0");

		tnn1 = valueTypeFactory.createTimeValue();
		tnn1.setValue(value);

		cCon1 = rtscFactory.createClockConstraint();
		cCon1.setBound(tnn1);
		cCon1.setClock(c1);
		cCon1.setOperator(ComparingOperator.EQUAL);
		transition1.getClockConstraints().add(cCon1);
		transition1.setUrgent(true);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.createInitialState();
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		successors = reachComputation.computeSuccessors(zone1);

		for (ReachabilityGraphState zone : successors) {
			for (RealtimeStatechartInstance location : ((ZoneGraphState) zone).getLocations()) {
				if (location.getInstanceOf().equals(rtsc1))
					assertTrue(location.getActiveVertex().equals(state2));
			}
		}
	}

	@Test
	public void urgentSynchronizationTrueGuard() {
		state5 = rtscFactory.createState();
		state5.setParentStatechart(rtsc1);

		transition3 = rtscFactory.createTransition();
		rtsc1.getTransitions().add(transition3);
		transition3.setSource(state1);
		transition3.setTarget(state5);
		transition3.setUrgent(false);

		c1 = rtscFactory.createClock();
		c1.setName("c1");
		c1.setStatechart(rtsc1);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("0");

		tnn1 = valueTypeFactory.createTimeValue();
		tnn1.setValue(value);

		cCon1 = rtscFactory.createClockConstraint();
		cCon1.setBound(tnn1);
		cCon1.setClock(c1);
		cCon1.setOperator(ComparingOperator.EQUAL);
		transition1.getClockConstraints().add(cCon1);
		transition1.setUrgent(true);

		transition2.setUrgent(true);

		sync1 = rtscFactory.createSynchronization();
		sync1.setKind(SynchronizationKind.RECEIVE);
		sync1.setSyncChannel(syncChannel);

		transition1.setSynchronization(sync1);

		sync2 = rtscFactory.createSynchronization();
		sync2.setKind(SynchronizationKind.SEND);
		sync2.setSyncChannel(syncChannel);

		transition2.setSynchronization(sync2);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.createInitialState();
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		successors = reachComputation.computeSuccessors(zone1);

		for (ReachabilityGraphState zone : successors) {
			for (RealtimeStatechartInstance location : ((ZoneGraphState) zone).getLocations()) {
				if (location.getInstanceOf().equals(rtsc1))
					assertTrue(location.getActiveVertex().equals(state2));
				if (location.getInstanceOf().equals(rtsc2))
					assertTrue(location.getActiveVertex().equals(state4));
			}
		}
	}

	// synchronized transitions are only urgent, if both of them are urgent
	@Test
	public void onlyOneUrgentSynchronizationTrueGuard() {
		state5 = rtscFactory.createState();
		state5.setParentStatechart(rtsc1);

		transition3 = rtscFactory.createTransition();
		rtsc1.getTransitions().add(transition3);
		transition3.setSource(state1);
		transition3.setTarget(state5);
		transition3.setUrgent(false);

		c1 = rtscFactory.createClock();
		c1.setName("c1");
		c1.setStatechart(rtsc1);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("0");

		tnn1 = valueTypeFactory.createTimeValue();
		tnn1.setValue(value);

		cCon1 = rtscFactory.createClockConstraint();
		cCon1.setBound(tnn1);
		cCon1.setClock(c1);
		cCon1.setOperator(ComparingOperator.EQUAL);
		transition1.getClockConstraints().add(cCon1);
		transition1.setUrgent(true);

		sync1 = rtscFactory.createSynchronization();
		sync1.setKind(SynchronizationKind.RECEIVE);
		sync1.setSyncChannel(syncChannel);

		transition1.setSynchronization(sync1);

		sync2 = rtscFactory.createSynchronization();
		sync2.setKind(SynchronizationKind.SEND);
		sync2.setSyncChannel(syncChannel);

		transition2.setSynchronization(sync2);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.createInitialState();
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		successors = reachComputation.computeSuccessors(zone1);

		boolean state5Entered = false;
		boolean state2Entered = false;
		boolean state4Entered = false;
		for (ReachabilityGraphState zone : successors) {
			for (RealtimeStatechartInstance location : ((ZoneGraphState) zone).getLocations()) {
				if (location.getInstanceOf().equals(rtsc1) && location.getActiveVertex().equals(state2))
					state2Entered = true;
				if (location.getInstanceOf().equals(rtsc1) && location.getActiveVertex().equals(state5))
					state5Entered = true;
				if (location.getInstanceOf().equals(rtsc2) && location.getActiveVertex().equals(state4))
					state4Entered = true;
			}
		}
		assertTrue(state4Entered && state2Entered && state5Entered);
	}

	@Test
	public void urgentTauTransitionFalseGuard() {
		state5 = rtscFactory.createState();
		state5.setParentStatechart(rtsc1);
		state5.setName("state5");

		transition3 = rtscFactory.createTransition();
		rtsc1.getTransitions().add(transition3);
		transition3.setSource(state1);
		transition3.setTarget(state5);
		transition3.setUrgent(false);

		c1 = rtscFactory.createClock();
		c1.setName("c1");
		c1.setStatechart(rtsc1);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("5");

		tnn1 = valueTypeFactory.createTimeValue();
		tnn1.setValue(value);

		cCon1 = rtscFactory.createClockConstraint();
		cCon1.setBound(tnn1);
		cCon1.setClock(c1);
		cCon1.setOperator(ComparingOperator.EQUAL);

		LiteralExpression value2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value2.setValue("6");

		tnn2 = valueTypeFactory.createTimeValue();
		tnn2.setValue(value2);

		cCon2 = rtscFactory.createClockConstraint();
		cCon2.setBound(tnn2);
		cCon2.setClock(c1);
		cCon2.setOperator(ComparingOperator.GREATER);

		transition1.getClockConstraints().add(cCon1);
		transition1.setUrgent(true);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.createInitialState();
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		successors = reachComputation.computeSuccessors(zone1);

		boolean delayed = false;
		for (ReachabilityGraphState zone : successors) {
			if (zone.getIncomingTransitions().get(0) instanceof DelayTransition) {
				delayed = true;
				Federation testFed = (Federation) ((ZoneGraphState) zone).getFederation().clone();
				reachComputation.applyClockConstraint(zone, cCon1, ((ZoneGraphState) zone).getFederation());
				assertFalse(((ZoneGraphState) zone).getFederation().isEmpty());
				reachComputation.applyClockConstraint(zone, cCon2, testFed);
				assertTrue(testFed.isEmpty());

			}

		}
		assertTrue(delayed);
	}

	// test if not urgent transition can fire if guards of urgent transition
	// cannot become true by delaying the federation
	@Test
	public void urgentTauTransitionAlwaysFalseGuard() {
		state5 = rtscFactory.createState();
		state5.setParentStatechart(rtsc1);
		state5.setName("state5");

		transition3 = rtscFactory.createTransition();
		rtsc1.getTransitions().add(transition3);
		transition3.setSource(state1);
		transition3.setTarget(state5);
		transition3.setUrgent(false);

		c1 = rtscFactory.createClock();
		c1.setName("c1");
		c1.setStatechart(rtsc1);

		LiteralExpression value = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value.setValue("0");

		tnn1 = valueTypeFactory.createTimeValue();
		tnn1.setValue(value);

		cCon1 = rtscFactory.createClockConstraint();
		cCon1.setBound(tnn1);
		cCon1.setClock(c1);
		cCon1.setOperator(ComparingOperator.LESS);

		transition1.getClockConstraints().add(cCon1);
		transition1.setUrgent(true);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.createInitialState();
		zone1 = (ZoneGraphState) reachComputation.createInitialState();
		successors = reachComputation.computeSuccessors(zone1);

		Federation testFed = (Federation) zone1.getFederation().clone();
		testFed.up();

		boolean state5entered = false;
		boolean delayed = false;
		for (ReachabilityGraphState zone : successors) {
			if (zone.getIncomingTransitions().get(0) instanceof DelayTransition) {
				delayed = true;
				assertTrue(((ZoneGraphState) zone).getFederation().equals(testFed));
			} else {
				for (RealtimeStatechartInstance location : ((ZoneGraphState) zone).getLocations()) {
					if (location.getInstanceOf().equals(rtsc1) && location.getActiveVertex().equals(state5))
						state5entered = true;
				}
			}

		}
		assertTrue(state5entered);
		assertTrue(delayed);
	}

	// test whether non-urgent transitions can fire in all time intervals urgent
	// transitions are not enabled in
	@Test
	public void testNonUrgentFiring() {
		state5 = rtscFactory.createState();
		state5.setParentStatechart(rtsc1);
		state5.setName("state5");

		transition3 = rtscFactory.createTransition();
		rtsc1.getTransitions().add(transition3);
		transition3.setSource(state1);
		transition3.setTarget(state5);
		transition3.setUrgent(false);

		c1 = rtscFactory.createClock();
		c1.setName("c1");
		c1.setStatechart(rtsc1);

		LiteralExpression value1 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value1.setValue("50");

		tnn1 = valueTypeFactory.createTimeValue();
		tnn1.setValue(value1);

		cCon1 = rtscFactory.createClockConstraint();
		cCon1.setBound(tnn1);
		cCon1.setClock(c1);
		cCon1.setOperator(ComparingOperator.GREATER_OR_EQUAL);

		LiteralExpression value2 = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
		value2.setValue("100");

		tnn2 = valueTypeFactory.createTimeValue();
		tnn2.setValue(value2);

		cCon2 = rtscFactory.createClockConstraint();
		cCon2.setBound(tnn2);
		cCon2.setClock(c1);
		cCon2.setOperator(ComparingOperator.LESS_OR_EQUAL);

		transition1.getClockConstraints().add(cCon1);
		transition1.getClockConstraints().add(cCon2);
		transition1.setUrgent(true);

		reachComputation = new TestableRTSCReachabilityComputation(rtscs);
		reachComputation.createInitialState();
		zone1 = (ZoneGraphState) reachComputation.createInitialState();

		// delay
		zone1.getFederation().up();

		successors = reachComputation.computeSuccessors(zone1);

		for (ReachabilityGraphState zone : successors) {
			for (RealtimeStatechartInstance location : ((ZoneGraphState) zone).getLocations()) {
				if (location.getInstanceOf().equals(rtsc1) && location.getActiveVertex().equals(state5)) {
					Set<? extends ClockZone> zones = ((ZoneGraphState) zone).getFederation().getClockZone();
					assertTrue(zones.size() == 2);
				}
			}
		}
	}

	// TODO add test cases for selector expressions and guards
}
