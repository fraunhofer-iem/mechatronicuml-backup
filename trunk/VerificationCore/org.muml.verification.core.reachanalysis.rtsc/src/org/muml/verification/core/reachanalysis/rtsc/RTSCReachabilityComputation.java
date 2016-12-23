package org.muml.verification.core.reachanalysis.rtsc;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
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
import org.muml.core.reachanalysis.core.ReachabilityComputation;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;
import org.muml.pim.behavior.Variable;
import org.muml.pim.realtimestatechart.AbsoluteDeadline;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.SynchronizationKind;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.types.DataType;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.pim.types.PrimitiveTypes;
import org.muml.pim.types.TypesFactory;
import org.muml.pim.valuetype.TimeValue;
import org.muml.udbm.DifferenceClockConstraint;
import org.muml.udbm.Federation;
import org.muml.udbm.FederationFactory;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.RelationalOperator;
import org.muml.udbm.java.JavaFederationFactory;
import org.muml.verification.core.actionlanguage.interpreter.ActionLanguageInterpreter;
import org.muml.verification.core.actionlanguage.interpreter.exceptions.IncompatibleTypeException;
import org.muml.verification.core.actionlanguage.interpreter.exceptions.UnsupportedModellingElementException;
import org.muml.verification.core.actionlanguage.interpreter.exceptions.VariableNotInitializedException;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.DelayTransition;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscFactory;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraphState;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraphTransition;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;
import org.muml.verification.core.runtime.RuntimeFactory;
import org.muml.verification.core.runtime.VariableBinding;

public class RTSCReachabilityComputation extends ReachabilityComputation {

	HashSet<RealtimeStatechart> rtscs;

	private ActionLanguageInterpreter alInterpreter;

	private HashMap<EList<Transition>, Federation> allTriggerFeds;

	/**
	 * Maps {@link RealtimeStatechart}s to its parents
	 */
	private HashMap<RealtimeStatechart, RealtimeStatechart> parentRtscMapping;

	private EList<EList<Transition>> transitionSets;

	private HashSet<DifferenceClockConstraint> diffClockConstraints;

	private RtscFactory rtscFactory;

	private FederationFactory fedFactory;

	private RuntimeFactory runtimeFactory;

	private static RealtimeStatechart rootRtsc;

	/**
	 * Value used for normalization of clocks compared with expressions that can
	 * not be evaluated statically
	 */
	private final int clockMaxValue;

	// maps rtsc clock to corresponding udbm clock
	private HashMap<Clock, UDBMClock> clockMapping;

	// private TimeUnit smallestTimeUnit = TimeUnit.DAYS;

	private final HashMap<UDBMClock, Integer> clockMaxValues;

	public RTSCReachabilityComputation(HashSet<RealtimeStatechart> rtscs) {
		super();

		clockMaxValue = Integer.MAX_VALUE >> 4;

		// switch between RubyFederationFactory and JavaFederationFactory
		fedFactory = new JavaFederationFactory();
		rtscFactory = RtscFactory.eINSTANCE;
		runtimeFactory = RuntimeFactory.eINSTANCE;
		this.rtscs = rtscs;

		alInterpreter = new ActionLanguageInterpreter();

		Iterator<RealtimeStatechart> rtscIter = rtscs.iterator();
		// All rtscs should have the same root rtsc, otherwise a
		// reachability analysis can be performed for each of them separately
		rootRtsc = rtscIter.next().getHighestParentStatechart();

		while (rtscIter.hasNext())
			if (!rtscIter.next().getHighestParentStatechart().equals(rootRtsc))
				throw new UnsupportedOperationException("All realtimestatecharts should have the same root statechart");

		parentRtscMapping = collectParentRtscs(null, rootRtsc);

		clockMapping = translateClocksToUDBMClocks(rootRtsc);
		diffClockConstraints = new HashSet<DifferenceClockConstraint>();
		HashSet<RealtimeStatechart> root = new HashSet<RealtimeStatechart>();
		root.add(rootRtsc);
		EList<VariableBinding> constantVariableBindings = createVariableBindingsForConstants();
		clockMaxValues = collectClockMaxValues(constantVariableBindings);

	}

	@Override
	protected ReachabilityGraph createReachabilityGraph() {
		ReachabilityGraph zoneGraph = RtscFactory.eINSTANCE.createZoneGraph();
		return zoneGraph;
	}

	public TimeSemantics getTimeSemantics() {
		return TimeSemantics.UPPAAL;
	}

	/**
	 * Creates new state with delayed federation
	 * 
	 * @param state
	 *            the source {@link ReachabilityGraphState} to be delayed
	 * @param invariants
	 *            invariants of original {@link State}s
	 * @return new {@link ReachabilityGraphState} with delayed
	 *         {@link Federation} null if source state is reached by delay
	 */
	protected ReachabilityGraphState delay(ReachabilityGraphState state,
			Collection<org.muml.udbm.ClockConstraint> invariants, boolean urgent,
			Collection<Federation> federations) {

		// check if state is a TimedState, otherwise no delay is possible
		if (!(state instanceof ZoneGraphState)) {
			throw new UnsupportedOperationException("Delay not possible for untimed states.");
		}

		// only perform delay if state has not been reached by a delay
		boolean reachedByDelay = false;
		Iterator<ReachabilityGraphTransition> iter = state.getIncomingTransitions().iterator();
		while (iter.hasNext()) {
			ReachabilityGraphTransition nextTrans = iter.next();
			if (nextTrans instanceof DelayTransition) {
				reachedByDelay = true;
				break;
			}
		}

		ReachabilityGraphState result = null;

		if (!reachedByDelay) {
			// create delay transition and copy the state
			ReachabilityGraphTransition newTrans = rtscFactory.createDelayTransition();
			newTrans.setSource(state);
			result = copyState(state, newTrans);

			if (!urgent) {
				// perform delay
				Federation fed = ((ZoneGraphState) result).getFederation();
				fed.up();
				if (invariants != null)
					fed.and(invariants);
			}

			if (urgent) {
				// in case of outgoing urgent transitions delay until clock
				// constraints are true
				Federation upTriggerFed = (Federation) ((ZoneGraphState) state).getFederation().clone();
				upTriggerFed.up();
				Federation downTriggerFed = (Federation) ((ZoneGraphState) state).getFederation().clone();
				downTriggerFed.down();

				HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
				clocks.addAll(clockMapping.values());
				Iterator<Federation> fedIterator = federations.iterator();
				Federation orFederation = (Federation) fedIterator.next().clone();

				while (fedIterator.hasNext()) {
					orFederation.or(fedIterator.next());
				}

				orFederation.subtract(downTriggerFed);
				orFederation.up();
				upTriggerFed.subtract(orFederation);
				upTriggerFed.relax();
				if (invariants != null)
					upTriggerFed.and(invariants);
				((ZoneGraphState) result).setFederation(upTriggerFed);

			}

			// normalize federation
			if (((ZoneGraphState) result).getFederation() != null && !clockMaxValues.isEmpty())
				((ZoneGraphState) result).getFederation().normalize(clockMaxValues);
		}

		return result;
	}

