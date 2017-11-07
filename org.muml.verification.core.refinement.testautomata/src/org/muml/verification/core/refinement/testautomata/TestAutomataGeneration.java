package org.muml.verification.core.refinement.testautomata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.TextualExpression;
import org.muml.core.expressions.common.ArithmeticExpression;
import org.muml.core.expressions.common.ArithmeticOperator;
import org.muml.core.expressions.common.CommonExpressionsFactory;
import org.muml.core.expressions.common.ComparingOperator;
import org.muml.core.expressions.common.LiteralExpression;
import org.muml.core.expressions.common.UnaryExpression;
import org.muml.core.expressions.common.UnaryOperator;
import org.muml.pim.actionlanguage.Assignment;
import org.muml.pim.actionlanguage.TypedNamedElementExpression;
import org.muml.pim.behavior.Variable;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.realtimestatechart.AbsoluteDeadline;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.EventKind;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.pim.realtimestatechart.SynchronizationKind;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.TransitionEvent;
import org.muml.pim.types.DataType;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.pim.types.PrimitiveTypes;
import org.muml.pim.types.TypesFactory;
import org.muml.pim.valuetype.NaturalNumber;
import org.muml.pim.valuetype.TimeValue;
import org.muml.pim.valuetype.ValuetypeFactory;
import org.muml.verification.core.actionlanguage.interpreter.ActionLanguageInterpreter;
import org.muml.verification.core.actionlanguage.interpreter.exceptions.UnsupportedModellingElementException;

public class TestAutomataGeneration {
	private RealtimestatechartFactory rtscFactory;
	private ValuetypeFactory valueTypeFactory;
	private RealtimeStatechart parentRtsc, abstractRtsc, testRtsc;

	private HashSet<Variable> globalVariables;

	/**
	 * refined automaton
	 */
	private RealtimeStatechart testRtscCopy;

	/**
	 * abstract automaton (main automaton that is transformed during
	 * testAutomataGeneration)
	 */
	private RealtimeStatechart testAutomaton;

	private State parentState, err, n;
	private Clock cTa;
	private Clock cStep;
	private Region testAutomatonRegion, testRtscRegion;
	private DiscretePort port;
	// maximum value a clock can have
	private static long clockMax;
	private HashMap<MessageType, SynchronizationChannel> channelMapping;
	/**
	 * contains copies of clock constraints in test automaton
	 */
	private HashMap<Transition, EList<ClockConstraint>> originalClockConstraints;
	/**
	 * contains copies of invariants in test automaton
	 */
	private HashMap<State, EList<ClockConstraint>> originalInvariants;
	/**
	 * contains references to transitions in test automaton
	 */
	private HashMap<State, EList<Transition>> originalOutgoingTransitions;
	/**
	 * contains references to objects in test automaton
	 */

	TimeUnit smallestTimeUnit;
	private ArrayList<State> originalStates;
	// private ArrayList<Transition> createdErrTransitions;
	private Refinement[] refinementParameters;

	public TestAutomataGeneration(// HashSet<RealtimeStatechart>rtscs
			DiscretePort port, Refinement[] refinementParameters) {
		rtscFactory = RealtimestatechartFactory.eINSTANCE;
		valueTypeFactory = ValuetypeFactory.eINSTANCE;

		this.port = port;
		// abstract rtsc
		abstractRtsc = (RealtimeStatechart) port.getRefinedRole().getBehavior();
		// refined rtsc
		testRtsc = (RealtimeStatechart) port.getBehavior();

		this.refinementParameters = refinementParameters;
	}
	
	public TestAutomataGeneration(RealtimeStatechart insecureChart, RealtimeStatechart secureChart,
			Refinement[] refinementParameters) {
		rtscFactory = RealtimestatechartFactory.eINSTANCE;
		valueTypeFactory = ValuetypeFactory.eINSTANCE;
		
		abstractRtsc = insecureChart;
		// refined rtsc
		testRtsc = secureChart;

		this.refinementParameters = refinementParameters;
		
		if (globalVariables == null)
			globalVariables = new HashSet<Variable>();
		globalVariables.addAll(secureChart.getVariables());
	}

	public RealtimeStatechart constructTA() {
		parentRtsc = rtscFactory.createRealtimeStatechart();
		parentRtsc.setName("Parent RTSC");

		parentState = rtscFactory.createState();
		parentState.setParentStatechart(parentRtsc);
		parentState.setName("ParentTestState");
		parentState.setInitial(true);

		testAutomatonRegion = rtscFactory.createRegion();
		testAutomatonRegion.setParentState(parentState);

		testRtscRegion = rtscFactory.createRegion();
		testRtscRegion.setParentState(parentState);

		// create copy of root rtsc of abstract rtsc
		RealtimeStatechart absRoot = EcoreUtil.copy(abstractRtsc
				.getHighestParentStatechart());
		// look up refined rtsc's copy in its root's copy
		// TODO change name mapping with EcoreUtil.EqualityHelper()
		testAutomaton = searchRtsc(absRoot, abstractRtsc.getName());

		// Move all variables of parent statecharts to statechart, this also
		// fills HashSet globalVariables.
		// This has to be done before changing the parentRegion
		moveParentVariablesToStatechart(testAutomaton);
		testAutomaton.setParentRegion(testAutomatonRegion);

		// create copy of root rtsc of refined rtsc
		RealtimeStatechart testRoot = EcoreUtil.copy(testRtsc
				.getHighestParentStatechart());
		// look up refined rtsc's copy in its root's copy
		testRtscCopy = searchRtsc(testRoot, testRtsc.getName());

		// Move all variables of parent statecharts to statechart, this also
		// fills HashSet globalVariables.
		// This has to be done before changing the parentRegion
		moveParentVariablesToStatechart(testRtscCopy);
		testRtscCopy.setParentRegion(testRtscRegion);

		// we do not consider synchronizations in refinement analysis
		deleteSynchronizations(testAutomaton);
		deleteSynchronizations(testRtscCopy);

		transformDeadlineToClockConstraint(testAutomaton);
		transformDeadlineToClockConstraint(testRtscCopy);
		
		moveInvariantsToClockConstraints(testRtscCopy);
		moveInvariantsToClockConstraints(testAutomaton);
		
		//make all transitions of refined automaton urgent
		for (Transition curTransition : testRtscCopy.getTransitions())
			curTransition.setUrgent(true);
//		if (globalVariables == null)
//			globalVariables = new HashSet<Variable>();
		adjustToSharedVariables();

		HashSet<RealtimeStatechart> rtscs = new HashSet<RealtimeStatechart>();
		rtscs.add(testAutomaton);
		rtscs.add(testRtscCopy);

		smallestTimeUnit = findSmallestTimeUnit(rtscs);
		convertBoundsToSmallestTimeUnit(rtscs);
		//transformToSmallestTimeUnit(rtscs);
		clockMax = getMaximumBound(rtscs);
		decomposeRaiseTriggerTransitions(testAutomaton);
		decomposeRaiseTriggerTransitions(testRtscCopy);

		// get all variables that are initialized via references to global
		// variables or nondeterministicChoiseExpressions. Since we cannot know
		// their values (just like the values of global variables), we handle
		// them as they were global variables.
		// This has to done before expanding the transitions, because we are
		// adding variables to the set globalVariables, which is used to detect
		// nondeterminism during the transition expansion
		// TODO in case of nondeterministicChoiseExpressions we can smaller the
		// space compared to global variables, rethink this
		globalVariables
				.addAll(getVariablesWithNondeterministicInitilizeExpression(testAutomaton));
		for (RealtimeStatechart curRtsc : getEmbeddedStatecharts(testAutomaton)) {
			globalVariables
					.addAll(getVariablesWithNondeterministicInitilizeExpression(curRtsc));
		}

		globalVariables
				.addAll(getVariablesWithNondeterministicInitilizeExpression(testRtscCopy));
		for (RealtimeStatechart curRtsc : getEmbeddedStatecharts(testRtscCopy)) {
			globalVariables
					.addAll(getVariablesWithNondeterministicInitilizeExpression(curRtsc));
		}
		// for transitions with read references (guards, assignment actions ...)
		// to global variables create new
		// transitions for all values the global variable can have, since
		// another rtsc can change the value of the variable at any time.
		// Same for nondeterministicChoiceExpressions
		expandNondeterminismTransitions(testRtscCopy);
		expandNondeterminismTransitions(testAutomaton);

		// continue for embedded rtscs
		for (RealtimeStatechart curRtsc : getEmbeddedStatecharts(testAutomaton)) {
			expandNondeterminismTransitions(curRtsc);
		}
		for (RealtimeStatechart curRtsc : getEmbeddedStatecharts(testRtscCopy)) {
			expandNondeterminismTransitions(curRtsc);
		}

		// contains references to objects in test automaton
		originalStates = new ArrayList<State>();
		// contains of copies invariants in test auomaton
		originalInvariants = new HashMap<State, EList<ClockConstraint>>();
		// contains copies of clock constraints in test auomaton
		originalClockConstraints = new HashMap<Transition, EList<ClockConstraint>>();
		// contains references to transitions in test automaton
		originalOutgoingTransitions = new HashMap<State, EList<Transition>>();
		// fill maps with original data
		for (State curState : testAutomaton.getStates()) {

			originalStates.add(curState);
			originalInvariants.put(curState, new BasicEList<ClockConstraint>());
			originalOutgoingTransitions.put(curState,
					new BasicEList<Transition>());
			for (ClockConstraint invariant : curState.getInvariants()) {
				originalInvariants.get(curState).add(EcoreUtil.copy(invariant));
			}
			for (Transition outgoingTransition : curState
					.getOutgoingTransitions()) {

				originalOutgoingTransitions.get(curState).add(
						outgoingTransition);
				originalClockConstraints.put(outgoingTransition,
						new BasicEList<ClockConstraint>());

				for (ClockConstraint clockConstraint : outgoingTransition
						.getClockConstraints()) {
					originalClockConstraints.get(outgoingTransition).add(
							EcoreUtil.copy(clockConstraint));
				}

			}

		}

		channelMapping = new HashMap<MessageType, SynchronizationChannel>();

		if (port != null && !port.getReceiverMessageTypes().isEmpty()) {
			for (MessageType msg : port.getReceiverMessageTypes()) {
				SynchronizationChannel syncChannel = rtscFactory
						.createSynchronizationChannel();
				syncChannel.setName(msg.getName());
				syncChannel.setState(parentState);

				channelMapping.put(msg, syncChannel);
			}
		}

		if (port != null && !port.getSenderMessageTypes().isEmpty()) {
			for (MessageType msg : port.getSenderMessageTypes()) {
				if (!channelMapping.containsKey(msg)) {
					SynchronizationChannel syncChannel = rtscFactory
							.createSynchronizationChannel();
					syncChannel.setName(msg.getName());
					syncChannel.setState(parentState);

					channelMapping.put(msg, syncChannel);
				}
			}
		}
		// testRtscCopy.getClocks().clear();
		// testAutomaton.getClocks().clear();
		// transform async into sync
		transformAsyncSync(testRtscCopy, false);
		makeEventTransitionsUrgent(testRtscCopy);

		// transform async into sync and switch directions
		transformAsyncSync(testAutomaton, true);

		transformTestAutomaton();

		makeEventTransitionsNonUrgent(testAutomaton);

		return parentRtsc;
	}

