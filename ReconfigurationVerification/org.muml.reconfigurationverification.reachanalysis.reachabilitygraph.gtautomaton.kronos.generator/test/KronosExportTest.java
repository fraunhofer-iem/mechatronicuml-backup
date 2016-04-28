import org.junit.Before;
import org.junit.Test;
import org.muml.mumlcore.expressions.common.ComparingOperator;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonTransition;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonFactory;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.kronos.generator.KronosAutomatonWriter;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.AtomicPropositionMapping;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.labeling.LabelingFactory;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstance;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramFactory;


public class KronosExportTest {
	
	private GtAutomaton automaton;
	private KronosAutomatonWriter automatonWriter;

	@Before
	public void setUp() throws Exception {
		
		automaton = GtautomatonFactory.eINSTANCE.createGtAutomaton();
		
		// states
		GtStepGraph state1 = GtautomatonFactory.eINSTANCE.createGtStepGraph();
		GtStepGraph state2 = GtautomatonFactory.eINSTANCE.createGtStepGraph();
		GtStepGraph state3 = GtautomatonFactory.eINSTANCE.createGtStepGraph();
		state1.setReachabilityGraph(automaton);
		state2.setReachabilityGraph(automaton);
		state3.setReachabilityGraph(automaton);
		automaton.setStartState(state1);
		
		// transition 1-->2
		GtAutomatonTransition transition = GtautomatonFactory.eINSTANCE.createGtAutomatonTransition();
		transition.setSource(state1);
		transition.setTarget(state2);
		transition.setReachabilityGraph(automaton);
		
		// transition 1-->3
		GtAutomatonTransition transition2 = GtautomatonFactory.eINSTANCE.createGtAutomatonTransition();
		transition2.setSource(state1);
		transition2.setTarget(state3);
		transition2.setReachabilityGraph(automaton);

		// transition 2-->3
		GtAutomatonTransition transition3 = GtautomatonFactory.eINSTANCE.createGtAutomatonTransition();
		transition3.setSource(state2);
		transition3.setTarget(state3);
		transition3.setReachabilityGraph(automaton);

		
		// clock instances
		ClockInstance clockInst = TimedstorydiagramFactory.eINSTANCE.createClockInstance();
		clockInst.setId("c1Inst1");
		clockInst.setName("c1Inst1");
		state1.getClockInstances().add(clockInst);

		ClockInstance clockInst2 = TimedstorydiagramFactory.eINSTANCE.createClockInstance();
		clockInst2.setId("c1Inst2");
		clockInst2.setName("c1Inst2");
		state2.getClockInstances().add(clockInst2);
		
		automaton.getClockInstanceIdentifiers().add(clockInst.getId());
		automaton.getClockInstanceIdentifiers().add(clockInst2.getId());
		
		// invariant
		GtAutomatonClockConstraint invariant1 = GtautomatonFactory.eINSTANCE.createGtAutomatonClockConstraint();
		invariant1.setClockInstanceIdentifier(clockInst.getId());
		invariant1.setOperator(ComparingOperator.LESS);
		invariant1.setValue(5);
		state1.getInvariant().add(invariant1);
		
		// guard
		GtAutomatonClockConstraint guard = GtautomatonFactory.eINSTANCE.createGtAutomatonClockConstraint();
		guard.setClockInstanceIdentifier(clockInst.getId());
		guard.setOperator(ComparingOperator.GREATER_OR_EQUAL);
		guard.setValue(7);
		transition.getTimeGuards().add(guard);
		
		// atomic proposition
		AtomicPropositionMapping apm = LabelingFactory.eINSTANCE.createAtomicPropositionMapping();
		apm.getPropositions().add("test");
		apm.setStepGraph(state2);
		state2.getExtensions().add(apm);
		
		automatonWriter = new KronosAutomatonWriter();
	}

	@Test
	public void testWriteToFileString() {
		automatonWriter.setModel(automaton);
		automatonWriter.writeToFile("automaton1.tg");
		
	}

}