	@Override
	protected HashSet<ReachabilityGraphState> computeSuccessors(ReachabilityGraphState state) {

		EList<ClockConstraint> enabledUrgentClockConstraints = new BasicEList<ClockConstraint>();
		boolean urgentFound = false;
		boolean urgentEnabled = false;
		HashSet<Federation> urgentFederations = new HashSet<Federation>();

		if (!(state instanceof ZoneGraphState)) {
			return null;
		}

		// transition sets contain 1-2 transitions triggering at the same time
		// (tau or sync)
		transitionSets = new BasicEList<EList<Transition>>();

		// federations/zones defining when the sets may trigger
		allTriggerFeds = new HashMap<EList<Transition>, Federation>();

		HashSet<Transition> staticTransitions = createTransitionSet((ZoneGraphState) state);
		/***************************************************************/

		// collect synchronizations and tau transitions
		HashSet<Transition> checkedTransitions = new HashSet<Transition>();
		for (Transition transition : staticTransitions) {
			// find location containing transition
			RealtimeStatechartInstance firstLocation = null;
			for (RealtimeStatechartInstance curLocation : ((ZoneGraphState) state).getLocations())
				if (curLocation.getInstanceOf().equals(transition.getStatechart())) {
					firstLocation = curLocation;
					break;
				}

			if (transition.getGuard() != null) {
				// check guard
				DataType boolType = TypesFactory.eINSTANCE.createPrimitiveDataType();
				((PrimitiveDataType) boolType).setPrimitiveType(PrimitiveTypes.BOOLEAN);
				// evaluate guard
				Object result = null;
				try {
					result = alInterpreter.evaluateExpression(firstLocation.getAllAvailableVariableBindings(),
							transition.getGuard());
				} catch (UnsupportedModellingElementException e1) {
					e1.printStackTrace();
				} catch (VariableNotInitializedException e1) {
					e1.printStackTrace();
				} catch (IncompatibleTypeException e1) {
					e1.printStackTrace();
				}
				boolean boolResult = false;
				if (!(result instanceof Boolean)) {
					try {
						boolResult = (Boolean) alInterpreter.castTo(boolType, result);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else
					boolResult = (Boolean) result;
				// if guard not evaluated to true goto next transition
				if (!boolResult)
					continue;
			}
			if (!(transition.getTarget() instanceof State))
				continue;

			// collect synchronizations
			if (transition.getSynchronization() != null) {

				// evaluate selector expression
				Object firstSelectorValue = null;
				EList<VariableBinding> variableBindings = null;
				if (transition.getSynchronization().getSelectorExpression() != null) {
					// get variable bindings
					for (RealtimeStatechartInstance curLocation : ((ZoneGraphState) state).getLocations())
						if (curLocation.getInstanceOf().equals(transition.getStatechart()))
							variableBindings = curLocation.getAllAvailableVariableBindings();
					try {
						firstSelectorValue = alInterpreter.evaluateExpression(variableBindings,
								transition.getSynchronization().getSelectorExpression());
					} catch (UnsupportedModellingElementException e) {
						e.printStackTrace();
					} catch (VariableNotInitializedException e) {
						e.printStackTrace();
					} catch (IncompatibleTypeException e) {
						e.printStackTrace();
					}

					// test whether firstSelectorValue is of correct type
					try {
						alInterpreter.castTo(transition.getSynchronization().getSyncChannel().getSelectorType(),
								firstSelectorValue);
					} catch (IncompatibleTypeException e) {
						e.printStackTrace();
					} catch (UnsupportedModellingElementException e) {
						e.printStackTrace();
					}
				}

				// see if there is a transition that may synchronize with the
				// blocked transition
				for (Transition secondTransition : staticTransitions) {
					// two transitions cannot synchronize if they are part of
					// the same statechart
					if (transition.getStatechart().equals(secondTransition.getStatechart()))
						continue;

					// find location containing transition
					RealtimeStatechartInstance secondLocation = null;
					for (RealtimeStatechartInstance curLocation : ((ZoneGraphState) state).getLocations())
						if (curLocation.getInstanceOf().equals(secondTransition.getStatechart())) {
							secondLocation = curLocation;
							break;
						}

					if (secondTransition.getGuard() != null) {
						// check guard
						DataType boolType = TypesFactory.eINSTANCE.createPrimitiveDataType();
						((PrimitiveDataType) boolType).setPrimitiveType(PrimitiveTypes.BOOLEAN);
						// evaluate guard
						Object result = null;
						try {
							result = alInterpreter.evaluateExpression(secondLocation.getAllAvailableVariableBindings(),
									secondTransition.getGuard());
						} catch (UnsupportedModellingElementException e1) {
							e1.printStackTrace();
						} catch (VariableNotInitializedException e1) {
							e1.printStackTrace();
						} catch (IncompatibleTypeException e1) {
							e1.printStackTrace();
						}
						boolean boolResult = false;
						try {
							boolResult = (Boolean) alInterpreter.castTo(boolType, result);
						} catch (Exception e) {
							e.printStackTrace();
						}
						// if guard not evaluated to true goto next transition
						if (!boolResult)
							continue;
					}

					if (transition.getSynchronization() != null && secondTransition.getSynchronization() != null
							&& !secondTransition.equals(transition)
							&& !transition.getStatechart().equals(secondTransition.getStatechart())
							&& !checkedTransitions.contains(secondTransition)) {

						SynchronizationKind firstSyncKind = transition.getSynchronization().getKind();
						SynchronizationKind secondSyncKind = secondTransition.getSynchronization().getKind();

						// compare sync channels and whether it is one send and
						// one
						// receive
						if (transition.getSynchronization().getSyncChannel()
								.equals(secondTransition.getSynchronization().getSyncChannel())
								&& ((firstSyncKind == SynchronizationKind.RECEIVE
										&& secondSyncKind == SynchronizationKind.SEND)
										|| (firstSyncKind == SynchronizationKind.SEND
												&& secondSyncKind == SynchronizationKind.RECEIVE))) {

							if (transition.getSynchronization().getSyncChannel().getSelectorType() != null
									&& (transition.getSynchronization().getSelectorExpression() == null
											|| secondTransition.getSynchronization().getSelectorExpression() == null))
								throw new IllegalArgumentException("Synchronizations for channel "
										+ transition.getSynchronization().getSyncChannel()
										+ " need selector expressions.");
							// evaluate selector expression
							Object secondSelectorValue = null;
							if (transition.getSynchronization().getSelectorExpression() != null) {
								// get variable bindings
								for (RealtimeStatechartInstance curLocation : ((ZoneGraphState) state).getLocations())
									if (curLocation.getInstanceOf().equals(transition.getStatechart())) {
										variableBindings = curLocation.getAllAvailableVariableBindings();
										break;
									}
								try {
									secondSelectorValue = alInterpreter.evaluateExpression(variableBindings,
											secondTransition.getSynchronization().getSelectorExpression());
								} catch (UnsupportedModellingElementException e) {
									e.printStackTrace();
								} catch (VariableNotInitializedException e) {
									e.printStackTrace();
								} catch (IncompatibleTypeException e) {
									e.printStackTrace();
								}

								// test whether secondSelectorValue is of
								// correct
								// type
								try {
									alInterpreter.castTo(
											secondTransition.getSynchronization().getSyncChannel().getSelectorType(),
											secondSelectorValue);
								} catch (IncompatibleTypeException e) {
									e.printStackTrace();
								} catch (UnsupportedModellingElementException e) {
									e.printStackTrace();
								}
							}
							// check selector values for equality
							if (transition.getSynchronization().getSyncChannel().getSelectorType() != null
									&& !firstSelectorValue.equals(secondSelectorValue))
								continue;
							// transition found
							addTransitionSet((ZoneGraphState) state, transition, secondTransition, firstLocation,
									secondLocation);

							// transitionSet is urgent, if both transitions
							// are urgent
							if (transition.isUrgent() && secondTransition.isUrgent()) {

								urgentFound = true;

								// if outgoing urgent transitionSets were found,
								// create Federation with conjugated clock
								// constraints for performing the delay in this
								// case
								HashSet<org.muml.udbm.ClockConstraint> cConSet = new HashSet<org.muml.udbm.ClockConstraint>();

								DataType intType = TypesFactory.eINSTANCE.createPrimitiveDataType();
								((PrimitiveDataType) intType).setPrimitiveType(PrimitiveTypes.INT32);

								for (ClockConstraint cCon : transition.getClockConstraints()) {
									UDBMClock clockForCC = clockMapping.get(cCon.getClock());

									Object value;
									try {
										value = alInterpreter.evaluateExpression(
												firstLocation.getAllAvailableVariableBindings(),
												cCon.getBound().getValue());
										int intValue = (Integer) alInterpreter.castTo(intType, value);

										if (clockForCC != null) {
											SimpleClockConstraint constraint = new SimpleClockConstraint(clockForCC,
													getRelationalOperatorForComparingOperator(cCon.getOperator()),
													intValue);
											cConSet.add(constraint);

										}
									} catch (UnsupportedModellingElementException e) {
										e.printStackTrace();
									} catch (VariableNotInitializedException e) {
										e.printStackTrace();
									} catch (IncompatibleTypeException e) {
										e.printStackTrace();
									}

								}

								for (ClockConstraint cCon : secondTransition.getClockConstraints()) {
									UDBMClock clockForCC = clockMapping.get(cCon.getClock());

									Object value;
									try {
										value = alInterpreter.evaluateExpression(
												secondLocation.getAllAvailableVariableBindings(),
												cCon.getBound().getValue());
										int intValue = (Integer) alInterpreter.castTo(intType, value);

										if (clockForCC != null) {
											SimpleClockConstraint constraint = new SimpleClockConstraint(clockForCC,
													getRelationalOperatorForComparingOperator(cCon.getOperator()),
													intValue);
											cConSet.add(constraint);
										}
									} catch (UnsupportedModellingElementException e) {
										e.printStackTrace();
									} catch (VariableNotInitializedException e) {
										e.printStackTrace();
									} catch (IncompatibleTypeException e) {
										e.printStackTrace();
									}

								}

								HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
								clocks.addAll(clockMapping.values());

								if (!clocks.isEmpty()) {
									if (!cConSet.isEmpty()) {
										Federation transitionSetFederation = fedFactory.createFederation(clocks,
												cConSet);
										urgentFederations.add(transitionSetFederation);
									} else {
										Federation transitionSetFederation = fedFactory.createZeroFederation(clocks);
										transitionSetFederation.up();
										urgentFederations.add(transitionSetFederation);
									}
								}
							}

						}
					}

				}

			} else // no sync is needed -> tau-transition
			{
				// add tau transition to a new set, only including this
				// transition
				addTransitionSet((ZoneGraphState) state, transition, null, firstLocation, null);
				if (transition.isUrgent()) {

					DataType intType = TypesFactory.eINSTANCE.createPrimitiveDataType();
					((PrimitiveDataType) intType).setPrimitiveType(PrimitiveTypes.INT32);

					// if outgoing urgent tau transition was found, get its
					// clock constraints for performing the delay in this case
					HashSet<org.muml.udbm.ClockConstraint> cConSet = new HashSet<org.muml.udbm.ClockConstraint>();

					for (ClockConstraint cCon : transition.getClockConstraints()) {
						UDBMClock clockForCC = clockMapping.get(cCon.getClock());

						Object value;
						try {
							value = alInterpreter.evaluateExpression(firstLocation.getAllAvailableVariableBindings(),
									cCon.getBound().getValue());
							int intValue = (Integer) alInterpreter.castTo(intType, value);

							if (clockForCC != null) {
								SimpleClockConstraint constraint = new SimpleClockConstraint(clockForCC,
										getRelationalOperatorForComparingOperator(cCon.getOperator()), intValue);
								cConSet.add(constraint);
							}
						} catch (UnsupportedModellingElementException e) {
							e.printStackTrace();
						} catch (VariableNotInitializedException e) {
							e.printStackTrace();
						} catch (IncompatibleTypeException e) {
							e.printStackTrace();
						}

					}
					HashSet<UDBMClock> clocks = new HashSet<UDBMClock>();
					clocks.addAll(clockMapping.values());

					if (!clocks.isEmpty()) {
						if (!cConSet.isEmpty()) {
							Federation tauFederation = fedFactory.createFederation(clocks, cConSet);
							urgentFederations.add(tauFederation);
						} else {
							Federation tauFederation = fedFactory.createZeroFederation(clocks);
							tauFederation.up();
							urgentFederations.add(tauFederation);
						}
					}
					urgentFound = true;
				}

			}
			checkedTransitions.add(transition);
		}

		// if outgoing urgent transitionSets were found, check if there are
		// enabled urgent transition sets
		if (urgentFound) {
			for (EList<Transition> set : transitionSets) {
				boolean urgent = false;
				Iterator<Transition> transitionSetIterator = set.iterator();
				Transition firstTransition = transitionSetIterator.next();
				Transition secondTransition = null;
				if (firstTransition.isUrgent())
					urgent = true;
				// transitionSet is only urgent, if both transitions are urgent
				if (transitionSetIterator.hasNext() && urgent) {
					secondTransition = transitionSetIterator.next();
					if (!secondTransition.isUrgent())
						urgent = false;

				}
				if (urgent) {
					// since all transitions sets in transitionSets are enabled,
					// there is an enabled urgent transition set
					urgentEnabled = true;

					// add clock constraints to set for computing federation
					// representing time intervals where nonurgent transitions
					// can fire
					enabledUrgentClockConstraints.addAll(firstTransition.getClockConstraints());
					if (secondTransition != null)
						enabledUrgentClockConstraints.addAll(secondTransition.getClockConstraints());
					break;
				}

			}

		}

		// if there exit enabled urgent transitions, compute Federation
		// representing time intervals where non urgent transitions can fire
		
		Federation nonUrgentFed = null;
		if(!urgentFederations.isEmpty()){
			nonUrgentFed = (Federation) ((ZoneGraphState)state).getFederation().clone();
			for(Federation uFed : urgentFederations){
				nonUrgentFed.subtract(uFed);
			}
		}

		return fireTransitions(urgentEnabled, nonUrgentFed, urgentFound, ((ZoneGraphState) state), urgentFederations);

	}

	/**
	 * Create successor for delay and each enabled Transition with respect to
	 * prioritized urgent transitions.
	 * 
	 * @param urgentEnabled
	 *            Are there enabled urgent transitions?
	 * @param nonUrgentFed
	 *            If there are outgoing urgent transitions, this federation
	 *            represents the time intervals in which nonurgent transitions
	 *            can still fire.
	 * @param urgentFound
	 *            are there outgoing urgent transitions
	 * @param state
	 *            the state to compute successors for
	 * @param urgentFederations
	 *            the federations representing the time intervals outgoing
	 *            urgent transitions can fire
	 * @return
	 */
	protected HashSet<ReachabilityGraphState> fireTransitions(boolean urgentEnabled, Federation nonUrgentFed,
			boolean urgentFound, ZoneGraphState state, HashSet<Federation> urgentFederations) {
		// fire all enabled transitions with respect to prioritized urgent
		// transitions

		HashSet<ReachabilityGraphState> followingZones = new HashSet<ReachabilityGraphState>();
		for (EList<Transition> firedTransitions : transitionSets) {
			boolean curTransIsUrgent = false;
			boolean curNonUrgentIsEnabled = false;
			Iterator<Transition> transitionIter = firedTransitions.iterator();
			if (transitionIter.next().isUrgent())
				curTransIsUrgent = true;
			if (transitionIter.hasNext() && curTransIsUrgent) {
				if (!transitionIter.next().isUrgent())
					curTransIsUrgent = false;
			}

			// if there are enabled urgent transitions and current transition is
			// nonurgent, there is still the possibility that this transition
			// can fire in some time intervals. So check this.
			if (urgentEnabled && !curTransIsUrgent && nonUrgentFed != null && !nonUrgentFed.isEmpty()) {
				Federation checkFederation = (Federation) nonUrgentFed.clone();
				for (Transition curTransition : firedTransitions)
					for (ClockConstraint curClockConstraint : curTransition.getClockConstraints())
						applyClockConstraint(state, curClockConstraint, checkFederation);
				if (!checkFederation.isEmpty()) {
					curNonUrgentIsEnabled = true;
					allTriggerFeds.put(firedTransitions, checkFederation);
				}
			}
			// if there are enabled urgent transitions, fire these and possible
			// nonurgent transitions
			// if there are no enabled urgent transitions fire non-urgent
			// transitions
			if ((urgentEnabled && (curNonUrgentIsEnabled || curTransIsUrgent)) || !urgentEnabled) {
				ZoneGraphState newZone = (ZoneGraphState) copyState(state, null);

				// change locations(s) according to taken transition(s)
				for (Transition transition : firedTransitions) {
					HashSet<RealtimeStatechartInstance> toRemove = new HashSet<RealtimeStatechartInstance>();
					RealtimeStatechartInstance newLocation = null;
					// change active state and remove embedded locations
					// according to taken transition
					for (RealtimeStatechartInstance location : newZone.getLocations()) {
						if (((RealtimeStatechartInstance) location).getInstanceOf()
								.equals(transition.getStatechart())) {
							newLocation = location;
							// change active state
							location.setActiveVertex((State) transition.getTarget());
							// also remove locations corresponding embedded
							// rtscs
							toRemove.addAll(location.getSubRealtimeStatechartInstances());
							break;
						}
					}
					if (newLocation == null)
						throw new IllegalArgumentException("Statechart " + transition.getStatechart().toString()
								+ " of " + transition.toString() + " has no corresponding RTSCInstance in zone");

					newZone.getLocations().removeAll(toRemove);

					// add locations for embedded rtscs
					HashSet<RealtimeStatechartInstance> newEmbeddedLocations = new HashSet<RealtimeStatechartInstance>();

					if (transition.getTarget() instanceof State) {
						newEmbeddedLocations.addAll(
								createLocationsForEmbeddedRtscs(null, ((State) transition.getTarget()), newLocation));
					}
					// create variable bindings
					initializeVariables(newEmbeddedLocations);

					// add new locations
					newZone.getLocations().addAll(newEmbeddedLocations);

					// set subRealtimeStatechart/parentRealtimeStatechart
					// reference of locations
					adjustRealtimeStatechartReferences(newZone);

					// apply actions of transitions to variable bindings
					if (transition.getAction() != null && transition.getAction().getExpressions() != null
							&& !transition.getAction().getExpressions().isEmpty() && newLocation != null)
						for (Expression curExp : transition.getAction().getExpressions()) {
							// The expression that is not instance of
							// TextualExpression should be implementation of
							// Expression in ActionLanguage
							if (!(curExp instanceof TextualExpression))
								try {
									alInterpreter.evaluateExpression(newLocation.getAllAvailableVariableBindings(),
											curExp);
								} catch (Exception e) {
									e.printStackTrace();
								}
						}

					// apply exit actions to variable bindings
					if (((State) transition.getSource()).getExitEvent() != null
							&& ((State) transition.getSource()).getExitEvent().getAction() != null)
						for (Expression curExpression : ((State) transition.getSource()).getExitEvent().getAction()
								.getExpressions()) {
							// The expression that is not a TextualExpression
							// should be implementation in ActionLanguage
							if (!(curExpression instanceof TextualExpression))
								try {
									alInterpreter.evaluateExpression(newLocation.getAllAvailableVariableBindings(),
											curExpression);
								} catch (UnsupportedModellingElementException e) {

									e.printStackTrace();
								} catch (VariableNotInitializedException e) {

									e.printStackTrace();
								} catch (IncompatibleTypeException e) {

									e.printStackTrace();
								}
							break;
						}

					// apply entry actions to variable bindings
					if (((State) transition.getTarget()).getEntryEvent() != null
							&& ((State) transition.getTarget()).getEntryEvent().getAction() != null)
						for (Expression curExpression : ((State) transition.getTarget()).getEntryEvent().getAction()
								.getExpressions()) {
							// The expression that is not a TextualExpression
							// should be implementation in ActionLanguage
							if (!(curExpression instanceof TextualExpression))
								try {
									alInterpreter.evaluateExpression(newLocation.getAllAvailableVariableBindings(),
											curExpression);
								} catch (UnsupportedModellingElementException e) {
									e.printStackTrace();
								} catch (VariableNotInitializedException e) {

									e.printStackTrace();
								} catch (IncompatibleTypeException e) {

									e.printStackTrace();
								}
							break;
						}

					// collect DifferenceClockConstraints for diagonalNormalize
					for (ClockConstraint cc : transition.getClockConstraints()) {
						if (cc instanceof DifferenceClockConstraint) {
							diffClockConstraints.add((DifferenceClockConstraint) cc);
						}
					}

				}
				newZone.setFederation(allTriggerFeds.get(firedTransitions));
				// apply resets
				HashSet<UDBMClock> resets = new HashSet<UDBMClock>();
				for (Transition transition : firedTransitions) {
					for (Clock reset : transition.getClockResets()) {
						UDBMClock resetCLock = clockMapping.get(reset);
						resets.add(resetCLock);
					}
					// get resets from exit events
					if (((State) transition.getSource()).getExitEvent() != null
							&& ((State) transition.getSource()).getExitEvent().getClockResets() != null)
						for (Clock reset : ((State) transition.getSource()).getExitEvent().getClockResets()) {
							UDBMClock resetCLock = clockMapping.get(reset);
							resets.add(resetCLock);
						}

					// get resets from entry events
					if (((State) transition.getTarget()).getEntryEvent() != null
							&& ((State) transition.getTarget()).getEntryEvent().getClockResets() != null)
						for (Clock reset : ((State) transition.getTarget()).getEntryEvent().getClockResets()) {
							UDBMClock resetCLock = clockMapping.get(reset);
							resets.add(resetCLock);
						}

				}

				if (newZone.getFederation() != null) {
					newZone.getFederation().applyResets(resets);
					normalizeZone(newZone);
				}
				ZoneGraphTransition zoneTransition = RtscFactory.eINSTANCE.createZoneGraphTransition();
				zoneTransition.getFiredRTSCTransitions().addAll(firedTransitions);

				zoneTransition.setSource(state);
				zoneTransition.setTarget(newZone);
				followingZones.add(newZone);
			}

		}

		// }

		// Delay Transition
		if ((((ZoneGraphState) state).getIncomingTransitions().size() == 0
				|| !(((ZoneGraphState) state).getIncomingTransitions().get(0) instanceof DelayTransition))
				&& !urgentEnabled) {
			DataType intType = TypesFactory.eINSTANCE.createPrimitiveDataType();
			((PrimitiveDataType) intType).setPrimitiveType(PrimitiveTypes.INT32);

			// compute invariants of old locations
			HashSet<org.muml.udbm.ClockConstraint> invariants = new HashSet<org.muml.udbm.ClockConstraint>();
			for (RealtimeStatechartInstance rtscInstance : ((ZoneGraphState) state).getLocations()) {
				for (ClockConstraint cCon : ((State) rtscInstance.getActiveVertex()).getInvariants()) {
					UDBMClock clockForCC = clockMapping.get(cCon.getClock());

					Object value;
					try {
						value = alInterpreter.evaluateExpression(rtscInstance.getAllAvailableVariableBindings(),
								cCon.getBound().getValue());
						int intValue = (Integer) alInterpreter.castTo(intType, value);

						if (clockForCC != null) {
							SimpleClockConstraint constraint = new SimpleClockConstraint(clockForCC,
									getRelationalOperatorForComparingOperator(cCon.getOperator()), intValue);
							invariants.add(constraint);
						}
					} catch (UnsupportedModellingElementException e) {
						e.printStackTrace();
					} catch (VariableNotInitializedException e) {
						e.printStackTrace();
					} catch (IncompatibleTypeException e) {
						e.printStackTrace();
					}

				}

			}
			if (((ZoneGraphState) state).getFederation() != null) {
				// apply invariants of old locations
				ZoneGraphState delayState = (ZoneGraphState) delay(state, invariants, urgentFound, urgentFederations);

				// only add delay transition if state wasn't reached by delay
				if (delayState != null) {
					if (!delayState.getFederation().equals(((ZoneGraphState) state).getFederation())) {
						DelayTransition delayTransition = rtscFactory.createDelayTransition();
						delayTransition.setSource(state);
						delayTransition.setTarget(delayState);
						followingZones.add(delayState);
					}
				}
			}
		}

		return followingZones;
	}

	private void addTransitionSet(ZoneGraphState sourceState, Transition transition, Transition secondTransition,
			RealtimeStatechartInstance firstLocation, RealtimeStatechartInstance secondLocation) {

		DataType intType = TypesFactory.eINSTANCE.createPrimitiveDataType();
		((PrimitiveDataType) intType).setPrimitiveType(PrimitiveTypes.INT32);

		// create new set of the two transitions that may sync
		EList<Transition> transitionSet = new BasicEList<Transition>();
		transitionSet.add(transition);
		if (secondTransition != null) {
			transitionSet.add(secondTransition);
		}

		if (((ZoneGraphState) sourceState).getFederation() != null) {
			Federation triggerFed = (Federation) ((ZoneGraphState) sourceState).getFederation().clone();
			// Federation checkFed = (Federation) ((ZoneGraphState) sourceState)
			// .getFederation().clone();
			// if(reachabilityGraph.getStartState() == sourceState)
			// triggerFed.up();
			// apply all time guards
			for (ClockConstraint clockConstraint : transition.getClockConstraints()) {

				// if there is a clock constraint like c < 0 we do not
				// add a transition set for the corresponding transition because
				// the constraint can never be true

				Object value;
				try {
					value = alInterpreter.evaluateExpression(firstLocation.getAllAvailableVariableBindings(),
							clockConstraint.getBound().getValue());
					int intValue = (Integer) alInterpreter.castTo(intType, value);
					if (intValue == 0 && clockConstraint.getOperator().equals(ComparingOperator.LESS))
						return;
				} catch (UnsupportedModellingElementException e) {
					e.printStackTrace();
				} catch (VariableNotInitializedException e) {
					e.printStackTrace();
				} catch (IncompatibleTypeException e) {
					e.printStackTrace();
				}

				applyClockConstraint(sourceState, clockConstraint, triggerFed);
			}
			if (secondTransition != null)
				for (ClockConstraint clockConstraint : secondTransition.getClockConstraints()) {

					// if there is a clock constraint like c < 0 we do not
					// add a transition set for the corresponding transition
					// because
					// the constraint can never be true
					Object value;
					try {
						value = alInterpreter.evaluateExpression(secondLocation.getAllAvailableVariableBindings(),
								clockConstraint.getBound().getValue());
						int intValue = (Integer) alInterpreter.castTo(intType, value);
						if (intValue == 0 && clockConstraint.getOperator().equals(ComparingOperator.LESS))
							return;
					} catch (UnsupportedModellingElementException e) {
						e.printStackTrace();
					} catch (VariableNotInitializedException e) {
						e.printStackTrace();
					} catch (IncompatibleTypeException e) {
						e.printStackTrace();
					}

					applyClockConstraint(sourceState, clockConstraint, triggerFed);
				}

			// checkFed.and(triggerFed);
			if (!triggerFed.isEmpty()) {
				// add to sets
				transitionSets.add(transitionSet);
				allTriggerFeds.put(transitionSet, triggerFed);
			}
			// else time guards prohibit firing one of the transitions

		}
		// rtscs have no clocks respectively no time guards
		else {
			transitionSets.add(transitionSet);
			allTriggerFeds.put(transitionSet, null);
		}
	}

	@Override
	protected ReachabilityGraphState createInitialState() {
		// add all starting locations of the RTSCs considered in reachability
		// analysis
		HashSet<org.muml.verification.core.runtime.RealtimeStatechartInstance> startLocations = new HashSet<org.muml.verification.core.runtime.RealtimeStatechartInstance>();
		ZoneGraphState newZone = rtscFactory.createZoneGraphState();
		HashSet<State> initialStates = new HashSet<State>();

		// collect start locations of rtscs
		for (State state : rootRtsc.getStates()) {
			if (state.isInitial()) {
				initialStates.add(state);
				// create RealtimeStatechartInstance and set references
				RealtimeStatechartInstance rootInstance = runtimeFactory.createRealtimeStatechartInstance();
				rootInstance.setInstanceOf(rootRtsc);
				rootInstance.setActiveVertex((State) state);

				startLocations.add(rootInstance);

				// create RealtimeStatechartInstances for embedded rtscs
				if (!((State) state).getEmbeddedRegions().isEmpty()) {
					startLocations.addAll(createLocationsForEmbeddedRtscs(null, state, rootInstance));
				}

			}
		}

		// add Variable Bindings
		initializeVariables(startLocations);

		HashSet<UDBMClock> fedClocks = new HashSet<UDBMClock>();
		fedClocks.addAll(clockMapping.values());

		if (!clockMapping.values().isEmpty()) {
			Federation zeroFed = fedFactory.createZeroFederation(fedClocks);
			newZone.setFederation(zeroFed);
		}

		newZone.getLocations().addAll(startLocations);

		// set subRealtimeStatechart reference of locations
		adjustRealtimeStatechartReferences(newZone);

		// evaluate entry actions of initial states
		for (RealtimeStatechartInstance curRtscInstance : startLocations) {
			if (((State) curRtscInstance.getActiveVertex()).getEntryEvent() != null
					&& ((State) curRtscInstance.getActiveVertex()).getEntryEvent().getAction() != null)
				for (Expression curExp : ((State) curRtscInstance.getActiveVertex()).getEntryEvent().getAction()
						.getExpressions()) {
					// the expression that is not instance of textual expression
					// should be implementation in action language
					if (!(curExp instanceof TextualExpression)) {
						try {
							alInterpreter.evaluateExpression(curRtscInstance.getVariableBindings(), curExp);
						} catch (UnsupportedModellingElementException e) {

							e.printStackTrace();
						} catch (VariableNotInitializedException e) {

							e.printStackTrace();
						} catch (IncompatibleTypeException e) {

							e.printStackTrace();
						}
						break;
					}

				}

		}

		return newZone;
	}

	/**
	 * Sets the subRealtimeStatechart and the parentRealtimeStatechart reference
	 * of all locations of state
	 * 
	 * @param state
	 */
	protected void adjustRealtimeStatechartReferences(ZoneGraphState state) {
		for (RealtimeStatechartInstance curRtscInstance : state.getLocations()) {
			curRtscInstance.getSubRealtimeStatechartInstances().clear();
		}
		for (RealtimeStatechartInstance curRtscInstance : state.getLocations()) {
			if (curRtscInstance.getInstanceOf().isEmbedded()) {
				RealtimeStatechart parentRtsc = parentRtscMapping.get(curRtscInstance.getInstanceOf());
				for (RealtimeStatechartInstance rtscInstance2 : state.getLocations())
					if (rtscInstance2.getInstanceOf().equals(parentRtsc)) {
						rtscInstance2.getSubRealtimeStatechartInstances().add(curRtscInstance);
						curRtscInstance.setParentRealtimeStatechartInstance(rtscInstance2);
					}
			}
		}

	}

	/**
	 * Creates {@link RealtimeStatechartInstance}s for all
	 * {@link RealtimeStatechart}s that are embedded in state (not only
	 * directly)
	 * 
	 * @param locations
	 *            {@link HashSet} used for recursion (call with null)
	 * @param state
	 *            the {@link State} to compute the locations for
	 * @return
	 */
	protected HashSet<RealtimeStatechartInstance> createLocationsForEmbeddedRtscs(
			HashSet<RealtimeStatechartInstance> locations, State state, RealtimeStatechartInstance parentRtscInstance) {
		if (locations == null)
			locations = new HashSet<RealtimeStatechartInstance>();

		// create location
		for (Region curRegion : state.getEmbeddedRegions()) {
			if (curRegion.getParentState().getParentStatechart() != null) {
				RealtimeStatechartInstance location = runtimeFactory.createRealtimeStatechartInstance();
				location.setInstanceOf(curRegion.getEmbeddedStatechart());
				location.setParentRealtimeStatechartInstance(parentRtscInstance);
				locations.add(location);
				for (State initial : curRegion.getEmbeddedStatechart().getStates())
					if (initial.isInitial()) {
						location.setActiveVertex(initial);
						locations = createLocationsForEmbeddedRtscs(locations, initial, location);
						break;
					}

			}
		}
		return locations;
	}

	/**
	 * Computes parents of all embedded {@link RealtimeStatechart}s
	 * 
	 * @param parentMapping
	 *            {@link HashMap} used for recursion (call with null)
	 * @param parent
	 *            the current parent (call with root Statechart)
	 * @return {@link HashMap} mapping {@link RealtimeStatechart}s to its parent
	 *         {@link RealtimeStatechart}s
	 */
	protected HashMap<RealtimeStatechart, RealtimeStatechart> collectParentRtscs(
			HashMap<RealtimeStatechart, RealtimeStatechart> parentMapping, RealtimeStatechart parent) {
		if (parentMapping == null)
			parentMapping = new HashMap<RealtimeStatechart, RealtimeStatechart>();

		if (parent.equals(rootRtsc))
			parentMapping.put(parent, null);

		for (State curState : parent.getStates()) {
			if (curState.getEmbeddedRegions() != null && !curState.getEmbeddedRegions().isEmpty())
				for (Region curRegion : curState.getEmbeddedRegions())
					if (curRegion.getEmbeddedStatechart() != null) {
						parentMapping.put(curRegion.getEmbeddedStatechart(), parent);
						parentMapping = collectParentRtscs(parentMapping, curRegion.getEmbeddedStatechart());
					}
		}
		return parentMapping;
	}

	/**
	 * Collects clocks of curRtscs and in curRtscs embedded rtscs
	 * 
	 * @param collectedClocks
	 *            set of collected clocks for recursion (call with null)
	 * @param rtscs
	 *            {@link HashSet} containing the root RealtimeStatecharts to
	 *            start the search for clocks from.
	 * @return
	 */
	protected HashSet<Clock> collectClocksFromStatecharts(HashSet<Clock> collectedClocks,
			HashSet<RealtimeStatechart> curRtscs) {
		if (collectedClocks == null)
			collectedClocks = new HashSet<Clock>();

		HashSet<RealtimeStatechart> embeddedStatecharts = new HashSet<RealtimeStatechart>();

		for (RealtimeStatechart rtsc : curRtscs) {
			// collect clocks of rtsc
			if (rtsc.getClocks() != null) {
				if (!rtsc.getClocks().isEmpty())
					collectedClocks.addAll(rtsc.getClocks());
			}
			for (State state : rtsc.getStates()) {
				if (state.getEmbeddedRegions() != null && !state.getEmbeddedRegions().isEmpty())
					for (Region region : state.getEmbeddedRegions()) {
						if (region.getEmbeddedStatechart() != null)
							embeddedStatecharts.add(region.getEmbeddedStatechart());
					}
			}

		}
		if (!embeddedStatecharts.isEmpty())
			collectedClocks = collectClocksFromStatecharts(collectedClocks, embeddedStatecharts);

		return collectedClocks;
	}

	/**
	 * Creates an udbm clock for each clock of rtscs and each clock of
	 * RealtimeStatecharts that are embedded in one of the RealtimeStatecharts
	 * rtscs.
	 * 
	 * @param rtscs
	 *            {@link HashSet} containing the root RealtimeStatecharts
	 * @return {@link HashMap} mapping {@link Clock} to corresponding
	 *         {@link UDBMClock}
	 */
	protected HashMap<Clock, UDBMClock> translateClocksToUDBMClocks(RealtimeStatechart rtsc) {

		HashMap<Clock, UDBMClock> clocksMapping = new HashMap<Clock, UDBMClock>();
		HashSet<RealtimeStatechart> root = new HashSet<RealtimeStatechart>();
		root.add(rtsc);
		// create unique id for udbm clocks
		int clockcounter = 0;
		for (Clock clock : collectClocksFromStatecharts(null, root)) {
			UDBMClock fedClock = new UDBMClock(clock.getName() + "id" + clockcounter, clock.getName());
			clockcounter++;
			clocksMapping.put(clock, fedClock);

		}
		return clocksMapping;
	}

	/**
	 * Collects the maximum of bounds a clock is compared with and transforms
	 * the clock to UDBMClock (infinity bounds are neglected because
	 * corresponding clock constraints are either always true or always false)
	 * 
	 * @param constantVariableBindings
	 *            VariableBindings in terms of constant variables
	 * @return A map from UDBMClock to the maximum value
	 */
	protected HashMap<UDBMClock, Integer> collectClockMaxValues(EList<VariableBinding> constantVariableBindings) {

		DataType intType = TypesFactory.eINSTANCE.createPrimitiveDataType();
		((PrimitiveDataType) intType).setPrimitiveType(PrimitiveTypes.INT32);

		HashMap<UDBMClock, Integer> clockMaxValues = new HashMap<UDBMClock, Integer>();

		// init
		for (UDBMClock curUDBMClock : clockMapping.values()) {
			clockMaxValues.put(curUDBMClock, 0);
		}

		// TODO look for constants
		for (RealtimeStatechart curRtsc : parentRtscMapping.keySet()) {

			// ClockConstraints and AbsoluteDeadlines
			for (Transition curTransition : curRtsc.getTransitions()) {

				// ClockConstraints
				for (ClockConstraint curCConstraint : curTransition.getClockConstraints()) {
					// translate clock
					UDBMClock curUDBMClock = clockMapping.get(curCConstraint.getClock());

					Object expValue = null;
					try {
						expValue = alInterpreter.evaluateExpression(constantVariableBindings,
								curCConstraint.getBound().getValue());
					} catch (UnsupportedModellingElementException e) {
						e.printStackTrace();
					} catch (VariableNotInitializedException e) {
						// Expression contains non-constant variables
						clockMaxValues.put(curUDBMClock, clockMaxValue);
						continue;
					} catch (IncompatibleTypeException e) {
						e.printStackTrace();
					}

					int expValueAsInt = -1;
					if (expValue != null) {
						try {
							expValueAsInt = (Integer) alInterpreter.castTo(intType, expValue);
						} catch (IncompatibleTypeException e) {
							// should not happen since clocks can only be
							// compared with integers
							e.printStackTrace();
						} catch (UnsupportedModellingElementException e) {
							e.printStackTrace();
						}
					}
					if (expValueAsInt != -1 && clockMaxValues.get(curUDBMClock) < expValueAsInt)

						clockMaxValues.put(curUDBMClock, expValueAsInt);

				}

				// Deadlines
				for (AbsoluteDeadline curDeadline : curTransition.getAbsoluteDeadlines()) {
					// translate clock
					UDBMClock curUDBMClock = clockMapping.get(curDeadline.getClock());

					Object expValue = null;
					try {
						expValue = alInterpreter.evaluateExpression(constantVariableBindings,
								curDeadline.getUpperBound().getValue());
					} catch (UnsupportedModellingElementException e) {
						e.printStackTrace();
					} catch (VariableNotInitializedException e) {
						// Expression contains non-constant variables
						clockMaxValues.put(curUDBMClock, clockMaxValue);
						continue;
					} catch (IncompatibleTypeException e) {
						e.printStackTrace();
					}
					int expValueAsInt = -1;
					if (expValue != null) {
						try {
							expValueAsInt = (Integer) alInterpreter.castTo(intType, expValue);
						} catch (IncompatibleTypeException e) {
							// should not happen since clocks can only be
							// compared with integers
							e.printStackTrace();
						} catch (UnsupportedModellingElementException e) {
							e.printStackTrace();
						}
					}
					if (expValueAsInt != -1 && clockMaxValues.get(curUDBMClock) < expValueAsInt)

						clockMaxValues.put(curUDBMClock, expValueAsInt);

				}
			}

			// invariants
			for (State curState : curRtsc.getStates()) {
				for (ClockConstraint curCConstraint : curState.getInvariants()) {
					// translate clock
					UDBMClock curUDBMClock = clockMapping.get(curCConstraint.getClock());

					Object expValue = null;
					try {
						expValue = alInterpreter.evaluateExpression(constantVariableBindings,
								curCConstraint.getBound().getValue());
					} catch (UnsupportedModellingElementException e) {
						e.printStackTrace();
					} catch (VariableNotInitializedException e) {
						// Expression contains non-constant variables
						clockMaxValues.put(curUDBMClock, clockMaxValue);
						continue;
					} catch (IncompatibleTypeException e) {
						e.printStackTrace();
					}

					int expValueAsInt = -1;
					if (expValue != null) {
						try {
							expValueAsInt = (Integer) alInterpreter.castTo(intType, expValue);
						} catch (IncompatibleTypeException e) {
							// should not happen since clocks can only be
							// compared with integers
							e.printStackTrace();
						} catch (UnsupportedModellingElementException e) {
							e.printStackTrace();
						}
					}
					if (expValueAsInt != -1 && clockMaxValues.get(curUDBMClock) < expValueAsInt)
						clockMaxValues.put(curUDBMClock, expValueAsInt);
				}

			}
		}

		return clockMaxValues;
	}

	protected EList<VariableBinding> createVariableBindingsForConstants() {
		BasicEList<VariableBinding> varBindings = new BasicEList<VariableBinding>();

		for (RealtimeStatechart curRtsc : parentRtscMapping.keySet()) {
			for (Variable curVariable : curRtsc.getVariables()) {
				if (curVariable.isConstant()) {
					Object initValue = null;

					try {
						initValue = alInterpreter.evaluateExpression(null, curVariable.getInitializeExpression());
					} catch (Exception e) {
						// init expression could not be evaluated => continue
						continue;
					}

					if (initValue != null) {
						try {
							initValue = alInterpreter.castTo(curVariable.getDataType(), initValue);
						} catch (IncompatibleTypeException e) {
							// wrong data type of init value
							e.printStackTrace();
							continue;
						} catch (UnsupportedModellingElementException e) {
							// cast is not supported yet
							e.printStackTrace();
							continue;
						}
					}

					VariableBinding varBinding = runtimeFactory.createVariableBinding();
					varBinding.setVariable(curVariable);
					varBinding.setValue(initValue);

					varBindings.add(varBinding);
				}
			}
		}
		return varBindings;
	}

	@Override
	protected void computeHashValue(ReachabilityGraphState state) {
		long hash = 23;
		long attributeHash = 7;

		PriorityQueue<Long> stateHashQueue = new PriorityQueue<Long>();
		PriorityQueue<Long> attributeHashQueue = new PriorityQueue<Long>();

		for (RealtimeStatechartInstance rtscInst : ((ZoneGraphState) state).getLocations()) {
			long rtscHash = (long) rtscInst.getInstanceOf().hashCode();

			for (VariableBinding varBinding : rtscInst.getVariableBindings()) {
				if (varBinding.getValue() != null)
					attributeHashQueue.add((long) varBinding.getValue().hashCode());

				attributeHashQueue.add((long) varBinding.getVariable().hashCode());

			}

			// compute attribute hash
			while (!attributeHashQueue.isEmpty()) {
				attributeHash = attributeHash * 11 + attributeHashQueue.poll();
			}

			rtscHash = rtscHash * 31 + attributeHash;

			rtscHash = rtscHash * 31 + (long) rtscInst.getActiveVertex().hashCode();

			stateHashQueue.add(rtscHash);
		}

		// compute hash value for state

		while (!stateHashQueue.isEmpty()) {
			hash = hash * 53 + stateHashQueue.poll();
		}

		if (((ZoneGraphState) state).getFederation() != null)
			hash = hash * 53 + ((ZoneGraphState) state).getFederation().getFullHash();
		state.setHash(hash);

	}

	/**
	 * creates variable bindings and initializes values with respect to
	 * initialize expression
	 * 
	 */
	protected void initializeVariables(HashSet<RealtimeStatechartInstance> rtscInstances) {
		for (RealtimeStatechartInstance curRtscInstance : rtscInstances) {
			BasicEList<VariableBinding> variableBindings = new BasicEList<VariableBinding>();
			for (Variable curVariable : curRtscInstance.getInstanceOf().getVariables()) {
				VariableBinding varBinding = runtimeFactory.createVariableBinding();
				varBinding.setVariable(curVariable);
				variableBindings.add(varBinding);

				if (curVariable.getInitializeExpression() != null) {
					Object value = null;

					try {
						// evaluate initializeExpression
						// if initializeExpression is e.g. an Assignment this
						// sets the value of varBinding and returns null
						value = alInterpreter.evaluateExpression(variableBindings,
								curVariable.getInitializeExpression());
					} catch (Exception e) {
						e.printStackTrace();
					}

					// in case of expressions with return values
					if (value != null)
						varBinding.setValue(value);

				} else
					varBinding.setValue(null);

			}
			curRtscInstance.getVariableBindings().addAll(variableBindings);
		}

	}

	@Override
	public ReachabilityGraphState copyState(ReachabilityGraphState state, ReachabilityGraphTransition trans) {

		ZoneGraphState newZone = (ZoneGraphState) EcoreUtil.copy(state);

		if (((ZoneGraphState) state).getFederation() != null) {
			Federation newFederation = (Federation) ((ZoneGraphState) state).getFederation().clone();
			newZone.setFederation(newFederation);
		}
		// add copies of locations
		newZone.getLocations().clear();
		for (RealtimeStatechartInstance curLocation : ((ZoneGraphState) state).getLocations()) {
			// copy location
			RealtimeStatechartInstance copyOfLocation = EcoreUtil.copy(curLocation);
			// copy variable bindings
			EList<VariableBinding> copyOfVarBindings = new BasicEList<VariableBinding>();

			for (VariableBinding curVarBinding : curLocation.getVariableBindings())
				copyOfVarBindings.add(EcoreUtil.copy(curVarBinding));

			copyOfLocation.getVariableBindings().clear();
			copyOfLocation.getVariableBindings().addAll(copyOfVarBindings);
			newZone.getLocations().add(copyOfLocation);
		}

		if (trans != null)
			trans.setTarget(newZone);

		adjustRealtimeStatechartReferences(newZone);
		return newZone;
	}

	@Override
	protected boolean isIsomorphic(ReachabilityGraphState state1, ReachabilityGraphState state2) {
		boolean locationInBoth;

		// if # of locations are unequal, states cannot be isomorphic
		if (((ZoneGraphState) state1).getLocations().size() != ((ZoneGraphState) state2).getLocations().size())
			return false;

		// check equality of locations
		for (RealtimeStatechartInstance location1 : ((ZoneGraphState) state1).getLocations()) {
			locationInBoth = false;
			for (RealtimeStatechartInstance location2 : ((ZoneGraphState) state2).getLocations()) {
				if (location1.getInstanceOf().equals(location2.getInstanceOf())
						&& location1.getActiveVertex().equals(location2.getActiveVertex())) {
					locationInBoth = true;
					break;
				}
			}
			if (!locationInBoth) {
				return false;
			}
		}

		// check if federations are isomorphic
		if (((ZoneGraphState) state1).getFederation() == null && ((ZoneGraphState) state2).getFederation() == null)

			return true;
		else {
			boolean iso = ((ZoneGraphState) state1).getFederation().equals(((ZoneGraphState) state2).getFederation());

			return iso;
		}
	}

	protected void applyClockConstraint(ReachabilityGraphState state, ClockConstraint cc, Federation fed) {
		UDBMClock clockForCC = clockMapping.get(cc.getClock());
		DataType intType = TypesFactory.eINSTANCE.createPrimitiveDataType();
		((PrimitiveDataType) intType).setPrimitiveType(PrimitiveTypes.INT32);

		((ZoneGraphState) state).getLocations().get(0).getAllAvailableVariableBindings();

		BasicEList<VariableBinding> allVariableBindingsOfState = new BasicEList<VariableBinding>();

		for (RealtimeStatechartInstance curLocation : ((ZoneGraphState) state).getLocations())
			allVariableBindingsOfState.addAll(curLocation.getAllAvailableVariableBindings());

		if (clockForCC != null) {

			try {
				Object boundValue = alInterpreter.evaluateExpression(allVariableBindingsOfState,
						cc.getBound().getValue());
				int boundValueAsInt = (Integer) alInterpreter.castTo(intType, boundValue);

				SimpleClockConstraint constraint = new SimpleClockConstraint(clockForCC,
						getRelationalOperatorForComparingOperator(cc.getOperator()), boundValueAsInt);
				fed.and(constraint);
			} catch (UnsupportedModellingElementException e) {
				e.printStackTrace();
			} catch (VariableNotInitializedException e) {
				e.printStackTrace();
			} catch (IncompatibleTypeException e) {
				e.printStackTrace();
			}

		}

	}


	private RelationalOperator getRelationalOperatorForComparingOperator(ComparingOperator operator) {
		switch (operator) {
		case LESS:
			return RelationalOperator.LessOperator;
		case LESS_OR_EQUAL:
			return RelationalOperator.LessOrEqualOperator;
		case GREATER:
			return RelationalOperator.GreaterOperator;
		case GREATER_OR_EQUAL:
			return RelationalOperator.GreaterOrEqualOperator;
		case EQUAL:
			return RelationalOperator.EqualOperator;
		default:
			// will never happen
			return null;
		}
	}

	// creates the set of all (statically) outgoing transitions of the current
	// locations
	private HashSet<Transition> createTransitionSet(ZoneGraphState state) {
		HashSet<Transition> staticTransitions = new HashSet<Transition>();
		for (RealtimeStatechartInstance location : state.getLocations()) {
			for (Transition transition : location.getActiveVertex().getOutgoingTransitions()) {
				if (staticTransitions.contains(transition))
					System.out.println("Hash Collision?");
				staticTransitions.add(transition);
			}
		}
		return staticTransitions;
	}

	private void normalizeZone(ZoneGraphState zone) {
		if (zone.getFederation() != null) {
			if (diffClockConstraints.isEmpty())
				zone.getFederation().normalize(clockMaxValues);
			else
				zone.getFederation().diagonalNormalize(clockMaxValues, diffClockConstraints);
		}
	}

	/**
	 * Computes clock constraints witch negated comparing operator
	 * 
	 * @param original
	 *            the input clock constraint
	 * @return new clock constraint with negated comparing operator
	 */
	protected EList<ClockConstraint> negate(ClockConstraint original) {
		BasicEList<ClockConstraint> negatedClockConstraints = new BasicEList<ClockConstraint>();
		TimeValue nNbr;
		RealtimestatechartFactory rtscFactory = RealtimestatechartFactory.eINSTANCE;

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

	protected EList<ClockConstraint> highClockConstraints(EList<ClockConstraint> original) {
		RealtimestatechartFactory rtscFactory = RealtimestatechartFactory.eINSTANCE;
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
				ClockConstraint newCConstraint = rtscFactory.createClockConstraint();
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

	/**
	 * Searches the smallest time unit of a value a clock is compared with
	 * 
	 * @return the smallest time unit
	 */
	protected TimeUnit findSmallestTimeUnit() {
		TimeUnit smallestTimeUnit = TimeUnit.DAYS;
		for (RealtimeStatechart curRtsc : parentRtscMapping.keySet()) {
			for (Transition curTransition : curRtsc.getTransitions()) {
				for (AbsoluteDeadline curDeadline : curTransition.getAbsoluteDeadlines()) {

					if (curDeadline.getLowerBound().getUnit() != null
							&& curDeadline.getLowerBound().getUnit().compareTo(smallestTimeUnit) < 0)
						smallestTimeUnit = curDeadline.getLowerBound().getUnit();
					if (curDeadline.getUpperBound().getUnit() != null
							&& curDeadline.getUpperBound().getUnit().compareTo(smallestTimeUnit) < 0)
						smallestTimeUnit = curDeadline.getUpperBound().getUnit();

				}
				for (ClockConstraint curCConstraint : curTransition.getClockConstraints()) {
					if (curCConstraint.getBound().getUnit() != null
							&& curCConstraint.getBound().getUnit().compareTo(smallestTimeUnit) < 0) {
						smallestTimeUnit = curCConstraint.getBound().getUnit();
					}
				}
			}
			for (State curState : curRtsc.getStates()) {
				for (ClockConstraint curInvariant : curState.getInvariants()) {
					if (curInvariant.getBound().getUnit() != null
							&& curInvariant.getBound().getUnit().compareTo(smallestTimeUnit) < 0)
						smallestTimeUnit = curInvariant.getBound().getUnit();
				}
			}
		}
		return smallestTimeUnit;
	}

	/**
	 * Adds arithmetic expression to all bounds' values corresponding the
	 * smallest time unit and the time unit of the bound
	 * 
	 * @param smallestTimeUnit
	 */
	protected void convertBoundsToSmallestTimeUnit(TimeUnit smallestTimeUnit) {
		// convert bounds

		// TODO add multiply expressions
		for (RealtimeStatechart curRtsc : parentRtscMapping.keySet()) {
			for (Transition curTransition : curRtsc.getTransitions()) {
				for (AbsoluteDeadline curDeadline : curTransition.getAbsoluteDeadlines()) {

					if (curDeadline.getLowerBound().getUnit() != null
							&& curDeadline.getLowerBound().getUnit().compareTo(smallestTimeUnit) != 0) {
						TimeUnit oldTimeUnit = curDeadline.getLowerBound().getUnit();
						Expression oldExpression = curDeadline.getLowerBound().getValue();

						Expression convertedExpression = getBoundTransformArithmeticExpression(oldExpression,
								oldTimeUnit, smallestTimeUnit);
						// smallestTimeUnit.convert(oldValue, oldTimeUnit);

						curDeadline.getLowerBound().setValue(convertedExpression);
						curDeadline.getLowerBound().setUnit(smallestTimeUnit);
					}

					if (curDeadline.getUpperBound().getUnit() != null
							&& curDeadline.getUpperBound().getUnit().compareTo(smallestTimeUnit) != 0) {
						TimeUnit oldTimeUnit = curDeadline.getUpperBound().getUnit();
						Expression oldExpression = curDeadline.getUpperBound().getValue();
						Expression convertedExpression = getBoundTransformArithmeticExpression(oldExpression,
								oldTimeUnit, smallestTimeUnit);

						curDeadline.getUpperBound().setValue(convertedExpression);
						curDeadline.getUpperBound().setUnit(smallestTimeUnit);
					}

				}
				for (ClockConstraint curCConstraint : curTransition.getClockConstraints()) {
					if (curCConstraint.getBound().getUnit() != null
							&& curCConstraint.getBound().getUnit().compareTo(smallestTimeUnit) != 0) {
						TimeUnit oldTimeUnit = curCConstraint.getBound().getUnit();
						Expression oldExpression = curCConstraint.getBound().getValue();
						Expression convertedExpression = getBoundTransformArithmeticExpression(oldExpression,
								oldTimeUnit, smallestTimeUnit);

						curCConstraint.getBound().setValue(convertedExpression);
						curCConstraint.getBound().setUnit(smallestTimeUnit);
					}
				}
			}
			for (State curState : curRtsc.getStates()) {
				for (ClockConstraint curInvariant : curState.getInvariants()) {

					if (curInvariant.getBound().getUnit() != null
							&& curInvariant.getBound().getUnit().compareTo(smallestTimeUnit) != 0) {
						TimeUnit oldTimeUnit = curInvariant.getBound().getUnit();
						Expression oldExpression = curInvariant.getBound().getValue();
						Expression convertedExpression = getBoundTransformArithmeticExpression(oldExpression,
								oldTimeUnit, smallestTimeUnit);

						curInvariant.getBound().setValue(convertedExpression);
						curInvariant.getBound().setUnit(smallestTimeUnit);
					}
				}
			}
		}
	}

	protected Expression getBoundTransformArithmeticExpression(Expression boundValueExpression, TimeUnit boundTimeUnit,
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
			LiteralExpression factor = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
			factor.setValue("24");

			ArithmeticExpression toHours = CommonExpressionsFactory.eINSTANCE.createArithmeticExpression();
			toHours.setLeftExpression(boundValueExpression);
			toHours.setRightExpression(factor);
			toHours.setOperator(ArithmeticOperator.TIMES);
			return getBoundTransformArithmeticExpression(factor, TimeUnit.HOURS, smallestTimeUnit);
		}

		if (boundTimeUnit == TimeUnit.HOURS) {
			LiteralExpression factor = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
			factor.setValue("60");

			ArithmeticExpression toMinutes = CommonExpressionsFactory.eINSTANCE.createArithmeticExpression();
			toMinutes.setLeftExpression(boundValueExpression);
			toMinutes.setRightExpression(factor);
			toMinutes.setOperator(ArithmeticOperator.TIMES);
			return getBoundTransformArithmeticExpression(factor, TimeUnit.MINUTES, smallestTimeUnit);
		}

		if (boundTimeUnit == TimeUnit.MINUTES) {
			LiteralExpression factor = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
			factor.setValue("60");

			ArithmeticExpression toSeconds = CommonExpressionsFactory.eINSTANCE.createArithmeticExpression();
			toSeconds.setLeftExpression(boundValueExpression);
			toSeconds.setRightExpression(factor);
			toSeconds.setOperator(ArithmeticOperator.TIMES);
			return getBoundTransformArithmeticExpression(factor, TimeUnit.SECONDS, smallestTimeUnit);
		}

		if (boundTimeUnit == TimeUnit.SECONDS) {
			LiteralExpression factor = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
			factor.setValue("1000");

			ArithmeticExpression toMilliseconds = CommonExpressionsFactory.eINSTANCE.createArithmeticExpression();
			toMilliseconds.setLeftExpression(boundValueExpression);
			toMilliseconds.setRightExpression(factor);
			toMilliseconds.setOperator(ArithmeticOperator.TIMES);
			return getBoundTransformArithmeticExpression(factor, TimeUnit.MILLISECONDS, smallestTimeUnit);
		}

		if (boundTimeUnit == TimeUnit.MILLISECONDS) {
			LiteralExpression factor = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
			factor.setValue("1000");

			ArithmeticExpression toMicroseconds = CommonExpressionsFactory.eINSTANCE.createArithmeticExpression();
			toMicroseconds.setLeftExpression(boundValueExpression);
			toMicroseconds.setRightExpression(factor);
			toMicroseconds.setOperator(ArithmeticOperator.TIMES);
			return getBoundTransformArithmeticExpression(factor, TimeUnit.MICROSECONDS, smallestTimeUnit);
		}

		if (boundTimeUnit == TimeUnit.MICROSECONDS) {
			LiteralExpression factor = CommonExpressionsFactory.eINSTANCE.createLiteralExpression();
			factor.setValue("1000");

			ArithmeticExpression toNanoseconds = CommonExpressionsFactory.eINSTANCE.createArithmeticExpression();
			toNanoseconds.setLeftExpression(boundValueExpression);
			toNanoseconds.setRightExpression(factor);
			toNanoseconds.setOperator(ArithmeticOperator.TIMES);
			return getBoundTransformArithmeticExpression(factor, TimeUnit.MICROSECONDS, smallestTimeUnit);
		}

		return null;
	}

	@Override
	protected void initialize() {

		TimeUnit smallestTimeUnit = findSmallestTimeUnit();
		convertBoundsToSmallestTimeUnit(smallestTimeUnit);

	}

}