	/**
	 * @return Error state of testautomaton
	 */
	public State getErrorState() {
		return err;
	}

	/**
	 * @return N state of testautomaton
	 */
	public State getNState() {
		return n;
	}

	/**
	 * transforms the asynchronous communication into synchronizations
	 * 
	 * @param rtsc
	 *            the RTSC for which the communication has to be transformed
	 * @param switchdirections
	 */
	protected void transformAsyncSync(RealtimeStatechart rtsc,
			boolean switchdirections) {
		for (Transition transition : rtsc.getTransitions()) {
			if (transition.getRaiseMessageEvent() != null
					&& transition.getRaiseMessageEvent().getMessage()
							.getInstanceOf() != null) {
				Synchronization sync = rtscFactory.createSynchronization();

				if (switchdirections)
					sync.setKind(SynchronizationKind.RECEIVE);
				else
					sync.setKind(SynchronizationKind.SEND);

				sync.setSyncChannel(channelMapping.get(transition
						.getRaiseMessageEvent().getMessage().getInstanceOf()));
				transition.setSynchronization(sync);

			}
			if (transition.getTriggerMessageEvent() != null
					&& transition.getTriggerMessageEvent().getMessage()
							.getInstanceOf() != null) {
				Synchronization sync = rtscFactory.createSynchronization();
				if (switchdirections)
					sync.setKind(SynchronizationKind.SEND);
				else
					sync.setKind(SynchronizationKind.RECEIVE);
				sync.setSyncChannel(channelMapping.get(transition
						.getTriggerMessageEvent().getMessage().getInstanceOf()));
				transition.setSynchronization(sync);

			}
			transition.getEvents().clear();
		}
	}

	/**
	 * transforms the copied abstract RTSC into a test automaton
	 */
	protected void transformTestAutomaton() {
		for (State tmpState : originalStates) {
			// if (!tmpState.isFinal()) {
			for (Refinement refinement : refinementParameters) {
				if (refinement != null) {
					switch (refinement.getDirection().getValue()) {
					case Direction.REFINED_VALUE:
						if (err == null) {
							err = rtscFactory.createState();
							err.setName("Err");
							err.setParentStatechart(testAutomaton);
						}

						transformTowardsRefined(tmpState, refinement);
						break;
					case Direction.ABSTRACT_VALUE:
						if (n == null) {
							n = rtscFactory.createState();
							n.setName("N");
							n.setParentStatechart(testAutomaton);
						}
						transformTowardsAbstract(tmpState, refinement);
						break;
					default:
						break;
					}

				}

			}

			tmpState.getInvariants().clear();

			// }
		}

	}

	/**
	 * adds transitions from source to Err-State and calls widen for existing
	 * transitions
	 * 
	 * @param source
	 *            the actual state
	 * @param requirement
	 *            the requirement as part of the type of refinement
	 */
	protected void transformTowardsRefined(State source, Refinement refinement) {
		for (SynchronizationChannel syncChannel :
		// channelMapping.values()
		source.getParentStatechart().getParentRegion().getParentState()
				.getChannels()) {

			ArrayList<Transition> fittingTransitions;

			// check if requirement has to hold for all transitions or for
			// transitions with receive synchronizations
			if (refinement.getTransitionType().getValue() == TransitionType.OUTGOING_VALUE
					|| refinement.getTransitionType().getValue() == TransitionType.ALL_VALUE) {
				fittingTransitions = syncExists(source, syncChannel,
						SynchronizationKind.RECEIVE);
				if (fittingTransitions.isEmpty()) {
					createTransition(source, err, null, syncChannel,
							SynchronizationKind.RECEIVE, null, false);
				}

				// if transition with particular sync exists, create err
				// transitions with negated clock constraints
				// additionally create err transitions with negated guards
				else {
					EList<ClockConstraint> cConstraints = new BasicEList<ClockConstraint>();
					for (int i = 0; i < fittingTransitions.size(); i++) {
						widen(fittingTransitions.get(i), refinement);
						cConstraints.addAll(fittingTransitions.get(i)
								.getClockConstraints());
					}

					if (!cConstraints.isEmpty()) {
						// create transitions for clock constraints
						for (ClockConstraint cConstraint : cConstraints) {
							for (ClockConstraint negatedCConstraint : negate(cConstraint)) {
								BasicEList<ClockConstraint> c = new BasicEList<ClockConstraint>();
								c.add(negatedCConstraint);
								createTransition(source, err, c, syncChannel,
										SynchronizationKind.RECEIVE, null,
										false);
							}
						}
					}
					// create err transitions with negated guards
					for (Transition curTransition : fittingTransitions) {
						if (curTransition.getGuard() != null) {
							Transition errTransition = createTransition(source,
									err, null, syncChannel,
									SynchronizationKind.RECEIVE, null, false);
							UnaryExpression negatedGuard = CommonExpressionsFactory.eINSTANCE
									.createUnaryExpression();
							negatedGuard.setOperator(UnaryOperator.NOT);
							negatedGuard.setEnclosedExpression(EcoreUtil
									.copy(curTransition.getGuard()));
							errTransition.setGuard(negatedGuard);

						}
					}

				}
			}

			// check if requirement has to hold for all transitions or
			// for transitions with send synchronizations
			if (refinement.getTransitionType().getValue() == TransitionType.INCOMING_VALUE
					|| refinement.getTransitionType().getValue() == TransitionType.ALL_VALUE) {

				fittingTransitions = syncExists(source, syncChannel,
						SynchronizationKind.SEND);
				if (fittingTransitions.isEmpty()) {
					createTransition(source, err, null, syncChannel,
							SynchronizationKind.SEND, null, false);
				}
				// if transition with particular sync exists, create err
				// transitions with negated clock constraints
				// additionally create err transitions with negated guards
				else {
					BasicEList<ClockConstraint> cConstraints = new BasicEList<ClockConstraint>();
					for (int i = 0; i < fittingTransitions.size(); i++) {
						widen(fittingTransitions.get(i), refinement);
						cConstraints.addAll(fittingTransitions.get(i)
								.getClockConstraints());
					}
					if (!cConstraints.isEmpty()) {
						// create transitions for clock constraints
						for (ClockConstraint cConstraint : cConstraints) {
							for (ClockConstraint negatedCConstraint : negate(cConstraint)) {
								BasicEList<ClockConstraint> c = new BasicEList<ClockConstraint>();
								c.add(negatedCConstraint);
								createTransition(source, err, c, syncChannel,
										SynchronizationKind.SEND, null, false);
							}
						}
					}

					// create err transitions with negated guards
					for (Transition curTransition : fittingTransitions) {
						if (curTransition.getGuard() != null) {
							Transition errTransition = createTransition(source,
									err, null, syncChannel,
									SynchronizationKind.RECEIVE, null, false);
							UnaryExpression negatedGuard = CommonExpressionsFactory.eINSTANCE
									.createUnaryExpression();
							negatedGuard.setOperator(UnaryOperator.NOT);
							negatedGuard.setEnclosedExpression(EcoreUtil
									.copy(curTransition.getGuard()));
							errTransition.setGuard(negatedGuard);

						}
					}

				}
			}

		}
	}

	/**
	 * transforms the test automaton if the abstract rtsc is restricted:
	 * 
	 * @param source
	 * @param refinement
	 */
	protected void transformTowardsAbstract(State source, Refinement refinement) {
		State cState;

		switch (refinement.getRequirement().getValue()) {
		case Requirement.R1_VALUE:
			for (Transition tmpTransition : originalOutgoingTransitions
					.get(source)) {

				// add reset for cTa
				if (!tmpTransition.getClockResets().contains(getCta()))
					tmpTransition.getClockResets().add(getCta());

				// add reset for cstep
				// if (!tmpTransition.getClockResets().contains(cStep)
				// && cStep != null)
				// tmpTransition.getClockResets().add(cStep);

				if (tmpTransition.isUrgent()
						&& refinement.getTransitionType().getValue() == TransitionType.URGENT_VALUE
						|| refinement.getTransitionType().getValue() != TransitionType.URGENT_VALUE) {

					State tmpState = rtscFactory.createState();
					tmpState.setParentStatechart(testAutomaton);
					tmpState.setName("C>=R1"
							+ tmpTransition.getTarget().getName());
					cState = tmpState;
					BasicEList<ClockConstraint> highCConstraint = new BasicEList<ClockConstraint>();
					highCConstraint
							.addAll(highClockConstraints(originalClockConstraints
									.get(tmpTransition)));
					highCConstraint.addAll(originalInvariants.get(tmpTransition
							.getSource()));
					ClockConstraint cTaZero = rtscFactory
							.createClockConstraint();
					TimeValue cTaValue = valueTypeFactory.createTimeValue();
					
					
					LiteralExpression zero = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
					zero.setValue("0");
					
					cTaValue.setValue(zero);
					cTaZero.setClock(cTa);
					cTaZero.setOperator(ComparingOperator.EQUAL);
					cTaZero.setBound(cTaValue);
					highCConstraint.add(cTaZero);
					eliminateDispensableClockConstraints(highCConstraint);

					// create source -> cState transition
					Transition transition = createTransition(source, cState,
							highCConstraint, null, null, getCta(), false);
					if (tmpTransition.getGuard() != null)
						transition.setGuard(EcoreUtil.copy(tmpTransition
								.getGuard()));

					// create cState -> N transition
					if (tmpTransition.getSynchronization() != null)
						createTransition(cState, n, null, tmpTransition
								.getSynchronization().getSyncChannel(),
								tmpTransition.getSynchronization().getKind(),
								null, true);
					else
						createTransition(cState, n, null, null, null, null,
								true);

					// create cState -> Err transition
					ClockConstraint cCon = rtscFactory.createClockConstraint();
					
					LiteralExpression boundMax = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
					boundMax.setValue(""+clockMax);
					TimeValue tvalue = valueTypeFactory.createTimeValue();
					tvalue.setValue(boundMax);
					tvalue.setUnit(smallestTimeUnit);
					cCon.setBound(tvalue);
					cCon.setClock(getCta());
					cCon.setOperator(ComparingOperator.EQUAL);
					BasicEList<ClockConstraint> cTaCon = new BasicEList<ClockConstraint>();
					cTaCon.add(cCon);
					createTransition(cState, err, cTaCon, null, null, null,
							false);
				}
			}
			break;

		case Requirement.R2_VALUE:
			for (Transition tmpTransition : originalOutgoingTransitions
					.get(source)) {
				// add reset for cTa
				if (!tmpTransition.getClockResets().contains(getCta()))
					tmpTransition.getClockResets().add(getCta());

				// add reset for cstep
				// if (!tmpTransition.getClockResets().contains(cStep)
				// && cStep != null)
				// tmpTransition.getClockResets().add(cStep);

				if (tmpTransition.isUrgent()
						&& refinement.getTransitionType().getValue() == TransitionType.URGENT_VALUE
						|| refinement.getTransitionType().getValue() != TransitionType.URGENT_VALUE) {

					State tmpState = rtscFactory.createState();
					tmpState.setParentStatechart(testAutomaton);
					tmpState.setName("C>=R2"
							+ tmpTransition.getTarget().getName());
					cState = tmpState;

					EList<ClockConstraint> cConstraints = new BasicEList<ClockConstraint>();
					cConstraints.addAll(originalClockConstraints
							.get(tmpTransition));
					cConstraints.addAll(originalInvariants.get(tmpTransition
							.getSource()));
					eliminateDispensableClockConstraints(cConstraints);

					// create source -> cState transition
					Transition transition = createTransition(source, cState,
							cConstraints, null, null, null, false);
					if (tmpTransition.getGuard() != null)
						transition.setGuard(EcoreUtil.copy(tmpTransition
								.getGuard()));

					// create cState -> N transition
					if (tmpTransition.getSynchronization() != null)
						createTransition(cState, n, null, tmpTransition
								.getSynchronization().getSyncChannel(),
								tmpTransition.getSynchronization().getKind(),
								null, true);
					else
						createTransition(cState, n, null, null, null, null,
								true);

					// create cState -> Err transition
					createTransition(cState, err, null, null, null, null, false);
				}
			}
			break;

		case Requirement.R3_VALUE:

			for (Transition tmpTransition : originalOutgoingTransitions
					.get(source)) {

				// add reset for cTa
				if (!tmpTransition.getClockResets().contains(getCta()))
					tmpTransition.getClockResets().add(getCta());

				// add reset for cstep
				// if (!tmpTransition.getClockResets().contains(cStep)
				// && cStep != null)
				// tmpTransition.getClockResets().add(cStep);

				if (tmpTransition.isUrgent()
						&& refinement.getTransitionType().getValue() == TransitionType.URGENT_VALUE
						|| refinement.getTransitionType().getValue() != TransitionType.URGENT_VALUE) {
					State tmpState = rtscFactory.createState();
					tmpState.setParentStatechart(testAutomaton);
					tmpState.setName("C>=R3"
							+ tmpTransition.getTarget().getName());
					cState = tmpState;
					BasicEList<ClockConstraint> highCConstraint = new BasicEList<ClockConstraint>();
					highCConstraint
							.addAll(highClockConstraints(originalClockConstraints
									.get(tmpTransition)));
					highCConstraint
							.addAll(highClockConstraints(originalInvariants
									.get(tmpTransition.getSource())));
					eliminateDispensableClockConstraints(highCConstraint);

					// create source -> cState transition
					Transition transition = createTransition(source, cState,
							highCConstraint, null, null, null, false);
					if (tmpTransition.getGuard() != null)
						transition.setGuard(EcoreUtil.copy(tmpTransition
								.getGuard()));

					// create cState -> N transition
					if (tmpTransition.getSynchronization() != null)
						createTransition(cState, n, null, tmpTransition
								.getSynchronization().getSyncChannel(),
								tmpTransition.getSynchronization().getKind(),
								null, true);
					else
						createTransition(cState, n, null, null, null, null,
								true);

					// create cState -> Err transition
					ClockConstraint cCon = rtscFactory.createClockConstraint();
					NaturalNumber bound = valueTypeFactory
							.createNaturalNumber();
					bound.setValue(null);
					
					LiteralExpression boundMax = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
					boundMax.setValue(""+clockMax);
					
					TimeValue tvalue2 = valueTypeFactory.createTimeValue();
					//TODO ??
					tvalue2.setValue(boundMax);
					cCon.setBound(tvalue2);
					cCon.setClock(getCta());
					cCon.setOperator(ComparingOperator.EQUAL);
					BasicEList<ClockConstraint> cTaCon = new BasicEList<ClockConstraint>();
					cTaCon.add(cCon);
					createTransition(cState, err, cTaCon, null, null, null,
							false);
				}
			}
			break;

		// TODO not needed yet and not implemented correctly
		case Requirement.R4_VALUE:
			for (Transition tmpTransition : originalOutgoingTransitions
					.get(source)) {
				// if (!cStateMapping.containsKey(tmpTransition.getTarget())) {
				State tmpState = rtscFactory.createState();
				tmpState.setParentStatechart(testAutomaton);
				tmpState.setName("C>=R4" + tmpTransition.getTarget().getName());
				cState = tmpState;
				// cStateMapping.put((State) tmpTransition.getTarget(),
				// tmpState);
				// } else
				// cState = cStateMapping.get(tmpTransition.getTarget());
				BasicEList<ClockConstraint> highCConstraint = new BasicEList<ClockConstraint>();
				highCConstraint
						.addAll(highClockConstraints(originalClockConstraints
								.get(tmpTransition)));
				highCConstraint.addAll(highClockConstraints(originalInvariants
						.get(tmpTransition.getSource())));
				eliminateDispensableClockConstraints(highCConstraint);
				createTransition(source, cState, highCConstraint, null, null,
						getCta(), false);
				createTransition(cState, n, null, tmpTransition
						.getSynchronization().getSyncChannel(), tmpTransition
						.getSynchronization().getKind(), null, true);
				createTransition(
						cState,
						err,
						lowClockConstraints(tmpTransition.getClockConstraints()),
						null, null, null, false);
			}
			break;

		default:
			break;
		}

	}

	/**
	 * checks if a transition with these parameters already exists
	 * 
	 * @param source
	 *            the source state
	 * @param syncChannel
	 *            the synchronization channel
	 * @param kind
	 *            the synchronization kind
	 * @return transition fitting the parameters
	 */
	protected ArrayList<Transition> syncExists(State source,
			SynchronizationChannel syncChannel, SynchronizationKind kind) {

		ArrayList<Transition> transitions = new ArrayList<Transition>();

		for (Transition transition : source.getOutgoingTransitions()) {
			if (transition.getSynchronization() != null
					&& transition.getSynchronization().getSyncChannel() != null
					&& transition.getSynchronization().getSyncChannel()
							.equals(syncChannel)
					&& transition.getSynchronization().getKind().equals(kind)) {
				transitions.add(transition);
			}

		}
		return transitions;
	}

	protected EList<ClockConstraint> highClockConstraints(
			EList<ClockConstraint> original) {
		BasicEList<ClockConstraint> highCConstraints = new BasicEList<ClockConstraint>();
		for (ClockConstraint cConstraint : original) {
			switch (cConstraint.getOperator().getValue()) {
			case ComparingOperator.LESS_VALUE:
				highCConstraints.add(EcoreUtil.copy(cConstraint));
				break;

			case ComparingOperator.LESS_OR_EQUAL_VALUE:
				highCConstraints.add(EcoreUtil.copy(cConstraint));
				break;
			case ComparingOperator.EQUAL_VALUE:
				ClockConstraint newCConstraint = rtscFactory
						.createClockConstraint();
				newCConstraint.setBound(EcoreUtil.copy(cConstraint.getBound()));
				newCConstraint.setClock(cConstraint.getClock());
				newCConstraint.setOperator(ComparingOperator.LESS_OR_EQUAL);
				highCConstraints.add(newCConstraint);
				break;

			default:
				break;
			}

		}
		return highCConstraints;
	}

	protected EList<ClockConstraint> lowClockConstraints(
			EList<ClockConstraint> original) {
		BasicEList<ClockConstraint> lowCConstraints = new BasicEList<ClockConstraint>();
		for (ClockConstraint cConstraint : original) {
			switch (cConstraint.getOperator().getValue()) {
			case ComparingOperator.GREATER_VALUE:
				lowCConstraints.add(EcoreUtil.copy(cConstraint));
				break;

			case ComparingOperator.GREATER_OR_EQUAL_VALUE:
				lowCConstraints.add(EcoreUtil.copy(cConstraint));
				break;
			case ComparingOperator.EQUAL_VALUE:
				ClockConstraint newCConstraint = rtscFactory
						.createClockConstraint();
				newCConstraint.setBound(EcoreUtil.copy(cConstraint.getBound()));
				newCConstraint.setClock(cConstraint.getClock());
				newCConstraint.setOperator(ComparingOperator.GREATER_OR_EQUAL);
				lowCConstraints.add(newCConstraint);
				break;

			default:
				break;
			}

		}
		return lowCConstraints;
	}

	// protected EList<AbsoluteDeadline> highAbsoluteDeadlines(
	// EList<AbsoluteDeadline> original) {
	// BasicEList<AbsoluteDeadline> high = new BasicEList<AbsoluteDeadline>();
	// for (AbsoluteDeadline tmpDeadline : original) {
	// AbsoluteDeadline newDeadline = EcoreUtil.copy(tmpDeadline);
	// newDeadline.setLowerBound(null);
	// high.add(newDeadline);
	// }
	// return high;
	// }

	/**
	 * widens the clock constraints dependent on the refinement type
	 * 
	 * @param transition
	 * @param refinementParameters
	 */
	protected void widen(Transition transition, Refinement refinement) {
		BasicEList<ClockConstraint> toRemove;
		State source = (State) transition.getSource();

		EList<ClockConstraint> cConstraints = transition.getClockConstraints();

		eliminateDispensableClockConstraints(cConstraints);

		EList<ClockConstraint> invariants = originalInvariants.get(source);


		if (refinement.getTransitionType().getValue() == TransitionType.ALL_VALUE
				|| ((refinement.getTransitionType().getValue() == TransitionType.URGENT_VALUE) && transition
						.isUrgent())
				// Note that we switched received and send when creating the
				// testautomaton
				// TransitionType, as part of Refinement, references the
				// abstractRTSC
				|| ((refinement.getTransitionType().getValue() == TransitionType.OUTGOING_VALUE) && transition
						.getSynchronization().getKind()
						.equals(SynchronizationKind.RECEIVE))
				|| ((refinement.getTransitionType().getValue() == TransitionType.INCOMING_VALUE) && transition
						.getSynchronization().getKind()
						.equals(SynchronizationKind.SEND))
				|| ((refinement.getTransitionType().getValue() == TransitionType.NONE_VALUE) && transition
						.getSynchronization() == null)) {

			switch (refinement.getRequirement().getValue()) {

			// simulation and part of bisimulation
			case Requirement.R1_VALUE:
				transition.getClockConstraints().clear();
				source.getInvariants().clear();
				break;

			// timed simulation
			case Requirement.R2_VALUE:

				for (ClockConstraint curInvariant : invariants) {
					cConstraints.add(EcoreUtil.copy(curInvariant));
				}
				eliminateDispensableClockConstraints(cConstraints);

				break;

			case Requirement.R3_VALUE:
				toRemove = new BasicEList<ClockConstraint>();
				if (!cConstraints.isEmpty()) {
					for (ClockConstraint cConstraint : cConstraints) {

						// delete lower bound
						if (cConstraint.getOperator().equals(
								ComparingOperator.GREATER)
								|| cConstraint.getOperator().equals(
										ComparingOperator.GREATER_OR_EQUAL))
							toRemove.add(cConstraint);

					}
					transition.getClockConstraints().removeAll(toRemove);

					for (ClockConstraint curInvariant : invariants) {
						cConstraints.add(EcoreUtil.copy(curInvariant));
					}
					eliminateDispensableClockConstraints(cConstraints);
				}

				break;

			// TODO not part of the refinements yet, not implemented correctly
			case Requirement.R4_VALUE:
				toRemove = new BasicEList<ClockConstraint>();
				if (!cConstraints.isEmpty()) {
					for (ClockConstraint cConstraint : cConstraints) {
						if (cConstraint.getOperator().equals(
								ComparingOperator.LESS)
								|| cConstraint.getOperator().equals(
										ComparingOperator.LESS_OR_EQUAL)) {
							toRemove.add(cConstraint);
						}
					}
					transition.getClockConstraints().removeAll(toRemove);
					eliminateDispensableClockConstraints(cConstraints);
				}

				break;
			}
		}

	}

	/**
	 * Computes clock constraints witch negated comparing operator
	 * 
	 * @param original
	 *            the input clock constraint
	 * @return new clock constraints with negated comparing operator
	 */
	protected EList<ClockConstraint> negate(ClockConstraint original) {
		BasicEList<ClockConstraint> negatedClockConstraints = new BasicEList<ClockConstraint>();
		TimeValue nNbr;

		switch (original.getOperator().getValue()) {
		case ComparingOperator.GREATER_VALUE:
			ClockConstraint negated = rtscFactory.createClockConstraint();
			nNbr = EcoreUtil.copy(original.getBound());
			negated.setBound(nNbr);
			negated.setClock(original.getClock());
			negated.setOperator(ComparingOperator.LESS_OR_EQUAL);
			negatedClockConstraints.add(negated);
			return negatedClockConstraints;

		case ComparingOperator.GREATER_OR_EQUAL_VALUE:
			negated = rtscFactory.createClockConstraint();
			nNbr = EcoreUtil.copy(original.getBound());
			negated.setBound(nNbr);
			negated.setClock(original.getClock());
			negated.setOperator(ComparingOperator.LESS);
			negatedClockConstraints.add(negated);
			return negatedClockConstraints;

		case ComparingOperator.LESS_VALUE:
			negated = rtscFactory.createClockConstraint();
			nNbr = EcoreUtil.copy(original.getBound());
			negated.setBound(nNbr);
			negated.setClock(original.getClock());
			negated.setOperator(ComparingOperator.GREATER_OR_EQUAL);
			negatedClockConstraints.add(negated);
			return negatedClockConstraints;

		case ComparingOperator.LESS_OR_EQUAL_VALUE:
			negated = rtscFactory.createClockConstraint();
			nNbr = EcoreUtil.copy(original.getBound());
			negated.setBound(nNbr);
			negated.setClock(original.getClock());
			negated.setOperator(ComparingOperator.GREATER);
			negatedClockConstraints.add(negated);
			return negatedClockConstraints;

		case ComparingOperator.EQUAL_VALUE:
			ClockConstraint negatedLower = rtscFactory.createClockConstraint();
			nNbr = EcoreUtil.copy(original.getBound());
			negatedLower.setBound(nNbr);
			negatedLower.setClock(original.getClock());
			negatedLower.setOperator(ComparingOperator.LESS);
			negatedClockConstraints.add(negatedLower);
			ClockConstraint negatedUpper = rtscFactory.createClockConstraint();
			nNbr = EcoreUtil.copy(original.getBound());
			negatedUpper.setBound(nNbr);
			negatedUpper.setClock(original.getClock());
			negatedUpper.setOperator(ComparingOperator.GREATER);
			negatedClockConstraints.add(negatedUpper);
			return negatedClockConstraints;

		default:
			break;
		}

		return null;
	}

	/**
	 * computes negated deadlines
	 * 
	 * @param original
	 * @return List containing the negated Deadlines
	 */
	// protected EList<AbsoluteDeadline> negate(AbsoluteDeadline original) {
	// EList<AbsoluteDeadline> tmpDeadlines = new
	// BasicEList<AbsoluteDeadline>();
	// if (original.getLowerBound().isInfinity()) {
	// AbsoluteDeadline tmpDeadline = rtscFactory.createAbsoluteDeadline();
	// tmpDeadline.setLowerBound(EcoreUtil.copy(original.getUpperBound()));
	// tmpDeadline.setUpperBound(null);
	// tmpDeadlines.add(tmpDeadline);
	// return tmpDeadlines;
	//
	// }
	// if (original.getUpperBound().isInfinity()) {
	// AbsoluteDeadline tmpDeadline = rtscFactory.createAbsoluteDeadline();
	// tmpDeadline.setUpperBound(EcoreUtil.copy(original.getLowerBound()));
	// tmpDeadline.setLowerBound(null);
	// tmpDeadlines.add(tmpDeadline);
	// return tmpDeadlines;
	// }
	//
	// AbsoluteDeadline tmpDeadline1 = rtscFactory.createAbsoluteDeadline();
	// tmpDeadline1.setUpperBound(EcoreUtil.copy(original.getLowerBound()));
	// tmpDeadline1.setLowerBound(null);
	// tmpDeadlines.add(tmpDeadline1);
	// AbsoluteDeadline tmpDeadline2 = rtscFactory.createAbsoluteDeadline();
	// tmpDeadline2.setUpperBound(null);
	// tmpDeadline2.setLowerBound(EcoreUtil.copy(original.getUpperBound()));
	// tmpDeadlines.add(tmpDeadline2);
	//
	// return tmpDeadlines;
	// }

	protected Transition createTransition(State source, State target,
			EList<ClockConstraint> cConstraints,
			// EList<AbsoluteDeadline> deadlines,
			SynchronizationChannel syncChannel, SynchronizationKind kind,
			Clock clockReset, boolean urgent) {

		// create Transition
		Transition transition = rtscFactory.createTransition();
		source.getParentStatechart().getTransitions().add(transition);
		transition.setSource(source);
		transition.setTarget(target);

		// create Synchronization
		if (syncChannel != null) {
			Synchronization sync = rtscFactory.createSynchronization();
			sync.setKind(kind);
			sync.setSyncChannel(syncChannel);
			transition.setSynchronization(sync);
		}

		if (clockReset != null) {
			transition.getClockResets().add(clockReset);
		}

		if (cConstraints != null && !cConstraints.isEmpty()) {
			for (ClockConstraint cConstraint : cConstraints) {
				ClockConstraint cCon = EcoreUtil.copy(cConstraint);
				transition.getClockConstraints().add(cCon);
			}
		}

		// if (deadlines != null && !deadlines.isEmpty()) {
		// // set Clock Constraint
		// for (AbsoluteDeadline tmpDeadline : deadlines) {
		// transition.getAbsoluteDeadlines().add(
		// EcoreUtil.copy(tmpDeadline));
		// }
		// }

		transition.setUrgent(urgent);
		transition.setPriority(1);

		return transition;
	}

	protected void transformDeadlineToClockConstraint(RealtimeStatechart rtsc) {
		for (Transition curTransition : rtsc.getTransitions()) {
			if (!curTransition.getAbsoluteDeadlines().isEmpty())
				for (AbsoluteDeadline curDeadline : curTransition
						.getAbsoluteDeadlines()) {
					ClockConstraint lowCConstraint = rtscFactory
							.createClockConstraint();
					lowCConstraint.setClock(curDeadline.getClock());
					lowCConstraint.setBound(curDeadline.getLowerBound());
					lowCConstraint
							.setOperator(ComparingOperator.GREATER_OR_EQUAL);
					curTransition.getClockConstraints().add(lowCConstraint);

					ClockConstraint upCConstraint = rtscFactory
							.createClockConstraint();
					upCConstraint.setClock(curDeadline.getClock());
					upCConstraint.setBound(curDeadline.getUpperBound());
					upCConstraint.setOperator(ComparingOperator.LESS_OR_EQUAL);
					curTransition.getClockConstraints().add(upCConstraint);
				}
			curTransition.getAbsoluteDeadlines().clear();
		}
	}
	
	protected void convertBoundsToSmallestTimeUnit(HashSet<RealtimeStatechart> rtscs) {
		// convert bounds

		// TODO add multiply expressions
		for (RealtimeStatechart curRtsc : rtscs) {
			for (Transition curTransition : curRtsc.getTransitions()) {
				for (AbsoluteDeadline curDeadline : curTransition
						.getAbsoluteDeadlines()) {

					if (curDeadline.getLowerBound().getUnit() != null
							&& curDeadline.getLowerBound().getUnit()
									.compareTo(smallestTimeUnit) != 0) {
						TimeUnit oldTimeUnit = curDeadline.getLowerBound()
								.getUnit();
						Expression oldExpression = curDeadline.getLowerBound()
								.getValue();

						Expression convertedExpression = getBoundTransformArithmeticExpression(
								oldExpression, oldTimeUnit, smallestTimeUnit);
						// smallestTimeUnit.convert(oldValue, oldTimeUnit);

						curDeadline.getLowerBound().setValue(
								convertedExpression);
						curDeadline.getLowerBound().setUnit(smallestTimeUnit);
					}

					if (curDeadline.getUpperBound().getUnit() != null
							&& curDeadline.getUpperBound().getUnit()
									.compareTo(smallestTimeUnit) != 0) {
						TimeUnit oldTimeUnit = curDeadline.getUpperBound()
								.getUnit();
						Expression oldExpression = curDeadline.getUpperBound()
								.getValue();
						Expression convertedExpression = getBoundTransformArithmeticExpression(
								oldExpression, oldTimeUnit, smallestTimeUnit);

						curDeadline.getUpperBound().setValue(
								convertedExpression);
						curDeadline.getUpperBound().setUnit(smallestTimeUnit);
					}

				}
				for (ClockConstraint curCConstraint : curTransition
						.getClockConstraints()) {
					if (curCConstraint.getBound().getUnit() != null
							&& curCConstraint.getBound().getUnit()
									.compareTo(smallestTimeUnit) != 0) {
						TimeUnit oldTimeUnit = curCConstraint.getBound()
								.getUnit();
						Expression oldExpression = curCConstraint.getBound()
								.getValue();
						Expression convertedExpression = getBoundTransformArithmeticExpression(
								oldExpression, oldTimeUnit, smallestTimeUnit);

						curCConstraint.getBound().setValue(convertedExpression);
						curCConstraint.getBound().setUnit(smallestTimeUnit);
					}
				}
			}
			for (State curState : curRtsc.getStates()) {
				for (ClockConstraint curInvariant : curState.getInvariants()) {

					if (curInvariant.getBound().getUnit() != null
							&& curInvariant.getBound().getUnit()
									.compareTo(smallestTimeUnit) != 0) {
						TimeUnit oldTimeUnit = curInvariant.getBound()
								.getUnit();
						Expression oldExpression = curInvariant.getBound()
								.getValue();
						Expression convertedExpression = getBoundTransformArithmeticExpression(
								oldExpression, oldTimeUnit, smallestTimeUnit);

						curInvariant.getBound().setValue(convertedExpression);
						curInvariant.getBound().setUnit(smallestTimeUnit);
					}
				}
			}
		}
	}
	
	protected TimeUnit findSmallestTimeUnit(HashSet<RealtimeStatechart> rtscs) {
		TimeUnit smallestTimeUnit = TimeUnit.DAYS;
		for (RealtimeStatechart curRtsc :rtscs) {
			for (Transition curTransition : curRtsc.getTransitions()) {
				for (AbsoluteDeadline curDeadline : curTransition
						.getAbsoluteDeadlines()) {

					if (curDeadline.getLowerBound().getUnit() != null
							&& curDeadline.getLowerBound().getUnit()
									.compareTo(smallestTimeUnit) < 0)
						smallestTimeUnit = curDeadline.getLowerBound()
								.getUnit();
					if (curDeadline.getUpperBound().getUnit() != null
							&& curDeadline.getUpperBound().getUnit()
									.compareTo(smallestTimeUnit) < 0)
						smallestTimeUnit = curDeadline.getUpperBound()
								.getUnit();

				}
				for (ClockConstraint curCConstraint : curTransition
						.getClockConstraints()) {
					if (curCConstraint.getBound().getUnit() != null
							&& curCConstraint.getBound().getUnit()
									.compareTo(smallestTimeUnit) < 0) {
						smallestTimeUnit = curCConstraint.getBound().getUnit();
					}
				}
			}
			for (State curState : curRtsc.getStates()) {
				for (ClockConstraint curInvariant : curState.getInvariants()) {
					if (curInvariant.getBound().getUnit() != null
							&& curInvariant.getBound().getUnit()
									.compareTo(smallestTimeUnit) < 0)
						smallestTimeUnit = curInvariant.getBound().getUnit();
				}
			}
		}
		return smallestTimeUnit;
	}
	
	protected Expression getBoundTransformArithmeticExpression(
			Expression boundValueExpression, TimeUnit boundTimeUnit,
			TimeUnit smallestTimeUnit) {

		if (boundTimeUnit == null)
			return boundValueExpression;

		if (boundTimeUnit == smallestTimeUnit)
			return boundValueExpression;

		/*
		 * Days 24, 1440, 86400, 86.400.000, 86.400.000.000, 86.400.000.000.000
		 * Hours Minutes Seconds Milliseconds Microseconds Nanoseconds
		 */

		if (boundTimeUnit == TimeUnit.DAYS) {
			LiteralExpression factor = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			factor.setValue("24");

			ArithmeticExpression toHours = CommonExpressionsFactory.eINSTANCE
					.createArithmeticExpression();
			toHours.setLeftExpression(boundValueExpression);
			toHours.setRightExpression(factor);
			toHours.setOperator(ArithmeticOperator.TIMES);
			return getBoundTransformArithmeticExpression(toHours,
					TimeUnit.HOURS, smallestTimeUnit);
		}

		if (boundTimeUnit == TimeUnit.HOURS) {
			LiteralExpression factor = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			factor.setValue("60");

			ArithmeticExpression toMinutes = CommonExpressionsFactory.eINSTANCE
					.createArithmeticExpression();
			toMinutes.setLeftExpression(boundValueExpression);
			toMinutes.setRightExpression(factor);
			toMinutes.setOperator(ArithmeticOperator.TIMES);
			return getBoundTransformArithmeticExpression(toMinutes,
					TimeUnit.MINUTES, smallestTimeUnit);
		}

		if (boundTimeUnit == TimeUnit.MINUTES) {
			LiteralExpression factor = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			factor.setValue("60");

			ArithmeticExpression toSeconds = CommonExpressionsFactory.eINSTANCE
					.createArithmeticExpression();
			toSeconds.setLeftExpression(boundValueExpression);
			toSeconds.setRightExpression(factor);
			toSeconds.setOperator(ArithmeticOperator.TIMES);
			return getBoundTransformArithmeticExpression(toSeconds,
					TimeUnit.SECONDS, smallestTimeUnit);
		}

		if (boundTimeUnit == TimeUnit.SECONDS) {
			LiteralExpression factor = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			factor.setValue("1000");

			ArithmeticExpression toMilliseconds = CommonExpressionsFactory.eINSTANCE
					.createArithmeticExpression();
			toMilliseconds.setLeftExpression(boundValueExpression);
			toMilliseconds.setRightExpression(factor);
			toMilliseconds.setOperator(ArithmeticOperator.TIMES);
			return getBoundTransformArithmeticExpression(toMilliseconds,
					TimeUnit.MILLISECONDS, smallestTimeUnit);
		}

		if (boundTimeUnit == TimeUnit.MILLISECONDS) {
			LiteralExpression factor = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			factor.setValue("1000");

			ArithmeticExpression toMicroseconds = CommonExpressionsFactory.eINSTANCE
					.createArithmeticExpression();
			toMicroseconds.setLeftExpression(boundValueExpression);
			toMicroseconds.setRightExpression(factor);
			toMicroseconds.setOperator(ArithmeticOperator.TIMES);
			return getBoundTransformArithmeticExpression(toMicroseconds,
					TimeUnit.MICROSECONDS, smallestTimeUnit);
		}

		if (boundTimeUnit == TimeUnit.MICROSECONDS) {
			LiteralExpression factor = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			factor.setValue("1000");

			ArithmeticExpression toNanoseconds = CommonExpressionsFactory.eINSTANCE
					.createArithmeticExpression();
			toNanoseconds.setLeftExpression(boundValueExpression);
			toNanoseconds.setRightExpression(factor);
			toNanoseconds.setOperator(ArithmeticOperator.TIMES);
			return getBoundTransformArithmeticExpression(toNanoseconds,
					TimeUnit.MICROSECONDS, smallestTimeUnit);
		}

		return null;
	}

//	protected void transformToSmallestTimeUnit(HashSet<RealtimeStatechart> rtscs) {
//		smallestTimeUnit = TimeUnit.DAYS;
//		// find smallest time unit
//		for (RealtimeStatechart curRtsc : rtscs) {
//			for (Transition curTransition : curRtsc.getTransitions()) {
//
//				for (ClockConstraint curCConstraint : curTransition
//						.getClockConstraints()) {
//					if (curCConstraint.getBound().getUnit() != null
//							&& curCConstraint.getBound().getUnit()
//									.compareTo(smallestTimeUnit) < 0) {
//						smallestTimeUnit = curCConstraint.getBound().getUnit();
//					}
//				}
//			}
//			for (State curState : curRtsc.getStates()) {
//				for (ClockConstraint curInvariant : curState.getInvariants()) {
//					if (curInvariant.getBound().getUnit() != null
//							&& curInvariant.getBound().getUnit()
//									.compareTo(smallestTimeUnit) < 0)
//						smallestTimeUnit = curInvariant.getBound().getUnit();
//				}
//			}
//		}
//
//		// convert bounds
//		for (RealtimeStatechart curRtsc : rtscs) {
//			for (Transition curTransition : curRtsc.getTransitions()) {
//				for (ClockConstraint curCConstraint : curTransition
//						.getClockConstraints()) {
//					if (curCConstraint.getBound().getUnit() != null
//							&& curCConstraint.getBound().getUnit()
//									.compareTo(smallestTimeUnit) != 0) {
//						TimeUnit oldTimeUnit = curCConstraint.getBound()
//								.getUnit();
//						long oldValue = curCConstraint.getBound().getValue()
//								.getValue();
//						long convertedValue = smallestTimeUnit.convert(
//								oldValue, oldTimeUnit);
//
//						curCConstraint.getBound().getValue()
//								.setValue(convertedValue);
//						curCConstraint.getBound().setUnit(smallestTimeUnit);
//					}
//				}
//			}
//			for (State curState : curRtsc.getStates()) {
//				for (ClockConstraint curInvariant : curState.getInvariants()) {
//
//					if (curInvariant.getBound().getUnit() != null
//							&& curInvariant.getBound().getUnit()
//									.compareTo(smallestTimeUnit) != 0) {
//						TimeUnit oldTimeUnit = curInvariant.getBound()
//								.getUnit();
//						long oldValue = curInvariant.getBound().getValue()
//								.getValue();
//						long convertedValue = smallestTimeUnit.convert(
//								oldValue, oldTimeUnit);
//
//						curInvariant.getBound().getValue()
//								.setValue(convertedValue);
//						curInvariant.getBound().setUnit(smallestTimeUnit);
//					}
//				}
//			}
//		}
//	}

	protected void eliminateDispensableClockConstraints(
			EList<ClockConstraint> original) {
		
		ActionLanguageInterpreter aLInterpreter = new ActionLanguageInterpreter();
		DataType doubleType = TypesFactory.eINSTANCE
				.createPrimitiveDataType();
		((PrimitiveDataType) doubleType)
				.setPrimitiveType(PrimitiveTypes.DOUBLE);
		
		HashSet<ClockConstraint> toRemove = new HashSet<ClockConstraint>();

		for (ClockConstraint curCConstraint : original) {
			
			Object curCCOnstraintValue=null;
			double curCConstraintValueAsDouble;
			try {
				curCCOnstraintValue = aLInterpreter.evaluateExpression(null, curCConstraint.getBound().getValue());
				curCConstraintValueAsDouble = (Double)aLInterpreter.castTo(doubleType, curCCOnstraintValue);
			} catch (Exception e) {
				continue;
			}
			

			for (ClockConstraint compare : original) {
				
				Object compareValue;
				double compareValueAsDouble;
				try {
					compareValue = aLInterpreter.evaluateExpression(null, compare.getBound().getValue());
					compareValueAsDouble = (Double)aLInterpreter.castTo(doubleType, compareValue);
				} catch (Exception e) {
					continue;
				} 
				
				if (curCConstraint.getClock().equals(compare.getClock())
						&& !curCConstraint.equals(compare))

					switch (curCConstraint.getOperator().getValue()) {
					case ComparingOperator.GREATER_VALUE:
						if (compare.getOperator().getValue() == ComparingOperator.GREATER_VALUE
								|| compare.getOperator().getValue() == ComparingOperator.GREATER_OR_EQUAL_VALUE) {
							
							if (compareValueAsDouble > curCConstraintValueAsDouble)
								toRemove.add(curCConstraint);
						}
						break;
					case ComparingOperator.GREATER_OR_EQUAL_VALUE:
						if (compare.getOperator().getValue() == ComparingOperator.GREATER_VALUE) {
							if (compareValueAsDouble >= curCConstraintValueAsDouble) {
								toRemove.add(curCConstraint);
							}
						}
						if (compare.getOperator().getValue() == ComparingOperator.GREATER_OR_EQUAL_VALUE) {
							if (compareValueAsDouble> curCConstraintValueAsDouble) {
								toRemove.add(curCConstraint);
							}
						}
						break;

					case ComparingOperator.EQUAL_VALUE:
						if (compareValueAsDouble != curCConstraintValueAsDouble)
							System.out
									.println("ClockConstraints can not be true");
						else
							toRemove.add(compare);
						break;

					case ComparingOperator.LESS_VALUE:
						if (compare.getOperator().getValue() == ComparingOperator.LESS_VALUE
								|| compare.getOperator().getValue() == ComparingOperator.LESS_OR_EQUAL_VALUE) {
							if (compareValueAsDouble< curCConstraintValueAsDouble)
								toRemove.add(curCConstraint);
						}
						break;

					case ComparingOperator.LESS_OR_EQUAL_VALUE:
						if (compare.getOperator().getValue() == ComparingOperator.LESS_VALUE) {
							if (compareValueAsDouble <= curCConstraintValueAsDouble) {
								toRemove.add(curCConstraint);
							}
						}
						if (compare.getOperator().getValue() == ComparingOperator.LESS_OR_EQUAL_VALUE) {
							if (compareValueAsDouble < curCConstraintValueAsDouble) {
								toRemove.add(curCConstraint);
							}
						}
						break;

					default:
						System.out.println("undefined Operator");
						break;
					}
			}
		}
		if (!toRemove.isEmpty())
			original.removeAll(toRemove);
	}

	protected void decomposeRaiseTriggerTransitions(RealtimeStatechart rtsc) {
		HashSet<Transition> toRemove = new HashSet<Transition>();
		HashSet<Transition> toAdd = new HashSet<Transition>();

		for (Transition curTransition : rtsc.getTransitions()) {
			if (curTransition.getRaiseMessageEvent() != null
					&& curTransition.getTriggerMessageEvent() != null) {
				toRemove.add(curTransition);

				// create new clock
				if (cStep == null) {
					cStep = rtscFactory.createClock();
					cStep.setStatechart(rtsc);
					cStep.setName("cStep");
				}

				State step = rtscFactory.createState();
				step.setParentStatechart(rtsc);
				step.setName(curTransition.getSource().getName() + "."
						+ curTransition.getTarget().getName());

				// Invariant: cStep<=0
				ClockConstraint cStepConstraint = rtscFactory
						.createClockConstraint();
				cStepConstraint.setOperator(ComparingOperator.LESS_OR_EQUAL);
				cStepConstraint.setClock(cStep);
				TimeValue cStepBound = valueTypeFactory.createTimeValue();
			
				LiteralExpression zero = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
				zero.setValue("0");
				cStepBound.setValue(zero);
				cStepBound.setUnit(smallestTimeUnit);
				cStepConstraint.setBound(cStepBound);
				step.getInvariants().add(cStepConstraint);

				// Source -> Intermediate State
				Transition toStep = rtscFactory.createTransition();
				toAdd.add(toStep);
				toStep.getClockConstraints().addAll(
						curTransition.getClockConstraints());
				toStep.getClockResets().add(cStep);
				toStep.setSource(curTransition.getSource());
				toStep.setTarget(step);
				toStep.getClockResets().addAll(curTransition.getClockResets());

				for (TransitionEvent curEvent : curTransition.getEvents()) {
					if (curEvent.getKind().equals(EventKind.TRIGGER)) {
						toStep.getEvents().add(curEvent);
						break;
					}
				}

				// Intermediate State -> Target
				Transition toTarget = rtscFactory.createTransition();
				toTarget.getClockConstraints().add(
						EcoreUtil.copy(cStepConstraint));
				toAdd.add(toTarget);
				toTarget.setAction(curTransition.getAction());
				toTarget.setSource(step);
				toTarget.setTarget(curTransition.getTarget());

				for (TransitionEvent curEvent : curTransition.getEvents()) {
					if (curEvent.getKind().equals(EventKind.RAISE)) {
						toTarget.getEvents().add(curEvent);
						break;
					}
				}
			}
		}
		for (Transition curTransition : toAdd)
			rtsc.getTransitions().add(curTransition);
		// rtsc.getTransitions().removeAll(toRemove);
		for (Transition curTransition : toRemove) {
			curTransition.getSource().getOutgoingTransitions()
					.remove(curTransition);
			curTransition.getTarget().getIncomingTransitions()
					.remove(curTransition);
			rtsc.getTransitions().remove(curTransition);

		}
	}

	/**
	 * Sets transitions of rtsc to urgent if it is associated with a
	 * synchronization. Used to make all event transitions of refined rtsc
	 * urgent.
	 * 
	 * @param rtsc
	 */
	protected void makeEventTransitionsUrgent(RealtimeStatechart rtsc) {
		for (Transition transition : rtsc.getTransitions()) {
			if (transition.getSynchronization() != null)
				transition.setUrgent(true);
		}
	}

	/**
	 * Sets transitions of rtsc to non urgent if it is associated with a
	 * synchronization. This does not affect urgent transitions that are
	 * incoming for the N state. Used to make all event transitions (but the N
	 * state transitions) of abstract rtsc non urgent
	 * 
	 * @param rtsc
	 */
	protected void makeEventTransitionsNonUrgent(RealtimeStatechart rtsc) {
		for (Transition transition : rtsc.getTransitions()) {
			if (transition.getSynchronization() != null
					&& transition.getTarget() != n)
				transition.setUrgent(false);
		}
	}

	/**
	 * Searches the maximum bound that is not infinity a clock is compared with
	 * in rtscs
	 * 
	 * @param rtscs
	 * @return the maximum bound * 10
	 */
	protected long getMaximumBound(HashSet<RealtimeStatechart> rtscs) {
//		long max = 0;
//
//		// find maximum bound that is not infinity
//		for (RealtimeStatechart curRtsc : rtscs) {
//			for (Transition curTransition : curRtsc.getTransitions()) {
//
//				for (ClockConstraint curCConstraint : curTransition
//						.getClockConstraints()) {
//					if (curCConstraint.getBound().getValue().getValue() > max) {
//						max = curCConstraint.getBound().getValue().getValue();
//					}
//				}
//			}
//			for (State curState : curRtsc.getStates()) {
//				for (ClockConstraint curInvariant : curState.getInvariants()) {
//					if (curInvariant.getBound().getValue().getValue() > max
//							&& !curInvariant.getBound().getValue().isInfinity())
//						max = curInvariant.getBound().getValue().getValue();
//				}
//			}
//		}

		return 500000;
	}

	/**
	 * Sets all synchronizations of rtsc to null
	 * 
	 * @param rtsc
	 */
	protected void deleteSynchronizations(RealtimeStatechart rtsc) {
		for (Transition curTransition : rtsc.getTransitions()) {
			curTransition.setSynchronization(null);
		}
	}

	/**
	 * Moves all variables of parent statechart of statechart (nameOfStatechart)
	 * to statechart
	 * 
	 * @param rtsc
	 * @param nameOfStatechart
	 */
	protected void moveParentVariablesToStatechart(RealtimeStatechart toRtsc) {

		if (toRtsc != null) {
			// search in all parent rtscs for variables
			RealtimeStatechart parent = toRtsc;
			while (parent != null) {
				if (parent.getVariables() != null && parent != toRtsc) {
					// store parent variables in globalVariables
					if (globalVariables == null)
						globalVariables = new HashSet<Variable>();
					globalVariables.addAll(parent.getVariables());
					// move parent variables to toRtsc
					// sort such that variables of higher statecharts have lower
					// indices, therefore they are initialized first
					toRtsc.getVariables().addAll(0, parent.getVariables());
				}
				// "increase" parent
				if (parent.getParentRegion() != null)
					parent = parent.getParentRegion().getParentState()
							.getParentStatechart();
				else
					parent = null;

			}
		}

	}

	protected HashSet<Variable> getVariablesWithNondeterministicInitilizeExpression(
			RealtimeStatechart rtsc) {
		HashSet<Variable> nondeterministicVariables = new HashSet<Variable>();
		for (Variable curVariable : rtsc.getVariables()) {
			if (curVariable.getInitializeExpression() != null) {

				NondeterminismHandler nondetHandler = new NondeterminismHandler();
				nondetHandler.setGlobalVariables(globalVariables);

				try {
					nondetHandler.startEvaluation(curVariable
							.getInitializeExpression());
				} catch (UnsupportedModellingElementException e) {
					e.printStackTrace();
				}
				if (nondetHandler.nonDeterminismFound()) {
					nondeterministicVariables.add(curVariable);
				}
			}
		}
		return nondeterministicVariables;
	}

	protected void expandNondeterminismTransitions(RealtimeStatechart rtsc) {

		NondeterminismHandler nondetHandler = new NondeterminismHandler();
		nondetHandler.setGlobalVariables(globalVariables);

		// check guards
		HashSet<Transition> transitions = new HashSet<Transition>();
		transitions.addAll(rtsc.getTransitions());

		for (Transition curTransition : transitions) {

			if (curTransition.getGuard() != null) {

				try {
					nondetHandler.startEvaluation(curTransition.getGuard());
				} catch (UnsupportedModellingElementException e) {
					e.printStackTrace();
				}
				if (nondetHandler.nonDeterminismFound()) {
					// substitute guard of curTransition with first
					// possibility
					// from substitutedExpressions
					EList<Expression> substitutedExpressions = nondetHandler
							.getSubstitutedExpressions();
					Expression firstExp = substitutedExpressions.get(0);
					curTransition.setGuard(firstExp);
					substitutedExpressions.remove(firstExp);
					// create new transitions for all other possibilities
					for (Expression curExp : nondetHandler
							.getSubstitutedExpressions()) {
						Transition newTransition = EcoreUtil
								.copy(curTransition);
						newTransition.setSource(curTransition.getSource());
						newTransition.setTarget(curTransition.getTarget());
						curTransition.getStatechart().getTransitions().add(newTransition);
						newTransition.setGuard(curExp);
					}

				}
			}

		}

		// check actions
		transitions.clear();
		transitions.addAll(rtsc.getTransitions());

		for (Transition curTransition : transitions) {
			if (curTransition.getAction() != null) {

				Expression actionExpression = null;

				// the expression that is not an instance of textual
				// expression
				// should be the actions implementation in action language
				for (Expression curExp : curTransition.getAction()
						.getExpressions()) {
					if (!(curExp instanceof TextualExpression)) {
						actionExpression = curExp;
						break;
					}
				}
				if (actionExpression == null)
					continue;
				try {
					nondetHandler.startEvaluation(actionExpression);
				} catch (UnsupportedModellingElementException e) {
					e.printStackTrace();
				}
				if (nondetHandler.nonDeterminismFound()) {
					// substitute action of curTransition with first
					// possibility
					// from substitutedExpressions
					EList<Expression> substitutedExpressions = nondetHandler
							.getSubstitutedExpressions();
					Expression firstExp = substitutedExpressions.get(0);
					curTransition.getAction().getExpressions()
							.remove(actionExpression);
					curTransition.getAction().getExpressions().add(firstExp);
					substitutedExpressions.remove(firstExp);

					// create new transitions for all other possibilities
					for (Expression curExp : substitutedExpressions) {
						// copy the transition
						Transition newTransition = EcoreUtil
								.copy(curTransition);
						newTransition.setSource(curTransition.getSource());
						newTransition.setTarget(curTransition.getTarget());
						curTransition.getStatechart().getTransitions().add(newTransition);
						// delete old Expression in action language
						Expression deleteExp = null;
						for (Expression expression : newTransition.getAction()
								.getExpressions())
							if (!(expression instanceof TextualExpression)) {
								deleteExp = expression;
								break;
							}
						if (deleteExp != null)
							newTransition.getAction().getExpressions()
									.remove(deleteExp);
						// substitute old expression with new one
						newTransition.getAction().getExpressions().add(curExp);
					}

				}
			}
		}

	}

	/**
	 * Returns RealtimeStatechart with the name contained (not necessarily
	 * directly) in rtsc
	 * 
	 * @param rtsc
	 * @param name
	 * @return
	 */
	protected RealtimeStatechart searchRtsc(RealtimeStatechart rtsc, String name) {
		if (rtsc.getName().equals(name))
			return rtsc;
		for (State curState : rtsc.getStates()) {
			if (curState.getEmbeddedRegions() != null)
				for (Region curRegion : curState.getEmbeddedRegions()) {
					if (curRegion.getEmbeddedStatechart() != null) {
						if (curRegion.getEmbeddedStatechart().getName().equals(name))
							return curRegion.getEmbeddedStatechart();
					} else
						return searchRtsc(curRegion.getEmbeddedStatechart(),
								name);
				}
		}
		return null;
	}

	protected HashSet<RealtimeStatechart> getEmbeddedStatecharts(
			RealtimeStatechart rtsc) {
		HashSet<RealtimeStatechart> embeddedRtscs = new HashSet<RealtimeStatechart>();

		for (State curState : rtsc.getStates()) {
			if (curState.getEmbeddedRegions() != null
					&& !curState.getEmbeddedRegions().isEmpty()) {
				for (Region curRegion : curState.getEmbeddedRegions())
					if (curRegion.getEmbeddedStatechart() != null)
						embeddedRtscs.add(curRegion.getEmbeddedStatechart());
			}
		}
		return embeddedRtscs;
	}

	/**
	 * make all transitions of rtsc urgent and move invariants to clock
	 * constraints
	 * 
	 * @param rtsc
	 */
	protected void moveInvariantsToClockConstraints(RealtimeStatechart rtsc) {

		for (State curState : rtsc.getStates()) {
			if (curState.getInvariants() != null
					&& !curState.getInvariants().isEmpty()) {
				for (ClockConstraint curInvariant : curState.getInvariants()) {
					for (Transition curTransition : curState
							.getOutgoingTransitions()) {
						curTransition.getClockConstraints().add(
								EcoreUtil.copy(curInvariant));
						eliminateDispensableClockConstraints(curTransition
								.getClockConstraints());
					}
				}
			}
			curState.getInvariants().clear();
		}
	}


	protected void adjustToSharedVariables() {
		// mapps variables of abstract to variables of refined
		HashMap<Variable, Variable> variableMapping = new HashMap<Variable, Variable>();

		// search variables assigned by nondeterminism i.e.
		// NondeterministicChoiceExpression and global Variables
		NondeterminismHandler nondetHandler = nondetEvaluation(testAutomaton,
				false, false, null);

		HashSet<Variable> nondetVariables = nondetHandler
				.getVariablesAssignedByNonDeterminism();
		// map these variables to variables of refined rtsc
		for (Variable abstractVariable : nondetVariables) {
			for (Variable refinedVariable : testRtscCopy.getVariables()) {
				if (abstractVariable.getName()
						.equals(refinedVariable.getName()))
					variableMapping.put(abstractVariable, refinedVariable);
			}
		}

		// search calls of these variables
		nondetHandler = nondetEvaluation(testAutomaton, false, true,
				nondetVariables);

		HashSet<TypedNamedElementExpression> nondetCalls = nondetHandler
				.getCallsOfNDVariables();

		// adjust the calls such that they are now referencing the mapped
		// variable
		for (TypedNamedElementExpression tneExpression : nondetCalls) {
			Variable refinedVariable = variableMapping
					.get((Variable) tneExpression.getTypedNamedElement());
			// move refined variable to parent statechart
			if (!parentRtsc.getVariables().contains(refinedVariable))
				parentRtsc.getVariables().add(refinedVariable);
			tneExpression.setTypedNamedElement(refinedVariable);
		}

		// search assignments to these variables
		nondetHandler = nondetEvaluation(testAutomaton, true, false,
				nondetVariables);

		HashSet<Assignment> nondetAssignments = nondetHandler
				.getAssignmentsToNDVariables();

		// delete these assignments and all contained expressions
		for (Assignment curAssignment : nondetAssignments) {
			EcoreUtil.delete(curAssignment, true);
		}

		// delete the nondet variables of abstract rtsc
		for (Variable curVar : nondetVariables) {
			EcoreUtil.delete(curVar);
		}
	}

	private NondeterminismHandler nondetEvaluation(RealtimeStatechart rtsc,
			boolean checkAssignments, boolean checkCalls,
			HashSet<Variable> nondetVariables) {
		NondeterminismHandler nondetHandler = new NondeterminismHandler();
		nondetHandler.setGlobalVariables(globalVariables);
		nondetHandler.setCheckForAssignmentsToNDVariables(checkAssignments);
		nondetHandler.setCheckForCallsOfNDVariables(checkCalls);
		HashSet<RealtimeStatechart> allRtscs = new HashSet<RealtimeStatechart>();
		allRtscs.add(rtsc);
		allRtscs.addAll(getEmbeddedStatecharts(rtsc));
		for (RealtimeStatechart curRtsc : allRtscs) {
			if (nondetVariables != null)
				nondetHandler.setNondeterministicVariables(nondetVariables);

			for (Transition curTransition : curRtsc.getTransitions()) {
				// actions
				if (curTransition.getAction() != null) {
					Expression action = null;
					for (Expression curExpression : curTransition.getAction()
							.getExpressions()) {
						if (!(curExpression instanceof TextualExpression))
							action = curExpression;
					}
					if (action != null) {
						try {
							nondetHandler.startEvaluation(action);
						} catch (UnsupportedModellingElementException e) {
							e.printStackTrace();
						}
					}
				}
				// guards
				if (curTransition.getGuard() != null
						&& !(curTransition.getGuard() instanceof TextualExpression) && checkCalls) {
					try {
						nondetHandler.startEvaluation(curTransition.getGuard());
					} catch (UnsupportedModellingElementException e) {
						e.printStackTrace();
					}
				}
			}
			
			for(State curState : curRtsc.getStates()){
				
				//entry actions
				if(curState.getEntryEvent()!= null && curState.getEntryEvent().getAction()!= null){
					Expression action = null;
					for(Expression curExp: curState.getEntryEvent().getAction().getExpressions()){
						if(!(curExp instanceof TextualExpression))
							action = curExp;
					}
					if(action != null)
						try {
							nondetHandler.startEvaluation(action);
						} catch (UnsupportedModellingElementException e) {
							e.printStackTrace();
						}
				}
				
				//exit actions
				if(curState.getExitEvent() != null && curState.getExitEvent().getAction()!= null){
					Expression action = null;
					for(Expression curExp: curState.getExitEvent().getAction().getExpressions()){
						if(!(curExp instanceof TextualExpression))
							action = curExp;
					}
					if(action != null)
						try {
							nondetHandler.startEvaluation(action);
						} catch (UnsupportedModellingElementException e) {
							e.printStackTrace();
						}
				}
			}
		}
		return nondetHandler;
	}
	
	protected Clock getCta(){
		if (cTa == null) {
			cTa = rtscFactory.createClock();
			cTa.setName("cTa");
			cTa.setStatechart(parentRtsc);
		}
		return cTa;
	}
}
